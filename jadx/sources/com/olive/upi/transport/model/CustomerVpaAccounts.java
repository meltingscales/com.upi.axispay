package com.olive.upi.transport.model;

import java.util.ArrayList;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CustomerVpaAccounts implements CheckSum {
    public ArrayList<Account> accounts;
    public String vpa;

    public CustomerVpaAccounts(String str) {
        this.vpa = str;
    }

    public ArrayList<Account> getAccounts() {
        return this.accounts;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.vpa + this.accounts;
    }

    public String getVpa() {
        return this.vpa;
    }

    public void setAccounts(ArrayList<Account> arrayList) {
        this.accounts = arrayList;
    }

    public void setVpa(String str) {
        this.vpa = str;
    }

    public String toString() {
        return this.vpa + this.accounts;
    }
}
