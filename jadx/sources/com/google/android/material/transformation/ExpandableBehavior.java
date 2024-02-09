package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* compiled from: AxisPay */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    public int a;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;
        public final /* synthetic */ rx d;

        public a(View view, int i, rx rxVar) {
            this.b = view;
            this.c = i;
            this.d = rxVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.a == this.c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                rx rxVar = this.d;
                expandableBehavior.H((View) rxVar, this.b, rxVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.a = 0;
    }

    public final boolean F(boolean z) {
        if (!z) {
            return this.a == 1;
        }
        int i = this.a;
        return i == 0 || i == 2;
    }

    public rx G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> r = coordinatorLayout.r(view);
        int size = r.size();
        for (int i = 0; i < size; i++) {
            View view2 = r.get(i);
            if (e(coordinatorLayout, view, view2)) {
                return (rx) view2;
            }
        }
        return null;
    }

    public abstract boolean H(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        rx rxVar = (rx) view2;
        if (F(rxVar.a())) {
            this.a = rxVar.a() ? 1 : 2;
            return H((View) rxVar, view, rxVar.a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        rx G;
        if (ac.V(view) || (G = G(coordinatorLayout, view)) == null || !F(G.a())) {
            return false;
        }
        int i2 = G.a() ? 1 : 2;
        this.a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i2, G));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}
