package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import defpackage.lz;
import defpackage.mz;
import defpackage.nz;
import java.util.BitSet;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: hz  reason: default package */
/* loaded from: classes.dex */
public class hz extends Drawable implements p9, oz {
    public static final String x = hz.class.getSimpleName();
    public static final Paint y = new Paint(1);
    public c b;
    public final nz.g[] c;
    public final nz.g[] d;
    public final BitSet e;
    public boolean f;
    public final Matrix g;
    public final Path h;
    public final Path i;
    public final RectF j;
    public final RectF k;
    public final Region l;
    public final Region m;
    public lz n;
    public final Paint o;
    public final Paint p;
    public final zy q;
    public final mz.b r;
    public final mz s;
    public PorterDuffColorFilter t;
    public PorterDuffColorFilter u;
    public final RectF v;
    public boolean w;

    /* compiled from: AxisPay */
    /* renamed from: hz$a */
    /* loaded from: classes.dex */
    public class a implements mz.b {
        public a() {
        }

        @Override // defpackage.mz.b
        public void a(nz nzVar, Matrix matrix, int i) {
            hz.this.e.set(i + 4, nzVar.e());
            hz.this.d[i] = nzVar.f(matrix);
        }

        @Override // defpackage.mz.b
        public void b(nz nzVar, Matrix matrix, int i) {
            hz.this.e.set(i, nzVar.e());
            hz.this.c[i] = nzVar.f(matrix);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: hz$b */
    /* loaded from: classes.dex */
    public class b implements lz.c {
        public final /* synthetic */ float a;

        public b(hz hzVar, float f) {
            this.a = f;
        }

        @Override // defpackage.lz.c
        public dz a(dz dzVar) {
            return dzVar instanceof jz ? dzVar : new cz(this.a, dzVar);
        }
    }

    public /* synthetic */ hz(c cVar, a aVar) {
        this(cVar);
    }

    public static int R(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    public static hz m(Context context, float f) {
        int b2 = ww.b(context, iv.colorSurface, hz.class.getSimpleName());
        hz hzVar = new hz();
        hzVar.M(context);
        hzVar.X(ColorStateList.valueOf(b2));
        hzVar.W(f);
        return hzVar;
    }

    public int A() {
        c cVar = this.b;
        return (int) (cVar.s * Math.cos(Math.toRadians(cVar.t)));
    }

    public int B() {
        return this.b.r;
    }

    public lz C() {
        return this.b.a;
    }

    public final float D() {
        if (L()) {
            return this.p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public ColorStateList E() {
        return this.b.g;
    }

    public float F() {
        return this.b.a.r().a(u());
    }

    public float G() {
        return this.b.a.t().a(u());
    }

    public float H() {
        return this.b.p;
    }

    public float I() {
        return w() + H();
    }

    public final boolean J() {
        c cVar = this.b;
        int i = cVar.q;
        return i != 1 && cVar.r > 0 && (i == 2 || T());
    }

    public final boolean K() {
        Paint.Style style = this.b.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean L() {
        Paint.Style style = this.b.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.p.getStrokeWidth() > 0.0f;
    }

    public void M(Context context) {
        this.b.b = new qx(context);
        j0();
    }

    public final void N() {
        super.invalidateSelf();
    }

    public boolean O() {
        qx qxVar = this.b.b;
        return qxVar != null && qxVar.d();
    }

    public boolean P() {
        return this.b.a.u(u());
    }

    public final void Q(Canvas canvas) {
        if (J()) {
            canvas.save();
            S(canvas);
            if (!this.w) {
                n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.v.width() - getBounds().width());
            int height = (int) (this.v.height() - getBounds().height());
            if (width >= 0 && height >= 0) {
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.v.width()) + (this.b.r * 2) + width, ((int) this.v.height()) + (this.b.r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f = (getBounds().left - this.b.r) - width;
                float f2 = (getBounds().top - this.b.r) - height;
                canvas2.translate(-f, -f2);
                n(canvas2);
                canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                createBitmap.recycle();
                canvas.restore();
                return;
            }
            throw new IllegalStateException(C0059ao.a(8583));
        }
    }

    public final void S(Canvas canvas) {
        int z = z();
        int A = A();
        if (Build.VERSION.SDK_INT < 21 && this.w) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.b.r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(z, A);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(z, A);
    }

    public boolean T() {
        int i = Build.VERSION.SDK_INT;
        return i < 21 || !(P() || this.h.isConvex() || i >= 29);
    }

    public void U(float f) {
        setShapeAppearanceModel(this.b.a.w(f));
    }

    public void V(dz dzVar) {
        setShapeAppearanceModel(this.b.a.x(dzVar));
    }

    public void W(float f) {
        c cVar = this.b;
        if (cVar.o != f) {
            cVar.o = f;
            j0();
        }
    }

    public void X(ColorStateList colorStateList) {
        c cVar = this.b;
        if (cVar.d != colorStateList) {
            cVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void Y(float f) {
        c cVar = this.b;
        if (cVar.k != f) {
            cVar.k = f;
            this.f = true;
            invalidateSelf();
        }
    }

    public void Z(int i, int i2, int i3, int i4) {
        c cVar = this.b;
        if (cVar.i == null) {
            cVar.i = new Rect();
        }
        this.b.i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void a0(float f) {
        c cVar = this.b;
        if (cVar.n != f) {
            cVar.n = f;
            j0();
        }
    }

    public void b0(int i) {
        this.q.d(i);
        this.b.u = false;
        N();
    }

    public void c0(int i) {
        c cVar = this.b;
        if (cVar.t != i) {
            cVar.t = i;
            N();
        }
    }

    public void d0(float f, int i) {
        g0(f);
        f0(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.o.setColorFilter(this.t);
        int alpha = this.o.getAlpha();
        this.o.setAlpha(R(alpha, this.b.m));
        this.p.setColorFilter(this.u);
        this.p.setStrokeWidth(this.b.l);
        int alpha2 = this.p.getAlpha();
        this.p.setAlpha(R(alpha2, this.b.m));
        if (this.f) {
            i();
            g(u(), this.h);
            this.f = false;
        }
        Q(canvas);
        if (K()) {
            o(canvas);
        }
        if (L()) {
            r(canvas);
        }
        this.o.setAlpha(alpha);
        this.p.setAlpha(alpha2);
    }

    public void e0(float f, ColorStateList colorStateList) {
        g0(f);
        f0(colorStateList);
    }

    public final PorterDuffColorFilter f(Paint paint, boolean z) {
        int color;
        int l;
        if (!z || (l = l((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(l, PorterDuff.Mode.SRC_IN);
    }

    public void f0(ColorStateList colorStateList) {
        c cVar = this.b;
        if (cVar.e != colorStateList) {
            cVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.b.j != 1.0f) {
            this.g.reset();
            Matrix matrix = this.g;
            float f = this.b.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.g);
        }
        path.computeBounds(this.v, true);
    }

    public void g0(float f) {
        this.b.l = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.b.q == 2) {
            return;
        }
        if (P()) {
            outline.setRoundRect(getBounds(), F() * this.b.k);
            return;
        }
        g(u(), this.h);
        if (this.h.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.h);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.b.i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.l.set(getBounds());
        g(u(), this.h);
        this.m.setPath(this.h, this.l);
        this.l.op(this.m, Region.Op.DIFFERENCE);
        return this.l;
    }

    public final void h(RectF rectF, Path path) {
        mz mzVar = this.s;
        c cVar = this.b;
        mzVar.e(cVar.a, cVar.k, rectF, this.r, path);
    }

    public final boolean h0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.b.d == null || color2 == (colorForState2 = this.b.d.getColorForState(iArr, (color2 = this.o.getColor())))) {
            z = false;
        } else {
            this.o.setColor(colorForState2);
            z = true;
        }
        if (this.b.e == null || color == (colorForState = this.b.e.getColorForState(iArr, (color = this.p.getColor())))) {
            return z;
        }
        this.p.setColor(colorForState);
        return true;
    }

    public final void i() {
        lz y2 = C().y(new b(this, -D()));
        this.n = y2;
        this.s.d(y2, this.b.k, v(), this.i);
    }

    public final boolean i0() {
        PorterDuffColorFilter porterDuffColorFilter = this.t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        c cVar = this.b;
        this.t = k(cVar.g, cVar.h, this.o, true);
        c cVar2 = this.b;
        this.u = k(cVar2.f, cVar2.h, this.p, false);
        c cVar3 = this.b;
        if (cVar3.u) {
            this.q.d(cVar3.g.getColorForState(getState(), 0));
        }
        return (ya.a(porterDuffColorFilter, this.t) && ya.a(porterDuffColorFilter2, this.u)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.b.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.b.f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.b.e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.b.d) != null && colorStateList4.isStateful())));
    }

    public final PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final void j0() {
        float I = I();
        this.b.r = (int) Math.ceil(0.75f * I);
        this.b.s = (int) Math.ceil(I * 0.25f);
        i0();
        N();
    }

    public final PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            return j(colorStateList, mode, z);
        }
        return f(paint, z);
    }

    public int l(int i) {
        float I = I() + y();
        qx qxVar = this.b.b;
        return qxVar != null ? qxVar.c(i, I) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.b = new c(this.b);
        return this;
    }

    public final void n(Canvas canvas) {
        if (this.e.cardinality() > 0) {
            Log.w(x, C0059ao.a(8584));
        }
        if (this.b.s != 0) {
            canvas.drawPath(this.h, this.q.c());
        }
        for (int i = 0; i < 4; i++) {
            this.c[i].b(this.q, this.b.r, canvas);
            this.d[i].b(this.q, this.b.r, canvas);
        }
        if (this.w) {
            int z = z();
            int A = A();
            canvas.translate(-z, -A);
            canvas.drawPath(this.h, y);
            canvas.translate(z, A);
        }
    }

    public final void o(Canvas canvas) {
        q(canvas, this.o, this.h, this.b.a, u());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = h0(iArr) || i0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.b.a, rectF);
    }

    public final void q(Canvas canvas, Paint paint, Path path, lz lzVar, RectF rectF) {
        if (lzVar.u(rectF)) {
            float a2 = lzVar.t().a(rectF) * this.b.k;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void r(Canvas canvas) {
        q(canvas, this.p, this.i, this.n, v());
    }

    public float s() {
        return this.b.a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        c cVar = this.b;
        if (cVar.m != i) {
            cVar.m = i;
            N();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.c = colorFilter;
        N();
    }

    @Override // defpackage.oz
    public void setShapeAppearanceModel(lz lzVar) {
        this.b.a = lzVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, defpackage.p9
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, defpackage.p9
    public void setTintList(ColorStateList colorStateList) {
        this.b.g = colorStateList;
        i0();
        N();
    }

    @Override // android.graphics.drawable.Drawable, defpackage.p9
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.b;
        if (cVar.h != mode) {
            cVar.h = mode;
            i0();
            N();
        }
    }

    public float t() {
        return this.b.a.l().a(u());
    }

    public RectF u() {
        this.j.set(getBounds());
        return this.j;
    }

    public final RectF v() {
        this.k.set(u());
        float D = D();
        this.k.inset(D, D);
        return this.k;
    }

    public float w() {
        return this.b.o;
    }

    public ColorStateList x() {
        return this.b.d;
    }

    public float y() {
        return this.b.n;
    }

    public int z() {
        c cVar = this.b;
        return (int) (cVar.s * Math.sin(Math.toRadians(cVar.t)));
    }

    public hz() {
        this(new lz());
    }

    public hz(Context context, AttributeSet attributeSet, int i, int i2) {
        this(lz.e(context, attributeSet, i, i2).m());
    }

    public hz(lz lzVar) {
        this(new c(lzVar, null));
    }

    public hz(c cVar) {
        this.c = new nz.g[4];
        this.d = new nz.g[4];
        this.e = new BitSet(8);
        this.g = new Matrix();
        this.h = new Path();
        this.i = new Path();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new Region();
        this.m = new Region();
        Paint paint = new Paint(1);
        this.o = paint;
        Paint paint2 = new Paint(1);
        this.p = paint2;
        this.q = new zy();
        this.s = Looper.getMainLooper().getThread() == Thread.currentThread() ? mz.k() : new mz();
        this.v = new RectF();
        this.w = true;
        this.b = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = y;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        i0();
        h0(getState());
        this.r = new a();
    }

    /* compiled from: AxisPay */
    /* renamed from: hz$c */
    /* loaded from: classes.dex */
    public static final class c extends Drawable.ConstantState {
        public lz a;
        public qx b;
        public ColorFilter c;
        public ColorStateList d;
        public ColorStateList e;
        public ColorStateList f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public Rect i;
        public float j;
        public float k;
        public float l;
        public int m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public c(lz lzVar, qx qxVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = lzVar;
            this.b = qxVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            hz hzVar = new hz(this, null);
            hzVar.f = true;
            return hzVar;
        }

        public c(c cVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = cVar.a;
            this.b = cVar.b;
            this.l = cVar.l;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.h = cVar.h;
            this.g = cVar.g;
            this.m = cVar.m;
            this.j = cVar.j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.k = cVar.k;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.r = cVar.r;
            this.t = cVar.t;
            this.f = cVar.f;
            this.v = cVar.v;
            if (cVar.i != null) {
                this.i = new Rect(cVar.i);
            }
        }
    }
}
