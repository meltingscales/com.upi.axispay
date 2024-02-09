package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import defpackage.iy;
import defpackage.ry;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: xx  reason: default package */
/* loaded from: classes.dex */
public final class xx {
    public static final boolean j0;
    public static final Paint k0;
    public ry A;
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public boolean F;
    public Bitmap G;
    public Paint H;
    public float I;
    public float J;
    public int[] K;
    public boolean L;
    public final TextPaint M;
    public final TextPaint N;
    public TimeInterpolator O;
    public TimeInterpolator P;
    public float Q;
    public float R;
    public float S;
    public ColorStateList T;
    public float U;
    public float V;
    public float W;
    public ColorStateList X;
    public float Y;
    public float Z;
    public final View a;
    public StaticLayout a0;
    public boolean b;
    public float b0;
    public float c;
    public float c0;
    public boolean d;
    public float d0;
    public float e;
    public CharSequence e0;
    public float f;
    public int g;
    public final Rect h;
    public final Rect i;
    public final RectF j;
    public ColorStateList o;
    public ColorStateList p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public Typeface w;
    public Typeface x;
    public Typeface y;
    public ry z;
    public int k = 16;
    public int l = 16;
    public float m = 15.0f;
    public float n = 15.0f;
    public boolean E = true;
    public int f0 = 1;
    public float g0 = 0.0f;
    public float h0 = 1.0f;
    public int i0 = iy.n;

    /* compiled from: AxisPay */
    /* renamed from: xx$a */
    /* loaded from: classes.dex */
    public class a implements ry.a {
        public a() {
        }

        @Override // defpackage.ry.a
        public void a(Typeface typeface) {
            xx.this.R(typeface);
        }
    }

    static {
        j0 = Build.VERSION.SDK_INT < 18;
        Paint paint = null;
        k0 = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            paint.setColor(-65281);
        }
    }

    public xx(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.M = textPaint;
        this.N = new TextPaint(textPaint);
        this.i = new Rect();
        this.h = new Rect();
        this.j = new RectF();
        this.f = f();
    }

    public static boolean C(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    public static float G(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return tv.a(f, f2, f3);
    }

    public static boolean K(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    public static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    public final void A(TextPaint textPaint) {
        textPaint.setTextSize(this.m);
        textPaint.setTypeface(this.x);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.Z);
        }
    }

    public final void B(float f) {
        if (this.d) {
            this.j.set(f < this.f ? this.h : this.i);
            return;
        }
        this.j.left = G(this.h.left, this.i.left, f, this.O);
        this.j.top = G(this.q, this.r, f, this.O);
        this.j.right = G(this.h.right, this.i.right, f, this.O);
        this.j.bottom = G(this.h.bottom, this.i.bottom, f, this.O);
    }

    public final boolean D() {
        return ac.C(this.a) == 1;
    }

    public final boolean E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.p;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.o) != null && colorStateList.isStateful());
    }

    public final boolean F(CharSequence charSequence, boolean z) {
        return (z ? ua.d : ua.c).a(charSequence, 0, charSequence.length());
    }

    public void H() {
        this.b = this.i.width() > 0 && this.i.height() > 0 && this.h.width() > 0 && this.h.height() > 0;
    }

    public void I() {
        J(false);
    }

    public void J(boolean z) {
        if ((this.a.getHeight() <= 0 || this.a.getWidth() <= 0) && !z) {
            return;
        }
        b(z);
        d();
    }

    public void L(int i, int i2, int i3, int i4) {
        if (K(this.i, i, i2, i3, i4)) {
            return;
        }
        this.i.set(i, i2, i3, i4);
        this.L = true;
        H();
    }

    public void M(Rect rect) {
        L(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void N(int i) {
        uy uyVar = new uy(this.a.getContext(), i);
        ColorStateList colorStateList = uyVar.a;
        if (colorStateList != null) {
            this.p = colorStateList;
        }
        float f = uyVar.k;
        if (f != 0.0f) {
            this.n = f;
        }
        ColorStateList colorStateList2 = uyVar.b;
        if (colorStateList2 != null) {
            this.T = colorStateList2;
        }
        this.R = uyVar.f;
        this.S = uyVar.g;
        this.Q = uyVar.h;
        this.Y = uyVar.j;
        ry ryVar = this.A;
        if (ryVar != null) {
            ryVar.c();
        }
        this.A = new ry(new a(), uyVar.e());
        uyVar.h(this.a.getContext(), this.A);
        I();
    }

    public final void O(float f) {
        this.b0 = f;
        ac.h0(this.a);
    }

    public void P(ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            I();
        }
    }

    public void Q(int i) {
        if (this.l != i) {
            this.l = i;
            I();
        }
    }

    public void R(Typeface typeface) {
        if (S(typeface)) {
            I();
        }
    }

    public final boolean S(Typeface typeface) {
        ry ryVar = this.A;
        if (ryVar != null) {
            ryVar.c();
        }
        if (this.w != typeface) {
            this.w = typeface;
            return true;
        }
        return false;
    }

    public void T(int i, int i2, int i3, int i4) {
        if (K(this.h, i, i2, i3, i4)) {
            return;
        }
        this.h.set(i, i2, i3, i4);
        this.L = true;
        H();
    }

    public void U(Rect rect) {
        T(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void V(float f) {
        this.c0 = f;
        ac.h0(this.a);
    }

    public void W(ColorStateList colorStateList) {
        if (this.o != colorStateList) {
            this.o = colorStateList;
            I();
        }
    }

    public void X(int i) {
        if (this.k != i) {
            this.k = i;
            I();
        }
    }

    public void Y(float f) {
        if (this.m != f) {
            this.m = f;
            I();
        }
    }

    public final boolean Z(Typeface typeface) {
        ry ryVar = this.z;
        if (ryVar != null) {
            ryVar.c();
        }
        if (this.x != typeface) {
            this.x = typeface;
            return true;
        }
        return false;
    }

    public void a0(float f) {
        float a2 = y9.a(f, 0.0f, 1.0f);
        if (a2 != this.c) {
            this.c = a2;
            d();
        }
    }

    public final void b(boolean z) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        float f = this.J;
        j(this.n, z);
        CharSequence charSequence = this.C;
        if (charSequence != null && (staticLayout2 = this.a0) != null) {
            this.e0 = TextUtils.ellipsize(charSequence, this.M, staticLayout2.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.e0;
        float f2 = 0.0f;
        float measureText = charSequence2 != null ? this.M.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int b = ib.b(this.l, this.D ? 1 : 0);
        int i = b & 112;
        if (i == 48) {
            this.r = this.i.top;
        } else if (i != 80) {
            this.r = this.i.centerY() - ((this.M.descent() - this.M.ascent()) / 2.0f);
        } else {
            this.r = this.i.bottom + this.M.ascent();
        }
        int i2 = b & 8388615;
        if (i2 == 1) {
            this.t = this.i.centerX() - (measureText / 2.0f);
        } else if (i2 != 5) {
            this.t = this.i.left;
        } else {
            this.t = this.i.right - measureText;
        }
        j(this.m, z);
        float height = this.a0 != null ? staticLayout.getHeight() : 0.0f;
        CharSequence charSequence3 = this.C;
        float measureText2 = charSequence3 != null ? this.M.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout3 = this.a0;
        if (staticLayout3 != null && this.f0 > 1) {
            measureText2 = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.a0;
        if (staticLayout4 != null) {
            f2 = this.f0 > 1 ? staticLayout4.getLineStart(0) : staticLayout4.getLineLeft(0);
        }
        this.d0 = f2;
        int b2 = ib.b(this.k, this.D ? 1 : 0);
        int i3 = b2 & 112;
        if (i3 == 48) {
            this.q = this.h.top;
        } else if (i3 != 80) {
            this.q = this.h.centerY() - (height / 2.0f);
        } else {
            this.q = (this.h.bottom - height) + this.M.descent();
        }
        int i4 = b2 & 8388615;
        if (i4 == 1) {
            this.s = this.h.centerX() - (measureText2 / 2.0f);
        } else if (i4 != 5) {
            this.s = this.h.left;
        } else {
            this.s = this.h.right - measureText2;
        }
        k();
        b0(f);
    }

    public final void b0(float f) {
        i(f);
        boolean z = j0 && this.I != 1.0f;
        this.F = z;
        if (z) {
            o();
        }
        ac.h0(this.a);
    }

    public float c() {
        if (this.B == null) {
            return 0.0f;
        }
        z(this.N);
        TextPaint textPaint = this.N;
        CharSequence charSequence = this.B;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void c0(TimeInterpolator timeInterpolator) {
        this.O = timeInterpolator;
        I();
    }

    public final void d() {
        h(this.c);
    }

    public final boolean d0(int[] iArr) {
        this.K = iArr;
        if (E()) {
            I();
            return true;
        }
        return false;
    }

    public final float e(float f) {
        float f2 = this.f;
        if (f <= f2) {
            return tv.b(1.0f, 0.0f, this.e, f2, f);
        }
        return tv.b(0.0f, 1.0f, f2, 1.0f, f);
    }

    public void e0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.B, charSequence)) {
            this.B = charSequence;
            this.C = null;
            k();
            I();
        }
    }

    public final float f() {
        float f = this.e;
        return f + ((1.0f - f) * 0.5f);
    }

    public void f0(TimeInterpolator timeInterpolator) {
        this.P = timeInterpolator;
        I();
    }

    public final boolean g(CharSequence charSequence) {
        boolean D = D();
        return this.E ? F(charSequence, D) : D;
    }

    public void g0(Typeface typeface) {
        boolean S = S(typeface);
        boolean Z = Z(typeface);
        if (S || Z) {
            I();
        }
    }

    public final void h(float f) {
        float f2;
        B(f);
        if (this.d) {
            if (f < this.f) {
                this.u = this.s;
                this.v = this.q;
                b0(this.m);
                f2 = 0.0f;
            } else {
                this.u = this.t;
                this.v = this.r - Math.max(0, this.g);
                b0(this.n);
                f2 = 1.0f;
            }
        } else {
            this.u = G(this.s, this.t, f, this.O);
            this.v = G(this.q, this.r, f, this.O);
            b0(G(this.m, this.n, f, this.P));
            f2 = f;
        }
        TimeInterpolator timeInterpolator = tv.b;
        O(1.0f - G(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        V(G(1.0f, 0.0f, f, timeInterpolator));
        if (this.p != this.o) {
            this.M.setColor(a(w(), u(), f2));
        } else {
            this.M.setColor(u());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            float f3 = this.Y;
            float f4 = this.Z;
            if (f3 != f4) {
                this.M.setLetterSpacing(G(f4, f3, f, timeInterpolator));
            } else {
                this.M.setLetterSpacing(f3);
            }
        }
        this.M.setShadowLayer(G(this.U, this.Q, f, null), G(this.V, this.R, f, null), G(this.W, this.S, f, null), a(v(this.X), v(this.T), f));
        if (this.d) {
            this.M.setAlpha((int) (e(f) * 255.0f));
        }
        ac.h0(this.a);
    }

    public final boolean h0() {
        return this.f0 > 1 && (!this.D || this.d) && !this.F;
    }

    public final void i(float f) {
        j(f, false);
    }

    public final void j(float f, boolean z) {
        boolean z2;
        float f2;
        boolean z3;
        if (this.B == null) {
            return;
        }
        float width = this.i.width();
        float width2 = this.h.width();
        if (C(f, this.n)) {
            f2 = this.n;
            this.I = 1.0f;
            Typeface typeface = this.y;
            Typeface typeface2 = this.w;
            if (typeface != typeface2) {
                this.y = typeface2;
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            float f3 = this.m;
            Typeface typeface3 = this.y;
            Typeface typeface4 = this.x;
            if (typeface3 != typeface4) {
                this.y = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (C(f, f3)) {
                this.I = 1.0f;
            } else {
                this.I = f / this.m;
            }
            float f4 = this.n / this.m;
            width = (!z && width2 * f4 > width) ? Math.min(width / f4, width2) : width2;
            f2 = f3;
            z3 = z2;
        }
        if (width > 0.0f) {
            z3 = this.J != f2 || this.L || z3;
            this.J = f2;
            this.L = false;
        }
        if (this.C == null || z3) {
            this.M.setTextSize(this.J);
            this.M.setTypeface(this.y);
            this.M.setLinearText(this.I != 1.0f);
            this.D = g(this.B);
            StaticLayout l = l(h0() ? this.f0 : 1, width, this.D);
            this.a0 = l;
            this.C = l.getText();
        }
    }

    public final void k() {
        Bitmap bitmap = this.G;
        if (bitmap != null) {
            bitmap.recycle();
            this.G = null;
        }
    }

    public final StaticLayout l(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            iy c = iy.c(this.B, this.M, (int) f);
            c.e(TextUtils.TruncateAt.END);
            c.h(z);
            c.d(Layout.Alignment.ALIGN_NORMAL);
            c.g(false);
            c.j(i);
            c.i(this.g0, this.h0);
            c.f(this.i0);
            staticLayout = c.a();
        } catch (iy.a e) {
            Log.e(C0059ao.a(6893), e.getCause().getMessage(), e);
            staticLayout = null;
        }
        db.e(staticLayout);
        return staticLayout;
    }

    public void m(Canvas canvas) {
        int save = canvas.save();
        if (this.C == null || !this.b) {
            return;
        }
        boolean z = true;
        float lineStart = (this.u + (this.f0 > 1 ? this.a0.getLineStart(0) : this.a0.getLineLeft(0))) - (this.d0 * 2.0f);
        this.M.setTextSize(this.J);
        float f = this.u;
        float f2 = this.v;
        if (!this.F || this.G == null) {
            z = false;
        }
        float f3 = this.I;
        if (f3 != 1.0f && !this.d) {
            canvas.scale(f3, f3, f, f2);
        }
        if (z) {
            canvas.drawBitmap(this.G, f, f2, this.H);
            canvas.restoreToCount(save);
            return;
        }
        if (h0() && (!this.d || this.c > this.f)) {
            n(canvas, lineStart, f2);
        } else {
            canvas.translate(f, f2);
            this.a0.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    public final void n(Canvas canvas, float f, float f2) {
        int alpha = this.M.getAlpha();
        canvas.translate(f, f2);
        float f3 = alpha;
        this.M.setAlpha((int) (this.c0 * f3));
        this.a0.draw(canvas);
        this.M.setAlpha((int) (this.b0 * f3));
        int lineBaseline = this.a0.getLineBaseline(0);
        CharSequence charSequence = this.e0;
        float f4 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.M);
        if (this.d) {
            return;
        }
        String trim = this.e0.toString().trim();
        if (trim.endsWith(C0059ao.a(6894))) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.M.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.a0.getLineEnd(0), str.length()), 0.0f, f4, (Paint) this.M);
    }

    public final void o() {
        if (this.G != null || this.h.isEmpty() || TextUtils.isEmpty(this.C)) {
            return;
        }
        h(0.0f);
        int width = this.a0.getWidth();
        int height = this.a0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.G = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.a0.draw(new Canvas(this.G));
        if (this.H == null) {
            this.H = new Paint(3);
        }
    }

    public void p(RectF rectF, int i, int i2) {
        this.D = g(this.B);
        rectF.left = s(i, i2);
        rectF.top = this.i.top;
        rectF.right = t(rectF, i, i2);
        rectF.bottom = this.i.top + r();
    }

    public ColorStateList q() {
        return this.p;
    }

    public float r() {
        z(this.N);
        return -this.N.ascent();
    }

    public final float s(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) - (c() / 2.0f);
        }
        return ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.D ? this.i.left : this.i.right - c() : this.D ? this.i.right - c() : this.i.left;
    }

    public final float t(RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) + (c() / 2.0f);
        }
        return ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.D ? rectF.left + c() : this.i.right : this.D ? this.i.right : rectF.left + c();
    }

    public int u() {
        return v(this.p);
    }

    public final int v(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.K;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final int w() {
        return v(this.o);
    }

    public float x() {
        A(this.N);
        return -this.N.ascent();
    }

    public float y() {
        return this.c;
    }

    public final void z(TextPaint textPaint) {
        textPaint.setTextSize(this.n);
        textPaint.setTypeface(this.w);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.Y);
        }
    }
}
