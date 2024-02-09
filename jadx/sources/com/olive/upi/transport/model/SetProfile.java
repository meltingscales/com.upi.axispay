package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SetProfile {
    public String accountNo;
    public String vpa;

    public SetProfile(String str, String str2) {
        this.vpa = str;
        this.accountNo = str2;
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    public String getVpa() {
        return this.vpa;
    }

    public void setAccountNo(String str) {
        this.accountNo = str;
    }

    public void setVpa(String str) {
        this.vpa = str;
    }
}
