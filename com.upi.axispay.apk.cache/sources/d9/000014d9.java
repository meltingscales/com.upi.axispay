package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Authenticate {
    public static final int TYPE_LOGIN_ALTERNATE = 0;
    public static final int TYPE_LOGIN_NORMAL = 0;
    public String appVersion;
    public String device;
    public String password;
    public String pin;
    public int type = 0;
    public String username;

    static {
        C0059ao.a(Authenticate.class, 292);
    }

    public Authenticate(String str) {
        this.pin = str;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getDevice() {
        return this.device;
    }

    public String getPassword() {
        return this.password;
    }

    public String getPin() {
        return this.pin;
    }

    public int getType() {
        return this.type;
    }

    public String getUsername() {
        return this.username;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setDevice(String str) {
        this.device = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setPin(String str) {
        this.pin = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUsername(String str) {
        this.username = str;
    }
}