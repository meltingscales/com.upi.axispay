package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Cred implements CheckSum {
    public Data data;
    public String subType;
    public String type;

    public Data getData() {
        return this.data;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.data + this.subType + this.type;
    }

    public String getSubType() {
        return this.subType;
    }

    public String getType() {
        return this.type;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setSubType(String str) {
        this.subType = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return this.data + this.subType + this.type;
    }
}