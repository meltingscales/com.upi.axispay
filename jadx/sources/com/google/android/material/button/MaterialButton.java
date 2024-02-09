package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, oz {
    public static final int[] q = {16842911};
    public static final int[] r = {16842912};
    public static final int s = rv.Widget_MaterialComponents_Button;
    public final lw d;
    public final LinkedHashSet<a> e;
    public b f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public int p;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean d;

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

        public final void c(Parcel parcel) {
            this.d = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            c(parcel);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iv.materialButtonStyle);
    }

    private String getA11yClassName() {
        return (b() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public void a(a aVar) {
        this.e.add(aVar);
    }

    public boolean b() {
        lw lwVar = this.d;
        return lwVar != null && lwVar.p();
    }

    public final boolean c() {
        int i = this.p;
        return i == 3 || i == 4;
    }

    public final boolean d() {
        int i = this.p;
        return i == 1 || i == 2;
    }

    public final boolean e() {
        int i = this.p;
        return i == 16 || i == 32;
    }

    public final boolean f() {
        return ac.C(this) == 1;
    }

    public final boolean g() {
        lw lwVar = this.d;
        return (lwVar == null || lwVar.o()) ? false : true;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (g()) {
            return this.d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.p;
    }

    public int getIconPadding() {
        return this.m;
    }

    public int getIconSize() {
        return this.j;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public int getInsetBottom() {
        return this.d.c();
    }

    public int getInsetTop() {
        return this.d.d();
    }

    public ColorStateList getRippleColor() {
        if (g()) {
            return this.d.h();
        }
        return null;
    }

    public lz getShapeAppearanceModel() {
        if (g()) {
            return this.d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (g()) {
            return this.d.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (g()) {
            return this.d.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, defpackage.zb
    public ColorStateList getSupportBackgroundTintList() {
        if (g()) {
            return this.d.l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, defpackage.zb
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (g()) {
            return this.d.m();
        }
        return super.getSupportBackgroundTintMode();
    }

    public void h(a aVar) {
        this.e.remove(aVar);
    }

    public final void i() {
        if (d()) {
            ad.l(this, this.i, null, null, null);
        } else if (c()) {
            ad.l(this, null, null, this.i, null);
        } else if (e()) {
            ad.l(this, null, this.i, null, null);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.n;
    }

    public final void j(boolean z) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable mutate = o9.r(drawable).mutate();
            this.i = mutate;
            o9.o(mutate, this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                o9.p(this.i, mode);
            }
            int i = this.j;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.j;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.k;
            int i4 = this.l;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
        }
        if (z) {
            i();
            return;
        }
        Drawable[] a2 = ad.a(this);
        boolean z2 = false;
        Drawable drawable3 = a2[0];
        Drawable drawable4 = a2[1];
        Drawable drawable5 = a2[2];
        if ((d() && drawable3 != this.i) || ((c() && drawable5 != this.i) || (e() && drawable4 != this.i))) {
            z2 = true;
        }
        if (z2) {
            i();
        }
    }

    public final void k(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        if (!d() && !c()) {
            if (e()) {
                this.k = 0;
                if (this.p == 16) {
                    this.l = 0;
                    j(false);
                    return;
                }
                int i3 = this.j;
                if (i3 == 0) {
                    i3 = this.i.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i3) - this.m) - getPaddingBottom()) / 2;
                if (this.l != textHeight) {
                    this.l = textHeight;
                    j(false);
                    return;
                }
                return;
            }
            return;
        }
        this.l = 0;
        int i4 = this.p;
        if (i4 != 1 && i4 != 3) {
            int i5 = this.j;
            if (i5 == 0) {
                i5 = this.i.getIntrinsicWidth();
            }
            int textWidth = (((((i - getTextWidth()) - ac.H(this)) - i5) - this.m) - ac.I(this)) / 2;
            if (f() != (this.p == 4)) {
                textWidth = -textWidth;
            }
            if (this.k != textWidth) {
                this.k = textWidth;
                j(false);
                return;
            }
            return;
        }
        this.k = 0;
        j(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            iz.f(this, this.d.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (b()) {
            Button.mergeDrawableStates(onCreateDrawableState, q);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, r);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        lw lwVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || (lwVar = this.d) == null) {
            return;
        }
        lwVar.H(i4 - i2, i3 - i);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.d);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.d = this.n;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        k(i, i2);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        k(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (g()) {
            this.d.r(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (g()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.d.s();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? k0.d(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (g()) {
            this.d.t(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (b() && isEnabled() && this.n != z) {
            this.n = z;
            refreshDrawableState();
            if (this.o) {
                return;
            }
            this.o = true;
            Iterator<a> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.n);
            }
            this.o = false;
        }
    }

    public void setCornerRadius(int i) {
        if (g()) {
            this.d.u(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (g()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (g()) {
            this.d.f().W(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            j(true);
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.p != i) {
            this.p = i;
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.m != i) {
            this.m = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? k0.d(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.j != i) {
                this.j = i;
                j(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            j(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            j(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(k0.c(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.d.v(i);
    }

    public void setInsetTop(int i) {
        this.d.w(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (g()) {
            this.d.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (g()) {
            setRippleColor(k0.c(getContext(), i));
        }
    }

    @Override // defpackage.oz
    public void setShapeAppearanceModel(lz lzVar) {
        if (g()) {
            this.d.y(lzVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (g()) {
            this.d.z(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (g()) {
            this.d.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (g()) {
            setStrokeColor(k0.c(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (g()) {
            this.d.B(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (g()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, defpackage.zb
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (g()) {
            this.d.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, defpackage.zb
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (g()) {
            this.d.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.n);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.s
            android.content.Context r9 = defpackage.f00.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.e = r9
            r9 = 0
            r8.n = r9
            r8.o = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = defpackage.sv.MaterialButton
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = defpackage.ly.h(r0, r1, r2, r3, r4, r5)
            int r1 = defpackage.sv.MaterialButton_iconPadding
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.m = r1
            int r1 = defpackage.sv.MaterialButton_iconTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = defpackage.ny.e(r1, r2)
            r8.g = r1
            android.content.Context r1 = r8.getContext()
            int r2 = defpackage.sv.MaterialButton_iconTint
            android.content.res.ColorStateList r1 = defpackage.ty.a(r1, r0, r2)
            r8.h = r1
            android.content.Context r1 = r8.getContext()
            int r2 = defpackage.sv.MaterialButton_icon
            android.graphics.drawable.Drawable r1 = defpackage.ty.d(r1, r0, r2)
            r8.i = r1
            int r1 = defpackage.sv.MaterialButton_iconGravity
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.p = r1
            int r1 = defpackage.sv.MaterialButton_iconSize
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.j = r1
            lz$b r10 = defpackage.lz.e(r7, r10, r11, r6)
            lz r10 = r10.m()
            lw r11 = new lw
            r11.<init>(r8, r10)
            r8.d = r11
            r11.q(r0)
            r0.recycle()
            int r10 = r8.m
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.i
            if (r10 == 0) goto L84
            r9 = r2
        L84:
            r8.j(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
