package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import defpackage.b9;
import java.lang.ref.WeakReference;

/* compiled from: AxisPay */
/* renamed from: q2  reason: default package */
/* loaded from: classes.dex */
public class q2 {
    public final TextView a;
    public m3 b;
    public m3 c;
    public m3 d;
    public m3 e;
    public m3 f;
    public m3 g;
    public m3 h;
    public final r2 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    /* compiled from: AxisPay */
    /* renamed from: q2$a */
    /* loaded from: classes.dex */
    public class a extends b9.c {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ WeakReference c;

        public a(int i, int i2, WeakReference weakReference) {
            this.a = i;
            this.b = i2;
            this.c = weakReference;
        }

        @Override // defpackage.b9.c
        public void d(int i) {
        }

        @Override // defpackage.b9.c
        public void e(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
                typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
            }
            q2.this.n(this.c, typeface);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: q2$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ TextView b;
        public final /* synthetic */ Typeface c;
        public final /* synthetic */ int d;

        public b(q2 q2Var, TextView textView, Typeface typeface, int i) {
            this.b = textView;
            this.c = typeface;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.setTypeface(this.c, this.d);
        }
    }

    public q2(TextView textView) {
        this.a = textView;
        this.i = new r2(textView);
    }

    public static m3 d(Context context, c2 c2Var, int i) {
        ColorStateList f = c2Var.f(context, i);
        if (f != null) {
            m3 m3Var = new m3();
            m3Var.d = true;
            m3Var.a = f;
            return m3Var;
        }
        return null;
    }

    public void A(int i, float f) {
        if (tc.a || l()) {
            return;
        }
        B(i, f);
    }

    public final void B(int i, float f) {
        this.i.y(i, f);
    }

    public final void C(Context context, o3 o3Var) {
        String o;
        this.j = o3Var.k(u.TextAppearance_android_textStyle, this.j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int k = o3Var.k(u.TextAppearance_android_textFontWeight, -1);
            this.k = k;
            if (k != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        int i2 = u.TextAppearance_android_fontFamily;
        if (!o3Var.s(i2) && !o3Var.s(u.TextAppearance_fontFamily)) {
            int i3 = u.TextAppearance_android_typeface;
            if (o3Var.s(i3)) {
                this.m = false;
                int k2 = o3Var.k(i3, 1);
                if (k2 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (k2 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else if (k2 != 3) {
                    return;
                } else {
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i4 = u.TextAppearance_fontFamily;
        if (o3Var.s(i4)) {
            i2 = i4;
        }
        int i5 = this.k;
        int i6 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface j = o3Var.j(i2, this.j, new a(i5, i6, new WeakReference(this.a)));
                if (j != null) {
                    if (i >= 28 && this.k != -1) {
                        this.l = Typeface.create(Typeface.create(j, 0), this.k, (this.j & 2) != 0);
                    } else {
                        this.l = j;
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (o = o3Var.o(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
            this.l = Typeface.create(Typeface.create(o, 0), this.k, (this.j & 2) != 0);
        } else {
            this.l = Typeface.create(o, this.j);
        }
    }

    public final void a(Drawable drawable, m3 m3Var) {
        if (drawable == null || m3Var == null) {
            return;
        }
        c2.i(drawable, m3Var, this.a.getDrawableState());
    }

    public void b() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f == null && this.g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    public void c() {
        this.i.b();
    }

    public int e() {
        return this.i.j();
    }

    public int f() {
        return this.i.k();
    }

    public int g() {
        return this.i.l();
    }

    public int[] h() {
        return this.i.m();
    }

    public int i() {
        return this.i.n();
    }

    public ColorStateList j() {
        m3 m3Var = this.h;
        if (m3Var != null) {
            return m3Var.a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        m3 m3Var = this.h;
        if (m3Var != null) {
            return m3Var.b;
        }
        return null;
    }

    public boolean l() {
        return this.i.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c5 A[ADDED_TO_REGION] */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q2.m(android.util.AttributeSet, int):void");
    }

    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (ac.U(textView)) {
                    textView.post(new b(this, textView, typeface, this.j));
                } else {
                    textView.setTypeface(typeface, this.j);
                }
            }
        }
    }

    public void o(boolean z, int i, int i2, int i3, int i4) {
        if (tc.a) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i) {
        String o;
        ColorStateList c;
        ColorStateList c2;
        ColorStateList c3;
        o3 t = o3.t(context, i, u.TextAppearance);
        int i2 = u.TextAppearance_textAllCaps;
        if (t.s(i2)) {
            s(t.a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = u.TextAppearance_android_textColor;
            if (t.s(i4) && (c3 = t.c(i4)) != null) {
                this.a.setTextColor(c3);
            }
            int i5 = u.TextAppearance_android_textColorLink;
            if (t.s(i5) && (c2 = t.c(i5)) != null) {
                this.a.setLinkTextColor(c2);
            }
            int i6 = u.TextAppearance_android_textColorHint;
            if (t.s(i6) && (c = t.c(i6)) != null) {
                this.a.setHintTextColor(c);
            }
        }
        int i7 = u.TextAppearance_android_textSize;
        if (t.s(i7) && t.f(i7, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, t);
        if (i3 >= 26) {
            int i8 = u.TextAppearance_fontVariationSettings;
            if (t.s(i8) && (o = t.o(i8)) != null) {
                this.a.setFontVariationSettings(o);
            }
        }
        t.w();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.j);
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        pc.f(editorInfo, textView.getText());
    }

    public void s(boolean z) {
        this.a.setAllCaps(z);
    }

    public void t(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.i.u(i, i2, i3, i4);
    }

    public void u(int[] iArr, int i) throws IllegalArgumentException {
        this.i.v(iArr, i);
    }

    public void v(int i) {
        this.i.w(i);
    }

    public void w(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new m3();
        }
        m3 m3Var = this.h;
        m3Var.a = colorStateList;
        m3Var.d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new m3();
        }
        m3 m3Var = this.h;
        m3Var.b = mode;
        m3Var.c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            TextView textView = this.a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            if (i >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
                if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                    TextView textView2 = this.a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            TextView textView3 = this.a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    public final void z() {
        m3 m3Var = this.h;
        this.b = m3Var;
        this.c = m3Var;
        this.d = m3Var;
        this.e = m3Var;
        this.f = m3Var;
        this.g = m3Var;
    }
}
