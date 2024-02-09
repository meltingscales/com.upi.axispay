package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class RecurrenceAuthorization {
    public Account account;
    public String action;
    public Cred cred;
    public DeviceDetails device;
    public String payeevpa;
    public String payervpa;
    public String txnid;
    public String umn;

    public Account getAccount() {
        return this.account;
    }

    public String getAction() {
        return this.action;
    }

    public Cred getCred() {
        return this.cred;
    }

    public DeviceDetails getDevice() {
        return this.device;
    }

    public String getPayeevpa() {
        return this.payeevpa;
    }

    public String getPayervpa() {
        return this.payervpa;
    }

    public String getTxnid() {
        return this.txnid;
    }

    public String getUmn() {
        return this.umn;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setCred(Cred cred) {
        this.cred = cred;
    }

    public void setDevice(DeviceDetails deviceDetails) {
        this.device = deviceDetails;
    }

    public void setPayeevpa(String str) {
        this.payeevpa = str;
    }

    public void setPayervpa(String str) {
        this.payervpa = str;
    }

    public void setTxnid(String str) {
        this.txnid = str;
    }

    public void setUmn(String str) {
        this.umn = str;
    }
}
