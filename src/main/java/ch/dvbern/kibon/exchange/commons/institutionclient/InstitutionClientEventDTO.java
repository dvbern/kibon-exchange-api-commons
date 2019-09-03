/*
 * Copyright (C) 2019 DV Bern AG, Switzerland
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

package ch.dvbern.kibon.exchange.commons.institutionclient;

import java.io.Serializable;

import javax.annotation.Nonnull;
import javax.validation.constraints.NotEmpty;

public class InstitutionClientEventDTO implements Serializable {

	private static final long serialVersionUID = 6867664611614542652L;

	@Nonnull
	private @NotEmpty String institutionId;

	@Nonnull
	private @NotEmpty String clientName;

	@Nonnull
	private @NotEmpty String clientType;

	public InstitutionClientEventDTO() {
		this.institutionId = "";
		this.clientName = "";
		this.clientType = "";
	}

	public InstitutionClientEventDTO(
		@Nonnull @NotEmpty String institutionId,
		@Nonnull @NotEmpty String clientName,
		@Nonnull @NotEmpty String clientType) {
		this.institutionId = institutionId;
		this.clientName = clientName;
		this.clientType = clientType;
	}

	@Nonnull
	public String getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(@Nonnull String institutionId) {
		this.institutionId = institutionId;
	}

	@Nonnull
	public String getClientName() {
		return clientName;
	}

	public void setClientName(@Nonnull String clientName) {
		this.clientName = clientName;
	}

	@Nonnull
	public String getClientType() {
		return clientType;
	}

	public void setClientType(@Nonnull String clientType) {
		this.clientType = clientType;
	}
}
