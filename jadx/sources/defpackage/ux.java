package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ux  reason: default package */
/* loaded from: classes.dex */
public class ux {
    public static final TimeInterpolator F = tv.c;
    public static final int[] G = {16842919, 16842910};
    public static final int[] H = {16843623, 16842908, 16842910};
    public static final int[] I = {16842908, 16842910};
    public static final int[] J = {16843623, 16842910};
    public static final int[] K = {16842910};
    public static final int[] L = new int[0];
    public ViewTreeObserver.OnPreDrawListener E;
    public lz a;
    public hz b;
    public Drawable c;
    public tx d;
    public Drawable e;
    public boolean f;
    public float h;
    public float i;
    public float j;
    public int k;
    public final hy l;
    public aw m;
    public aw n;
    public Animator o;
    public aw p;
    public aw q;
    public float r;
    public int t;
    public ArrayList<Animator.AnimatorListener> v;
    public ArrayList<Animator.AnimatorListener> w;
    public ArrayList<i> x;
    public final FloatingActionButton y;
    public final az z;
    public boolean g = true;
    public float s = 1.0f;
    public int u = 0;
    public final Rect A = new Rect();
    public final RectF B = new RectF();
    public final RectF C = new RectF();
    public final Matrix D = new Matrix();

    /* compiled from: AxisPay */
    /* renamed from: ux$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ j c;

        public a(boolean z, j jVar) {
            this.b = z;
            this.c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ux.this.u = 0;
            ux.this.o = null;
            if (this.a) {
                return;
            }
            FloatingActionButton floatingActionButton = ux.this.y;
            boolean z = this.b;
            floatingActionButton.b(z ? 8 : 4, z);
            j jVar = this.c;
            if (jVar != null) {
                jVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ux.this.y.b(0, this.b);
            ux.this.u = 1;
            ux.this.o = animator;
            this.a = false;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ux$b */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ j b;

        public b(boolean z, j jVar) {
            this.a = z;
            this.b = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ux.this.u = 0;
            ux.this.o = null;
            j jVar = this.b;
            if (jVar != null) {
                jVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ux.this.y.b(0, this.a);
            ux.this.u = 2;
            ux.this.o = animator;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ux$c */
    /* loaded from: classes.dex */
    public class c extends zv {
        public c() {
        }

        @Override // defpackage.zv
        public Matrix a(float f, Matrix matrix, Matrix matrix2) {
            ux.this.s = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ux$d */
    /* loaded from: classes.dex */
    public class d implements TypeEvaluator<Float> {
        public FloatEvaluator a = new FloatEvaluator();

        public d(ux uxVar) {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ux$e */
    /* loaded from: classes.dex */
    public class e implements ViewTreeObserver.OnPreDrawListener {
        public e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ux.this.H();
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ux$f */
    /* loaded from: classes.dex */
    public class f extends l {
        public f(ux uxVar) {
            super(uxVar, null);
        }

        @Override // defpackage.ux.l
        public float a() {
            return 0.0f;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ux$g */
    /* loaded from: classes.dex */
    public class g extends l {
        public g() {
            super(ux.this, null);
        }

        @Override // defpackage.ux.l
        public float a() {
            ux uxVar = ux.this;
            return uxVar.h + uxVar.i;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ux$h */
    /* loaded from: classes.dex */
    public class h extends l {
        public h() {
            super(ux.this, null);
        }

        @Override // defpackage.ux.l
        public float a() {
            ux uxVar = ux.this;
            return uxVar.h + uxVar.j;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ux$i */
    /* loaded from: classes.dex */
    public interface i {
        void a();

        void b();
    }

    /* compiled from: AxisPay */
    /* renamed from: ux$j */
    /* loaded from: classes.dex */
    public interface j {
        void a();

        void b();
    }

    /* compiled from: AxisPay */
    /* renamed from: ux$k */
    /* loaded from: classes.dex */
    public class k extends l {
        public k() {
            super(ux.this, null);
        }

        @Override // defpackage.ux.l
        public float a() {
            return ux.this.h;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ux$l */
    /* loaded from: classes.dex */
    public abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public boolean a;
        public float b;
        public float c;

        public l() {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ux.this.g0((int) this.c);
            this.a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                hz hzVar = ux.this.b;
                this.b = hzVar == null ? 0.0f : hzVar.w();
                this.c = a();
                this.a = true;
            }
            ux uxVar = ux.this;
            float f = this.b;
            uxVar.g0((int) (f + ((this.c - f) * valueAnimator.getAnimatedFraction())));
        }

        public /* synthetic */ l(ux uxVar, a aVar) {
            this();
        }
    }

    public ux(FloatingActionButton floatingActionButton, az azVar) {
        this.y = floatingActionButton;
        this.z = azVar;
        hy hyVar = new hy();
        this.l = hyVar;
        hyVar.a(G, i(new h()));
        hyVar.a(H, i(new g()));
        hyVar.a(I, i(new g()));
        hyVar.a(J, i(new g()));
        hyVar.a(K, i(new k()));
        hyVar.a(L, i(new f(this)));
        this.r = floatingActionButton.getRotation();
    }

    public void A() {
        this.l.c();
    }

    public void B() {
        hz hzVar = this.b;
        if (hzVar != null) {
            iz.f(this.y, hzVar);
        }
        if (K()) {
            this.y.getViewTreeObserver().addOnPreDrawListener(r());
        }
    }

    public void C() {
    }

    public void D() {
        ViewTreeObserver viewTreeObserver = this.y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.E = null;
        }
    }

    public void E(int[] iArr) {
        this.l.d(iArr);
    }

    public void F(float f2, float f3, float f4) {
        f0();
        g0(f2);
    }

    public void G(Rect rect) {
        db.f(this.e, C0059ao.a(4300));
        if (Z()) {
            this.z.b(new InsetDrawable(this.e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.z.b(this.e);
    }

    public void H() {
        float rotation = this.y.getRotation();
        if (this.r != rotation) {
            this.r = rotation;
            d0();
        }
    }

    public void I() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void J() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public boolean K() {
        return true;
    }

    public void L(ColorStateList colorStateList) {
        hz hzVar = this.b;
        if (hzVar != null) {
            hzVar.setTintList(colorStateList);
        }
        tx txVar = this.d;
        if (txVar != null) {
            txVar.c(colorStateList);
        }
    }

    public void M(PorterDuff.Mode mode) {
        hz hzVar = this.b;
        if (hzVar != null) {
            hzVar.setTintMode(mode);
        }
    }

    public final void N(float f2) {
        if (this.h != f2) {
            this.h = f2;
            F(f2, this.i, this.j);
        }
    }

    public void O(boolean z) {
        this.f = z;
    }

    public final void P(aw awVar) {
        this.q = awVar;
    }

    public final void Q(float f2) {
        if (this.i != f2) {
            this.i = f2;
            F(this.h, f2, this.j);
        }
    }

    public final void R(float f2) {
        this.s = f2;
        Matrix matrix = this.D;
        g(f2, matrix);
        this.y.setImageMatrix(matrix);
    }

    public final void S(int i2) {
        if (this.t != i2) {
            this.t = i2;
            e0();
        }
    }

    public void T(int i2) {
        this.k = i2;
    }

    public final void U(float f2) {
        if (this.j != f2) {
            this.j = f2;
            F(this.h, this.i, f2);
        }
    }

    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            o9.o(drawable, yy.d(colorStateList));
        }
    }

    public void W(boolean z) {
        this.g = z;
        f0();
    }

    public final void X(lz lzVar) {
        this.a = lzVar;
        hz hzVar = this.b;
        if (hzVar != null) {
            hzVar.setShapeAppearanceModel(lzVar);
        }
        Drawable drawable = this.c;
        if (drawable instanceof oz) {
            ((oz) drawable).setShapeAppearanceModel(lzVar);
        }
        tx txVar = this.d;
        if (txVar != null) {
            txVar.f(lzVar);
        }
    }

    public final void Y(aw awVar) {
        this.p = awVar;
    }

    public boolean Z() {
        return true;
    }

    public final boolean a0() {
        return ac.V(this.y) && !this.y.isInEditMode();
    }

    public final boolean b0() {
        return !this.f || this.y.getSizeDimension() >= this.k;
    }

    public void c0(j jVar, boolean z) {
        if (z()) {
            return;
        }
        Animator animator = this.o;
        if (animator != null) {
            animator.cancel();
        }
        if (a0()) {
            if (this.y.getVisibility() != 0) {
                this.y.setAlpha(0.0f);
                this.y.setScaleY(0.0f);
                this.y.setScaleX(0.0f);
                R(0.0f);
            }
            aw awVar = this.p;
            if (awVar == null) {
                awVar = m();
            }
            AnimatorSet h2 = h(awVar, 1.0f, 1.0f, 1.0f);
            h2.addListener(new b(z, jVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.v;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    h2.addListener(it.next());
                }
            }
            h2.start();
            return;
        }
        this.y.b(0, z);
        this.y.setAlpha(1.0f);
        this.y.setScaleY(1.0f);
        this.y.setScaleX(1.0f);
        R(1.0f);
        if (jVar != null) {
            jVar.a();
        }
    }

    public void d(Animator.AnimatorListener animatorListener) {
        if (this.w == null) {
            this.w = new ArrayList<>();
        }
        this.w.add(animatorListener);
    }

    public void d0() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.r % 90.0f != 0.0f) {
                if (this.y.getLayerType() != 1) {
                    this.y.setLayerType(1, null);
                }
            } else if (this.y.getLayerType() != 0) {
                this.y.setLayerType(0, null);
            }
        }
        hz hzVar = this.b;
        if (hzVar != null) {
            hzVar.c0((int) this.r);
        }
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.v == null) {
            this.v = new ArrayList<>();
        }
        this.v.add(animatorListener);
    }

    public final void e0() {
        R(this.s);
    }

    public void f(i iVar) {
        if (this.x == null) {
            this.x = new ArrayList<>();
        }
        this.x.add(iVar);
    }

    public final void f0() {
        Rect rect = this.A;
        s(rect);
        G(rect);
        this.z.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void g(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.y.getDrawable();
        if (drawable == null || this.t == 0) {
            return;
        }
        RectF rectF = this.B;
        RectF rectF2 = this.C;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i2 = this.t;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.t;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    public void g0(float f2) {
        hz hzVar = this.b;
        if (hzVar != null) {
            hzVar.W(f2);
        }
    }

    public final AnimatorSet h(aw awVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.y, View.ALPHA, f2);
        awVar.e(C0059ao.a(4301)).a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.y, View.SCALE_X, f3);
        String a2 = C0059ao.a(4302);
        awVar.e(a2).a(ofFloat2);
        h0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.y, View.SCALE_Y, f3);
        awVar.e(a2).a(ofFloat3);
        h0(ofFloat3);
        arrayList.add(ofFloat3);
        g(f4, this.D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.y, new yv(), new c(), new Matrix(this.D));
        awVar.e(C0059ao.a(4303)).a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        uv.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final void h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d(this));
    }

    public final ValueAnimator i(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(F);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public hz j() {
        lz lzVar = this.a;
        db.e(lzVar);
        return new hz(lzVar);
    }

    public final Drawable k() {
        return this.e;
    }

    public final aw l() {
        if (this.n == null) {
            this.n = aw.c(this.y.getContext(), hv.design_fab_hide_motion_spec);
        }
        aw awVar = this.n;
        db.e(awVar);
        return awVar;
    }

    public final aw m() {
        if (this.m == null) {
            this.m = aw.c(this.y.getContext(), hv.design_fab_show_motion_spec);
        }
        aw awVar = this.m;
        db.e(awVar);
        return awVar;
    }

    public float n() {
        return this.h;
    }

    public boolean o() {
        return this.f;
    }

    public final aw p() {
        return this.q;
    }

    public float q() {
        return this.i;
    }

    public final ViewTreeObserver.OnPreDrawListener r() {
        if (this.E == null) {
            this.E = new e();
        }
        return this.E;
    }

    public void s(Rect rect) {
        int sizeDimension = this.f ? (this.k - this.y.getSizeDimension()) / 2 : 0;
        float n = this.g ? n() + this.j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(n));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(n * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public float t() {
        return this.j;
    }

    public final lz u() {
        return this.a;
    }

    public final aw v() {
        return this.p;
    }

    public void w(j jVar, boolean z) {
        if (y()) {
            return;
        }
        Animator animator = this.o;
        if (animator != null) {
            animator.cancel();
        }
        if (a0()) {
            aw awVar = this.q;
            if (awVar == null) {
                awVar = l();
            }
            AnimatorSet h2 = h(awVar, 0.0f, 0.0f, 0.0f);
            h2.addListener(new a(z, jVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.w;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    h2.addListener(it.next());
                }
            }
            h2.start();
            return;
        }
        this.y.b(z ? 8 : 4, z);
        if (jVar != null) {
            jVar.b();
        }
    }

    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        hz j2 = j();
        this.b = j2;
        j2.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        this.b.b0(-12303292);
        this.b.M(this.y.getContext());
        xy xyVar = new xy(this.b.C());
        xyVar.setTintList(yy.d(colorStateList2));
        this.c = xyVar;
        hz hzVar = this.b;
        db.e(hzVar);
        this.e = new LayerDrawable(new Drawable[]{hzVar, xyVar});
    }

    public boolean y() {
        return this.y.getVisibility() == 0 ? this.u == 1 : this.u != 2;
    }

    public boolean z() {
        return this.y.getVisibility() != 0 ? this.u == 2 : this.u != 1;
    }
}
