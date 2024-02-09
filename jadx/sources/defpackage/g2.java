package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: AxisPay */
/* renamed from: g2  reason: default package */
/* loaded from: classes.dex */
public class g2 {
    public final ImageView a;
    public m3 b;
    public m3 c;
    public m3 d;

    public g2(ImageView imageView) {
        this.a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new m3();
        }
        m3 m3Var = this.d;
        m3Var.a();
        ColorStateList a = wc.a(this.a);
        if (a != null) {
            m3Var.d = true;
            m3Var.a = a;
        }
        PorterDuff.Mode b = wc.b(this.a);
        if (b != null) {
            m3Var.c = true;
            m3Var.b = b;
        }
        if (m3Var.d || m3Var.c) {
            c2.i(drawable, m3Var, this.a.getDrawableState());
            return true;
        }
        return false;
    }

    public void b() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            v2.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            m3 m3Var = this.c;
            if (m3Var != null) {
                c2.i(drawable, m3Var, this.a.getDrawableState());
                return;
            }
            m3 m3Var2 = this.b;
            if (m3Var2 != null) {
                c2.i(drawable, m3Var2, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        m3 m3Var = this.c;
        if (m3Var != null) {
            return m3Var.a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        m3 m3Var = this.c;
        if (m3Var != null) {
            return m3Var.b;
        }
        return null;
    }

    public boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i) {
        int n;
        Context context = this.a.getContext();
        int[] iArr = u.AppCompatImageView;
        o3 v = o3.v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.a;
        ac.o0(imageView, imageView.getContext(), iArr, attributeSet, v.r(), i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (n = v.n(u.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = k0.d(this.a.getContext(), n)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                v2.b(drawable);
            }
            int i2 = u.AppCompatImageView_tint;
            if (v.s(i2)) {
                wc.c(this.a, v.c(i2));
            }
            int i3 = u.AppCompatImageView_tintMode;
            if (v.s(i3)) {
                wc.d(this.a, v2.e(v.k(i3, -1), null));
            }
        } finally {
            v.w();
        }
    }

    public void g(int i) {
        if (i != 0) {
            Drawable d = k0.d(this.a.getContext(), i);
            if (d != null) {
                v2.b(d);
            }
            this.a.setImageDrawable(d);
        } else {
            this.a.setImageDrawable(null);
        }
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new m3();
        }
        m3 m3Var = this.c;
        m3Var.a = colorStateList;
        m3Var.d = true;
        b();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new m3();
        }
        m3 m3Var = this.c;
        m3Var.b = mode;
        m3Var.c = true;
        b();
    }

    public final boolean j() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.b != null : i == 21;
    }
}
