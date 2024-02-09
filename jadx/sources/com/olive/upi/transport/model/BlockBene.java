package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BlockBene implements CheckSum {
    public String block;
    public String customerid;
    public String txnid;
    public String vpa;

    public String getBlock() {
        return this.block;
    }

    public String getCustomerid() {
        return this.customerid;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.customerid + this.vpa + this.txnid + this.block;
    }

    public String getTxnid() {
        return this.txnid;
    }

    public String getVpa() {
        return this.vpa;
    }

    public void setBlock(String str) {
        this.block = str;
    }

    public void setCustomerid(String str) {
        this.customerid = str;
    }

    public void setTxnid(String str) {
        this.txnid = str;
    }

    public void setVpa(String str) {
        this.vpa = str;
    }
}
