package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class GCMMessage {
    public String Bene_name;
    public String Remarks;
    public String amount;
    public String benevpa;
    public String expiry;
    public String message;
    public String refid;
    public String remittervpa;
    public String title;
    public String txnid;

    public String getAmount() {
        return this.amount;
    }

    public String getBene_name() {
        return this.Bene_name;
    }

    public String getBenevpa() {
        return this.benevpa;
    }

    public String getExpiry() {
        return this.expiry;
    }

    public String getMessage() {
        return this.message;
    }

    public String getRefid() {
        return this.refid;
    }

    public String getRemarks() {
        return this.Remarks;
    }

    public String getRemittervpa() {
        return this.remittervpa;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTxnid() {
        return this.txnid;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setBene_name(String str) {
        this.Bene_name = str;
    }

    public void setBenevpa(String str) {
        this.benevpa = str;
    }

    public void setExpiry(String str) {
        this.expiry = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setRefid(String str) {
        this.refid = str;
    }

    public void setRemarks(String str) {
        this.Remarks = str;
    }

    public void setRemittervpa(String str) {
        this.remittervpa = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTxnid(String str) {
        this.txnid = str;
    }
}
