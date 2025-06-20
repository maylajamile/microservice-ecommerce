/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package br.com.ecommerce.common.event;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CheckoutCreatedEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3720608325219066136L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CheckoutCreatedEvent\",\"namespace\":\"br.com.ecommerce.common.event\",\"fields\":[{\"name\":\"checkoutCode\",\"type\":[\"string\"]},{\"name\":\"status\",\"type\":[\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CheckoutCreatedEvent> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CheckoutCreatedEvent> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CheckoutCreatedEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CheckoutCreatedEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CheckoutCreatedEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CheckoutCreatedEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CheckoutCreatedEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CheckoutCreatedEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CheckoutCreatedEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.Object checkoutCode;
  private java.lang.Object status;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CheckoutCreatedEvent() {}

  /**
   * All-args constructor.
   * @param checkoutCode The new value for checkoutCode
   * @param status The new value for status
   */
  public CheckoutCreatedEvent(java.lang.Object checkoutCode, java.lang.Object status) {
    this.checkoutCode = checkoutCode;
    this.status = status;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return checkoutCode;
    case 1: return status;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: checkoutCode = value$; break;
    case 1: status = value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'checkoutCode' field.
   * @return The value of the 'checkoutCode' field.
   */
  public java.lang.Object getCheckoutCode() {
    return checkoutCode;
  }


  /**
   * Sets the value of the 'checkoutCode' field.
   * @param value the value to set.
   */
  public void setCheckoutCode(java.lang.Object value) {
    this.checkoutCode = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.Object getStatus() {
    return status;
  }


  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.Object value) {
    this.status = value;
  }

  /**
   * Creates a new CheckoutCreatedEvent RecordBuilder.
   * @return A new CheckoutCreatedEvent RecordBuilder
   */
  public static br.com.ecommerce.common.event.CheckoutCreatedEvent.Builder newBuilder() {
    return new br.com.ecommerce.common.event.CheckoutCreatedEvent.Builder();
  }

  /**
   * Creates a new CheckoutCreatedEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CheckoutCreatedEvent RecordBuilder
   */
  public static br.com.ecommerce.common.event.CheckoutCreatedEvent.Builder newBuilder(br.com.ecommerce.common.event.CheckoutCreatedEvent.Builder other) {
    if (other == null) {
      return new br.com.ecommerce.common.event.CheckoutCreatedEvent.Builder();
    } else {
      return new br.com.ecommerce.common.event.CheckoutCreatedEvent.Builder(other);
    }
  }

  /**
   * Creates a new CheckoutCreatedEvent RecordBuilder by copying an existing CheckoutCreatedEvent instance.
   * @param other The existing instance to copy.
   * @return A new CheckoutCreatedEvent RecordBuilder
   */
  public static br.com.ecommerce.common.event.CheckoutCreatedEvent.Builder newBuilder(br.com.ecommerce.common.event.CheckoutCreatedEvent other) {
    if (other == null) {
      return new br.com.ecommerce.common.event.CheckoutCreatedEvent.Builder();
    } else {
      return new br.com.ecommerce.common.event.CheckoutCreatedEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for CheckoutCreatedEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CheckoutCreatedEvent>
    implements org.apache.avro.data.RecordBuilder<CheckoutCreatedEvent> {

    private java.lang.Object checkoutCode;
    private java.lang.Object status;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(br.com.ecommerce.common.event.CheckoutCreatedEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.checkoutCode)) {
        this.checkoutCode = data().deepCopy(fields()[0].schema(), other.checkoutCode);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing CheckoutCreatedEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(br.com.ecommerce.common.event.CheckoutCreatedEvent other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.checkoutCode)) {
        this.checkoutCode = data().deepCopy(fields()[0].schema(), other.checkoutCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'checkoutCode' field.
      * @return The value.
      */
    public java.lang.Object getCheckoutCode() {
      return checkoutCode;
    }


    /**
      * Sets the value of the 'checkoutCode' field.
      * @param value The value of 'checkoutCode'.
      * @return This builder.
      */
    public br.com.ecommerce.common.event.CheckoutCreatedEvent.Builder setCheckoutCode(java.lang.Object value) {
      validate(fields()[0], value);
      this.checkoutCode = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'checkoutCode' field has been set.
      * @return True if the 'checkoutCode' field has been set, false otherwise.
      */
    public boolean hasCheckoutCode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'checkoutCode' field.
      * @return This builder.
      */
    public br.com.ecommerce.common.event.CheckoutCreatedEvent.Builder clearCheckoutCode() {
      checkoutCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.Object getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public br.com.ecommerce.common.event.CheckoutCreatedEvent.Builder setStatus(java.lang.Object value) {
      validate(fields()[1], value);
      this.status = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public br.com.ecommerce.common.event.CheckoutCreatedEvent.Builder clearStatus() {
      status = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CheckoutCreatedEvent build() {
      try {
        CheckoutCreatedEvent record = new CheckoutCreatedEvent();
        record.checkoutCode = fieldSetFlags()[0] ? this.checkoutCode :  defaultValue(fields()[0]);
        record.status = fieldSetFlags()[1] ? this.status :  defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CheckoutCreatedEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<CheckoutCreatedEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CheckoutCreatedEvent>
    READER$ = (org.apache.avro.io.DatumReader<CheckoutCreatedEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










