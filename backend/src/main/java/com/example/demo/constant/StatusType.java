package com.example.demo.constant;

public enum StatusType {
  UN_MATCHED(0),
  MATCHED(1),
  DUPLICATED(-1),
  RECOVERY(2),
  ALL(4),
  UN_KNOWN(-2);

  private final int code;

  StatusType(int code) {
    this.code = code;
  }

  public static StatusType fromCode(int code) {
    for (StatusType type : values()) {
      if (type.code == code) return type;
    }
    return UN_KNOWN;
  }

  public int getCode() {
    return code;
  }
}
