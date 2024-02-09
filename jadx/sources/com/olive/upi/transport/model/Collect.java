package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Collect implements CheckSum {
    public Account ac;
    public String amount;
    public String bankId;
    public String customerId;
    public DeviceDetails device;
    public String expiry;
    public String initmode;
    public String payerVpa;
    public String purpose;
    public String refCategory;
    public String remarks;
    public String txnId;
    public String vpa;

    public Account getAc() {
        return this.ac;
    }

    public String getAmount() {
        return this.amount;
    }

    public String getBankId() {
        return this.bankId;
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

    public String getInitmode() {
        return this.initmode;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.ac.getInput() + this.amount + this.bankId + this.customerId + this.device.getInput() + this.payerVpa + this.remarks + this.txnId + this.vpa + this.expiry;
    }

    public String getPayerVpa() {
        return this.payerVpa;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public String getRefCategory() {
        return this.refCategory;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getTxnId() {
        return this.txnId;
    }

    public String getVpa() {
        return this.vpa;
    }

    public void setAc(Account account) {
        this.ac = account;
    }

    public void setAmount(String str) {
        this.amount = str;
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

    public void setExpiry(String str) {
        this.expiry = str;
    }

    public void setInitmode(String str) {
        this.initmode = str;
    }

    public void setPayerVpa(String str) {
        this.payerVpa = str;
    }

    public void setPurpose(String str) {
        this.purpose = str;
    }

    public void setRefCategory(String str) {
        this.refCategory = str;
    }

    public void setRemarks(String str) {
        this.remarks = str;
    }

    public void setTxnId(String str) {
        this.txnId = str;
    }

    public void setVpa(String str) {
        this.vpa = str;
    }
}
