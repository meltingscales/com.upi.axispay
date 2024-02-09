package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* compiled from: AxisPay */
/* renamed from: d2  reason: default package */
/* loaded from: classes.dex */
public class d2 extends EditText implements zb, wb {
    private final y1 mBackgroundTintHelper;
    private final bd mDefaultOnReceiveContentListener;
    private final p2 mTextClassifierHelper;
    private final q2 mTextHelper;

    public d2(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y1 y1Var = this.mBackgroundTintHelper;
        if (y1Var != null) {
            y1Var.b();
        }
        q2 q2Var = this.mTextHelper;
        if (q2Var != null) {
            q2Var.b();
        }
    }

    @Override // defpackage.zb
    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.mBackgroundTintHelper;
        if (y1Var != null) {
            return y1Var.c();
        }
        return null;
    }

    @Override // defpackage.zb
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.mBackgroundTintHelper;
        if (y1Var != null) {
            return y1Var.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        p2 p2Var;
        if (Build.VERSION.SDK_INT < 28 && (p2Var = this.mTextClassifierHelper) != null) {
            return p2Var.a();
        }
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, onCreateInputConnection, editorInfo);
        e2.a(onCreateInputConnection, editorInfo, this);
        String[] F = ac.F(this);
        if (onCreateInputConnection == null || F == null) {
            return onCreateInputConnection;
        }
        pc.d(editorInfo, F);
        return qc.a(onCreateInputConnection, editorInfo, m2.a(this));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (m2.b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // defpackage.wb
    public gb onReceiveContent(gb gbVar) {
        return this.mDefaultOnReceiveContentListener.a(this, gbVar);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (m2.c(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y1 y1Var = this.mBackgroundTintHelper;
        if (y1Var != null) {
            y1Var.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y1 y1Var = this.mBackgroundTintHelper;
        if (y1Var != null) {
            y1Var.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ad.s(this, callback));
    }

    @Override // defpackage.zb
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y1 y1Var = this.mBackgroundTintHelper;
        if (y1Var != null) {
            y1Var.i(colorStateList);
        }
    }

    @Override // defpackage.zb
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.mBackgroundTintHelper;
        if (y1Var != null) {
            y1Var.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        q2 q2Var = this.mTextHelper;
        if (q2Var != null) {
            q2Var.q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        p2 p2Var;
        if (Build.VERSION.SDK_INT < 28 && (p2Var = this.mTextClassifierHelper) != null) {
            p2Var.b(textClassifier);
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public d2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public d2(Context context, AttributeSet attributeSet, int i) {
        super(l3.b(context), attributeSet, i);
        j3.a(this, getContext());
        y1 y1Var = new y1(this);
        this.mBackgroundTintHelper = y1Var;
        y1Var.e(attributeSet, i);
        q2 q2Var = new q2(this);
        this.mTextHelper = q2Var;
        q2Var.m(attributeSet, i);
        q2Var.b();
        this.mTextClassifierHelper = new p2(this);
        this.mDefaultOnReceiveContentListener = new bd();
    }
}
