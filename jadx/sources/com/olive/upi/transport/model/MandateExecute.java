package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MandateExecute {
    public String amount;
    public String amountrule;
    public String customerid;
    public String execute;
    public String remarks;
    public String umn;
    public String validityend;
    public String validitystart;
    public String initmode = C0059ao.a(32);
    public String seqNum = C0059ao.a(33);

    public String getAmount() {
        return this.amount;
    }

    public String getAmountrule() {
        return this.amountrule;
    }

    public String getCustomerid() {
        return this.customerid;
    }

    public String getExecute() {
        return this.execute;
    }

    public String getInitMode() {
        return this.initmode;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getSeqNum() {
        return this.seqNum;
    }

    public String getUmn() {
        return this.umn;
    }

    public String getValidityend() {
        return this.validityend;
    }

    public String getValiditystart() {
        return this.validitystart;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setAmountrule(String str) {
        this.amountrule = str;
    }

    public void setCustomerid(String str) {
        this.customerid = str;
    }

    public void setExecute(String str) {
        this.execute = str;
    }

    public void setInitMode(String str) {
        this.initmode = str;
    }

    public void setRemarks(String str) {
        this.remarks = str;
    }

    public void setSeqNum(String str) {
        this.seqNum = str;
    }

    public void setUmn(String str) {
        this.umn = str;
    }

    public void setValidityend(String str) {
        this.validityend = str;
    }

    public void setValiditystart(String str) {
        this.validitystart = str;
    }
}
