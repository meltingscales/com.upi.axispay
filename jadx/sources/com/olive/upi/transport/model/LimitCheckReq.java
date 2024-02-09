package com.olive.upi.transport.model;

import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class LimitCheckReq {
    public Account ac;
    public String amount;
    public DeviceDetails device;
    public List<Payee> payees;

    public Account getAc() {
        return this.ac;
    }

    public String getAmount() {
        return this.amount;
    }

    public DeviceDetails getDevice() {
        return this.device;
    }

    public List<Payee> getPayees() {
        return this.payees;
    }

    public void setAc(Account account) {
        this.ac = account;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setDevice(DeviceDetails deviceDetails) {
        this.device = deviceDetails;
    }

    public void setPayees(List<Payee> list) {
        this.payees = list;
    }
}
