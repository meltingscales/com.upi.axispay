package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CheckStatus {
    public String initiatedby;
    public String mobilenumber;
    public String orderid;
    public String rrn;
    public String subtype;
    public String tranid;

    public String getInitiatedby() {
        return this.initiatedby;
    }

    public String getMobilenumber() {
        return this.mobilenumber;
    }

    public String getOrderid() {
        return this.orderid;
    }

    public String getRrn() {
        return this.rrn;
    }

    public String getSubtype() {
        return this.subtype;
    }

    public String getTranid() {
        return this.tranid;
    }

    public void setInitiatedby(String str) {
        this.initiatedby = str;
    }

    public void setMobilenumber(String str) {
        this.mobilenumber = str;
    }

    public void setOrderid(String str) {
        this.orderid = str;
    }

    public void setRrn(String str) {
        this.rrn = str;
    }

    public void setSubtype(String str) {
        this.subtype = str;
    }

    public void setTranid(String str) {
        this.tranid = str;
    }

    public void setUdir(String str) {
    }
}
