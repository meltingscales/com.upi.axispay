package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AppCompatButton extends Button implements zb, tc, dd {
    public final y1 b;
    public final q2 c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.buttonStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y1 y1Var = this.b;
        if (y1Var != null) {
            y1Var.b();
        }
        q2 q2Var = this.c;
        if (q2Var != null) {
            q2Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (tc.a) {
            return super.getAutoSizeMaxTextSize();
        }
        q2 q2Var = this.c;
        if (q2Var != null) {
            return q2Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (tc.a) {
            return super.getAutoSizeMinTextSize();
        }
        q2 q2Var = this.c;
        if (q2Var != null) {
            return q2Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (tc.a) {
            return super.getAutoSizeStepGranularity();
        }
        q2 q2Var = this.c;
        if (q2Var != null) {
            return q2Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (tc.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        q2 q2Var = this.c;
        return q2Var != null ? q2Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (tc.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        q2 q2Var = this.c;
        if (q2Var != null) {
            return q2Var.i();
        }
        return 0;
    }

    @Override // defpackage.zb
    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.b;
        if (y1Var != null) {
            return y1Var.c();
        }
        return null;
    }

    @Override // defpackage.zb
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.b;
        if (y1Var != null) {
            return y1Var.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        q2 q2Var = this.c;
        if (q2Var != null) {
            q2Var.o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        q2 q2Var = this.c;
        if (q2Var == null || tc.a || !q2Var.l()) {
            return;
        }
        this.c.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (tc.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        q2 q2Var = this.c;
        if (q2Var != null) {
            q2Var.t(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (tc.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        q2 q2Var = this.c;
        if (q2Var != null) {
            q2Var.u(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (tc.a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        q2 q2Var = this.c;
        if (q2Var != null) {
            q2Var.v(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y1 y1Var = this.b;
        if (y1Var != null) {
            y1Var.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y1 y1Var = this.b;
        if (y1Var != null) {
            y1Var.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ad.s(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        q2 q2Var = this.c;
        if (q2Var != null) {
            q2Var.s(z);
        }
    }

    @Override // defpackage.zb
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y1 y1Var = this.b;
        if (y1Var != null) {
            y1Var.i(colorStateList);
        }
    }

    @Override // defpackage.zb
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.b;
        if (y1Var != null) {
            y1Var.j(mode);
        }
    }

    @Override // defpackage.dd
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.c.w(colorStateList);
        this.c.b();
    }

    @Override // defpackage.dd
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.c.x(mode);
        this.c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        q2 q2Var = this.c;
        if (q2Var != null) {
            q2Var.q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (tc.a) {
            super.setTextSize(i, f);
            return;
        }
        q2 q2Var = this.c;
        if (q2Var != null) {
            q2Var.A(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(l3.b(context), attributeSet, i);
        j3.a(this, getContext());
        y1 y1Var = new y1(this);
        this.b = y1Var;
        y1Var.e(attributeSet, i);
        q2 q2Var = new q2(this);
        this.c = q2Var;
        q2Var.m(attributeSet, i);
        q2Var.b();
    }
}
