package com.olive.upi.transport.model;

import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Registration {
    public static final String TYPE_EXISTING_USER = null;
    public String action;
    public ArrayList<CustomerBankAccounts> customerBankAccounts = new ArrayList<>();
    public String customerBankAccountsenc;
    public String customerid;
    public DeviceDetails deviceInfo;
    public String mobilenumber;
    public String name;
    public String notification;
    public String type;
    public String vpa;

    static {
        C0059ao.a(Registration.class, 405);
    }

    public String getAction() {
        return this.action;
    }

    public String getCustomerBankAccountsenc() {
        return this.customerBankAccountsenc;
    }

    public ArrayList<CustomerBankAccounts> getCustomerBankAccountses() {
        return this.customerBankAccounts;
    }

    public String getCustomerid() {
        return this.customerid;
    }

    public DeviceDetails getDeviceInfo() {
        return this.deviceInfo;
    }

    public String getMobilenumber() {
        return this.mobilenumber;
    }

    public String getName() {
        return this.name;
    }

    public String getNotification() {
        return this.notification;
    }

    public String getType() {
        return this.type;
    }

    public String getVpa() {
        return this.vpa;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setCustomerBankAccountsenc(String str) {
        this.customerBankAccountsenc = str;
    }

    public void setCustomerBankAccountses(ArrayList<CustomerBankAccounts> arrayList) {
        this.customerBankAccounts = arrayList;
    }

    public void setCustomerid(String str) {
        this.customerid = str;
    }

    public void setDeviceInfo(DeviceDetails deviceDetails) {
        this.deviceInfo = deviceDetails;
    }

    public void setMobilenumber(String str) {
        this.mobilenumber = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNotification(String str) {
        this.notification = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVpa(String str) {
        this.vpa = str;
    }
}
