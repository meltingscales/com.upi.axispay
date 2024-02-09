package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ReqMandateTxn {
    public String appid;
    public String customerid;
    public String pageSize;
    public String timestamp;
    public String txnid;
    public String umn;

    public String getAppid() {
        return this.appid;
    }

    public String getCustomerid() {
        return this.customerid;
    }

    public String getPageSize() {
        return this.pageSize;
    }

    public String getTimestamp() {
        return this.timestamp;
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

    public void setPageSize(String str) {
        this.pageSize = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setTxnid(String str) {
        this.txnid = str;
    }

    public void setUmn(String str) {
        this.umn = str;
    }
}
