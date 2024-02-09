package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AndroidUtils;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class r {

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: ı  reason: contains not printable characters */
        public static final r f315 = new r();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean m215(Context context, String[] strArr) {
        for (String str : strArr) {
            if (AndroidUtils.isPermissionAvailable(context, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (60000 < (r4.getTime() - r9.getTime())) goto L12;
     */
    /* renamed from: ι  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.location.Location m214(android.content.Context r9) {
        /*
            r0 = 12407(0x3077, float:1.7386E-41)
            java.lang.String r1 = myunmn.C0059ao.a(r0)
            r2 = 0
            r0 = 12408(0x3078, float:1.7387E-41)
            java.lang.String r3 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r3 = r9.getSystemService(r3)     // Catch: java.lang.Throwable -> L6e
            android.location.LocationManager r3 = (android.location.LocationManager) r3     // Catch: java.lang.Throwable -> L6e
            r0 = 12409(0x3079, float:1.7389E-41)
            java.lang.String r4 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L6e
            r0 = 12410(0x307a, float:1.739E-41)
            java.lang.String r5 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String[] r5 = new java.lang.String[]{r1, r5}     // Catch: java.lang.Throwable -> L6e
            boolean r5 = m215(r9, r5)     // Catch: java.lang.Throwable -> L6e
            if (r5 == 0) goto L32
            android.location.Location r4 = r3.getLastKnownLocation(r4)     // Catch: java.lang.Throwable -> L6e
            goto L33
        L32:
            r4 = r2
        L33:
            r0 = 12411(0x307b, float:1.7392E-41)
            java.lang.String r5 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L6e
            boolean r9 = m215(r9, r1)     // Catch: java.lang.Throwable -> L6e
            if (r9 == 0) goto L49
            android.location.Location r9 = r3.getLastKnownLocation(r5)     // Catch: java.lang.Throwable -> L6e
            goto L4a
        L49:
            r9 = r2
        L4a:
            if (r9 != 0) goto L50
            if (r4 != 0) goto L50
            r4 = r2
            goto L6b
        L50:
            if (r9 != 0) goto L55
            if (r4 == 0) goto L55
            goto L6b
        L55:
            if (r4 != 0) goto L59
            if (r9 != 0) goto L6a
        L59:
            long r5 = r4.getTime()     // Catch: java.lang.Throwable -> L6e
            long r7 = r9.getTime()     // Catch: java.lang.Throwable -> L6e
            long r5 = r5 - r7
            r7 = 60000(0xea60, double:2.9644E-319)
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 >= 0) goto L6a
            goto L6b
        L6a:
            r4 = r9
        L6b:
            if (r4 == 0) goto L6e
            r2 = r4
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.r.m214(android.content.Context):android.location.Location");
    }
}
