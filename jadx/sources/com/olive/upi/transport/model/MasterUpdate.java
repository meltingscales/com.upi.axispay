package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MasterUpdate {
    public int banner;
    public int bill_pay_max;
    public int dthOperator;
    public String encryptionFlag;
    public int mobileOperator;

    public int getBanner() {
        return this.banner;
    }

    public int getBill_pay_max() {
        return this.bill_pay_max;
    }

    public int getDthOperator() {
        return this.dthOperator;
    }

    public String getEncryptionFlag() {
        return this.encryptionFlag;
    }

    public int getMobileOperator() {
        return this.mobileOperator;
    }

    public void setBanner(int i) {
        this.banner = i;
    }

    public void setBill_pay_max(int i) {
        this.bill_pay_max = i;
    }

    public void setDthOperator(int i) {
        this.dthOperator = i;
    }

    public void setEncryptionFlag(String str) {
        this.encryptionFlag = str;
    }

    public void setMobileOperator(int i) {
        this.mobileOperator = i;
    }
}
