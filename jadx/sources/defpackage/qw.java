package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.common.api.Api;
import defpackage.jy;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: qw  reason: default package */
/* loaded from: classes.dex */
public class qw extends hz implements p9, Drawable.Callback, jy.b {
    public static final int[] J0 = {16842910};
    public static final ShapeDrawable K0 = new ShapeDrawable(new OvalShape());
    public ColorStateList A;
    public PorterDuff.Mode A0;
    public float B;
    public int[] B0;
    public float C;
    public boolean C0;
    public ColorStateList D;
    public ColorStateList D0;
    public float E;
    public WeakReference<a> E0;
    public ColorStateList F;
    public TextUtils.TruncateAt F0;
    public CharSequence G;
    public boolean G0;
    public boolean H;
    public int H0;
    public Drawable I;
    public boolean I0;
    public ColorStateList J;
    public float K;
    public boolean L;
    public boolean M;
    public Drawable N;
    public Drawable O;
    public ColorStateList P;
    public float Q;
    public CharSequence R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public ColorStateList V;
    public aw W;
    public aw X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public float f0;
    public final Context g0;
    public final Paint h0;
    public final Paint i0;
    public final Paint.FontMetrics j0;
    public final RectF k0;
    public final PointF l0;
    public final Path m0;
    public final jy n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public boolean u0;
    public int v0;
    public int w0;
    public ColorFilter x0;
    public PorterDuffColorFilter y0;
    public ColorStateList z;
    public ColorStateList z0;

    /* compiled from: AxisPay */
    /* renamed from: qw$a */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public qw(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.C = -1.0f;
        this.h0 = new Paint(1);
        this.j0 = new Paint.FontMetrics();
        this.k0 = new RectF();
        this.l0 = new PointF();
        this.m0 = new Path();
        this.w0 = 255;
        this.A0 = PorterDuff.Mode.SRC_IN;
        this.E0 = new WeakReference<>(null);
        M(context);
        this.g0 = context;
        jy jyVar = new jy(this);
        this.n0 = jyVar;
        this.G = C0059ao.a(681);
        jyVar.e().density = context.getResources().getDisplayMetrics().density;
        this.i0 = null;
        int[] iArr = J0;
        setState(iArr);
        l2(iArr);
        this.G0 = true;
        if (yy.a) {
            K0.setTint(-1);
        }
    }

    public static boolean n1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean r1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean s1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean t1(uy uyVar) {
        ColorStateList colorStateList;
        return (uyVar == null || (colorStateList = uyVar.a) == null || !colorStateList.isStateful()) ? false : true;
    }

    public static qw v0(Context context, AttributeSet attributeSet, int i, int i2) {
        qw qwVar = new qw(context, attributeSet, i, i2);
        qwVar.u1(attributeSet, i, i2);
        return qwVar;
    }

    public final void A0(Canvas canvas, Rect rect) {
        if (this.I0) {
            return;
        }
        this.h0.setColor(this.o0);
        this.h0.setStyle(Paint.Style.FILL);
        this.k0.set(rect);
        canvas.drawRoundRect(this.k0, I0(), I0(), this.h0);
    }

    public void A1(int i) {
        z1(k0.d(this.g0, i));
    }

    public void A2(boolean z) {
        this.G0 = z;
    }

    public final void B0(Canvas canvas, Rect rect) {
        if (O2()) {
            o0(rect, this.k0);
            RectF rectF = this.k0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.N.setBounds(0, 0, (int) this.k0.width(), (int) this.k0.height());
            if (yy.a) {
                this.O.setBounds(this.N.getBounds());
                this.O.jumpToCurrentState();
                this.O.draw(canvas);
            } else {
                this.N.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    public void B1(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (u0()) {
                o9.o(this.U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void B2(aw awVar) {
        this.W = awVar;
    }

    public final void C0(Canvas canvas, Rect rect) {
        this.h0.setColor(this.s0);
        this.h0.setStyle(Paint.Style.FILL);
        this.k0.set(rect);
        if (!this.I0) {
            canvas.drawRoundRect(this.k0, I0(), I0(), this.h0);
            return;
        }
        h(new RectF(rect), this.m0);
        super.p(canvas, this.h0, this.m0, u());
    }

    public void C1(int i) {
        B1(k0.c(this.g0, i));
    }

    public void C2(int i) {
        B2(aw.c(this.g0, i));
    }

    public final void D0(Canvas canvas, Rect rect) {
        Paint paint = this.i0;
        if (paint != null) {
            paint.setColor(d9.m(-16777216, 127));
            canvas.drawRect(rect, this.i0);
            if (N2() || M2()) {
                l0(rect, this.k0);
                canvas.drawRect(this.k0, this.i0);
            }
            if (this.G != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.i0);
            }
            if (O2()) {
                o0(rect, this.k0);
                canvas.drawRect(this.k0, this.i0);
            }
            this.i0.setColor(d9.m(-65536, 127));
            n0(rect, this.k0);
            canvas.drawRect(this.k0, this.i0);
            this.i0.setColor(d9.m(-16711936, 127));
            p0(rect, this.k0);
            canvas.drawRect(this.k0, this.i0);
        }
    }

    public void D1(int i) {
        E1(this.g0.getResources().getBoolean(i));
    }

    public void D2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = C0059ao.a(682);
        }
        if (TextUtils.equals(this.G, charSequence)) {
            return;
        }
        this.G = charSequence;
        this.n0.i(true);
        invalidateSelf();
        v1();
    }

    public final void E0(Canvas canvas, Rect rect) {
        if (this.G != null) {
            Paint.Align t0 = t0(rect, this.l0);
            r0(rect, this.k0);
            if (this.n0.d() != null) {
                this.n0.e().drawableState = getState();
                this.n0.j(this.g0);
            }
            this.n0.e().setTextAlign(t0);
            int i = 0;
            boolean z = Math.round(this.n0.f(h1().toString())) > Math.round(this.k0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.k0);
            }
            CharSequence charSequence = this.G;
            if (z && this.F0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.n0.e(), this.k0.width(), this.F0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.l0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.n0.e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    public void E1(boolean z) {
        if (this.T != z) {
            boolean M2 = M2();
            this.T = z;
            boolean M22 = M2();
            if (M2 != M22) {
                if (M22) {
                    k0(this.U);
                } else {
                    P2(this.U);
                }
                invalidateSelf();
                v1();
            }
        }
    }

    public void E2(uy uyVar) {
        this.n0.h(uyVar, this.g0);
    }

    public Drawable F0() {
        return this.U;
    }

    public void F1(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            onStateChange(getState());
        }
    }

    public void F2(int i) {
        E2(new uy(this.g0, i));
    }

    public ColorStateList G0() {
        return this.V;
    }

    public void G1(int i) {
        F1(k0.c(this.g0, i));
    }

    public void G2(float f) {
        if (this.c0 != f) {
            this.c0 = f;
            invalidateSelf();
            v1();
        }
    }

    public ColorStateList H0() {
        return this.A;
    }

    @Deprecated
    public void H1(float f) {
        if (this.C != f) {
            this.C = f;
            setShapeAppearanceModel(C().w(f));
        }
    }

    public void H2(int i) {
        G2(this.g0.getResources().getDimension(i));
    }

    public float I0() {
        return this.I0 ? F() : this.C;
    }

    @Deprecated
    public void I1(int i) {
        H1(this.g0.getResources().getDimension(i));
    }

    public void I2(float f) {
        if (this.b0 != f) {
            this.b0 = f;
            invalidateSelf();
            v1();
        }
    }

    public float J0() {
        return this.f0;
    }

    public void J1(float f) {
        if (this.f0 != f) {
            this.f0 = f;
            invalidateSelf();
            v1();
        }
    }

    public void J2(int i) {
        I2(this.g0.getResources().getDimension(i));
    }

    public Drawable K0() {
        Drawable drawable = this.I;
        if (drawable != null) {
            return o9.q(drawable);
        }
        return null;
    }

    public void K1(int i) {
        J1(this.g0.getResources().getDimension(i));
    }

    public void K2(boolean z) {
        if (this.C0 != z) {
            this.C0 = z;
            Q2();
            onStateChange(getState());
        }
    }

    public float L0() {
        return this.K;
    }

    public void L1(Drawable drawable) {
        Drawable K02 = K0();
        if (K02 != drawable) {
            float m0 = m0();
            this.I = drawable != null ? o9.r(drawable).mutate() : null;
            float m02 = m0();
            P2(K02);
            if (N2()) {
                k0(this.I);
            }
            invalidateSelf();
            if (m0 != m02) {
                v1();
            }
        }
    }

    public boolean L2() {
        return this.G0;
    }

    public ColorStateList M0() {
        return this.J;
    }

    public void M1(int i) {
        L1(k0.d(this.g0, i));
    }

    public final boolean M2() {
        return this.T && this.U != null && this.u0;
    }

    public float N0() {
        return this.B;
    }

    public void N1(float f) {
        if (this.K != f) {
            float m0 = m0();
            this.K = f;
            float m02 = m0();
            invalidateSelf();
            if (m0 != m02) {
                v1();
            }
        }
    }

    public final boolean N2() {
        return this.H && this.I != null;
    }

    public float O0() {
        return this.Y;
    }

    public void O1(int i) {
        N1(this.g0.getResources().getDimension(i));
    }

    public final boolean O2() {
        return this.M && this.N != null;
    }

    public ColorStateList P0() {
        return this.D;
    }

    public void P1(ColorStateList colorStateList) {
        this.L = true;
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (N2()) {
                o9.o(this.I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void P2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public float Q0() {
        return this.E;
    }

    public void Q1(int i) {
        P1(k0.c(this.g0, i));
    }

    public final void Q2() {
        this.D0 = this.C0 ? yy.d(this.F) : null;
    }

    public Drawable R0() {
        Drawable drawable = this.N;
        if (drawable != null) {
            return o9.q(drawable);
        }
        return null;
    }

    public void R1(int i) {
        S1(this.g0.getResources().getBoolean(i));
    }

    @TargetApi(21)
    public final void R2() {
        this.O = new RippleDrawable(yy.d(f1()), this.N, K0);
    }

    public CharSequence S0() {
        return this.R;
    }

    public void S1(boolean z) {
        if (this.H != z) {
            boolean N2 = N2();
            this.H = z;
            boolean N22 = N2();
            if (N2 != N22) {
                if (N22) {
                    k0(this.I);
                } else {
                    P2(this.I);
                }
                invalidateSelf();
                v1();
            }
        }
    }

    public float T0() {
        return this.e0;
    }

    public void T1(float f) {
        if (this.B != f) {
            this.B = f;
            invalidateSelf();
            v1();
        }
    }

    public float U0() {
        return this.Q;
    }

    public void U1(int i) {
        T1(this.g0.getResources().getDimension(i));
    }

    public float V0() {
        return this.d0;
    }

    public void V1(float f) {
        if (this.Y != f) {
            this.Y = f;
            invalidateSelf();
            v1();
        }
    }

    public int[] W0() {
        return this.B0;
    }

    public void W1(int i) {
        V1(this.g0.getResources().getDimension(i));
    }

    public ColorStateList X0() {
        return this.P;
    }

    public void X1(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.I0) {
                f0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void Y0(RectF rectF) {
        p0(getBounds(), rectF);
    }

    public void Y1(int i) {
        X1(k0.c(this.g0, i));
    }

    public final float Z0() {
        Drawable drawable = this.u0 ? this.U : this.I;
        float f = this.K;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil(ny.b(this.g0, 24));
            if (drawable.getIntrinsicHeight() <= f) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    public void Z1(float f) {
        if (this.E != f) {
            this.E = f;
            this.h0.setStrokeWidth(f);
            if (this.I0) {
                super.g0(f);
            }
            invalidateSelf();
        }
    }

    @Override // defpackage.jy.b
    public void a() {
        v1();
        invalidateSelf();
    }

    public final float a1() {
        Drawable drawable = this.u0 ? this.U : this.I;
        float f = this.K;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    public void a2(int i) {
        Z1(this.g0.getResources().getDimension(i));
    }

    public TextUtils.TruncateAt b1() {
        return this.F0;
    }

    public final void b2(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            onStateChange(getState());
        }
    }

    public aw c1() {
        return this.X;
    }

    public void c2(Drawable drawable) {
        Drawable R0 = R0();
        if (R0 != drawable) {
            float q0 = q0();
            this.N = drawable != null ? o9.r(drawable).mutate() : null;
            if (yy.a) {
                R2();
            }
            float q02 = q0();
            P2(R0);
            if (O2()) {
                k0(this.N);
            }
            invalidateSelf();
            if (q0 != q02) {
                v1();
            }
        }
    }

    public float d1() {
        return this.a0;
    }

    public void d2(CharSequence charSequence) {
        if (this.R != charSequence) {
            this.R = qa.c().h(charSequence);
            invalidateSelf();
        }
    }

    @Override // defpackage.hz, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.w0;
        int a2 = i < 255 ? mw.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        A0(canvas, bounds);
        x0(canvas, bounds);
        if (this.I0) {
            super.draw(canvas);
        }
        z0(canvas, bounds);
        C0(canvas, bounds);
        y0(canvas, bounds);
        w0(canvas, bounds);
        if (this.G0) {
            E0(canvas, bounds);
        }
        B0(canvas, bounds);
        D0(canvas, bounds);
        if (this.w0 < 255) {
            canvas.restoreToCount(a2);
        }
    }

    public float e1() {
        return this.Z;
    }

    public void e2(float f) {
        if (this.e0 != f) {
            this.e0 = f;
            invalidateSelf();
            if (O2()) {
                v1();
            }
        }
    }

    public ColorStateList f1() {
        return this.F;
    }

    public void f2(int i) {
        e2(this.g0.getResources().getDimension(i));
    }

    public aw g1() {
        return this.W;
    }

    public void g2(int i) {
        c2(k0.d(this.g0, i));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.w0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.x0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.Y + m0() + this.b0 + this.n0.f(h1().toString()) + this.c0 + q0() + this.f0), this.H0);
    }

    @Override // defpackage.hz, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // defpackage.hz, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.C);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.C);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public CharSequence h1() {
        return this.G;
    }

    public void h2(float f) {
        if (this.Q != f) {
            this.Q = f;
            invalidateSelf();
            if (O2()) {
                v1();
            }
        }
    }

    public uy i1() {
        return this.n0.d();
    }

    public void i2(int i) {
        h2(this.g0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.hz, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return r1(this.z) || r1(this.A) || r1(this.D) || (this.C0 && r1(this.D0)) || t1(this.n0.d()) || u0() || s1(this.I) || s1(this.U) || r1(this.z0);
    }

    public float j1() {
        return this.c0;
    }

    public void j2(float f) {
        if (this.d0 != f) {
            this.d0 = f;
            invalidateSelf();
            if (O2()) {
                v1();
            }
        }
    }

    public final void k0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        o9.m(drawable, o9.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.N) {
            if (drawable.isStateful()) {
                drawable.setState(W0());
            }
            o9.o(drawable, this.P);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.I;
        if (drawable == drawable2 && this.L) {
            o9.o(drawable2, this.J);
        }
    }

    public float k1() {
        return this.b0;
    }

    public void k2(int i) {
        j2(this.g0.getResources().getDimension(i));
    }

    public final void l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (N2() || M2()) {
            float f = this.Y + this.Z;
            float a1 = a1();
            if (o9.f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + a1;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - a1;
            }
            float Z0 = Z0();
            float exactCenterY = rect.exactCenterY() - (Z0 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + Z0;
        }
    }

    public final ColorFilter l1() {
        ColorFilter colorFilter = this.x0;
        return colorFilter != null ? colorFilter : this.y0;
    }

    public boolean l2(int[] iArr) {
        if (Arrays.equals(this.B0, iArr)) {
            return false;
        }
        this.B0 = iArr;
        if (O2()) {
            return w1(getState(), iArr);
        }
        return false;
    }

    public float m0() {
        if (N2() || M2()) {
            return this.Z + a1() + this.a0;
        }
        return 0.0f;
    }

    public boolean m1() {
        return this.C0;
    }

    public void m2(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (O2()) {
                o9.o(this.N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void n0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (O2()) {
            float f = this.f0 + this.e0 + this.Q + this.d0 + this.c0;
            if (o9.f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    public void n2(int i) {
        m2(k0.c(this.g0, i));
    }

    public final void o0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (O2()) {
            float f = this.f0 + this.e0;
            if (o9.f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.Q;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.Q;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.Q;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    public boolean o1() {
        return this.S;
    }

    public void o2(boolean z) {
        if (this.M != z) {
            boolean O2 = O2();
            this.M = z;
            boolean O22 = O2();
            if (O2 != O22) {
                if (O22) {
                    k0(this.N);
                } else {
                    P2(this.N);
                }
                invalidateSelf();
                v1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (N2()) {
            onLayoutDirectionChanged |= o9.m(this.I, i);
        }
        if (M2()) {
            onLayoutDirectionChanged |= o9.m(this.U, i);
        }
        if (O2()) {
            onLayoutDirectionChanged |= o9.m(this.N, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (N2()) {
            onLevelChange |= this.I.setLevel(i);
        }
        if (M2()) {
            onLevelChange |= this.U.setLevel(i);
        }
        if (O2()) {
            onLevelChange |= this.N.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.hz, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.I0) {
            super.onStateChange(iArr);
        }
        return w1(iArr, W0());
    }

    public final void p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (O2()) {
            float f = this.f0 + this.e0 + this.Q + this.d0 + this.c0;
            if (o9.f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean p1() {
        return s1(this.N);
    }

    public void p2(a aVar) {
        this.E0 = new WeakReference<>(aVar);
    }

    public float q0() {
        if (O2()) {
            return this.d0 + this.Q + this.e0;
        }
        return 0.0f;
    }

    public boolean q1() {
        return this.M;
    }

    public void q2(TextUtils.TruncateAt truncateAt) {
        this.F0 = truncateAt;
    }

    public final void r0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.G != null) {
            float m0 = this.Y + m0() + this.b0;
            float q0 = this.f0 + q0() + this.c0;
            if (o9.f(this) == 0) {
                rectF.left = rect.left + m0;
                rectF.right = rect.right - q0;
            } else {
                rectF.left = rect.left + q0;
                rectF.right = rect.right - m0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void r2(aw awVar) {
        this.X = awVar;
    }

    public final float s0() {
        this.n0.e().getFontMetrics(this.j0);
        Paint.FontMetrics fontMetrics = this.j0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void s2(int i) {
        r2(aw.c(this.g0, i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.hz, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.w0 != i) {
            this.w0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.hz, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.x0 != colorFilter) {
            this.x0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.hz, android.graphics.drawable.Drawable, defpackage.p9
    public void setTintList(ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            this.z0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.hz, android.graphics.drawable.Drawable, defpackage.p9
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.A0 != mode) {
            this.A0 = mode;
            this.y0 = px.a(this, this.z0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (N2()) {
            visible |= this.I.setVisible(z, z2);
        }
        if (M2()) {
            visible |= this.U.setVisible(z, z2);
        }
        if (O2()) {
            visible |= this.N.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public Paint.Align t0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.G != null) {
            float m0 = this.Y + m0() + this.b0;
            if (o9.f(this) == 0) {
                pointF.x = rect.left + m0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - m0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - s0();
        }
        return align;
    }

    public void t2(float f) {
        if (this.a0 != f) {
            float m0 = m0();
            this.a0 = f;
            float m02 = m0();
            invalidateSelf();
            if (m0 != m02) {
                v1();
            }
        }
    }

    public final boolean u0() {
        return this.T && this.U != null && this.S;
    }

    public final void u1(AttributeSet attributeSet, int i, int i2) {
        TypedArray h = ly.h(this.g0, attributeSet, sv.Chip, i, i2, new int[0]);
        this.I0 = h.hasValue(sv.Chip_shapeAppearance);
        b2(ty.a(this.g0, h, sv.Chip_chipSurfaceColor));
        F1(ty.a(this.g0, h, sv.Chip_chipBackgroundColor));
        T1(h.getDimension(sv.Chip_chipMinHeight, 0.0f));
        int i3 = sv.Chip_chipCornerRadius;
        if (h.hasValue(i3)) {
            H1(h.getDimension(i3, 0.0f));
        }
        X1(ty.a(this.g0, h, sv.Chip_chipStrokeColor));
        Z1(h.getDimension(sv.Chip_chipStrokeWidth, 0.0f));
        y2(ty.a(this.g0, h, sv.Chip_rippleColor));
        D2(h.getText(sv.Chip_android_text));
        uy f = ty.f(this.g0, h, sv.Chip_android_textAppearance);
        f.k = h.getDimension(sv.Chip_android_textSize, f.k);
        E2(f);
        int i4 = h.getInt(sv.Chip_android_ellipsize, 0);
        if (i4 == 1) {
            q2(TextUtils.TruncateAt.START);
        } else if (i4 == 2) {
            q2(TextUtils.TruncateAt.MIDDLE);
        } else if (i4 == 3) {
            q2(TextUtils.TruncateAt.END);
        }
        S1(h.getBoolean(sv.Chip_chipIconVisible, false));
        String a2 = C0059ao.a(683);
        if (attributeSet != null && attributeSet.getAttributeValue(a2, C0059ao.a(684)) != null && attributeSet.getAttributeValue(a2, C0059ao.a(685)) == null) {
            S1(h.getBoolean(sv.Chip_chipIconEnabled, false));
        }
        L1(ty.d(this.g0, h, sv.Chip_chipIcon));
        int i5 = sv.Chip_chipIconTint;
        if (h.hasValue(i5)) {
            P1(ty.a(this.g0, h, i5));
        }
        N1(h.getDimension(sv.Chip_chipIconSize, -1.0f));
        o2(h.getBoolean(sv.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(a2, C0059ao.a(686)) != null && attributeSet.getAttributeValue(a2, C0059ao.a(687)) == null) {
            o2(h.getBoolean(sv.Chip_closeIconEnabled, false));
        }
        c2(ty.d(this.g0, h, sv.Chip_closeIcon));
        m2(ty.a(this.g0, h, sv.Chip_closeIconTint));
        h2(h.getDimension(sv.Chip_closeIconSize, 0.0f));
        x1(h.getBoolean(sv.Chip_android_checkable, false));
        E1(h.getBoolean(sv.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(a2, C0059ao.a(688)) != null && attributeSet.getAttributeValue(a2, C0059ao.a(689)) == null) {
            E1(h.getBoolean(sv.Chip_checkedIconEnabled, false));
        }
        z1(ty.d(this.g0, h, sv.Chip_checkedIcon));
        int i6 = sv.Chip_checkedIconTint;
        if (h.hasValue(i6)) {
            B1(ty.a(this.g0, h, i6));
        }
        B2(aw.b(this.g0, h, sv.Chip_showMotionSpec));
        r2(aw.b(this.g0, h, sv.Chip_hideMotionSpec));
        V1(h.getDimension(sv.Chip_chipStartPadding, 0.0f));
        v2(h.getDimension(sv.Chip_iconStartPadding, 0.0f));
        t2(h.getDimension(sv.Chip_iconEndPadding, 0.0f));
        I2(h.getDimension(sv.Chip_textStartPadding, 0.0f));
        G2(h.getDimension(sv.Chip_textEndPadding, 0.0f));
        j2(h.getDimension(sv.Chip_closeIconStartPadding, 0.0f));
        e2(h.getDimension(sv.Chip_closeIconEndPadding, 0.0f));
        J1(h.getDimension(sv.Chip_chipEndPadding, 0.0f));
        x2(h.getDimensionPixelSize(sv.Chip_android_maxWidth, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        h.recycle();
    }

    public void u2(int i) {
        t2(this.g0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1() {
        a aVar = this.E0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void v2(float f) {
        if (this.Z != f) {
            float m0 = m0();
            this.Z = f;
            float m02 = m0();
            invalidateSelf();
            if (m0 != m02) {
                v1();
            }
        }
    }

    public final void w0(Canvas canvas, Rect rect) {
        if (M2()) {
            l0(rect, this.k0);
            RectF rectF = this.k0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.U.setBounds(0, 0, (int) this.k0.width(), (int) this.k0.height());
            this.U.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public final boolean w1(int[] iArr, int[] iArr2) {
        boolean z;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.z;
        int l = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.o0) : 0);
        boolean z2 = true;
        if (this.o0 != l) {
            this.o0 = l;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.A;
        int l2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.p0) : 0);
        if (this.p0 != l2) {
            this.p0 = l2;
            onStateChange = true;
        }
        int e = ww.e(l, l2);
        if ((this.q0 != e) | (x() == null)) {
            this.q0 = e;
            X(ColorStateList.valueOf(e));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.D;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.r0) : 0;
        if (this.r0 != colorForState) {
            this.r0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.D0 == null || !yy.e(iArr)) ? 0 : this.D0.getColorForState(iArr, this.s0);
        if (this.s0 != colorForState2) {
            this.s0 = colorForState2;
            if (this.C0) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.n0.d() == null || this.n0.d().a == null) ? 0 : this.n0.d().a.getColorForState(iArr, this.t0);
        if (this.t0 != colorForState3) {
            this.t0 = colorForState3;
            onStateChange = true;
        }
        boolean z3 = n1(getState(), 16842912) && this.S;
        if (this.u0 == z3 || this.U == null) {
            z = false;
        } else {
            float m0 = m0();
            this.u0 = z3;
            if (m0 != m0()) {
                onStateChange = true;
                z = true;
            } else {
                z = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.z0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.v0) : 0;
        if (this.v0 != colorForState4) {
            this.v0 = colorForState4;
            this.y0 = px.a(this, this.z0, this.A0);
        } else {
            z2 = onStateChange;
        }
        if (s1(this.I)) {
            z2 |= this.I.setState(iArr);
        }
        if (s1(this.U)) {
            z2 |= this.U.setState(iArr);
        }
        if (s1(this.N)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z2 |= this.N.setState(iArr3);
        }
        if (yy.a && s1(this.O)) {
            z2 |= this.O.setState(iArr2);
        }
        if (z2) {
            invalidateSelf();
        }
        if (z) {
            v1();
        }
        return z2;
    }

    public void w2(int i) {
        v2(this.g0.getResources().getDimension(i));
    }

    public final void x0(Canvas canvas, Rect rect) {
        if (this.I0) {
            return;
        }
        this.h0.setColor(this.p0);
        this.h0.setStyle(Paint.Style.FILL);
        this.h0.setColorFilter(l1());
        this.k0.set(rect);
        canvas.drawRoundRect(this.k0, I0(), I0(), this.h0);
    }

    public void x1(boolean z) {
        if (this.S != z) {
            this.S = z;
            float m0 = m0();
            if (!z && this.u0) {
                this.u0 = false;
            }
            float m02 = m0();
            invalidateSelf();
            if (m0 != m02) {
                v1();
            }
        }
    }

    public void x2(int i) {
        this.H0 = i;
    }

    public final void y0(Canvas canvas, Rect rect) {
        if (N2()) {
            l0(rect, this.k0);
            RectF rectF = this.k0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.I.setBounds(0, 0, (int) this.k0.width(), (int) this.k0.height());
            this.I.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public void y1(int i) {
        x1(this.g0.getResources().getBoolean(i));
    }

    public void y2(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            Q2();
            onStateChange(getState());
        }
    }

    public final void z0(Canvas canvas, Rect rect) {
        if (this.E <= 0.0f || this.I0) {
            return;
        }
        this.h0.setColor(this.r0);
        this.h0.setStyle(Paint.Style.STROKE);
        if (!this.I0) {
            this.h0.setColorFilter(l1());
        }
        RectF rectF = this.k0;
        float f = this.E;
        rectF.set(rect.left + (f / 2.0f), rect.top + (f / 2.0f), rect.right - (f / 2.0f), rect.bottom - (f / 2.0f));
        float f2 = this.C - (this.E / 2.0f);
        canvas.drawRoundRect(this.k0, f2, f2, this.h0);
    }

    public void z1(Drawable drawable) {
        if (this.U != drawable) {
            float m0 = m0();
            this.U = drawable;
            float m02 = m0();
            P2(this.U);
            k0(this.U);
            invalidateSelf();
            if (m0 != m02) {
                v1();
            }
        }
    }

    public void z2(int i) {
        y2(k0.c(this.g0, i));
    }
}
