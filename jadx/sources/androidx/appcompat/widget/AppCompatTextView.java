package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.sa;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements zb, dd, tc {
    private final y1 mBackgroundTintHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<sa> mPrecomputedTextFuture;
    private final p2 mTextClassifierHelper;
    private final q2 mTextHelper;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<sa> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                ad.p(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
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

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (tc.a) {
            return super.getAutoSizeMaxTextSize();
        }
        q2 q2Var = this.mTextHelper;
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
        q2 q2Var = this.mTextHelper;
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
        q2 q2Var = this.mTextHelper;
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
        q2 q2Var = this.mTextHelper;
        return q2Var != null ? q2Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (tc.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        q2 q2Var = this.mTextHelper;
        if (q2Var != null) {
            return q2Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return ad.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return ad.c(this);
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        p2 p2Var;
        if (Build.VERSION.SDK_INT < 28 && (p2Var = this.mTextClassifierHelper) != null) {
            return p2Var.a();
        }
        return super.getTextClassifier();
    }

    public sa.a getTextMetricsParamsCompat() {
        return ad.g(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, onCreateInputConnection, editorInfo);
        e2.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        q2 q2Var = this.mTextHelper;
        if (q2Var != null) {
            q2Var.o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        q2 q2Var = this.mTextHelper;
        if (q2Var == null || tc.a || !q2Var.l()) {
            return;
        }
        this.mTextHelper.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (tc.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        q2 q2Var = this.mTextHelper;
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
        q2 q2Var = this.mTextHelper;
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
        q2 q2Var = this.mTextHelper;
        if (q2Var != null) {
            q2Var.v(i);
        }
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        q2 q2Var = this.mTextHelper;
        if (q2Var != null) {
            q2Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        q2 q2Var = this.mTextHelper;
        if (q2Var != null) {
            q2Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        q2 q2Var = this.mTextHelper;
        if (q2Var != null) {
            q2Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        q2 q2Var = this.mTextHelper;
        if (q2Var != null) {
            q2Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ad.s(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            ad.m(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            ad.n(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        ad.o(this, i);
    }

    public void setPrecomputedText(sa saVar) {
        ad.p(this, saVar);
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

    @Override // defpackage.dd
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.w(colorStateList);
        this.mTextHelper.b();
    }

    @Override // defpackage.dd
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.x(mode);
        this.mTextHelper.b();
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

    public void setTextFuture(Future<sa> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(sa.a aVar) {
        ad.r(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (tc.a) {
            super.setTextSize(i, f);
            return;
        }
        q2 q2Var = this.mTextHelper;
        if (q2Var != null) {
            q2Var.A(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            typeface2 = g9.a(getContext(), typeface, i);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(l3.b(context), attributeSet, i);
        this.mIsSetTypefaceProcessing = false;
        j3.a(this, getContext());
        y1 y1Var = new y1(this);
        this.mBackgroundTintHelper = y1Var;
        y1Var.e(attributeSet, i);
        q2 q2Var = new q2(this);
        this.mTextHelper = q2Var;
        q2Var.m(attributeSet, i);
        q2Var.b();
        this.mTextClassifierHelper = new p2(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? k0.d(context, i) : null, i2 != 0 ? k0.d(context, i2) : null, i3 != 0 ? k0.d(context, i3) : null, i4 != 0 ? k0.d(context, i4) : null);
        q2 q2Var = this.mTextHelper;
        if (q2Var != null) {
            q2Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? k0.d(context, i) : null, i2 != 0 ? k0.d(context, i2) : null, i3 != 0 ? k0.d(context, i3) : null, i4 != 0 ? k0.d(context, i4) : null);
        q2 q2Var = this.mTextHelper;
        if (q2Var != null) {
            q2Var.p();
        }
    }
}
