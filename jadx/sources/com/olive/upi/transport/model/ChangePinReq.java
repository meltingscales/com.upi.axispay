package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ChangePinReq {
    public String newPin;
    public String oldPin;

    public String getNewPin() {
        return this.newPin;
    }

    public String getOldPin() {
        return this.oldPin;
    }

    public void setNewPin(String str) {
        this.newPin = str;
    }

    public void setOldPin(String str) {
        this.oldPin = str;
    }
}
