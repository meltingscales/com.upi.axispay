package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ActivateAccount {
    public Account account;
    public String bankId;
    public String cardNo;
    public String exp;

    public Account getAccount() {
        return this.account;
    }

    public String getBankId() {
        return this.bankId;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public String getExp() {
        return this.exp;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setBankId(String str) {
        this.bankId = str;
    }

    public void setCardNo(String str) {
        this.cardNo = str;
    }

    public void setExp(String str) {
        this.exp = str;
    }
}
