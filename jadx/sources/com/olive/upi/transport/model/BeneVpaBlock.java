package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BeneVpaBlock {
    public String block;
    public String reason;
    public String txnid;
    public String vpa;

    public BeneVpaBlock(String str, String str2, String str3, String str4) {
        this.txnid = str;
        this.block = str2;
        this.vpa = str3;
        this.reason = str4;
    }

    public String getBlock() {
        return this.block;
    }

    public String getReason() {
        return this.reason;
    }

    public String getTxnid() {
        return this.txnid;
    }

    public String getVpa() {
        return this.vpa;
    }

    public void setBlock(String str) {
        this.block = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setTxnid(String str) {
        this.txnid = str;
    }

    public void setVpa(String str) {
        this.vpa = str;
    }
}
