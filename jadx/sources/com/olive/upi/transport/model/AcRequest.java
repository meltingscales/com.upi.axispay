package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AcRequest implements CheckSum {
    public String bankId;
    public String customerId;
    public DeviceDetails device;
    public String txnId;

    public String getBankId() {
        return this.bankId;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public DeviceDetails getDevice() {
        return this.device;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.bankId + this.customerId + this.device.getInput() + this.txnId;
    }

    public String getTxnId() {
        return this.txnId;
    }

    public void setBankId(String str) {
        this.bankId = str;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setDevice(DeviceDetails deviceDetails) {
        this.device = deviceDetails;
    }

    public void setTxnId(String str) {
        this.txnId = str;
    }

    public String toString() {
        return this.bankId + this.customerId + this.device.getInput() + this.txnId;
    }
}
