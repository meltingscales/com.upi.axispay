package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Gst {
    public String consentName;
    public String consentType;
    public String gstIn;
    public Invoice invoice;
    public String isConsentEnabled;
    public String isGSTEnabled;
    public String mid;
    public String msid;
    public String mtid;
    public String pinCode;
    public QR qr;
    public Split split;
    public String tier = C0059ao.a(2776);
    public String tipAmount;

    public String getConsentName() {
        return this.consentName;
    }

    public String getConsentType() {
        return this.consentType;
    }

    public String getGstIn() {
        return this.gstIn;
    }

    public Invoice getInvoice() {
        return this.invoice;
    }

    public String getIsConsentEnabled() {
        return this.isConsentEnabled;
    }

    public String getIsGSTEnabled() {
        return this.isGSTEnabled;
    }

    public String getMid() {
        return this.mid;
    }

    public String getMsid() {
        return this.msid;
    }

    public String getMtid() {
        return this.mtid;
    }

    public String getPinCode() {
        return this.pinCode;
    }

    public QR getQr() {
        return this.qr;
    }

    public Split getSplit() {
        return this.split;
    }

    public String getTier() {
        return this.tier;
    }

    public String getTipAmount() {
        return this.tipAmount;
    }

    public void setConsentName(String str) {
        this.consentName = str;
    }

    public void setConsentType(String str) {
        this.consentType = str;
    }

    public void setGstIn(String str) {
        this.gstIn = str;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void setIsConsentEnabled(String str) {
        this.isConsentEnabled = str;
    }

    public void setIsGSTEnabled(String str) {
        this.isGSTEnabled = str;
    }

    public void setMid(String str) {
        this.mid = str;
    }

    public void setMsid(String str) {
        this.msid = str;
    }

    public void setMtid(String str) {
        this.mtid = str;
    }

    public void setPinCode(String str) {
        this.pinCode = str;
    }

    public void setQr(QR qr) {
        this.qr = qr;
    }

    public void setSplit(Split split) {
        this.split = split;
    }

    public void setTier(String str) {
        this.tier = str;
    }

    public void setTipAmount(String str) {
        this.tipAmount = str;
    }
}
