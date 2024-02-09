package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PayerInfo {
    public String accountnumber;
    public String mcc;
    public String name;
    public String payervpa;

    public String getAccountnumber() {
        return this.accountnumber;
    }

    public String getMcc() {
        return this.mcc;
    }

    public String getName() {
        return this.name;
    }

    public String getPayervpa() {
        return this.payervpa;
    }

    public void setAccountnumber(String str) {
        this.accountnumber = str;
    }

    public void setMcc(String str) {
        this.mcc = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPayervpa(String str) {
        this.payervpa = str;
    }
}
