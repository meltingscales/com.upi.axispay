package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PaymentRequest {
    public String amount;
    public String bene;
    public String remarks;
    public String remittor;
    public String txnid;

    public String getAmount() {
        return this.amount;
    }

    public String getBene() {
        return this.bene;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getRemittor() {
        return this.remittor;
    }

    public String getTxnid() {
        return this.txnid;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setBene(String str) {
        this.bene = str;
    }

    public void setRemarks(String str) {
        this.remarks = str;
    }

    public void setRemittor(String str) {
        this.remittor = str;
    }

    public void setTxnid(String str) {
        this.txnid = str;
    }

    public String toString() {
        return C0059ao.a(6213) + this.txnid + '\'' + C0059ao.a(6214) + this.amount + '\'' + C0059ao.a(6215) + this.bene + '\'' + C0059ao.a(6216) + this.remittor + '\'' + C0059ao.a(6217) + this.remarks + "'}";
    }
}
