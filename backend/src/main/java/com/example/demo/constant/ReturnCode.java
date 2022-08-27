package com.example.demo.constant;

public enum ReturnCode {
  SUCCESS(1, "SUCCESS"),
  FAIL(-1, "FAIL"),
  NO_SERVICE_TRACKING(-1, "Could not found any services"),
  SERVICES_STABLE(0, "No mismatch. Services are working well");

  private final int code;
  private final String message;

  ReturnCode(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public int getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }
}
