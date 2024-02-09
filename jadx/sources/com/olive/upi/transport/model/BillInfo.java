package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BillInfo {
    private String amount;
    private String mobilenumber;
    private String operator;
    private String type;

    public String getAmount() {
        return this.amount;
    }

    public String getMobilenumber() {
        return this.mobilenumber;
    }

    public String getOperator() {
        return this.operator;
    }

    public String getType() {
        return this.type;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setMobilenumber(String str) {
        this.mobilenumber = str;
    }

    public void setOperator(String str) {
        this.operator = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
