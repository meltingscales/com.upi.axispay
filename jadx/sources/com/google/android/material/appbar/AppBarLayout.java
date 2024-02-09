package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import defpackage.lc;
import defpackage.oc;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public static final int s = rv.Widget_Design_AppBarLayout;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public ic h;
    public List<c> i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public WeakReference<View> o;
    public ValueAnimator p;
    public int[] q;
    public Drawable r;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends fw {
        public ScrollingViewBehavior() {
        }

        public static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c f = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).M();
            }
            return 0;
        }

        @Override // defpackage.fw
        public float J(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (R / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // defpackage.fw
        public int L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.L(view);
        }

        @Override // defpackage.fw
        /* renamed from: Q */
        public AppBarLayout H(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final void S(View view, View view2) {
            CoordinatorLayout.c f = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f instanceof BaseBehavior) {
                ac.b0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).k) + M()) - I(view2));
            }
        }

        public final void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.j()) {
                    appBarLayout.q(appBarLayout.s(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                ac.k0(coordinatorLayout, lc.a.h.b());
                ac.k0(coordinatorLayout, lc.a.i.b());
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout H = H(coordinatorLayout.r(view));
            if (H != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    H.n(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sv.ScrollingViewBehavior_Layout);
            O(obtainStyledAttributes.getDimensionPixelSize(sv.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements ub {
        public a() {
        }

        @Override // defpackage.ub
        public ic a(View view, ic icVar) {
            AppBarLayout.this.l(icVar);
            return icVar;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ hz a;

        public b(AppBarLayout appBarLayout, hz hzVar) {
            this.a = hzVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.W(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface c<T extends AppBarLayout> {
        void a(T t, int i);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iv.appBarLayoutStyle);
    }

    public final void a() {
        WeakReference<View> weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    public final View b(View view) {
        int i;
        if (this.o == null && (i = this.n) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.n);
            }
            if (findViewById != null) {
                this.o = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.o;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: c */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: d */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (r()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.b);
            this.r.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.r;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new d((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d(layoutParams);
    }

    public boolean f() {
        return this.f;
    }

    public final boolean g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((d) getChildAt(i).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int D;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.a;
            if ((i4 & 5) == 5) {
                int i5 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if ((i4 & 8) != 0) {
                    D = ac.D(childAt);
                } else if ((i4 & 2) != 0) {
                    D = measuredHeight - ac.D(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && ac.z(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + D;
                if (childCount == 0) {
                    i = Math.min(i, measuredHeight - getTopInset());
                }
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.d = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
            int i4 = dVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= ac.D(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.e = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.n;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int D = ac.D(this);
        if (D == 0) {
            int childCount = getChildCount();
            D = childCount >= 1 ? ac.D(getChildAt(childCount - 1)) : 0;
            if (D == 0) {
                return getHeight() / 3;
            }
        }
        return (D * 2) + topInset;
    }

    public int getPendingAction() {
        return this.g;
    }

    public Drawable getStatusBarForeground() {
        return this.r;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        ic icVar = this.h;
        if (icVar != null) {
            return icVar.l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
            if (i2 == 0 && ac.z(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= ac.D(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.c = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public boolean h() {
        return getTotalScrollRange() != 0;
    }

    public final void i() {
        this.c = -1;
        this.d = -1;
        this.e = -1;
    }

    public boolean j() {
        return this.m;
    }

    public void k(int i) {
        this.b = i;
        if (!willNotDraw()) {
            ac.h0(this);
        }
        List<c> list = this.i;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                c cVar = this.i.get(i2);
                if (cVar != null) {
                    cVar.a(this, i);
                }
            }
        }
    }

    public ic l(ic icVar) {
        ic icVar2 = ac.z(this) ? icVar : null;
        if (!ya.a(this.h, icVar2)) {
            this.h = icVar2;
            v();
            requestLayout();
        }
        return icVar;
    }

    public void m() {
        this.g = 0;
    }

    public void n(boolean z, boolean z2) {
        o(z, z2, true);
    }

    public final void o(boolean z, boolean z2, boolean z3) {
        this.g = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        iz.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.q == null) {
            this.q = new int[4];
        }
        int[] iArr = this.q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.k;
        int i2 = iv.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.l) ? iv.state_lifted : -iv.state_lifted;
        int i3 = iv.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.l) ? iv.state_collapsed : -iv.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (ac.z(this) && t()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ac.b0(getChildAt(childCount), topInset);
            }
        }
        i();
        this.f = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((d) getChildAt(i5).getLayoutParams()).b() != null) {
                this.f = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.j) {
            return;
        }
        if (!this.m && !g()) {
            z2 = false;
        }
        p(z2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && ac.z(this) && t()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = y9.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        i();
    }

    public final boolean p(boolean z) {
        if (this.k != z) {
            this.k = z;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    public boolean q(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
            if (this.m && (getBackground() instanceof hz)) {
                u((hz) getBackground(), z);
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean r() {
        return this.r != null && getTopInset() > 0;
    }

    public boolean s(View view) {
        View b2 = b(view);
        if (b2 != null) {
            view = b2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        iz.d(this, f);
    }

    public void setExpanded(boolean z) {
        n(z, ac.V(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.m = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.n = i;
        a();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.r = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.r.setState(getDrawableState());
                }
                o9.m(this.r, ac.C(this));
                this.r.setVisible(getVisibility() == 0, false);
                this.r.setCallback(this);
            }
            v();
            ac.h0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(k0.d(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            iw.b(this, f);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public final boolean t() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            return (childAt.getVisibility() == 8 || ac.z(childAt)) ? false : true;
        }
        return false;
    }

    public final void u(hz hzVar, boolean z) {
        float dimension = getResources().getDimension(kv.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
        this.p = ofFloat;
        ofFloat.setDuration(getResources().getInteger(nv.app_bar_elevation_anim_duration));
        this.p.setInterpolator(tv.a);
        this.p.addUpdateListener(new b(this, hzVar));
        this.p.start();
    }

    public final void v() {
        setWillNotDraw(!r());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r;
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends ew<T> {
        public int k;
        public int l;
        public ValueAnimator m;
        public int n;
        public boolean o;
        public float p;
        public WeakReference<View> q;
        public d r;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ CoordinatorLayout a;
            public final /* synthetic */ AppBarLayout b;

            public a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.a = coordinatorLayout;
                this.b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.a, this.b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class b implements oc {
            public final /* synthetic */ CoordinatorLayout a;
            public final /* synthetic */ AppBarLayout b;
            public final /* synthetic */ View c;
            public final /* synthetic */ int d;

            public b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.a = coordinatorLayout;
                this.b = appBarLayout;
                this.c = view;
                this.d = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.oc
            public boolean a(View view, oc.a aVar) {
                BaseBehavior.this.q(this.a, this.b, this.c, 0, this.d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class c implements oc {
            public final /* synthetic */ AppBarLayout a;
            public final /* synthetic */ boolean b;

            public c(BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
                this.a = appBarLayout;
                this.b = z;
            }

            @Override // defpackage.oc
            public boolean a(View view, oc.a aVar) {
                this.a.setExpanded(this.b);
                return true;
            }
        }

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static abstract class d<T extends AppBarLayout> {
            public abstract boolean a(T t);
        }

        public BaseBehavior() {
            this.n = -1;
        }

        public static boolean Y(int i, int i2) {
            return (i & i2) == i2;
        }

        public static View a0(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // defpackage.ew
        public int M() {
            return E() + this.k;
        }

        public final void S(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (M() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                T(coordinatorLayout, t, lc.a.h, false);
            }
            if (M() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i = -t.getDownNestedPreScrollRange();
                    if (i != 0) {
                        ac.m0(coordinatorLayout, lc.a.i, null, new b(coordinatorLayout, t, view, i));
                        return;
                    }
                    return;
                }
                T(coordinatorLayout, t, lc.a.i, true);
            }
        }

        public final void T(CoordinatorLayout coordinatorLayout, T t, lc.a aVar, boolean z) {
            ac.m0(coordinatorLayout, aVar, null, new c(this, t, z));
        }

        public final void U(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int height;
            int abs = Math.abs(M() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            }
            V(coordinatorLayout, t, i, height);
        }

        public final void V(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int M = M();
            if (M == i) {
                ValueAnimator valueAnimator = this.m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.m = valueAnimator3;
                valueAnimator3.setInterpolator(tv.e);
                this.m.addUpdateListener(new a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.m.setDuration(Math.min(i2, 600));
            this.m.setIntValues(M, i);
            this.m.start();
        }

        @Override // defpackage.ew
        /* renamed from: W */
        public boolean H(T t) {
            d dVar = this.r;
            if (dVar != null) {
                return dVar.a(t);
            }
            WeakReference<View> weakReference = this.q;
            if (weakReference != null) {
                View view = weakReference.get();
                return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
            }
            return true;
        }

        public final boolean X(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.h() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        public final View Z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof ob) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final int b0(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (Y(dVar.a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // defpackage.ew
        /* renamed from: c0 */
        public int K(T t) {
            return -t.getDownNestedScrollRange();
        }

        @Override // defpackage.ew
        /* renamed from: d0 */
        public int L(T t) {
            return t.getTotalScrollRange();
        }

        public final int e0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator b2 = dVar.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b2 != null) {
                    int a2 = dVar.a();
                    if ((a2 & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((a2 & 2) != 0) {
                            i2 -= ac.D(childAt);
                        }
                    }
                    if (ac.z(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b2.getInterpolation((abs - childAt.getTop()) / f)));
                    }
                }
            }
            return i;
        }

        @Override // defpackage.ew
        /* renamed from: f0 */
        public void N(CoordinatorLayout coordinatorLayout, T t) {
            q0(coordinatorLayout, t);
            if (t.j()) {
                t.q(t.s(Z(coordinatorLayout)));
            }
        }

        @Override // defpackage.gw, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: g0 */
        public boolean l(CoordinatorLayout coordinatorLayout, T t, int i) {
            int round;
            boolean l = super.l(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.n;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                int i3 = -childAt.getBottom();
                if (this.o) {
                    round = ac.D(childAt) + t.getTopInset();
                } else {
                    round = Math.round(childAt.getHeight() * this.p);
                }
                P(coordinatorLayout, t, i3 + round);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        U(coordinatorLayout, t, i4, 0.0f);
                    } else {
                        P(coordinatorLayout, t, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        U(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.m();
            this.n = -1;
            G(y9.b(E(), -t.getTotalScrollRange(), 0));
            s0(coordinatorLayout, t, E(), 0, true);
            t.k(E());
            r0(coordinatorLayout, t);
            return l;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: h0 */
        public boolean m(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t.getLayoutParams())).height == -2) {
                coordinatorLayout.J(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.m(coordinatorLayout, t, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: i0 */
        public void q(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -t.getTotalScrollRange();
                    i5 = t.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                int i6 = i4;
                int i7 = i5;
                if (i6 != i7) {
                    iArr[1] = O(coordinatorLayout, t, i2, i6, i7);
                }
            }
            if (t.j()) {
                t.q(t.s(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: j0 */
        public void t(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = O(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                r0(coordinatorLayout, t);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: k0 */
        public void x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.x(coordinatorLayout, t, savedState.a());
                this.n = savedState.d;
                this.p = savedState.e;
                this.o = savedState.f;
                return;
            }
            super.x(coordinatorLayout, t, parcelable);
            this.n = -1;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: l0 */
        public Parcelable y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable y = super.y(coordinatorLayout, t);
            int E = E();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(y);
                    savedState.d = i;
                    savedState.f = bottom == ac.D(childAt) + t.getTopInset();
                    savedState.e = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return y;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: m0 */
        public boolean A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.j() || X(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.m) != null) {
                valueAnimator.cancel();
            }
            this.q = null;
            this.l = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: n0 */
        public void C(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.l == 0 || i == 1) {
                q0(coordinatorLayout, t);
                if (t.j()) {
                    t.q(t.s(view));
                }
            }
            this.q = new WeakReference<>(view);
        }

        @Override // defpackage.ew
        /* renamed from: o0 */
        public int Q(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int M = M();
            int i4 = 0;
            if (i2 != 0 && M >= i2 && M <= i3) {
                int b2 = y9.b(i, i2, i3);
                if (M != b2) {
                    int e0 = t.f() ? e0(t, b2) : b2;
                    boolean G = G(e0);
                    i4 = M - b2;
                    this.k = b2 - e0;
                    if (!G && t.f()) {
                        coordinatorLayout.f(t);
                    }
                    t.k(E());
                    s0(coordinatorLayout, t, b2, b2 < M ? -1 : 1, false);
                }
            } else {
                this.k = 0;
            }
            r0(coordinatorLayout, t);
            return i4;
        }

        public final boolean p0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> s = coordinatorLayout.s(t);
            int size = s.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.c f = ((CoordinatorLayout.f) s.get(i).getLayoutParams()).f();
                if (f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f).K() != 0;
                }
            }
            return false;
        }

        public final void q0(CoordinatorLayout coordinatorLayout, T t) {
            int M = M();
            int b0 = b0(t, M);
            if (b0 >= 0) {
                View childAt = t.getChildAt(b0);
                d dVar = (d) childAt.getLayoutParams();
                int a2 = dVar.a();
                if ((a2 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b0 == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (Y(a2, 2)) {
                        i2 += ac.D(childAt);
                    } else if (Y(a2, 5)) {
                        int D = ac.D(childAt) + i2;
                        if (M < D) {
                            i = D;
                        } else {
                            i2 = D;
                        }
                    }
                    if (Y(a2, 32)) {
                        i += ((LinearLayout.LayoutParams) dVar).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    if (M < (i2 + i) / 2) {
                        i = i2;
                    }
                    U(coordinatorLayout, t, y9.b(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void r0(CoordinatorLayout coordinatorLayout, T t) {
            ac.k0(coordinatorLayout, lc.a.h.b());
            ac.k0(coordinatorLayout, lc.a.i.b());
            View Z = Z(coordinatorLayout);
            if (Z == null || t.getTotalScrollRange() == 0 || !(((CoordinatorLayout.f) Z.getLayoutParams()).f() instanceof ScrollingViewBehavior)) {
                return;
            }
            S(coordinatorLayout, t, Z);
        }

        public final void s0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View a0 = a0(t, i);
            if (a0 != null) {
                int a2 = ((d) a0.getLayoutParams()).a();
                boolean z2 = false;
                if ((a2 & 1) != 0) {
                    int D = ac.D(a0);
                    if (i2 <= 0 || (a2 & 12) == 0 ? !((a2 & 2) == 0 || (-i) < (a0.getBottom() - D) - t.getTopInset()) : (-i) >= (a0.getBottom() - D) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.j()) {
                    z2 = t.s(Z(coordinatorLayout));
                }
                boolean q = t.q(z2);
                if (z || (q && p0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.n = -1;
        }

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();
            public int d;
            public float e;
            public boolean f;

            /* compiled from: AxisPay */
            /* loaded from: classes.dex */
            public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
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
                this.e = parcel.readFloat();
                this.f = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.d);
                parcel.writeFloat(this.e);
                parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppBarLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.s
            android.content.Context r11 = defpackage.f00.c(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = -1
            r10.c = r11
            r10.d = r11
            r10.e = r11
            r6 = 0
            r10.g = r6
            android.content.Context r7 = r10.getContext()
            r0 = 1
            r10.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 21
            if (r8 < r9) goto L27
            defpackage.iw.a(r10)
            defpackage.iw.c(r10, r12, r13, r4)
        L27:
            int[] r2 = defpackage.sv.AppBarLayout
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = defpackage.ly.h(r0, r1, r2, r3, r4, r5)
            int r13 = defpackage.sv.AppBarLayout_android_background
            android.graphics.drawable.Drawable r13 = r12.getDrawable(r13)
            defpackage.ac.u0(r10, r13)
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            boolean r13 = r13 instanceof android.graphics.drawable.ColorDrawable
            if (r13 == 0) goto L5f
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            android.graphics.drawable.ColorDrawable r13 = (android.graphics.drawable.ColorDrawable) r13
            hz r0 = new hz
            r0.<init>()
            int r13 = r13.getColor()
            android.content.res.ColorStateList r13 = android.content.res.ColorStateList.valueOf(r13)
            r0.X(r13)
            r0.M(r7)
            defpackage.ac.u0(r10, r0)
        L5f:
            int r13 = defpackage.sv.AppBarLayout_expanded
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L6e
            boolean r13 = r12.getBoolean(r13, r6)
            r10.o(r13, r6, r6)
        L6e:
            if (r8 < r9) goto L80
            int r13 = defpackage.sv.AppBarLayout_elevation
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L80
            int r13 = r12.getDimensionPixelSize(r13, r6)
            float r13 = (float) r13
            defpackage.iw.b(r10, r13)
        L80:
            r13 = 26
            if (r8 < r13) goto La2
            int r13 = defpackage.sv.AppBarLayout_android_keyboardNavigationCluster
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L93
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setKeyboardNavigationCluster(r13)
        L93:
            int r13 = defpackage.sv.AppBarLayout_android_touchscreenBlocksFocus
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto La2
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setTouchscreenBlocksFocus(r13)
        La2:
            int r13 = defpackage.sv.AppBarLayout_liftOnScroll
            boolean r13 = r12.getBoolean(r13, r6)
            r10.m = r13
            int r13 = defpackage.sv.AppBarLayout_liftOnScrollTargetViewId
            int r11 = r12.getResourceId(r13, r11)
            r10.n = r11
            int r11 = defpackage.sv.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarForeground(r11)
            r12.recycle()
            com.google.android.material.appbar.AppBarLayout$a r11 = new com.google.android.material.appbar.AppBarLayout$a
            r11.<init>()
            defpackage.ac.D0(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class d extends LinearLayout.LayoutParams {
        public int a;
        public Interpolator b;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sv.AppBarLayout_Layout);
            this.a = obtainStyledAttributes.getInt(sv.AppBarLayout_Layout_layout_scrollFlags, 0);
            int i = sv.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i)) {
                this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public int a() {
            return this.a;
        }

        public Interpolator b() {
            return this.b;
        }

        public boolean c() {
            int i = this.a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public d(int i, int i2) {
            super(i, i2);
            this.a = 1;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }
    }
}
