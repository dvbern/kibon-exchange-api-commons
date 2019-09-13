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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AdresseDTO implements Serializable {

	private static final long serialVersionUID = -4465577921025821940L;

	@Nonnull
	private @NotNull String strasse = "";

	@Nullable
	private String hausnummer = null;

	@Nullable
	private String adresszusatz = null;

	@Nonnull
	private @NotNull String plz = "";

	@Nonnull
	private @NotNull String ort = "";

	@Nonnull
	private @NotEmpty String land = "";

	public AdresseDTO() {
	}

	public AdresseDTO(
		@Nonnull String strasse,
		@Nullable String hausnummer,
		@Nullable String adresszusatz,
		@Nonnull String plz,
		@Nonnull String ort,
		@Nonnull String land) {
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.adresszusatz = adresszusatz;
		this.plz = plz;
		this.ort = ort;
		this.land = land;
	}

	@Nonnull
	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(@Nonnull String strasse) {
		this.strasse = strasse;
	}

	@Nullable
	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(@Nullable String hausnummer) {
		this.hausnummer = hausnummer;
	}

	@Nullable
	public String getAdresszusatz() {
		return adresszusatz;
	}

	public void setAdresszusatz(@Nullable String adresszusatz) {
		this.adresszusatz = adresszusatz;
	}

	@Nonnull
	public String getPlz() {
		return plz;
	}

	public void setPlz(@Nonnull String plz) {
		this.plz = plz;
	}

	@Nonnull
	public String getOrt() {
		return ort;
	}

	public void setOrt(@Nonnull String ort) {
		this.ort = ort;
	}

	@Nonnull
	public String getLand() {
		return land;
	}

	public void setLand(@Nonnull String land) {
		this.land = land;
	}
}
