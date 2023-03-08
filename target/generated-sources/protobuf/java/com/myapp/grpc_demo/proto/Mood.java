// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package com.myapp.grpc_demo.proto;

/**
 * Protobuf enum {@code Mood}
 */
public enum Mood
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HAPPY = 0;</code>
   */
  HAPPY(0),
  /**
   * <code>SLEEPY = 1;</code>
   */
  SLEEPY(1),
  /**
   * <code>ANGRY = 2;</code>
   */
  ANGRY(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>HAPPY = 0;</code>
   */
  public static final int HAPPY_VALUE = 0;
  /**
   * <code>SLEEPY = 1;</code>
   */
  public static final int SLEEPY_VALUE = 1;
  /**
   * <code>ANGRY = 2;</code>
   */
  public static final int ANGRY_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Mood valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Mood forNumber(int value) {
    switch (value) {
      case 0: return HAPPY;
      case 1: return SLEEPY;
      case 2: return ANGRY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Mood>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Mood> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Mood>() {
          public Mood findValueByNumber(int number) {
            return Mood.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.myapp.grpc_demo.proto.Test.getDescriptor().getEnumTypes().get(0);
  }

  private static final Mood[] VALUES = values();

  public static Mood valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Mood(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Mood)
}

