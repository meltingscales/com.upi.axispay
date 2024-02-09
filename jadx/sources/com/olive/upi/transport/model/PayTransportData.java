package com.olive.upi.transport.model;

import com.olive.upi.transport.model.lib.PaymentSalt;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PayTransportData extends LibTransportData {
    public String billId;
    public String billInfo;
    private String payeeName;
    public PayRequest payrequest;
    private String refUrl;
    public PaymentSalt salt;
    public String umnId;

    public String getBillId() {
        return this.billId;
    }

    public String getBillInfo() {
        return this.billInfo;
    }

    public String getPayeeName() {
        return this.payeeName;
    }

    public PayRequest getPayrequest() {
        return this.payrequest;
    }

    public String getRefUrl() {
        return this.refUrl;
    }

    public PaymentSalt getSalt() {
        return this.salt;
    }

    public String getUmnId() {
        return this.umnId;
    }

    public void setBillId(String str) {
        this.billId = str;
    }

    public void setBillInfo(String str) {
        this.billInfo = str;
    }

    public void setPayeeName(String str) {
        this.payeeName = str;
    }

    public void setPayrequest(PayRequest payRequest) {
        this.payrequest = payRequest;
    }

    public void setRefUrl(String str) {
        this.refUrl = str;
    }

    public void setSalt(PaymentSalt paymentSalt) {
        this.salt = paymentSalt;
    }

    public void setUmnId(String str) {
        this.umnId = str;
    }
}
