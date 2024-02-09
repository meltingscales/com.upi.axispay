package com.olive.upi.transport.api;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Result<T> {
    public String checkSum;
    public String code;
    public T data;
    public String mcccode;
    public String result;

    public String getCheckSum() {
        return this.checkSum;
    }

    public String getCode() {
        return this.code;
    }

    public T getData() {
        return this.data;
    }

    public String getMcccode() {
        return this.mcccode;
    }

    public String getResult() {
        return this.result;
    }

    public void setCheckSum(String str) {
        this.checkSum = str;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setData(T t) {
        this.data = t;
    }

    public void setMcccode(String str) {
        this.mcccode = str;
    }

    public void setResult(String str) {
        this.result = str;
    }
}