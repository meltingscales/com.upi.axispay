package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CustomerVpa implements CheckSum {
    public String vpa;

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.vpa;
    }

    public String getVpa() {
        return this.vpa;
    }

    public void setVpa(String str) {
        this.vpa = str;
    }

    public String toString() {
        return this.vpa;
    }
}
