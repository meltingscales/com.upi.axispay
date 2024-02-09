package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;

/* compiled from: AxisPay */
/* renamed from: lw  reason: default package */
/* loaded from: classes.dex */
public class lw {
    public static final boolean t;
    public final MaterialButton a;
    public lz b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q;
    public LayerDrawable r;
    public int s;

    static {
        t = Build.VERSION.SDK_INT >= 21;
    }

    public lw(MaterialButton materialButton, lz lzVar) {
        this.a = materialButton;
        this.b = lzVar;
    }

    public void A(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            I();
        }
    }

    public void B(int i) {
        if (this.h != i) {
            this.h = i;
            I();
        }
    }

    public void C(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (f() != null) {
                o9.o(f(), this.j);
            }
        }
    }

    public void D(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (f() == null || this.i == null) {
                return;
            }
            o9.p(f(), this.i);
        }
    }

    public final void E(int i, int i2) {
        int I = ac.I(this.a);
        int paddingTop = this.a.getPaddingTop();
        int H = ac.H(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            F();
        }
        ac.E0(this.a, I, (paddingTop + i) - i3, H, (paddingBottom + i2) - i4);
    }

    public final void F() {
        this.a.setInternalBackground(a());
        hz f = f();
        if (f != null) {
            f.W(this.s);
        }
    }

    public final void G(lz lzVar) {
        if (f() != null) {
            f().setShapeAppearanceModel(lzVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(lzVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(lzVar);
        }
    }

    public void H(int i, int i2) {
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setBounds(this.c, this.e, i2 - this.d, i - this.f);
        }
    }

    public final void I() {
        hz f = f();
        hz n = n();
        if (f != null) {
            f.e0(this.h, this.k);
            if (n != null) {
                n.d0(this.h, this.n ? ww.c(this.a, iv.colorSurface) : 0);
            }
        }
    }

    public final InsetDrawable J(Drawable drawable) {
        return new InsetDrawable(drawable, this.c, this.e, this.d, this.f);
    }

    public final Drawable a() {
        hz hzVar = new hz(this.b);
        hzVar.M(this.a.getContext());
        o9.o(hzVar, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            o9.p(hzVar, mode);
        }
        hzVar.e0(this.h, this.k);
        hz hzVar2 = new hz(this.b);
        hzVar2.setTint(0);
        hzVar2.d0(this.h, this.n ? ww.c(this.a, iv.colorSurface) : 0);
        if (t) {
            hz hzVar3 = new hz(this.b);
            this.m = hzVar3;
            o9.n(hzVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(yy.d(this.l), J(new LayerDrawable(new Drawable[]{hzVar2, hzVar})), this.m);
            this.r = rippleDrawable;
            return rippleDrawable;
        }
        xy xyVar = new xy(this.b);
        this.m = xyVar;
        o9.o(xyVar, yy.d(this.l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{hzVar2, hzVar, this.m});
        this.r = layerDrawable;
        return J(layerDrawable);
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public oz e() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.r.getNumberOfLayers() > 2) {
            return (oz) this.r.getDrawable(2);
        }
        return (oz) this.r.getDrawable(1);
    }

    public hz f() {
        return g(false);
    }

    public final hz g(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (t) {
            return (hz) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return (hz) this.r.getDrawable(!z ? 1 : 0);
    }

    public ColorStateList h() {
        return this.l;
    }

    public lz i() {
        return this.b;
    }

    public ColorStateList j() {
        return this.k;
    }

    public int k() {
        return this.h;
    }

    public ColorStateList l() {
        return this.j;
    }

    public PorterDuff.Mode m() {
        return this.i;
    }

    public final hz n() {
        return g(true);
    }

    public boolean o() {
        return this.o;
    }

    public boolean p() {
        return this.q;
    }

    public void q(TypedArray typedArray) {
        this.c = typedArray.getDimensionPixelOffset(sv.MaterialButton_android_insetLeft, 0);
        this.d = typedArray.getDimensionPixelOffset(sv.MaterialButton_android_insetRight, 0);
        this.e = typedArray.getDimensionPixelOffset(sv.MaterialButton_android_insetTop, 0);
        this.f = typedArray.getDimensionPixelOffset(sv.MaterialButton_android_insetBottom, 0);
        int i = sv.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.g = dimensionPixelSize;
            y(this.b.w(dimensionPixelSize));
            this.p = true;
        }
        this.h = typedArray.getDimensionPixelSize(sv.MaterialButton_strokeWidth, 0);
        this.i = ny.e(typedArray.getInt(sv.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.j = ty.a(this.a.getContext(), typedArray, sv.MaterialButton_backgroundTint);
        this.k = ty.a(this.a.getContext(), typedArray, sv.MaterialButton_strokeColor);
        this.l = ty.a(this.a.getContext(), typedArray, sv.MaterialButton_rippleColor);
        this.q = typedArray.getBoolean(sv.MaterialButton_android_checkable, false);
        this.s = typedArray.getDimensionPixelSize(sv.MaterialButton_elevation, 0);
        int I = ac.I(this.a);
        int paddingTop = this.a.getPaddingTop();
        int H = ac.H(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        if (typedArray.hasValue(sv.MaterialButton_android_background)) {
            s();
        } else {
            F();
        }
        ac.E0(this.a, I + this.c, paddingTop + this.e, H + this.d, paddingBottom + this.f);
    }

    public void r(int i) {
        if (f() != null) {
            f().setTint(i);
        }
    }

    public void s() {
        this.o = true;
        this.a.setSupportBackgroundTintList(this.j);
        this.a.setSupportBackgroundTintMode(this.i);
    }

    public void t(boolean z) {
        this.q = z;
    }

    public void u(int i) {
        if (this.p && this.g == i) {
            return;
        }
        this.g = i;
        this.p = true;
        y(this.b.w(i));
    }

    public void v(int i) {
        E(this.e, i);
    }

    public void w(int i) {
        E(i, this.f);
    }

    public void x(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            boolean z = t;
            if (z && (this.a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.a.getBackground()).setColor(yy.d(colorStateList));
            } else if (z || !(this.a.getBackground() instanceof xy)) {
            } else {
                ((xy) this.a.getBackground()).setTintList(yy.d(colorStateList));
            }
        }
    }

    public void y(lz lzVar) {
        this.b = lzVar;
        G(lzVar);
    }

    public void z(boolean z) {
        this.n = z;
        I();
    }
}
