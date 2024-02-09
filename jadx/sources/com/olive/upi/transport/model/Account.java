package com.olive.upi.transport.model;

import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Account implements CheckSum {
    public static final String ACCOUNT_FORMAT02 = null;
    public static final String ACCOUNT_FORMAT1 = null;
    public static final String ACCOUNT_FORMAT2 = null;
    public static final String STATUS_ACTIVE = null;
    public static final String STATUS_INACTIVE = null;
    public String accRefNumber;
    public String aeba;
    public String atmpinFormat;
    public int atmpinlength;
    public String balTime;
    public String balance;
    public String bankName;
    public int checkBalance;
    public int dLength;
    public String dType;
    public String defaultAccount;
    public String ifsc;
    public String iin;
    public String isClAcc;
    public String maskedAccnumber;
    public String mmid;
    public String name;
    public String otpFormat = C0059ao.a(14354);
    public int otpLength = 6;
    public String status;
    public String type;
    public String vpa;
    public List<Vpas> vpas;

    static {
        C0059ao.a(Account.class, 203);
    }

    public Account() {
    }

    public String getAccRefNumber() {
        return this.accRefNumber;
    }

    public String getAeba() {
        return this.aeba;
    }

    public String getAtmpinFormat() {
        return this.atmpinFormat;
    }

    public int getAtmpinlength() {
        return this.atmpinlength;
    }

    public String getBalTime() {
        return this.balTime;
    }

    public String getBalance() {
        return this.balance;
    }

    public String getBankName() {
        return this.bankName;
    }

    public int getCheckBalance() {
        return this.checkBalance;
    }

    public String getDefaultAccount() {
        return this.defaultAccount;
    }

    public String getIfsc() {
        return this.ifsc;
    }

    public String getIin() {
        return this.iin;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.name + this.mmid + this.aeba + this.accRefNumber + this.ifsc + this.maskedAccnumber + this.status + this.type + this.vpa + this.dLength + this.dType + this.balance + this.balTime;
    }

    public String getIsClAcc() {
        return this.isClAcc;
    }

    public String getMaskedAccnumber() {
        return this.maskedAccnumber;
    }

    public String getMmid() {
        return this.mmid;
    }

    public String getName() {
        return this.name;
    }

    public String getOtpFormat() {
        return this.otpFormat;
    }

    public int getOtpLength() {
        return this.otpLength;
    }

    public String getStatus() {
        return this.status;
    }

    public String getType() {
        return this.type;
    }

    public String getVpa() {
        return this.vpa;
    }

    public List<Vpas> getVpas() {
        return this.vpas;
    }

    public int getdLength() {
        return this.dLength;
    }

    public String getdType() {
        return this.dType;
    }

    public void setAccRefNumber(String str) {
        this.accRefNumber = str;
    }

    public void setAeba(String str) {
        this.aeba = str;
    }

    public void setAtmpinFormat(String str) {
        this.atmpinFormat = str;
    }

    public void setAtmpinlength(int i) {
        this.atmpinlength = i;
    }

    public void setBalTime(String str) {
        this.balTime = str;
    }

    public void setBalance(String str) {
        this.balance = str;
    }

    public void setBankName(String str) {
        this.bankName = str;
    }

    public void setCheckBalance(int i) {
        this.checkBalance = i;
    }

    public void setDefaultAccount(String str) {
        this.defaultAccount = str;
    }

    public void setIfsc(String str) {
        this.ifsc = str;
    }

    public void setIin(String str) {
        this.iin = str;
    }

    public void setIsClAcc(String str) {
        this.isClAcc = str;
    }

    public void setMaskedAccnumber(String str) {
        this.maskedAccnumber = str;
    }

    public void setMmid(String str) {
        this.mmid = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOtpFormat(String str) {
        this.otpFormat = str;
    }

    public void setOtpLength(int i) {
        this.otpLength = i;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVpa(String str) {
        this.vpa = str;
    }

    public void setVpas(List<Vpas> list) {
        this.vpas = list;
    }

    public void setdLength(int i) {
        this.dLength = i;
    }

    public void setdType(String str) {
        this.dType = str;
    }

    public String toString() {
        return this.name + this.mmid + this.aeba + this.accRefNumber + this.ifsc + this.maskedAccnumber + this.status + this.type + this.vpa + this.dLength + this.dType + this.balance + this.balTime;
    }

    public Account(String str) {
        this.vpa = str;
    }
}
