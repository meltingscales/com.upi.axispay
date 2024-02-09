package defpackage;

import android.util.Log;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: y60  reason: default package */
/* loaded from: classes.dex */
public final class y60 {
    public static volatile boolean a;
    public static volatile boolean b;

    static {
        C0059ao.a(y60.class, 350);
    }

    public static void a(String str, Object... objArr) {
        if (a) {
            d(3, null, str, objArr);
        }
    }

    public static void b(Throwable th) {
        d(6, th, null, new Object[0]);
    }

    public static void c(String str, Object... objArr) {
        d(4, null, str, objArr);
    }

    public static void d(int i, Throwable th, String str, Object... objArr) {
        if (b) {
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
            if (th != null) {
                if (str == null) {
                    str = th.getMessage();
                }
                str = String.format(C0059ao.a(3782), str, Log.getStackTraceString(th));
            }
            Log.println(i, j60.b, str);
        }
    }

    public static void e(String str, Object... objArr) {
        d(5, null, str, objArr);
    }

    public static void f(boolean z) {
        a = z;
    }
}
