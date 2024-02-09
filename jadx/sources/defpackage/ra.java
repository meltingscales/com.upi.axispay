package defpackage;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ra  reason: default package */
/* loaded from: classes.dex */
public final class ra {
    public static Method a;
    public static Method b;

    static {
        String a2 = C0059ao.a(835);
        int i = Build.VERSION.SDK_INT;
        String a3 = C0059ao.a(836);
        if (i >= 21) {
            if (i < 24) {
                try {
                    b = Class.forName(a2).getMethod(a3, Locale.class);
                    return;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
            return;
        }
        try {
            Class<?> cls = Class.forName(a2);
            if (cls != null) {
                a = cls.getMethod(C0059ao.a(837), String.class);
                b = cls.getMethod(a3, String.class);
            }
        } catch (Exception e2) {
            a = null;
            b = null;
            Log.w(C0059ao.a(838), e2);
        }
    }

    public static String a(Locale locale) {
        String a2 = C0059ao.a(839);
        String locale2 = locale.toString();
        try {
            Method method = b;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException e) {
            Log.w(a2, e);
        } catch (InvocationTargetException e2) {
            Log.w(a2, e2);
        }
        return locale2;
    }

    public static String b(String str) {
        String a2 = C0059ao.a(840);
        try {
            Method method = a;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e) {
            Log.w(a2, e);
        } catch (InvocationTargetException e2) {
            Log.w(a2, e2);
        }
        return null;
    }

    public static String c(Locale locale) {
        String a2 = C0059ao.a(841);
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) b.invoke(null, locale)).getScript();
            } catch (IllegalAccessException e) {
                Log.w(a2, e);
                return locale.getScript();
            } catch (InvocationTargetException e2) {
                Log.w(a2, e2);
                return locale.getScript();
            }
        }
        String a3 = a(locale);
        if (a3 != null) {
            return b(a3);
        }
        return null;
    }
}
