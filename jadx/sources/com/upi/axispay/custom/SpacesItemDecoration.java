package com.upi.axispay.custom;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SpacesItemDecoration extends RecyclerView.o {
    private int space;

    public SpacesItemDecoration(int i) {
        this.space = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int i = this.space;
        rect.left = i;
        rect.right = i;
        rect.bottom = i;
        if (recyclerView.getChildLayoutPosition(view) == 0) {
            rect.top = this.space;
        }
    }
}
