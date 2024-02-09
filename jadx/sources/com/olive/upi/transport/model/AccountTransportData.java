package com.olive.upi.transport.model;

import com.olive.upi.transport.model.lib.Salt;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AccountTransportData extends LibTransportData {
    private Account account;
    public Salt salt;

    public Account getAccount() {
        return this.account;
    }

    public Salt getSalt() {
        return this.salt;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setSalt(Salt salt) {
        this.salt = salt;
    }
}
