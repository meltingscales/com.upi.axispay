package com.olive.upi.transport.model.lib;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PaymentSalt {
    public String appId;
    public String deviceId;
    public String mobileNumber;
    public String payeeAddr;
    public String payerAddr;
    public String txnAmount;
    public String txnId;

    public String getAppId() {
        return this.appId;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public String getPayeeAddr() {
        return this.payeeAddr;
    }

    public String getPayerAddr() {
        return this.payerAddr;
    }

    public String getTxnAmount() {
        return this.txnAmount;
    }

    public String getTxnId() {
        return this.txnId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public void setPayeeAddr(String str) {
        this.payeeAddr = str;
    }

    public void setPayerAddr(String str) {
        this.payerAddr = str;
    }

    public void setTxnAmount(String str) {
        this.txnAmount = str;
    }

    public void setTxnId(String str) {
        this.txnId = str;
    }
}
