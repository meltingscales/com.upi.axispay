package com.olive.upi.transport.model;

import com.olive.upi.transport.model.Bank;
import java.util.Comparator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Bank implements Comparable<Bank> {
    public static Comparator<Bank> bankNameComparator = new Comparator() { // from class: r70
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compareTo;
            compareTo = ((Bank) obj).getName().toUpperCase().compareTo(((Bank) obj2).getName().toUpperCase());
            return compareTo;
        }
    };
    public String colourcode;
    public String ifsc;
    public String iin;
    public String logo;
    public String name;

    public Bank(String str) {
        this.name = str;
    }

    public String getColorcode() {
        return this.colourcode;
    }

    public String getIfsc() {
        return this.ifsc;
    }

    public String getIin() {
        return this.iin;
    }

    public String getLogo() {
        return this.logo;
    }

    public String getName() {
        return this.name;
    }

    public void setColorcode(String str) {
        this.colourcode = str;
    }

    public void setIfsc(String str) {
        this.ifsc = str;
    }

    public void setIin(String str) {
        this.iin = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return this.name + C0059ao.a(3927) + this.iin;
    }

    @Override // java.lang.Comparable
    public int compareTo(Bank bank) {
        return this.name.toLowerCase().compareTo(bank.name.toLowerCase());
    }
}
