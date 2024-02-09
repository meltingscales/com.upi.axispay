package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MobOperator {
    private String Circle;
    private String Operator;
    private String Prefix;
    private int id;

    public String getCircle() {
        return this.Circle;
    }

    public int getId() {
        return this.id;
    }

    public String getOperator() {
        return this.Operator;
    }

    public String getPrefix() {
        return this.Prefix;
    }

    public void setCircle(String str) {
        this.Circle = str;
    }

    public void setOperator(String str) {
        this.Operator = str;
    }

    public void setPrefix(String str) {
        this.Prefix = str;
    }
}
