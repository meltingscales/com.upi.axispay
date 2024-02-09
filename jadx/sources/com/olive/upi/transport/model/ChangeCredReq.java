package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ChangeCredReq {
    public Account ac;
    public String bank;
    public Cred cred;
    public String customerid;
    public DeviceDetails device;
    public Cred newcred;
    public String txnid;

    public Account getAc() {
        return this.ac;
    }

    public String getBank() {
        return this.bank;
    }

    public Cred getCred() {
        return this.cred;
    }

    public String getCustomerid() {
        return this.customerid;
    }

    public DeviceDetails getDevice() {
        return this.device;
    }

    public Cred getNewcred() {
        return this.newcred;
    }

    public String getTxnid() {
        return this.txnid;
    }

    public void setAc(Account account) {
        this.ac = account;
    }

    public void setBank(String str) {
        this.bank = str;
    }

    public void setCred(Cred cred) {
        this.cred = cred;
    }

    public void setCustomerid(String str) {
        this.customerid = str;
    }

    public void setDevice(DeviceDetails deviceDetails) {
        this.device = deviceDetails;
    }

    public void setNewcred(Cred cred) {
        this.newcred = cred;
    }

    public void setTxnid(String str) {
        this.txnid = str;
    }
}
