package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
@SuppressLint({"RestrictedAPI"})
/* renamed from: k0  reason: default package */
/* loaded from: classes.dex */
public final class k0 {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final WeakHashMap<Context, SparseArray<a>> b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    /* compiled from: AxisPay */
    /* renamed from: k0$a */
    /* loaded from: classes.dex */
    public static class a {
        public final ColorStateList a;
        public final Configuration b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.b = configuration;
        }
    }

    public static void a(Context context, int i, ColorStateList colorStateList) {
        synchronized (c) {
            WeakHashMap<Context, SparseArray<a>> weakHashMap = b;
            SparseArray<a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i, new a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    public static ColorStateList b(Context context, int i) {
        a aVar;
        synchronized (c) {
            SparseArray<a> sparseArray = b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i)) != null) {
                if (aVar.b.equals(context.getResources().getConfiguration())) {
                    return aVar.a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    public static ColorStateList c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList b2 = b(context, i);
        if (b2 != null) {
            return b2;
        }
        ColorStateList f = f(context, i);
        if (f != null) {
            a(context, i, f);
            return f;
        }
        return t8.e(context, i);
    }

    public static Drawable d(Context context, int i) {
        return e3.h().j(context, i);
    }

    public static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    public static ColorStateList f(Context context, int i) {
        if (g(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return w8.a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e(C0059ao.a(9086), C0059ao.a(9087), e);
            return null;
        }
    }

    public static boolean g(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue e = e();
        resources.getValue(i, e, true);
        int i2 = e.type;
        return i2 >= 28 && i2 <= 31;
    }
}
