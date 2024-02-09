package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: AxisPay */
/* renamed from: y1  reason: default package */
/* loaded from: classes.dex */
public class y1 {
    public final View a;
    public m3 d;
    public m3 e;
    public m3 f;
    public int c = -1;
    public final c2 b = c2.b();

    public y1(View view) {
        this.a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f == null) {
            this.f = new m3();
        }
        m3 m3Var = this.f;
        m3Var.a();
        ColorStateList s = ac.s(this.a);
        if (s != null) {
            m3Var.d = true;
            m3Var.a = s;
        }
        PorterDuff.Mode t = ac.t(this.a);
        if (t != null) {
            m3Var.c = true;
            m3Var.b = t;
        }
        if (m3Var.d || m3Var.c) {
            c2.i(drawable, m3Var, this.a.getDrawableState());
            return true;
        }
        return false;
    }

    public void b() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            m3 m3Var = this.e;
            if (m3Var != null) {
                c2.i(background, m3Var, this.a.getDrawableState());
                return;
            }
            m3 m3Var2 = this.d;
            if (m3Var2 != null) {
                c2.i(background, m3Var2, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        m3 m3Var = this.e;
        if (m3Var != null) {
            return m3Var.a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        m3 m3Var = this.e;
        if (m3Var != null) {
            return m3Var.b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i) {
        Context context = this.a.getContext();
        int[] iArr = u.ViewBackgroundHelper;
        o3 v = o3.v(context, attributeSet, iArr, i, 0);
        View view = this.a;
        ac.o0(view, view.getContext(), iArr, attributeSet, v.r(), i, 0);
        try {
            int i2 = u.ViewBackgroundHelper_android_background;
            if (v.s(i2)) {
                this.c = v.n(i2, -1);
                ColorStateList f = this.b.f(this.a.getContext(), this.c);
                if (f != null) {
                    h(f);
                }
            }
            int i3 = u.ViewBackgroundHelper_backgroundTint;
            if (v.s(i3)) {
                ac.v0(this.a, v.c(i3));
            }
            int i4 = u.ViewBackgroundHelper_backgroundTintMode;
            if (v.s(i4)) {
                ac.w0(this.a, v2.e(v.k(i4, -1), null));
            }
        } finally {
            v.w();
        }
    }

    public void f(Drawable drawable) {
        this.c = -1;
        h(null);
        b();
    }

    public void g(int i) {
        this.c = i;
        c2 c2Var = this.b;
        h(c2Var != null ? c2Var.f(this.a.getContext(), i) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new m3();
            }
            m3 m3Var = this.d;
            m3Var.a = colorStateList;
            m3Var.d = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new m3();
        }
        m3 m3Var = this.e;
        m3Var.a = colorStateList;
        m3Var.d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new m3();
        }
        m3 m3Var = this.e;
        m3Var.b = mode;
        m3Var.c = true;
        b();
    }

    public final boolean k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.d != null : i == 21;
    }
}
