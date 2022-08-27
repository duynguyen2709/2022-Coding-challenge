package com.example.demo.Class;

import com.example.demo.Class.Response.DataResponse;
import com.example.demo.Class.Response.ErrorResponse;

import java.util.HashMap;
import java.util.Map;

public class ApiResponse {

    private DataResponse data;
    private ErrorResponse error;

    public ApiResponse(Incident[] incidents,Offcier[] offciers, String code, String message) {
        this.data = new DataResponse(incidents, offciers);
        this.error = new ErrorResponse(code, message);
    }

    public DataResponse getData() {
        return data;
    }

    public void setData(DataResponse data) {
        this.data = data;
    }

    public ErrorResponse getError() {
        return error;
    }

    public void setError(ErrorResponse error) {
        this.error = error;
    }
}
