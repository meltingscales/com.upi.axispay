package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AccountOTPRequest implements CheckSum {
    public Account ac;
    public String bankId;
    public String card;
    public String customerId;
    public DeviceDetails device;
    public String expiry;
    public String txnId;

    public Account getAc() {
        return this.ac;
    }

    public String getBankId() {
        return this.bankId;
    }

    public String getCard() {
        return this.card;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public DeviceDetails getDevice() {
        return this.device;
    }

    public String getExpiry() {
        return this.expiry;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.bankId + this.customerId + this.device.getInput() + this.txnId + this.ac.getInput();
    }

    public String getTxnId() {
        return this.txnId;
    }

    public void setAc(Account account) {
        this.ac = account;
    }

    public void setBankId(String str) {
        this.bankId = str;
    }

    public void setCard(String str) {
        this.card = str;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setDevice(DeviceDetails deviceDetails) {
        this.device = deviceDetails;
    }

    public void setExpiry(String str) {
        this.expiry = str;
    }

    public void setTxnId(String str) {
        this.txnId = str;
    }
}
