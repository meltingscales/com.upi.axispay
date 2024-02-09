package com.olive.upi.transport.model;

import java.util.ArrayList;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Circle {
    private String code;
    private String name;
    private ArrayList<Rechargetype> rechargetype;

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Rechargetype> getRechargetype() {
        return this.rechargetype;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRechargetype(ArrayList<Rechargetype> arrayList) {
        this.rechargetype = arrayList;
    }
}
