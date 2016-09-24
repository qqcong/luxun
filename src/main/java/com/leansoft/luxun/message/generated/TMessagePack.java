/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.leansoft.luxun.message.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * FOR INTERNAL USE, DO NOT CHANGE!
 * 
 * A package of a list of messages. The format of an N bytes package is the following:
 * 
 * current magic byte is 1
 * 
 * 1. 1 byte "magic" identifier to allow format changes
 * 2. 1 byte "attribute" identifier to allow annotations on the package
 *      independent of the version (e.g. compression enabled, type of codec used)
 * 3. 4 bytes CRC32 of the payload
 * 4. N bytes messageList, thrift serialized MessageList, may be compressed according to attribute setting
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-09-24")
public class TMessagePack implements org.apache.thrift.TBase<TMessagePack, TMessagePack._Fields>, java.io.Serializable, Cloneable, Comparable<TMessagePack> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMessagePack");

  private static final org.apache.thrift.protocol.TField MAGIC_FIELD_DESC = new org.apache.thrift.protocol.TField("magic", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField ATTRIBUTE_FIELD_DESC = new org.apache.thrift.protocol.TField("attribute", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField CRC32_FIELD_DESC = new org.apache.thrift.protocol.TField("crc32", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField MESSAGE_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("messageList", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TMessagePackStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TMessagePackTupleSchemeFactory());
  }

  private byte magic; // required
  private byte attribute; // required
  private int crc32; // required
  private ByteBuffer messageList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MAGIC((short)1, "magic"),
    ATTRIBUTE((short)2, "attribute"),
    CRC32((short)3, "crc32"),
    MESSAGE_LIST((short)4, "messageList");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MAGIC
          return MAGIC;
        case 2: // ATTRIBUTE
          return ATTRIBUTE;
        case 3: // CRC32
          return CRC32;
        case 4: // MESSAGE_LIST
          return MESSAGE_LIST;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MAGIC_ISSET_ID = 0;
  private static final int __ATTRIBUTE_ISSET_ID = 1;
  private static final int __CRC32_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MAGIC, new org.apache.thrift.meta_data.FieldMetaData("magic", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.ATTRIBUTE, new org.apache.thrift.meta_data.FieldMetaData("attribute", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.CRC32, new org.apache.thrift.meta_data.FieldMetaData("crc32", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MESSAGE_LIST, new org.apache.thrift.meta_data.FieldMetaData("messageList", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMessagePack.class, metaDataMap);
  }

  public TMessagePack() {
    this.magic = (byte)1;

  }

  public TMessagePack(
    byte magic,
    byte attribute,
    int crc32,
    ByteBuffer messageList)
  {
    this();
    this.magic = magic;
    setMagicIsSet(true);
    this.attribute = attribute;
    setAttributeIsSet(true);
    this.crc32 = crc32;
    setCrc32IsSet(true);
    this.messageList = org.apache.thrift.TBaseHelper.copyBinary(messageList);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMessagePack(TMessagePack other) {
    __isset_bitfield = other.__isset_bitfield;
    this.magic = other.magic;
    this.attribute = other.attribute;
    this.crc32 = other.crc32;
    if (other.isSetMessageList()) {
      this.messageList = org.apache.thrift.TBaseHelper.copyBinary(other.messageList);
    }
  }

  public TMessagePack deepCopy() {
    return new TMessagePack(this);
  }

  @Override
  public void clear() {
    this.magic = (byte)1;

    setAttributeIsSet(false);
    this.attribute = 0;
    setCrc32IsSet(false);
    this.crc32 = 0;
    this.messageList = null;
  }

  public byte getMagic() {
    return this.magic;
  }

  public void setMagic(byte magic) {
    this.magic = magic;
    setMagicIsSet(true);
  }

  public void unsetMagic() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAGIC_ISSET_ID);
  }

  /** Returns true if field magic is set (has been assigned a value) and false otherwise */
  public boolean isSetMagic() {
    return EncodingUtils.testBit(__isset_bitfield, __MAGIC_ISSET_ID);
  }

  public void setMagicIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAGIC_ISSET_ID, value);
  }

  public byte getAttribute() {
    return this.attribute;
  }

  public void setAttribute(byte attribute) {
    this.attribute = attribute;
    setAttributeIsSet(true);
  }

  public void unsetAttribute() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ATTRIBUTE_ISSET_ID);
  }

  /** Returns true if field attribute is set (has been assigned a value) and false otherwise */
  public boolean isSetAttribute() {
    return EncodingUtils.testBit(__isset_bitfield, __ATTRIBUTE_ISSET_ID);
  }

  public void setAttributeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ATTRIBUTE_ISSET_ID, value);
  }

  public int getCrc32() {
    return this.crc32;
  }

  public void setCrc32(int crc32) {
    this.crc32 = crc32;
    setCrc32IsSet(true);
  }

  public void unsetCrc32() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CRC32_ISSET_ID);
  }

  /** Returns true if field crc32 is set (has been assigned a value) and false otherwise */
  public boolean isSetCrc32() {
    return EncodingUtils.testBit(__isset_bitfield, __CRC32_ISSET_ID);
  }

  public void setCrc32IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CRC32_ISSET_ID, value);
  }

  public byte[] getMessageList() {
    setMessageList(org.apache.thrift.TBaseHelper.rightSize(messageList));
    return messageList == null ? null : messageList.array();
  }

  public ByteBuffer bufferForMessageList() {
    return org.apache.thrift.TBaseHelper.copyBinary(messageList);
  }

  public void setMessageList(byte[] messageList) {
    this.messageList = messageList == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(messageList, messageList.length));
  }

  public void setMessageList(ByteBuffer messageList) {
    this.messageList = org.apache.thrift.TBaseHelper.copyBinary(messageList);
  }

  public void unsetMessageList() {
    this.messageList = null;
  }

  /** Returns true if field messageList is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageList() {
    return this.messageList != null;
  }

  public void setMessageListIsSet(boolean value) {
    if (!value) {
      this.messageList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MAGIC:
      if (value == null) {
        unsetMagic();
      } else {
        setMagic((Byte)value);
      }
      break;

    case ATTRIBUTE:
      if (value == null) {
        unsetAttribute();
      } else {
        setAttribute((Byte)value);
      }
      break;

    case CRC32:
      if (value == null) {
        unsetCrc32();
      } else {
        setCrc32((Integer)value);
      }
      break;

    case MESSAGE_LIST:
      if (value == null) {
        unsetMessageList();
      } else {
        setMessageList((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MAGIC:
      return getMagic();

    case ATTRIBUTE:
      return getAttribute();

    case CRC32:
      return getCrc32();

    case MESSAGE_LIST:
      return getMessageList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MAGIC:
      return isSetMagic();
    case ATTRIBUTE:
      return isSetAttribute();
    case CRC32:
      return isSetCrc32();
    case MESSAGE_LIST:
      return isSetMessageList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TMessagePack)
      return this.equals((TMessagePack)that);
    return false;
  }

  public boolean equals(TMessagePack that) {
    if (that == null)
      return false;

    boolean this_present_magic = true;
    boolean that_present_magic = true;
    if (this_present_magic || that_present_magic) {
      if (!(this_present_magic && that_present_magic))
        return false;
      if (this.magic != that.magic)
        return false;
    }

    boolean this_present_attribute = true;
    boolean that_present_attribute = true;
    if (this_present_attribute || that_present_attribute) {
      if (!(this_present_attribute && that_present_attribute))
        return false;
      if (this.attribute != that.attribute)
        return false;
    }

    boolean this_present_crc32 = true;
    boolean that_present_crc32 = true;
    if (this_present_crc32 || that_present_crc32) {
      if (!(this_present_crc32 && that_present_crc32))
        return false;
      if (this.crc32 != that.crc32)
        return false;
    }

    boolean this_present_messageList = true && this.isSetMessageList();
    boolean that_present_messageList = true && that.isSetMessageList();
    if (this_present_messageList || that_present_messageList) {
      if (!(this_present_messageList && that_present_messageList))
        return false;
      if (!this.messageList.equals(that.messageList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_magic = true;
    list.add(present_magic);
    if (present_magic)
      list.add(magic);

    boolean present_attribute = true;
    list.add(present_attribute);
    if (present_attribute)
      list.add(attribute);

    boolean present_crc32 = true;
    list.add(present_crc32);
    if (present_crc32)
      list.add(crc32);

    boolean present_messageList = true && (isSetMessageList());
    list.add(present_messageList);
    if (present_messageList)
      list.add(messageList);

    return list.hashCode();
  }

  @Override
  public int compareTo(TMessagePack other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMagic()).compareTo(other.isSetMagic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMagic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.magic, other.magic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAttribute()).compareTo(other.isSetAttribute());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttribute()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.attribute, other.attribute);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCrc32()).compareTo(other.isSetCrc32());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCrc32()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.crc32, other.crc32);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageList()).compareTo(other.isSetMessageList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messageList, other.messageList);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TMessagePack(");
    boolean first = true;

    sb.append("magic:");
    sb.append(this.magic);
    first = false;
    if (!first) sb.append(", ");
    sb.append("attribute:");
    sb.append(this.attribute);
    first = false;
    if (!first) sb.append(", ");
    sb.append("crc32:");
    sb.append(this.crc32);
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageList:");
    if (this.messageList == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.messageList, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetMessageList()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'messageList' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TMessagePackStandardSchemeFactory implements SchemeFactory {
    public TMessagePackStandardScheme getScheme() {
      return new TMessagePackStandardScheme();
    }
  }

  private static class TMessagePackStandardScheme extends StandardScheme<TMessagePack> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TMessagePack struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MAGIC
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.magic = iprot.readByte();
              struct.setMagicIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ATTRIBUTE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.attribute = iprot.readByte();
              struct.setAttributeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CRC32
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.crc32 = iprot.readI32();
              struct.setCrc32IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MESSAGE_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.messageList = iprot.readBinary();
              struct.setMessageListIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TMessagePack struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MAGIC_FIELD_DESC);
      oprot.writeByte(struct.magic);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ATTRIBUTE_FIELD_DESC);
      oprot.writeByte(struct.attribute);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CRC32_FIELD_DESC);
      oprot.writeI32(struct.crc32);
      oprot.writeFieldEnd();
      if (struct.messageList != null) {
        oprot.writeFieldBegin(MESSAGE_LIST_FIELD_DESC);
        oprot.writeBinary(struct.messageList);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMessagePackTupleSchemeFactory implements SchemeFactory {
    public TMessagePackTupleScheme getScheme() {
      return new TMessagePackTupleScheme();
    }
  }

  private static class TMessagePackTupleScheme extends TupleScheme<TMessagePack> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMessagePack struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBinary(struct.messageList);
      BitSet optionals = new BitSet();
      if (struct.isSetMagic()) {
        optionals.set(0);
      }
      if (struct.isSetAttribute()) {
        optionals.set(1);
      }
      if (struct.isSetCrc32()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetMagic()) {
        oprot.writeByte(struct.magic);
      }
      if (struct.isSetAttribute()) {
        oprot.writeByte(struct.attribute);
      }
      if (struct.isSetCrc32()) {
        oprot.writeI32(struct.crc32);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMessagePack struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.messageList = iprot.readBinary();
      struct.setMessageListIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.magic = iprot.readByte();
        struct.setMagicIsSet(true);
      }
      if (incoming.get(1)) {
        struct.attribute = iprot.readByte();
        struct.setAttributeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.crc32 = iprot.readI32();
        struct.setCrc32IsSet(true);
      }
    }
  }

}

