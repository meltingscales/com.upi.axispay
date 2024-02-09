package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class UpdateMandate {
    public Cred cred;
    public String customerid;
    public DeviceDetails device;
    public String newstate;
    public String purposecode = C0059ao.a(4514);
    public String txnid;
    public String umn;
    public String validityEnd;
    public String validityStart;

    public Cred getCred() {
        return this.cred;
    }

    public String getCustomerid() {
        return this.customerid;
    }

    public DeviceDetails getDevice() {
        return this.device;
    }

    public String getNewstate() {
        return this.newstate;
    }

    public String getPurposecode() {
        return this.purposecode;
    }

    public String getTxnid() {
        return this.txnid;
    }

    public String getUmn() {
        return this.umn;
    }

    public String getValidityEnd() {
        return this.validityEnd;
    }

    public String getValidityStart() {
        return this.validityStart;
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

    public void setNewstate(String str) {
        this.newstate = str;
    }

    public void setPurposecode(String str) {
        this.purposecode = str;
    }

    public void setTxnid(String str) {
        this.txnid = str;
    }

    public void setUmn(String str) {
        this.umn = str;
    }

    public void setValidityEnd(String str) {
        this.validityEnd = str;
    }

    public void setValidityStart(String str) {
        this.validityStart = str;
    }
}
