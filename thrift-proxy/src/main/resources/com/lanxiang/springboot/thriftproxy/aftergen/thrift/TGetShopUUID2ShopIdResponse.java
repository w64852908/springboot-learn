/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.lanxiang.springboot.thriftproxy.aftergen.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-07-25")
public class TGetShopUUID2ShopIdResponse implements org.apache.thrift.TBase<TGetShopUUID2ShopIdResponse, TGetShopUUID2ShopIdResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TGetShopUUID2ShopIdResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetShopUUID2ShopIdResponse");

  private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SHOP_UUID2_SHOP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("shopUUID2ShopId", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetShopUUID2ShopIdResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetShopUUID2ShopIdResponseTupleSchemeFactory();

  public boolean success; // required
  public java.lang.String message; // required
  public java.util.Map<java.lang.String,java.lang.Integer> shopUUID2ShopId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUCCESS((short)1, "success"),
    MESSAGE((short)2, "message"),
    SHOP_UUID2_SHOP_ID((short)3, "shopUUID2ShopId");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SUCCESS
          return SUCCESS;
        case 2: // MESSAGE
          return MESSAGE;
        case 3: // SHOP_UUID2_SHOP_ID
          return SHOP_UUID2_SHOP_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SUCCESS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SHOP_UUID2_SHOP_ID, new org.apache.thrift.meta_data.FieldMetaData("shopUUID2ShopId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetShopUUID2ShopIdResponse.class, metaDataMap);
  }

  public TGetShopUUID2ShopIdResponse() {
  }

  public TGetShopUUID2ShopIdResponse(
    boolean success,
    java.lang.String message,
    java.util.Map<java.lang.String,java.lang.Integer> shopUUID2ShopId)
  {
    this();
    this.success = success;
    setSuccessIsSet(true);
    this.message = message;
    this.shopUUID2ShopId = shopUUID2ShopId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetShopUUID2ShopIdResponse(TGetShopUUID2ShopIdResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.success = other.success;
    if (other.isSetMessage()) {
      this.message = other.message;
    }
    if (other.isSetShopUUID2ShopId()) {
      java.util.Map<java.lang.String,java.lang.Integer> __this__shopUUID2ShopId = new java.util.HashMap<java.lang.String,java.lang.Integer>(other.shopUUID2ShopId);
      this.shopUUID2ShopId = __this__shopUUID2ShopId;
    }
  }

  public TGetShopUUID2ShopIdResponse deepCopy() {
    return new TGetShopUUID2ShopIdResponse(this);
  }

  @Override
  public void clear() {
    setSuccessIsSet(false);
    this.success = false;
    this.message = null;
    this.shopUUID2ShopId = null;
  }

  public boolean isSuccess() {
    return this.success;
  }

  public TGetShopUUID2ShopIdResponse setSuccess(boolean success) {
    this.success = success;
    setSuccessIsSet(true);
    return this;
  }

  public void unsetSuccess() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  /** Returns true if field success is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccess() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  public void setSuccessIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SUCCESS_ISSET_ID, value);
  }

  public java.lang.String getMessage() {
    return this.message;
  }

  public TGetShopUUID2ShopIdResponse setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public int getShopUUID2ShopIdSize() {
    return (this.shopUUID2ShopId == null) ? 0 : this.shopUUID2ShopId.size();
  }

  public void putToShopUUID2ShopId(java.lang.String key, int val) {
    if (this.shopUUID2ShopId == null) {
      this.shopUUID2ShopId = new java.util.HashMap<java.lang.String,java.lang.Integer>();
    }
    this.shopUUID2ShopId.put(key, val);
  }

  public java.util.Map<java.lang.String,java.lang.Integer> getShopUUID2ShopId() {
    return this.shopUUID2ShopId;
  }

  public TGetShopUUID2ShopIdResponse setShopUUID2ShopId(java.util.Map<java.lang.String,java.lang.Integer> shopUUID2ShopId) {
    this.shopUUID2ShopId = shopUUID2ShopId;
    return this;
  }

  public void unsetShopUUID2ShopId() {
    this.shopUUID2ShopId = null;
  }

  /** Returns true if field shopUUID2ShopId is set (has been assigned a value) and false otherwise */
  public boolean isSetShopUUID2ShopId() {
    return this.shopUUID2ShopId != null;
  }

  public void setShopUUID2ShopIdIsSet(boolean value) {
    if (!value) {
      this.shopUUID2ShopId = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SUCCESS:
      if (value == null) {
        unsetSuccess();
      } else {
        setSuccess((java.lang.Boolean)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((java.lang.String)value);
      }
      break;

    case SHOP_UUID2_SHOP_ID:
      if (value == null) {
        unsetShopUUID2ShopId();
      } else {
        setShopUUID2ShopId((java.util.Map<java.lang.String,java.lang.Integer>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SUCCESS:
      return isSuccess();

    case MESSAGE:
      return getMessage();

    case SHOP_UUID2_SHOP_ID:
      return getShopUUID2ShopId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SUCCESS:
      return isSetSuccess();
    case MESSAGE:
      return isSetMessage();
    case SHOP_UUID2_SHOP_ID:
      return isSetShopUUID2ShopId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetShopUUID2ShopIdResponse)
      return this.equals((TGetShopUUID2ShopIdResponse)that);
    return false;
  }

  public boolean equals(TGetShopUUID2ShopIdResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_success = true;
    boolean that_present_success = true;
    if (this_present_success || that_present_success) {
      if (!(this_present_success && that_present_success))
        return false;
      if (this.success != that.success)
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_shopUUID2ShopId = true && this.isSetShopUUID2ShopId();
    boolean that_present_shopUUID2ShopId = true && that.isSetShopUUID2ShopId();
    if (this_present_shopUUID2ShopId || that_present_shopUUID2ShopId) {
      if (!(this_present_shopUUID2ShopId && that_present_shopUUID2ShopId))
        return false;
      if (!this.shopUUID2ShopId.equals(that.shopUUID2ShopId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((success) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetMessage()) ? 131071 : 524287);
    if (isSetMessage())
      hashCode = hashCode * 8191 + message.hashCode();

    hashCode = hashCode * 8191 + ((isSetShopUUID2ShopId()) ? 131071 : 524287);
    if (isSetShopUUID2ShopId())
      hashCode = hashCode * 8191 + shopUUID2ShopId.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TGetShopUUID2ShopIdResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetShopUUID2ShopId()).compareTo(other.isSetShopUUID2ShopId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShopUUID2ShopId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shopUUID2ShopId, other.shopUUID2ShopId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetShopUUID2ShopIdResponse(");
    boolean first = true;

    sb.append("success:");
    sb.append(this.success);
    first = false;
    if (!first) sb.append(", ");
    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("shopUUID2ShopId:");
    if (this.shopUUID2ShopId == null) {
      sb.append("null");
    } else {
      sb.append(this.shopUUID2ShopId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TGetShopUUID2ShopIdResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetShopUUID2ShopIdResponseStandardScheme getScheme() {
      return new TGetShopUUID2ShopIdResponseStandardScheme();
    }
  }

  private static class TGetShopUUID2ShopIdResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetShopUUID2ShopIdResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetShopUUID2ShopIdResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUCCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.success = iprot.readBool();
              struct.setSuccessIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readString();
              struct.setMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SHOP_UUID2_SHOP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map10 = iprot.readMapBegin();
                struct.shopUUID2ShopId = new java.util.HashMap<java.lang.String,java.lang.Integer>(2*_map10.size);
                java.lang.String _key11;
                int _val12;
                for (int _i13 = 0; _i13 < _map10.size; ++_i13)
                {
                  _key11 = iprot.readString();
                  _val12 = iprot.readI32();
                  struct.shopUUID2ShopId.put(_key11, _val12);
                }
                iprot.readMapEnd();
              }
              struct.setShopUUID2ShopIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetShopUUID2ShopIdResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
      oprot.writeBool(struct.success);
      oprot.writeFieldEnd();
      if (struct.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        oprot.writeString(struct.message);
        oprot.writeFieldEnd();
      }
      if (struct.shopUUID2ShopId != null) {
        oprot.writeFieldBegin(SHOP_UUID2_SHOP_ID_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I32, struct.shopUUID2ShopId.size()));
          for (java.util.Map.Entry<java.lang.String, java.lang.Integer> _iter14 : struct.shopUUID2ShopId.entrySet())
          {
            oprot.writeString(_iter14.getKey());
            oprot.writeI32(_iter14.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetShopUUID2ShopIdResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetShopUUID2ShopIdResponseTupleScheme getScheme() {
      return new TGetShopUUID2ShopIdResponseTupleScheme();
    }
  }

  private static class TGetShopUUID2ShopIdResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetShopUUID2ShopIdResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetShopUUID2ShopIdResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSuccess()) {
        optionals.set(0);
      }
      if (struct.isSetMessage()) {
        optionals.set(1);
      }
      if (struct.isSetShopUUID2ShopId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSuccess()) {
        oprot.writeBool(struct.success);
      }
      if (struct.isSetMessage()) {
        oprot.writeString(struct.message);
      }
      if (struct.isSetShopUUID2ShopId()) {
        {
          oprot.writeI32(struct.shopUUID2ShopId.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.Integer> _iter15 : struct.shopUUID2ShopId.entrySet())
          {
            oprot.writeString(_iter15.getKey());
            oprot.writeI32(_iter15.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetShopUUID2ShopIdResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.success = iprot.readBool();
        struct.setSuccessIsSet(true);
      }
      if (incoming.get(1)) {
        struct.message = iprot.readString();
        struct.setMessageIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map16 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.shopUUID2ShopId = new java.util.HashMap<java.lang.String,java.lang.Integer>(2*_map16.size);
          java.lang.String _key17;
          int _val18;
          for (int _i19 = 0; _i19 < _map16.size; ++_i19)
          {
            _key17 = iprot.readString();
            _val18 = iprot.readI32();
            struct.shopUUID2ShopId.put(_key17, _val18);
          }
        }
        struct.setShopUUID2ShopIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

