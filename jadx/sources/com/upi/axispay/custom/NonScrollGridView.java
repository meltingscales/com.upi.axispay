package com.upi.axispay.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class NonScrollGridView extends GridView {
    public NonScrollGridView(Context context) {
        super(context);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (getLayoutParams().height == -2) {
            i2 = View.MeasureSpec.makeMeasureSpec(536870911, RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i, i2);
    }

    public NonScrollGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NonScrollGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
