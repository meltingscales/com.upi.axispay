package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BillerChargeReq {
    public TagList AMOUNT;
    public String AMT;
    public String CORP_CODE;
    public String OU_ID;

    public TagList getAMOUNT() {
        return this.AMOUNT;
    }

    public String getAMT() {
        return this.AMT;
    }

    public String getCORP_CODE() {
        return this.CORP_CODE;
    }

    public String getOU_ID() {
        return this.OU_ID;
    }

    public void setAMOUNT(TagList tagList) {
        this.AMOUNT = tagList;
    }

    public void setAMT(String str) {
        this.AMT = str;
    }

    public void setCORP_CODE(String str) {
        this.CORP_CODE = str;
    }

    public void setOU_ID(String str) {
        this.OU_ID = str;
    }
}
