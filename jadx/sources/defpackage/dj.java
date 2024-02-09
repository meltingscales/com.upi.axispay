package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: dj  reason: default package */
/* loaded from: classes.dex */
public abstract class dj {
    public final RecyclerView.p a;
    public int b;
    public final Rect c;

    /* compiled from: AxisPay */
    /* renamed from: dj$a */
    /* loaded from: classes.dex */
    public class a extends dj {
        public a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // defpackage.dj
        public int d(View view) {
            return this.a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // defpackage.dj
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.S(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // defpackage.dj
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.R(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // defpackage.dj
        public int g(View view) {
            return this.a.Q(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // defpackage.dj
        public int h() {
            return this.a.o0();
        }

        @Override // defpackage.dj
        public int i() {
            return this.a.o0() - this.a.f0();
        }

        @Override // defpackage.dj
        public int j() {
            return this.a.f0();
        }

        @Override // defpackage.dj
        public int k() {
            return this.a.p0();
        }

        @Override // defpackage.dj
        public int l() {
            return this.a.X();
        }

        @Override // defpackage.dj
        public int m() {
            return this.a.e0();
        }

        @Override // defpackage.dj
        public int n() {
            return (this.a.o0() - this.a.e0()) - this.a.f0();
        }

        @Override // defpackage.dj
        public int p(View view) {
            this.a.n0(view, true, this.c);
            return this.c.right;
        }

        @Override // defpackage.dj
        public int q(View view) {
            this.a.n0(view, true, this.c);
            return this.c.left;
        }

        @Override // defpackage.dj
        public void r(int i) {
            this.a.C0(i);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: dj$b */
    /* loaded from: classes.dex */
    public class b extends dj {
        public b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // defpackage.dj
        public int d(View view) {
            return this.a.O(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // defpackage.dj
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.R(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // defpackage.dj
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.S(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // defpackage.dj
        public int g(View view) {
            return this.a.U(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // defpackage.dj
        public int h() {
            return this.a.W();
        }

        @Override // defpackage.dj
        public int i() {
            return this.a.W() - this.a.d0();
        }

        @Override // defpackage.dj
        public int j() {
            return this.a.d0();
        }

        @Override // defpackage.dj
        public int k() {
            return this.a.X();
        }

        @Override // defpackage.dj
        public int l() {
            return this.a.p0();
        }

        @Override // defpackage.dj
        public int m() {
            return this.a.g0();
        }

        @Override // defpackage.dj
        public int n() {
            return (this.a.W() - this.a.g0()) - this.a.d0();
        }

        @Override // defpackage.dj
        public int p(View view) {
            this.a.n0(view, true, this.c);
            return this.c.bottom;
        }

        @Override // defpackage.dj
        public int q(View view) {
            this.a.n0(view, true, this.c);
            return this.c.top;
        }

        @Override // defpackage.dj
        public void r(int i) {
            this.a.D0(i);
        }
    }

    public /* synthetic */ dj(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static dj a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static dj b(RecyclerView.p pVar, int i) {
        if (i != 0) {
            if (i == 1) {
                return c(pVar);
            }
            throw new IllegalArgumentException(C0059ao.a(3933));
        }
        return a(pVar);
    }

    public static dj c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return n() - this.b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public void s() {
        this.b = n();
    }

    public dj(RecyclerView.p pVar) {
        this.b = RecyclerView.UNDEFINED_DURATION;
        this.c = new Rect();
        this.a = pVar;
    }
}
