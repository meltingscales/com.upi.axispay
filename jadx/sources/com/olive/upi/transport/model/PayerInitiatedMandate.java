package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PayerInitiatedMandate {
    public String amount;
    public String amountrule;
    public Cred creds;
    public String customerid;
    public DeviceDetails device;
    public String executebypayeepsp;
    public String mandatename;
    public String mandatetype;
    public String monthlylimit;
    public String note;
    public String payeeaddr;
    public String payeename;
    public String payeraddr;
    public String payername;
    public String recurrence;
    public String revocable;
    public String rule;
    public String ruletype;
    public String rulevalue;
    public String sharetopayee;
    public String txnid;
    public String umn;
    public String validityend;
    public String validitystart;
    public String purposecode = C0059ao.a(493);
    public String initmode = C0059ao.a(494);
    public String blockfund = C0059ao.a(495);
    public String recurrenceValue = C0059ao.a(496);

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum MandateType {
        CREATE,
        UPDATE,
        REVOKE
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum Recurrences {
        ONETIME,
        DAILY,
        WEEKLY,
        MONTHLY,
        BIMONTHLY,
        QUARTERLY,
        HALFYEARLY,
        YEARLY,
        ASPRESENTED
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum Revocable {
        Y,
        N
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum Rule {
        MAX,
        EXACT
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum RuleType {
        BEFORE,
        ON,
        AFTER,
        ONETIME,
        DAILY,
        ASPRESENTED
    }

    public String getAmount() {
        return this.amount;
    }

    public String getAmountrule() {
        return this.amountrule;
    }

    public String getBlockfund() {
        return this.blockfund;
    }

    public Cred getCreds() {
        return this.creds;
    }

    public String getCustomerid() {
        return this.customerid;
    }

    public DeviceDetails getDevice() {
        return this.device;
    }

    public String getExecutebypayeepsp() {
        return this.executebypayeepsp;
    }

    public String getInitmode() {
        return this.initmode;
    }

    public String getMandatename() {
        return this.mandatename;
    }

    public String getMandatetype() {
        return this.mandatetype;
    }

    public String getMonthlylimit() {
        return this.monthlylimit;
    }

    public String getNote() {
        return this.note;
    }

    public String getPayeeaddr() {
        return this.payeeaddr;
    }

    public String getPayeename() {
        return this.payeename;
    }

    public String getPayeraddr() {
        return this.payeraddr;
    }

    public String getPayername() {
        return this.payername;
    }

    public String getPurposecode() {
        return this.purposecode;
    }

    public String getRecurrence() {
        return this.recurrence;
    }

    public String getRecurrenceValue() {
        return this.recurrenceValue;
    }

    public String getRevocable() {
        return this.revocable;
    }

    public String getRule() {
        return this.rule;
    }

    public String getRuletype() {
        return this.ruletype;
    }

    public String getRulevalue() {
        return this.rulevalue;
    }

    public String getSharetopayee() {
        return this.sharetopayee;
    }

    public String getTxnid() {
        return this.txnid;
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

    public void setBlockfund(String str) {
        this.blockfund = str;
    }

    public void setCreds(Cred cred) {
        this.creds = cred;
    }

    public void setCustomerid(String str) {
        this.customerid = str;
    }

    public void setDevice(DeviceDetails deviceDetails) {
        this.device = deviceDetails;
    }

    public void setExecutebypayeepsp(String str) {
        this.executebypayeepsp = str;
    }

    public void setInitmode(String str) {
        this.initmode = str;
    }

    public void setMandatename(String str) {
        this.mandatename = str;
    }

    public void setMandatetype(String str) {
        this.mandatetype = str;
    }

    public void setMonthlylimit(String str) {
        this.monthlylimit = str;
    }

    public void setNote(String str) {
        this.note = str;
    }

    public void setPayeeaddr(String str) {
        this.payeeaddr = str;
    }

    public void setPayeename(String str) {
        this.payeename = str;
    }

    public void setPayeraddr(String str) {
        this.payeraddr = str;
    }

    public void setPayername(String str) {
        this.payername = str;
    }

    public void setPurposecode(String str) {
        this.purposecode = str;
    }

    public void setRecurrence(String str) {
        this.recurrence = str;
    }

    public void setRecurrenceValue(String str) {
        this.recurrenceValue = str;
    }

    public void setRevocable(String str) {
        this.revocable = str;
    }

    public void setRule(String str) {
        this.rule = str;
    }

    public void setRuletype(String str) {
        this.ruletype = str;
    }

    public void setRulevalue(String str) {
        this.rulevalue = str;
    }

    public void setSharetopayee(String str) {
        this.sharetopayee = str;
    }

    public void setTxnid(String str) {
        this.txnid = str;
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
