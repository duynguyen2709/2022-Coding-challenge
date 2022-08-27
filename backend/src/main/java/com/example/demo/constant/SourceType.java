package com.example.demo.constant;

public enum SourceType {
  SERVICE(0),
  KAFKA_TOPIC(1),
  KAFKA_TOPIC_BINLOG(2),
  DATA_STORAGE(3);

  private final int code;

  SourceType(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }
}
