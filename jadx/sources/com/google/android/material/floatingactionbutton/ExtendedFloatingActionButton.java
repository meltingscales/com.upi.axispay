package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public boolean A;
    public boolean B;
    public boolean C;
    public int t;
    public final wx u;
    public final wx v;
    public final wx w;
    public final wx x;
    public final int y;
    public final CoordinatorLayout.c<ExtendedFloatingActionButton> z;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ wx b;
        public final /* synthetic */ f c;

        public a(ExtendedFloatingActionButton extendedFloatingActionButton, wx wxVar, f fVar) {
            this.b = wxVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
            this.b.b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.a();
            if (this.a) {
                return;
            }
            this.b.h(this.c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.b.onAnimationStart(animator);
            this.a = false;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class b extends Property<View, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class c extends Property<View, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class d extends Property<View, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(ac.I(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            ac.E0(view, f.intValue(), view.getPaddingTop(), ac.H(view), view.getPaddingBottom());
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class e extends Property<View, Float> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(ac.H(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            ac.E0(view, ac.I(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class f {
    }

    static {
        new b(Float.class, "width");
        new c(Float.class, "height");
        new d(Float.class, "paddingStart");
        new e(Float.class, "paddingEnd");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.z;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i = this.y;
        return i < 0 ? (Math.min(ac.I(this), ac.H(this)) * 2) + getIconSize() : i;
    }

    public aw getExtendMotionSpec() {
        return this.v.e();
    }

    public aw getHideMotionSpec() {
        return this.x.e();
    }

    public aw getShowMotionSpec() {
        return this.w.e();
    }

    public aw getShrinkMotionSpec() {
        return this.u.e();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.A = false;
            this.u.d();
        }
    }

    public final boolean q() {
        return getVisibility() != 0 ? this.t == 2 : this.t != 1;
    }

    public final void r(wx wxVar, f fVar) {
        if (wxVar.i()) {
            return;
        }
        if (!t()) {
            wxVar.d();
            wxVar.h(fVar);
            return;
        }
        measure(0, 0);
        AnimatorSet f2 = wxVar.f();
        f2.addListener(new a(this, wxVar, fVar));
        for (Animator.AnimatorListener animatorListener : wxVar.g()) {
            f2.addListener(animatorListener);
        }
        f2.start();
    }

    public final void s() {
        getTextColors();
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.C = z;
    }

    public void setExtendMotionSpec(aw awVar) {
        this.v.c(awVar);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(aw.c(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.A == z) {
            return;
        }
        wx wxVar = z ? this.v : this.u;
        if (wxVar.i()) {
            return;
        }
        wxVar.d();
    }

    public void setHideMotionSpec(aw awVar) {
        this.x.c(awVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(aw.c(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.A || this.B) {
            return;
        }
        ac.I(this);
        ac.H(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.A) {
            boolean z = this.B;
        }
    }

    public void setShowMotionSpec(aw awVar) {
        this.w.c(awVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(aw.c(getContext(), i));
    }

    public void setShrinkMotionSpec(aw awVar) {
        this.u.c(awVar);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(aw.c(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        s();
    }

    public final boolean t() {
        return (ac.V(this) || (!q() && this.C)) && !isInEditMode();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;
        public f b;
        public f c;
        public boolean d;
        public boolean e;

        public ExtendedFloatingActionButtonBehavior() {
            this.d = false;
            this.e = true;
        }

        public static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.e;
            extendedFloatingActionButton.r(z ? extendedFloatingActionButton.v : extendedFloatingActionButton.w, z ? this.c : this.b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: F */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: H */
        public boolean h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (G(view)) {
                M(view, extendedFloatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> r = coordinatorLayout.r(extendedFloatingActionButton);
            int size = r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = r.get(i2);
                if (view instanceof AppBarLayout) {
                    if (L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(extendedFloatingActionButton, i);
            return true;
        }

        public final boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.d || this.e) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        public void K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.e;
            extendedFloatingActionButton.r(z ? extendedFloatingActionButton.u : extendedFloatingActionButton.x, z ? this.c : this.b);
        }

        public final boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (J(appBarLayout, extendedFloatingActionButton)) {
                if (this.a == null) {
                    this.a = new Rect();
                }
                Rect rect = this.a;
                zx.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    K(extendedFloatingActionButton);
                    return true;
                }
                E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        public final boolean M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (J(view, extendedFloatingActionButton)) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    K(extendedFloatingActionButton);
                    return true;
                }
                E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sv.ExtendedFloatingActionButton_Behavior_Layout);
            this.d = obtainStyledAttributes.getBoolean(sv.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.e = obtainStyledAttributes.getBoolean(sv.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        s();
    }
}
