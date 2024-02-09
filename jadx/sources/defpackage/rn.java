package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: rn  reason: default package */
/* loaded from: classes.dex */
public class rn {
    public static final xn a;
    public static final Property<View, Float> b;

    /* compiled from: AxisPay */
    /* renamed from: rn$a */
    /* loaded from: classes.dex */
    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(rn.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            rn.g(view, f.floatValue());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rn$b */
    /* loaded from: classes.dex */
    public static class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return ac.u(view);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Rect rect) {
            ac.x0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new wn();
        } else if (i >= 23) {
            a = new vn();
        } else if (i >= 22) {
            a = new un();
        } else if (i >= 21) {
            a = new tn();
        } else if (i >= 19) {
            a = new sn();
        } else {
            a = new xn();
        }
        b = new a(Float.class, C0059ao.a(1097));
        new b(Rect.class, C0059ao.a(1098));
    }

    public static void a(View view) {
        a.a(view);
    }

    public static qn b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new pn(view);
        }
        return on.e(view);
    }

    public static float c(View view) {
        return a.c(view);
    }

    public static bo d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new ao(view);
        }
        return new zn(view.getWindowToken());
    }

    public static void e(View view) {
        a.d(view);
    }

    public static void f(View view, int i, int i2, int i3, int i4) {
        a.e(view, i, i2, i3, i4);
    }

    public static void g(View view, float f) {
        a.f(view, f);
    }

    public static void h(View view, int i) {
        a.g(view, i);
    }

    public static void i(View view, Matrix matrix) {
        a.h(view, matrix);
    }

    public static void j(View view, Matrix matrix) {
        a.i(view, matrix);
    }
}
