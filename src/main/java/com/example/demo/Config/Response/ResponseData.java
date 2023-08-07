package com.example.demo.Config.Response;

public class ResponseData<T> {
    public int code;

    private String msg;

    private T data;

    public ResponseData<T> setCode(RetCode retResponse) {
        this.code = retResponse.code;
        return this;
    }

    public int getCode() {
        return code;
    }

    public ResponseData<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResponseData<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResponseData<T> setData(T data) {
        this.data = data;
        return this;
    }

}
