package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.kd;
import defpackage.lc;
import defpackage.ny;
import defpackage.oc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int Y = rv.Widget_Design_BottomSheet_Modal;
    public float A;
    public int B;
    public float C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public kd H;
    public boolean I;
    public int J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public WeakReference<V> O;
    public WeakReference<View> P;
    public final ArrayList<g> Q;
    public VelocityTracker R;
    public int S;
    public int T;
    public boolean U;
    public Map<View, Integer> V;
    public int W;
    public final kd.c X;
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public hz j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public lz t;
    public boolean u;
    public BottomSheetBehavior<V>.h v;
    public ValueAnimator w;
    public int x;
    public int y;
    public int z;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ View b;
        public final /* synthetic */ ViewGroup.LayoutParams c;

        public a(BottomSheetBehavior bottomSheetBehavior, View view, ViewGroup.LayoutParams layoutParams) {
            this.b = view;
            this.c = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.setLayoutParams(this.c);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;

        public b(View view, int i) {
            this.b = view;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.v0(this.b, this.c);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.j != null) {
                BottomSheetBehavior.this.j.Y(floatValue);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class d implements ny.d {
        public final /* synthetic */ boolean a;

        public d(boolean z) {
            this.a = z;
        }

        @Override // defpackage.ny.d
        public ic a(View view, ic icVar, ny.e eVar) {
            BottomSheetBehavior.this.s = icVar.l();
            boolean d = ny.d(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.n) {
                BottomSheetBehavior.this.r = icVar.i();
                paddingBottom = eVar.d + BottomSheetBehavior.this.r;
            }
            if (BottomSheetBehavior.this.o) {
                paddingLeft = (d ? eVar.c : eVar.a) + icVar.j();
            }
            if (BottomSheetBehavior.this.p) {
                paddingRight = (d ? eVar.a : eVar.c) + icVar.k();
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.a) {
                BottomSheetBehavior.this.l = icVar.g().d;
            }
            if (BottomSheetBehavior.this.n || this.a) {
                BottomSheetBehavior.this.C0(false);
            }
            return icVar;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class e extends kd.c {
        public e() {
        }

        @Override // defpackage.kd.c
        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // defpackage.kd.c
        public int b(View view, int i, int i2) {
            int b0 = BottomSheetBehavior.this.b0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return y9.b(i, b0, bottomSheetBehavior.D ? bottomSheetBehavior.N : bottomSheetBehavior.B);
        }

        @Override // defpackage.kd.c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.D) {
                return bottomSheetBehavior.N;
            }
            return bottomSheetBehavior.B;
        }

        @Override // defpackage.kd.c
        public void j(int i) {
            if (i == 1 && BottomSheetBehavior.this.F) {
                BottomSheetBehavior.this.t0(1);
            }
        }

        @Override // defpackage.kd.c
        public void k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.Z(i2);
        }

        @Override // defpackage.kd.c
        public void l(View view, float f, float f2) {
            int i;
            int i2 = 4;
            if (f2 < 0.0f) {
                if (BottomSheetBehavior.this.b) {
                    i = BottomSheetBehavior.this.y;
                } else {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i3 = bottomSheetBehavior.z;
                    if (top > i3) {
                        i = i3;
                        i2 = 6;
                    } else {
                        i = bottomSheetBehavior.b0();
                    }
                }
                i2 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                if (bottomSheetBehavior2.D && bottomSheetBehavior2.x0(view, f2)) {
                    if ((Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) && !n(view)) {
                        if (BottomSheetBehavior.this.b) {
                            i = BottomSheetBehavior.this.y;
                        } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.b0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.z)) {
                            i = BottomSheetBehavior.this.b0();
                        } else {
                            i = BottomSheetBehavior.this.z;
                            i2 = 6;
                        }
                        i2 = 3;
                    } else {
                        i = BottomSheetBehavior.this.N;
                        i2 = 5;
                    }
                } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
                    if (BottomSheetBehavior.this.b) {
                        i = BottomSheetBehavior.this.B;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.z) < Math.abs(top2 - BottomSheetBehavior.this.B)) {
                            i = BottomSheetBehavior.this.z;
                            i2 = 6;
                        } else {
                            i = BottomSheetBehavior.this.B;
                        }
                    }
                } else {
                    int top3 = view.getTop();
                    if (BottomSheetBehavior.this.b) {
                        if (Math.abs(top3 - BottomSheetBehavior.this.y) < Math.abs(top3 - BottomSheetBehavior.this.B)) {
                            i = BottomSheetBehavior.this.y;
                            i2 = 3;
                        } else {
                            i = BottomSheetBehavior.this.B;
                        }
                    } else {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        int i4 = bottomSheetBehavior3.z;
                        if (top3 < i4) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior3.B)) {
                                i = BottomSheetBehavior.this.b0();
                                i2 = 3;
                            } else {
                                i = BottomSheetBehavior.this.z;
                            }
                        } else if (Math.abs(top3 - i4) < Math.abs(top3 - BottomSheetBehavior.this.B)) {
                            i = BottomSheetBehavior.this.z;
                        } else {
                            i = BottomSheetBehavior.this.B;
                        }
                        i2 = 6;
                    }
                }
            }
            BottomSheetBehavior.this.y0(view, i2, i, true);
        }

        @Override // defpackage.kd.c
        public boolean m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.G;
            if (i2 == 1 || bottomSheetBehavior.U) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.S == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.P;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.O;
            return weakReference2 != null && weakReference2.get() == view;
        }

        public final boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.N + bottomSheetBehavior.b0()) / 2;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class f implements oc {
        public final /* synthetic */ int a;

        public f(int i) {
            this.a = i;
        }

        @Override // defpackage.oc
        public boolean a(View view, oc.a aVar) {
            BottomSheetBehavior.this.s0(this.a);
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class g {
        public abstract void a(View view, float f);

        public abstract void b(View view, int i);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class h implements Runnable {
        public final View b;
        public boolean c;
        public int d;

        public h(View view, int i) {
            this.b = view;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            kd kdVar = BottomSheetBehavior.this.H;
            if (kdVar != null && kdVar.m(true)) {
                ac.i0(this.b, this);
            } else {
                BottomSheetBehavior.this.t0(this.d);
            }
            this.c = false;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.c = false;
        this.k = -1;
        this.v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList<>();
        this.W = -1;
        this.X = new e();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.J = 0;
        this.K = false;
        return (i & 2) != 0;
    }

    public final void A0(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.u != z) {
            this.u = z;
            if (this.j == null || (valueAnimator = this.w) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.w.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.w.setFloatValues(1.0f - f2, f2);
            this.w.start();
        }
    }

    public final void B0(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.O;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                if (this.V != null) {
                    return;
                }
                this.V = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.O.get()) {
                    if (z) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        if (this.c) {
                            ac.B0(childAt, 4);
                        }
                    } else if (this.c && (map = this.V) != null && map.containsKey(childAt)) {
                        ac.B0(childAt, this.V.get(childAt).intValue());
                    }
                }
            }
            if (!z) {
                this.V = null;
            } else if (this.c) {
                this.O.get().sendAccessibilityEvent(8);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3 = 3;
        if (v.getTop() == b0()) {
            t0(3);
            return;
        }
        WeakReference<View> weakReference = this.P;
        if (weakReference != null && view == weakReference.get() && this.K) {
            if (this.J > 0) {
                if (this.b) {
                    i2 = this.y;
                } else {
                    int top = v.getTop();
                    int i4 = this.z;
                    if (top > i4) {
                        i2 = i4;
                        i3 = 6;
                    } else {
                        i2 = b0();
                    }
                }
            } else if (this.D && x0(v, c0())) {
                i2 = this.N;
                i3 = 5;
            } else if (this.J == 0) {
                int top2 = v.getTop();
                if (this.b) {
                    if (Math.abs(top2 - this.y) < Math.abs(top2 - this.B)) {
                        i2 = this.y;
                    } else {
                        i2 = this.B;
                        i3 = 4;
                    }
                } else {
                    int i5 = this.z;
                    if (top2 < i5) {
                        if (top2 < Math.abs(top2 - this.B)) {
                            i2 = b0();
                        } else {
                            i2 = this.z;
                        }
                    } else if (Math.abs(top2 - i5) < Math.abs(top2 - this.B)) {
                        i2 = this.z;
                    } else {
                        i2 = this.B;
                        i3 = 4;
                    }
                    i3 = 6;
                }
            } else {
                if (this.b) {
                    i2 = this.B;
                } else {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.z) < Math.abs(top3 - this.B)) {
                        i2 = this.z;
                        i3 = 6;
                    } else {
                        i2 = this.B;
                    }
                }
                i3 = 4;
            }
            y0(v, i3, i2, false);
            this.K = false;
        }
    }

    public final void C0(boolean z) {
        V v;
        if (this.O != null) {
            S();
            if (this.G != 4 || (v = this.O.get()) == null) {
                return;
            }
            if (z) {
                w0(this.G);
            } else {
                v.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.G == 1 && actionMasked == 0) {
                return true;
            }
            kd kdVar = this.H;
            if (kdVar != null) {
                kdVar.E(motionEvent);
            }
            if (actionMasked == 0) {
                f0();
            }
            if (this.R == null) {
                this.R = VelocityTracker.obtain();
            }
            this.R.addMovement(motionEvent);
            if (this.H != null && actionMasked == 2 && !this.I && Math.abs(this.T - motionEvent.getY()) > this.H.y()) {
                this.H.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.I;
        }
        return false;
    }

    public final int R(V v, int i, int i2) {
        return ac.b(v, v.getResources().getString(i), V(i2));
    }

    public final void S() {
        int U = U();
        if (this.b) {
            this.B = Math.max(this.N - U, this.y);
        } else {
            this.B = this.N - U;
        }
    }

    public final void T() {
        this.z = (int) (this.N * (1.0f - this.A));
    }

    public final int U() {
        int i;
        if (this.f) {
            return Math.min(Math.max(this.g, this.N - ((this.M * 9) / 16)), this.L) + this.r;
        }
        if (!this.m && !this.n && (i = this.l) > 0) {
            return Math.max(this.e, i + this.h);
        }
        return this.e + this.r;
    }

    public final oc V(int i) {
        return new f(i);
    }

    public final void W(Context context, AttributeSet attributeSet, boolean z) {
        X(context, attributeSet, z, null);
    }

    public final void X(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.i) {
            this.t = lz.e(context, attributeSet, iv.bottomSheetStyle, Y).m();
            hz hzVar = new hz(this.t);
            this.j = hzVar;
            hzVar.M(context);
            if (z && colorStateList != null) {
                this.j.X(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.j.setTint(typedValue.data);
        }
    }

    public final void Y() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.w = ofFloat;
        ofFloat.setDuration(500L);
        this.w.addUpdateListener(new c());
    }

    public void Z(int i) {
        float f2;
        float f3;
        V v = this.O.get();
        if (v == null || this.Q.isEmpty()) {
            return;
        }
        int i2 = this.B;
        if (i <= i2 && i2 != b0()) {
            int i3 = this.B;
            f2 = i3 - i;
            f3 = i3 - b0();
        } else {
            int i4 = this.B;
            f2 = i4 - i;
            f3 = this.N - i4;
        }
        float f4 = f2 / f3;
        for (int i5 = 0; i5 < this.Q.size(); i5++) {
            this.Q.get(i5).a(v, f4);
        }
    }

    public View a0(View view) {
        if (ac.W(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a0 = a0(viewGroup.getChildAt(i));
                if (a0 != null) {
                    return a0;
                }
            }
            return null;
        }
        return null;
    }

    public int b0() {
        if (this.b) {
            return this.y;
        }
        return Math.max(this.x, this.q ? 0 : this.s);
    }

    public final float c0() {
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.d);
        return this.R.getYVelocity(this.S);
    }

    public boolean d0() {
        return this.m;
    }

    public final void e0(V v, lc.a aVar, int i) {
        ac.m0(v, aVar, null, V(i));
    }

    public final void f0() {
        this.S = -1;
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.R = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.O = null;
        this.H = null;
    }

    public final void g0(SavedState savedState) {
        int i = this.a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.e = savedState.e;
        }
        if (i == -1 || (i & 2) == 2) {
            this.b = savedState.f;
        }
        if (i == -1 || (i & 4) == 4) {
            this.D = savedState.g;
        }
        if (i == -1 || (i & 8) == 8) {
            this.E = savedState.h;
        }
    }

    public void h0(boolean z) {
        this.F = z;
    }

    public void i0(int i) {
        if (i >= 0) {
            this.x = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.O = null;
        this.H = null;
    }

    public void j0(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.O != null) {
            S();
        }
        t0((this.b && this.G == 6) ? 3 : this.G);
        z0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        kd kdVar;
        if (v.isShown() && this.F) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                f0();
            }
            if (this.R == null) {
                this.R = VelocityTracker.obtain();
            }
            this.R.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                this.T = (int) motionEvent.getY();
                if (this.G != 2) {
                    WeakReference<View> weakReference = this.P;
                    View view = weakReference != null ? weakReference.get() : null;
                    if (view != null && coordinatorLayout.B(view, x, this.T)) {
                        this.S = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.U = true;
                    }
                }
                this.I = this.S == -1 && !coordinatorLayout.B(v, x, this.T);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.U = false;
                this.S = -1;
                if (this.I) {
                    this.I = false;
                    return false;
                }
            }
            if (this.I || (kdVar = this.H) == null || !kdVar.N(motionEvent)) {
                WeakReference<View> weakReference2 = this.P;
                View view2 = weakReference2 != null ? weakReference2.get() : null;
                return (actionMasked != 2 || view2 == null || this.I || this.G == 1 || coordinatorLayout.B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.H == null || Math.abs(((float) this.T) - motionEvent.getY()) <= ((float) this.H.y())) ? false : true;
            }
            return true;
        }
        this.I = true;
        return false;
    }

    public void k0(boolean z) {
        this.m = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        hz hzVar;
        if (ac.z(coordinatorLayout) && !ac.z(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.O == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(kv.design_bottom_sheet_peek_height_min);
            u0(v);
            this.O = new WeakReference<>(v);
            if (this.i && (hzVar = this.j) != null) {
                ac.u0(v, hzVar);
            }
            hz hzVar2 = this.j;
            if (hzVar2 != null) {
                float f2 = this.C;
                if (f2 == -1.0f) {
                    f2 = ac.w(v);
                }
                hzVar2.W(f2);
                boolean z = this.G == 3;
                this.u = z;
                this.j.Y(z ? 0.0f : 1.0f);
            }
            z0();
            if (ac.A(v) == 0) {
                ac.B0(v, 1);
            }
            int measuredWidth = v.getMeasuredWidth();
            int i2 = this.k;
            if (measuredWidth > i2 && i2 != -1) {
                ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
                layoutParams.width = this.k;
                v.post(new a(this, v, layoutParams));
            }
        }
        if (this.H == null) {
            this.H = kd.o(coordinatorLayout, this.X);
        }
        int top = v.getTop();
        coordinatorLayout.I(v, i);
        this.M = coordinatorLayout.getWidth();
        this.N = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.L = height;
        int i3 = this.N;
        int i4 = i3 - height;
        int i5 = this.s;
        if (i4 < i5) {
            if (this.q) {
                this.L = i3;
            } else {
                this.L = i3 - i5;
            }
        }
        this.y = Math.max(0, i3 - this.L);
        T();
        S();
        int i6 = this.G;
        if (i6 == 3) {
            ac.b0(v, b0());
        } else if (i6 == 6) {
            ac.b0(v, this.z);
        } else if (this.D && i6 == 5) {
            ac.b0(v, this.N);
        } else if (i6 == 4) {
            ac.b0(v, this.B);
        } else if (i6 == 1 || i6 == 2) {
            ac.b0(v, top - v.getTop());
        }
        this.P = new WeakReference<>(a0(v));
        return true;
    }

    public void l0(float f2) {
        if (f2 > 0.0f && f2 < 1.0f) {
            this.A = f2;
            if (this.O != null) {
                T();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public void m0(boolean z) {
        if (this.D != z) {
            this.D = z;
            if (!z && this.G == 5) {
                s0(4);
            }
            z0();
        }
    }

    public void n0(int i) {
        this.k = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.P;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.G != 3 || super.o(coordinatorLayout, v, view, f2, f3);
    }

    public void o0(int i) {
        p0(i, false);
    }

    public final void p0(int i, boolean z) {
        boolean z2 = true;
        if (i == -1) {
            if (!this.f) {
                this.f = true;
            }
            z2 = false;
        } else {
            if (this.f || this.e != i) {
                this.f = false;
                this.e = Math.max(0, i);
            }
            z2 = false;
        }
        if (z2) {
            C0(z);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.P;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < b0()) {
                iArr[1] = top - b0();
                ac.b0(v, -iArr[1]);
                t0(3);
            } else if (!this.F) {
                return;
            } else {
                iArr[1] = i2;
                ac.b0(v, -i2);
                t0(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.B;
            if (i4 > i5 && !this.D) {
                iArr[1] = top - i5;
                ac.b0(v, -iArr[1]);
                t0(4);
            } else if (!this.F) {
                return;
            } else {
                iArr[1] = i2;
                ac.b0(v, -i2);
                t0(1);
            }
        }
        Z(v.getTop());
        this.J = i2;
        this.K = true;
    }

    public void q0(int i) {
        this.a = i;
    }

    public void r0(boolean z) {
        this.E = z;
    }

    public void s0(int i) {
        if (i == this.G) {
            return;
        }
        if (this.O == null) {
            if (i == 4 || i == 3 || i == 6 || (this.D && i == 5)) {
                this.G = i;
                return;
            }
            return;
        }
        w0(i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public void t0(int i) {
        V v;
        if (this.G == i) {
            return;
        }
        this.G = i;
        WeakReference<V> weakReference = this.O;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            B0(true);
        } else if (i == 6 || i == 5 || i == 4) {
            B0(false);
        }
        A0(i);
        for (int i2 = 0; i2 < this.Q.size(); i2++) {
            this.Q.get(i2).b(v, i);
        }
        z0();
    }

    public final void u0(View view) {
        boolean z = (Build.VERSION.SDK_INT < 29 || d0() || this.f) ? false : true;
        if (this.n || this.o || this.p || z) {
            ny.a(view, new d(z));
        }
    }

    public void v0(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.B;
        } else if (i == 6) {
            int i4 = this.z;
            if (!this.b || i4 > (i3 = this.y)) {
                i2 = i4;
            } else {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = b0();
        } else if (this.D && i == 5) {
            i2 = this.N;
        } else {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        }
        y0(view, i, i2, false);
    }

    public final void w0(int i) {
        V v = this.O.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && ac.U(v)) {
            v.post(new b(v, i));
        } else {
            v0(v, i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.x(coordinatorLayout, v, savedState.a());
        g0(savedState);
        int i = savedState.d;
        if (i != 1 && i != 2) {
            this.G = i;
        } else {
            this.G = 4;
        }
    }

    public boolean x0(View view, float f2) {
        if (this.E) {
            return true;
        }
        if (view.getTop() < this.B) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.B)) / ((float) U()) > 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    public void y0(View view, int i, int i2, boolean z) {
        kd kdVar = this.H;
        if (kdVar != null && (!z ? !kdVar.O(view, view.getLeft(), i2) : !kdVar.M(view.getLeft(), i2))) {
            t0(2);
            A0(i);
            if (this.v == null) {
                this.v = new h(view, i);
            }
            if (!this.v.c) {
                BottomSheetBehavior<V>.h hVar = this.v;
                hVar.d = i;
                ac.i0(view, hVar);
                this.v.c = true;
                return;
            }
            this.v.d = i;
            return;
        }
        t0(i);
    }

    public final void z0() {
        V v;
        WeakReference<V> weakReference = this.O;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        ac.k0(v, 524288);
        ac.k0(v, 262144);
        ac.k0(v, CommonUtils.BYTES_IN_A_MEGABYTE);
        int i = this.W;
        if (i != -1) {
            ac.k0(v, i);
        }
        if (!this.b && this.G != 6) {
            this.W = R(v, qv.bottomsheet_action_expand_halfway, 6);
        }
        if (this.D && this.G != 5) {
            e0(v, lc.a.l, 5);
        }
        int i2 = this.G;
        if (i2 == 3) {
            e0(v, lc.a.k, this.b ? 4 : 6);
        } else if (i2 == 4) {
            e0(v, lc.a.j, this.b ? 3 : 6);
        } else if (i2 != 6) {
        } else {
            e0(v, lc.a.k, 4);
            e0(v, lc.a.j, 3);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
            this.h = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.d = bottomSheetBehavior.G;
            this.e = bottomSheetBehavior.e;
            this.f = bottomSheetBehavior.b;
            this.g = bottomSheetBehavior.D;
            this.h = bottomSheetBehavior.E;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.a = 0;
        this.b = true;
        this.c = false;
        this.k = -1;
        this.v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList<>();
        this.W = -1;
        this.X = new e();
        this.h = context.getResources().getDimensionPixelSize(kv.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sv.BottomSheetBehavior_Layout);
        this.i = obtainStyledAttributes.hasValue(sv.BottomSheetBehavior_Layout_shapeAppearance);
        int i2 = sv.BottomSheetBehavior_Layout_backgroundTint;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        if (hasValue) {
            X(context, attributeSet, hasValue, ty.a(context, obtainStyledAttributes, i2));
        } else {
            W(context, attributeSet, hasValue);
        }
        Y();
        if (Build.VERSION.SDK_INT >= 21) {
            this.C = obtainStyledAttributes.getDimension(sv.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        int i3 = sv.BottomSheetBehavior_Layout_android_maxWidth;
        if (obtainStyledAttributes.hasValue(i3)) {
            n0(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        }
        int i4 = sv.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i4);
        if (peekValue != null && (i = peekValue.data) == -1) {
            o0(i);
        } else {
            o0(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        m0(obtainStyledAttributes.getBoolean(sv.BottomSheetBehavior_Layout_behavior_hideable, false));
        k0(obtainStyledAttributes.getBoolean(sv.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        j0(obtainStyledAttributes.getBoolean(sv.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        r0(obtainStyledAttributes.getBoolean(sv.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        h0(obtainStyledAttributes.getBoolean(sv.BottomSheetBehavior_Layout_behavior_draggable, true));
        q0(obtainStyledAttributes.getInt(sv.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        l0(obtainStyledAttributes.getFloat(sv.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i5 = sv.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i5);
        if (peekValue2 != null && peekValue2.type == 16) {
            i0(peekValue2.data);
        } else {
            i0(obtainStyledAttributes.getDimensionPixelOffset(i5, 0));
        }
        this.n = obtainStyledAttributes.getBoolean(sv.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.o = obtainStyledAttributes.getBoolean(sv.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.p = obtainStyledAttributes.getBoolean(sv.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.q = obtainStyledAttributes.getBoolean(sv.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        obtainStyledAttributes.recycle();
        this.d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
