package com.example.retrofitapp;


public class HttpResultNew<T> {
    private String errorCode;
    private String errorMsg;
    private boolean result;
    private T respObject;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public T getRespObject() {
        return respObject;
    }

    public void setRespObject(T respObject) {
        this.respObject = respObject;
    }

}
