package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class RechargePlanParam {
    public String consumerno;
    public String servicecode;
    public String spcode;
    public String sspcode;

    public RechargePlanParam(String str, String str2, String str3, String str4) {
        this.servicecode = str;
        this.consumerno = str2;
        this.spcode = str3;
        this.sspcode = str4;
    }

    public String getConsumerno() {
        return this.consumerno;
    }

    public String getServicecode() {
        return this.servicecode;
    }

    public String getSpcode() {
        return this.spcode;
    }

    public String getSspcode() {
        return this.sspcode;
    }

    public void setConsumerno(String str) {
        this.consumerno = str;
    }

    public void setServicecode(String str) {
        this.servicecode = str;
    }

    public void setSpcode(String str) {
        this.spcode = str;
    }

    public void setSspcode(String str) {
        this.sspcode = str;
    }
}
