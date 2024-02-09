package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: nm  reason: default package */
/* loaded from: classes.dex */
public final class nm {
    public static long a;
    public static Method b;

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            om.a(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            om.b();
        }
    }

    public static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        String str2 = C0059ao.a(14065) + str + C0059ao.a(14066);
    }

    @SuppressLint({"NewApi"})
    public static boolean d() {
        try {
            if (b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return e();
    }

    public static boolean e() {
        String a2 = C0059ao.a(14067);
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (b == null) {
                    a = Trace.class.getField(C0059ao.a(14068)).getLong(null);
                    b = Trace.class.getMethod(a2, Long.TYPE);
                }
                return ((Boolean) b.invoke(null, Long.valueOf(a))).booleanValue();
            } catch (Exception e) {
                c(a2, e);
            }
        }
        return false;
    }
}
