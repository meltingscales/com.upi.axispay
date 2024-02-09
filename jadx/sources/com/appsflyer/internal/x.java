package com.appsflyer.internal;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.y;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class x {

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class c extends IllegalStateException {
        public c(String str) {
            super(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r9.length() == 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015d  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m227(android.content.Context r14, java.util.Map<java.lang.String, java.lang.Object> r15) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.x.m227(android.content.Context, java.util.Map):void");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static y m228(ContentResolver contentResolver) {
        String a;
        if (contentResolver != null && AppsFlyerProperties.getInstance().getString(C0059ao.a(12504)) == null) {
            if (C0059ao.a(12505).equals(Build.MANUFACTURER)) {
                int i = Settings.Secure.getInt(contentResolver, C0059ao.a(12506), 2);
                String a2 = C0059ao.a(12507);
                if (i == 0) {
                    String string = Settings.Secure.getString(contentResolver, a2);
                    y.e eVar = y.e.AMAZON;
                    return new y(string, false);
                } else if (i == 2) {
                    return null;
                } else {
                    try {
                        a = Settings.Secure.getString(contentResolver, a2);
                    } catch (Throwable th) {
                        AFLogger.afErrorLog(C0059ao.a(12508), th);
                        a = C0059ao.a(12509);
                    }
                    y.e eVar2 = y.e.AMAZON;
                    return new y(a, true);
                }
            }
            return null;
        }
        return null;
    }
}
