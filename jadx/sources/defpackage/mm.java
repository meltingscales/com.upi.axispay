package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: AxisPay */
/* renamed from: mm  reason: default package */
/* loaded from: classes.dex */
public class mm extends Drawable implements Animatable {
    public static final Interpolator h = new LinearInterpolator();
    public static final Interpolator i = new te();
    public static final int[] j = {-16777216};
    public final c b;
    public float c;
    public Resources d;
    public Animator e;
    public float f;
    public boolean g;

    /* compiled from: AxisPay */
    /* renamed from: mm$a */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            mm.this.n(floatValue, this.a);
            mm.this.b(floatValue, this.a, false);
            mm.this.invalidateSelf();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: mm$b */
    /* loaded from: classes.dex */
    public class b implements Animator.AnimatorListener {
        public final /* synthetic */ c a;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            mm.this.b(1.0f, this.a, true);
            this.a.A();
            this.a.l();
            mm mmVar = mm.this;
            if (mmVar.g) {
                mmVar.g = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.a.x(false);
                return;
            }
            mmVar.f += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            mm.this.f = 0.0f;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: mm$c */
    /* loaded from: classes.dex */
    public static class c {
        public final RectF a = new RectF();
        public final Paint b;
        public final Paint c;
        public final Paint d;
        public float e;
        public float f;
        public float g;
        public float h;
        public int[] i;
        public int j;
        public float k;
        public float l;
        public float m;
        public boolean n;
        public Path o;
        public float p;
        public float q;
        public int r;
        public int s;
        public int t;
        public int u;

        public c() {
            Paint paint = new Paint();
            this.b = paint;
            Paint paint2 = new Paint();
            this.c = paint2;
            Paint paint3 = new Paint();
            this.d = paint3;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 5.0f;
            this.p = 1.0f;
            this.t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void A() {
            this.k = this.e;
            this.l = this.f;
            this.m = this.g;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.a;
            float f = this.q;
            float f2 = (this.h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.r * this.p) / 2.0f, this.h / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.e;
            float f4 = this.g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f + f4) * 360.0f) - f5;
            this.b.setColor(this.u);
            this.b.setAlpha(this.t);
            float f7 = this.h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.b);
            b(canvas, f5, f6, rectF);
        }

        public void b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.n) {
                Path path = this.o;
                if (path == null) {
                    Path path2 = new Path();
                    this.o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.o.moveTo(0.0f, 0.0f);
                this.o.lineTo(this.r * this.p, 0.0f);
                Path path3 = this.o;
                float f3 = this.p;
                path3.lineTo((this.r * f3) / 2.0f, this.s * f3);
                this.o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((this.r * this.p) / 2.0f), rectF.centerY() + (this.h / 2.0f));
                this.o.close();
                this.c.setColor(this.u);
                this.c.setAlpha(this.t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.o, this.c);
                canvas.restore();
            }
        }

        public int c() {
            return this.t;
        }

        public float d() {
            return this.f;
        }

        public int e() {
            return this.i[f()];
        }

        public int f() {
            return (this.j + 1) % this.i.length;
        }

        public float g() {
            return this.e;
        }

        public int h() {
            return this.i[this.j];
        }

        public float i() {
            return this.l;
        }

        public float j() {
            return this.m;
        }

        public float k() {
            return this.k;
        }

        public void l() {
            t(f());
        }

        public void m() {
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        public void n(int i) {
            this.t = i;
        }

        public void o(float f, float f2) {
            this.r = (int) f;
            this.s = (int) f2;
        }

        public void p(float f) {
            if (f != this.p) {
                this.p = f;
            }
        }

        public void q(float f) {
            this.q = f;
        }

        public void r(int i) {
            this.u = i;
        }

        public void s(ColorFilter colorFilter) {
            this.b.setColorFilter(colorFilter);
        }

        public void t(int i) {
            this.j = i;
            this.u = this.i[i];
        }

        public void u(int[] iArr) {
            this.i = iArr;
            t(0);
        }

        public void v(float f) {
            this.f = f;
        }

        public void w(float f) {
            this.g = f;
        }

        public void x(boolean z) {
            if (this.n != z) {
                this.n = z;
            }
        }

        public void y(float f) {
            this.e = f;
        }

        public void z(float f) {
            this.h = f;
            this.b.setStrokeWidth(f);
        }
    }

    public mm(Context context) {
        db.e(context);
        this.d = context.getResources();
        c cVar = new c();
        this.b = cVar;
        cVar.u(j);
        k(2.5f);
        m();
    }

    public final void a(float f, c cVar) {
        n(f, cVar);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((((float) (Math.floor(cVar.j() / 0.8f) + 1.0d)) - cVar.j()) * f));
    }

    public void b(float f, c cVar, boolean z) {
        float interpolation;
        float f2;
        if (this.g) {
            a(f, cVar);
        } else if (f != 1.0f || z) {
            float j2 = cVar.j();
            if (f < 0.5f) {
                interpolation = cVar.k();
                f2 = (i.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float k = cVar.k() + 0.79f;
                interpolation = k - (((1.0f - i.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = k;
            }
            cVar.y(interpolation);
            cVar.v(f2);
            cVar.w(j2 + (0.20999998f * f));
            h((f + this.f) * 216.0f);
        }
    }

    public final int c(float f, int i2, int i3) {
        int i4 = (i2 >> 24) & 255;
        int i5 = (i2 >> 16) & 255;
        int i6 = (i2 >> 8) & 255;
        int i7 = i2 & 255;
        return ((i4 + ((int) ((((i3 >> 24) & 255) - i4) * f))) << 24) | ((i5 + ((int) ((((i3 >> 16) & 255) - i5) * f))) << 16) | ((i6 + ((int) ((((i3 >> 8) & 255) - i6) * f))) << 8) | (i7 + ((int) (f * ((i3 & 255) - i7))));
    }

    public void d(boolean z) {
        this.b.x(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.c, bounds.exactCenterX(), bounds.exactCenterY());
        this.b.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f) {
        this.b.p(f);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.b.u(iArr);
        this.b.t(0);
        invalidateSelf();
    }

    public void g(float f) {
        this.b.w(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.b.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(float f) {
        this.c = f;
    }

    public final void i(float f, float f2, float f3, float f4) {
        c cVar = this.b;
        float f5 = this.d.getDisplayMetrics().density;
        cVar.z(f2 * f5);
        cVar.q(f * f5);
        cVar.t(0);
        cVar.o(f3 * f5, f4 * f5);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.e.isRunning();
    }

    public void j(float f, float f2) {
        this.b.y(f);
        this.b.v(f2);
        invalidateSelf();
    }

    public void k(float f) {
        this.b.z(f);
        invalidateSelf();
    }

    public void l(int i2) {
        if (i2 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void m() {
        c cVar = this.b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(h);
        ofFloat.addListener(new b(cVar));
        this.e = ofFloat;
    }

    public void n(float f, c cVar) {
        if (f > 0.75f) {
            cVar.r(c((f - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.b.n(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.e.cancel();
        this.b.A();
        if (this.b.d() != this.b.g()) {
            this.g = true;
            this.e.setDuration(666L);
            this.e.start();
            return;
        }
        this.b.t(0);
        this.b.m();
        this.e.setDuration(1332L);
        this.e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.e.cancel();
        h(0.0f);
        this.b.x(false);
        this.b.t(0);
        this.b.m();
        invalidateSelf();
    }
}
