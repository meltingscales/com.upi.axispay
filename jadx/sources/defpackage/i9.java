package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import defpackage.oa;
import defpackage.y8;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: i9  reason: default package */
/* loaded from: classes.dex */
public class i9 extends m9 {
    public static final Class<?> b;
    public static final Constructor<?> c;
    public static final Method d;
    public static final Method e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName(C0059ao.a(6895));
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            String a = C0059ao.a(6896);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod(a, ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod(C0059ao.a(6897), Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e(C0059ao.a(6898), e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        d = method2;
        e = method;
    }

    public static boolean k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean m() {
        Method method = d;
        if (method == null) {
            Log.w(C0059ao.a(6899), C0059ao.a(6900));
        }
        return method != null;
    }

    public static Object n() {
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.m9
    public Typeface b(Context context, y8.b bVar, Resources resources, int i) {
        y8.c[] a;
        Object n = n();
        if (n == null) {
            return null;
        }
        for (y8.c cVar : bVar.a()) {
            ByteBuffer b2 = n9.b(context, resources, cVar.b());
            if (b2 == null || !k(n, b2, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        return l(n);
    }

    @Override // defpackage.m9
    public Typeface c(Context context, CancellationSignal cancellationSignal, oa.b[] bVarArr, int i) {
        Object n = n();
        if (n == null) {
            return null;
        }
        u4 u4Var = new u4();
        for (oa.b bVar : bVarArr) {
            Uri d2 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) u4Var.get(d2);
            if (byteBuffer == null) {
                byteBuffer = n9.f(context, cancellationSignal, d2);
                u4Var.put(d2, byteBuffer);
            }
            if (byteBuffer == null || !k(n, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface l = l(n);
        if (l == null) {
            return null;
        }
        return Typeface.create(l, i);
    }
}
