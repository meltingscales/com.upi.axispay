package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: i8  reason: default package */
/* loaded from: classes.dex */
public final class i8 {

    /* compiled from: AxisPay */
    /* renamed from: i8$a */
    /* loaded from: classes.dex */
    public static class a {
        public static Method a;
        public static boolean b;
        public static Method c;
        public static boolean d;

        public static IBinder a(Bundle bundle, String str) {
            boolean z = b;
            String a2 = C0059ao.a(15035);
            if (!z) {
                try {
                    Method method = Bundle.class.getMethod(C0059ao.a(15036), String.class);
                    a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(a2, C0059ao.a(15037), e);
                }
                b = true;
            }
            Method method2 = a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i(a2, C0059ao.a(15038), e2);
                    a = null;
                }
            }
            return null;
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) {
            boolean z = d;
            String a2 = C0059ao.a(15039);
            if (!z) {
                try {
                    Method method = Bundle.class.getMethod(C0059ao.a(15040), String.class, IBinder.class);
                    c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(a2, C0059ao.a(15041), e);
                }
                d = true;
            }
            Method method2 = c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i(a2, C0059ao.a(15042), e2);
                    c = null;
                }
            }
        }
    }

    public static IBinder a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return a.a(bundle, str);
    }

    public static void b(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            a.b(bundle, str, iBinder);
        }
    }
}
