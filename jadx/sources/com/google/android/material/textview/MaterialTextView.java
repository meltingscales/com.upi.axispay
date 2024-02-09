package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public static boolean f(Context context) {
        return sy.b(context, iv.textAppearanceLineHeightEnabled, true);
    }

    public static int g(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, sv.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(sv.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int h(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = ty.c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    public static boolean i(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, sv.MaterialTextView, i, i2);
        int h = h(context, obtainStyledAttributes, sv.MaterialTextView_android_lineHeight, sv.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        return h != -1;
    }

    public final void c(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, sv.MaterialTextAppearance);
        int h = h(getContext(), obtainStyledAttributes, sv.MaterialTextAppearance_android_lineHeight, sv.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (h >= 0) {
            setLineHeight(h);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (f(context)) {
            c(context.getTheme(), i);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(f00.c(context, attributeSet, i, i2), attributeSet, i);
        int g;
        Context context2 = getContext();
        if (f(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (i(context2, theme, attributeSet, i, i2) || (g = g(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            c(theme, g);
        }
    }
}
