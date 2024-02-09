package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.lc;
import defpackage.qw;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Chip extends z1 implements qw.a, oz {
    public static final int u = rv.Widget_MaterialComponents_Chip_Action;
    public static final Rect v = new Rect();
    public static final int[] w = {16842913};
    public static final int[] x = {16842911};
    public qw e;
    public InsetDrawable f;
    public RippleDrawable g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public final c q;
    public final Rect r;
    public final RectF s;
    public final wy t;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a extends wy {
        public a() {
        }

        @Override // defpackage.wy
        public void a(int i) {
        }

        @Override // defpackage.wy
        public void b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.e.L2() ? Chip.this.e.h1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.e != null) {
                Chip.this.e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c extends id {
        public c(Chip chip) {
            super(chip);
        }

        @Override // defpackage.id
        public int B(float f, float f2) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // defpackage.id
        public void C(List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.h != null) {
                list.add(1);
            }
        }

        @Override // defpackage.id
        public boolean J(int i, int i2, Bundle bundle) {
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    return Chip.this.t();
                }
                return false;
            }
            return false;
        }

        @Override // defpackage.id
        public void M(lc lcVar) {
            lcVar.Y(Chip.this.r());
            lcVar.b0(Chip.this.isClickable());
            if (!Chip.this.r() && !Chip.this.isClickable()) {
                lcVar.a0("android.view.View");
            } else {
                lcVar.a0(Chip.this.r() ? "android.widget.CompoundButton" : "android.widget.Button");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                lcVar.A0(text);
            } else {
                lcVar.e0(text);
            }
        }

        @Override // defpackage.id
        public void N(int i, lc lcVar) {
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    lcVar.e0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = qv.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                    lcVar.e0(context.getString(i2, objArr).trim());
                }
                lcVar.W(Chip.this.getCloseIconTouchBoundsInt());
                lcVar.b(lc.a.g);
                lcVar.g0(Chip.this.isEnabled());
                return;
            }
            lcVar.e0("");
            lcVar.W(Chip.v);
        }

        @Override // defpackage.id
        public void O(int i, boolean z) {
            if (i == 1) {
                Chip.this.m = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iv.chipStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.s.setEmpty();
        if (n() && this.h != null) {
            this.e.Y0(this.s);
        }
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.r.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.r;
    }

    private uy getTextAppearance() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.i1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.k != z) {
            this.k = z;
            refreshDrawableState();
        }
    }

    public final void A() {
        qw qwVar;
        if (TextUtils.isEmpty(getText()) || (qwVar = this.e) == null) {
            return;
        }
        int J0 = (int) (qwVar.J0() + this.e.j1() + this.e.q0());
        int O0 = (int) (this.e.O0() + this.e.k1() + this.e.m0());
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            O0 += rect.left;
            J0 += rect.right;
        }
        ac.E0(this, O0, getPaddingTop(), J0, getPaddingBottom());
    }

    public final void B() {
        TextPaint paint = getPaint();
        qw qwVar = this.e;
        if (qwVar != null) {
            paint.drawableState = qwVar.getState();
        }
        uy textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.j(getContext(), paint, this.t);
        }
    }

    public final void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                        if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                Log.w("Chip", "Chip text must be vertically center and start aligned");
                                return;
                            }
                            return;
                        }
                        throw new UnsupportedOperationException("Chip does not support multi-line text");
                    }
                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    @Override // defpackage.qw.a
    public void a() {
        k(this.p);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m(motionEvent) || this.q.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.q.w(keyEvent) || this.q.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // defpackage.z1, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        qw qwVar = this.e;
        if ((qwVar == null || !qwVar.p1()) ? false : this.e.l2(j())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.F0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.G0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.H0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return Math.max(0.0f, qwVar.I0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.J0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.K0();
        }
        return null;
    }

    public float getChipIconSize() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.L0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.M0();
        }
        return null;
    }

    public float getChipMinHeight() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.N0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.O0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.P0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.Q0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.R0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.S0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.T0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.U0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.V0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.X0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.b1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.q.A() != 1 && this.q.x() != 1) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public aw getHideMotionSpec() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.c1();
        }
        return null;
    }

    public float getIconEndPadding() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.d1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.e1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.f1();
        }
        return null;
    }

    public lz getShapeAppearanceModel() {
        return this.e.C();
    }

    public aw getShowMotionSpec() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.g1();
        }
        return null;
    }

    public float getTextEndPadding() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.j1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        qw qwVar = this.e;
        if (qwVar != null) {
            return qwVar.k1();
        }
        return 0.0f;
    }

    public final void i(qw qwVar) {
        qwVar.p2(this);
    }

    public final int[] j() {
        int i = 0;
        int i2 = isEnabled() ? 1 : 0;
        if (this.m) {
            i2++;
        }
        if (this.l) {
            i2++;
        }
        if (this.k) {
            i2++;
        }
        if (isChecked()) {
            i2++;
        }
        int[] iArr = new int[i2];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.m) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.l) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.k) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    public boolean k(int i) {
        this.p = i;
        if (!v()) {
            if (this.f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int max = Math.max(0, i - this.e.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                y();
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (getMinHeight() != i) {
                setMinHeight(i);
            }
            if (getMinWidth() != i) {
                setMinWidth(i);
            }
        } else {
            setMinHeight(i);
            setMinWidth(i);
        }
        q(i2, i3, i2, i3);
        y();
        return true;
    }

    public final void l() {
        if (getBackgroundDrawable() == this.f && this.e.getCallback() == null) {
            this.e.setCallback(this.f);
        }
    }

    @SuppressLint({"PrivateApi"})
    public final boolean m(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = id.class.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.q)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = id.class.getDeclaredMethod("V", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.q, Integer.valueOf((int) RecyclerView.UNDEFINED_DURATION));
                    return true;
                }
            } catch (IllegalAccessException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            } catch (NoSuchFieldException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (NoSuchMethodException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (InvocationTargetException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            }
        }
        return false;
    }

    public final boolean n() {
        qw qwVar = this.e;
        return (qwVar == null || qwVar.R0() == null) ? false : true;
    }

    public final void o(Context context, AttributeSet attributeSet, int i) {
        TypedArray h = ly.h(context, attributeSet, sv.Chip, i, u, new int[0]);
        this.n = h.getBoolean(sv.Chip_ensureMinTouchTargetSize, false);
        this.p = (int) Math.ceil(h.getDimension(sv.Chip_chipMinTouchTargetSize, (float) Math.ceil(ny.b(getContext(), 48))));
        h.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        iz.f(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, w);
        }
        if (r()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, x);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.q.I(z, i, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!r() && !isClickable()) {
            accessibilityNodeInfo.setClassName("android.view.View");
        } else {
            accessibilityNodeInfo.setClassName(r() ? "android.widget.CompoundButton" : "android.widget.Button");
        }
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            lc.E0(accessibilityNodeInfo).d0(lc.c.a(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.o(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.o != i) {
            this.o = i;
            A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L17;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.k
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.k
            if (r0 == 0) goto L34
            r5.t()
            r0 = r3
            goto L35
        L34:
            r0 = r2
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = r3
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = r3
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b());
        }
    }

    public final void q(int i, int i2, int i3, int i4) {
        this.f = new InsetDrawable((Drawable) this.e, i, i2, i3, i4);
    }

    public boolean r() {
        qw qwVar = this.e;
        return qwVar != null && qwVar.o1();
    }

    public boolean s() {
        qw qwVar = this.e;
        return qwVar != null && qwVar.q1();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.g) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.z1, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.g) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // defpackage.z1, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.x1(z);
        }
    }

    public void setCheckableResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.y1(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        qw qwVar = this.e;
        if (qwVar == null) {
            this.j = z;
        } else if (qwVar.o1()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked == z || (onCheckedChangeListener = this.i) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.z1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.A1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.B1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.C1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.D1(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.F1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.G1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.H1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.I1(i);
        }
    }

    public void setChipDrawable(qw qwVar) {
        qw qwVar2 = this.e;
        if (qwVar2 != qwVar) {
            w(qwVar2);
            this.e = qwVar;
            qwVar.A2(false);
            i(this.e);
            k(this.p);
        }
    }

    public void setChipEndPadding(float f) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.J1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.K1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.L1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.M1(i);
        }
    }

    public void setChipIconSize(float f) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.N1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.O1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.P1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.Q1(i);
        }
    }

    public void setChipIconVisible(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.R1(i);
        }
    }

    public void setChipMinHeight(float f) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.T1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.U1(i);
        }
    }

    public void setChipStartPadding(float f) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.V1(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.W1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.X1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.Y1(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.Z1(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.a2(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.c2(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.d2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.e2(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.f2(i);
        }
    }

    public void setCloseIconResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.g2(i);
        }
        x();
    }

    public void setCloseIconSize(float f) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.h2(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.i2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.j2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.k2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.m2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.n2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.W(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            qw qwVar = this.e;
            if (qwVar != null) {
                qwVar.q2(truncateAt);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.n = z;
        k(this.p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(aw awVar) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.r2(awVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.s2(i);
        }
    }

    public void setIconEndPadding(float f) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.t2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.u2(i);
        }
    }

    public void setIconStartPadding(float f) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.v2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.w2(i);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.e != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.x2(i);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.y2(colorStateList);
        }
        if (this.e.m1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.z2(i);
            if (this.e.m1()) {
                return;
            }
            z();
        }
    }

    @Override // defpackage.oz
    public void setShapeAppearanceModel(lz lzVar) {
        this.e.setShapeAppearanceModel(lzVar);
    }

    public void setShowMotionSpec(aw awVar) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.B2(awVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.C2(i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        qw qwVar = this.e;
        if (qwVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(qwVar.L2() ? null : charSequence, bufferType);
        qw qwVar2 = this.e;
        if (qwVar2 != null) {
            qwVar2.D2(charSequence);
        }
    }

    public void setTextAppearance(uy uyVar) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.E2(uyVar);
        }
        B();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.G2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.H2(i);
        }
    }

    public void setTextStartPadding(float f) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.I2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.J2(i);
        }
    }

    public boolean t() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.q.U(1, 1);
        return z;
    }

    public final void u() {
        if (this.f != null) {
            this.f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    public boolean v() {
        return this.n;
    }

    public final void w(qw qwVar) {
        if (qwVar != null) {
            qwVar.p2(null);
        }
    }

    public final void x() {
        if (n() && s() && this.h != null) {
            ac.q0(this, this.q);
        } else {
            ac.q0(this, null);
        }
    }

    public final void y() {
        if (yy.a) {
            z();
            return;
        }
        this.e.K2(true);
        ac.u0(this, getBackgroundDrawable());
        A();
        l();
    }

    public final void z() {
        this.g = new RippleDrawable(yy.d(this.e.f1()), getBackgroundDrawable(), null);
        this.e.K2(false);
        ac.u0(this, this.g);
        A();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.chip.Chip.u
            android.content.Context r8 = defpackage.f00.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.r = r8
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r7.s = r8
            com.google.android.material.chip.Chip$a r8 = new com.google.android.material.chip.Chip$a
            r8.<init>()
            r7.t = r8
            android.content.Context r8 = r7.getContext()
            r7.C(r9)
            qw r6 = defpackage.qw.v0(r8, r9, r10, r4)
            r7.o(r8, r9, r10)
            r7.setChipDrawable(r6)
            float r0 = defpackage.ac.w(r7)
            r6.W(r0)
            int[] r2 = defpackage.sv.Chip
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = defpackage.ly.h(r0, r1, r2, r3, r4, r5)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r10 >= r0) goto L51
            int r10 = defpackage.sv.Chip_android_textColor
            android.content.res.ColorStateList r8 = defpackage.ty.a(r8, r9, r10)
            r7.setTextColor(r8)
        L51:
            int r8 = defpackage.sv.Chip_shapeAppearance
            boolean r8 = r9.hasValue(r8)
            r9.recycle()
            com.google.android.material.chip.Chip$c r9 = new com.google.android.material.chip.Chip$c
            r9.<init>(r7)
            r7.q = r9
            r7.x()
            if (r8 != 0) goto L69
            r7.p()
        L69:
            boolean r8 = r7.j
            r7.setChecked(r8)
            java.lang.CharSequence r8 = r6.h1()
            r7.setText(r8)
            android.text.TextUtils$TruncateAt r8 = r6.b1()
            r7.setEllipsize(r8)
            r7.B()
            qw r8 = r7.e
            boolean r8 = r8.L2()
            if (r8 != 0) goto L8e
            r8 = 1
            r7.setLines(r8)
            r7.setHorizontallyScrolling(r8)
        L8e:
            r8 = 8388627(0x800013, float:1.175497E-38)
            r7.setGravity(r8)
            r7.A()
            boolean r8 = r7.v()
            if (r8 == 0) goto La2
            int r8 = r7.p
            r7.setMinHeight(r8)
        La2:
            int r8 = defpackage.ac.C(r7)
            r7.o = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.o2(z);
        }
        x();
    }

    public void setCheckedIconVisible(boolean z) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.E1(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.S1(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.F2(i);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        qw qwVar = this.e;
        if (qwVar != null) {
            qwVar.F2(i);
        }
        B();
    }
}
