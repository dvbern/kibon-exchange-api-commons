/*
 * Copyright (C) 2020 DV Bern AG, Switzerland
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

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.UUID;

import javax.annotation.Nonnull;

import ch.dvbern.kibon.exchange.commons.types.BetreuungsangebotTyp;
import ch.dvbern.kibon.exchange.commons.types.Wochentag;
import ch.dvbern.kibon.exchange.commons.util.DateConverter;
import ch.dvbern.kibon.exchange.commons.util.TimeConverter;
import com.github.javafaker.Faker;

public final class InstitutionEventTestUtil {

	private static final Faker FAKER = new Faker();

	private InstitutionEventTestUtil() {
	}

	@Nonnull
	public static InstitutionEventDTO createDTO() {
		InstitutionEventDTO dto = InstitutionEventDTO.newBuilder()
			.setId(UUID.randomUUID().toString())
			.setName(FAKER.company().name())
			.setTraegerschaft(FAKER.company().buzzword())
			.setBetreuungsArt(BetreuungsangebotTyp.TAGESFAMILIEN)
			.setStatus(InstitutionStatus.KONFIGURATION)
			.setBetreuungsGutscheineAb(LocalDate.of(2020, 8, 1))
			.setAdresse(createKontaktAngabenDTO())
			.setBetreuungsAdressen(Arrays.asList(createKontaktAngabenDTO(), createKontaktAngabenDTO()))
			.setOeffnungsTage(Arrays.asList(Wochentag.values().clone()))
			.setOffenVon(TimeConverter.serialize(timeBetween(0, 14)))
			.setOffenBis(TimeConverter.serialize(timeBetween(14, 20)))
			.setOeffnungsAbweichungen(FAKER.lorem().characters(0, 4000))
			.setAltersKategorien(Arrays.asList(AltersKategorie.BABY, AltersKategorie.KINDERGARTEN))
			.setSubventioniertePlaetze(FAKER.bool().bool())
			.setAnzahlPlaetze(getRandomBigDecimal())
			.setAnzahlPlaetzeFirmen(getRandomBigDecimal())
			.setTimestampMutiert(DateConverter.serialize(DateConverter.of(LocalDateTime.now())))
			.build();

		return dto;
	}

	@Nonnull
	public static KontaktAngabenDTO createKontaktAngabenDTO() {
		return KontaktAngabenDTO.newBuilder()
			.setAnschrift(FAKER.company().name())
			.setStrasse(FAKER.address().streetName())
			.setHausnummer(FAKER.address().buildingNumber())
			.setAdresszusatz(FAKER.address().streetPrefix())
			.setPlz(FAKER.address().zipCode())
			.setOrt(FAKER.address().cityName())
			.setLand(FAKER.address().countryCode())
			.setGemeinde(createGemeindeDTO())
			.setEmail(FAKER.internet().emailAddress())
			.setTelefon(FAKER.phoneNumber().phoneNumber())
			.setWebseite(FAKER.internet().url())
			.build();
	}

	@Nonnull
	public static GemeindeDTO createGemeindeDTO() {
		return GemeindeDTO.newBuilder()
			.setBfsNummer(FAKER.number().numberBetween(0L, 400L))
			.setName(FAKER.name().name())
			.build();
	}

	@Nonnull
	public static InstitutionEventDTOv1 createDTOv1() {
		InstitutionEventDTOv1 dto = InstitutionEventDTOv1.newBuilder()
			.setId(UUID.randomUUID().toString())
			.setName(FAKER.company().name())
			.setTraegerschaft(FAKER.company().buzzword())
			.setAdresse(createAdresseDTO())
			.build();

		return dto;
	}

	@Nonnull
	public static AdresseDTO createAdresseDTO() {
		return AdresseDTO.newBuilder()
			.setStrasse(FAKER.address().streetName())
			.setHausnummer(FAKER.address().buildingNumber())
			.setAdresszusatz(FAKER.address().streetPrefix())
			.setPlz(FAKER.address().zipCode())
			.setOrt(FAKER.address().cityName())
			.setLand(FAKER.address().countryCode())
			.build();
	}

	@Nonnull
	public static BigDecimal getRandomBigDecimal() {
		return BigDecimal.valueOf(FAKER.number().randomDouble(2, 0, 1000))
			.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	@Nonnull
	public static LocalTime timeBetween(int hourMin, int hourMax) {
		int hour = FAKER.number().numberBetween(hourMin, hourMax);
		int minutes = FAKER.number().numberBetween(0, 60);
		int seconds = FAKER.number().numberBetween(0, 60);
		int nanos = FAKER.number().numberBetween(1_000, 1_000_000_000);

		return LocalTime.of(hour, minutes, seconds, nanos);
	}
}
