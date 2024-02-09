package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PrefixMobile {
    private String circle;
    private String operator;
    private String prefix;

    public String getCircle() {
        return this.circle;
    }

    public String getOperator() {
        return this.operator;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setCircle(String str) {
        this.circle = str;
    }

    public void setOperator(String str) {
        this.operator = str;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public String toString() {
        return C0059ao.a(10741) + this.prefix + C0059ao.a(10742) + this.circle + C0059ao.a(10743) + this.operator + C0059ao.a(10744);
    }
}
