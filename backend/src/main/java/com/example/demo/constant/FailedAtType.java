package com.example.demo.constant;

public enum FailedAtType {
  DATABASE_SOURCE("0"),
  KAFKA_TOPIC("1"),
  BINLOG_TOPIC("2"),
  DATA_STORAGE("3"),
  DATA_MART("4"),
  ELK("5"),
  ELS_CSTOOL("6"),
  CLICKHOUSE("7"),
  HDFS("8"),
  KAFKA_TOPIC_BINLOG("1,2"),
  STORAGE("3,4,5,6,7,8"),
  ALL("0,1,2,3,4,5,6,7,8"),
  UN_KNOW("-2,-1,9,10,11,12");

  private final String code;

  FailedAtType(String code) {
    this.code = code;
  }

  public String[] codeAsList() {
    return code.split(",");
  }

  public String getCode() {
    return code;
  }

  public static FailedAtType fromCode(String code) {
    if (code == null) {
      return null;
    }

    for (FailedAtType type : values()) {
      if (type.code.contains(code)) {
        return type;
      }
    }
    return UN_KNOW;
  }
}
