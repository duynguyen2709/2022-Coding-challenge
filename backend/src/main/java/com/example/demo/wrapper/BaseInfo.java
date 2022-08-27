package com.example.demo.wrapper;

import com.example.demo.constant.FailedAtType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Map;

@Getter
@Setter
@EqualsAndHashCode
@Accessors(chain = true)
@JsonInclude(Include.NON_NULL)
public class BaseInfo {
  private Long id;
  private FailedAtType type;
  private String name;
  private String ipAddress;
  private Map<String, Object> extraInfo;

  public static BaseInfo build() {
    return new BaseInfo();
  }
}
