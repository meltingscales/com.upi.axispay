package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ProfileVpa {
    public DeviceDetails deviceInfo;
    public String mobilenumber;
    public String vpa;

    public DeviceDetails getDeviceInfo() {
        return this.deviceInfo;
    }

    public String getMobilenumber() {
        return this.mobilenumber;
    }

    public String getVpa() {
        return this.vpa;
    }

    public void setDeviceInfo(DeviceDetails deviceDetails) {
        this.deviceInfo = deviceDetails;
    }

    public void setMobilenumber(String str) {
        this.mobilenumber = str;
    }

    public void setVpa(String str) {
        this.vpa = str;
    }
}
