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

package ch.dvbern.kibon.exchange.commons.institution;

import java.io.Serializable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class InstitutionEventDTO implements Serializable {
	private static final long serialVersionUID = 7603202730505950835L;

	@Nonnull
	private @NotEmpty String id;

	@Nonnull
	private @NotEmpty String name;

	@Nullable
	private String traegerschaft;

	@Nonnull
	private @NotNull @Valid AdresseDTO adresse;

	public InstitutionEventDTO() {
		this.id = "";
		this.name = "";
		this.adresse = new AdresseDTO();
	}

	public InstitutionEventDTO(
		@Nonnull String id,
		@Nonnull String name,
		@Nullable String traegerschaft,
		@Nonnull AdresseDTO adresse) {
		this.id = id;
		this.name = name;
		this.traegerschaft = traegerschaft;
		this.adresse = adresse;
	}

	@Nonnull
	public String getId() {
		return id;
	}

	public void setId(@Nonnull String id) {
		this.id = id;
	}

	@Nonnull
	public String getName() {
		return name;
	}

	public void setName(@Nonnull String name) {
		this.name = name;
	}

	@Nullable
	public String getTraegerschaft() {
		return traegerschaft;
	}

	public void setTraegerschaft(@Nonnull String traegerschaft) {
		this.traegerschaft = traegerschaft;
	}

	@Nonnull
	public AdresseDTO getAdresse() {
		return adresse;
	}

	public void setAdresse(@Nonnull AdresseDTO adresse) {
		this.adresse = adresse;
	}
}
