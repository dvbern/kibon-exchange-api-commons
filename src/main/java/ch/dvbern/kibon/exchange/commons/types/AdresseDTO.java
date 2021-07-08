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
public class AdresseDTO extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -159098809247417866L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AdresseDTO\",\"namespace\":\"ch.dvbern.kibon.exchange.commons.types\",\"fields\":[{\"name\":\"anschrift\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"strasse\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"hausnummer\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"adresszusatz\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"plz\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"ort\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"land\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"gemeinde\",\"type\":{\"type\":\"record\",\"name\":\"GemeindeDTO\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"bfsNummer\",\"type\":[\"null\",\"long\"],\"default\":null}]},\"default\":{\"name\":null,\"bfsNummer\":null}},{\"name\":\"email\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"telefon\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"webseite\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AdresseDTO> ENCODER =
      new BinaryMessageEncoder<AdresseDTO>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AdresseDTO> DECODER =
      new BinaryMessageDecoder<AdresseDTO>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<AdresseDTO> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<AdresseDTO> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<AdresseDTO> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AdresseDTO>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this AdresseDTO to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a AdresseDTO from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a AdresseDTO instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static AdresseDTO fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String anschrift;
   private java.lang.String strasse;
   private java.lang.String hausnummer;
   private java.lang.String adresszusatz;
   private java.lang.String plz;
   private java.lang.String ort;
   private java.lang.String land;
   private ch.dvbern.kibon.exchange.commons.types.GemeindeDTO gemeinde;
   private java.lang.String email;
   private java.lang.String telefon;
   private java.lang.String webseite;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AdresseDTO() {}

  /**
   * All-args constructor.
   * @param anschrift The new value for anschrift
   * @param strasse The new value for strasse
   * @param hausnummer The new value for hausnummer
   * @param adresszusatz The new value for adresszusatz
   * @param plz The new value for plz
   * @param ort The new value for ort
   * @param land The new value for land
   * @param gemeinde The new value for gemeinde
   * @param email The new value for email
   * @param telefon The new value for telefon
   * @param webseite The new value for webseite
   */
  public AdresseDTO(java.lang.String anschrift, java.lang.String strasse, java.lang.String hausnummer, java.lang.String adresszusatz, java.lang.String plz, java.lang.String ort, java.lang.String land, ch.dvbern.kibon.exchange.commons.types.GemeindeDTO gemeinde, java.lang.String email, java.lang.String telefon, java.lang.String webseite) {
    this.anschrift = anschrift;
    this.strasse = strasse;
    this.hausnummer = hausnummer;
    this.adresszusatz = adresszusatz;
    this.plz = plz;
    this.ort = ort;
    this.land = land;
    this.gemeinde = gemeinde;
    this.email = email;
    this.telefon = telefon;
    this.webseite = webseite;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return anschrift;
    case 1: return strasse;
    case 2: return hausnummer;
    case 3: return adresszusatz;
    case 4: return plz;
    case 5: return ort;
    case 6: return land;
    case 7: return gemeinde;
    case 8: return email;
    case 9: return telefon;
    case 10: return webseite;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: anschrift = value$ != null ? value$.toString() : null; break;
    case 1: strasse = value$ != null ? value$.toString() : null; break;
    case 2: hausnummer = value$ != null ? value$.toString() : null; break;
    case 3: adresszusatz = value$ != null ? value$.toString() : null; break;
    case 4: plz = value$ != null ? value$.toString() : null; break;
    case 5: ort = value$ != null ? value$.toString() : null; break;
    case 6: land = value$ != null ? value$.toString() : null; break;
    case 7: gemeinde = (ch.dvbern.kibon.exchange.commons.types.GemeindeDTO)value$; break;
    case 8: email = value$ != null ? value$.toString() : null; break;
    case 9: telefon = value$ != null ? value$.toString() : null; break;
    case 10: webseite = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'anschrift' field.
   * @return The value of the 'anschrift' field.
   */
  public java.lang.String getAnschrift() {
    return anschrift;
  }


  /**
   * Sets the value of the 'anschrift' field.
   * @param value the value to set.
   */
  public void setAnschrift(java.lang.String value) {
    this.anschrift = value;
  }

  /**
   * Gets the value of the 'strasse' field.
   * @return The value of the 'strasse' field.
   */
  public java.lang.String getStrasse() {
    return strasse;
  }


  /**
   * Sets the value of the 'strasse' field.
   * @param value the value to set.
   */
  public void setStrasse(java.lang.String value) {
    this.strasse = value;
  }

  /**
   * Gets the value of the 'hausnummer' field.
   * @return The value of the 'hausnummer' field.
   */
  public java.lang.String getHausnummer() {
    return hausnummer;
  }


  /**
   * Sets the value of the 'hausnummer' field.
   * @param value the value to set.
   */
  public void setHausnummer(java.lang.String value) {
    this.hausnummer = value;
  }

  /**
   * Gets the value of the 'adresszusatz' field.
   * @return The value of the 'adresszusatz' field.
   */
  public java.lang.String getAdresszusatz() {
    return adresszusatz;
  }


  /**
   * Sets the value of the 'adresszusatz' field.
   * @param value the value to set.
   */
  public void setAdresszusatz(java.lang.String value) {
    this.adresszusatz = value;
  }

  /**
   * Gets the value of the 'plz' field.
   * @return The value of the 'plz' field.
   */
  public java.lang.String getPlz() {
    return plz;
  }


  /**
   * Sets the value of the 'plz' field.
   * @param value the value to set.
   */
  public void setPlz(java.lang.String value) {
    this.plz = value;
  }

  /**
   * Gets the value of the 'ort' field.
   * @return The value of the 'ort' field.
   */
  public java.lang.String getOrt() {
    return ort;
  }


  /**
   * Sets the value of the 'ort' field.
   * @param value the value to set.
   */
  public void setOrt(java.lang.String value) {
    this.ort = value;
  }

  /**
   * Gets the value of the 'land' field.
   * @return The value of the 'land' field.
   */
  public java.lang.String getLand() {
    return land;
  }


  /**
   * Sets the value of the 'land' field.
   * @param value the value to set.
   */
  public void setLand(java.lang.String value) {
    this.land = value;
  }

  /**
   * Gets the value of the 'gemeinde' field.
   * @return The value of the 'gemeinde' field.
   */
  public ch.dvbern.kibon.exchange.commons.types.GemeindeDTO getGemeinde() {
    return gemeinde;
  }


  /**
   * Sets the value of the 'gemeinde' field.
   * @param value the value to set.
   */
  public void setGemeinde(ch.dvbern.kibon.exchange.commons.types.GemeindeDTO value) {
    this.gemeinde = value;
  }

  /**
   * Gets the value of the 'email' field.
   * @return The value of the 'email' field.
   */
  public java.lang.String getEmail() {
    return email;
  }


  /**
   * Sets the value of the 'email' field.
   * @param value the value to set.
   */
  public void setEmail(java.lang.String value) {
    this.email = value;
  }

  /**
   * Gets the value of the 'telefon' field.
   * @return The value of the 'telefon' field.
   */
  public java.lang.String getTelefon() {
    return telefon;
  }


  /**
   * Sets the value of the 'telefon' field.
   * @param value the value to set.
   */
  public void setTelefon(java.lang.String value) {
    this.telefon = value;
  }

  /**
   * Gets the value of the 'webseite' field.
   * @return The value of the 'webseite' field.
   */
  public java.lang.String getWebseite() {
    return webseite;
  }


  /**
   * Sets the value of the 'webseite' field.
   * @param value the value to set.
   */
  public void setWebseite(java.lang.String value) {
    this.webseite = value;
  }

  /**
   * Creates a new AdresseDTO RecordBuilder.
   * @return A new AdresseDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder newBuilder() {
    return new ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder();
  }

  /**
   * Creates a new AdresseDTO RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AdresseDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder newBuilder(ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder other) {
    if (other == null) {
      return new ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder();
    } else {
      return new ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder(other);
    }
  }

  /**
   * Creates a new AdresseDTO RecordBuilder by copying an existing AdresseDTO instance.
   * @param other The existing instance to copy.
   * @return A new AdresseDTO RecordBuilder
   */
  public static ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder newBuilder(ch.dvbern.kibon.exchange.commons.types.AdresseDTO other) {
    if (other == null) {
      return new ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder();
    } else {
      return new ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder(other);
    }
  }

  /**
   * RecordBuilder for AdresseDTO instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AdresseDTO>
    implements org.apache.avro.data.RecordBuilder<AdresseDTO> {

    private java.lang.String anschrift;
    private java.lang.String strasse;
    private java.lang.String hausnummer;
    private java.lang.String adresszusatz;
    private java.lang.String plz;
    private java.lang.String ort;
    private java.lang.String land;
    private ch.dvbern.kibon.exchange.commons.types.GemeindeDTO gemeinde;
    private ch.dvbern.kibon.exchange.commons.types.GemeindeDTO.Builder gemeindeBuilder;
    private java.lang.String email;
    private java.lang.String telefon;
    private java.lang.String webseite;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.anschrift)) {
        this.anschrift = data().deepCopy(fields()[0].schema(), other.anschrift);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.strasse)) {
        this.strasse = data().deepCopy(fields()[1].schema(), other.strasse);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.hausnummer)) {
        this.hausnummer = data().deepCopy(fields()[2].schema(), other.hausnummer);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.adresszusatz)) {
        this.adresszusatz = data().deepCopy(fields()[3].schema(), other.adresszusatz);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.plz)) {
        this.plz = data().deepCopy(fields()[4].schema(), other.plz);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.ort)) {
        this.ort = data().deepCopy(fields()[5].schema(), other.ort);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.land)) {
        this.land = data().deepCopy(fields()[6].schema(), other.land);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.gemeinde)) {
        this.gemeinde = data().deepCopy(fields()[7].schema(), other.gemeinde);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (other.hasGemeindeBuilder()) {
        this.gemeindeBuilder = ch.dvbern.kibon.exchange.commons.types.GemeindeDTO.newBuilder(other.getGemeindeBuilder());
      }
      if (isValidValue(fields()[8], other.email)) {
        this.email = data().deepCopy(fields()[8].schema(), other.email);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.telefon)) {
        this.telefon = data().deepCopy(fields()[9].schema(), other.telefon);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
      if (isValidValue(fields()[10], other.webseite)) {
        this.webseite = data().deepCopy(fields()[10].schema(), other.webseite);
        fieldSetFlags()[10] = other.fieldSetFlags()[10];
      }
    }

    /**
     * Creates a Builder by copying an existing AdresseDTO instance
     * @param other The existing instance to copy.
     */
    private Builder(ch.dvbern.kibon.exchange.commons.types.AdresseDTO other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.anschrift)) {
        this.anschrift = data().deepCopy(fields()[0].schema(), other.anschrift);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.strasse)) {
        this.strasse = data().deepCopy(fields()[1].schema(), other.strasse);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.hausnummer)) {
        this.hausnummer = data().deepCopy(fields()[2].schema(), other.hausnummer);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.adresszusatz)) {
        this.adresszusatz = data().deepCopy(fields()[3].schema(), other.adresszusatz);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.plz)) {
        this.plz = data().deepCopy(fields()[4].schema(), other.plz);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.ort)) {
        this.ort = data().deepCopy(fields()[5].schema(), other.ort);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.land)) {
        this.land = data().deepCopy(fields()[6].schema(), other.land);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.gemeinde)) {
        this.gemeinde = data().deepCopy(fields()[7].schema(), other.gemeinde);
        fieldSetFlags()[7] = true;
      }
      this.gemeindeBuilder = null;
      if (isValidValue(fields()[8], other.email)) {
        this.email = data().deepCopy(fields()[8].schema(), other.email);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.telefon)) {
        this.telefon = data().deepCopy(fields()[9].schema(), other.telefon);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.webseite)) {
        this.webseite = data().deepCopy(fields()[10].schema(), other.webseite);
        fieldSetFlags()[10] = true;
      }
    }

    /**
      * Gets the value of the 'anschrift' field.
      * @return The value.
      */
    public java.lang.String getAnschrift() {
      return anschrift;
    }


    /**
      * Sets the value of the 'anschrift' field.
      * @param value The value of 'anschrift'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder setAnschrift(java.lang.String value) {
      validate(fields()[0], value);
      this.anschrift = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'anschrift' field has been set.
      * @return True if the 'anschrift' field has been set, false otherwise.
      */
    public boolean hasAnschrift() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'anschrift' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder clearAnschrift() {
      anschrift = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'strasse' field.
      * @return The value.
      */
    public java.lang.String getStrasse() {
      return strasse;
    }


    /**
      * Sets the value of the 'strasse' field.
      * @param value The value of 'strasse'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder setStrasse(java.lang.String value) {
      validate(fields()[1], value);
      this.strasse = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'strasse' field has been set.
      * @return True if the 'strasse' field has been set, false otherwise.
      */
    public boolean hasStrasse() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'strasse' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder clearStrasse() {
      strasse = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'hausnummer' field.
      * @return The value.
      */
    public java.lang.String getHausnummer() {
      return hausnummer;
    }


    /**
      * Sets the value of the 'hausnummer' field.
      * @param value The value of 'hausnummer'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder setHausnummer(java.lang.String value) {
      validate(fields()[2], value);
      this.hausnummer = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'hausnummer' field has been set.
      * @return True if the 'hausnummer' field has been set, false otherwise.
      */
    public boolean hasHausnummer() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'hausnummer' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder clearHausnummer() {
      hausnummer = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'adresszusatz' field.
      * @return The value.
      */
    public java.lang.String getAdresszusatz() {
      return adresszusatz;
    }


    /**
      * Sets the value of the 'adresszusatz' field.
      * @param value The value of 'adresszusatz'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder setAdresszusatz(java.lang.String value) {
      validate(fields()[3], value);
      this.adresszusatz = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'adresszusatz' field has been set.
      * @return True if the 'adresszusatz' field has been set, false otherwise.
      */
    public boolean hasAdresszusatz() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'adresszusatz' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder clearAdresszusatz() {
      adresszusatz = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'plz' field.
      * @return The value.
      */
    public java.lang.String getPlz() {
      return plz;
    }


    /**
      * Sets the value of the 'plz' field.
      * @param value The value of 'plz'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder setPlz(java.lang.String value) {
      validate(fields()[4], value);
      this.plz = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'plz' field has been set.
      * @return True if the 'plz' field has been set, false otherwise.
      */
    public boolean hasPlz() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'plz' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder clearPlz() {
      plz = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'ort' field.
      * @return The value.
      */
    public java.lang.String getOrt() {
      return ort;
    }


    /**
      * Sets the value of the 'ort' field.
      * @param value The value of 'ort'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder setOrt(java.lang.String value) {
      validate(fields()[5], value);
      this.ort = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'ort' field has been set.
      * @return True if the 'ort' field has been set, false otherwise.
      */
    public boolean hasOrt() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'ort' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder clearOrt() {
      ort = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'land' field.
      * @return The value.
      */
    public java.lang.String getLand() {
      return land;
    }


    /**
      * Sets the value of the 'land' field.
      * @param value The value of 'land'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder setLand(java.lang.String value) {
      validate(fields()[6], value);
      this.land = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'land' field has been set.
      * @return True if the 'land' field has been set, false otherwise.
      */
    public boolean hasLand() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'land' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder clearLand() {
      land = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'gemeinde' field.
      * @return The value.
      */
    public ch.dvbern.kibon.exchange.commons.types.GemeindeDTO getGemeinde() {
      return gemeinde;
    }


    /**
      * Sets the value of the 'gemeinde' field.
      * @param value The value of 'gemeinde'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder setGemeinde(ch.dvbern.kibon.exchange.commons.types.GemeindeDTO value) {
      validate(fields()[7], value);
      this.gemeindeBuilder = null;
      this.gemeinde = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'gemeinde' field has been set.
      * @return True if the 'gemeinde' field has been set, false otherwise.
      */
    public boolean hasGemeinde() {
      return fieldSetFlags()[7];
    }

    /**
     * Gets the Builder instance for the 'gemeinde' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public ch.dvbern.kibon.exchange.commons.types.GemeindeDTO.Builder getGemeindeBuilder() {
      if (gemeindeBuilder == null) {
        if (hasGemeinde()) {
          setGemeindeBuilder(ch.dvbern.kibon.exchange.commons.types.GemeindeDTO.newBuilder(gemeinde));
        } else {
          setGemeindeBuilder(ch.dvbern.kibon.exchange.commons.types.GemeindeDTO.newBuilder());
        }
      }
      return gemeindeBuilder;
    }

    /**
     * Sets the Builder instance for the 'gemeinde' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder setGemeindeBuilder(ch.dvbern.kibon.exchange.commons.types.GemeindeDTO.Builder value) {
      clearGemeinde();
      gemeindeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'gemeinde' field has an active Builder instance
     * @return True if the 'gemeinde' field has an active Builder instance
     */
    public boolean hasGemeindeBuilder() {
      return gemeindeBuilder != null;
    }

    /**
      * Clears the value of the 'gemeinde' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder clearGemeinde() {
      gemeinde = null;
      gemeindeBuilder = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'email' field.
      * @return The value.
      */
    public java.lang.String getEmail() {
      return email;
    }


    /**
      * Sets the value of the 'email' field.
      * @param value The value of 'email'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder setEmail(java.lang.String value) {
      validate(fields()[8], value);
      this.email = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'email' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder clearEmail() {
      email = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'telefon' field.
      * @return The value.
      */
    public java.lang.String getTelefon() {
      return telefon;
    }


    /**
      * Sets the value of the 'telefon' field.
      * @param value The value of 'telefon'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder setTelefon(java.lang.String value) {
      validate(fields()[9], value);
      this.telefon = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'telefon' field has been set.
      * @return True if the 'telefon' field has been set, false otherwise.
      */
    public boolean hasTelefon() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'telefon' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder clearTelefon() {
      telefon = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'webseite' field.
      * @return The value.
      */
    public java.lang.String getWebseite() {
      return webseite;
    }


    /**
      * Sets the value of the 'webseite' field.
      * @param value The value of 'webseite'.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder setWebseite(java.lang.String value) {
      validate(fields()[10], value);
      this.webseite = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'webseite' field has been set.
      * @return True if the 'webseite' field has been set, false otherwise.
      */
    public boolean hasWebseite() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'webseite' field.
      * @return This builder.
      */
    public ch.dvbern.kibon.exchange.commons.types.AdresseDTO.Builder clearWebseite() {
      webseite = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AdresseDTO build() {
      try {
        AdresseDTO record = new AdresseDTO();
        record.anschrift = fieldSetFlags()[0] ? this.anschrift : (java.lang.String) defaultValue(fields()[0]);
        record.strasse = fieldSetFlags()[1] ? this.strasse : (java.lang.String) defaultValue(fields()[1]);
        record.hausnummer = fieldSetFlags()[2] ? this.hausnummer : (java.lang.String) defaultValue(fields()[2]);
        record.adresszusatz = fieldSetFlags()[3] ? this.adresszusatz : (java.lang.String) defaultValue(fields()[3]);
        record.plz = fieldSetFlags()[4] ? this.plz : (java.lang.String) defaultValue(fields()[4]);
        record.ort = fieldSetFlags()[5] ? this.ort : (java.lang.String) defaultValue(fields()[5]);
        record.land = fieldSetFlags()[6] ? this.land : (java.lang.String) defaultValue(fields()[6]);
        if (gemeindeBuilder != null) {
          try {
            record.gemeinde = this.gemeindeBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("gemeinde"));
            throw e;
          }
        } else {
          record.gemeinde = fieldSetFlags()[7] ? this.gemeinde : (ch.dvbern.kibon.exchange.commons.types.GemeindeDTO) defaultValue(fields()[7]);
        }
        record.email = fieldSetFlags()[8] ? this.email : (java.lang.String) defaultValue(fields()[8]);
        record.telefon = fieldSetFlags()[9] ? this.telefon : (java.lang.String) defaultValue(fields()[9]);
        record.webseite = fieldSetFlags()[10] ? this.webseite : (java.lang.String) defaultValue(fields()[10]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AdresseDTO>
    WRITER$ = (org.apache.avro.io.DatumWriter<AdresseDTO>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AdresseDTO>
    READER$ = (org.apache.avro.io.DatumReader<AdresseDTO>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.anschrift == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.anschrift);
    }

    out.writeString(this.strasse);

    if (this.hausnummer == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.hausnummer);
    }

    if (this.adresszusatz == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.adresszusatz);
    }

    out.writeString(this.plz);

    out.writeString(this.ort);

    out.writeString(this.land);

    this.gemeinde.customEncode(out);

    if (this.email == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.email);
    }

    if (this.telefon == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.telefon);
    }

    if (this.webseite == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.webseite);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.anschrift = null;
      } else {
        this.anschrift = in.readString();
      }

      this.strasse = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.hausnummer = null;
      } else {
        this.hausnummer = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.adresszusatz = null;
      } else {
        this.adresszusatz = in.readString();
      }

      this.plz = in.readString();

      this.ort = in.readString();

      this.land = in.readString();

      if (this.gemeinde == null) {
        this.gemeinde = new ch.dvbern.kibon.exchange.commons.types.GemeindeDTO();
      }
      this.gemeinde.customDecode(in);

      if (in.readIndex() != 1) {
        in.readNull();
        this.email = null;
      } else {
        this.email = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.telefon = null;
      } else {
        this.telefon = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.webseite = null;
      } else {
        this.webseite = in.readString();
      }

    } else {
      for (int i = 0; i < 11; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.anschrift = null;
          } else {
            this.anschrift = in.readString();
          }
          break;

        case 1:
          this.strasse = in.readString();
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.hausnummer = null;
          } else {
            this.hausnummer = in.readString();
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.adresszusatz = null;
          } else {
            this.adresszusatz = in.readString();
          }
          break;

        case 4:
          this.plz = in.readString();
          break;

        case 5:
          this.ort = in.readString();
          break;

        case 6:
          this.land = in.readString();
          break;

        case 7:
          if (this.gemeinde == null) {
            this.gemeinde = new ch.dvbern.kibon.exchange.commons.types.GemeindeDTO();
          }
          this.gemeinde.customDecode(in);
          break;

        case 8:
          if (in.readIndex() != 1) {
            in.readNull();
            this.email = null;
          } else {
            this.email = in.readString();
          }
          break;

        case 9:
          if (in.readIndex() != 1) {
            in.readNull();
            this.telefon = null;
          } else {
            this.telefon = in.readString();
          }
          break;

        case 10:
          if (in.readIndex() != 1) {
            in.readNull();
            this.webseite = null;
          } else {
            this.webseite = in.readString();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










