package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AcctUpdateReq implements CheckSum {
    public Account account;
    public DeviceDetails device;
    public String txnId;

    public Account getAccount() {
        return this.account;
    }

    public DeviceDetails getDevice() {
        return this.device;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.account.getInput() + this.device.getInput() + this.txnId;
    }

    public String getTxnId() {
        return this.txnId;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setDevice(DeviceDetails deviceDetails) {
        this.device = deviceDetails;
    }

    public void setTxnId(String str) {
        this.txnId = str;
    }
}
