/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ch.dvbern.kibon.exchange.commons.types;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Gesuchsperiode extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2492602715335740724L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Gesuchsperiode\",\"namespace\":\"ch.dvbern.kibon.exchange.commons.types\",\"fields\":[{\"name\":\"gueltigAb\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"gueltigBis\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
  }

  private static final BinaryMessageEncoder<Gesuchsperiode> ENCODER =
      new BinaryMessageEncoder<Gesuchsperiode>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Gesuchsperiode> DECODER =
      new BinaryMessageDecoder<Gesuchsperiode>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Gesuchsperiode> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Gesuchsperiode> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Gesuchsperiode> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Gesuchsperiode>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Gesuchsperiode to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Gesuchsperiode from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Gesuchsperiode instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Gesuchsperiode fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.time.LocalDate gueltigAb;
   private java.time.LocalDate gueltigBis;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Gesuchsperiode() {}

  /**
   * All-args constructor.
   * @param gueltigAb The new value for gueltigAb
   * @param gueltigBis The new value for gueltigBis
   */
  public Gesuchsperiode(java.time.LocalDate gueltigAb, java.time.LocalDate gueltigBis) {
    this.gueltigAb = gueltigAb;
    this.gueltigBis = gueltigBis;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return gueltigAb;
    case 1: return gueltigBis;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      new org.apache.avro.data.TimeConversions.DateConversion(),
      new org.apache.avro.data.TimeConversions.DateConversion(),
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: gueltigAb = (java.time.LocalDate)value$; break;
    case 1: gueltigBis = (java.time.LocalDate)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'gueltigAb' field.
   * @return The value of the 'gueltigAb' field.
   */
  public java.time.LocalDate getGueltigAb() {
    return gueltigAb;
  }


  /**
   * Sets the value of the 'gueltigAb' field.
   * @param value the value to set.
   */
  public void setGueltigAb(java.time.LocalDate value) {
    this.gueltigAb = value;
  }

  /**
   * Gets the value of the 'gueltigBis' field.
   * @return The value of the 'gueltigBis' field.
   */
  public java.time.LocalDate getGueltigBis() {
    return gueltigBis;
  }


  /**
   * Sets the value of the 'gueltigBis' field.
   * @param value the value to set.
   */
  public void setGueltigBis(java.time.LocalDate value) {
    this.gueltigBis = value;
  }

  /**
   * Creates a new Gesuchsperiode RecordBuilder.
   * @return A new Gesuchsperiode RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.types.Gesuchsperiode.Builder newBuilder() {
    return new ch.dvbern.kibon.exchange.commons.types.Gesuchsperiode.Builder();
  }

  /**
   * Creates a new Gesuchsperiode RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Gesuchsperiode RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.types.Gesuchsperiode.Builder newBuilder(ch.dvbern.kibon.exchange.commons.types.Gesuchsperiode.Builder other) {
    if (other == null) {
      return new ch.dvbern.kibon.exchange.commons.types.Gesuchsperiode.Builder();
    } else {
      return new ch.dvbern.kibon.exchange.commons.types.Gesuchsperiode.Builder(other);
    }
  }

  /**
   * Creates a new Gesuchsperiode RecordBuilder by copying an existing Gesuchsperiode instance.
   * @param other The existing instance to copy.
   * @return A new Gesuchsperiode RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.types.Gesuchsperiode.Builder newBuilder(ch.dvbern.kibon.exchange.commons.types.Gesuchsperiode other) {
    if (other == null) {
      return new ch.dvbern.kibon.exchange.commons.types.Gesuchsperiode.Builder();
    } else {
      return new ch.dvbern.kibon.exchange.commons.types.Gesuchsperiode.Builder(other);
    }
  }

  /**
   * RecordBuilder for Gesuchsperiode instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Gesuchsperiode>
    implements org.apache.avro.data.RecordBuilder<Gesuchsperiode> {

    private java.time.LocalDate gueltigAb;
    private java.time.LocalDate gueltigBis;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ch.dvbern.kibon.exchange.commons.types.Gesuchsperiode.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.gueltigAb)) {
        this.gueltigAb = data().deepCopy(fields()[0].schema(), other.gueltigAb);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.gueltigBis)) {
        this.gueltigBis = data().deepCopy(fields()[1].schema(), other.gueltigBis);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing Gesuchsperiode instance
     * @param other The existing instance to copy.
     */
    private Builder(ch.dvbern.kibon.exchange.commons.types.Gesuchsperiode other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.gueltigAb)) {
        this.gueltigAb = data().deepCopy(fields()[0].schema(), other.gueltigAb);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.gueltigBis)) {
        this.gueltigBis = data().deepCopy(fields()[1].schema(), other.gueltigBis);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'gueltigAb' field.
      * @return The value.
      */
    public java.time.LocalDate getGueltigAb() {
      return gueltigAb;
    }


    /**
      * Sets the value of the 'gueltigAb' field.
      * @param value The value of 'gueltigAb'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.Gesuchsperiode.Builder setGueltigAb(java.time.LocalDate value) {
      validate(fields()[0], value);
      this.gueltigAb = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'gueltigAb' field has been set.
      * @return True if the 'gueltigAb' field has been set, false otherwise.
      */
    public boolean hasGueltigAb() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'gueltigAb' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.Gesuchsperiode.Builder clearGueltigAb() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'gueltigBis' field.
      * @return The value.
      */
    public java.time.LocalDate getGueltigBis() {
      return gueltigBis;
    }


    /**
      * Sets the value of the 'gueltigBis' field.
      * @param value The value of 'gueltigBis'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.Gesuchsperiode.Builder setGueltigBis(java.time.LocalDate value) {
      validate(fields()[1], value);
      this.gueltigBis = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'gueltigBis' field has been set.
      * @return True if the 'gueltigBis' field has been set, false otherwise.
      */
    public boolean hasGueltigBis() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'gueltigBis' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.Gesuchsperiode.Builder clearGueltigBis() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Gesuchsperiode build() {
      try {
        Gesuchsperiode record = new Gesuchsperiode();
        record.gueltigAb = fieldSetFlags()[0] ? this.gueltigAb : (java.time.LocalDate) defaultValue(fields()[0]);
        record.gueltigBis = fieldSetFlags()[1] ? this.gueltigBis : (java.time.LocalDate) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Gesuchsperiode>
    WRITER$ = (org.apache.avro.io.DatumWriter<Gesuchsperiode>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Gesuchsperiode>
    READER$ = (org.apache.avro.io.DatumReader<Gesuchsperiode>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










