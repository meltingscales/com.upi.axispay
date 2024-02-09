package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CollectRequest {
    public Account account;
    public Double amount;
    public BeneVpa beneVpa;
    public String date;
    public String remarks;

    public CollectRequest(Account account, BeneVpa beneVpa, Double d, String str, String str2) {
        this.account = account;
        this.beneVpa = beneVpa;
        this.amount = d;
        this.remarks = str;
        this.date = str2;
    }

    public Account getAccount() {
        return this.account;
    }

    public Double getAmount() {
        return this.amount;
    }

    public BeneVpa getBeneVpa() {
        return this.beneVpa;
    }

    public String getDate() {
        return this.date;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setAmount(Double d) {
        this.amount = d;
    }

    public void setBeneVpa(BeneVpa beneVpa) {
        this.beneVpa = beneVpa;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setRemarks(String str) {
        this.remarks = str;
    }
}
