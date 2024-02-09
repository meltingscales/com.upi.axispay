package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: AxisPay */
/* renamed from: s2  reason: default package */
/* loaded from: classes.dex */
public class s2 extends ToggleButton implements zb {
    public final y1 b;
    public final q2 c;

    public s2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
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

    @Override // android.widget.ToggleButton, android.view.View
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

    public s2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j3.a(this, getContext());
        y1 y1Var = new y1(this);
        this.b = y1Var;
        y1Var.e(attributeSet, i);
        q2 q2Var = new q2(this);
        this.c = q2Var;
        q2Var.m(attributeSet, i);
    }
}
