package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BRequest implements CheckSum {
    public Account ac;
    public String bankid;
    public Cred cred;
    public String customerId;
    public DeviceDetails device;
    public String txnid;
    public String vpa;

    public Account getAc() {
        return this.ac;
    }

    public String getBankid() {
        return this.bankid;
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

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.ac.getInput() + this.bankid + this.cred.getInput() + this.device.getInput() + this.customerId + this.txnid + this.vpa;
    }

    public String getTxnid() {
        return this.txnid;
    }

    public String getVpa() {
        return this.vpa;
    }

    public void setAc(Account account) {
        this.ac = account;
    }

    public void setBankid(String str) {
        this.bankid = str;
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

    public void setTxnid(String str) {
        this.txnid = str;
    }

    public void setVpa(String str) {
        this.vpa = str;
    }
}
