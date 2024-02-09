package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class RegCustomer {
    public String appPin;
    public String customerName;
    public DeviceDetails deviceDetails;
    public String email;
    public String refereevpa;
    public String regtype;
    public String vpa;

    public String getAppPin() {
        return this.appPin;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public DeviceDetails getDeviceDetails() {
        return this.deviceDetails;
    }

    public String getEmail() {
        return this.email;
    }

    public String getRefereevpa() {
        return this.refereevpa;
    }

    public String getRegtype() {
        return this.regtype;
    }

    public String getVpa() {
        return this.vpa;
    }

    public void setAppPin(String str) {
        this.appPin = str;
    }

    public void setCustomerName(String str) {
        this.customerName = str;
    }

    public void setDeviceDetails(DeviceDetails deviceDetails) {
        this.deviceDetails = deviceDetails;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setRefereevpa(String str) {
        this.refereevpa = str;
    }

    public void setRegtype(String str) {
        this.regtype = str;
    }

    public void setVpa(String str) {
        this.vpa = str;
    }
}
