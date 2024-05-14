/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.PizzaStore.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class NewOrder extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7811944611248989729L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NewOrder\",\"namespace\":\"com.example.PizzaStore.model\",\"fields\":[{\"name\":\"pizzaStyle\",\"type\":\"string\"},{\"name\":\"size\",\"type\":\"string\"},{\"name\":\"email\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<NewOrder> ENCODER =
      new BinaryMessageEncoder<NewOrder>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<NewOrder> DECODER =
      new BinaryMessageDecoder<NewOrder>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<NewOrder> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<NewOrder> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<NewOrder> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<NewOrder>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this NewOrder to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a NewOrder from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a NewOrder instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static NewOrder fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence pizzaStyle;
  @Deprecated public java.lang.CharSequence size;
  @Deprecated public java.lang.CharSequence email;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public NewOrder() {}

  /**
   * All-args constructor.
   * @param pizzaStyle The new value for pizzaStyle
   * @param size The new value for size
   * @param email The new value for email
   */
  public NewOrder(java.lang.CharSequence pizzaStyle, java.lang.CharSequence size, java.lang.CharSequence email) {
    this.pizzaStyle = pizzaStyle;
    this.size = size;
    this.email = email;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return pizzaStyle;
    case 1: return size;
    case 2: return email;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: pizzaStyle = (java.lang.CharSequence)value$; break;
    case 1: size = (java.lang.CharSequence)value$; break;
    case 2: email = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'pizzaStyle' field.
   * @return The value of the 'pizzaStyle' field.
   */
  public java.lang.CharSequence getPizzaStyle() {
    return pizzaStyle;
  }


  /**
   * Sets the value of the 'pizzaStyle' field.
   * @param value the value to set.
   */
  public void setPizzaStyle(java.lang.CharSequence value) {
    this.pizzaStyle = value;
  }

  /**
   * Gets the value of the 'size' field.
   * @return The value of the 'size' field.
   */
  public java.lang.CharSequence getSize() {
    return size;
  }


  /**
   * Sets the value of the 'size' field.
   * @param value the value to set.
   */
  public void setSize(java.lang.CharSequence value) {
    this.size = value;
  }

  /**
   * Gets the value of the 'email' field.
   * @return The value of the 'email' field.
   */
  public java.lang.CharSequence getEmail() {
    return email;
  }


  /**
   * Sets the value of the 'email' field.
   * @param value the value to set.
   */
  public void setEmail(java.lang.CharSequence value) {
    this.email = value;
  }

  /**
   * Creates a new NewOrder RecordBuilder.
   * @return A new NewOrder RecordBuilder
   */
  public static com.example.PizzaStore.model.NewOrder.Builder newBuilder() {
    return new com.example.PizzaStore.model.NewOrder.Builder();
  }

  /**
   * Creates a new NewOrder RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new NewOrder RecordBuilder
   */
  public static com.example.PizzaStore.model.NewOrder.Builder newBuilder(com.example.PizzaStore.model.NewOrder.Builder other) {
    if (other == null) {
      return new com.example.PizzaStore.model.NewOrder.Builder();
    } else {
      return new com.example.PizzaStore.model.NewOrder.Builder(other);
    }
  }

  /**
   * Creates a new NewOrder RecordBuilder by copying an existing NewOrder instance.
   * @param other The existing instance to copy.
   * @return A new NewOrder RecordBuilder
   */
  public static com.example.PizzaStore.model.NewOrder.Builder newBuilder(com.example.PizzaStore.model.NewOrder other) {
    if (other == null) {
      return new com.example.PizzaStore.model.NewOrder.Builder();
    } else {
      return new com.example.PizzaStore.model.NewOrder.Builder(other);
    }
  }

  /**
   * RecordBuilder for NewOrder instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NewOrder>
    implements org.apache.avro.data.RecordBuilder<NewOrder> {

    private java.lang.CharSequence pizzaStyle;
    private java.lang.CharSequence size;
    private java.lang.CharSequence email;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.PizzaStore.model.NewOrder.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.pizzaStyle)) {
        this.pizzaStyle = data().deepCopy(fields()[0].schema(), other.pizzaStyle);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.size)) {
        this.size = data().deepCopy(fields()[1].schema(), other.size);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.email)) {
        this.email = data().deepCopy(fields()[2].schema(), other.email);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing NewOrder instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.PizzaStore.model.NewOrder other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.pizzaStyle)) {
        this.pizzaStyle = data().deepCopy(fields()[0].schema(), other.pizzaStyle);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.size)) {
        this.size = data().deepCopy(fields()[1].schema(), other.size);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.email)) {
        this.email = data().deepCopy(fields()[2].schema(), other.email);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'pizzaStyle' field.
      * @return The value.
      */
    public java.lang.CharSequence getPizzaStyle() {
      return pizzaStyle;
    }


    /**
      * Sets the value of the 'pizzaStyle' field.
      * @param value The value of 'pizzaStyle'.
      * @return This builder.
      */
    public com.example.PizzaStore.model.NewOrder.Builder setPizzaStyle(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.pizzaStyle = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'pizzaStyle' field has been set.
      * @return True if the 'pizzaStyle' field has been set, false otherwise.
      */
    public boolean hasPizzaStyle() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'pizzaStyle' field.
      * @return This builder.
      */
    public com.example.PizzaStore.model.NewOrder.Builder clearPizzaStyle() {
      pizzaStyle = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'size' field.
      * @return The value.
      */
    public java.lang.CharSequence getSize() {
      return size;
    }


    /**
      * Sets the value of the 'size' field.
      * @param value The value of 'size'.
      * @return This builder.
      */
    public com.example.PizzaStore.model.NewOrder.Builder setSize(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.size = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'size' field has been set.
      * @return True if the 'size' field has been set, false otherwise.
      */
    public boolean hasSize() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'size' field.
      * @return This builder.
      */
    public com.example.PizzaStore.model.NewOrder.Builder clearSize() {
      size = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'email' field.
      * @return The value.
      */
    public java.lang.CharSequence getEmail() {
      return email;
    }


    /**
      * Sets the value of the 'email' field.
      * @param value The value of 'email'.
      * @return This builder.
      */
    public com.example.PizzaStore.model.NewOrder.Builder setEmail(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.email = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'email' field.
      * @return This builder.
      */
    public com.example.PizzaStore.model.NewOrder.Builder clearEmail() {
      email = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public NewOrder build() {
      try {
        NewOrder record = new NewOrder();
        record.pizzaStyle = fieldSetFlags()[0] ? this.pizzaStyle : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.size = fieldSetFlags()[1] ? this.size : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.email = fieldSetFlags()[2] ? this.email : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<NewOrder>
    WRITER$ = (org.apache.avro.io.DatumWriter<NewOrder>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<NewOrder>
    READER$ = (org.apache.avro.io.DatumReader<NewOrder>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.pizzaStyle);

    out.writeString(this.size);

    out.writeString(this.email);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.pizzaStyle = in.readString(this.pizzaStyle instanceof Utf8 ? (Utf8)this.pizzaStyle : null);

      this.size = in.readString(this.size instanceof Utf8 ? (Utf8)this.size : null);

      this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.pizzaStyle = in.readString(this.pizzaStyle instanceof Utf8 ? (Utf8)this.pizzaStyle : null);
          break;

        case 1:
          this.size = in.readString(this.size instanceof Utf8 ? (Utf8)this.size : null);
          break;

        case 2:
          this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










