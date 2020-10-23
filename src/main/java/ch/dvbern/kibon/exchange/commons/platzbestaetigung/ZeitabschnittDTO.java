/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ch.dvbern.kibon.exchange.commons.platzbestaetigung;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@org.apache.avro.specific.AvroGenerated
public class ZeitabschnittDTO extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1064107085709154786L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ZeitabschnittDTO\",\"namespace\":\"ch.dvbern.kibon.exchange.commons.platzbestaetigung\",\"fields\":[{\"name\":\"betreuungskosten\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2}},{\"name\":\"betreuungspensum\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2}},{\"name\":\"von\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"bis\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"pensumUnit\",\"type\":{\"type\":\"enum\",\"name\":\"Zeiteinheit\",\"namespace\":\"ch.dvbern.kibon.exchange.commons.types\",\"symbols\":[\"DAYS\",\"HOURS\",\"PERCENTAGE\"]}},{\"name\":\"anzahlMonatlicheHauptmahlzeiten\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2}],\"default\":null},{\"name\":\"anzahlMonatlicheNebenmahlzeiten\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2}],\"default\":null},{\"name\":\"tarifProHauptmahlzeiten\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2}],\"default\":null},{\"name\":\"tarifProNebenmahlzeiten\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<ZeitabschnittDTO> ENCODER =
      new BinaryMessageEncoder<ZeitabschnittDTO>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ZeitabschnittDTO> DECODER =
      new BinaryMessageDecoder<ZeitabschnittDTO>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ZeitabschnittDTO> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ZeitabschnittDTO> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ZeitabschnittDTO> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ZeitabschnittDTO>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ZeitabschnittDTO to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ZeitabschnittDTO from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ZeitabschnittDTO instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ZeitabschnittDTO fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.math.BigDecimal betreuungskosten;
   private java.math.BigDecimal betreuungspensum;
   private java.time.LocalDate von;
   private java.time.LocalDate bis;
   private ch.dvbern.kibon.exchange.commons.types.Zeiteinheit pensumUnit;
   private java.math.BigDecimal anzahlMonatlicheHauptmahlzeiten;
   private java.math.BigDecimal anzahlMonatlicheNebenmahlzeiten;
   private java.math.BigDecimal tarifProHauptmahlzeiten;
   private java.math.BigDecimal tarifProNebenmahlzeiten;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ZeitabschnittDTO() {}

  /**
   * All-args constructor.
   * @param betreuungskosten The new value for betreuungskosten
   * @param betreuungspensum The new value for betreuungspensum
   * @param von The new value for von
   * @param bis The new value for bis
   * @param pensumUnit The new value for pensumUnit
   * @param anzahlMonatlicheHauptmahlzeiten The new value for anzahlMonatlicheHauptmahlzeiten
   * @param anzahlMonatlicheNebenmahlzeiten The new value for anzahlMonatlicheNebenmahlzeiten
   * @param tarifProHauptmahlzeiten The new value for tarifProHauptmahlzeiten
   * @param tarifProNebenmahlzeiten The new value for tarifProNebenmahlzeiten
   */
  public ZeitabschnittDTO(java.math.BigDecimal betreuungskosten, java.math.BigDecimal betreuungspensum, java.time.LocalDate von, java.time.LocalDate bis, ch.dvbern.kibon.exchange.commons.types.Zeiteinheit pensumUnit, java.math.BigDecimal anzahlMonatlicheHauptmahlzeiten, java.math.BigDecimal anzahlMonatlicheNebenmahlzeiten, java.math.BigDecimal tarifProHauptmahlzeiten, java.math.BigDecimal tarifProNebenmahlzeiten) {
    this.betreuungskosten = betreuungskosten;
    this.betreuungspensum = betreuungspensum;
    this.von = von;
    this.bis = bis;
    this.pensumUnit = pensumUnit;
    this.anzahlMonatlicheHauptmahlzeiten = anzahlMonatlicheHauptmahlzeiten;
    this.anzahlMonatlicheNebenmahlzeiten = anzahlMonatlicheNebenmahlzeiten;
    this.tarifProHauptmahlzeiten = tarifProHauptmahlzeiten;
    this.tarifProNebenmahlzeiten = tarifProNebenmahlzeiten;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return betreuungskosten;
    case 1: return betreuungspensum;
    case 2: return von;
    case 3: return bis;
    case 4: return pensumUnit;
    case 5: return anzahlMonatlicheHauptmahlzeiten;
    case 6: return anzahlMonatlicheNebenmahlzeiten;
    case 7: return tarifProHauptmahlzeiten;
    case 8: return tarifProNebenmahlzeiten;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      new org.apache.avro.Conversions.DecimalConversion(),
      new org.apache.avro.Conversions.DecimalConversion(),
      new org.apache.avro.data.TimeConversions.DateConversion(),
      new org.apache.avro.data.TimeConversions.DateConversion(),
      null,
      null,
      null,
      null,
      null,
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
    case 0: betreuungskosten = (java.math.BigDecimal)value$; break;
    case 1: betreuungspensum = (java.math.BigDecimal)value$; break;
    case 2: von = (java.time.LocalDate)value$; break;
    case 3: bis = (java.time.LocalDate)value$; break;
    case 4: pensumUnit = (ch.dvbern.kibon.exchange.commons.types.Zeiteinheit)value$; break;
    case 5: anzahlMonatlicheHauptmahlzeiten = (java.math.BigDecimal)value$; break;
    case 6: anzahlMonatlicheNebenmahlzeiten = (java.math.BigDecimal)value$; break;
    case 7: tarifProHauptmahlzeiten = (java.math.BigDecimal)value$; break;
    case 8: tarifProNebenmahlzeiten = (java.math.BigDecimal)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'betreuungskosten' field.
   * @return The value of the 'betreuungskosten' field.
   */
  public java.math.BigDecimal getBetreuungskosten() {
    return betreuungskosten;
  }


  /**
   * Sets the value of the 'betreuungskosten' field.
   * @param value the value to set.
   */
  public void setBetreuungskosten(java.math.BigDecimal value) {
    this.betreuungskosten = value;
  }

  /**
   * Gets the value of the 'betreuungspensum' field.
   * @return The value of the 'betreuungspensum' field.
   */
  public java.math.BigDecimal getBetreuungspensum() {
    return betreuungspensum;
  }


  /**
   * Sets the value of the 'betreuungspensum' field.
   * @param value the value to set.
   */
  public void setBetreuungspensum(java.math.BigDecimal value) {
    this.betreuungspensum = value;
  }

  /**
   * Gets the value of the 'von' field.
   * @return The value of the 'von' field.
   */
  public java.time.LocalDate getVon() {
    return von;
  }


  /**
   * Sets the value of the 'von' field.
   * @param value the value to set.
   */
  public void setVon(java.time.LocalDate value) {
    this.von = value;
  }

  /**
   * Gets the value of the 'bis' field.
   * @return The value of the 'bis' field.
   */
  public java.time.LocalDate getBis() {
    return bis;
  }


  /**
   * Sets the value of the 'bis' field.
   * @param value the value to set.
   */
  public void setBis(java.time.LocalDate value) {
    this.bis = value;
  }

  /**
   * Gets the value of the 'pensumUnit' field.
   * @return The value of the 'pensumUnit' field.
   */
  public ch.dvbern.kibon.exchange.commons.types.Zeiteinheit getPensumUnit() {
    return pensumUnit;
  }


  /**
   * Sets the value of the 'pensumUnit' field.
   * @param value the value to set.
   */
  public void setPensumUnit(ch.dvbern.kibon.exchange.commons.types.Zeiteinheit value) {
    this.pensumUnit = value;
  }

  /**
   * Gets the value of the 'anzahlMonatlicheHauptmahlzeiten' field.
   * @return The value of the 'anzahlMonatlicheHauptmahlzeiten' field.
   */
  public java.math.BigDecimal getAnzahlMonatlicheHauptmahlzeiten() {
    return anzahlMonatlicheHauptmahlzeiten;
  }


  /**
   * Sets the value of the 'anzahlMonatlicheHauptmahlzeiten' field.
   * @param value the value to set.
   */
  public void setAnzahlMonatlicheHauptmahlzeiten(java.math.BigDecimal value) {
    this.anzahlMonatlicheHauptmahlzeiten = value;
  }

  /**
   * Gets the value of the 'anzahlMonatlicheNebenmahlzeiten' field.
   * @return The value of the 'anzahlMonatlicheNebenmahlzeiten' field.
   */
  public java.math.BigDecimal getAnzahlMonatlicheNebenmahlzeiten() {
    return anzahlMonatlicheNebenmahlzeiten;
  }


  /**
   * Sets the value of the 'anzahlMonatlicheNebenmahlzeiten' field.
   * @param value the value to set.
   */
  public void setAnzahlMonatlicheNebenmahlzeiten(java.math.BigDecimal value) {
    this.anzahlMonatlicheNebenmahlzeiten = value;
  }

  /**
   * Gets the value of the 'tarifProHauptmahlzeiten' field.
   * @return The value of the 'tarifProHauptmahlzeiten' field.
   */
  public java.math.BigDecimal getTarifProHauptmahlzeiten() {
    return tarifProHauptmahlzeiten;
  }


  /**
   * Sets the value of the 'tarifProHauptmahlzeiten' field.
   * @param value the value to set.
   */
  public void setTarifProHauptmahlzeiten(java.math.BigDecimal value) {
    this.tarifProHauptmahlzeiten = value;
  }

  /**
   * Gets the value of the 'tarifProNebenmahlzeiten' field.
   * @return The value of the 'tarifProNebenmahlzeiten' field.
   */
  public java.math.BigDecimal getTarifProNebenmahlzeiten() {
    return tarifProNebenmahlzeiten;
  }


  /**
   * Sets the value of the 'tarifProNebenmahlzeiten' field.
   * @param value the value to set.
   */
  public void setTarifProNebenmahlzeiten(java.math.BigDecimal value) {
    this.tarifProNebenmahlzeiten = value;
  }

  /**
   * Creates a new ZeitabschnittDTO RecordBuilder.
   * @return A new ZeitabschnittDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder newBuilder() {
    return new ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder();
  }

  /**
   * Creates a new ZeitabschnittDTO RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ZeitabschnittDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder newBuilder(ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder other) {
    if (other == null) {
      return new ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder();
    } else {
      return new ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder(other);
    }
  }

  /**
   * Creates a new ZeitabschnittDTO RecordBuilder by copying an existing ZeitabschnittDTO instance.
   * @param other The existing instance to copy.
   * @return A new ZeitabschnittDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder newBuilder(ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO other) {
    if (other == null) {
      return new ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder();
    } else {
      return new ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder(other);
    }
  }

  /**
   * RecordBuilder for ZeitabschnittDTO instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ZeitabschnittDTO>
    implements org.apache.avro.data.RecordBuilder<ZeitabschnittDTO> {

    private java.math.BigDecimal betreuungskosten;
    private java.math.BigDecimal betreuungspensum;
    private java.time.LocalDate von;
    private java.time.LocalDate bis;
    private ch.dvbern.kibon.exchange.commons.types.Zeiteinheit pensumUnit;
    private java.math.BigDecimal anzahlMonatlicheHauptmahlzeiten;
    private java.math.BigDecimal anzahlMonatlicheNebenmahlzeiten;
    private java.math.BigDecimal tarifProHauptmahlzeiten;
    private java.math.BigDecimal tarifProNebenmahlzeiten;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.betreuungskosten)) {
        this.betreuungskosten = data().deepCopy(fields()[0].schema(), other.betreuungskosten);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.betreuungspensum)) {
        this.betreuungspensum = data().deepCopy(fields()[1].schema(), other.betreuungspensum);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.von)) {
        this.von = data().deepCopy(fields()[2].schema(), other.von);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.bis)) {
        this.bis = data().deepCopy(fields()[3].schema(), other.bis);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.pensumUnit)) {
        this.pensumUnit = data().deepCopy(fields()[4].schema(), other.pensumUnit);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.anzahlMonatlicheHauptmahlzeiten)) {
        this.anzahlMonatlicheHauptmahlzeiten = data().deepCopy(fields()[5].schema(), other.anzahlMonatlicheHauptmahlzeiten);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.anzahlMonatlicheNebenmahlzeiten)) {
        this.anzahlMonatlicheNebenmahlzeiten = data().deepCopy(fields()[6].schema(), other.anzahlMonatlicheNebenmahlzeiten);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.tarifProHauptmahlzeiten)) {
        this.tarifProHauptmahlzeiten = data().deepCopy(fields()[7].schema(), other.tarifProHauptmahlzeiten);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.tarifProNebenmahlzeiten)) {
        this.tarifProNebenmahlzeiten = data().deepCopy(fields()[8].schema(), other.tarifProNebenmahlzeiten);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
    }

    /**
     * Creates a Builder by copying an existing ZeitabschnittDTO instance
     * @param other The existing instance to copy.
     */
    private Builder(ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.betreuungskosten)) {
        this.betreuungskosten = data().deepCopy(fields()[0].schema(), other.betreuungskosten);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.betreuungspensum)) {
        this.betreuungspensum = data().deepCopy(fields()[1].schema(), other.betreuungspensum);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.von)) {
        this.von = data().deepCopy(fields()[2].schema(), other.von);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.bis)) {
        this.bis = data().deepCopy(fields()[3].schema(), other.bis);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.pensumUnit)) {
        this.pensumUnit = data().deepCopy(fields()[4].schema(), other.pensumUnit);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.anzahlMonatlicheHauptmahlzeiten)) {
        this.anzahlMonatlicheHauptmahlzeiten = data().deepCopy(fields()[5].schema(), other.anzahlMonatlicheHauptmahlzeiten);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.anzahlMonatlicheNebenmahlzeiten)) {
        this.anzahlMonatlicheNebenmahlzeiten = data().deepCopy(fields()[6].schema(), other.anzahlMonatlicheNebenmahlzeiten);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.tarifProHauptmahlzeiten)) {
        this.tarifProHauptmahlzeiten = data().deepCopy(fields()[7].schema(), other.tarifProHauptmahlzeiten);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.tarifProNebenmahlzeiten)) {
        this.tarifProNebenmahlzeiten = data().deepCopy(fields()[8].schema(), other.tarifProNebenmahlzeiten);
        fieldSetFlags()[8] = true;
      }
    }

    /**
      * Gets the value of the 'betreuungskosten' field.
      * @return The value.
      */
    public java.math.BigDecimal getBetreuungskosten() {
      return betreuungskosten;
    }


    /**
      * Sets the value of the 'betreuungskosten' field.
      * @param value The value of 'betreuungskosten'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder setBetreuungskosten(java.math.BigDecimal value) {
      validate(fields()[0], value);
      this.betreuungskosten = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'betreuungskosten' field has been set.
      * @return True if the 'betreuungskosten' field has been set, false otherwise.
      */
    public boolean hasBetreuungskosten() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'betreuungskosten' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder clearBetreuungskosten() {
      betreuungskosten = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'betreuungspensum' field.
      * @return The value.
      */
    public java.math.BigDecimal getBetreuungspensum() {
      return betreuungspensum;
    }


    /**
      * Sets the value of the 'betreuungspensum' field.
      * @param value The value of 'betreuungspensum'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder setBetreuungspensum(java.math.BigDecimal value) {
      validate(fields()[1], value);
      this.betreuungspensum = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'betreuungspensum' field has been set.
      * @return True if the 'betreuungspensum' field has been set, false otherwise.
      */
    public boolean hasBetreuungspensum() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'betreuungspensum' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder clearBetreuungspensum() {
      betreuungspensum = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'von' field.
      * @return The value.
      */
    public java.time.LocalDate getVon() {
      return von;
    }


    /**
      * Sets the value of the 'von' field.
      * @param value The value of 'von'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder setVon(java.time.LocalDate value) {
      validate(fields()[2], value);
      this.von = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'von' field has been set.
      * @return True if the 'von' field has been set, false otherwise.
      */
    public boolean hasVon() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'von' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder clearVon() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'bis' field.
      * @return The value.
      */
    public java.time.LocalDate getBis() {
      return bis;
    }


    /**
      * Sets the value of the 'bis' field.
      * @param value The value of 'bis'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder setBis(java.time.LocalDate value) {
      validate(fields()[3], value);
      this.bis = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'bis' field has been set.
      * @return True if the 'bis' field has been set, false otherwise.
      */
    public boolean hasBis() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'bis' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder clearBis() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'pensumUnit' field.
      * @return The value.
      */
    public ch.dvbern.kibon.exchange.commons.types.Zeiteinheit getPensumUnit() {
      return pensumUnit;
    }


    /**
      * Sets the value of the 'pensumUnit' field.
      * @param value The value of 'pensumUnit'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder setPensumUnit(ch.dvbern.kibon.exchange.commons.types.Zeiteinheit value) {
      validate(fields()[4], value);
      this.pensumUnit = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'pensumUnit' field has been set.
      * @return True if the 'pensumUnit' field has been set, false otherwise.
      */
    public boolean hasPensumUnit() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'pensumUnit' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder clearPensumUnit() {
      pensumUnit = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'anzahlMonatlicheHauptmahlzeiten' field.
      * @return The value.
      */
    public java.math.BigDecimal getAnzahlMonatlicheHauptmahlzeiten() {
      return anzahlMonatlicheHauptmahlzeiten;
    }


    /**
      * Sets the value of the 'anzahlMonatlicheHauptmahlzeiten' field.
      * @param value The value of 'anzahlMonatlicheHauptmahlzeiten'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder setAnzahlMonatlicheHauptmahlzeiten(java.math.BigDecimal value) {
      validate(fields()[5], value);
      this.anzahlMonatlicheHauptmahlzeiten = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'anzahlMonatlicheHauptmahlzeiten' field has been set.
      * @return True if the 'anzahlMonatlicheHauptmahlzeiten' field has been set, false otherwise.
      */
    public boolean hasAnzahlMonatlicheHauptmahlzeiten() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'anzahlMonatlicheHauptmahlzeiten' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder clearAnzahlMonatlicheHauptmahlzeiten() {
      anzahlMonatlicheHauptmahlzeiten = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'anzahlMonatlicheNebenmahlzeiten' field.
      * @return The value.
      */
    public java.math.BigDecimal getAnzahlMonatlicheNebenmahlzeiten() {
      return anzahlMonatlicheNebenmahlzeiten;
    }


    /**
      * Sets the value of the 'anzahlMonatlicheNebenmahlzeiten' field.
      * @param value The value of 'anzahlMonatlicheNebenmahlzeiten'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder setAnzahlMonatlicheNebenmahlzeiten(java.math.BigDecimal value) {
      validate(fields()[6], value);
      this.anzahlMonatlicheNebenmahlzeiten = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'anzahlMonatlicheNebenmahlzeiten' field has been set.
      * @return True if the 'anzahlMonatlicheNebenmahlzeiten' field has been set, false otherwise.
      */
    public boolean hasAnzahlMonatlicheNebenmahlzeiten() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'anzahlMonatlicheNebenmahlzeiten' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder clearAnzahlMonatlicheNebenmahlzeiten() {
      anzahlMonatlicheNebenmahlzeiten = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'tarifProHauptmahlzeiten' field.
      * @return The value.
      */
    public java.math.BigDecimal getTarifProHauptmahlzeiten() {
      return tarifProHauptmahlzeiten;
    }


    /**
      * Sets the value of the 'tarifProHauptmahlzeiten' field.
      * @param value The value of 'tarifProHauptmahlzeiten'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder setTarifProHauptmahlzeiten(java.math.BigDecimal value) {
      validate(fields()[7], value);
      this.tarifProHauptmahlzeiten = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'tarifProHauptmahlzeiten' field has been set.
      * @return True if the 'tarifProHauptmahlzeiten' field has been set, false otherwise.
      */
    public boolean hasTarifProHauptmahlzeiten() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'tarifProHauptmahlzeiten' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder clearTarifProHauptmahlzeiten() {
      tarifProHauptmahlzeiten = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'tarifProNebenmahlzeiten' field.
      * @return The value.
      */
    public java.math.BigDecimal getTarifProNebenmahlzeiten() {
      return tarifProNebenmahlzeiten;
    }


    /**
      * Sets the value of the 'tarifProNebenmahlzeiten' field.
      * @param value The value of 'tarifProNebenmahlzeiten'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder setTarifProNebenmahlzeiten(java.math.BigDecimal value) {
      validate(fields()[8], value);
      this.tarifProNebenmahlzeiten = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'tarifProNebenmahlzeiten' field has been set.
      * @return True if the 'tarifProNebenmahlzeiten' field has been set, false otherwise.
      */
    public boolean hasTarifProNebenmahlzeiten() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'tarifProNebenmahlzeiten' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO.Builder clearTarifProNebenmahlzeiten() {
      tarifProNebenmahlzeiten = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ZeitabschnittDTO build() {
      try {
        ZeitabschnittDTO record = new ZeitabschnittDTO();
        record.betreuungskosten = fieldSetFlags()[0] ? this.betreuungskosten : (java.math.BigDecimal) defaultValue(fields()[0]);
        record.betreuungspensum = fieldSetFlags()[1] ? this.betreuungspensum : (java.math.BigDecimal) defaultValue(fields()[1]);
        record.von = fieldSetFlags()[2] ? this.von : (java.time.LocalDate) defaultValue(fields()[2]);
        record.bis = fieldSetFlags()[3] ? this.bis : (java.time.LocalDate) defaultValue(fields()[3]);
        record.pensumUnit = fieldSetFlags()[4] ? this.pensumUnit : (ch.dvbern.kibon.exchange.commons.types.Zeiteinheit) defaultValue(fields()[4]);
        record.anzahlMonatlicheHauptmahlzeiten = fieldSetFlags()[5] ? this.anzahlMonatlicheHauptmahlzeiten : (java.math.BigDecimal) defaultValue(fields()[5]);
        record.anzahlMonatlicheNebenmahlzeiten = fieldSetFlags()[6] ? this.anzahlMonatlicheNebenmahlzeiten : (java.math.BigDecimal) defaultValue(fields()[6]);
        record.tarifProHauptmahlzeiten = fieldSetFlags()[7] ? this.tarifProHauptmahlzeiten : (java.math.BigDecimal) defaultValue(fields()[7]);
        record.tarifProNebenmahlzeiten = fieldSetFlags()[8] ? this.tarifProNebenmahlzeiten : (java.math.BigDecimal) defaultValue(fields()[8]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ZeitabschnittDTO>
    WRITER$ = (org.apache.avro.io.DatumWriter<ZeitabschnittDTO>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ZeitabschnittDTO>
    READER$ = (org.apache.avro.io.DatumReader<ZeitabschnittDTO>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










