package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PendingMandateReqVo implements CheckSum, Comparable {
    public String amount;
    public String amountRule;
    public String amountRuleValue;
    public String beneName;
    public String createdate;
    public String expdate;
    public String initmode;
    public String isrevokable;
    public String mandatetype;
    public String merchantflag = C0059ao.a(10148);
    public String mobile;
    public String mpinrequired;
    public String notes;
    public String payeeVpa;
    public String payerVpa;
    public String purposecode;
    public String recurrencePattern;
    public String recurrenceruletype;
    public String recurrencerulevalue;
    public String refid;
    public String refurl;
    public String remarks;
    public String rule_type;
    public String rule_value;
    public String sharewithpayee;
    public String status;
    public String txnid;
    public String umn;
    public String validity_end;
    public String validity_start;

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return 0;
    }

    public String getAmount() {
        return this.amount;
    }

    public String getAmountRule() {
        return this.amountRule;
    }

    public String getAmountRuleValue() {
        return this.amountRuleValue;
    }

    public String getBeneName() {
        return this.beneName;
    }

    public String getCreatedate() {
        return this.createdate;
    }

    public String getExpdate() {
        return this.expdate;
    }

    public String getInitmode() {
        return this.initmode;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return null;
    }

    public String getIsrevokable() {
        return this.isrevokable;
    }

    public String getMandatetype() {
        return this.mandatetype;
    }

    public String getMerchantflag() {
        return this.merchantflag;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getMpinrequired() {
        return this.mpinrequired;
    }

    public String getNotes() {
        return this.notes;
    }

    public String getPayeeVpa() {
        return this.payeeVpa;
    }

    public String getPayerVpa() {
        return this.payerVpa;
    }

    public String getPurposecode() {
        return this.purposecode;
    }

    public String getRecurrencePattern() {
        return this.recurrencePattern;
    }

    public String getRecurrenceruletype() {
        return this.recurrenceruletype;
    }

    public String getRecurrencerulevalue() {
        return this.recurrencerulevalue;
    }

    public String getRefid() {
        return this.refid;
    }

    public String getRefurl() {
        return this.refurl;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getRule_type() {
        return this.rule_type;
    }

    public String getRule_value() {
        return this.rule_value;
    }

    public String getSharewithpayee() {
        return this.sharewithpayee;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTxnid() {
        return this.txnid;
    }

    public String getUmn() {
        return this.umn;
    }

    public String getValidity_end() {
        return this.validity_end;
    }

    public String getValidity_start() {
        return this.validity_start;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setAmountRule(String str) {
        this.amountRule = str;
    }

    public void setAmountRuleValue(String str) {
        this.amountRuleValue = str;
    }

    public void setBeneName(String str) {
        this.beneName = str;
    }

    public void setCreatedate(String str) {
        this.createdate = str;
    }

    public void setExpdate(String str) {
        this.expdate = str;
    }

    public void setInitmode(String str) {
        this.initmode = str;
    }

    public void setIsrevokable(String str) {
        this.isrevokable = str;
    }

    public void setMandatetype(String str) {
        this.mandatetype = str;
    }

    public void setMerchantflag(String str) {
        this.merchantflag = str;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setMpinrequired(String str) {
        this.mpinrequired = str;
    }

    public void setNotes(String str) {
        this.notes = str;
    }

    public void setPayeeVpa(String str) {
        this.payeeVpa = str;
    }

    public void setPayerVpa(String str) {
        this.payerVpa = str;
    }

    public void setPurposecode(String str) {
        this.purposecode = str;
    }

    public void setRecurrencePattern(String str) {
        this.recurrencePattern = str;
    }

    public void setRecurrenceruletype(String str) {
        this.recurrenceruletype = str;
    }

    public void setRecurrencerulevalue(String str) {
        this.recurrencerulevalue = str;
    }

    public void setRefid(String str) {
        this.refid = str;
    }

    public void setRefurl(String str) {
        this.refurl = str;
    }

    public void setRemarks(String str) {
        this.remarks = str;
    }

    public void setRule_type(String str) {
        this.rule_type = str;
    }

    public void setRule_value(String str) {
        this.rule_value = str;
    }

    public void setSharewithpayee(String str) {
        this.sharewithpayee = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTxnid(String str) {
        this.txnid = str;
    }

    public void setUmn(String str) {
        this.umn = str;
    }

    public void setValidity_end(String str) {
        this.validity_end = str;
    }

    public void setValidity_start(String str) {
        this.validity_start = str;
    }
}
