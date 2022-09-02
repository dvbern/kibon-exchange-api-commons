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

package ch.dvbern.kibon.exchange.commons.verfuegung;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import javax.annotation.Nonnull;

import ch.dvbern.kibon.exchange.commons.types.BetreuungsangebotTyp;
import ch.dvbern.kibon.exchange.commons.types.Mandant;
import ch.dvbern.kibon.exchange.commons.types.Zeiteinheit;
import com.github.javafaker.Faker;

public final class VerfuegungEventTestUtil {

	private static final Faker FAKER = new Faker();

	private VerfuegungEventTestUtil() {
	}

	@Nonnull
	public static VerfuegungEventDTOv1 createDTOv1() {
		KindDTOv1 kindDTO = createKindDTOv1();
		GesuchstellerDTO gesuchstellerDTO = createGesuchstellerDTO();

		LocalDate von = toLocalDate(FAKER.date().past(30, TimeUnit.DAYS));
		LocalDate bis = toLocalDate(FAKER.date().past(20, TimeUnit.DAYS));

		VerfuegungEventDTOv1 dto = VerfuegungEventDTOv1.newBuilder()
			.setKind(kindDTO)
			.setGesuchsteller(gesuchstellerDTO)
			.setBetreuungsArt(BetreuungsangebotTyp.TAGESFAMILIEN)
			.setRefnr("1.1.1")
			.setInstitutionId(UUID.randomUUID().toString())
			.setVon(von)
			.setBis(bis)
			.setVersion(2)
			.setVerfuegtAm(Instant.now())
			.setGemeindeBfsNr(FAKER.number().numberBetween(0, 400))
			.setGemeindeName(FAKER.name().name())
			.setZeitabschnitte(Arrays.asList(createZeitabschnittDTOv1(von, bis), createZeitabschnittDTOv1(von, bis)))
			.setIgnorierteZeitabschnitte(Collections.singletonList(createZeitabschnittDTOv1(von, bis)))
			.build();

		return dto;
	}

	@Nonnull
	public static VerfuegungEventDTOv2 createDTOv2() {
		KindDTOv1 kindDTO = createKindDTOv1();
		GesuchstellerDTO gesuchstellerDTO = createGesuchstellerDTO();

		LocalDate von = toLocalDate(FAKER.date().past(30, TimeUnit.DAYS));
		LocalDate bis = toLocalDate(FAKER.date().past(20, TimeUnit.DAYS));

		VerfuegungEventDTOv2 dto = VerfuegungEventDTOv2.newBuilder()
			.setKind(kindDTO)
			.setGesuchsteller(gesuchstellerDTO)
			.setBetreuungsArt(BetreuungsangebotTyp.TAGESFAMILIEN)
			.setRefnr("1.1.1")
			.setInstitutionId(UUID.randomUUID().toString())
			.setVon(von)
			.setBis(bis)
			.setVersion(2)
			.setVerfuegtAm(Instant.now())
			.setGemeindeBfsNr(FAKER.number().numberBetween(0, 400))
			.setGemeindeName(FAKER.name().name())
			.setAuszahlungAnEltern(false)
			.setZeitabschnitte(Arrays.asList(createZeitabschnittDTOv2(von, bis), createZeitabschnittDTOv2(von, bis)))
			.setIgnorierteZeitabschnitte(Collections.singletonList(createZeitabschnittDTOv2(von, bis)))
			.build();

		return dto;
	}

	@Nonnull
	public static VerfuegungEventDTO createDTO() {
		KindDTO kindDTO = createKindDTO();
		GesuchstellerDTO gesuchstellerDTO = createGesuchstellerDTO();

		LocalDate von = toLocalDate(FAKER.date().past(30, TimeUnit.DAYS));
		LocalDate bis = toLocalDate(FAKER.date().past(20, TimeUnit.DAYS));

		VerfuegungEventDTO dto = VerfuegungEventDTO.newBuilder()
			.setKind(kindDTO)
			.setGesuchsteller(gesuchstellerDTO)
			.setBetreuungsArt(BetreuungsangebotTyp.TAGESFAMILIEN)
			.setRefnr("1.1.1")
			.setInstitutionId(UUID.randomUUID().toString())
			.setVon(von)
			.setBis(bis)
			.setVersion(2)
			.setVerfuegtAm(Instant.now())
			.setGemeindeBfsNr(FAKER.number().numberBetween(0, 400))
			.setGemeindeName(FAKER.name().name())
			.setAuszahlungAnEltern(false)
			.setZeitabschnitte(Arrays.asList(createZeitabschnittDTO(von, bis), createZeitabschnittDTO(von, bis)))
			.setIgnorierteZeitabschnitte(Collections.singletonList(createZeitabschnittDTO(von, bis)))
			.setMandant(Mandant.BERN)
			.build();

		return dto;
	}

	@Nonnull
	public static GesuchstellerDTO createGesuchstellerDTO() {
		return GesuchstellerDTO.newBuilder()
			.setVorname(FAKER.name().firstName())
			.setNachname(FAKER.name().lastName())
			.setEmail(FAKER.internet().emailAddress())
			.build();
	}

	@Nonnull
	public static KindDTOv1 createKindDTOv1() {
		return KindDTOv1.newBuilder()
			.setVorname(FAKER.name().firstName())
			.setNachname(FAKER.name().lastName())
			.setGeburtsdatum(toLocalDate(FAKER.date().birthday(1, 3)))
			.build();
	}

	@Nonnull
	public static KindDTO createKindDTO() {
		return KindDTO.newBuilder()
			.setVorname(FAKER.name().firstName())
			.setNachname(FAKER.name().lastName())
			.setGeburtsdatum(toLocalDate(FAKER.date().birthday(1, 3)))
			.setSprichtMuttersprache(true)
			.setHatSprachlicheIndikation(true)
			.setAusserordentlicherAnspruch(false)
			.setHatSozialeIndikation(false)
			.build();
	}

	@Nonnull
	public static ZeitabschnittDTOv1 createZeitabschnittDTOv1(@Nonnull LocalDate von, @Nonnull LocalDate bis) {
		return ZeitabschnittDTOv1.newBuilder()
			.setVon(von)
			.setBis(bis)
			.setVerfuegungNr(2)
			.setEffektiveBetreuungPct(getRandomBigDecimal())
			.setAnspruchPct(FAKER.number().randomDigit())
			.setVerguenstigtPct(getRandomBigDecimal())
			.setVollkosten(getRandomBigDecimal())
			.setBetreuungsgutschein(getRandomBigDecimal())
			.setMinimalerElternbeitrag(getRandomBigDecimal())
			.setVerguenstigung(getRandomBigDecimal())
			.setVerfuegteAnzahlZeiteinheiten(getRandomBigDecimal())
			.setAnspruchsberechtigteAnzahlZeiteinheiten(getRandomBigDecimal())
			.setZeiteinheit(Zeiteinheit.HOURS)
			.build();
	}

	@Nonnull
	public static ZeitabschnittDTOv2 createZeitabschnittDTOv2(@Nonnull LocalDate von, @Nonnull LocalDate bis) {
		return ZeitabschnittDTOv2.newBuilder()
			.setVon(von)
			.setBis(bis)
			.setVerfuegungNr(2)
			.setEffektiveBetreuungPct(getRandomBigDecimal())
			.setAnspruchPct(FAKER.number().randomDigit())
			.setVerguenstigtPct(getRandomBigDecimal())
			.setVollkosten(getRandomBigDecimal())
			.setBetreuungsgutschein(getRandomBigDecimal())
			.setMinimalerElternbeitrag(getRandomBigDecimal())
			.setVerguenstigung(getRandomBigDecimal())
			.setVerfuegteAnzahlZeiteinheiten(getRandomBigDecimal())
			.setAnspruchsberechtigteAnzahlZeiteinheiten(getRandomBigDecimal())
			.setZeiteinheit(Zeiteinheit.HOURS)
			.setAuszahlungAnEltern(false)
			.build();
	}

	@Nonnull
	public static ZeitabschnittDTO createZeitabschnittDTO(@Nonnull LocalDate von, @Nonnull LocalDate bis) {
		return ZeitabschnittDTO.newBuilder()
			.setVon(von)
			.setBis(bis)
			.setVerfuegungNr(2)
			.setEffektiveBetreuungPct(getRandomBigDecimal())
			.setAnspruchPct(FAKER.number().randomDigit())
			.setVerguenstigtPct(getRandomBigDecimal())
			.setVollkosten(getRandomBigDecimal())
			.setBetreuungsgutschein(getRandomBigDecimal())
			.setMinimalerElternbeitrag(getRandomBigDecimal())
			.setVerguenstigung(getRandomBigDecimal())
			.setVerfuegteAnzahlZeiteinheiten(getRandomBigDecimal())
			.setAnspruchsberechtigteAnzahlZeiteinheiten(getRandomBigDecimal())
			.setZeiteinheit(Zeiteinheit.HOURS)
			.setAuszahlungAnEltern(false)
			.setMassgebendesEinkommen(getRandomBigDecimal())
			.setBesondereBeduerfnisse(false)
			.setBetreuungsgutscheinKanton(getRandomBigDecimal())
			.build();
	}

	@Nonnull
	public static BigDecimal getRandomBigDecimal() {
		return BigDecimal.valueOf(FAKER.number().randomDouble(2, 0, 1000))
			.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	@Nonnull
	public static LocalDate toLocalDate(@Nonnull Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
}
