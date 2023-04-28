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

package ch.dvbern.kibon.exchange.commons.compatibility.api;

import java.util.Set;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
@Path("/")
public interface SchemaRegistryService {

	@GET
	@Path("/subjects")
	Set<String> getSubjects();

	@GET
	@Path("/subjects/{subject}/versions")
	Set<Integer> getVersions(@PathParam("subject") String subject);

	@GET
	@Path("/subjects/{subject}/versions/{version}")
	SubjectSchema getSchemaByVersion(@PathParam("subject") String subject, @PathParam("version") int id);

	@DELETE
	@Path("/subjects/{subject}")
	Response deleteSchemas(@PathParam("subject") String subject, @QueryParam("permanent") boolean permanent);

	@POST
	@Path("/subjects/{subject}/versions")
	@Consumes("application/vnd.schemaregistry.v1+json")
	SchemaId registerSchema(@PathParam("subject") String subject, Schema schema);

	@PUT
	@Path("/config/{subject}/")
	Compatibility updateCompatibilityLevel(@PathParam("subject") String subject, Compatibility compatibility);

	@GET
	@Path("/schemas/ids/{id}")
	Schema getSchemaById(@PathParam("id") int id);

	@GET
	@Path("/config/{subject}/")
	CompatibilityLevel getCompatibilityLevel(
		@PathParam("subject") String subject,
		@QueryParam("defaultToGlobal") boolean defaultToGlobal);

	@POST
	@Path("/compatibility/subjects/{subject}/versions/{version}")
	@Consumes("application/vnd.schemaregistry.v1+json")
	Compatible compatibility(
		@PathParam("subject") String subject,
		@PathParam("version") String version,
		Schema schema
	);
}
