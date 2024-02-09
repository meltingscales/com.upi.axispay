package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class GetMandate {
    public String appid;
    public String customerid;
    public String txnid;
    public String umn;

    public GetMandate(String str, String str2, String str3) {
        this.customerid = str;
        this.txnid = str2;
        this.umn = str3;
    }

    public String getAppid() {
        return this.appid;
    }

    public String getCustomerid() {
        return this.customerid;
    }

    public String getTxnid() {
        return this.txnid;
    }

    public String getUmn() {
        return this.umn;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setCustomerid(String str) {
        this.customerid = str;
    }

    public void setTxnid(String str) {
        this.txnid = str;
    }

    public void setUmn(String str) {
        this.umn = str;
    }

    public GetMandate() {
    }
}
