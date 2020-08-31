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

import javax.annotation.Nullable;

import org.apache.avro.data.TimeConversions.TimeMicrosConversion;
import org.jetbrains.annotations.Contract;

public final class TimeConverter {

	private static final TimeMicrosConversion AVRO_CONVERTER = new TimeMicrosConversion();

	private TimeConverter() {
		// util class
	}

	/**
	 * Due to Avro bug https://issues.apache.org/jira/projects/AVRO/issues/AVRO-2904?filter=allopenissues, union
	 * types and logical-types timestamp-micros and time-micros cannot be used together: the class generator does not
	 * create the required conversion mapping. Furthermore, we cannot simply add it to the generated class, because
	 * the converters don't allow the combination with NULL.
	 *
	 * The conversion here maps LocalTime to time-micros.
	 */
	@Nullable
	@Contract("null -> null; !null -> !null")
	public static Long serialize(@Nullable LocalTime datum) {
		return datum == null ? null : AVRO_CONVERTER.toLong(datum, null, null);
	}

	/**
	 * Maps a Long in time-micros precision to LocalTime
	 */
	@Nullable
	@Contract("null -> null; !null -> !null")
	public static LocalTime deserialize(@Nullable Long datum) {
		return datum == null ? null : AVRO_CONVERTER.fromLong(datum, null, null);
	}
}
