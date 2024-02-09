package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements rz {
    public TextView b;
    public Button c;
    public int d;
    public int e;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sv.SnackbarLayout);
        this.d = obtainStyledAttributes.getDimensionPixelSize(sv.SnackbarLayout_android_maxWidth, -1);
        this.e = obtainStyledAttributes.getDimensionPixelSize(sv.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    public static void d(View view, int i, int i2) {
        if (ac.X(view)) {
            ac.E0(view, ac.I(view), i, ac.H(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    @Override // defpackage.rz
    public void a(int i, int i2) {
        this.b.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.c.getVisibility() == 0) {
            this.c.setAlpha(0.0f);
            this.c.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    @Override // defpackage.rz
    public void b(int i, int i2) {
        this.b.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.b.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.c.getVisibility() == 0) {
            this.c.setAlpha(1.0f);
            this.c.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public void c(float f) {
        if (f != 1.0f) {
            this.c.setTextColor(ww.f(ww.c(this, iv.colorSurface), this.c.getCurrentTextColor(), f));
        }
    }

    public final boolean e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.b.getPaddingTop() == i2 && this.b.getPaddingBottom() == i3) {
            return z;
        }
        d(this.b, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.c;
    }

    public TextView getMessageView() {
        return this.b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = (TextView) findViewById(mv.snackbar_text);
        this.c = (Button) findViewById(mv.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (e(1, r0, r0 - r1) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (e(0, r0, r0) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        r3 = true;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.d
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.d
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = defpackage.kv.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = defpackage.kv.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.b
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = r4
            goto L3d
        L3c:
            r2 = r3
        L3d:
            if (r2 == 0) goto L56
            int r5 = r7.e
            if (r5 <= 0) goto L56
            android.widget.Button r5 = r7.c
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.e
            if (r5 <= r6) goto L56
            int r1 = r0 - r1
            boolean r0 = r7.e(r4, r0, r1)
            if (r0 == 0) goto L61
            goto L60
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r7.e(r3, r0, r0)
            if (r0 == 0) goto L61
        L60:
            r3 = r4
        L61:
            if (r3 == 0) goto L66
            super.onMeasure(r8, r9)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.e = i;
    }
}
