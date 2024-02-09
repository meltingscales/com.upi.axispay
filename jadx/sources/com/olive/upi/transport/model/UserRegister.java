package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class UserRegister {
    public String confirmPassword;
    public String custEmail;
    public String custName;
    public String referralVpa;
    public String regType;

    public UserRegister(String str, String str2, String str3, String str4, String str5) {
        this.confirmPassword = str;
        this.custName = str2;
        this.custEmail = str3;
        this.referralVpa = str4;
        this.regType = str5;
    }

    public String getConfirmPassword() {
        return this.confirmPassword;
    }

    public String getCustEmail() {
        return this.custEmail;
    }

    public String getCustName() {
        return this.custName;
    }

    public String getReferralVpa() {
        return this.referralVpa;
    }

    public String getRegType() {
        return this.regType;
    }

    public void setConfirmPassword(String str) {
        this.confirmPassword = str;
    }

    public void setCustEmail(String str) {
        this.custEmail = str;
    }

    public void setCustName(String str) {
        this.custName = str;
    }

    public void setReferralVpa(String str) {
        this.referralVpa = str;
    }

    public void setRegType(String str) {
        this.regType = str;
    }
}
