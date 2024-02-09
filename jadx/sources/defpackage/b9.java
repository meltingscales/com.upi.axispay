package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: b9  reason: default package */
/* loaded from: classes.dex */
public final class b9 {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final WeakHashMap<b, SparseArray<a>> b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    /* compiled from: AxisPay */
    /* renamed from: b9$a */
    /* loaded from: classes.dex */
    public static class a {
        public final ColorStateList a;
        public final Configuration b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.b = configuration;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: b9$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final Resources a;
        public final Resources.Theme b;

        public b(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && ya.a(this.b, bVar.b);
        }

        public int hashCode() {
            return ya.b(this.a, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: b9$c */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* compiled from: AxisPay */
        /* renamed from: b9$c$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ Typeface b;

            public a(Typeface typeface) {
                this.b = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.e(this.b);
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: b9$c$b */
        /* loaded from: classes.dex */
        public class b implements Runnable {
            public final /* synthetic */ int b;

            public b(int i) {
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.d(this.b);
            }
        }

        public static Handler c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void a(int i, Handler handler) {
            c(handler).post(new b(i));
        }

        public final void b(Typeface typeface, Handler handler) {
            c(handler).post(new a(typeface));
        }

        public abstract void d(int i);

        public abstract void e(Typeface typeface);
    }

    /* compiled from: AxisPay */
    /* renamed from: b9$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* compiled from: AxisPay */
        /* renamed from: b9$d$a */
        /* loaded from: classes.dex */
        public static class a {
            public static final Object a = new Object();
            public static Method b;
            public static boolean c;

            public static void a(Resources.Theme theme) {
                synchronized (a) {
                    if (!c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod(C0059ao.a(10626), new Class[0]);
                            b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i(C0059ao.a(10627), C0059ao.a(10628), e);
                        }
                        c = true;
                    }
                    Method method = b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i(C0059ao.a(10629), C0059ao.a(10630), e2);
                            b = null;
                        }
                    }
                }
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: b9$d$b */
        /* loaded from: classes.dex */
        public static class b {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                b.a(theme);
            } else if (i >= 23) {
                a.a(theme);
            }
        }
    }

    public static void a(b bVar, int i, ColorStateList colorStateList) {
        synchronized (c) {
            WeakHashMap<b, SparseArray<a>> weakHashMap = b;
            SparseArray<a> sparseArray = weakHashMap.get(bVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(bVar, sparseArray);
            }
            sparseArray.append(i, new a(colorStateList, bVar.a.getConfiguration()));
        }
    }

    public static ColorStateList b(b bVar, int i) {
        a aVar;
        synchronized (c) {
            SparseArray<a> sparseArray = b.get(bVar);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i)) != null) {
                if (aVar.b.equals(bVar.a.getConfiguration())) {
                    return aVar.a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    public static Typeface c(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return l(context, i, new TypedValue(), 0, null, null, false, true);
    }

    public static ColorStateList d(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i, theme);
        }
        b bVar = new b(resources, theme);
        ColorStateList b2 = b(bVar, i);
        if (b2 != null) {
            return b2;
        }
        ColorStateList j = j(resources, i, theme);
        if (j != null) {
            a(bVar, i, j);
            return j;
        }
        return resources.getColorStateList(i);
    }

    public static Drawable e(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    public static Typeface f(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return l(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface g(Context context, int i, TypedValue typedValue, int i2, c cVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return l(context, i, typedValue, i2, cVar, null, true, false);
    }

    public static void h(Context context, int i, c cVar, Handler handler) throws Resources.NotFoundException {
        db.e(cVar);
        if (context.isRestricted()) {
            cVar.a(-4, handler);
        } else {
            l(context, i, new TypedValue(), 0, cVar, handler, false, false);
        }
    }

    public static TypedValue i() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    public static ColorStateList j(Resources resources, int i, Resources.Theme theme) {
        if (k(resources, i)) {
            return null;
        }
        try {
            return w8.a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e(C0059ao.a(639), C0059ao.a(640), e);
            return null;
        }
    }

    public static boolean k(Resources resources, int i) {
        TypedValue i2 = i();
        resources.getValue(i, i2, true);
        int i3 = i2.type;
        return i3 >= 28 && i3 <= 31;
    }

    public static Typeface l(Context context, int i, TypedValue typedValue, int i2, c cVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface m = m(context, resources, typedValue, i, i2, cVar, handler, z, z2);
        if (m == null && cVar == null && !z2) {
            throw new Resources.NotFoundException(C0059ao.a(641) + Integer.toHexString(i) + C0059ao.a(642));
        }
        return m;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface m(android.content.Context r16, android.content.res.Resources r17, android.util.TypedValue r18, int r19, int r20, defpackage.b9.c r21, android.os.Handler r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b9.m(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, b9$c, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
