package com.olive.upi.transport.model;

import java.util.ArrayList;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Rechargetype {
    public String name;
    private ArrayList<Recharge> recharge = null;
    public String title;

    public String getName() {
        return this.name;
    }

    public ArrayList<Recharge> getRecharge() {
        return this.recharge;
    }

    public String getTitle() {
        return this.title;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRecharge(ArrayList<Recharge> arrayList) {
        this.recharge = arrayList;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
