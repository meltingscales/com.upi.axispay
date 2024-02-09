package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* compiled from: AxisPay */
/* renamed from: a2  reason: default package */
/* loaded from: classes.dex */
public class a2 extends CheckedTextView {
    public static final int[] c = {16843016};
    public final q2 b;

    public a2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        q2 q2Var = this.b;
        if (q2Var != null) {
            q2Var.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        e2.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(k0.d(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ad.s(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        q2 q2Var = this.b;
        if (q2Var != null) {
            q2Var.q(context, i);
        }
    }

    public a2(Context context, AttributeSet attributeSet, int i) {
        super(l3.b(context), attributeSet, i);
        j3.a(this, getContext());
        q2 q2Var = new q2(this);
        this.b = q2Var;
        q2Var.m(attributeSet, i);
        q2Var.b();
        o3 v = o3.v(getContext(), attributeSet, c, i, 0);
        setCheckMarkDrawable(v.g(0));
        v.w();
    }
}
