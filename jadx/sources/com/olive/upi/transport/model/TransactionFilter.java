package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class TransactionFilter implements CheckSum {
    public String fromDate;
    public String toDate;

    public String getFromDate() {
        return this.fromDate;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.fromDate + this.toDate;
    }

    public String getToDate() {
        return this.toDate;
    }

    public void setFromDate(String str) {
        this.fromDate = str;
    }

    public void setToDate(String str) {
        this.toDate = str;
    }
}
