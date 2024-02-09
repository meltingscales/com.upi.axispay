package defpackage;

import android.util.Log;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: qr  reason: default package */
/* loaded from: classes.dex */
public final class qr {
    public static void a(String str, String str2, Object obj) {
        d(str);
        String.format(str2, obj);
    }

    public static void b(String str, String str2, Object... objArr) {
        d(str);
        String.format(str2, objArr);
    }

    public static void c(String str, String str2, Throwable th) {
        Log.e(d(str), str2, th);
    }

    public static String d(String str) {
        return C0059ao.a(458) + str;
    }

    public static void e(String str, String str2) {
        Log.i(d(str), str2);
    }

    public static void f(String str, String str2, Object obj) {
        Log.w(d(str), String.format(str2, obj));
    }
}
