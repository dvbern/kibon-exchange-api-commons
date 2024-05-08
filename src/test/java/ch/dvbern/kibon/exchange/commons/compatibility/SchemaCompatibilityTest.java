/*
 * Copyright (C) 2023 DV Bern AG, Switzerland
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package ch.dvbern.kibon.exchange.commons.compatibility;

import java.io.Closeable;
import java.io.IOException;
import java.net.SocketException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import javax.annotation.Nonnull;

import ch.dvbern.kibon.exchange.commons.compatibility.api.Compatibility;
import ch.dvbern.kibon.exchange.commons.compatibility.api.Compatible;
import ch.dvbern.kibon.exchange.commons.compatibility.api.Schema;
import ch.dvbern.kibon.exchange.commons.compatibility.api.SchemaId;
import ch.dvbern.kibon.exchange.commons.compatibility.api.SchemaRegistryService;
import ch.dvbern.kibon.exchange.commons.compatibility.api.SubjectSchema;
import ch.dvbern.kibon.exchange.commons.gemeinde.GemeindeEventDTO;
import ch.dvbern.kibon.exchange.commons.gemeindekennzahlen.GemeindeKennzahlenEventDTO;
import ch.dvbern.kibon.exchange.commons.institution.InstitutionEventDTO;
import ch.dvbern.kibon.exchange.commons.institutionclient.InstitutionClientEventDTO;
import ch.dvbern.kibon.exchange.commons.neskovanp.NeueVeranlagungEventDTO;
import ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungAnfrageEventDTO;
import ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO;
import ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungEventDTO;
import ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleBestaetigungEventDTO;
import ch.dvbern.kibon.exchange.commons.verfuegung.VerfuegungEventDTO;
import ch.dvbern.kibon.exchange.commons.verfuegungselbstbehaltgemeinde.GemeindeSelbstbehaltEventDTO;
import com.google.common.base.MoreObjects;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response.Status;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class SchemaCompatibilityTest {

	private static final URI BASE_URI_DEV = ConfigProvider.getConfig().getValue("base.uri.dev", URI.class);

	private final SchemaRegistryService service = createService(BASE_URI_DEV);

	@SuppressWarnings("TestMethodWithoutAssertion")
	@TestFactory
	Stream<DynamicContainer> testServers() {
		try (Stream<Server> onlineServers = SchemaCompatibilityTest.streamOnlineServers()) {
			return onlineServers.map(server -> dynamicContainer(server.toString(), Stream.of(
				dynamicContainer("subjects", server.service.getSubjects().stream()
					.map(subject -> dynamicContainer(subject, testSubject(server.service, subject)))
				)
			)));
		}
	}

	@Nonnull
	private static Stream<DynamicNode> testSubject(SchemaRegistryService srv, String subject) {
		DynamicTest compatibilityLevel = dynamicTest("compatibilityLevel", () -> {
			var level = srv.getCompatibilityLevel(subject, true);

			assertThat(level.compatibilityLevel(), is("FULL_TRANSITIVE"));
		});

		return Stream.concat(
			Stream.of(compatibilityLevel),
			testCompatibilityAgainstAllversion(srv, subject).stream()
		);
	}

	private static Optional<DynamicNode> testCompatibilityAgainstAllversion(
		SchemaRegistryService srv,
		String subject
	) {
		Stream<String> versions = srv.getVersions(subject).stream()
			.map(String::valueOf);

		return findSchema(subject)
			.map(value -> dynamicContainer("compatibility", versions
				.map(v -> dynamicTest("version " + v, compatibilityCheck(srv, subject, value, v)))
			));
	}

	private static Optional<DynamicNode> testCompatibilityAgainstLatest(SchemaRegistryService srv, String subject) {
		return findSchema(subject)
			.map(value -> dynamicTest("compatibility", compatibilityCheck(srv, subject, value, "latest")));
	}

	@Disabled("for manual testing. Already covered by #testServers")
	@Test
	void getSubjects() {
		var subjects = service.getSubjects();

		assertThat(subjects, is(not(empty())));
	}

	@Disabled("for debugging purposes")
	@ParameterizedTest
	@MethodSource("getOnlineServers")
	void downloadSchemas(Server server) {
		List<SubjectSchema> schemas = getAllSchemas(server.service);
		schemas.forEach(s -> SchemaCompatibilityTest.exportSchema(s, server.uri));

		assertThat(schemas, not(empty()));
	}

	@Disabled("for manual testing. Already covered by #testServers")
	@ParameterizedTest
	@MethodSource("getAvroSchemas")
	void testSchemaCompatibility(AvroSchema schema) {
		// check against all schemas instead of latest?
		// With FULL_TRANSITIVE compatibility, it shouldn't make a difference
		Compatible compatibility = service.compatibility(schema.subject(), "latest", schema.payload());

		assertThat(schema.subject() + " should be compatible", compatibility.is_compatible(), is(true));
	}

	@Disabled("dangerous! Run with care")
	@ParameterizedTest
	@MethodSource("getAvroSchemas")
	void replaceSchema(AvroSchema schema) {
		// delete all schemas for the following subjects and register the latest schema instead. Make sure you
		List<String> conflicting = List.of(
			"BetreuungAnfrageEvents-value",
			"GemeindeKennzahlenEvents-value",
			"InstitutionEvents-value",
			"VerfuegungEvents-value"
		);
		if (!conflicting.contains(schema.subject())) {
			return;
		}

		// here, we make sure to only call this against a local schema registry
		SchemaRegistryService srv = createService(ConfigProvider.getConfig().getValue("base.uri.one-off-fix", URI.class));

		try (var response = srv.deleteSchemas(schema.subject(), false)) {
			SchemaId schemaId = srv.registerSchema(schema.subject(), schema.payload());

			assertThat(schemaId.id() + " should be compatible", schemaId.id(), is(notNullValue()));
		}
	}

	@Disabled("one-off fix")
	@Test
	void updateCompatibilityLevel() {
		// here, we make sure to only call this against a local schema registry
		SchemaRegistryService srv = createService(ConfigProvider.getConfig().getValue("base.uri.one-off-fix", URI.class));

		var level = srv.updateCompatibilityLevel("VerfuegungEvents-value", new Compatibility("FULL_TRANSITIVE"));

		assertThat(level.compatibility(), is("FULL_TRANSITIVE"));
	}

	@Nonnull
	private static Optional<Schema> findSchema(String subject) {
		return getAvroSchemas().stream()
			.filter(s -> s.subject().equals(subject))
			.map(AvroSchema::payload)
			.findAny();
	}

	private static List<AvroSchema> getAvroSchemas() {
		return List.of(
			new AvroSchema("BetreuungAnfrageEvents-value", BetreuungAnfrageEventDTO.SCHEMA$),
			new AvroSchema("NeueVeranlagungEvents-value", NeueVeranlagungEventDTO.SCHEMA$),
			new AvroSchema("InstitutionClientEvents-value", InstitutionClientEventDTO.SCHEMA$),
			new AvroSchema("VerfuegungEvents-value", VerfuegungEventDTO.SCHEMA$),
			new AvroSchema("InstitutionEvents-value", InstitutionEventDTO.SCHEMA$),
			new AvroSchema("PlatzbestaetigungBetreuungEvents-value", BetreuungEventDTO.SCHEMA$),
			new AvroSchema("AnmeldungBestaetigungEvents-value", TagesschuleBestaetigungEventDTO.SCHEMA$),
			new AvroSchema("GemeindeEvents-value", GemeindeEventDTO.SCHEMA$),
			new AvroSchema("AnmeldungEvents-value", TagesschuleAnmeldungEventDTO.SCHEMA$),
			new AvroSchema("GemeindeKennzahlenEvents-value", GemeindeKennzahlenEventDTO.SCHEMA$),
			new AvroSchema("GemeindeSelbstbehaltEvtens-value", GemeindeSelbstbehaltEventDTO.SCHEMA$)
		);
	}

	@Nonnull
	private static List<SubjectSchema> getAllSchemas(SchemaRegistryService srv) {
		return srv.getSubjects().stream()
			.flatMap(schema -> {
				Set<Integer> versions = srv.getVersions(schema);

				return versions.stream()
					.map(version -> srv.getSchemaByVersion(schema, version));
			})
			.toList();
	}

	private static void exportSchema(SubjectSchema s, URI uri) {
		String filename = String.format("%s_%s.avsc", s.subject(), s.version());
		Path basePath = Path.of("target/schemas/", uri.getHost(), s.subject());
		Path path = basePath.resolve(filename);

		try {
			Files.createDirectories(basePath);
			Files.writeString(path, s.schema(), StandardOpenOption.CREATE);
		} catch (IOException ioException) {
			String message = "failed to export schema for " + s.subject() + ' ' + s.version() + " at " + path;
			throw new IllegalStateException(message, ioException);
		}
	}

	private static SchemaRegistryService createService(URI uri) {
		return RestClientBuilder.newBuilder()
			.baseUri(uri)
			.connectTimeout(5, TimeUnit.SECONDS)
			.build(SchemaRegistryService.class);
	}

	private record AvroSchema(String subject, org.apache.avro.Schema schema) {
		Schema payload() {
			return new Schema(schema.toString());
		}

		@Override
		public String toString() {
			return subject;
		}
	}

	private static List<Server> getOnlineServers() {
		return streamOnlineServers().toList();
	}

	private static Stream<Server> streamOnlineServers() {
		List<URI> uris = ConfigProvider.getConfig().getValues("base.uris", URI.class);

		return uris.stream()
			.map(uri -> new Server(uri, createService(uri)))
			.filter(Server::isOnline);
	}

	private record Server(URI uri, SchemaRegistryService service) implements AutoCloseable {
		public boolean isOnline() {
			try {
				var apiFound = service.getSubjects();
			} catch (WebApplicationException ex) {
				if (ex.getResponse().getStatusInfo().toEnum() == Status.NOT_FOUND) {
					return false;
				}
			} catch (Exception ex) {
				if (ex.getCause() instanceof SocketException) {
					return false;
				}
				throw ex;
			}
			return true;
		}

		@Override
		public String toString() {
			return MoreObjects.toStringHelper(this)
				.add("uri", uri)
				.toString();
		}

		@Override
		public void close() {
			try {
				((Closeable) service).close();
			} catch (Throwable t) {
				fail("Caught unexpected exception closing client", t);
			}
		}
	}

	@Nonnull
	private static Executable compatibilityCheck(
		SchemaRegistryService srv,
		String subject,
		Schema value,
		String version) {

		return () -> {
			var compatibility = srv.compatibility(subject, version, value);
			assertThat("is compatible", compatibility.is_compatible(), is(true));
		};
	}
}

