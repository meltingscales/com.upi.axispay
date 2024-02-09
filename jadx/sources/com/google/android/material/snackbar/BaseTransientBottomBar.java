package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.sz;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final Handler t;
    public static final boolean u;
    public static final int[] v;
    public static final String w;
    public final ViewGroup a;
    public final Context b;
    public final v c;
    public final rz d;
    public int e;
    public boolean f;
    public View g;
    public Rect j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public List<r<B>> p;
    public Behavior q;
    public final AccessibilityManager r;
    public boolean h = false;
    public final Runnable i = new k();
    public sz.b s = new n();

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {
        public final s k = new s(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean E(View view) {
            return this.k.a(view);
        }

        public final void P(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.k.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v vVar = BaseTransientBottomBar.this.c;
            if (vVar == null) {
                return;
            }
            if (vVar.getParent() != null) {
                BaseTransientBottomBar.this.c.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.c.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.Q();
            } else {
                BaseTransientBottomBar.this.S();
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.I();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ int a;

        public c(int i) {
            this.a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.H(this.a);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.c.setScaleX(floatValue);
            BaseTransientBottomBar.this.c.setScaleY(floatValue);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.I();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.d.a(70, 180);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        public int a;
        public final /* synthetic */ int b;

        public g(int i) {
            this.b = i;
            this.a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.u) {
                ac.b0(BaseTransientBottomBar.this.c, intValue - this.a);
            } else {
                BaseTransientBottomBar.this.c.setTranslationY(intValue);
            }
            this.a = intValue;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {
        public final /* synthetic */ int a;

        public h(int i) {
            this.a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.H(this.a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.d.b(0, 180);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        public int a = 0;

        public i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.u) {
                ac.b0(BaseTransientBottomBar.this.c, intValue - this.a);
            } else {
                BaseTransientBottomBar.this.c.setTranslationY(intValue);
            }
            this.a = intValue;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class j implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).O();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).E(message.arg1);
                return true;
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int y;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.c == null || baseTransientBottomBar.b == null || (y = (BaseTransientBottomBar.this.y() - BaseTransientBottomBar.this.C()) + ((int) BaseTransientBottomBar.this.c.getTranslationY())) >= BaseTransientBottomBar.this.n) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.c.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.w, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.n - y;
            BaseTransientBottomBar.this.c.requestLayout();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class l implements ub {
        public l() {
        }

        @Override // defpackage.ub
        public ic a(View view, ic icVar) {
            BaseTransientBottomBar.this.k = icVar.i();
            BaseTransientBottomBar.this.l = icVar.j();
            BaseTransientBottomBar.this.m = icVar.k();
            BaseTransientBottomBar.this.U();
            return icVar;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class m extends eb {
        public m() {
        }

        @Override // defpackage.eb
        public void g(View view, lc lcVar) {
            super.g(view, lcVar);
            lcVar.a(CommonUtils.BYTES_IN_A_MEGABYTE);
            lcVar.f0(true);
        }

        @Override // defpackage.eb
        public boolean j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                BaseTransientBottomBar.this.s();
                return true;
            }
            return super.j(view, i, bundle);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class n implements sz.b {
        public n() {
        }

        @Override // defpackage.sz.b
        public void a() {
            Handler handler = BaseTransientBottomBar.t;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // defpackage.sz.b
        public void b(int i) {
            Handler handler = BaseTransientBottomBar.t;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class o implements t {

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BaseTransientBottomBar.this.H(3);
            }
        }

        public o() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t
        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = BaseTransientBottomBar.this.c.getRootWindowInsets()) == null) {
                return;
            }
            BaseTransientBottomBar.this.n = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            BaseTransientBottomBar.this.U();
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t
        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.F()) {
                BaseTransientBottomBar.t.post(new a());
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class p implements u {
        public p() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.u
        public void a(View view, int i, int i2, int i3, int i4) {
            BaseTransientBottomBar.this.c.setOnLayoutChangeListener(null);
            BaseTransientBottomBar.this.P();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class q implements SwipeDismissBehavior.c {
        public q() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.t(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i) {
            if (i == 0) {
                sz.c().k(BaseTransientBottomBar.this.s);
            } else if (i == 1 || i == 2) {
                sz.c().j(BaseTransientBottomBar.this.s);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class r<B> {
        public void a(B b, int i) {
        }

        public void b(B b) {
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class s {
        public sz.b a;

        public s(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.J(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof v;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    sz.c().j(this.a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                sz.c().k(this.a);
            }
        }

        public void c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.a = baseTransientBottomBar.s;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface t {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface u {
        void a(View view, int i, int i2, int i3, int i4);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class v extends FrameLayout {
        public static final View.OnTouchListener i = new a();
        public u b;
        public t c;
        public int d;
        public final float e;
        public final float f;
        public ColorStateList g;
        public PorterDuff.Mode h;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public v(Context context, AttributeSet attributeSet) {
            super(f00.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, sv.SnackbarLayout);
            int i2 = sv.SnackbarLayout_elevation;
            if (obtainStyledAttributes.hasValue(i2)) {
                ac.y0(this, obtainStyledAttributes.getDimensionPixelSize(i2, 0));
            }
            this.d = obtainStyledAttributes.getInt(sv.SnackbarLayout_animationMode, 0);
            this.e = obtainStyledAttributes.getFloat(sv.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(ty.a(context2, obtainStyledAttributes, sv.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(ny.e(obtainStyledAttributes.getInt(sv.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f = obtainStyledAttributes.getFloat(sv.SnackbarLayout_actionTextColorAlpha, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(i);
            setFocusable(true);
            if (getBackground() == null) {
                ac.u0(this, a());
            }
        }

        public final Drawable a() {
            float dimension = getResources().getDimension(kv.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(ww.g(this, iv.colorSurface, iv.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.g != null) {
                Drawable r = o9.r(gradientDrawable);
                o9.o(r, this.g);
                return r;
            }
            return o9.r(gradientDrawable);
        }

        public float getActionTextColorAlpha() {
            return this.f;
        }

        public int getAnimationMode() {
            return this.d;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.e;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            t tVar = this.c;
            if (tVar != null) {
                tVar.onViewAttachedToWindow(this);
            }
            ac.n0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            t tVar = this.c;
            if (tVar != null) {
                tVar.onViewDetachedFromWindow(this);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            u uVar = this.b;
            if (uVar != null) {
                uVar.a(this, i2, i3, i4, i5);
            }
        }

        public void setAnimationMode(int i2) {
            this.d = i2;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.g != null) {
                drawable = o9.r(drawable.mutate());
                o9.o(drawable, this.g);
                o9.p(drawable, this.h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.g = colorStateList;
            if (getBackground() != null) {
                Drawable r = o9.r(getBackground().mutate());
                o9.o(r, colorStateList);
                o9.p(r, this.h);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.h = mode;
            if (getBackground() != null) {
                Drawable r = o9.r(getBackground().mutate());
                o9.p(r, mode);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        public void setOnAttachStateChangeListener(t tVar) {
            this.c = tVar;
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : i);
            super.setOnClickListener(onClickListener);
        }

        public void setOnLayoutChangeListener(u uVar) {
            this.b = uVar;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        u = i2 >= 16 && i2 <= 19;
        v = new int[]{iv.snackbarStyle};
        w = BaseTransientBottomBar.class.getSimpleName();
        t = new Handler(Looper.getMainLooper(), new j());
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, rz rzVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (rzVar != null) {
            this.a = viewGroup;
            this.d = rzVar;
            this.b = context;
            ly.a(context);
            v vVar = (v) LayoutInflater.from(context).inflate(z(), viewGroup, false);
            this.c = vVar;
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout) view).c(vVar.getActionTextColorAlpha());
            }
            vVar.addView(view);
            ViewGroup.LayoutParams layoutParams = vVar.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            ac.s0(vVar, 1);
            ac.B0(vVar, 1);
            ac.z0(vVar, true);
            ac.D0(vVar, new l());
            ac.q0(vVar, new m());
            this.r = (AccessibilityManager) context.getSystemService("accessibility");
            return;
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
    }

    public final int A() {
        int height = this.c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public View B() {
        return this.c;
    }

    public final int C() {
        int[] iArr = new int[2];
        this.c.getLocationOnScreen(iArr);
        return iArr[1] + this.c.getHeight();
    }

    public boolean D() {
        TypedArray obtainStyledAttributes = this.b.obtainStyledAttributes(v);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public final void E(int i2) {
        if (L() && this.c.getVisibility() == 0) {
            q(i2);
        } else {
            H(i2);
        }
    }

    public boolean F() {
        return sz.c().e(this.s);
    }

    public final boolean G() {
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    public void H(int i2) {
        sz.c().h(this.s);
        List<r<B>> list = this.p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.p.get(size).a(this, i2);
            }
        }
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
    }

    public void I() {
        sz.c().i(this.s);
        List<r<B>> list = this.p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.p.get(size).b(this);
            }
        }
    }

    public B J(int i2) {
        this.e = i2;
        return this;
    }

    public final void K(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.q;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = w();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).P(this);
        }
        swipeDismissBehavior.K(new q());
        fVar.o(swipeDismissBehavior);
        if (this.g == null) {
            fVar.g = 80;
        }
    }

    public boolean L() {
        AccessibilityManager accessibilityManager = this.r;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final boolean M() {
        return this.n > 0 && !this.f && G();
    }

    public void N() {
        sz.c().m(v(), this.s);
    }

    public final void O() {
        this.c.setOnAttachStateChangeListener(new o());
        if (this.c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                K((CoordinatorLayout.f) layoutParams);
            }
            this.o = r();
            U();
            this.c.setVisibility(4);
            this.a.addView(this.c);
        }
        if (ac.V(this.c)) {
            P();
        } else {
            this.c.setOnLayoutChangeListener(new p());
        }
    }

    public final void P() {
        if (L()) {
            p();
            return;
        }
        if (this.c.getParent() != null) {
            this.c.setVisibility(0);
        }
        I();
    }

    public final void Q() {
        ValueAnimator u2 = u(0.0f, 1.0f);
        ValueAnimator x = x(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(u2, x);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new b());
        animatorSet.start();
    }

    public final void R(int i2) {
        ValueAnimator u2 = u(1.0f, 0.0f);
        u2.setDuration(75L);
        u2.addListener(new c(i2));
        u2.start();
    }

    public final void S() {
        int A = A();
        if (u) {
            ac.b0(this.c, A);
        } else {
            this.c.setTranslationY(A);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(A, 0);
        valueAnimator.setInterpolator(tv.b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new f());
        valueAnimator.addUpdateListener(new g(A));
        valueAnimator.start();
    }

    public final void T(int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, A());
        valueAnimator.setInterpolator(tv.b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new h(i2));
        valueAnimator.addUpdateListener(new i());
        valueAnimator.start();
    }

    public final void U() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (rect = this.j) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = rect.bottom + (this.g != null ? this.o : this.k);
            marginLayoutParams.leftMargin = rect.left + this.l;
            marginLayoutParams.rightMargin = rect.right + this.m;
            this.c.requestLayout();
            if (Build.VERSION.SDK_INT < 29 || !M()) {
                return;
            }
            this.c.removeCallbacks(this.i);
            this.c.post(this.i);
            return;
        }
        Log.w(w, "Unable to update margins because layout params are not MarginLayoutParams");
    }

    public void p() {
        this.c.post(new a());
    }

    public final void q(int i2) {
        if (this.c.getAnimationMode() == 1) {
            R(i2);
        } else {
            T(i2);
        }
    }

    public final int r() {
        View view = this.g;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        this.a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.a.getHeight()) - i2;
    }

    public void s() {
        t(3);
    }

    public void t(int i2) {
        sz.c().b(this.s, i2);
    }

    public final ValueAnimator u(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(tv.a);
        ofFloat.addUpdateListener(new d());
        return ofFloat;
    }

    public int v() {
        return this.e;
    }

    public SwipeDismissBehavior<? extends View> w() {
        return new Behavior();
    }

    public final ValueAnimator x(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(tv.d);
        ofFloat.addUpdateListener(new e());
        return ofFloat;
    }

    public final int y() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.b.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public int z() {
        return D() ? ov.mtrl_layout_snackbar : ov.design_layout_snackbar;
    }
}
