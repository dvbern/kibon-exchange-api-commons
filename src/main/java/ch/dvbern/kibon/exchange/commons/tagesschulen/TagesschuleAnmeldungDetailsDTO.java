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
public class TagesschuleAnmeldungDetailsDTO extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8101205044094194783L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TagesschuleAnmeldungDetailsDTO\",\"namespace\":\"ch.dvbern.kibon.exchange.commons.tagesschulen\",\"fields\":[{\"name\":\"refnr\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"eintrittsdatum\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"planKlasse\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"abholung\",\"type\":{\"type\":\"enum\",\"name\":\"AbholungTagesschule\",\"symbols\":[\"ABHOLUNG\",\"ALLEINE_NACH_HAUSE\"]}},{\"name\":\"abweichungZweitesSemester\",\"type\":\"boolean\"},{\"name\":\"bemerkung\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"modulSelection\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ModulAuswahlDTO\",\"fields\":[{\"name\":\"modulId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"weekday\",\"type\":\"int\"},{\"name\":\"intervall\",\"type\":{\"type\":\"enum\",\"name\":\"Intervall\",\"namespace\":\"ch.dvbern.kibon.exchange.commons.types\",\"symbols\":[\"WOECHENTLICH\",\"ALLE_ZWEI_WOCHEN\"]}}]},\"java-class\":\"java.util.List\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
  }

  private static final BinaryMessageEncoder<TagesschuleAnmeldungDetailsDTO> ENCODER =
      new BinaryMessageEncoder<TagesschuleAnmeldungDetailsDTO>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TagesschuleAnmeldungDetailsDTO> DECODER =
      new BinaryMessageDecoder<TagesschuleAnmeldungDetailsDTO>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TagesschuleAnmeldungDetailsDTO> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TagesschuleAnmeldungDetailsDTO> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TagesschuleAnmeldungDetailsDTO> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TagesschuleAnmeldungDetailsDTO>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TagesschuleAnmeldungDetailsDTO to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TagesschuleAnmeldungDetailsDTO from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TagesschuleAnmeldungDetailsDTO instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TagesschuleAnmeldungDetailsDTO fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String refnr;
   private java.time.LocalDate eintrittsdatum;
   private java.lang.String planKlasse;
   private ch.dvbern.kibon.exchange.commons.tagesschulen.AbholungTagesschule abholung;
   private boolean abweichungZweitesSemester;
   private java.lang.String bemerkung;
   private java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.ModulAuswahlDTO> modulSelection;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TagesschuleAnmeldungDetailsDTO() {}

  /**
   * All-args constructor.
   * @param refnr The new value for refnr
   * @param eintrittsdatum The new value for eintrittsdatum
   * @param planKlasse The new value for planKlasse
   * @param abholung The new value for abholung
   * @param abweichungZweitesSemester The new value for abweichungZweitesSemester
   * @param bemerkung The new value for bemerkung
   * @param modulSelection The new value for modulSelection
   */
  public TagesschuleAnmeldungDetailsDTO(java.lang.String refnr, java.time.LocalDate eintrittsdatum, java.lang.String planKlasse, ch.dvbern.kibon.exchange.commons.tagesschulen.AbholungTagesschule abholung, java.lang.Boolean abweichungZweitesSemester, java.lang.String bemerkung, java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.ModulAuswahlDTO> modulSelection) {
    this.refnr = refnr;
    this.eintrittsdatum = eintrittsdatum;
    this.planKlasse = planKlasse;
    this.abholung = abholung;
    this.abweichungZweitesSemester = abweichungZweitesSemester;
    this.bemerkung = bemerkung;
    this.modulSelection = modulSelection;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return refnr;
    case 1: return eintrittsdatum;
    case 2: return planKlasse;
    case 3: return abholung;
    case 4: return abweichungZweitesSemester;
    case 5: return bemerkung;
    case 6: return modulSelection;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
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
    case 0: refnr = value$ != null ? value$.toString() : null; break;
    case 1: eintrittsdatum = (java.time.LocalDate)value$; break;
    case 2: planKlasse = value$ != null ? value$.toString() : null; break;
    case 3: abholung = (ch.dvbern.kibon.exchange.commons.tagesschulen.AbholungTagesschule)value$; break;
    case 4: abweichungZweitesSemester = (java.lang.Boolean)value$; break;
    case 5: bemerkung = value$ != null ? value$.toString() : null; break;
    case 6: modulSelection = (java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.ModulAuswahlDTO>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'refnr' field.
   * @return The value of the 'refnr' field.
   */
  public java.lang.String getRefnr() {
    return refnr;
  }


  /**
   * Sets the value of the 'refnr' field.
   * @param value the value to set.
   */
  public void setRefnr(java.lang.String value) {
    this.refnr = value;
  }

  /**
   * Gets the value of the 'eintrittsdatum' field.
   * @return The value of the 'eintrittsdatum' field.
   */
  public java.time.LocalDate getEintrittsdatum() {
    return eintrittsdatum;
  }


  /**
   * Sets the value of the 'eintrittsdatum' field.
   * @param value the value to set.
   */
  public void setEintrittsdatum(java.time.LocalDate value) {
    this.eintrittsdatum = value;
  }

  /**
   * Gets the value of the 'planKlasse' field.
   * @return The value of the 'planKlasse' field.
   */
  public java.lang.String getPlanKlasse() {
    return planKlasse;
  }


  /**
   * Sets the value of the 'planKlasse' field.
   * @param value the value to set.
   */
  public void setPlanKlasse(java.lang.String value) {
    this.planKlasse = value;
  }

  /**
   * Gets the value of the 'abholung' field.
   * @return The value of the 'abholung' field.
   */
  public ch.dvbern.kibon.exchange.commons.tagesschulen.AbholungTagesschule getAbholung() {
    return abholung;
  }


  /**
   * Sets the value of the 'abholung' field.
   * @param value the value to set.
   */
  public void setAbholung(ch.dvbern.kibon.exchange.commons.tagesschulen.AbholungTagesschule value) {
    this.abholung = value;
  }

  /**
   * Gets the value of the 'abweichungZweitesSemester' field.
   * @return The value of the 'abweichungZweitesSemester' field.
   */
  public boolean getAbweichungZweitesSemester() {
    return abweichungZweitesSemester;
  }


  /**
   * Sets the value of the 'abweichungZweitesSemester' field.
   * @param value the value to set.
   */
  public void setAbweichungZweitesSemester(boolean value) {
    this.abweichungZweitesSemester = value;
  }

  /**
   * Gets the value of the 'bemerkung' field.
   * @return The value of the 'bemerkung' field.
   */
  public java.lang.String getBemerkung() {
    return bemerkung;
  }


  /**
   * Sets the value of the 'bemerkung' field.
   * @param value the value to set.
   */
  public void setBemerkung(java.lang.String value) {
    this.bemerkung = value;
  }

  /**
   * Gets the value of the 'modulSelection' field.
   * @return The value of the 'modulSelection' field.
   */
  public java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.ModulAuswahlDTO> getModulSelection() {
    return modulSelection;
  }


  /**
   * Sets the value of the 'modulSelection' field.
   * @param value the value to set.
   */
  public void setModulSelection(java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.ModulAuswahlDTO> value) {
    this.modulSelection = value;
  }

  /**
   * Creates a new TagesschuleAnmeldungDetailsDTO RecordBuilder.
   * @return A new TagesschuleAnmeldungDetailsDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder newBuilder() {
    return new ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder();
  }

  /**
   * Creates a new TagesschuleAnmeldungDetailsDTO RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TagesschuleAnmeldungDetailsDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder newBuilder(ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder other) {
    if (other == null) {
      return new ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder();
    } else {
      return new ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder(other);
    }
  }

  /**
   * Creates a new TagesschuleAnmeldungDetailsDTO RecordBuilder by copying an existing TagesschuleAnmeldungDetailsDTO instance.
   * @param other The existing instance to copy.
   * @return A new TagesschuleAnmeldungDetailsDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder newBuilder(ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO other) {
    if (other == null) {
      return new ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder();
    } else {
      return new ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder(other);
    }
  }

  /**
   * RecordBuilder for TagesschuleAnmeldungDetailsDTO instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TagesschuleAnmeldungDetailsDTO>
    implements org.apache.avro.data.RecordBuilder<TagesschuleAnmeldungDetailsDTO> {

    private java.lang.String refnr;
    private java.time.LocalDate eintrittsdatum;
    private java.lang.String planKlasse;
    private ch.dvbern.kibon.exchange.commons.tagesschulen.AbholungTagesschule abholung;
    private boolean abweichungZweitesSemester;
    private java.lang.String bemerkung;
    private java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.ModulAuswahlDTO> modulSelection;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.refnr)) {
        this.refnr = data().deepCopy(fields()[0].schema(), other.refnr);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.eintrittsdatum)) {
        this.eintrittsdatum = data().deepCopy(fields()[1].schema(), other.eintrittsdatum);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.planKlasse)) {
        this.planKlasse = data().deepCopy(fields()[2].schema(), other.planKlasse);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.abholung)) {
        this.abholung = data().deepCopy(fields()[3].schema(), other.abholung);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.abweichungZweitesSemester)) {
        this.abweichungZweitesSemester = data().deepCopy(fields()[4].schema(), other.abweichungZweitesSemester);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.bemerkung)) {
        this.bemerkung = data().deepCopy(fields()[5].schema(), other.bemerkung);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.modulSelection)) {
        this.modulSelection = data().deepCopy(fields()[6].schema(), other.modulSelection);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing TagesschuleAnmeldungDetailsDTO instance
     * @param other The existing instance to copy.
     */
    private Builder(ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.refnr)) {
        this.refnr = data().deepCopy(fields()[0].schema(), other.refnr);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.eintrittsdatum)) {
        this.eintrittsdatum = data().deepCopy(fields()[1].schema(), other.eintrittsdatum);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.planKlasse)) {
        this.planKlasse = data().deepCopy(fields()[2].schema(), other.planKlasse);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.abholung)) {
        this.abholung = data().deepCopy(fields()[3].schema(), other.abholung);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.abweichungZweitesSemester)) {
        this.abweichungZweitesSemester = data().deepCopy(fields()[4].schema(), other.abweichungZweitesSemester);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.bemerkung)) {
        this.bemerkung = data().deepCopy(fields()[5].schema(), other.bemerkung);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.modulSelection)) {
        this.modulSelection = data().deepCopy(fields()[6].schema(), other.modulSelection);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'refnr' field.
      * @return The value.
      */
    public java.lang.String getRefnr() {
      return refnr;
    }


    /**
      * Sets the value of the 'refnr' field.
      * @param value The value of 'refnr'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder setRefnr(java.lang.String value) {
      validate(fields()[0], value);
      this.refnr = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'refnr' field has been set.
      * @return True if the 'refnr' field has been set, false otherwise.
      */
    public boolean hasRefnr() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'refnr' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder clearRefnr() {
      refnr = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'eintrittsdatum' field.
      * @return The value.
      */
    public java.time.LocalDate getEintrittsdatum() {
      return eintrittsdatum;
    }


    /**
      * Sets the value of the 'eintrittsdatum' field.
      * @param value The value of 'eintrittsdatum'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder setEintrittsdatum(java.time.LocalDate value) {
      validate(fields()[1], value);
      this.eintrittsdatum = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'eintrittsdatum' field has been set.
      * @return True if the 'eintrittsdatum' field has been set, false otherwise.
      */
    public boolean hasEintrittsdatum() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'eintrittsdatum' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder clearEintrittsdatum() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'planKlasse' field.
      * @return The value.
      */
    public java.lang.String getPlanKlasse() {
      return planKlasse;
    }


    /**
      * Sets the value of the 'planKlasse' field.
      * @param value The value of 'planKlasse'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder setPlanKlasse(java.lang.String value) {
      validate(fields()[2], value);
      this.planKlasse = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'planKlasse' field has been set.
      * @return True if the 'planKlasse' field has been set, false otherwise.
      */
    public boolean hasPlanKlasse() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'planKlasse' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder clearPlanKlasse() {
      planKlasse = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'abholung' field.
      * @return The value.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.AbholungTagesschule getAbholung() {
      return abholung;
    }


    /**
      * Sets the value of the 'abholung' field.
      * @param value The value of 'abholung'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder setAbholung(ch.dvbern.kibon.exchange.commons.tagesschulen.AbholungTagesschule value) {
      validate(fields()[3], value);
      this.abholung = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'abholung' field has been set.
      * @return True if the 'abholung' field has been set, false otherwise.
      */
    public boolean hasAbholung() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'abholung' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder clearAbholung() {
      abholung = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'abweichungZweitesSemester' field.
      * @return The value.
      */
    public boolean getAbweichungZweitesSemester() {
      return abweichungZweitesSemester;
    }


    /**
      * Sets the value of the 'abweichungZweitesSemester' field.
      * @param value The value of 'abweichungZweitesSemester'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder setAbweichungZweitesSemester(boolean value) {
      validate(fields()[4], value);
      this.abweichungZweitesSemester = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'abweichungZweitesSemester' field has been set.
      * @return True if the 'abweichungZweitesSemester' field has been set, false otherwise.
      */
    public boolean hasAbweichungZweitesSemester() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'abweichungZweitesSemester' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder clearAbweichungZweitesSemester() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'bemerkung' field.
      * @return The value.
      */
    public java.lang.String getBemerkung() {
      return bemerkung;
    }


    /**
      * Sets the value of the 'bemerkung' field.
      * @param value The value of 'bemerkung'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder setBemerkung(java.lang.String value) {
      validate(fields()[5], value);
      this.bemerkung = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'bemerkung' field has been set.
      * @return True if the 'bemerkung' field has been set, false otherwise.
      */
    public boolean hasBemerkung() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'bemerkung' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder clearBemerkung() {
      bemerkung = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'modulSelection' field.
      * @return The value.
      */
    public java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.ModulAuswahlDTO> getModulSelection() {
      return modulSelection;
    }


    /**
      * Sets the value of the 'modulSelection' field.
      * @param value The value of 'modulSelection'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder setModulSelection(java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.ModulAuswahlDTO> value) {
      validate(fields()[6], value);
      this.modulSelection = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'modulSelection' field has been set.
      * @return True if the 'modulSelection' field has been set, false otherwise.
      */
    public boolean hasModulSelection() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'modulSelection' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.tagesschulen.TagesschuleAnmeldungDetailsDTO.Builder clearModulSelection() {
      modulSelection = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TagesschuleAnmeldungDetailsDTO build() {
      try {
        TagesschuleAnmeldungDetailsDTO record = new TagesschuleAnmeldungDetailsDTO();
        record.refnr = fieldSetFlags()[0] ? this.refnr : (java.lang.String) defaultValue(fields()[0]);
        record.eintrittsdatum = fieldSetFlags()[1] ? this.eintrittsdatum : (java.time.LocalDate) defaultValue(fields()[1]);
        record.planKlasse = fieldSetFlags()[2] ? this.planKlasse : (java.lang.String) defaultValue(fields()[2]);
        record.abholung = fieldSetFlags()[3] ? this.abholung : (ch.dvbern.kibon.exchange.commons.tagesschulen.AbholungTagesschule) defaultValue(fields()[3]);
        record.abweichungZweitesSemester = fieldSetFlags()[4] ? this.abweichungZweitesSemester : (java.lang.Boolean) defaultValue(fields()[4]);
        record.bemerkung = fieldSetFlags()[5] ? this.bemerkung : (java.lang.String) defaultValue(fields()[5]);
        record.modulSelection = fieldSetFlags()[6] ? this.modulSelection : (java.util.List<ch.dvbern.kibon.exchange.commons.tagesschulen.ModulAuswahlDTO>) defaultValue(fields()[6]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TagesschuleAnmeldungDetailsDTO>
    WRITER$ = (org.apache.avro.io.DatumWriter<TagesschuleAnmeldungDetailsDTO>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TagesschuleAnmeldungDetailsDTO>
    READER$ = (org.apache.avro.io.DatumReader<TagesschuleAnmeldungDetailsDTO>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










