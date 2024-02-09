package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class RewardsVO {
    public String createdUpiId;
    public String firstTimeBillPaymentDone;
    public String mobilenumber;
    public String refferedFD;
    public String successfulTxnsCount;
    public String viewedUpiStatement;

    public String getCreatedUpiId() {
        return this.createdUpiId;
    }

    public String getFirstTimeBillPaymentDone() {
        return this.firstTimeBillPaymentDone;
    }

    public String getMobilenumber() {
        return this.mobilenumber;
    }

    public String getRefferedFD() {
        return this.refferedFD;
    }

    public String getSuccessfulTxnsCount() {
        return this.successfulTxnsCount;
    }

    public String getViewedUpiStatement() {
        return this.viewedUpiStatement;
    }

    public void setCreatedUpiId(String str) {
        this.createdUpiId = str;
    }

    public void setFirstTimeBillPaymentDone(String str) {
        this.firstTimeBillPaymentDone = str;
    }

    public void setMobilenumber(String str) {
        this.mobilenumber = str;
    }

    public void setRefferedFD(String str) {
        this.refferedFD = str;
    }

    public void setSuccessfulTxnsCount(String str) {
        this.successfulTxnsCount = str;
    }

    public void setViewedUpiStatement(String str) {
        this.viewedUpiStatement = str;
    }
}
