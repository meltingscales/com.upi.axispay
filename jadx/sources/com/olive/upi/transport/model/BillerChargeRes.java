package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BillerChargeRes {
    public String CHRG_AMT;
    public String NET_CHRG_AMT;
    public String TAX_AMT1;
    public String TAX_AMT2;
    public String TAX_AMT3;

    public String getCHRG_AMT() {
        return this.CHRG_AMT;
    }

    public String getNET_CHRG_AMT() {
        return this.NET_CHRG_AMT;
    }

    public String getTAX_AMT1() {
        return this.TAX_AMT1;
    }

    public String getTAX_AMT2() {
        return this.TAX_AMT2;
    }

    public String getTAX_AMT3() {
        return this.TAX_AMT3;
    }

    public void setCHRG_AMT(String str) {
        this.CHRG_AMT = str;
    }

    public void setNET_CHRG_AMT(String str) {
        this.NET_CHRG_AMT = str;
    }

    public void setTAX_AMT1(String str) {
        this.TAX_AMT1 = str;
    }

    public void setTAX_AMT2(String str) {
        this.TAX_AMT2 = str;
    }

    public void setTAX_AMT3(String str) {
        this.TAX_AMT3 = str;
    }
}
