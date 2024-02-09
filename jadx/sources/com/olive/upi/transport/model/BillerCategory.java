package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BillerCategory {
    public String CODE_VAL;
    public String DSCRPTN;
    private int fixedCategory;
    public int icon = -1;
    public String iconUrl;

    public String getCODE_VAL() {
        return this.CODE_VAL;
    }

    public String getDSCRPTN() {
        return this.DSCRPTN;
    }

    public int getFixedCategory() {
        return this.fixedCategory;
    }

    public int getIconId() {
        return this.icon;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setCODE_VAL(String str) {
        this.CODE_VAL = str;
    }

    public void setDSCRPTN(String str) {
        this.DSCRPTN = str;
    }

    public void setFixedCategory(int i) {
        this.fixedCategory = i;
    }

    public void setIconId(int i) {
        this.icon = i;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public String toString() {
        return C0059ao.a(2750) + this.DSCRPTN + C0059ao.a(2751) + this.CODE_VAL + C0059ao.a(2752) + this.fixedCategory;
    }
}
