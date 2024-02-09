package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CustomerAcRequest implements CheckSum {
    public String customerId;
    public DeviceDetails deviceDetails;

    public String getCustomerId() {
        return this.customerId;
    }

    public DeviceDetails getDeviceDetails() {
        return this.deviceDetails;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.customerId + this.deviceDetails.getInput();
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setDeviceDetails(DeviceDetails deviceDetails) {
        this.deviceDetails = deviceDetails;
    }
}
