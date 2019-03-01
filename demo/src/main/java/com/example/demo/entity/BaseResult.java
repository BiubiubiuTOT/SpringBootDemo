package com.example.demo.entity;

public class BaseResult<T> {
    public static final int SUCCESS = 200;
    public static final int FAIL = 400;

    private Integer code;
    private String msg;
    private T result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public BaseResult(int code, String msg, T result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public BaseResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
