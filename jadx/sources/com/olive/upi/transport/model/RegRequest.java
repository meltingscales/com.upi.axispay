package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class RegRequest {
    public Account ac;
    public Cred atmpincred;
    public String bank;
    public String card;
    public String customerid;
    public DeviceDetails device;
    public String expiry;
    public Cred mpincred;
    public Cred otpcred;
    public String regtype;
    public String txnId;

    public Account getAc() {
        return this.ac;
    }

    public Cred getAtmpincred() {
        return this.atmpincred;
    }

    public String getBank() {
        return this.bank;
    }

    public String getCard() {
        return this.card;
    }

    public String getCustomerid() {
        return this.customerid;
    }

    public DeviceDetails getDevice() {
        return this.device;
    }

    public String getExpiry() {
        return this.expiry;
    }

    public Cred getMpincred() {
        return this.mpincred;
    }

    public Cred getOtpcred() {
        return this.otpcred;
    }

    public String getRegtype() {
        return this.regtype;
    }

    public String getTxnId() {
        return this.txnId;
    }

    public void setAc(Account account) {
        this.ac = account;
    }

    public void setAtmpincred(Cred cred) {
        this.atmpincred = cred;
    }

    public void setBank(String str) {
        this.bank = str;
    }

    public void setCard(String str) {
        this.card = str;
    }

    public void setCustomerid(String str) {
        this.customerid = str;
    }

    public void setDevice(DeviceDetails deviceDetails) {
        this.device = deviceDetails;
    }

    public void setExpiry(String str) {
        this.expiry = str;
    }

    public void setMpincred(Cred cred) {
        this.mpincred = cred;
    }

    public void setOtpcred(Cred cred) {
        this.otpcred = cred;
    }

    public void setRegtype(String str) {
        this.regtype = str;
    }

    public void setTxnId(String str) {
        this.txnId = str;
    }
}
