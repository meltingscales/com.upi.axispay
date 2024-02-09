package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.i1;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements i1.b, p1, AdapterView.OnItemClickListener {
    public static final int[] d = {16842964, 16843049};
    public i1 b;
    public int c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    @Override // defpackage.i1.b
    public boolean a(k1 k1Var) {
        return this.b.N(k1Var, 0);
    }

    @Override // defpackage.p1
    public void b(i1 i1Var) {
        this.b = i1Var;
    }

    public int getWindowAnimations() {
        return this.c;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((k1) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        o3 v = o3.v(context, attributeSet, d, i, 0);
        if (v.s(0)) {
            setBackgroundDrawable(v.g(0));
        }
        if (v.s(1)) {
            setDivider(v.g(1));
        }
        v.w();
    }
}
