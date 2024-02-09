package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BillPay {
    public String billid;
    public String billinfo;
    public PayRequest payRequest;

    public String getBillid() {
        return this.billid;
    }

    public String getBillinfo() {
        return this.billinfo;
    }

    public PayRequest getPayRequest() {
        return this.payRequest;
    }

    public void setBillid(String str) {
        this.billid = str;
    }

    public void setBillinfo(String str) {
        this.billinfo = str;
    }

    public void setPayRequest(PayRequest payRequest) {
        this.payRequest = payRequest;
    }
}
