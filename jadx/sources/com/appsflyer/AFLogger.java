package com.appsflyer;

import android.util.Log;
import com.appsflyer.internal.Exlytics;
import com.appsflyer.internal.ae;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AFLogger {

    /* renamed from: ι  reason: contains not printable characters */
    private static final long f37 = System.currentTimeMillis();

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        

        /* renamed from: ɩ  reason: contains not printable characters */
        private int f39;

        LogLevel(int i) {
            this.f39 = i;
        }

        public final int getLevel() {
            return this.f39;
        }
    }

    public static void afDebugLog(String str) {
        if (m24(LogLevel.DEBUG)) {
            m19(str, false);
        }
        ae.m150().m160(null, C0059ao.a(3884), m19(str, true));
    }

    public static void afErrorLog(String str, Throwable th) {
        m23(str, th, true, false);
    }

    public static void afInfoLog(String str, boolean z) {
        if (m24(LogLevel.INFO)) {
            Log.i(C0059ao.a(3885), m19(str, false));
        }
        if (z) {
            ae.m150().m160(null, C0059ao.a(3886), m19(str, true));
        }
    }

    public static void afRDLog(String str) {
        if (m24(LogLevel.VERBOSE)) {
            m19(str, false);
        }
        ae.m150().m160(null, C0059ao.a(3887), m19(str, true));
    }

    public static void afWarnLog(String str) {
        m20(str);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m19(String str, boolean z) {
        if (str == null) {
            str = C0059ao.a(3888);
        }
        if (!z) {
            if (LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt(C0059ao.a(3889), LogLevel.NONE.getLevel())) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder(C0059ao.a(3890));
        sb.append(System.currentTimeMillis() - f37);
        sb.append(C0059ao.a(3891));
        sb.append(Thread.currentThread().getName());
        sb.append(C0059ao.a(3892));
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean m21() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m22(String str) {
        if (!m21()) {
            m19(str, false);
        }
        ae.m150().m160(null, C0059ao.a(3895), str);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m23(String str, Throwable th, boolean z, boolean z2) {
        if (m24(LogLevel.ERROR)) {
            if (str == null) {
                str = th.getClass().getSimpleName();
            }
            String m19 = m19(str, false);
            if (z2) {
                Log.e(C0059ao.a(3896), m19, th);
            }
        }
        ae m150 = ae.m150();
        Throwable cause = th.getCause();
        m150.m160(C0059ao.a(3897), th.getClass().getSimpleName(), ae.m156(cause == null ? th.getMessage() : cause.getMessage(), cause == null ? th.getStackTrace() : cause.getStackTrace()));
        Exlytics.increment();
    }

    public static void afErrorLog(String str, Throwable th, boolean z) {
        m23(str, th, true, z);
    }

    public static void afErrorLog(Throwable th) {
        m23(null, th, false, false);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m20(String str) {
        if (m24(LogLevel.WARNING)) {
            Log.w(C0059ao.a(3893), m19(str, false));
        }
        ae.m150().m160(null, C0059ao.a(3894), m19(str, true));
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean m24(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt(C0059ao.a(3898), LogLevel.NONE.getLevel());
    }
}
