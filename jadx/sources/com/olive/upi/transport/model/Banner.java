package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Banner {
    public String actiontype;
    public String clickUrl;
    public int defaultImg;
    public String imageUrl;
    public String offertext;

    public Banner() {
    }

    public String getActionType() {
        return this.actiontype;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public int getDefaultImg() {
        return this.defaultImg;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getOffertext() {
        return this.offertext;
    }

    public void setActionType(String str) {
        this.actiontype = str;
    }

    public void setDefaultImg(int i) {
        this.defaultImg = i;
    }

    public Banner(String str, String str2) {
        this.imageUrl = str;
        this.clickUrl = str2;
    }
}
