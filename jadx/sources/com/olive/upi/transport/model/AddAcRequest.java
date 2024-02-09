package com.olive.upi.transport.model;

import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AddAcRequest {
    public List<Account> account;
    public String bankId;
    public String customerId;
    public DeviceDetails device;
    public String txnId;

    public List<Account> getAccount() {
        return this.account;
    }

    public String getBankId() {
        return this.bankId;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public DeviceDetails getDevice() {
        return this.device;
    }

    public String getTxnId() {
        return this.txnId;
    }

    public void setAccount(List<Account> list) {
        this.account = list;
    }

    public void setBankId(String str) {
        this.bankId = str;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setDevice(DeviceDetails deviceDetails) {
        this.device = deviceDetails;
    }

    public void setTxnId(String str) {
        this.txnId = str;
    }
}
