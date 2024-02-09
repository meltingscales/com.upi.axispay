package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends d0 {
    @Override // defpackage.d0
    public x1 b(Context context, AttributeSet attributeSet) {
        return new c00(context, attributeSet);
    }

    @Override // defpackage.d0
    public AppCompatButton c(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.d0
    public z1 d(Context context, AttributeSet attributeSet) {
        return new pw(context, attributeSet);
    }

    @Override // defpackage.d0
    public k2 j(Context context, AttributeSet attributeSet) {
        return new qy(context, attributeSet);
    }

    @Override // defpackage.d0
    public AppCompatTextView n(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
