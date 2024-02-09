package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Response {
    private Integer code;
    private String message;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
