package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.f7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: d7  reason: default package */
/* loaded from: classes.dex */
public class d7 extends ConstraintLayout implements rb {
    public static boolean B0;
    public int A;
    public ArrayList<Integer> A0;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public HashMap<View, a7> F;
    public long G;
    public float H;
    public float I;
    public float J;
    public long K;
    public float L;
    public boolean M;
    public boolean N;
    public f O;
    public int P;
    public c Q;
    public boolean R;
    public q6 S;
    public v6 T;
    public int U;
    public int V;
    public boolean W;
    public float a0;
    public float b0;
    public long c0;
    public float d0;
    public boolean e0;
    public ArrayList<b7> f0;
    public ArrayList<b7> g0;
    public ArrayList<b7> h0;
    public CopyOnWriteArrayList<f> i0;
    public int j0;
    public long k0;
    public float l0;
    public int m0;
    public float n0;
    public boolean o0;
    public float p0;
    public i5 q0;
    public boolean r0;
    public e s0;
    public Runnable t0;
    public int[] u0;
    public f7 v;
    public int v0;
    public Interpolator w;
    public boolean w0;
    public Interpolator x;
    public g x0;
    public float y;
    public d y0;
    public int z;
    public boolean z0;

    /* compiled from: AxisPay */
    /* renamed from: d7$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d7.this.s0.a();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: d7$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.values().length];
            a = iArr;
            try {
                iArr[g.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[g.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[g.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: d7$c */
    /* loaded from: classes.dex */
    public class c {
        public int[] a;
        public float[] b;
        public Paint c;
        public Paint d;
        public Paint e;
        public Paint f;
        public Paint g;
        public float[] h;
        public DashPathEffect i;
        public Rect j = new Rect();
        public boolean k = false;
        public int l;

        public c() {
            this.l = 1;
            Paint paint = new Paint();
            this.c = paint;
            paint.setAntiAlias(true);
            this.c.setColor(-21965);
            this.c.setStrokeWidth(2.0f);
            this.c.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.d = paint2;
            paint2.setAntiAlias(true);
            this.d.setColor(-2067046);
            this.d.setStrokeWidth(2.0f);
            this.d.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.e = paint3;
            paint3.setAntiAlias(true);
            this.e.setColor(-13391360);
            this.e.setStrokeWidth(2.0f);
            this.e.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f = paint4;
            paint4.setAntiAlias(true);
            this.f.setColor(-13391360);
            this.f.setTextSize(d7.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.h = new float[8];
            Paint paint5 = new Paint();
            this.g = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.i = dashPathEffect;
            this.e.setPathEffect(dashPathEffect);
            this.b = new float[100];
            this.a = new int[50];
            if (this.k) {
                this.c.setStrokeWidth(8.0f);
                this.g.setStrokeWidth(8.0f);
                this.d.setStrokeWidth(8.0f);
                this.l = 4;
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: d7$d */
    /* loaded from: classes.dex */
    public class d {
        public void a() {
            throw null;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: d7$e */
    /* loaded from: classes.dex */
    public class e {
        public float a = Float.NaN;
        public float b = Float.NaN;
        public int c = -1;
        public int d = -1;

        public e() {
        }

        public void a() {
            int i = this.c;
            if (i != -1 || this.d != -1) {
                if (i == -1) {
                    d7.this.Q(this.d);
                } else {
                    int i2 = this.d;
                    if (i2 == -1) {
                        d7.this.N(i, -1, -1);
                    } else {
                        d7.this.O(i, i2);
                    }
                }
                d7.this.setState(g.SETUP);
            }
            if (Float.isNaN(this.b)) {
                if (Float.isNaN(this.a)) {
                    return;
                }
                d7.this.setProgress(this.a);
                return;
            }
            d7.this.M(this.a, this.b);
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = -1;
            this.d = -1;
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat(C0059ao.a(5415), this.a);
            bundle.putFloat(C0059ao.a(5416), this.b);
            bundle.putInt(C0059ao.a(5417), this.c);
            bundle.putInt(C0059ao.a(5418), this.d);
            return bundle;
        }

        public void c() {
            this.d = d7.this.B;
            this.c = d7.this.z;
            this.b = d7.this.getVelocity();
            this.a = d7.this.getProgress();
        }

        public void d(int i) {
            this.d = i;
        }

        public void e(float f) {
            this.a = f;
        }

        public void f(int i) {
            this.c = i;
        }

        public void g(Bundle bundle) {
            this.a = bundle.getFloat(C0059ao.a(5419));
            this.b = bundle.getFloat(C0059ao.a(5420));
            this.c = bundle.getInt(C0059ao.a(5421));
            this.d = bundle.getInt(C0059ao.a(5422));
        }

        public void h(float f) {
            this.b = f;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: d7$f */
    /* loaded from: classes.dex */
    public interface f {
        void a(d7 d7Var, int i, int i2, float f);

        void b(d7 d7Var, int i, int i2);

        void c(d7 d7Var, int i);
    }

    /* compiled from: AxisPay */
    /* renamed from: d7$g */
    /* loaded from: classes.dex */
    public enum g {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public void E(float f2) {
        f7 f7Var = this.v;
        if (f7Var == null) {
            return;
        }
        float f3 = this.J;
        float f4 = this.I;
        if (f3 != f4 && this.M) {
            this.J = f4;
        }
        if (this.J == f2) {
            return;
        }
        this.R = false;
        this.L = f2;
        f7Var.e();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void F(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        float interpolation;
        boolean z5;
        boolean z6;
        if (this.K == -1) {
            this.K = getNanoTime();
        }
        float f2 = this.J;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.A = -1;
        }
        if (this.e0 || (this.N && (z || this.L != f2))) {
            float signum = Math.signum(this.L - f2);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.w;
            float f3 = !(interpolator instanceof c7) ? ((((float) (nanoTime - this.K)) * signum) * 1.0E-9f) / this.H : 0.0f;
            float f4 = this.J + f3;
            if (this.M) {
                f4 = this.L;
            }
            int i2 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i2 <= 0 || f4 < this.L) && (signum > 0.0f || f4 > this.L)) {
                z2 = false;
            } else {
                f4 = this.L;
                this.N = false;
                z2 = true;
            }
            this.J = f4;
            this.I = f4;
            this.K = nanoTime;
            if (interpolator != null && !z2) {
                if (this.R) {
                    interpolation = interpolator.getInterpolation(((float) (nanoTime - this.G)) * 1.0E-9f);
                    Interpolator interpolator2 = this.w;
                    q6 q6Var = this.S;
                    if (interpolator2 != q6Var) {
                        this.J = interpolation;
                        this.K = nanoTime;
                        if (interpolator2 instanceof c7) {
                            float a2 = ((c7) interpolator2).a();
                            this.y = a2;
                            int i3 = ((Math.abs(a2) * this.H) > 1.0E-5f ? 1 : ((Math.abs(a2) * this.H) == 1.0E-5f ? 0 : -1));
                            if (a2 <= 0.0f || interpolation < 1.0f) {
                                z5 = false;
                            } else {
                                this.J = 1.0f;
                                z5 = false;
                                this.N = false;
                                interpolation = 1.0f;
                            }
                            if (a2 < 0.0f && interpolation <= 0.0f) {
                                this.J = 0.0f;
                                this.N = z5;
                                f4 = 0.0f;
                            }
                        }
                    } else {
                        q6Var.b();
                        throw null;
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f4);
                    Interpolator interpolator3 = this.w;
                    if (interpolator3 instanceof c7) {
                        this.y = ((c7) interpolator3).a();
                    } else {
                        this.y = ((interpolator3.getInterpolation(f4 + f3) - interpolation) * signum) / f3;
                    }
                }
                f4 = interpolation;
            } else {
                this.y = f3;
            }
            if (Math.abs(this.y) > 1.0E-5f) {
                setState(g.MOVING);
            }
            if ((i2 > 0 && f4 >= this.L) || (signum <= 0.0f && f4 <= this.L)) {
                f4 = this.L;
                this.N = false;
            }
            if (f4 >= 1.0f || f4 <= 0.0f) {
                z3 = 0;
                this.N = false;
                setState(g.FINISHED);
            } else {
                z3 = 0;
            }
            int childCount = getChildCount();
            this.e0 = z3;
            long nanoTime2 = getNanoTime();
            this.p0 = f4;
            Interpolator interpolator4 = this.x;
            float interpolation2 = interpolator4 == null ? f4 : interpolator4.getInterpolation(f4);
            Interpolator interpolator5 = this.x;
            if (interpolator5 != null) {
                float interpolation3 = interpolator5.getInterpolation((signum / this.H) + f4);
                this.y = interpolation3;
                this.y = interpolation3 - this.x.getInterpolation(f4);
            }
            for (int i4 = z3; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                a7 a7Var = this.F.get(childAt);
                if (a7Var != null) {
                    this.e0 = a7Var.c(childAt, interpolation2, nanoTime2, this.q0) | this.e0;
                }
            }
            boolean z7 = (i2 > 0 && f4 >= this.L) || (signum <= 0.0f && f4 <= this.L);
            if (!this.e0 && !this.N && z7) {
                setState(g.FINISHED);
            }
            if (this.o0) {
                requestLayout();
            }
            z4 = true;
            boolean z8 = this.e0 | (!z7);
            this.e0 = z8;
            if (f4 <= 0.0f && (i = this.z) != -1 && this.A != i) {
                this.A = i;
                this.v.b(i);
                throw null;
            }
            if (f4 >= 1.0d) {
                int i5 = this.A;
                int i6 = this.B;
                if (i5 != i6) {
                    this.A = i6;
                    this.v.b(i6);
                    throw null;
                }
            }
            if (z8 || this.N) {
                invalidate();
            } else if ((i2 > 0 && f4 == 1.0f) || (signum < 0.0f && f4 == 0.0f)) {
                setState(g.FINISHED);
            }
            if (!this.e0 && !this.N && ((i2 > 0 && f4 == 1.0f) || (signum < 0.0f && f4 == 0.0f))) {
                J();
            }
        } else {
            z4 = true;
        }
        float f5 = this.J;
        if (f5 >= 1.0f) {
            int i7 = this.A;
            int i8 = this.B;
            if (i7 == i8) {
                z4 = false;
            }
            this.A = i8;
        } else if (f5 <= 0.0f) {
            int i9 = this.A;
            int i10 = this.z;
            if (i9 == i10) {
                z4 = false;
            }
            this.A = i10;
        } else {
            z6 = false;
            this.z0 |= z6;
            if (z6 && !this.r0) {
                requestLayout();
            }
            this.I = this.J;
        }
        z6 = z4;
        this.z0 |= z6;
        if (z6) {
            requestLayout();
        }
        this.I = this.J;
    }

    public final void G() {
        CopyOnWriteArrayList<f> copyOnWriteArrayList;
        if ((this.O == null && ((copyOnWriteArrayList = this.i0) == null || copyOnWriteArrayList.isEmpty())) || this.n0 == this.I) {
            return;
        }
        if (this.m0 != -1) {
            f fVar = this.O;
            if (fVar != null) {
                fVar.b(this, this.z, this.B);
            }
            CopyOnWriteArrayList<f> copyOnWriteArrayList2 = this.i0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<f> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().b(this, this.z, this.B);
                }
            }
        }
        this.m0 = -1;
        float f2 = this.I;
        this.n0 = f2;
        f fVar2 = this.O;
        if (fVar2 != null) {
            fVar2.a(this, this.z, this.B, f2);
        }
        CopyOnWriteArrayList<f> copyOnWriteArrayList3 = this.i0;
        if (copyOnWriteArrayList3 != null) {
            Iterator<f> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().a(this, this.z, this.B, this.I);
            }
        }
    }

    public void H() {
        int i;
        CopyOnWriteArrayList<f> copyOnWriteArrayList;
        if ((this.O != null || ((copyOnWriteArrayList = this.i0) != null && !copyOnWriteArrayList.isEmpty())) && this.m0 == -1) {
            this.m0 = this.A;
            if (this.A0.isEmpty()) {
                i = -1;
            } else {
                ArrayList<Integer> arrayList = this.A0;
                i = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i2 = this.A;
            if (i != i2 && i2 != -1) {
                this.A0.add(Integer.valueOf(i2));
            }
        }
        K();
        Runnable runnable = this.t0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.u0;
        if (iArr == null || this.v0 <= 0) {
            return;
        }
        Q(iArr[0]);
        int[] iArr2 = this.u0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.v0--;
    }

    public f7.a I(int i) {
        this.v.h(i);
        throw null;
    }

    public void J() {
        f7 f7Var = this.v;
        if (f7Var == null) {
            return;
        }
        f7Var.a(this, this.A);
        throw null;
    }

    public final void K() {
        CopyOnWriteArrayList<f> copyOnWriteArrayList;
        if (this.O == null && ((copyOnWriteArrayList = this.i0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        Iterator<Integer> it = this.A0.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            f fVar = this.O;
            if (fVar != null) {
                fVar.c(this, next.intValue());
            }
            CopyOnWriteArrayList<f> copyOnWriteArrayList2 = this.i0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<f> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().c(this, next.intValue());
                }
            }
        }
        this.A0.clear();
    }

    public void L() {
        this.y0.a();
        invalidate();
    }

    public void M(float f2, float f3) {
        if (!isAttachedToWindow()) {
            if (this.s0 == null) {
                this.s0 = new e();
            }
            this.s0.e(f2);
            this.s0.h(f3);
            return;
        }
        setProgress(f2);
        setState(g.MOVING);
        this.y = f3;
        int i = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if (i != 0) {
            E(i > 0 ? 1.0f : 0.0f);
        } else if (f2 == 0.0f || f2 == 1.0f) {
        } else {
            E(f2 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void N(int i, int i2, int i3) {
        setState(g.SETUP);
        this.A = i;
        this.z = -1;
        this.B = -1;
        k7 k7Var = this.l;
        if (k7Var != null) {
            k7Var.d(i, i2, i3);
            return;
        }
        f7 f7Var = this.v;
        if (f7Var == null) {
            return;
        }
        f7Var.b(i);
        throw null;
    }

    public void O(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.s0 == null) {
                this.s0 = new e();
            }
            this.s0.f(i);
            this.s0.d(i2);
            return;
        }
        f7 f7Var = this.v;
        if (f7Var == null) {
            return;
        }
        this.z = i;
        this.B = i2;
        f7Var.l(i, i2);
        throw null;
    }

    public void P() {
        E(1.0f);
        this.t0 = null;
    }

    public void Q(int i) {
        if (!isAttachedToWindow()) {
            if (this.s0 == null) {
                this.s0 = new e();
            }
            this.s0.d(i);
            return;
        }
        R(i, -1, -1);
    }

    public void R(int i, int i2, int i3) {
        S(i, i2, i3, -1);
    }

    public void S(int i, int i2, int i3, int i4) {
        s7 s7Var;
        f7 f7Var = this.v;
        if (f7Var != null && (s7Var = f7Var.a) != null) {
            s7Var.a(this.A, i, i2, i3);
            throw null;
        }
        int i5 = this.A;
        if (i5 == i) {
            return;
        }
        if (this.z == i) {
            E(0.0f);
            if (i4 > 0) {
                this.H = i4 / 1000.0f;
            }
        } else if (this.B == i) {
            E(1.0f);
            if (i4 > 0) {
                this.H = i4 / 1000.0f;
            }
        } else {
            this.B = i;
            if (i5 != -1) {
                O(i5, i);
                E(1.0f);
                this.J = 0.0f;
                P();
                if (i4 > 0) {
                    this.H = i4 / 1000.0f;
                    return;
                }
                return;
            }
            this.R = false;
            this.L = 1.0f;
            this.I = 0.0f;
            this.J = 0.0f;
            this.K = getNanoTime();
            this.G = getNanoTime();
            this.M = false;
            this.w = null;
            if (i4 == -1) {
                this.v.e();
                throw null;
            }
            this.z = -1;
            this.v.l(-1, this.B);
            throw null;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        long j;
        h7 h7Var;
        ArrayList<b7> arrayList = this.h0;
        if (arrayList != null) {
            Iterator<b7> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().x(canvas);
            }
        }
        F(false);
        f7 f7Var = this.v;
        if (f7Var != null && (h7Var = f7Var.c) != null) {
            h7Var.a();
            throw null;
        }
        super.dispatchDraw(canvas);
        if (this.v == null) {
            return;
        }
        if ((this.P & 1) == 1 && !isInEditMode()) {
            this.j0++;
            long nanoTime = getNanoTime();
            long j2 = this.k0;
            if (j2 != -1) {
                if (nanoTime - j2 > 200000000) {
                    this.l0 = ((int) ((this.j0 / (((float) j) * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.j0 = 0;
                    this.k0 = nanoTime;
                }
            } else {
                this.k0 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            StringBuilder sb = new StringBuilder();
            sb.append(this.l0 + C0059ao.a(2576) + u6.c(this, this.z) + C0059ao.a(2577));
            sb.append(u6.c(this, this.B));
            sb.append(C0059ao.a(2578));
            sb.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sb.append(C0059ao.a(2579));
            int i = this.A;
            sb.append(i == -1 ? C0059ao.a(2580) : u6.c(this, i));
            String sb2 = sb.toString();
            paint.setColor(-16777216);
            canvas.drawText(sb2, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(sb2, 10.0f, getHeight() - 30, paint);
        }
        if (this.P > 1) {
            if (this.Q == null) {
                this.Q = new c();
            }
            this.v.e();
            throw null;
        }
        ArrayList<b7> arrayList2 = this.h0;
        if (arrayList2 != null) {
            Iterator<b7> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().w(canvas);
            }
        }
    }

    public int[] getConstraintSetIds() {
        f7 f7Var = this.v;
        if (f7Var == null) {
            return null;
        }
        f7Var.c();
        throw null;
    }

    public int getCurrentState() {
        return this.A;
    }

    public ArrayList<f7.a> getDefinedTransitions() {
        f7 f7Var = this.v;
        if (f7Var == null) {
            return null;
        }
        f7Var.d();
        throw null;
    }

    public v6 getDesignTool() {
        if (this.T == null) {
            this.T = new v6(this);
        }
        return this.T;
    }

    public int getEndState() {
        return this.B;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.J;
    }

    public f7 getScene() {
        return this.v;
    }

    public int getStartState() {
        return this.z;
    }

    public float getTargetPosition() {
        return this.L;
    }

    public Bundle getTransitionState() {
        if (this.s0 == null) {
            this.s0 = new e();
        }
        this.s0.c();
        return this.s0.b();
    }

    public long getTransitionTimeMs() {
        f7 f7Var = this.v;
        if (f7Var == null) {
            return this.H * 1000.0f;
        }
        f7Var.e();
        throw null;
    }

    public float getVelocity() {
        return this.y;
    }

    @Override // defpackage.qb
    public void h(View view, View view2, int i, int i2) {
        this.c0 = getNanoTime();
        this.d0 = 0.0f;
        this.a0 = 0.0f;
        this.b0 = 0.0f;
    }

    @Override // defpackage.qb
    public void i(View view, int i) {
        f7 f7Var = this.v;
        if (f7Var != null) {
            float f2 = this.d0;
            if (f2 == 0.0f) {
                return;
            }
            f7Var.i(this.a0 / f2, this.b0 / f2);
            throw null;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 19) {
            return super.isAttachedToWindow();
        }
        return getWindowToken() != null;
    }

    @Override // defpackage.qb
    public void j(View view, int i, int i2, int[] iArr, int i3) {
        f7.a aVar;
        f7 f7Var = this.v;
        if (f7Var == null || (aVar = f7Var.b) == null) {
            return;
        }
        aVar.d();
        throw null;
    }

    @Override // defpackage.rb
    public void m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.W || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.W = false;
    }

    @Override // defpackage.qb
    public void n(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // defpackage.qb
    public boolean o(View view, View view2, int i, int i2) {
        f7.a aVar;
        f7 f7Var = this.v;
        if (f7Var == null || (aVar = f7Var.b) == null) {
            return false;
        }
        aVar.c();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        f7.a aVar;
        int i;
        Display display;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 17 && (display = getDisplay()) != null) {
            display.getRotation();
        }
        f7 f7Var = this.v;
        if (f7Var != null && (i = this.A) != -1) {
            f7Var.b(i);
            throw null;
        }
        J();
        e eVar = this.s0;
        if (eVar != null) {
            if (this.w0) {
                post(new a());
                return;
            } else {
                eVar.a();
                return;
            }
        }
        f7 f7Var2 = this.v;
        if (f7Var2 == null || (aVar = f7Var2.b) == null) {
            return;
        }
        aVar.a();
        throw null;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f7 f7Var = this.v;
        if (f7Var == null || !this.E) {
            return false;
        }
        h7 h7Var = f7Var.c;
        if (h7Var == null) {
            f7.a aVar = f7Var.b;
            if (aVar == null) {
                return false;
            }
            aVar.d();
            throw null;
        }
        h7Var.b(motionEvent);
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.r0 = true;
        try {
            if (this.v == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.U != i5 || this.V != i6) {
                L();
                F(true);
            }
            this.U = i5;
            this.V = i6;
        } finally {
            this.r0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.v == null) {
            super.onMeasure(i, i2);
            return;
        }
        if (this.C == i) {
            int i3 = this.D;
        }
        if (this.z0) {
            this.z0 = false;
            J();
            K();
        }
        boolean z = this.i;
        this.C = i;
        this.D = i2;
        this.v.g();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.sb
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.sb
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        f7 f7Var = this.v;
        if (f7Var == null) {
            return;
        }
        f7Var.k(r());
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        f7 f7Var = this.v;
        if (f7Var == null || !this.E) {
            return super.onTouchEvent(motionEvent);
        }
        f7Var.n();
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof b7) {
            b7 b7Var = (b7) view;
            if (this.i0 == null) {
                this.i0 = new CopyOnWriteArrayList<>();
            }
            this.i0.add(b7Var);
            if (b7Var.v()) {
                if (this.f0 == null) {
                    this.f0 = new ArrayList<>();
                }
                this.f0.add(b7Var);
            }
            if (b7Var.u()) {
                if (this.g0 == null) {
                    this.g0 = new ArrayList<>();
                }
                this.g0.add(b7Var);
            }
            if (b7Var.t()) {
                if (this.h0 == null) {
                    this.h0 = new ArrayList<>();
                }
                this.h0.add(b7Var);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<b7> arrayList = this.f0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<b7> arrayList2 = this.g0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        f7 f7Var;
        f7.a aVar;
        if (!this.o0 && this.A == -1 && (f7Var = this.v) != null && (aVar = f7Var.b) != null) {
            aVar.b();
            throw null;
        } else {
            super.requestLayout();
        }
    }

    public void setDebugMode(int i) {
        this.P = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.w0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.E = z;
    }

    public void setInterpolatedProgress(float f2) {
        if (this.v == null) {
            setProgress(f2);
            return;
        }
        setState(g.MOVING);
        this.v.f();
        throw null;
    }

    public void setOnHide(float f2) {
        ArrayList<b7> arrayList = this.g0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.g0.get(i).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<b7> arrayList = this.f0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f0.get(i).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2) {
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i < 0 || f2 > 1.0f) {
            Log.w(C0059ao.a(2581), C0059ao.a(2582));
        }
        if (!isAttachedToWindow()) {
            if (this.s0 == null) {
                this.s0 = new e();
            }
            this.s0.e(f2);
            return;
        }
        if (i <= 0) {
            if (this.J == 1.0f && this.A == this.B) {
                setState(g.MOVING);
            }
            this.A = this.z;
            if (this.J == 0.0f) {
                setState(g.FINISHED);
            }
        } else if (f2 >= 1.0f) {
            if (this.J == 0.0f && this.A == this.z) {
                setState(g.MOVING);
            }
            this.A = this.B;
            if (this.J == 1.0f) {
                setState(g.FINISHED);
            }
        } else {
            this.A = -1;
            setState(g.MOVING);
        }
        if (this.v == null) {
            return;
        }
        this.M = true;
        this.L = f2;
        this.I = f2;
        this.K = -1L;
        this.G = -1L;
        this.w = null;
        this.N = true;
        invalidate();
    }

    public void setScene(f7 f7Var) {
        f7Var.k(r());
        throw null;
    }

    public void setStartState(int i) {
        if (!isAttachedToWindow()) {
            if (this.s0 == null) {
                this.s0 = new e();
            }
            this.s0.f(i);
            this.s0.d(i);
            return;
        }
        this.A = i;
    }

    public void setState(g gVar) {
        g gVar2 = g.FINISHED;
        if (gVar == gVar2 && this.A == -1) {
            return;
        }
        g gVar3 = this.x0;
        this.x0 = gVar;
        g gVar4 = g.MOVING;
        if (gVar3 == gVar4 && gVar == gVar4) {
            G();
        }
        int i = b.a[gVar3.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 && gVar == gVar2) {
                H();
                return;
            }
            return;
        }
        if (gVar == gVar4) {
            G();
        }
        if (gVar == gVar2) {
            H();
        }
    }

    public void setTransition(int i) {
        if (this.v == null) {
            return;
        }
        I(i);
        throw null;
    }

    public void setTransitionDuration(int i) {
        f7 f7Var = this.v;
        if (f7Var == null) {
            Log.e(C0059ao.a(2583), C0059ao.a(2584));
        } else {
            f7Var.j(i);
            throw null;
        }
    }

    public void setTransitionListener(f fVar) {
        this.O = fVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.s0 == null) {
            this.s0 = new e();
        }
        this.s0.g(bundle);
        if (isAttachedToWindow()) {
            this.s0.a();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void t(int i) {
        this.l = null;
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return u6.a(context, this.z) + C0059ao.a(2585) + u6.a(context, this.B) + C0059ao.a(2586) + this.J + C0059ao.a(2587) + this.y;
    }

    public void setTransition(f7.a aVar) {
        this.v.m(aVar);
        throw null;
    }
}
