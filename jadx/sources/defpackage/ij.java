package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ij  reason: default package */
/* loaded from: classes.dex */
public abstract class ij extends RecyclerView.s {
    public RecyclerView a;
    public final RecyclerView.u b = new a();

    /* compiled from: AxisPay */
    /* renamed from: ij$a */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.u {
        public boolean a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
            if (i == 0 && this.a) {
                this.a = false;
                ij.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.a = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i, int i2) {
        RecyclerView.p layoutManager = this.a.getLayoutManager();
        if (layoutManager == null || this.a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && i(layoutManager, i, i2);
    }

    public void b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            h();
            new Scroller(this.a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    public abstract RecyclerView.z d(RecyclerView.p pVar);

    public final void e() {
        this.a.removeOnScrollListener(this.b);
        this.a.setOnFlingListener(null);
    }

    public abstract View f(RecyclerView.p pVar);

    public abstract int g(RecyclerView.p pVar, int i, int i2);

    public final void h() throws IllegalStateException {
        if (this.a.getOnFlingListener() == null) {
            this.a.addOnScrollListener(this.b);
            this.a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(C0059ao.a(9034));
    }

    public final boolean i(RecyclerView.p pVar, int i, int i2) {
        RecyclerView.z d;
        int g;
        if (!(pVar instanceof RecyclerView.z.b) || (d = d(pVar)) == null || (g = g(pVar, i, i2)) == -1) {
            return false;
        }
        d.p(g);
        pVar.K1(d);
        return true;
    }

    public void j() {
        RecyclerView.p layoutManager;
        View f;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (f = f(layoutManager)) == null) {
            return;
        }
        int[] c = c(layoutManager, f);
        if (c[0] == 0 && c[1] == 0) {
            return;
        }
        this.a.smoothScrollBy(c[0], c[1]);
    }
}
