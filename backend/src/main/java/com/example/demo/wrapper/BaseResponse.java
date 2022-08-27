package com.example.demo.wrapper;

import com.example.demo.constant.ReturnCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
@Accessors(chain = true)
public class BaseResponse<T> {

  private int returnCode;
  private String returnMessage;
  private T data;

  public static BaseResponse build() {
    return new BaseResponse();
  }

  public BaseResponse<T> ok(ReturnCode returnCode) {
    this.returnCode = returnCode.getCode();
    this.returnMessage = returnCode.getMessage();
    this.data = null;
    return this;
  }

  public BaseResponse<T> ok(T result) {
    this.returnCode = ReturnCode.SUCCESS.getCode();
    this.returnMessage = ReturnCode.SUCCESS.getMessage();
    this.data = result;
    return this;
  }

  public BaseResponse<T> fail(ReturnCode returnCode) {
    this.returnCode = returnCode.getCode();
    this.returnMessage = returnCode.getMessage();
    return this;
  }

  public int getReturnCode() {
    return returnCode;
  }

  public String getReturnMessage() {
    return returnMessage;
  }

  public T getData() {
    return data;
  }
}
