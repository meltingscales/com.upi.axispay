package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SafetynetSignedAttestation {
    public String apiKey;
    public String signedAttestation;

    public String getApiKey() {
        return this.apiKey;
    }

    public String getSignedAttestation() {
        return this.signedAttestation;
    }

    public void setApiKey(String str) {
        this.apiKey = str;
    }

    public void setSignedAttestation(String str) {
        this.signedAttestation = str;
    }
}
