package com.olive.upi.transport.model.lib;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Configuration {
    public String backgroundColor;
    public String payerBankName;
    public String resendOTPFeature;

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public String getPayerBankName() {
        return this.payerBankName;
    }

    public void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public void setPayerBankName(String str) {
        this.payerBankName = str;
    }

    public void setResendOTPFeature(String str) {
        this.resendOTPFeature = str;
    }
}
