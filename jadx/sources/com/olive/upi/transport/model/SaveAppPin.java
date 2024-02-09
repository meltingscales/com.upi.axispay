package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SaveAppPin {
    public String appPin;
    public String customerId;
    public DeviceDetails deviceDetails;

    public String getAppPin() {
        return this.appPin;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public DeviceDetails getDeviceDetails() {
        return this.deviceDetails;
    }

    public void setAppPin(String str) {
        this.appPin = str;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setDeviceDetails(DeviceDetails deviceDetails) {
        this.deviceDetails = deviceDetails;
    }
}
