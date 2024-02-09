package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BillerForm {
    public Billers biller;
    public String billerCategory;
    public String locCode;

    public BillerForm(String str, Billers billers, String str2) {
        this.billerCategory = str;
        this.biller = billers;
        this.locCode = str2;
    }

    public Billers getBiller() {
        return this.biller;
    }

    public String getBillerCategory() {
        return this.billerCategory;
    }

    public String getLocCode() {
        return this.locCode;
    }

    public void setBiller(Billers billers) {
        this.biller = billers;
    }

    public void setBillerCategory(String str) {
        this.billerCategory = str;
    }

    public void setLocCode(String str) {
        this.locCode = str;
    }
}
