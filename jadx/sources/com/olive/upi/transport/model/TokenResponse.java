package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class TokenResponse implements CheckSum {
    public Double amount;
    public String asap;
    public int bannerVersion;
    public String billervpa;
    public int billpayMaxAmtVersion;
    public String billpayvpa;
    public String checksumWebUrl;
    public String counter;
    public int dthOperatorVersion;
    public String email;
    public String encryptionFlag;
    public String flrespdesc;
    public String fprespdesc;
    public int mobOperatorVersion;
    public int nothanks;
    public int notification;
    public int prefixDthVersion;
    public int prefixMobVersion;
    public int rateitnow;
    public String refereevpa;
    public int remindmelater;
    public String token;
    public int tokenValidDays;
    public int tokenexpirydays;
    public String vpa;

    public Double getAmount() {
        return this.amount;
    }

    public String getAsap() {
        return this.asap;
    }

    public int getBannerVersion() {
        return this.bannerVersion;
    }

    public String getBillervpa() {
        return this.billervpa;
    }

    public int getBillpayMaxAmtVersion() {
        return this.billpayMaxAmtVersion;
    }

    public String getBillpayvpa() {
        return this.billpayvpa;
    }

    public String getChecksumWebUrl() {
        return this.checksumWebUrl;
    }

    public String getCounter() {
        return this.counter;
    }

    public int getDthOperatorVersion() {
        return this.dthOperatorVersion;
    }

    public String getEmail() {
        return this.email;
    }

    public String getEncryptionFlag() {
        return this.encryptionFlag;
    }

    public String getFlrespdesc() {
        return this.flrespdesc;
    }

    public String getFprespdesc() {
        return this.fprespdesc;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.token + this.vpa + this.notification;
    }

    public int getMobOperatorVersion() {
        return this.mobOperatorVersion;
    }

    public int getNothanks() {
        return this.nothanks;
    }

    public int getNotification() {
        return this.notification;
    }

    public int getPrefixDthVersion() {
        return this.prefixDthVersion;
    }

    public int getPrefixMobVersion() {
        return this.prefixMobVersion;
    }

    public int getRateitnow() {
        return this.rateitnow;
    }

    public String getRefereevpa() {
        return this.refereevpa;
    }

    public int getRemindmelater() {
        return this.remindmelater;
    }

    public String getToken() {
        return this.token;
    }

    public int getTokenValidDays() {
        return this.tokenValidDays;
    }

    public int getTokenexpirydays() {
        return this.tokenexpirydays;
    }

    public String getVpa() {
        return this.vpa;
    }

    public void setAmount(Double d) {
        this.amount = d;
    }

    public void setAsap(String str) {
        this.asap = str;
    }

    public void setBannerVersion(int i) {
        this.bannerVersion = i;
    }

    public void setBillervpa(String str) {
        this.billervpa = str;
    }

    public void setBillpayMaxAmtVersion(int i) {
        this.billpayMaxAmtVersion = i;
    }

    public void setBillpayvpa(String str) {
        this.billpayvpa = str;
    }

    public void setChecksumWebUrl(String str) {
        this.checksumWebUrl = str;
    }

    public void setCounter(String str) {
        this.counter = str;
    }

    public void setDthOperatorVersion(int i) {
        this.dthOperatorVersion = i;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setEncryptionFlag(String str) {
        this.encryptionFlag = str;
    }

    public void setFlrespdesc(String str) {
        this.flrespdesc = str;
    }

    public void setFprespdesc(String str) {
        this.fprespdesc = str;
    }

    public void setMobOperatorVersion(int i) {
        this.mobOperatorVersion = i;
    }

    public void setNothanks(int i) {
        this.nothanks = i;
    }

    public void setNotification(int i) {
        this.notification = i;
    }

    public void setPrefixDthVersion(int i) {
        this.prefixDthVersion = i;
    }

    public void setPrefixMobVersion(int i) {
        this.prefixMobVersion = i;
    }

    public void setRateitnow(int i) {
        this.rateitnow = i;
    }

    public void setRefereevpa(String str) {
        this.refereevpa = str;
    }

    public void setRemindmelater(int i) {
        this.remindmelater = i;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setTokenValidDays(int i) {
        this.tokenValidDays = i;
    }

    public void setTokenexpirydays(int i) {
        this.tokenexpirydays = i;
    }

    public void setVpa(String str) {
        this.vpa = str;
    }

    public String toString() {
        return C0059ao.a(4813) + this.token + '\'' + C0059ao.a(4814) + this.vpa + '\'' + C0059ao.a(4815) + this.notification + '}';
    }
}
