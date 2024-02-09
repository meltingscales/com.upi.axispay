package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AddVPA implements CheckSum {
    public String customerId;
    public String fullName;
    public String nickName;
    public String vpa;

    public String getCustomerId() {
        return this.customerId;
    }

    public String getFullName() {
        return this.fullName;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.customerId + this.vpa + this.fullName + this.nickName;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getVpa() {
        return this.vpa;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setFullName(String str) {
        this.fullName = str;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setVpa(String str) {
        this.vpa = str;
    }
}
