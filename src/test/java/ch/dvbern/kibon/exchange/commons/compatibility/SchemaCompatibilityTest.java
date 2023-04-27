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

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import javax.annotation.Nonnull;

import ch.dvbern.kibon.exchange.commons.compatibility.api.CompatibilityLevel;
import ch.dvbern.kibon.exchange.commons.compatibility.api.Compatible;
import ch.dvbern.kibon.exchange.commons.compatibility.api.Schema;
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
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response.Status;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class SchemaCompatibilityTest {

	private static final URI BASE_URI_DEV = ConfigProvider.getConfig().getValue("base.uri.dev", URI.class);

	private final SchemaRegistryService service = createService(BASE_URI_DEV);

	@Test
	void getSubjects() {
		var subjects = service.getSubjects();

		assertThat(subjects, is(not(empty())));
	}

	@ParameterizedTest
	@MethodSource("getDevSubjects")
	void getCompatibilityLevel(String subject) {
		CompatibilityLevel level = service.getCompatibilityLevel(subject, true);

		assertThat(level.compatibilityLevel(), is("FULL_TRANSITIVE"));
	}

	@Test
	void downloadSchemas() {
		var BASE_URI_PROD = ConfigProvider.getConfig().getOptionalValue("base.uri.prod", URI.class);

		Stream.concat(Stream.of(BASE_URI_DEV), BASE_URI_PROD.stream()).forEach(uri -> {
			var srv = createService(uri);
			if (isOffline(srv)) {
				return;
			}

			List<SubjectSchema> schemas = getAllSchemas(srv);
			schemas.forEach(s -> SchemaCompatibilityTest.exportSchema(s, uri));

			assertThat(schemas, not(empty()));
		});
	}

	@ParameterizedTest
	@MethodSource("getAvroSchemas")
	void testSchemaCompatibility(AvroSchema schema) {
		// check against all schemas instead of latest?
		// With FULL_TRANSITIVE compatibility, it shouldn't make a difference
		Compatible compatibility = service.compatibility(schema.subject(), "latest", schema.payload());

		assertThat(schema.subject() + " should be compatible", compatibility.is_compatible(), is(true));
	}

	private static List<AvroSchema> getAvroSchemas() {
		return List.of(
			new AvroSchema("BetreuungAnfrageEvents-value", BetreuungAnfrageEventDTO.SCHEMA$),
			//"AnmeldungAblehnenEvents-value", TagesschuleAnmeldungEventDTO.
			new AvroSchema("NeueVeranlagungEvents-value", NeueVeranlagungEventDTO.SCHEMA$),
			new AvroSchema("InstitutionClientEvents-value", InstitutionClientEventDTO.SCHEMA$),
			new AvroSchema("VerfuegungEvents-value", VerfuegungEventDTO.SCHEMA$),
			new AvroSchema("InstitutionEvents-value", InstitutionEventDTO.SCHEMA$),
			new AvroSchema("PlatzbestaetigungBetreuungEvents-value", BetreuungEventDTO.SCHEMA$),
			new AvroSchema("AnmeldungBestaetigungEvents-value", TagesschuleBestaetigungEventDTO.SCHEMA$),
			new AvroSchema("GemeindeEvents-value", GemeindeEventDTO.SCHEMA$),
			new AvroSchema("AnmeldungEvents-value", TagesschuleAnmeldungEventDTO.SCHEMA$),
			//"BetreuungStornierungEvents-value",
			new AvroSchema("GemeindeKennzahlenEvents-value", GemeindeKennzahlenEventDTO.SCHEMA$)
		);
	}

	private static Set<String> getDevSubjects() {
		return createService(BASE_URI_DEV).getSubjects();
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
			.build(SchemaRegistryService.class);
	}

	private static boolean isOffline(SchemaRegistryService srv) {
		try {
			var apiFound = srv.getSubjects();
		} catch (WebApplicationException ex) {
			if (ex.getResponse().getStatusInfo().toEnum() == Status.NOT_FOUND) {
				return true;
			}
		}
		return false;
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
}

