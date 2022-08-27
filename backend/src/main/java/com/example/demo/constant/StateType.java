package com.example.demo.constant;

public enum StateType {
  UN_KNOWN(-1),
  UN_AVAILABLE(0),
  AVAILABLE(1);

  private final int code;

  StateType(int code) {
    this.code = code;
  }

  public static StateType fromCode(Integer code) {
    if (code == null) return null;

    for (StateType type : values()) {
      if (type.code == code) return type;
    }
    return UN_KNOWN;
  }

  public int getCode() {
    return code;
  }
}
