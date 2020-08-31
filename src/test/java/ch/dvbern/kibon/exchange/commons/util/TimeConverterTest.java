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

package ch.dvbern.kibon.exchange.commons.util;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class TimeConverterTest {

	@Test
	void serialize() {
		LocalTime localTime = LocalTime.of(1, 2);

		// note: nanos are stripped off
		assertThat(TimeConverter.serialize(localTime), is(3_720_000_000L));
	}

	@Test
	void deserialize() {
		assertThat(TimeConverter.deserialize(3_723_004_005L), is(LocalTime.of(1, 2, 3, 4_005_000)));
	}
}
