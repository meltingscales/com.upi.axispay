package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class QR {
    public String expireTs;
    public String qVer;
    public String qrMedium;
    public String ts;

    public String getExpireTs() {
        return this.expireTs;
    }

    public String getQrMedium() {
        return this.qrMedium;
    }

    public String getTs() {
        return this.ts;
    }

    public String getqVer() {
        return this.qVer;
    }

    public void setExpireTs(String str) {
        this.expireTs = str;
    }

    public void setQrMedium(String str) {
        this.qrMedium = str;
    }

    public void setTs(String str) {
        this.ts = str;
    }

    public void setqVer(String str) {
        this.qVer = str;
    }
}
