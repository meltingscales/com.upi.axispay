package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bn;
import java.util.ArrayList;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: fn  reason: default package */
/* loaded from: classes.dex */
public class fn extends bn {
    public int M;
    public ArrayList<bn> K = new ArrayList<>();
    public boolean L = true;
    public boolean N = false;
    public int O = 0;

    /* compiled from: AxisPay */
    /* renamed from: fn$a */
    /* loaded from: classes.dex */
    public class a extends cn {
        public final /* synthetic */ bn a;

        public a(fn fnVar, bn bnVar) {
            this.a = bnVar;
        }

        @Override // defpackage.bn.f
        public void e(bn bnVar) {
            this.a.S();
            bnVar.O(this);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: fn$b */
    /* loaded from: classes.dex */
    public static class b extends cn {
        public fn a;

        public b(fn fnVar) {
            this.a = fnVar;
        }

        @Override // defpackage.cn, defpackage.bn.f
        public void a(bn bnVar) {
            fn fnVar = this.a;
            if (fnVar.N) {
                return;
            }
            fnVar.Z();
            this.a.N = true;
        }

        @Override // defpackage.bn.f
        public void e(bn bnVar) {
            fn fnVar = this.a;
            int i = fnVar.M - 1;
            fnVar.M = i;
            if (i == 0) {
                fnVar.N = false;
                fnVar.o();
            }
            bnVar.O(this);
        }
    }

    @Override // defpackage.bn
    public void M(View view) {
        super.M(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).M(view);
        }
    }

    @Override // defpackage.bn
    public void Q(View view) {
        super.Q(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).Q(view);
        }
    }

    @Override // defpackage.bn
    public void S() {
        if (this.K.isEmpty()) {
            Z();
            o();
            return;
        }
        n0();
        if (!this.L) {
            for (int i = 1; i < this.K.size(); i++) {
                this.K.get(i - 1).a(new a(this, this.K.get(i)));
            }
            bn bnVar = this.K.get(0);
            if (bnVar != null) {
                bnVar.S();
                return;
            }
            return;
        }
        Iterator<bn> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().S();
        }
    }

    @Override // defpackage.bn
    public /* bridge */ /* synthetic */ bn T(long j) {
        j0(j);
        return this;
    }

    @Override // defpackage.bn
    public void U(bn.e eVar) {
        super.U(eVar);
        this.O |= 8;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).U(eVar);
        }
    }

    @Override // defpackage.bn
    public void W(vm vmVar) {
        super.W(vmVar);
        this.O |= 4;
        if (this.K != null) {
            for (int i = 0; i < this.K.size(); i++) {
                this.K.get(i).W(vmVar);
            }
        }
    }

    @Override // defpackage.bn
    public void X(en enVar) {
        super.X(enVar);
        this.O |= 2;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).X(enVar);
        }
    }

    @Override // defpackage.bn
    public String a0(String str) {
        String a0 = super.a0(str);
        for (int i = 0; i < this.K.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a0);
            sb.append(C0059ao.a(5980));
            sb.append(this.K.get(i).a0(str + C0059ao.a(5981)));
            a0 = sb.toString();
        }
        return a0;
    }

    @Override // defpackage.bn
    /* renamed from: b0 */
    public fn a(bn.f fVar) {
        super.a(fVar);
        return this;
    }

    @Override // defpackage.bn
    /* renamed from: c0 */
    public fn b(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).b(view);
        }
        super.b(view);
        return this;
    }

    public fn d0(bn bnVar) {
        e0(bnVar);
        long j = this.d;
        if (j >= 0) {
            bnVar.T(j);
        }
        if ((this.O & 1) != 0) {
            bnVar.V(r());
        }
        if ((this.O & 2) != 0) {
            bnVar.X(v());
        }
        if ((this.O & 4) != 0) {
            bnVar.W(u());
        }
        if ((this.O & 8) != 0) {
            bnVar.U(q());
        }
        return this;
    }

    public final void e0(bn bnVar) {
        this.K.add(bnVar);
        bnVar.s = this;
    }

    @Override // defpackage.bn
    public void f(hn hnVar) {
        if (F(hnVar.b)) {
            Iterator<bn> it = this.K.iterator();
            while (it.hasNext()) {
                bn next = it.next();
                if (next.F(hnVar.b)) {
                    next.f(hnVar);
                    hnVar.c.add(next);
                }
            }
        }
    }

    public bn f0(int i) {
        if (i < 0 || i >= this.K.size()) {
            return null;
        }
        return this.K.get(i);
    }

    public int g0() {
        return this.K.size();
    }

    @Override // defpackage.bn
    public void h(hn hnVar) {
        super.h(hnVar);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).h(hnVar);
        }
    }

    @Override // defpackage.bn
    /* renamed from: h0 */
    public fn O(bn.f fVar) {
        super.O(fVar);
        return this;
    }

    @Override // defpackage.bn
    public void i(hn hnVar) {
        if (F(hnVar.b)) {
            Iterator<bn> it = this.K.iterator();
            while (it.hasNext()) {
                bn next = it.next();
                if (next.F(hnVar.b)) {
                    next.i(hnVar);
                    hnVar.c.add(next);
                }
            }
        }
    }

    @Override // defpackage.bn
    /* renamed from: i0 */
    public fn P(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).P(view);
        }
        super.P(view);
        return this;
    }

    public fn j0(long j) {
        ArrayList<bn> arrayList;
        super.T(j);
        if (this.d >= 0 && (arrayList = this.K) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.K.get(i).T(j);
            }
        }
        return this;
    }

    @Override // defpackage.bn
    /* renamed from: k0 */
    public fn V(TimeInterpolator timeInterpolator) {
        this.O |= 1;
        ArrayList<bn> arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.K.get(i).V(timeInterpolator);
            }
        }
        super.V(timeInterpolator);
        return this;
    }

    @Override // defpackage.bn
    /* renamed from: l */
    public bn clone() {
        fn fnVar = (fn) super.clone();
        fnVar.K = new ArrayList<>();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            fnVar.e0(this.K.get(i).clone());
        }
        return fnVar;
    }

    public fn l0(int i) {
        if (i == 0) {
            this.L = true;
        } else if (i == 1) {
            this.L = false;
        } else {
            throw new AndroidRuntimeException(C0059ao.a(5982) + i);
        }
        return this;
    }

    @Override // defpackage.bn
    /* renamed from: m0 */
    public fn Y(long j) {
        super.Y(j);
        return this;
    }

    @Override // defpackage.bn
    public void n(ViewGroup viewGroup, in inVar, in inVar2, ArrayList<hn> arrayList, ArrayList<hn> arrayList2) {
        long x = x();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            bn bnVar = this.K.get(i);
            if (x > 0 && (this.L || i == 0)) {
                long x2 = bnVar.x();
                if (x2 > 0) {
                    bnVar.Y(x2 + x);
                } else {
                    bnVar.Y(x);
                }
            }
            bnVar.n(viewGroup, inVar, inVar2, arrayList, arrayList2);
        }
    }

    public final void n0() {
        b bVar = new b(this);
        Iterator<bn> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.M = this.K.size();
    }
}
