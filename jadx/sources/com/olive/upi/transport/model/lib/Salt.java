package com.olive.upi.transport.model.lib;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Salt {
    public String appId;
    public String deviceId;
    public String mobileNumber;
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

    public void setTxnId(String str) {
        this.txnId = str;
    }
}
