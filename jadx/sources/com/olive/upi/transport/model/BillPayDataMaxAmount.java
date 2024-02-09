package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BillPayDataMaxAmount {
    public String dthPrepaidMaxAmount = C0059ao.a(2461);
    public String mobilePrepaidMaxAmount = C0059ao.a(2462);
    public String mobilePostpaidMaxAmount = C0059ao.a(2463);

    public String getDthPrepaidMaxAmount() {
        return this.dthPrepaidMaxAmount;
    }

    public String getMobilePostpaidMaxAmount() {
        return this.mobilePostpaidMaxAmount;
    }

    public String getMobilePrepaidMaxAmount() {
        return this.mobilePrepaidMaxAmount;
    }

    public void setDthPrepaidMaxAmount(String str) {
        this.dthPrepaidMaxAmount = str;
    }

    public void setMobilePostpaidMaxAmount(String str) {
        this.mobilePostpaidMaxAmount = str;
    }

    public void setMobilePrepaidMaxAmount(String str) {
        this.mobilePrepaidMaxAmount = str;
    }
}
