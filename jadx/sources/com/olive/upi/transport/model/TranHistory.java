package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class TranHistory implements CheckSum, Comparable {
    public static final String QSTATUS_CLOSE = null;
    public static final String QSTATUS_OPEN = null;
    public static final String TRANSACTION_CREDIT = null;
    public static final String TRANSACTION_DEBIT = null;
    public String amount;
    public String beneficiaryName;
    public String creditAccount;
    public String creditBankName;
    public String creditVpa;
    public String creditdebittype;
    public String dateTime;
    public String debitAccount;
    public String debitBankName;
    public String debitVpa;
    public String description;
    public int direction;
    public String expirydateTime;
    public String initMode;
    public String mcc;
    public String purposeCode;
    public String query;
    public String queryCloserComment;
    public String queryStatus;
    public String querydate;
    public String queryid;
    public String refCategory;
    public String refUrl;
    public String refid;
    public String remarks;
    public String remitterName;
    public String status;
    public String tranid;
    public String type;
    public Udir udir;
    public String umn;

    static {
        C0059ao.a(TranHistory.class, 264);
    }

    public static String getTransactionCredit() {
        return C0059ao.a(34);
    }

    public static String getTransactionDebit() {
        return C0059ao.a(35);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        int compareTo = ((TranHistory) obj).getDateTime().compareTo(this.dateTime);
        if (compareTo > 0) {
            return 1;
        }
        return compareTo == 0 ? 0 : -1;
    }

    public String getAmount() {
        return this.amount;
    }

    public String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    public String getCreditAccount() {
        return this.creditAccount;
    }

    public String getCreditBankName() {
        return this.creditBankName;
    }

    public String getCreditVpa() {
        return this.creditVpa;
    }

    public String getCreditdebittype() {
        return this.creditdebittype;
    }

    public String getDateTime() {
        return this.dateTime;
    }

    public String getDebitAccount() {
        return this.debitAccount;
    }

    public String getDebitBankName() {
        return this.debitBankName;
    }

    public String getDebitVpa() {
        return this.debitVpa;
    }

    public String getDescription() {
        return this.description;
    }

    public int getDirection() {
        return this.direction;
    }

    public String getExpirydateTime() {
        return this.expirydateTime;
    }

    public String getInitMode() {
        return this.initMode;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.type + this.tranid + this.refid + this.dateTime + this.amount + this.debitAccount + this.debitVpa + this.debitBankName + this.creditAccount + this.creditVpa + this.status + this.remarks + this.queryStatus + this.queryid + this.querydate + this.expirydateTime;
    }

    public String getMcc() {
        return this.mcc;
    }

    public String getPayType() {
        return this.creditdebittype;
    }

    public String getPurposeCode() {
        return this.purposeCode;
    }

    public String getQuery() {
        return this.query;
    }

    public String getQueryCloserComment() {
        return this.queryCloserComment;
    }

    public String getQueryStatus() {
        return this.queryStatus;
    }

    public String getQuerydate() {
        return this.querydate;
    }

    public String getQueryid() {
        return this.queryid;
    }

    public String getRefCategory() {
        return this.refCategory;
    }

    public String getRefUrl() {
        return this.refUrl;
    }

    public String getRefid() {
        return this.refid;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getRemitterName() {
        return this.remitterName;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTranid() {
        return this.tranid;
    }

    public String getType() {
        return this.type;
    }

    public Udir getUdir() {
        return this.udir;
    }

    public String getUmn() {
        return this.umn;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setCreditAccount(String str) {
        this.creditAccount = str;
    }

    public void setCreditBankName(String str) {
        this.creditBankName = str;
    }

    public void setCreditVpa(String str) {
        this.creditVpa = str;
    }

    public void setCreditdebittype(String str) {
        this.creditdebittype = str;
    }

    public void setDateTime(String str) {
        this.dateTime = str;
    }

    public void setDebitAccount(String str) {
        this.debitAccount = str;
    }

    public void setDebitBankName(String str) {
        this.debitBankName = str;
    }

    public void setDebitVpa(String str) {
        this.debitVpa = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDirection(int i) {
        this.direction = i;
    }

    public void setExpirydateTime(String str) {
        this.expirydateTime = str;
    }

    public void setInitMode(String str) {
        this.initMode = str;
    }

    public void setMcc(String str) {
        this.mcc = str;
    }

    public void setPayType(String str) {
        this.creditdebittype = str;
    }

    public void setPurposeCode(String str) {
        this.purposeCode = str;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setQueryCloserComment(String str) {
        this.queryCloserComment = str;
    }

    public void setQueryStatus(String str) {
        this.queryStatus = str;
    }

    public void setQuerydate(String str) {
        this.querydate = str;
    }

    public void setQueryid(String str) {
        this.queryid = str;
    }

    public void setRefCategory(String str) {
        this.refCategory = str;
    }

    public void setRefUrl(String str) {
        this.refUrl = str;
    }

    public void setRefid(String str) {
        this.refid = str;
    }

    public void setRemarks(String str) {
        this.remarks = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTranid(String str) {
        this.tranid = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUdir(Udir udir) {
        this.udir = udir;
    }

    public void setUmn(String str) {
        this.umn = str;
    }
}
