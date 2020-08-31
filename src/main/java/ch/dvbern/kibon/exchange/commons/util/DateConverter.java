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

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.apache.avro.data.TimeConversions.TimestampMicrosConversion;
import org.jetbrains.annotations.Contract;

public final class DateConverter {

	private static final TimestampMicrosConversion AVRO_CONVERTER = new TimestampMicrosConversion();

	private DateConverter() {
		// util
	}

	/**
	 * Due to Avro bug https://issues.apache.org/jira/projects/AVRO/issues/AVRO-2904?filter=allopenissues, union types
	 * and logical-types timestamp-micros and time-micros cannot be used together: the class generator does not create
	 * the required conversion mapping. Furthermore, we cannot simply add it to the generated class, because the
	 * converters don't allow the combination with NULL.
	 *
	 * The conversion here maps Instant to time-micros.
	 */
	@Nullable
	@Contract("null -> null; !null -> !null")
	public static Long serialize(@Nullable Instant datum) {
		return datum == null ? null : AVRO_CONVERTER.toLong(datum, null, null);
	}

	@Nullable
	@Contract("null -> null; !null -> !null")
	public static Long fromLocalDateTime(@Nullable LocalDateTime datum) {
		return datum == null ? null : serialize(of(datum));
	}

	/**
	 * Maps time-micros to Instant
	 */
	@Nullable
	@Contract("null -> null; !null -> !null")
	public static Instant deserialize(@Nullable Long datum) {
		return datum == null ? null : AVRO_CONVERTER.fromLong(datum, null, null);
	}

	/**
	 * Maps time-micros to Instant
	 */
	@Nullable
	@Contract("null -> null; !null -> !null")
	public static LocalDateTime toLocalDateTime(@Nullable Long datum) {
		return datum == null ? null : of(deserialize(datum));
	}

	@Nonnull
	public static LocalDateTime of(@Nonnull Instant instant) {
		return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
	}

	@Nonnull
	public static Instant of(@Nonnull LocalDateTime dateTime) {
		return dateTime.atZone(ZoneId.systemDefault()).toInstant();
	}
}
