package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CreditLineBalReqest {
    public String accountNumber;
    public String customerid;
    public String vpa;

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getCustomerid() {
        return this.customerid;
    }

    public String getVpa() {
        return this.vpa;
    }

    public void setAccountNumber(String str) {
        this.accountNumber = str;
    }

    public void setCustomerid(String str) {
        this.customerid = str;
    }

    public void setVpa(String str) {
        this.vpa = str;
    }
}
