package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.stateful.ExtendableSavedState;
import defpackage.ux;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class FloatingActionButton extends oy implements zb, ed, rx, oz, CoordinatorLayout.b {
    public static final int s = rv.Widget_Design_FloatingActionButton;
    public ColorStateList c;
    public PorterDuff.Mode d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public ColorStateList g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public final Rect n;
    public final Rect o;
    public final g2 p;
    public final sx q;
    public ux r;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements ux.j {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.ux.j
        public void a() {
            this.a.b(FloatingActionButton.this);
        }

        @Override // defpackage.ux.j
        public void b() {
            this.a.a(FloatingActionButton.this);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c implements az {
        public c() {
        }

        @Override // defpackage.az
        public void a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.n.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.k, i2 + FloatingActionButton.this.k, i3 + FloatingActionButton.this.k, i4 + FloatingActionButton.this.k);
        }

        @Override // defpackage.az
        public void b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // defpackage.az
        public boolean c() {
            return FloatingActionButton.this.m;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class d<T extends FloatingActionButton> implements ux.i {
        public final dw<T> a;

        public d(dw<T> dwVar) {
            this.a = dwVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ux.i
        public void a() {
            this.a.a(FloatingActionButton.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ux.i
        public void b() {
            this.a.b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iv.floatingActionButtonStyle);
    }

    private ux getImpl() {
        if (this.r == null) {
            this.r = h();
        }
        return this.r;
    }

    public static int r(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return size;
                }
                throw new IllegalArgumentException();
            }
            return i;
        }
        return Math.min(i, size);
    }

    @Override // defpackage.rx
    public boolean a() {
        return this.q.c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().E(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().d(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void g(dw<? extends FloatingActionButton> dwVar) {
        getImpl().f(new d(dwVar));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.c;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().t();
    }

    public Drawable getContentBackground() {
        return getImpl().k();
    }

    public int getCustomSize() {
        return this.j;
    }

    public int getExpandedComponentIdHint() {
        return this.q.b();
    }

    public aw getHideMotionSpec() {
        return getImpl().p();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.g;
    }

    public lz getShapeAppearanceModel() {
        lz u = getImpl().u();
        db.e(u);
        return u;
    }

    public aw getShowMotionSpec() {
        return getImpl().v();
    }

    public int getSize() {
        return this.i;
    }

    public int getSizeDimension() {
        return k(this.i);
    }

    @Override // defpackage.zb
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // defpackage.zb
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // defpackage.ed
    public ColorStateList getSupportImageTintList() {
        return this.e;
    }

    @Override // defpackage.ed
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f;
    }

    public boolean getUseCompatPadding() {
        return this.m;
    }

    public final ux h() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new vx(this, new c());
        }
        return new ux(this, new c());
    }

    @Deprecated
    public boolean i(Rect rect) {
        if (ac.V(this)) {
            rect.set(0, 0, getWidth(), getHeight());
            p(rect);
            return true;
        }
        return false;
    }

    public void j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        p(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A();
    }

    public final int k(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(kv.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(kv.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return k(1);
        } else {
            return k(0);
        }
    }

    public void l(b bVar) {
        m(bVar, true);
    }

    public void m(b bVar, boolean z) {
        getImpl().w(u(bVar), z);
    }

    public boolean n() {
        return getImpl().y();
    }

    public boolean o() {
        return getImpl().z();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().B();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().D();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.k = (sizeDimension - this.l) / 2;
        getImpl().f0();
        int min = Math.min(r(sizeDimension, i), r(sizeDimension, i2));
        Rect rect = this.n;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.a());
        sx sxVar = this.q;
        Bundle bundle = extendableSavedState.d.get("expandableWidgetHelper");
        db.e(bundle);
        sxVar.d(bundle);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.d.put("expandableWidgetHelper", this.q.e());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && i(this.o) && !this.o.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.n;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void q() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.e;
        if (colorStateList == null) {
            o9.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(c2.e(colorForState, mode));
    }

    public void s(b bVar) {
        t(bVar, true);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.c != colorStateList) {
            this.c = colorStateList;
            getImpl().L(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.d != mode) {
            this.d = mode;
            getImpl().M(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().N(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().Q(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().U(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            if (i != this.j) {
                this.j = i;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().g0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().o()) {
            getImpl().O(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.q.f(i);
    }

    public void setHideMotionSpec(aw awVar) {
        getImpl().P(awVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(aw.c(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().e0();
            if (this.e != null) {
                q();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.p.g(i);
        q();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().I();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().I();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().W(z);
    }

    @Override // defpackage.oz
    public void setShapeAppearanceModel(lz lzVar) {
        getImpl().X(lzVar);
    }

    public void setShowMotionSpec(aw awVar) {
        getImpl().Y(awVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(aw.c(getContext(), i));
    }

    public void setSize(int i) {
        this.j = 0;
        if (i != this.i) {
            this.i = i;
            requestLayout();
        }
    }

    @Override // defpackage.zb
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // defpackage.zb
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // defpackage.ed
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            q();
        }
    }

    @Override // defpackage.ed
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            q();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().J();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.m != z) {
            this.m = z;
            getImpl().C();
        }
    }

    @Override // defpackage.oy, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void t(b bVar, boolean z) {
        getImpl().c0(u(bVar), z);
    }

    public final ux.j u(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;
        public b b;
        public boolean c;

        public BaseBehavior() {
            this.c = true;
        }

        public static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: E */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.n;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final void G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.n;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i2 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                i = rect.right;
            } else {
                i = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                ac.b0(floatingActionButton, i2);
            }
            if (i != 0) {
                ac.a0(floatingActionButton, i);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: H */
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (F(view)) {
                L(view, floatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> r = coordinatorLayout.r(floatingActionButton);
            int size = r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = r.get(i2);
                if (view instanceof AppBarLayout) {
                    if (K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (F(view) && L(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(floatingActionButton, i);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        public final boolean J(View view, FloatingActionButton floatingActionButton) {
            return this.c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (J(appBarLayout, floatingActionButton)) {
                if (this.a == null) {
                    this.a = new Rect();
                }
                Rect rect = this.a;
                zx.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    floatingActionButton.m(this.b, false);
                    return true;
                }
                floatingActionButton.t(this.b, false);
                return true;
            }
            return false;
        }

        public final boolean L(View view, FloatingActionButton floatingActionButton) {
            if (J(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.m(this.b, false);
                    return true;
                }
                floatingActionButton.t(this.b, false);
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

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sv.FloatingActionButton_Behavior_Layout);
            this.c = obtainStyledAttributes.getBoolean(sv.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FloatingActionButton(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            getImpl().V(this.g);
        }
    }
}
