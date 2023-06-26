package com.API.demo_restapi.models.responses;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Currency;

import java.text.DecimalFormatSymbols;

public class DemoRestApiResponse<T> {
    @CreationTimestamp
    private long timestamp;

    private Boolean successful;
    private Integer code;
    private boolean success;
    private String message;
    private String status;
    private T data;


    public DemoRestApiResponse() {

        this.success = false;
    }

    public DemoRestApiResponse(T data) {

        this(true, data);
    }

    public DemoRestApiResponse(boolean success, T data) {
        this(success, data, 200);
    }

    public DemoRestApiResponse(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
    public DemoRestApiResponse(Boolean success, Integer code, String message,String status) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.status=status;
    }

    public DemoRestApiResponse(Boolean success, Integer code, String message, T data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public DemoRestApiResponse(boolean success, T data, Integer code) {
        this.success = success;
        this.code = code;
        this.data = data;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getSuccessful() {
        return successful;
    }

    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static DemoRestApiResponse success(String message) {
        return new DemoRestApiResponse<>(true, 200, message, null);
    }

    public static <T> DemoRestApiResponse success(String message, T data) {
        return new DemoRestApiResponse<T>(true, 200, message, data);
    }

    public static DemoRestApiResponse failed(String message) {
        return new DemoRestApiResponse<>(false, 400, message, null);
    }

    public static <T> DemoRestApiResponse failed(String message, T data) {
        return new DemoRestApiResponse<T>(false, 400, message, data);
    }
    public static <T> DemoRestApiResponse failed(String message,String status)
    {
        return new DemoRestApiResponse(false,400,message,status);
    }
}
