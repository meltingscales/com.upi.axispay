package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CredAllowed {
    public int dLength;
    public String dType;
    public String subtype;
    public String type;

    public String getSubtype() {
        return this.subtype;
    }

    public String getType() {
        return this.type;
    }

    public int getdLength() {
        return this.dLength;
    }

    public String getdType() {
        return this.dType;
    }

    public void setSubtype(String str) {
        this.subtype = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setdLength(int i) {
        this.dLength = i;
    }

    public void setdType(String str) {
        this.dType = str;
    }
}
