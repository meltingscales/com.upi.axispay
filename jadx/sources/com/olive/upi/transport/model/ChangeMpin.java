package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ChangeMpin {
    public Account account;
    public String bankId;

    public ChangeMpin(String str, Account account) {
        this.bankId = str;
        this.account = account;
    }

    public Account getAccount() {
        return this.account;
    }

    public String getBankId() {
        return this.bankId;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setBankId(String str) {
        this.bankId = str;
    }
}
