package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.crashlytics.FirebaseCrashlytics;

/* compiled from: AxisPay */
/* renamed from: yi  reason: default package */
/* loaded from: classes.dex */
public class yi extends RecyclerView.o implements RecyclerView.t {
    public static final int[] D = {16842919};
    public static final int[] E = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.u C;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    /* compiled from: AxisPay */
    /* renamed from: yi$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            yi.this.k(FirebaseCrashlytics.APP_EXCEPTION_CALLBACK_TIMEOUT_MS);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yi$b */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.u {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i, int i2) {
            yi.this.v(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yi$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public boolean a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
            } else if (((Float) yi.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                yi yiVar = yi.this;
                yiVar.A = 0;
                yiVar.s(0);
            } else {
                yi yiVar2 = yi.this;
                yiVar2.A = 2;
                yiVar2.p();
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yi$d */
    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            yi.this.c.setAlpha(floatValue);
            yi.this.d.setAlpha(floatValue);
            yi.this.p();
        }
    }

    public yi(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        d(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.v;
        if (i == 1) {
            boolean o = o(motionEvent.getX(), motionEvent.getY());
            boolean n = n(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!o && !n) {
                return false;
            }
            if (n) {
                this.w = 1;
                this.p = (int) motionEvent.getX();
            } else if (o) {
                this.w = 2;
                this.m = (int) motionEvent.getY();
            }
            s(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean o = o(motionEvent.getX(), motionEvent.getY());
            boolean n = n(motionEvent.getX(), motionEvent.getY());
            if (o || n) {
                if (n) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (o) {
                    this.w = 2;
                    this.m = (int) motionEvent.getY();
                }
                s(2);
            }
        } else if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = 0.0f;
            this.p = 0.0f;
            s(1);
            this.w = 0;
        } else if (motionEvent.getAction() == 2 && this.v == 2) {
            u();
            if (this.w == 1) {
                l(motionEvent.getX());
            }
            if (this.w == 2) {
                w(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void c(boolean z) {
    }

    public void d(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            f();
        }
        this.s = recyclerView;
        if (recyclerView != null) {
            t();
        }
    }

    public final void e() {
        this.s.removeCallbacks(this.B);
    }

    public final void f() {
        this.s.removeItemDecoration(this);
        this.s.removeOnItemTouchListener(this);
        this.s.removeOnScrollListener(this.C);
        e();
    }

    public final void g(Canvas canvas) {
        int i = this.r;
        int i2 = this.i;
        int i3 = i - i2;
        int i4 = this.o;
        int i5 = this.n;
        int i6 = i4 - (i5 / 2);
        this.g.setBounds(0, 0, i5, i2);
        this.h.setBounds(0, 0, this.q, this.j);
        canvas.translate(0.0f, i3);
        this.h.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.g.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    public final void h(Canvas canvas) {
        int i = this.q;
        int i2 = this.e;
        int i3 = i - i2;
        int i4 = this.l;
        int i5 = this.k;
        int i6 = i4 - (i5 / 2);
        this.c.setBounds(0, 0, i2, i5);
        this.d.setBounds(0, 0, this.f, this.r);
        if (m()) {
            this.d.draw(canvas);
            canvas.translate(this.e, i6);
            canvas.scale(-1.0f, 1.0f);
            this.c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.e, -i6);
            return;
        }
        canvas.translate(i3, 0.0f);
        this.d.draw(canvas);
        canvas.translate(0.0f, i6);
        this.c.draw(canvas);
        canvas.translate(-i3, -i6);
    }

    public final int[] i() {
        int[] iArr = this.y;
        int i = this.b;
        iArr[0] = i;
        iArr[1] = this.q - i;
        return iArr;
    }

    public final int[] j() {
        int[] iArr = this.x;
        int i = this.b;
        iArr[0] = i;
        iArr[1] = this.r - i;
        return iArr;
    }

    public void k(int i) {
        int i2 = this.A;
        if (i2 == 1) {
            this.z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.z.setDuration(i);
        this.z.start();
    }

    public final void l(float f) {
        int[] i = i();
        float max = Math.max(i[0], Math.min(i[1], f));
        if (Math.abs(this.o - max) < 2.0f) {
            return;
        }
        int r = r(this.p, max, i, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
        if (r != 0) {
            this.s.scrollBy(r, 0);
        }
        this.p = max;
    }

    public final boolean m() {
        return ac.C(this.s) == 1;
    }

    public boolean n(float f, float f2) {
        if (f2 >= this.r - this.i) {
            int i = this.o;
            int i2 = this.n;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    public boolean o(float f, float f2) {
        if (!m() ? f >= this.q - this.e : f <= this.e) {
            int i = this.l;
            int i2 = this.k;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.q == this.s.getWidth() && this.r == this.s.getHeight()) {
            if (this.A != 0) {
                if (this.t) {
                    h(canvas);
                }
                if (this.u) {
                    g(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.q = this.s.getWidth();
        this.r = this.s.getHeight();
        s(0);
    }

    public void p() {
        this.s.invalidate();
    }

    public final void q(int i) {
        e();
        this.s.postDelayed(this.B, i);
    }

    public final int r(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    public void s(int i) {
        if (i == 2 && this.v != 2) {
            this.c.setState(D);
            e();
        }
        if (i == 0) {
            p();
        } else {
            u();
        }
        if (this.v == 2 && i != 2) {
            this.c.setState(E);
            q(1200);
        } else if (i == 1) {
            q(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.v = i;
    }

    public final void t() {
        this.s.addItemDecoration(this);
        this.s.addOnItemTouchListener(this);
        this.s.addOnScrollListener(this.C);
    }

    public void u() {
        int i = this.A;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            this.z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0L);
        this.z.start();
    }

    public void v(int i, int i2) {
        int computeVerticalScrollRange = this.s.computeVerticalScrollRange();
        int i3 = this.r;
        this.t = computeVerticalScrollRange - i3 > 0 && i3 >= this.a;
        int computeHorizontalScrollRange = this.s.computeHorizontalScrollRange();
        int i4 = this.q;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.a;
        this.u = z;
        boolean z2 = this.t;
        if (!z2 && !z) {
            if (this.v != 0) {
                s(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            this.l = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
            this.k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.u) {
            float f2 = i4;
            this.o = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
            this.n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = this.v;
        if (i5 == 0 || i5 == 1) {
            s(1);
        }
    }

    public final void w(float f) {
        int[] j = j();
        float max = Math.max(j[0], Math.min(j[1], f));
        if (Math.abs(this.l - max) < 2.0f) {
            return;
        }
        int r = r(this.m, max, j, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
        if (r != 0) {
            this.s.scrollBy(0, r);
        }
        this.m = max;
    }
}
