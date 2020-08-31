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

import ch.dvbern.kibon.exchange.commons.util.AvroConverter;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;

class InstitutionEventDTOTest {

	/**
	 * Verify that a InstitutionEventDTOv1 (old schema) can be parsed as a InstitutionEventDTO (new schema).
	 */
	@Test
	void canCreateFromInstitutionEventDTOAndBack() {
		InstitutionEventDTO srcDTO = InstitutionEventTestUtil.createDTO();
		byte[] payload = AvroConverter.toAvroBinary(srcDTO);

		InstitutionEventDTO dto =
			AvroConverter.fromAvroBinary(srcDTO.getSchema(), InstitutionEventDTO.getClassSchema(), payload);

		assertThat(dto, hasProperty("adresse", hasProperty("anschrift", not(nullValue()))));
	}

	/**
	 * Verify that a InstitutionEventDTOv1 (old schema) can be parsed as a InstitutionEventDTO (new schema).
	 */
	@Test
	void canCreateFromInstitutionEventDTOv1() {
		InstitutionEventDTOv1 srcDTO = InstitutionEventTestUtil.createDTOv1();
		byte[] payload = AvroConverter.toAvroBinary(srcDTO);

		InstitutionEventDTO dto =
			AvroConverter.fromAvroBinary(srcDTO.getSchema(), InstitutionEventDTO.getClassSchema(), payload);

		assertThat(dto, hasProperty("adresse", hasProperty("anschrift", nullValue())));
	}

	/**
	 * Verify that a InstitutionEventDTO (new schema) can be parsed as a InstitutionEventDTOv1 (old schema).
	 */
	@Test
	void canConvertToInstitutionEventDTOv1() {
		InstitutionEventDTO srcDTO = InstitutionEventTestUtil.createDTO();
		byte[] payload = AvroConverter.toAvroBinary(srcDTO);

		InstitutionEventDTOv1 dto =
			AvroConverter.fromAvroBinary(srcDTO.getSchema(), InstitutionEventDTOv1.getClassSchema(), payload);

		assertThat(dto, hasProperty("adresse", not(hasProperty("anschrift"))));
	}
}
