package com.upi.axispay.custom;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SimpleDividerItemDecoration extends RecyclerView.o {
    private Drawable mDivider;

    public SimpleDividerItemDecoration(Drawable drawable) {
        this.mDivider = drawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        if (childCount == 0) {
            return;
        }
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) childAt.getLayoutParams())).rightMargin;
            this.mDivider.setBounds(right, paddingTop, this.mDivider.getIntrinsicHeight() + right, height);
            this.mDivider.draw(canvas);
        }
    }
}
