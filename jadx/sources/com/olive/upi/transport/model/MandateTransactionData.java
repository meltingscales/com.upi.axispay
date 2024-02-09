package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MandateTransactionData extends TransactionData {
    public String acceptType;
    private String amountRule;
    private String blockFund = C0059ao.a(7573);
    public String debitAccountNo;
    public String endmandate;
    public String limitTranx;
    public int mandateType;
    public String occurence;
    public Payee payeeData;
    private String recurrence;
    public String shareToPayee;
    public String startMandate;
    public String transactionOn;
    private String umnId;

    public String getAcceptType() {
        return this.acceptType;
    }

    public String getAmountRule() {
        return this.amountRule;
    }

    public String getBlockFund() {
        return this.blockFund;
    }

    public String getDebitAccountNo() {
        return this.debitAccountNo;
    }

    public String getEndmandate() {
        return this.endmandate;
    }

    public String getLimitTranx() {
        return this.limitTranx;
    }

    public int getMandateType() {
        return this.mandateType;
    }

    public String getOccurence() {
        return this.occurence;
    }

    public Payee getPayeeData() {
        return this.payeeData;
    }

    public String getRecurrence() {
        return this.recurrence;
    }

    public String getSharetoPayee() {
        return this.shareToPayee;
    }

    public String getStartMandate() {
        return this.startMandate;
    }

    public String getTransactionOn() {
        return this.transactionOn;
    }

    public String getUmnID() {
        return this.umnId;
    }

    public void setAcceptType(String str) {
        this.acceptType = str;
    }

    public void setAmountRule(String str) {
        this.amountRule = str;
    }

    public void setBlockFund(String str) {
        this.blockFund = str;
    }

    public void setDebitAccountNo(String str) {
        this.debitAccountNo = str;
    }

    public void setEndmandate(String str) {
        this.endmandate = str;
    }

    public void setLimitTranx(String str) {
        this.limitTranx = str;
    }

    public void setMandateType(int i) {
        this.mandateType = i;
    }

    public void setOccurence(String str) {
        this.occurence = str;
    }

    public void setPayeeData(Payee payee) {
        this.payeeData = payee;
    }

    public void setRecurrence(String str) {
        this.recurrence = str;
    }

    public void setSharetoPayee(String str) {
        this.shareToPayee = str;
    }

    public void setStartMandate(String str) {
        this.startMandate = str;
    }

    public void setTransactionOn(String str) {
        this.transactionOn = str;
    }

    public void setUmnID(String str) {
        this.umnId = str;
    }
}
