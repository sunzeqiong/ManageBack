package com.example.demo.Config.Response;

import java.util.List;

public class RetResponse {
    private final static String SUCCESS = "success";

    public static <T> ResponseData<T> makeOKRsp() {
        return new ResponseData<T>().setCode(RetCode.SUCCESS).setMsg(SUCCESS);
    }

    public static <T> ResponseData<T> makeOKRsp(List<List> data) {
        return new ResponseData<T>().setCode(RetCode.SUCCESS).setMsg("成功").setData((T) data);
    }

    public static <T> ResponseData<T> makeErrRsp(String message) {
        return new ResponseData<T>().setCode(RetCode.FAIL).setMsg(message);
    }

    public static <T> ResponseData<T> makeRsp(int code, String msg) {
        return new ResponseData<T>().setCode(code).setMsg(msg);
    }

    public static <T> ResponseData<T> makeRsp(int code, String msg, T data) {
        return new ResponseData<T>().setCode(code).setMsg(msg).setData(data);
    }

}
