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
public class BetreuungEventDTO extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 548881308624372089L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BetreuungEventDTO\",\"namespace\":\"ch.dvbern.kibon.exchange.commons.platzbestaetigung\",\"fields\":[{\"name\":\"institutionId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"refnr\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"zeitabschnitte\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ZeitabschnittDTO\",\"fields\":[{\"name\":\"betreuungskosten\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2}},{\"name\":\"betreuungspensum\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2}},{\"name\":\"von\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"bis\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"pensumUnit\",\"type\":{\"type\":\"enum\",\"name\":\"Zeiteinheit\",\"namespace\":\"ch.dvbern.kibon.exchange.commons.types\",\"symbols\":[\"DAYS\",\"HOURS\",\"PERCENTAGE\"]}},{\"name\":\"anzahlHauptmahlzeiten\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2}],\"default\":null},{\"name\":\"anzahlNebenmahlzeiten\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2}],\"default\":null},{\"name\":\"tarifProHauptmahlzeiten\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2}],\"default\":null},{\"name\":\"tarifProNebenmahlzeiten\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2}],\"default\":null}]}},\"default\":[]},{\"name\":\"gemeindeBfsNr\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"gemeindeName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ausserordentlicherBetreuungsaufwand\",\"type\":\"boolean\",\"default\":false}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<BetreuungEventDTO> ENCODER =
      new BinaryMessageEncoder<BetreuungEventDTO>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<BetreuungEventDTO> DECODER =
      new BinaryMessageDecoder<BetreuungEventDTO>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<BetreuungEventDTO> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<BetreuungEventDTO> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<BetreuungEventDTO> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<BetreuungEventDTO>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this BetreuungEventDTO to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a BetreuungEventDTO from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a BetreuungEventDTO instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static BetreuungEventDTO fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String institutionId;
   private java.lang.String refnr;
   private java.util.List<ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO> zeitabschnitte;
   private java.lang.Long gemeindeBfsNr;
   private java.lang.String gemeindeName;
   private boolean ausserordentlicherBetreuungsaufwand;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BetreuungEventDTO() {}

  /**
   * All-args constructor.
   * @param institutionId The new value for institutionId
   * @param refnr The new value for refnr
   * @param zeitabschnitte The new value for zeitabschnitte
   * @param gemeindeBfsNr The new value for gemeindeBfsNr
   * @param gemeindeName The new value for gemeindeName
   * @param ausserordentlicherBetreuungsaufwand The new value for ausserordentlicherBetreuungsaufwand
   */
  public BetreuungEventDTO(java.lang.String institutionId, java.lang.String refnr, java.util.List<ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO> zeitabschnitte, java.lang.Long gemeindeBfsNr, java.lang.String gemeindeName, java.lang.Boolean ausserordentlicherBetreuungsaufwand) {
    this.institutionId = institutionId;
    this.refnr = refnr;
    this.zeitabschnitte = zeitabschnitte;
    this.gemeindeBfsNr = gemeindeBfsNr;
    this.gemeindeName = gemeindeName;
    this.ausserordentlicherBetreuungsaufwand = ausserordentlicherBetreuungsaufwand;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return institutionId;
    case 1: return refnr;
    case 2: return zeitabschnitte;
    case 3: return gemeindeBfsNr;
    case 4: return gemeindeName;
    case 5: return ausserordentlicherBetreuungsaufwand;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: institutionId = value$ != null ? value$.toString() : null; break;
    case 1: refnr = value$ != null ? value$.toString() : null; break;
    case 2: zeitabschnitte = (java.util.List<ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO>)value$; break;
    case 3: gemeindeBfsNr = (java.lang.Long)value$; break;
    case 4: gemeindeName = value$ != null ? value$.toString() : null; break;
    case 5: ausserordentlicherBetreuungsaufwand = (java.lang.Boolean)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'institutionId' field.
   * @return The value of the 'institutionId' field.
   */
  public java.lang.String getInstitutionId() {
    return institutionId;
  }


  /**
   * Sets the value of the 'institutionId' field.
   * @param value the value to set.
   */
  public void setInstitutionId(java.lang.String value) {
    this.institutionId = value;
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
   * Gets the value of the 'zeitabschnitte' field.
   * @return The value of the 'zeitabschnitte' field.
   */
  public java.util.List<ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO> getZeitabschnitte() {
    return zeitabschnitte;
  }


  /**
   * Sets the value of the 'zeitabschnitte' field.
   * @param value the value to set.
   */
  public void setZeitabschnitte(java.util.List<ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO> value) {
    this.zeitabschnitte = value;
  }

  /**
   * Gets the value of the 'gemeindeBfsNr' field.
   * @return The value of the 'gemeindeBfsNr' field.
   */
  public java.lang.Long getGemeindeBfsNr() {
    return gemeindeBfsNr;
  }


  /**
   * Sets the value of the 'gemeindeBfsNr' field.
   * @param value the value to set.
   */
  public void setGemeindeBfsNr(java.lang.Long value) {
    this.gemeindeBfsNr = value;
  }

  /**
   * Gets the value of the 'gemeindeName' field.
   * @return The value of the 'gemeindeName' field.
   */
  public java.lang.String getGemeindeName() {
    return gemeindeName;
  }


  /**
   * Sets the value of the 'gemeindeName' field.
   * @param value the value to set.
   */
  public void setGemeindeName(java.lang.String value) {
    this.gemeindeName = value;
  }

  /**
   * Gets the value of the 'ausserordentlicherBetreuungsaufwand' field.
   * @return The value of the 'ausserordentlicherBetreuungsaufwand' field.
   */
  public boolean getAusserordentlicherBetreuungsaufwand() {
    return ausserordentlicherBetreuungsaufwand;
  }


  /**
   * Sets the value of the 'ausserordentlicherBetreuungsaufwand' field.
   * @param value the value to set.
   */
  public void setAusserordentlicherBetreuungsaufwand(boolean value) {
    this.ausserordentlicherBetreuungsaufwand = value;
  }

  /**
   * Creates a new BetreuungEventDTO RecordBuilder.
   * @return A new BetreuungEventDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder newBuilder() {
    return new ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder();
  }

  /**
   * Creates a new BetreuungEventDTO RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BetreuungEventDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder newBuilder(ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder other) {
    if (other == null) {
      return new ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder();
    } else {
      return new ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder(other);
    }
  }

  /**
   * Creates a new BetreuungEventDTO RecordBuilder by copying an existing BetreuungEventDTO instance.
   * @param other The existing instance to copy.
   * @return A new BetreuungEventDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder newBuilder(ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO other) {
    if (other == null) {
      return new ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder();
    } else {
      return new ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder(other);
    }
  }

  /**
   * RecordBuilder for BetreuungEventDTO instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BetreuungEventDTO>
    implements org.apache.avro.data.RecordBuilder<BetreuungEventDTO> {

    private java.lang.String institutionId;
    private java.lang.String refnr;
    private java.util.List<ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO> zeitabschnitte;
    private java.lang.Long gemeindeBfsNr;
    private java.lang.String gemeindeName;
    private boolean ausserordentlicherBetreuungsaufwand;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.institutionId)) {
        this.institutionId = data().deepCopy(fields()[0].schema(), other.institutionId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.refnr)) {
        this.refnr = data().deepCopy(fields()[1].schema(), other.refnr);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.zeitabschnitte)) {
        this.zeitabschnitte = data().deepCopy(fields()[2].schema(), other.zeitabschnitte);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.gemeindeBfsNr)) {
        this.gemeindeBfsNr = data().deepCopy(fields()[3].schema(), other.gemeindeBfsNr);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.gemeindeName)) {
        this.gemeindeName = data().deepCopy(fields()[4].schema(), other.gemeindeName);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.ausserordentlicherBetreuungsaufwand)) {
        this.ausserordentlicherBetreuungsaufwand = data().deepCopy(fields()[5].schema(), other.ausserordentlicherBetreuungsaufwand);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing BetreuungEventDTO instance
     * @param other The existing instance to copy.
     */
    private Builder(ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.institutionId)) {
        this.institutionId = data().deepCopy(fields()[0].schema(), other.institutionId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.refnr)) {
        this.refnr = data().deepCopy(fields()[1].schema(), other.refnr);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.zeitabschnitte)) {
        this.zeitabschnitte = data().deepCopy(fields()[2].schema(), other.zeitabschnitte);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.gemeindeBfsNr)) {
        this.gemeindeBfsNr = data().deepCopy(fields()[3].schema(), other.gemeindeBfsNr);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.gemeindeName)) {
        this.gemeindeName = data().deepCopy(fields()[4].schema(), other.gemeindeName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.ausserordentlicherBetreuungsaufwand)) {
        this.ausserordentlicherBetreuungsaufwand = data().deepCopy(fields()[5].schema(), other.ausserordentlicherBetreuungsaufwand);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'institutionId' field.
      * @return The value.
      */
    public java.lang.String getInstitutionId() {
      return institutionId;
    }


    /**
      * Sets the value of the 'institutionId' field.
      * @param value The value of 'institutionId'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder setInstitutionId(java.lang.String value) {
      validate(fields()[0], value);
      this.institutionId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'institutionId' field has been set.
      * @return True if the 'institutionId' field has been set, false otherwise.
      */
    public boolean hasInstitutionId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'institutionId' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder clearInstitutionId() {
      institutionId = null;
      fieldSetFlags()[0] = false;
      return this;
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
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder setRefnr(java.lang.String value) {
      validate(fields()[1], value);
      this.refnr = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'refnr' field has been set.
      * @return True if the 'refnr' field has been set, false otherwise.
      */
    public boolean hasRefnr() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'refnr' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder clearRefnr() {
      refnr = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'zeitabschnitte' field.
      * @return The value.
      */
    public java.util.List<ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO> getZeitabschnitte() {
      return zeitabschnitte;
    }


    /**
      * Sets the value of the 'zeitabschnitte' field.
      * @param value The value of 'zeitabschnitte'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder setZeitabschnitte(java.util.List<ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO> value) {
      validate(fields()[2], value);
      this.zeitabschnitte = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'zeitabschnitte' field has been set.
      * @return True if the 'zeitabschnitte' field has been set, false otherwise.
      */
    public boolean hasZeitabschnitte() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'zeitabschnitte' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder clearZeitabschnitte() {
      zeitabschnitte = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'gemeindeBfsNr' field.
      * @return The value.
      */
    public java.lang.Long getGemeindeBfsNr() {
      return gemeindeBfsNr;
    }


    /**
      * Sets the value of the 'gemeindeBfsNr' field.
      * @param value The value of 'gemeindeBfsNr'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder setGemeindeBfsNr(java.lang.Long value) {
      validate(fields()[3], value);
      this.gemeindeBfsNr = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'gemeindeBfsNr' field has been set.
      * @return True if the 'gemeindeBfsNr' field has been set, false otherwise.
      */
    public boolean hasGemeindeBfsNr() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'gemeindeBfsNr' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder clearGemeindeBfsNr() {
      gemeindeBfsNr = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'gemeindeName' field.
      * @return The value.
      */
    public java.lang.String getGemeindeName() {
      return gemeindeName;
    }


    /**
      * Sets the value of the 'gemeindeName' field.
      * @param value The value of 'gemeindeName'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder setGemeindeName(java.lang.String value) {
      validate(fields()[4], value);
      this.gemeindeName = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'gemeindeName' field has been set.
      * @return True if the 'gemeindeName' field has been set, false otherwise.
      */
    public boolean hasGemeindeName() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'gemeindeName' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder clearGemeindeName() {
      gemeindeName = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'ausserordentlicherBetreuungsaufwand' field.
      * @return The value.
      */
    public boolean getAusserordentlicherBetreuungsaufwand() {
      return ausserordentlicherBetreuungsaufwand;
    }


    /**
      * Sets the value of the 'ausserordentlicherBetreuungsaufwand' field.
      * @param value The value of 'ausserordentlicherBetreuungsaufwand'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder setAusserordentlicherBetreuungsaufwand(boolean value) {
      validate(fields()[5], value);
      this.ausserordentlicherBetreuungsaufwand = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'ausserordentlicherBetreuungsaufwand' field has been set.
      * @return True if the 'ausserordentlicherBetreuungsaufwand' field has been set, false otherwise.
      */
    public boolean hasAusserordentlicherBetreuungsaufwand() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'ausserordentlicherBetreuungsaufwand' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.platzbestaetigung.BetreuungEventDTO.Builder clearAusserordentlicherBetreuungsaufwand() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BetreuungEventDTO build() {
      try {
        BetreuungEventDTO record = new BetreuungEventDTO();
        record.institutionId = fieldSetFlags()[0] ? this.institutionId : (java.lang.String) defaultValue(fields()[0]);
        record.refnr = fieldSetFlags()[1] ? this.refnr : (java.lang.String) defaultValue(fields()[1]);
        record.zeitabschnitte = fieldSetFlags()[2] ? this.zeitabschnitte : (java.util.List<ch.dvbern.kibon.exchange.commons.platzbestaetigung.ZeitabschnittDTO>) defaultValue(fields()[2]);
        record.gemeindeBfsNr = fieldSetFlags()[3] ? this.gemeindeBfsNr : (java.lang.Long) defaultValue(fields()[3]);
        record.gemeindeName = fieldSetFlags()[4] ? this.gemeindeName : (java.lang.String) defaultValue(fields()[4]);
        record.ausserordentlicherBetreuungsaufwand = fieldSetFlags()[5] ? this.ausserordentlicherBetreuungsaufwand : (java.lang.Boolean) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<BetreuungEventDTO>
    WRITER$ = (org.apache.avro.io.DatumWriter<BetreuungEventDTO>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<BetreuungEventDTO>
    READER$ = (org.apache.avro.io.DatumReader<BetreuungEventDTO>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










