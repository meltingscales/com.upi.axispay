package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import myunmn.C0059ao;

/* compiled from: AxisPay */
@Deprecated
/* renamed from: ha  reason: default package */
/* loaded from: classes.dex */
public final class ha {
    static {
        int i = Build.VERSION.SDK_INT;
        if (i < 18 || i >= 29) {
            return;
        }
        try {
            Trace.class.getField(C0059ao.a(7705)).getLong(null);
            String a = C0059ao.a(7706);
            Class cls = Long.TYPE;
            Trace.class.getMethod(a, cls);
            String a2 = C0059ao.a(7707);
            Class cls2 = Integer.TYPE;
            Trace.class.getMethod(a2, cls, String.class, cls2);
            Trace.class.getMethod(C0059ao.a(7708), cls, String.class, cls2);
            Trace.class.getMethod(C0059ao.a(7709), cls, String.class, cls2);
        } catch (Exception e) {
            Log.i(C0059ao.a(7710), C0059ao.a(7711), e);
        }
    }

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
