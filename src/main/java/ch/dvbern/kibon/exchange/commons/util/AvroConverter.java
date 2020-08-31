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

package ch.dvbern.kibon.exchange.commons.util;

import java.io.ByteArrayOutputStream;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecordBase;
import org.jetbrains.annotations.Contract;

public final class AvroConverter {

	private AvroConverter() {
		// util class
	}

	@Nonnull
	public static <D extends SpecificRecordBase> byte[] toAvroBinary(@Nonnull D datum) {
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			BinaryEncoder encoder = EncoderFactory.get().binaryEncoder(out, null);
			DatumWriter<D> writer = new SpecificDatumWriter<>(datum.getSchema());

			writer.write(datum, encoder);
			encoder.flush();
			out.close();

			return out.toByteArray();
		} catch (Exception e) {
			throw new IllegalStateException("failed converting to avro", e);
		}
	}

	@Nonnull
	public static <D extends SpecificRecordBase> D fromAvroBinary(
		@Nonnull Schema writer,
		@Nonnull Schema reader,
		@Nonnull byte[] avro) {
		try {
			DatumReader<D> datumReader = new SpecificDatumReader<>(writer, reader);
			Decoder decoder = DecoderFactory.get().binaryDecoder(avro, null);

			return datumReader.read(null, decoder);
		} catch (Exception e) {
			throw new IllegalStateException("failed converting from avro", e);
		}
	}

	/**
	 * @deprecated DANGEROUS: cannot handle Schema changes, because it assumes writer schema matches schema of DTOs in
	 * classpath. Only serves demonstration purposes.
	 */
	@Deprecated
	@Nonnull
	public static <D extends SpecificRecordBase> D fromAvroBinary(@Nonnull Schema writer, @Nonnull byte[] avro) {
		try {
			DatumReader<D> reader = new SpecificDatumReader<>(writer);
			Decoder decoder = DecoderFactory.get().binaryDecoder(avro, null);

			return reader.read(null, decoder);
		} catch (Exception e) {
			throw new IllegalStateException("failed converting from avro", e);
		}
	}

	@Nonnull
	public static <D extends GenericRecord> D fromAvroBinaryGeneric(@Nonnull Schema schema, @Nonnull byte[] avro) {
		try {

			GenericDatumReader<D> reader = new GenericDatumReader<>(schema);
			Decoder decoder = DecoderFactory.get().binaryDecoder(avro, null);

			return reader.read(null, decoder);
		} catch (Exception e) {
			throw new IllegalStateException("failed converting from avro", e);
		}
	}

	/**
	 * Due to Avro bug https://issues.apache.org/jira/projects/AVRO/issues/AVRO-2904?filter=allopenissues, union types
	 * and logical-types timestamp-micros and time-micros cannot be used together: the class generator does not create
	 * the required conversion mapping. Furthermore, we cannot simply add it to the generated class, because the
	 * converters don't allow the combination with NULL.
	 *
	 * The conversion here maps LocalTime to time-micros.
	 */
	@Nullable
	@Contract("null -> null; !null -> !null")
	public static Long convert(@Nullable LocalTime datum) {
		return datum == null ? null : datum.toNanoOfDay() / 1000;
	}

	/**
	 * Due to Avro bug https://issues.apache.org/jira/projects/AVRO/issues/AVRO-2904?filter=allopenissues, union types
	 * and logical-types timestamp-micros and time-micros cannot be used together: the class generator does not create
	 * the required conversion mapping. Furthermore, we cannot simply add it to the generated class, because the
	 * converters don't allow the combination with NULL.
	 *
	 * The conversion here maps LocalDateTime to time-micros.
	 */
	@Nullable
	@Contract("null -> null; !null -> !null")
	public static Long convert(@Nullable LocalDateTime datum) {
		return datum == null ? null : datum.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
	}
}
