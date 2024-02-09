package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class VerifyVPA implements CheckSum {
    public String customerid;
    public String vpa;

    public String getCustomerid() {
        return this.customerid;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.customerid + this.vpa;
    }

    public String getVpa() {
        return this.vpa;
    }

    public void setCustomerid(String str) {
        this.customerid = str;
    }

    public void setVpa(String str) {
        this.vpa = str;
    }
}
