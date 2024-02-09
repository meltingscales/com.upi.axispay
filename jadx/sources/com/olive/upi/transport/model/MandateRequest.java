package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MandateRequest {
    public Account ac;
    public String amount;
    public String approvalref;
    public Cred cred;
    public String customerid;
    public String customerrefid;
    public DeviceDetails device;
    public Mandate mandate;
    public String mcc;
    public String minamount;
    public String orderid;
    public Payee payee;
    public String payervpa;
    public String refurl;
    public String remarks;
    public String txnid;

    public Account getAc() {
        return this.ac;
    }

    public String getAmount() {
        return this.amount;
    }

    public String getApprovalref() {
        return this.approvalref;
    }

    public Cred getCred() {
        return this.cred;
    }

    public String getCustomerid() {
        return this.customerid;
    }

    public String getCustomerrefid() {
        return this.customerrefid;
    }

    public DeviceDetails getDevice() {
        return this.device;
    }

    public Mandate getMandate() {
        return this.mandate;
    }

    public String getMcc() {
        return this.mcc;
    }

    public String getMinamount() {
        return this.minamount;
    }

    public String getOrderid() {
        return this.orderid;
    }

    public Payee getPayee() {
        return this.payee;
    }

    public String getPayervpa() {
        return this.payervpa;
    }

    public String getRefurl() {
        return this.refurl;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getTxnid() {
        return this.txnid;
    }

    public void setAc(Account account) {
        this.ac = account;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setApprovalref(String str) {
        this.approvalref = str;
    }

    public void setCred(Cred cred) {
        this.cred = cred;
    }

    public void setCustomerid(String str) {
        this.customerid = str;
    }

    public void setCustomerrefid(String str) {
        this.customerrefid = str;
    }

    public void setDevice(DeviceDetails deviceDetails) {
        this.device = deviceDetails;
    }

    public void setMandate(Mandate mandate) {
        this.mandate = mandate;
    }

    public void setMcc(String str) {
        this.mcc = str;
    }

    public void setMinamount(String str) {
        this.minamount = str;
    }

    public void setOrderid(String str) {
        this.orderid = str;
    }

    public void setPayee(Payee payee) {
        this.payee = payee;
    }

    public void setPayervpa(String str) {
        this.payervpa = str;
    }

    public void setRefurl(String str) {
        this.refurl = str;
    }

    public void setRemarks(String str) {
        this.remarks = str;
    }

    public void setTxnid(String str) {
        this.txnid = str;
    }
}
