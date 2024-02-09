package com.olive.upi.transport.model;

import java.util.Date;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BbpsHistory {
    public String amount;
    public String billername;
    public String mobilenumber;
    public String rrn;
    public String status;
    public Date txndate;

    public String getAmount() {
        return this.amount;
    }

    public String getBillername() {
        return this.billername;
    }

    public String getMobilenumber() {
        return this.mobilenumber;
    }

    public String getRrn() {
        return this.rrn;
    }

    public String getStatus() {
        return this.status;
    }

    public Date getTxndate() {
        return this.txndate;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setBillername(String str) {
        this.billername = str;
    }

    public void setMobilenumber(String str) {
        this.mobilenumber = str;
    }

    public void setRrn(String str) {
        this.rrn = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTxndate(Date date) {
        this.txndate = date;
    }
}
