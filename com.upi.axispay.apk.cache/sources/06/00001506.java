package com.olive.upi.transport.model;

import java.util.ArrayList;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CustomerBankAccounts implements CheckSum {
    public ArrayList<Account> accounts;
    public String bankCode;
    public String bankName;
    public String colorCode;

    public ArrayList<Account> getAccounts() {
        return this.accounts;
    }

    public String getBankCode() {
        return this.bankCode;
    }

    public String getBankName() {
        return this.bankName;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.bankName + this.bankCode + this.accounts;
    }

    public void setAccounts(ArrayList<Account> arrayList) {
        this.accounts = arrayList;
    }

    public void setBankCode(String str) {
        this.bankCode = str;
    }

    public void setBankName(String str) {
        this.bankName = str;
    }

    public String toString() {
        return this.bankName + this.bankCode + this.accounts;
    }
}