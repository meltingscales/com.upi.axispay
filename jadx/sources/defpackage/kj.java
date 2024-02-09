package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: kj  reason: default package */
/* loaded from: classes.dex */
public class kj {
    public final u4<RecyclerView.d0, a> a = new u4<>();
    public final r4<RecyclerView.d0> b = new r4<>();

    /* compiled from: AxisPay */
    /* renamed from: kj$a */
    /* loaded from: classes.dex */
    public static class a {
        public static ab<a> d = new bb(20);
        public int a;
        public RecyclerView.m.c b;
        public RecyclerView.m.c c;

        public static void a() {
            do {
            } while (d.b() != null);
        }

        public static a b() {
            a b = d.b();
            return b == null ? new a() : b;
        }

        public static void c(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            d.a(aVar);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: kj$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.d0 d0Var);

        void b(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void c(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    public void a(RecyclerView.d0 d0Var, RecyclerView.m.c cVar) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.a |= 2;
        aVar.b = cVar;
    }

    public void b(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.a |= 1;
    }

    public void c(long j, RecyclerView.d0 d0Var) {
        this.b.i(j, d0Var);
    }

    public void d(RecyclerView.d0 d0Var, RecyclerView.m.c cVar) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.c = cVar;
        aVar.a |= 8;
    }

    public void e(RecyclerView.d0 d0Var, RecyclerView.m.c cVar) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.b = cVar;
        aVar.a |= 4;
    }

    public void f() {
        this.a.clear();
        this.b.b();
    }

    public RecyclerView.d0 g(long j) {
        return this.b.e(j);
    }

    public boolean h(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        return (aVar == null || (aVar.a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        return (aVar == null || (aVar.a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.d0 d0Var) {
        p(d0Var);
    }

    public final RecyclerView.m.c l(RecyclerView.d0 d0Var, int i) {
        a m;
        RecyclerView.m.c cVar;
        int f = this.a.f(d0Var);
        if (f >= 0 && (m = this.a.m(f)) != null) {
            int i2 = m.a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                m.a = i3;
                if (i == 4) {
                    cVar = m.b;
                } else if (i == 8) {
                    cVar = m.c;
                } else {
                    throw new IllegalArgumentException(C0059ao.a(10994));
                }
                if ((i3 & 12) == 0) {
                    this.a.k(f);
                    a.c(m);
                }
                return cVar;
            }
        }
        return null;
    }

    public RecyclerView.m.c m(RecyclerView.d0 d0Var) {
        return l(d0Var, 8);
    }

    public RecyclerView.m.c n(RecyclerView.d0 d0Var) {
        return l(d0Var, 4);
    }

    public void o(b bVar) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 i = this.a.i(size);
            a k = this.a.k(size);
            int i2 = k.a;
            if ((i2 & 3) == 3) {
                bVar.a(i);
            } else if ((i2 & 1) != 0) {
                RecyclerView.m.c cVar = k.b;
                if (cVar == null) {
                    bVar.a(i);
                } else {
                    bVar.c(i, cVar, k.c);
                }
            } else if ((i2 & 14) == 14) {
                bVar.b(i, k.b, k.c);
            } else if ((i2 & 12) == 12) {
                bVar.d(i, k.b, k.c);
            } else if ((i2 & 4) != 0) {
                bVar.c(i, k.b, null);
            } else if ((i2 & 8) != 0) {
                bVar.b(i, k.b, k.c);
            }
            a.c(k);
        }
    }

    public void p(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            return;
        }
        aVar.a &= -2;
    }

    public void q(RecyclerView.d0 d0Var) {
        int l = this.b.l() - 1;
        while (true) {
            if (l < 0) {
                break;
            } else if (d0Var == this.b.m(l)) {
                this.b.k(l);
                break;
            } else {
                l--;
            }
        }
        a remove = this.a.remove(d0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
