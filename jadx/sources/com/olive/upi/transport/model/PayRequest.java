package com.olive.upi.transport.model;

import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PayRequest extends Gst {
    public Account ac;
    public String amount;
    public Cred cred;
    public String customerId;
    public DeviceDetails device;
    private String initmode;
    private String mcc;
    private String minamount;
    private String orderId;
    public List<Payee> payees;
    private String purpose;
    private String refCategory;
    private String refUrl;
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

    public String getInitmode() {
        return this.initmode;
    }

    public String getMcc() {
        return this.mcc;
    }

    public String getMinamount() {
        return this.minamount;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public List<Payee> getPayees() {
        return this.payees;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public String getRefCategory() {
        return this.refCategory;
    }

    public String getRefUrl() {
        return this.refUrl;
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

    public void setInitmode(String str) {
        this.initmode = str;
    }

    public void setMcc(String str) {
        this.mcc = str;
    }

    public void setMinamount(String str) {
        this.minamount = str;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setPayees(List<Payee> list) {
        this.payees = list;
    }

    public void setPurpose(String str) {
        this.purpose = str;
    }

    public void setRefCategory(String str) {
        this.refCategory = str;
    }

    public void setRefUrl(String str) {
        this.refUrl = str;
    }

    public void setRemarks(String str) {
        this.remarks = str;
    }

    public void setTxnId(String str) {
        this.txnId = str;
    }
}
