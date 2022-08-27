package com.example.demo.wrapper;

import com.example.demo.constant.InfoType;
import com.example.demo.constant.IssueType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors(chain = true)
public class IssueInfo<T> {
  @JsonProperty("failed_at")
  private IssueType blockedAt;

  private String blockedBy;

  private InfoType type;
  private T value;

  public static IssueInfo build() {
    return new IssueInfo<>();
  }
}
