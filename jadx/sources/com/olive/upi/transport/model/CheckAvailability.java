package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CheckAvailability {
    public String customerId;
    public CustomerVpaSuggetion customerVpaSuggetion;

    public String getCustomerId() {
        return this.customerId;
    }

    public CustomerVpaSuggetion getCustomerVpaSuggetion() {
        return this.customerVpaSuggetion;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setCustomerVpaSuggetion(CustomerVpaSuggetion customerVpaSuggetion) {
        this.customerVpaSuggetion = customerVpaSuggetion;
    }
}
