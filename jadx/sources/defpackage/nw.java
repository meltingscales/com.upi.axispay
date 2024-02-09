package defpackage;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: nw  reason: default package */
/* loaded from: classes.dex */
public class nw extends CardView implements Checkable, oz {
    public static final int[] p = {16842911};
    public static final int[] q = {16842912};
    public static final int[] r = {iv.state_dragged};
    public final ow k;
    public boolean l;
    public boolean m;
    public boolean n;
    public a o;

    /* compiled from: AxisPay */
    /* renamed from: nw$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(nw nwVar, boolean z);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.k.b().getBounds());
        return rectF;
    }

    public final void g() {
        if (Build.VERSION.SDK_INT > 26) {
            this.k.a();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.k.c();
    }

    public ColorStateList getCardForegroundColor() {
        return this.k.d();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.k.e();
    }

    public int getCheckedIconMargin() {
        return this.k.f();
    }

    public int getCheckedIconSize() {
        return this.k.g();
    }

    public ColorStateList getCheckedIconTint() {
        return this.k.h();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.k.p().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.k.p().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.k.p().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.k.p().top;
    }

    public float getProgress() {
        return this.k.j();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.k.i();
    }

    public ColorStateList getRippleColor() {
        return this.k.k();
    }

    public lz getShapeAppearanceModel() {
        return this.k.l();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.k.m();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.k.n();
    }

    public int getStrokeWidth() {
        return this.k.o();
    }

    public boolean h() {
        ow owVar = this.k;
        return owVar != null && owVar.r();
    }

    public boolean i() {
        return this.n;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k.b();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (h()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, p);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, q);
        }
        if (i()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, r);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0059ao.a(14196));
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0059ao.a(14197));
        accessibilityNodeInfo.setCheckable(h());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.k.s(getMeasuredWidth(), getMeasuredHeight());
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.l) {
            if (!this.k.q()) {
                Log.i(C0059ao.a(14198), C0059ao.a(14199));
                this.k.t(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.k.u(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.k.J();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.k.v(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.k.w(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.m != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.k.x(drawable);
    }

    public void setCheckedIconMargin(int i) {
        this.k.y(i);
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.k.y(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(int i) {
        this.k.x(k0.d(getContext(), i));
        throw null;
    }

    public void setCheckedIconSize(int i) {
        this.k.z(i);
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.k.z(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.k.A(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        ow owVar = this.k;
        if (owVar != null) {
            owVar.H();
        }
    }

    public void setDragged(boolean z) {
        if (this.n != z) {
            this.n = z;
            refreshDrawableState();
            g();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.k.K();
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.o = aVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.k.K();
        this.k.I();
    }

    public void setProgress(float f) {
        this.k.C(f);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.k.B(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.k.D(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.k.D(k0.c(getContext(), i));
        throw null;
    }

    @Override // defpackage.oz
    public void setShapeAppearanceModel(lz lzVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(lzVar.u(getBoundsAsRectF()));
        }
        this.k.E(lzVar);
        throw null;
    }

    public void setStrokeColor(int i) {
        this.k.F(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        this.k.G(i);
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.k.K();
        this.k.I();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (h() && isEnabled()) {
            this.m = !this.m;
            refreshDrawableState();
            g();
            a aVar = this.o;
            if (aVar != null) {
                aVar.a(this, this.m);
            }
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.k.u(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.k.F(colorStateList);
    }
}
