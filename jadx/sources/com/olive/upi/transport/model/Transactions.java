package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Transactions {
    private String amount;
    private String date;
    private String fromAcc;
    private String fromName;
    private String remarks;
    private String status;
    private String toAcc;
    private String toName;
    private String tranType;
    private String tranid;

    public Transactions() {
    }

    public String getAmount() {
        return this.amount;
    }

    public String getDate() {
        return this.date;
    }

    public String getFromAcc() {
        return this.fromAcc;
    }

    public String getFromName() {
        return this.fromName;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getStatus() {
        return this.status;
    }

    public String getToAcc() {
        return this.toAcc;
    }

    public String getToName() {
        return this.toName;
    }

    public String getTranType() {
        return this.tranType;
    }

    public String getTranid() {
        return this.tranid;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setFromAcc(String str) {
        this.fromAcc = str;
    }

    public void setFromName(String str) {
        this.fromName = str;
    }

    public void setRemarks(String str) {
        this.remarks = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setToAcc(String str) {
        this.toAcc = str;
    }

    public void setToName(String str) {
        this.toName = str;
    }

    public void setTranType(String str) {
        this.tranType = str;
    }

    public void setTranid(String str) {
        this.tranid = str;
    }

    public Transactions(String str, String str2, String str3, String str4, String str5) {
        this.tranid = str;
        this.date = str2;
        this.amount = str3;
        this.tranType = str4;
        this.remarks = str5;
    }

    public Transactions(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.tranid = str;
        this.date = str2;
        this.fromAcc = str3;
        this.toAcc = str4;
        this.amount = str5;
        this.tranType = str6;
        this.status = str7;
        this.remarks = str8;
        this.fromName = str9;
        this.toName = str10;
    }
}
