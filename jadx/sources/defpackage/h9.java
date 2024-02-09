package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import defpackage.oa;
import defpackage.y8;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: h9  reason: default package */
/* loaded from: classes.dex */
public class h9 extends m9 {
    public static Class<?> b;
    public static Constructor<?> c;
    public static Method d;
    public static Method e;
    public static boolean f;

    static {
        C0059ao.a(h9.class, 310);
    }

    public static boolean k(Object obj, String str, int i, boolean z) {
        n();
        try {
            return ((Boolean) d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Typeface l(Object obj) {
        n();
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f) {
            return;
        }
        f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName(C0059ao.a(6230));
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod(C0059ao.a(6231), String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod(C0059ao.a(6232), Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e(C0059ao.a(6233), e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        d = method2;
        e = method;
    }

    public static Object o() {
        n();
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.m9
    public Typeface b(Context context, y8.b bVar, Resources resources, int i) {
        y8.c[] a;
        Object o = o();
        for (y8.c cVar : bVar.a()) {
            File e2 = n9.e(context);
            if (e2 == null) {
                return null;
            }
            try {
                if (!n9.c(e2, resources, cVar.b())) {
                    return null;
                }
                if (!k(o, e2.getPath(), cVar.e(), cVar.f())) {
                    return null;
                }
                e2.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e2.delete();
            }
        }
        return l(o);
    }

    @Override // defpackage.m9
    public Typeface c(Context context, CancellationSignal cancellationSignal, oa.b[] bVarArr, int i) {
        if (bVarArr.length < 1) {
            return null;
        }
        oa.b h = h(bVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h.d(), C0059ao.a(6234), cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File m = m(openFileDescriptor);
            if (m != null && m.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(m);
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                Typeface d2 = super.d(context, fileInputStream);
                fileInputStream.close();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return d2;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final File m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink(C0059ao.a(6235) + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
