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

import ch.dvbern.kibon.exchange.commons.types.Regelwerk;
import ch.dvbern.kibon.exchange.commons.types.Regelwerkv1;
import ch.dvbern.kibon.exchange.commons.util.AvroConverter;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.not;

class VerfuegungEventDTOTest {

	/**
	 * Verify that a VerfuegungEventDTOv1 (old schema) can be parsed as a VerfuegungEventDTO (new schema).
	 */
	@Test
	void canCreateFromVerfuegungEventDTO() {
		VerfuegungEventDTOv1 otherDTO = VerfuegungEventTestUtil.createDTOv1();
		byte[] payload = AvroConverter.toAvroBinary(otherDTO);

		VerfuegungEventDTOv2 dto =
			AvroConverter.fromAvroBinary(otherDTO.getSchema(), VerfuegungEventDTOv2.getClassSchema(), payload);

		assertThat(dto.getZeitabschnitte(), everyItem(hasProperty("regelwerk", equalTo(Regelwerkv1.ASIV))));
	}

	/**
	 * Verify that a VerfuegungEventDTO (new schema) can be parsed as a VerfuegungEventDTOv1 (old schema).
	 */
	@Test
	void canConvertToVerfuegungEventDTO() {
		VerfuegungEventDTOv2 otherDTO = VerfuegungEventTestUtil.createDTOv2();
		byte[] payload = AvroConverter.toAvroBinary(otherDTO);

		VerfuegungEventDTOv1 dto =
			AvroConverter.fromAvroBinary(otherDTO.getSchema(), VerfuegungEventDTOv1.getClassSchema(), payload);

		// the Avro conversion fails, when "Regelwerk" does not use a default value
		assertThat(dto.getZeitabschnitte(), everyItem(not(hasProperty("regelwerk"))));
	}
}
