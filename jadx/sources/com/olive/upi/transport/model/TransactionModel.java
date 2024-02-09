package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class TransactionModel {
    private int amount;
    private int date;
    private int day;
    private int month;
    private String personID;
    public TransactionType transactionType;
    private int year;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum TransactionType {
        Received,
        Payed
    }

    public TransactionModel() {
    }

    public int getAmount() {
        return this.amount;
    }

    public int getDate() {
        return this.date;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public String getPersonID() {
        return this.personID;
    }

    public String getTransactionType() {
        return this.transactionType == TransactionType.Received ? C0059ao.a(4298) : C0059ao.a(4299);
    }

    public int getYear() {
        return this.year;
    }

    public void setAmount(int i) {
        this.amount = i;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDay(int i) {
        this.day = i;
    }

    public void setMonth(int i) {
        this.month = i;
    }

    public void setPersonID(String str) {
        this.personID = str;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public void setYear(int i) {
        this.year = i;
    }

    public TransactionModel(String str, int i, TransactionType transactionType) {
        this.amount = i;
        this.personID = str;
        this.transactionType = transactionType;
    }
}
