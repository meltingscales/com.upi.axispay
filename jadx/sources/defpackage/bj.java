package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: bj  reason: default package */
/* loaded from: classes.dex */
public class bj extends RecyclerView.z {
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    public bj(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    public final float A() {
        if (!this.m) {
            this.n = v(this.l);
            this.m = true;
        }
        return this.n;
    }

    public int B() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public void C(RecyclerView.z.a aVar) {
        PointF a = a(f());
        if (a != null && (a.x != 0.0f || a.y != 0.0f)) {
            i(a);
            this.k = a;
            this.o = (int) (a.x * 10000.0f);
            this.p = (int) (a.y * 10000.0f);
            aVar.d((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (x(10000) * 1.2f), this.i);
            return;
        }
        aVar.b(f());
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public void l(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.o = y(this.o, i);
        int y = y(this.p, i2);
        this.p = y;
        if (this.o == 0 && y == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public void n() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        int t = t(view, z());
        int u = u(view, B());
        int w = w((int) Math.sqrt((t * t) + (u * u)));
        if (w > 0) {
            aVar.d(-t, -u, w, this.j);
        }
    }

    public int s(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException(C0059ao.a(2069));
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    public int t(View view, int i) {
        RecyclerView.p e = e();
        if (e == null || !e.k()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(e.Q(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, e.T(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, e.e0(), e.o0() - e.f0(), i);
    }

    public int u(View view, int i) {
        RecyclerView.p e = e();
        if (e == null || !e.l()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(e.U(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, e.O(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, e.g0(), e.W() - e.d0(), i);
    }

    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int w(int i) {
        return (int) Math.ceil(x(i) / 0.3356d);
    }

    public int x(int i) {
        return (int) Math.ceil(Math.abs(i) * A());
    }

    public final int y(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    public int z() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
