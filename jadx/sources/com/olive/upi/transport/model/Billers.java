package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Billers {
    public String CIF_ID;
    public String CORP_CODE;
    public String MASTR_TYPE;
    public String NAME;
    public String iconUrl;

    public String getCIF_ID() {
        return this.CIF_ID;
    }

    public String getCORP_CODE() {
        return this.CORP_CODE;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getMASTR_TYPE() {
        return this.MASTR_TYPE;
    }

    public String getNAME() {
        return this.NAME;
    }

    public void setCIF_ID(String str) {
        this.CIF_ID = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setMASTR_TYPE(String str) {
        this.MASTR_TYPE = str;
    }

    public void setName(String str) {
        this.NAME = str;
    }

    public String toString() {
        return this.NAME + C0059ao.a(4822) + this.CORP_CODE;
    }
}
