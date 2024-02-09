package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CollectPayRequest {
    public Account ac;
    public String amount;
    public Cred cred;
    public String customerId;
    public DeviceDetails device;
    public String remarks;
    public String txnId;

    public Account getAc() {
        return this.ac;
    }

    public String getAmount() {
        return this.amount;
    }

    public Cred getCred() {
        return this.cred;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public DeviceDetails getDevice() {
        return this.device;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getTxnId() {
        return this.txnId;
    }

    public void setAc(Account account) {
        this.ac = account;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setCred(Cred cred) {
        this.cred = cred;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setDevice(DeviceDetails deviceDetails) {
        this.device = deviceDetails;
    }

    public void setRemarks(String str) {
        this.remarks = str;
    }

    public void setTxnId(String str) {
        this.txnId = str;
    }
}
