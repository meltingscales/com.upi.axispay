package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class UpdateMandateRequest {
    public String appId;
    public String customerId;
    public UpdateMandate updateMandate;

    public String getAppId() {
        return this.appId;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public UpdateMandate getUpdateMandate() {
        return this.updateMandate;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setUpdateMandate(UpdateMandate updateMandate) {
        this.updateMandate = updateMandate;
    }
}
