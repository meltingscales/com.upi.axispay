package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import defpackage.oa;
import defpackage.y8;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: j9  reason: default package */
/* loaded from: classes.dex */
public class j9 extends h9 {
    public final Class<?> g;
    public final Constructor<?> h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public j9() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y = y();
            constructor = z(y);
            method2 = v(y);
            method3 = w(y);
            method4 = A(y);
            method5 = u(y);
            method = x(y);
            cls = y;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e(C0059ao.a(8491), C0059ao.a(8490) + e.getClass().getName(), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.g = cls;
        this.h = constructor;
        this.i = method2;
        this.j = method3;
        this.k = method4;
        this.l = method5;
        this.m = method;
    }

    private Object o() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method A(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(C0059ao.a(8492), new Class[0]);
    }

    @Override // defpackage.h9, defpackage.m9
    public Typeface b(Context context, y8.b bVar, Resources resources, int i) {
        y8.c[] a;
        if (!t()) {
            return super.b(context, bVar, resources, i);
        }
        Object o = o();
        if (o == null) {
            return null;
        }
        for (y8.c cVar : bVar.a()) {
            if (!q(context, o, cVar.a(), cVar.c(), cVar.e(), cVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d()))) {
                p(o);
                return null;
            }
        }
        if (s(o)) {
            return l(o);
        }
        return null;
    }

    @Override // defpackage.h9, defpackage.m9
    public Typeface c(Context context, CancellationSignal cancellationSignal, oa.b[] bVarArr, int i) {
        Typeface l;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!t()) {
            oa.b h = h(bVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h.d(), C0059ao.a(8493), cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h.e()).setItalic(h.f()).build();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> h2 = n9.h(context, bVarArr, cancellationSignal);
        Object o = o();
        if (o == null) {
            return null;
        }
        boolean z = false;
        for (oa.b bVar : bVarArr) {
            ByteBuffer byteBuffer = h2.get(bVar.d());
            if (byteBuffer != null) {
                if (!r(o, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    p(o);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            p(o);
            return null;
        } else if (s(o) && (l = l(o)) != null) {
            return Typeface.create(l, i);
        } else {
            return null;
        }
    }

    @Override // defpackage.m9
    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        if (!t()) {
            return super.e(context, resources, i, str, i2);
        }
        Object o = o();
        if (o == null) {
            return null;
        }
        if (!q(context, o, str, 0, -1, -1, null)) {
            p(o);
            return null;
        } else if (s(o)) {
            return l(o);
        } else {
            return null;
        }
    }

    public Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void p(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean q(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean s(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean t() {
        if (this.i == null) {
            Log.w(C0059ao.a(8494), C0059ao.a(8495));
        }
        return this.i != null;
    }

    public Method u(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(C0059ao.a(8496), new Class[0]);
    }

    public Method v(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(C0059ao.a(8497), AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method w(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(C0059ao.a(8498), ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(C0059ao.a(8499), Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class<?> y() throws ClassNotFoundException {
        return Class.forName(C0059ao.a(8500));
    }

    public Constructor<?> z(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }
}
