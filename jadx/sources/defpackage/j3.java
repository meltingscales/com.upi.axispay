package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: j3  reason: default package */
/* loaded from: classes.dex */
public class j3 {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final int[] b = {-16842910};
    public static final int[] c = {16842908};
    public static final int[] d = {16842919};
    public static final int[] e = {16842912};
    public static final int[] f = new int[0];
    public static final int[] g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(u.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(u.AppCompatTheme_windowActionBar)) {
                String a2 = C0059ao.a(8143);
                Log.e(a2, C0059ao.a(8144) + view.getClass() + C0059ao.a(8145));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList e2 = e(context, i);
        if (e2 != null && e2.isStateful()) {
            return e2.getColorForState(b, e2.getDefaultColor());
        }
        TypedValue f2 = f();
        context.getTheme().resolveAttribute(16842803, f2, true);
        return d(context, i, f2.getFloat());
    }

    public static int c(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        o3 u = o3.u(context, null, iArr);
        try {
            return u.b(0, 0);
        } finally {
            u.w();
        }
    }

    public static int d(Context context, int i, float f2) {
        int c2 = c(context, i);
        return d9.m(c2, Math.round(Color.alpha(c2) * f2));
    }

    public static ColorStateList e(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        o3 u = o3.u(context, null, iArr);
        try {
            return u.c(0);
        } finally {
            u.w();
        }
    }

    public static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}
