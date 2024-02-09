package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AuthorizeMandateRequest {
    public Account account;
    public String action;
    public String blockReason;
    public Cred creds;
    public String customerid;
    public DeviceDetails device;
    public String txnid;
    public String umn;

    public Account getAccount() {
        return this.account;
    }

    public String getAction() {
        return this.action;
    }

    public String getBlockReason() {
        return this.blockReason;
    }

    public Cred getCreds() {
        return this.creds;
    }

    public String getCustomerid() {
        return this.customerid;
    }

    public DeviceDetails getDevice() {
        return this.device;
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

    public void setBlockReason(String str) {
        this.blockReason = str;
    }

    public void setCreds(Cred cred) {
        this.creds = cred;
    }

    public void setCustomerid(String str) {
        this.customerid = str;
    }

    public void setDevice(DeviceDetails deviceDetails) {
        this.device = deviceDetails;
    }

    public void setTxnid(String str) {
        this.txnid = str;
    }

    public void setUmn(String str) {
        this.umn = str;
    }
}
