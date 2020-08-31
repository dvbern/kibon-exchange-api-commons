/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ch.dvbern.kibon.exchange.commons.platzbestaetigung;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class KindDTO extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7073093400356669486L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"KindDTO\",\"namespace\":\"ch.dvbern.kibon.exchange.commons.platzbestaetigung\",\"fields\":[{\"name\":\"vorname\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"nachname\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"geburtsdatum\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
  }

  private static final BinaryMessageEncoder<KindDTO> ENCODER =
      new BinaryMessageEncoder<KindDTO>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<KindDTO> DECODER =
      new BinaryMessageDecoder<KindDTO>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<KindDTO> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<KindDTO> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<KindDTO> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<KindDTO>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this KindDTO to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a KindDTO from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a KindDTO instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static KindDTO fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String vorname;
   private java.lang.String nachname;
   private java.time.LocalDate geburtsdatum;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public KindDTO() {}

  /**
   * All-args constructor.
   * @param vorname The new value for vorname
   * @param nachname The new value for nachname
   * @param geburtsdatum The new value for geburtsdatum
   */
  public KindDTO(java.lang.String vorname, java.lang.String nachname, java.time.LocalDate geburtsdatum) {
    this.vorname = vorname;
    this.nachname = nachname;
    this.geburtsdatum = geburtsdatum;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return vorname;
    case 1: return nachname;
    case 2: return geburtsdatum;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
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
    case 0: vorname = (java.lang.String)value$; break;
    case 1: nachname = (java.lang.String)value$; break;
    case 2: geburtsdatum = (java.time.LocalDate)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'vorname' field.
   * @return The value of the 'vorname' field.
   */
  public java.lang.String getVorname() {
    return vorname;
  }


  /**
   * Sets the value of the 'vorname' field.
   * @param value the value to set.
   */
  public void setVorname(java.lang.String value) {
    this.vorname = value;
  }

  /**
   * Gets the value of the 'nachname' field.
   * @return The value of the 'nachname' field.
   */
  public java.lang.String getNachname() {
    return nachname;
  }


  /**
   * Sets the value of the 'nachname' field.
   * @param value the value to set.
   */
  public void setNachname(java.lang.String value) {
    this.nachname = value;
  }

  /**
   * Gets the value of the 'geburtsdatum' field.
   * @return The value of the 'geburtsdatum' field.
   */
  public java.time.LocalDate getGeburtsdatum() {
    return geburtsdatum;
  }


  /**
   * Sets the value of the 'geburtsdatum' field.
   * @param value the value to set.
   */
  public void setGeburtsdatum(java.time.LocalDate value) {
    this.geburtsdatum = value;
  }

  /**
   * Creates a new KindDTO RecordBuilder.
   * @return A new KindDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO.Builder newBuilder() {
    return new ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO.Builder();
  }

  /**
   * Creates a new KindDTO RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new KindDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO.Builder newBuilder(ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO.Builder other) {
    if (other == null) {
      return new ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO.Builder();
    } else {
      return new ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO.Builder(other);
    }
  }

  /**
   * Creates a new KindDTO RecordBuilder by copying an existing KindDTO instance.
   * @param other The existing instance to copy.
   * @return A new KindDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO.Builder newBuilder(ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO other) {
    if (other == null) {
      return new ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO.Builder();
    } else {
      return new ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO.Builder(other);
    }
  }

  /**
   * RecordBuilder for KindDTO instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<KindDTO>
    implements org.apache.avro.data.RecordBuilder<KindDTO> {

    private java.lang.String vorname;
    private java.lang.String nachname;
    private java.time.LocalDate geburtsdatum;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.vorname)) {
        this.vorname = data().deepCopy(fields()[0].schema(), other.vorname);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.nachname)) {
        this.nachname = data().deepCopy(fields()[1].schema(), other.nachname);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.geburtsdatum)) {
        this.geburtsdatum = data().deepCopy(fields()[2].schema(), other.geburtsdatum);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing KindDTO instance
     * @param other The existing instance to copy.
     */
    private Builder(ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.vorname)) {
        this.vorname = data().deepCopy(fields()[0].schema(), other.vorname);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nachname)) {
        this.nachname = data().deepCopy(fields()[1].schema(), other.nachname);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.geburtsdatum)) {
        this.geburtsdatum = data().deepCopy(fields()[2].schema(), other.geburtsdatum);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'vorname' field.
      * @return The value.
      */
    public java.lang.String getVorname() {
      return vorname;
    }


    /**
      * Sets the value of the 'vorname' field.
      * @param value The value of 'vorname'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO.Builder setVorname(java.lang.String value) {
      validate(fields()[0], value);
      this.vorname = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'vorname' field has been set.
      * @return True if the 'vorname' field has been set, false otherwise.
      */
    public boolean hasVorname() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'vorname' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO.Builder clearVorname() {
      vorname = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'nachname' field.
      * @return The value.
      */
    public java.lang.String getNachname() {
      return nachname;
    }


    /**
      * Sets the value of the 'nachname' field.
      * @param value The value of 'nachname'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO.Builder setNachname(java.lang.String value) {
      validate(fields()[1], value);
      this.nachname = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'nachname' field has been set.
      * @return True if the 'nachname' field has been set, false otherwise.
      */
    public boolean hasNachname() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'nachname' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO.Builder clearNachname() {
      nachname = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'geburtsdatum' field.
      * @return The value.
      */
    public java.time.LocalDate getGeburtsdatum() {
      return geburtsdatum;
    }


    /**
      * Sets the value of the 'geburtsdatum' field.
      * @param value The value of 'geburtsdatum'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO.Builder setGeburtsdatum(java.time.LocalDate value) {
      validate(fields()[2], value);
      this.geburtsdatum = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'geburtsdatum' field has been set.
      * @return True if the 'geburtsdatum' field has been set, false otherwise.
      */
    public boolean hasGeburtsdatum() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'geburtsdatum' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.KindDTO.Builder clearGeburtsdatum() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public KindDTO build() {
      try {
        KindDTO record = new KindDTO();
        record.vorname = fieldSetFlags()[0] ? this.vorname : (java.lang.String) defaultValue(fields()[0]);
        record.nachname = fieldSetFlags()[1] ? this.nachname : (java.lang.String) defaultValue(fields()[1]);
        record.geburtsdatum = fieldSetFlags()[2] ? this.geburtsdatum : (java.time.LocalDate) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<KindDTO>
    WRITER$ = (org.apache.avro.io.DatumWriter<KindDTO>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<KindDTO>
    READER$ = (org.apache.avro.io.DatumReader<KindDTO>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}









