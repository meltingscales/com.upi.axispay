package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BillerLocation {
    public Billers biller;
    public String billerCategory;

    public BillerLocation(String str, Billers billers) {
        this.billerCategory = str;
        this.biller = billers;
    }

    public Billers getBiller() {
        return this.biller;
    }

    public String getBillerCategory() {
        return this.billerCategory;
    }

    public void setBiller(Billers billers) {
        this.biller = billers;
    }

    public void setBillerCategory(String str) {
        this.billerCategory = str;
    }
}
