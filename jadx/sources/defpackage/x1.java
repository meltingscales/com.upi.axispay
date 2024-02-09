package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: AxisPay */
/* renamed from: x1  reason: default package */
/* loaded from: classes.dex */
public class x1 extends AutoCompleteTextView implements zb {
    public static final int[] d = {16843126};
    public final y1 b;
    public final q2 c;

    public x1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.autoCompleteTextViewStyle);
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        e2.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(k0.d(getContext(), i));
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        q2 q2Var = this.c;
        if (q2Var != null) {
            q2Var.q(context, i);
        }
    }

    public x1(Context context, AttributeSet attributeSet, int i) {
        super(l3.b(context), attributeSet, i);
        j3.a(this, getContext());
        o3 v = o3.v(getContext(), attributeSet, d, i, 0);
        if (v.s(0)) {
            setDropDownBackgroundDrawable(v.g(0));
        }
        v.w();
        y1 y1Var = new y1(this);
        this.b = y1Var;
        y1Var.e(attributeSet, i);
        q2 q2Var = new q2(this);
        this.c = q2Var;
        q2Var.m(attributeSet, i);
        q2Var.b();
    }
}
