package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ChangeAppPin implements CheckSum {
    public DeviceDetails deviceDetails;
    public String newPin;
    public String oldPin;
    public String type;

    public DeviceDetails getDeviceDetails() {
        return this.deviceDetails;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.deviceDetails.getInput() + this.newPin + this.oldPin;
    }

    public String getNewPin() {
        return this.newPin;
    }

    public String getOldPin() {
        return this.oldPin;
    }

    public String getType() {
        return this.type;
    }

    public void setDeviceDetails(DeviceDetails deviceDetails) {
        this.deviceDetails = deviceDetails;
    }

    public void setNewPin(String str) {
        this.newPin = str;
    }

    public void setOldPin(String str) {
        this.oldPin = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
