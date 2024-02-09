package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* compiled from: AxisPay */
/* renamed from: z1  reason: default package */
/* loaded from: classes.dex */
public class z1 extends CheckBox implements cd, zb {
    public final b2 b;
    public final y1 c;
    public final q2 d;

    public z1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.checkboxStyle);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y1 y1Var = this.c;
        if (y1Var != null) {
            y1Var.b();
        }
        q2 q2Var = this.d;
        if (q2Var != null) {
            q2Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        b2 b2Var = this.b;
        return b2Var != null ? b2Var.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // defpackage.zb
    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.c;
        if (y1Var != null) {
            return y1Var.c();
        }
        return null;
    }

    @Override // defpackage.zb
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.c;
        if (y1Var != null) {
            return y1Var.d();
        }
        return null;
    }

    @Override // defpackage.cd
    public ColorStateList getSupportButtonTintList() {
        b2 b2Var = this.b;
        if (b2Var != null) {
            return b2Var.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        b2 b2Var = this.b;
        if (b2Var != null) {
            return b2Var.d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y1 y1Var = this.c;
        if (y1Var != null) {
            y1Var.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y1 y1Var = this.c;
        if (y1Var != null) {
            y1Var.g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        b2 b2Var = this.b;
        if (b2Var != null) {
            b2Var.f();
        }
    }

    @Override // defpackage.zb
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y1 y1Var = this.c;
        if (y1Var != null) {
            y1Var.i(colorStateList);
        }
    }

    @Override // defpackage.zb
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.c;
        if (y1Var != null) {
            y1Var.j(mode);
        }
    }

    @Override // defpackage.cd
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        b2 b2Var = this.b;
        if (b2Var != null) {
            b2Var.g(colorStateList);
        }
    }

    @Override // defpackage.cd
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        b2 b2Var = this.b;
        if (b2Var != null) {
            b2Var.h(mode);
        }
    }

    public z1(Context context, AttributeSet attributeSet, int i) {
        super(l3.b(context), attributeSet, i);
        j3.a(this, getContext());
        b2 b2Var = new b2(this);
        this.b = b2Var;
        b2Var.e(attributeSet, i);
        y1 y1Var = new y1(this);
        this.c = y1Var;
        y1Var.e(attributeSet, i);
        q2 q2Var = new q2(this);
        this.d = q2Var;
        q2Var.m(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(k0.d(getContext(), i));
    }
}
