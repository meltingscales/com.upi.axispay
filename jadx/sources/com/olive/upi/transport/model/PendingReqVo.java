package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PendingReqVo extends Gst implements CheckSum, Comparable {
    public String amount;
    public String beneName;
    public String expdate;
    public String invoiceurl;
    public String merchantflag;
    public String mobile;
    public String name;
    public String notes;
    public String payeeAcNo;
    public String payeeIfsc;
    public String payeeVpa;
    public String payeecode;
    public String payerVpa;
    public String purpose;
    public String refCategory;
    public String refid;
    public String status;
    public String txnid;

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        int compareTo = ((PendingReqVo) obj).getExpdate().compareTo(this.expdate);
        if (compareTo > 0) {
            return 1;
        }
        return compareTo == 0 ? 0 : -1;
    }

    public String getAmount() {
        return this.amount;
    }

    public String getBeneName() {
        return this.beneName;
    }

    public String getExpdate() {
        return this.expdate;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.txnid + this.name + this.notes + this.status + this.mobile + this.payerVpa + this.payeeVpa + this.beneName + this.amount + this.expdate + this.refid;
    }

    public String getInvoiceurl() {
        return this.invoiceurl;
    }

    public String getMerchantflag() {
        return this.merchantflag;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getName() {
        return this.name;
    }

    public String getNotes() {
        return this.notes;
    }

    public String getPayeeAcNo() {
        return this.payeeAcNo;
    }

    public String getPayeeIfsc() {
        return this.payeeIfsc;
    }

    public String getPayeeVpa() {
        return this.payeeVpa;
    }

    public String getPayeecode() {
        return this.payeecode;
    }

    public String getPayerVpa() {
        return this.payerVpa;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public String getRefCategory() {
        return this.refCategory;
    }

    public String getRefid() {
        return this.refid;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTxnid() {
        return this.txnid;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setBeneName(String str) {
        this.beneName = str;
    }

    public void setExpdate(String str) {
        this.expdate = str;
    }

    public void setInvoiceurl(String str) {
        this.invoiceurl = str;
    }

    public void setMerchantflag(String str) {
        this.merchantflag = str;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNotes(String str) {
        this.notes = str;
    }

    public void setPayeeAcNo(String str) {
        this.payeeAcNo = str;
    }

    public void setPayeeIfsc(String str) {
        this.payeeIfsc = str;
    }

    public void setPayeeVpa(String str) {
        this.payeeVpa = str;
    }

    public void setPayeecode(String str) {
        this.payeecode = str;
    }

    public void setPayeevpa(String str) {
        this.payeeVpa = str;
    }

    public void setPayerVpa(String str) {
        this.payerVpa = str;
    }

    public void setPurpose(String str) {
        this.purpose = str;
    }

    public void setRefCategory(String str) {
        this.refCategory = str;
    }

    public void setRefid(String str) {
        this.refid = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTxnid(String str) {
        this.txnid = str;
    }
}
