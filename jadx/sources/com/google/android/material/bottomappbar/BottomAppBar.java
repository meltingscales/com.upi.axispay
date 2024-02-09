package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public final int Q;
    public final hz R;
    public Animator S;
    public Animator T;
    public int U;
    public int V;
    public boolean W;
    public int a0;
    public ArrayList<g> b0;
    public int c0;
    public boolean d0;
    public boolean e0;
    public Behavior f0;
    public int g0;
    public int h0;
    public int i0;
    public AnimatorListenerAdapter j0;
    public dw<FloatingActionButton> k0;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int d;
        public boolean e;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
            this.e = parcel.readInt() != 0;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.l0();
            BottomAppBar.this.S = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m0();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b extends FloatingActionButton.b {
        public final /* synthetic */ int a;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class a extends FloatingActionButton.b {
            public a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.l0();
            }
        }

        public b(int i) {
            this.a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.q0(this.a));
            floatingActionButton.s(new a());
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.l0();
            BottomAppBar.this.d0 = false;
            BottomAppBar.this.T = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m0();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ ActionMenuView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;

        public d(ActionMenuView actionMenuView, int i, boolean z) {
            this.b = actionMenuView;
            this.c = i;
            this.d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            boolean z = BottomAppBar.this.c0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.u0(bottomAppBar.c0);
            BottomAppBar.this.A0(this.b, this.c, this.d, z);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        public final /* synthetic */ ActionMenuView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;

        public e(ActionMenuView actionMenuView, int i, boolean z) {
            this.b = actionMenuView;
            this.c = i;
            this.d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.b;
            actionMenuView.setTranslationX(BottomAppBar.this.p0(actionMenuView, this.c, this.d));
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.j0.onAnimationStart(animator);
            FloatingActionButton n0 = BottomAppBar.this.n0();
            if (n0 != null) {
                n0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.g0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return q0(this.U);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.i0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.h0;
    }

    private kw getTopEdgeTreatment() {
        return (kw) this.R.C().p();
    }

    public final void A0(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        e eVar = new e(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    public final void g0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.j0);
        floatingActionButton.f(new f());
        floatingActionButton.g(this.k0);
    }

    public ColorStateList getBackgroundTint() {
        return this.R.E();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().c();
    }

    public int getFabAlignmentMode() {
        return this.U;
    }

    public int getFabAnimationMode() {
        return this.V;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f();
    }

    public boolean getHideOnScroll() {
        return this.W;
    }

    public final void h0() {
        Animator animator = this.T;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.S;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public void i0(int i, List<Animator> list) {
        FloatingActionButton n0 = n0();
        if (n0 == null || n0.n()) {
            return;
        }
        m0();
        n0.l(new b(i));
    }

    public final void j0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n0(), "translationX", q0(i));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    public final void k0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - p0(actionMenuView, i, z)) > 1.0f) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.addListener(new d(actionMenuView, i, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        } else if (actionMenuView.getAlpha() < 1.0f) {
            list.add(ofFloat);
        }
    }

    public final void l0() {
        ArrayList<g> arrayList;
        int i = this.a0 - 1;
        this.a0 = i;
        if (i != 0 || (arrayList = this.b0) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public final void m0() {
        ArrayList<g> arrayList;
        int i = this.a0;
        this.a0 = i + 1;
        if (i != 0 || (arrayList = this.b0) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public final FloatingActionButton n0() {
        View o0 = o0();
        if (o0 instanceof FloatingActionButton) {
            return (FloatingActionButton) o0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View o0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.s(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.o0():android.view.View");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        iz.f(this, this.R);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            h0();
            w0();
        }
        v0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.U = savedState.d;
        this.e0 = savedState.e;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.d = this.U;
        savedState.e = this.e0;
        return savedState;
    }

    public int p0(ActionMenuView actionMenuView, int i, boolean z) {
        if (i == 1 && z) {
            boolean d2 = ny.d(this);
            int measuredWidth = d2 ? getMeasuredWidth() : 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                    if (d2) {
                        measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    } else {
                        measuredWidth = Math.max(measuredWidth, childAt.getRight());
                    }
                }
            }
            return measuredWidth - ((d2 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (d2 ? this.h0 : -this.i0));
        }
        return 0;
    }

    public final float q0(int i) {
        boolean d2 = ny.d(this);
        if (i == 1) {
            return ((getMeasuredWidth() / 2) - (this.Q + (d2 ? this.i0 : this.h0))) * (d2 ? -1 : 1);
        }
        return 0.0f;
    }

    public final boolean r0() {
        FloatingActionButton n0 = n0();
        return n0 != null && n0.o();
    }

    public final void s0(int i, boolean z) {
        if (!ac.V(this)) {
            u0(this.c0);
            return;
        }
        Animator animator = this.T;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!r0()) {
            i = 0;
            z = false;
        }
        k0(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.T = animatorSet;
        animatorSet.addListener(new c());
        this.T.start();
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        o9.o(this.R, colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().h(f2);
            this.R.invalidateSelf();
            w0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        this.R.W(f2);
        getBehavior().G(this, this.R.B() - this.R.A());
    }

    public void setFabAlignmentMode(int i) {
        x0(i, 0);
    }

    public void setFabAnimationMode(int i) {
        this.V = i;
    }

    public void setFabCornerSize(float f2) {
        if (f2 != getTopEdgeTreatment().d()) {
            getTopEdgeTreatment().i(f2);
            this.R.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().j(f2);
            this.R.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().k(f2);
            this.R.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.W = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final void t0(int i) {
        if (this.U == i || !ac.V(this)) {
            return;
        }
        Animator animator = this.S;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.V == 1) {
            j0(i, arrayList);
        } else {
            i0(i, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.S = animatorSet;
        animatorSet.addListener(new a());
        this.S.start();
    }

    public void u0(int i) {
        if (i != 0) {
            this.c0 = 0;
            getMenu().clear();
            x(i);
        }
    }

    public final void v0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.T != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (!r0()) {
            z0(actionMenuView, 0, false);
        } else {
            z0(actionMenuView, this.U, this.e0);
        }
    }

    public final void w0() {
        getTopEdgeTreatment().m(getFabTranslationX());
        View o0 = o0();
        this.R.Y((this.e0 && r0()) ? 1.0f : 0.0f);
        if (o0 != null) {
            o0.setTranslationY(getFabTranslationY());
            o0.setTranslationX(getFabTranslationX());
        }
    }

    public void x0(int i, int i2) {
        this.c0 = i2;
        s0(i, this.e0);
        t0(i);
        this.U = i;
    }

    public boolean y0(int i) {
        float f2 = i;
        if (f2 != getTopEdgeTreatment().g()) {
            getTopEdgeTreatment().l(f2);
            this.R.invalidateSelf();
            return true;
        }
        return false;
    }

    public final void z0(ActionMenuView actionMenuView, int i, boolean z) {
        A0(actionMenuView, i, z, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f0 == null) {
            this.f0 = new Behavior();
        }
        return this.f0;
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect e;
        public WeakReference<BottomAppBar> f;
        public int g;
        public final View.OnLayoutChangeListener h;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.j(Behavior.this.e);
                    int height = Behavior.this.e.height();
                    bottomAppBar.y0(height);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.e)));
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                    if (Behavior.this.g == 0) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(kv.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                        if (ny.d(floatingActionButton)) {
                            ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.Q;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.Q;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.h = new a();
            this.e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f = new WeakReference<>(bottomAppBar);
            View o0 = bottomAppBar.o0();
            if (o0 != null && !ac.V(o0)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) o0.getLayoutParams();
                fVar.d = 49;
                this.g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (o0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) o0;
                    floatingActionButton.addOnLayoutChangeListener(this.h);
                    bottomAppBar.g0(floatingActionButton);
                }
                bottomAppBar.w0();
            }
            coordinatorLayout.I(bottomAppBar, i);
            return super.l(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: N */
        public boolean A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.A(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.h = new a();
            this.e = new Rect();
        }
    }
}
