package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class VpaVerify {
    public String customerid;
    public DeviceDetails device;
    public PayerInfo payerinfo;
    public String vpa;

    public String getCustomerid() {
        return this.customerid;
    }

    public DeviceDetails getDevice() {
        return this.device;
    }

    public PayerInfo getPayerInfo() {
        return this.payerinfo;
    }

    public String getVpa() {
        return this.vpa;
    }

    public void setCustomerid(String str) {
        this.customerid = str;
    }

    public void setDevice(DeviceDetails deviceDetails) {
        this.device = deviceDetails;
    }

    public void setPayerInfo(PayerInfo payerInfo) {
        this.payerinfo = payerInfo;
    }

    public void setVpa(String str) {
        this.vpa = str;
    }
}
