package com.appsflyer.internal;

import android.app.Application;
import com.appsflyer.AppsFlyerLibCore;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Exlytics {
    public static final String EXCEPTION_COUNT_KEY = null;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Application f170;

    static {
        C0059ao.a(Exlytics.class, 280);
    }

    public static long get() {
        Application application = f170;
        if (application == null) {
            return -1L;
        }
        return AppsFlyerLibCore.getSharedPreferences(application).getLong(C0059ao.a(14093), 0L);
    }

    public static void increment() {
        Application application = f170;
        if (application == null) {
            return;
        }
        AppsFlyerLibCore.getSharedPreferences(application).edit().putLong(C0059ao.a(14094), get() + 1).apply();
    }

    public static void setContext(Application application) {
        f170 = application;
    }
}
