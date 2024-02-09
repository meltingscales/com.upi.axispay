package com.olive.upi.transport.model;

import com.olive.upi.transport.model.lib.PaymentSalt;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MandateUpdateData extends LibTransportData {
    private String amount;
    private String payeeName;
    private String payeeVpa;
    private String payerVpa;
    private String refUrl;
    private String remark;
    public PaymentSalt salt;
    private Account sourceAccount;
    public UpdateMandate updateMandate;

    public String getAmount() {
        return this.amount;
    }

    public String getPayeeName() {
        return this.payeeName;
    }

    public String getPayeeVpa() {
        return this.payeeVpa;
    }

    public String getPayerVpa() {
        return this.payerVpa;
    }

    public String getRefUrl() {
        return this.refUrl;
    }

    public String getRemark() {
        return this.remark;
    }

    public PaymentSalt getSalt() {
        return this.salt;
    }

    public Account getSourceAccount() {
        return this.sourceAccount;
    }

    public UpdateMandate getUpdateMandate() {
        return this.updateMandate;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setPayeeName(String str) {
        this.payeeName = str;
    }

    public void setPayeeVpa(String str) {
        this.payeeVpa = str;
    }

    public void setPayerVpa(String str) {
        this.payerVpa = str;
    }

    public void setRefUrl(String str) {
        this.refUrl = str;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setSalt(PaymentSalt paymentSalt) {
        this.salt = paymentSalt;
    }

    public void setSourceAccount(Account account) {
        this.sourceAccount = account;
    }

    public void setUpdateMandate(UpdateMandate updateMandate) {
        this.updateMandate = updateMandate;
    }
}
