package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BillerCircle implements Comparable<BillerCircle> {
    public String LVL_CODE_ACTL;
    public String LVL_CODE_DESCRPTN;
    public String iconUrl;

    public String getCode() {
        return this.LVL_CODE_ACTL;
    }

    public String getDESCRPTN() {
        return this.LVL_CODE_DESCRPTN;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String toString() {
        return this.LVL_CODE_DESCRPTN + C0059ao.a(6165) + this.LVL_CODE_ACTL;
    }

    @Override // java.lang.Comparable
    public int compareTo(BillerCircle billerCircle) {
        return this.LVL_CODE_DESCRPTN.toLowerCase().compareTo(billerCircle.LVL_CODE_DESCRPTN.toLowerCase());
    }
}
