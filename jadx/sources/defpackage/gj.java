package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AxisPay */
/* renamed from: gj  reason: default package */
/* loaded from: classes.dex */
public class gj {
    public static int a(RecyclerView.a0 a0Var, dj djVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.J() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(pVar.h0(view) - pVar.h0(view2)) + 1;
        }
        return Math.min(djVar.n(), djVar.d(view2) - djVar.g(view));
    }

    public static int b(RecyclerView.a0 a0Var, dj djVar, View view, View view2, RecyclerView.p pVar, boolean z, boolean z2) {
        int max;
        if (pVar.J() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(pVar.h0(view), pVar.h0(view2));
        int max2 = Math.max(pVar.h0(view), pVar.h0(view2));
        if (z2) {
            max = Math.max(0, (a0Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (z) {
            return Math.round((max * (Math.abs(djVar.d(view2) - djVar.g(view)) / (Math.abs(pVar.h0(view) - pVar.h0(view2)) + 1))) + (djVar.m() - djVar.g(view)));
        }
        return max;
    }

    public static int c(RecyclerView.a0 a0Var, dj djVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.J() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.b();
        }
        return (int) (((djVar.d(view2) - djVar.g(view)) / (Math.abs(pVar.h0(view) - pVar.h0(view2)) + 1)) * a0Var.b());
    }
}
