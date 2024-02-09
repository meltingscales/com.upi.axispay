package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;

/* compiled from: AxisPay */
/* renamed from: ej  reason: default package */
/* loaded from: classes.dex */
public class ej extends ij {
    public dj c;
    public dj d;

    /* compiled from: AxisPay */
    /* renamed from: ej$a */
    /* loaded from: classes.dex */
    public class a extends bj {
        public a(Context context) {
            super(context);
        }

        @Override // defpackage.bj, androidx.recyclerview.widget.RecyclerView.z
        public void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            ej ejVar = ej.this;
            int[] c = ejVar.c(ejVar.a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int w = w(Math.max(Math.abs(i), Math.abs(i2)));
            if (w > 0) {
                aVar.d(i, i2, w, this.j);
            }
        }

        @Override // defpackage.bj
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // defpackage.bj
        public int x(int i) {
            return Math.min(100, super.x(i));
        }
    }

    @Override // defpackage.ij
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.k()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.l()) {
            iArr[1] = k(view, o(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // defpackage.ij
    public RecyclerView.z d(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.z.b) {
            return new a(this.a.getContext());
        }
        return null;
    }

    @Override // defpackage.ij
    public View f(RecyclerView.p pVar) {
        if (pVar.l()) {
            return l(pVar, o(pVar));
        }
        if (pVar.k()) {
            return l(pVar, m(pVar));
        }
        return null;
    }

    @Override // defpackage.ij
    public int g(RecyclerView.p pVar, int i, int i2) {
        dj n;
        int Y = pVar.Y();
        if (Y == 0 || (n = n(pVar)) == null) {
            return -1;
        }
        int i3 = RecyclerView.UNDEFINED_DURATION;
        int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int J = pVar.J();
        View view = null;
        View view2 = null;
        for (int i5 = 0; i5 < J; i5++) {
            View I = pVar.I(i5);
            if (I != null) {
                int k = k(I, n);
                if (k <= 0 && k > i3) {
                    view2 = I;
                    i3 = k;
                }
                if (k >= 0 && k < i4) {
                    view = I;
                    i4 = k;
                }
            }
        }
        boolean p = p(pVar, i, i2);
        if (!p || view == null) {
            if (p || view2 == null) {
                if (p) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int h0 = pVar.h0(view) + (q(pVar) == p ? -1 : 1);
                if (h0 < 0 || h0 >= Y) {
                    return -1;
                }
                return h0;
            }
            return pVar.h0(view2);
        }
        return pVar.h0(view);
    }

    public final int k(View view, dj djVar) {
        return (djVar.g(view) + (djVar.e(view) / 2)) - (djVar.m() + (djVar.n() / 2));
    }

    public final View l(RecyclerView.p pVar, dj djVar) {
        int J = pVar.J();
        View view = null;
        if (J == 0) {
            return null;
        }
        int m = djVar.m() + (djVar.n() / 2);
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i2 = 0; i2 < J; i2++) {
            View I = pVar.I(i2);
            int abs = Math.abs((djVar.g(I) + (djVar.e(I) / 2)) - m);
            if (abs < i) {
                view = I;
                i = abs;
            }
        }
        return view;
    }

    public final dj m(RecyclerView.p pVar) {
        dj djVar = this.d;
        if (djVar == null || djVar.a != pVar) {
            this.d = dj.a(pVar);
        }
        return this.d;
    }

    public final dj n(RecyclerView.p pVar) {
        if (pVar.l()) {
            return o(pVar);
        }
        if (pVar.k()) {
            return m(pVar);
        }
        return null;
    }

    public final dj o(RecyclerView.p pVar) {
        dj djVar = this.c;
        if (djVar == null || djVar.a != pVar) {
            this.c = dj.c(pVar);
        }
        return this.c;
    }

    public final boolean p(RecyclerView.p pVar, int i, int i2) {
        return pVar.k() ? i > 0 : i2 > 0;
    }

    public final boolean q(RecyclerView.p pVar) {
        PointF a2;
        int Y = pVar.Y();
        if (!(pVar instanceof RecyclerView.z.b) || (a2 = ((RecyclerView.z.b) pVar).a(Y - 1)) == null) {
            return false;
        }
        return a2.x < 0.0f || a2.y < 0.0f;
    }
}
