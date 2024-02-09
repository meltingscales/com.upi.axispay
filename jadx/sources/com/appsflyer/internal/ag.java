package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class ag {

    /* renamed from: ı  reason: contains not printable characters */
    private static String f191;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static String f192;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m167(String str) {
        f192 = str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i != 0 && i != str.length() - 1) {
                sb.append(C0059ao.a(13381));
            } else {
                sb.append(str.charAt(i));
            }
        }
        f191 = sb.toString();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m168(String str) {
        if (f192 == null) {
            m167(AppsFlyerProperties.getInstance().getString(C0059ao.a(13382)));
        }
        String str2 = f192;
        if (str2 == null || !str.contains(str2)) {
            return;
        }
        AFLogger.afInfoLog(str.replace(f192, f191));
    }
}
