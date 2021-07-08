/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ch.dvbern.kibon.exchange.commons.tagesschulen;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class TagesschuleAnmeldungTarifeDTO extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -969287219749425147L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TagesschuleAnmeldungTarifeDTO\",\"namespace\":\"ch.dvbern.kibon.exchange.commons.tagesschulen\",\"fields\":[{\"name\":\"tarifePaedagogisch\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TarifDTO\",\"fields\":[{\"name\":\"von\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"bis\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"betreuungsMinutenPerWeek\",\"type\":\"int\"},{\"name\":\"betreuungsKostenPerHour\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2}},{\"name\":\"verpflegungsKostenPerWeek\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2}},{\"name\":\"verpflegungsKostenVerguenstigung\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2}},{\"name\":\"totalCostsPerWeek\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2}}]},\"java-class\":\"java.util.List\"}},{\"name\":\"tarifeNichtPaedagogisch\",\"type\":{\"type\":\"array\",\"items\":\"TarifDTO\",\"java-class\":\"java.util.List\"}},{\"name\":\"finSitAkzeptiert\",\"type\":\"boolean\"},{\"name\":\"timestampAbgeschlossen\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<TagesschuleAnmeldungTarifeDTO> ENCODER =
      new BinaryMessageEncoder<TagesschuleAnmeldungTarifeDTO>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TagesschuleAnmeldungTarifeDTO> DECODER =
      new BinaryMessageDecoder<TagesschuleAnmeldungTarifeDTO>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TagesschuleAnmeldungTarifeDTO> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TagesschuleAnmeldungTarifeDTO> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TagesschuleAnmeldungTarifeDTO> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TagesschuleAnmeldungTarifeDTO>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TagesschuleAnmeldungTarifeDTO to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TagesschuleAnmeldungTarifeDTO from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TagesschuleAnmeldungTarifeDTO instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TagesschuleAnmeldungTarifeDTO fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO> tarifePaedagogisch;
   private java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO> tarifeNichtPaedagogisch;
   private boolean finSitAkzeptiert;
   private java.time.LocalDate timestampAbgeschlossen;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TagesschuleAnmeldungTarifeDTO() {}

  /**
   * All-args constructor.
   * @param tarifePaedagogisch The new value for tarifePaedagogisch
   * @param tarifeNichtPaedagogisch The new value for tarifeNichtPaedagogisch
   * @param finSitAkzeptiert The new value for finSitAkzeptiert
   * @param timestampAbgeschlossen The new value for timestampAbgeschlossen
   */
  public TagesschuleAnmeldungTarifeDTO(java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO> tarifePaedagogisch, java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO> tarifeNichtPaedagogisch, java.lang.Boolean finSitAkzeptiert, java.time.LocalDate timestampAbgeschlossen) {
    this.tarifePaedagogisch = tarifePaedagogisch;
    this.tarifeNichtPaedagogisch = tarifeNichtPaedagogisch;
    this.finSitAkzeptiert = finSitAkzeptiert;
    this.timestampAbgeschlossen = timestampAbgeschlossen;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return tarifePaedagogisch;
    case 1: return tarifeNichtPaedagogisch;
    case 2: return finSitAkzeptiert;
    case 3: return timestampAbgeschlossen;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
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
    case 0: tarifePaedagogisch = (java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO>)value$; break;
    case 1: tarifeNichtPaedagogisch = (java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO>)value$; break;
    case 2: finSitAkzeptiert = (java.lang.Boolean)value$; break;
    case 3: timestampAbgeschlossen = (java.time.LocalDate)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'tarifePaedagogisch' field.
   * @return The value of the 'tarifePaedagogisch' field.
   */
  public java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO> getTarifePaedagogisch() {
    return tarifePaedagogisch;
  }


  /**
   * Sets the value of the 'tarifePaedagogisch' field.
   * @param value the value to set.
   */
  public void setTarifePaedagogisch(java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO> value) {
    this.tarifePaedagogisch = value;
  }

  /**
   * Gets the value of the 'tarifeNichtPaedagogisch' field.
   * @return The value of the 'tarifeNichtPaedagogisch' field.
   */
  public java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO> getTarifeNichtPaedagogisch() {
    return tarifeNichtPaedagogisch;
  }


  /**
   * Sets the value of the 'tarifeNichtPaedagogisch' field.
   * @param value the value to set.
   */
  public void setTarifeNichtPaedagogisch(java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO> value) {
    this.tarifeNichtPaedagogisch = value;
  }

  /**
   * Gets the value of the 'finSitAkzeptiert' field.
   * @return The value of the 'finSitAkzeptiert' field.
   */
  public boolean getFinSitAkzeptiert() {
    return finSitAkzeptiert;
  }


  /**
   * Sets the value of the 'finSitAkzeptiert' field.
   * @param value the value to set.
   */
  public void setFinSitAkzeptiert(boolean value) {
    this.finSitAkzeptiert = value;
  }

  /**
   * Gets the value of the 'timestampAbgeschlossen' field.
   * @return The value of the 'timestampAbgeschlossen' field.
   */
  public java.time.LocalDate getTimestampAbgeschlossen() {
    return timestampAbgeschlossen;
  }


  /**
   * Sets the value of the 'timestampAbgeschlossen' field.
   * @param value the value to set.
   */
  public void setTimestampAbgeschlossen(java.time.LocalDate value) {
    this.timestampAbgeschlossen = value;
  }

  /**
   * Creates a new TagesschuleAnmeldungTarifeDTO RecordBuilder.
   * @return A new TagesschuleAnmeldungTarifeDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder newBuilder() {
    return new ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder();
  }

  /**
   * Creates a new TagesschuleAnmeldungTarifeDTO RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TagesschuleAnmeldungTarifeDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder newBuilder(ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder other) {
    if (other == null) {
      return new ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder();
    } else {
      return new ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder(other);
    }
  }

  /**
   * Creates a new TagesschuleAnmeldungTarifeDTO RecordBuilder by copying an existing TagesschuleAnmeldungTarifeDTO instance.
   * @param other The existing instance to copy.
   * @return A new TagesschuleAnmeldungTarifeDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder newBuilder(ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO other) {
    if (other == null) {
      return new ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder();
    } else {
      return new ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder(other);
    }
  }

  /**
   * RecordBuilder for TagesschuleAnmeldungTarifeDTO instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TagesschuleAnmeldungTarifeDTO>
    implements org.apache.avro.data.RecordBuilder<TagesschuleAnmeldungTarifeDTO> {

    private java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO> tarifePaedagogisch;
    private java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO> tarifeNichtPaedagogisch;
    private boolean finSitAkzeptiert;
    private java.time.LocalDate timestampAbgeschlossen;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.tarifePaedagogisch)) {
        this.tarifePaedagogisch = data().deepCopy(fields()[0].schema(), other.tarifePaedagogisch);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.tarifeNichtPaedagogisch)) {
        this.tarifeNichtPaedagogisch = data().deepCopy(fields()[1].schema(), other.tarifeNichtPaedagogisch);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.finSitAkzeptiert)) {
        this.finSitAkzeptiert = data().deepCopy(fields()[2].schema(), other.finSitAkzeptiert);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.timestampAbgeschlossen)) {
        this.timestampAbgeschlossen = data().deepCopy(fields()[3].schema(), other.timestampAbgeschlossen);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing TagesschuleAnmeldungTarifeDTO instance
     * @param other The existing instance to copy.
     */
    private Builder(ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.tarifePaedagogisch)) {
        this.tarifePaedagogisch = data().deepCopy(fields()[0].schema(), other.tarifePaedagogisch);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.tarifeNichtPaedagogisch)) {
        this.tarifeNichtPaedagogisch = data().deepCopy(fields()[1].schema(), other.tarifeNichtPaedagogisch);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.finSitAkzeptiert)) {
        this.finSitAkzeptiert = data().deepCopy(fields()[2].schema(), other.finSitAkzeptiert);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timestampAbgeschlossen)) {
        this.timestampAbgeschlossen = data().deepCopy(fields()[3].schema(), other.timestampAbgeschlossen);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'tarifePaedagogisch' field.
      * @return The value.
      */
    public java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO> getTarifePaedagogisch() {
      return tarifePaedagogisch;
    }


    /**
      * Sets the value of the 'tarifePaedagogisch' field.
      * @param value The value of 'tarifePaedagogisch'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder setTarifePaedagogisch(java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO> value) {
      validate(fields()[0], value);
      this.tarifePaedagogisch = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'tarifePaedagogisch' field has been set.
      * @return True if the 'tarifePaedagogisch' field has been set, false otherwise.
      */
    public boolean hasTarifePaedagogisch() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'tarifePaedagogisch' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder clearTarifePaedagogisch() {
      tarifePaedagogisch = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'tarifeNichtPaedagogisch' field.
      * @return The value.
      */
    public java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO> getTarifeNichtPaedagogisch() {
      return tarifeNichtPaedagogisch;
    }


    /**
      * Sets the value of the 'tarifeNichtPaedagogisch' field.
      * @param value The value of 'tarifeNichtPaedagogisch'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder setTarifeNichtPaedagogisch(java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO> value) {
      validate(fields()[1], value);
      this.tarifeNichtPaedagogisch = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'tarifeNichtPaedagogisch' field has been set.
      * @return True if the 'tarifeNichtPaedagogisch' field has been set, false otherwise.
      */
    public boolean hasTarifeNichtPaedagogisch() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'tarifeNichtPaedagogisch' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder clearTarifeNichtPaedagogisch() {
      tarifeNichtPaedagogisch = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'finSitAkzeptiert' field.
      * @return The value.
      */
    public boolean getFinSitAkzeptiert() {
      return finSitAkzeptiert;
    }


    /**
      * Sets the value of the 'finSitAkzeptiert' field.
      * @param value The value of 'finSitAkzeptiert'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder setFinSitAkzeptiert(boolean value) {
      validate(fields()[2], value);
      this.finSitAkzeptiert = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'finSitAkzeptiert' field has been set.
      * @return True if the 'finSitAkzeptiert' field has been set, false otherwise.
      */
    public boolean hasFinSitAkzeptiert() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'finSitAkzeptiert' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder clearFinSitAkzeptiert() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestampAbgeschlossen' field.
      * @return The value.
      */
    public java.time.LocalDate getTimestampAbgeschlossen() {
      return timestampAbgeschlossen;
    }


    /**
      * Sets the value of the 'timestampAbgeschlossen' field.
      * @param value The value of 'timestampAbgeschlossen'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder setTimestampAbgeschlossen(java.time.LocalDate value) {
      validate(fields()[3], value);
      this.timestampAbgeschlossen = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'timestampAbgeschlossen' field has been set.
      * @return True if the 'timestampAbgeschlossen' field has been set, false otherwise.
      */
    public boolean hasTimestampAbgeschlossen() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'timestampAbgeschlossen' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungTarifeDTO.Builder clearTimestampAbgeschlossen() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TagesschuleAnmeldungTarifeDTO build() {
      try {
        TagesschuleAnmeldungTarifeDTO record = new TagesschuleAnmeldungTarifeDTO();
        record.tarifePaedagogisch = fieldSetFlags()[0] ? this.tarifePaedagogisch : (java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO>) defaultValue(fields()[0]);
        record.tarifeNichtPaedagogisch = fieldSetFlags()[1] ? this.tarifeNichtPaedagogisch : (java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.TarifDTO>) defaultValue(fields()[1]);
        record.finSitAkzeptiert = fieldSetFlags()[2] ? this.finSitAkzeptiert : (java.lang.Boolean) defaultValue(fields()[2]);
        record.timestampAbgeschlossen = fieldSetFlags()[3] ? this.timestampAbgeschlossen : (java.time.LocalDate) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TagesschuleAnmeldungTarifeDTO>
    WRITER$ = (org.apache.avro.io.DatumWriter<TagesschuleAnmeldungTarifeDTO>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TagesschuleAnmeldungTarifeDTO>
    READER$ = (org.apache.avro.io.DatumReader<TagesschuleAnmeldungTarifeDTO>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}









