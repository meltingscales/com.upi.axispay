package defpackage;

import android.annotation.SuppressLint;
import defpackage.bf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ff  reason: default package */
/* loaded from: classes.dex */
public class ff extends bf {
    public z3<df, a> a;
    public bf.c b;
    public final WeakReference<ef> c;
    public int d;
    public boolean e;
    public boolean f;
    public ArrayList<bf.c> g;
    public final boolean h;

    /* compiled from: AxisPay */
    /* renamed from: ff$a */
    /* loaded from: classes.dex */
    public static class a {
        public bf.c a;
        public cf b;

        public a(df dfVar, bf.c cVar) {
            this.b = hf.f(dfVar);
            this.a = cVar;
        }

        public void a(ef efVar, bf.b bVar) {
            bf.c b = bVar.b();
            this.a = ff.k(this.a, b);
            this.b.d(efVar, bVar);
            this.a = b;
        }
    }

    public ff(ef efVar) {
        this(efVar, true);
    }

    public static bf.c k(bf.c cVar, bf.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    @Override // defpackage.bf
    public void a(df dfVar) {
        ef efVar;
        f(C0059ao.a(5761));
        bf.c cVar = this.b;
        bf.c cVar2 = bf.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = bf.c.INITIALIZED;
        }
        a aVar = new a(dfVar, cVar2);
        if (this.a.g(dfVar, aVar) == null && (efVar = this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            bf.c e = e(dfVar);
            this.d++;
            while (aVar.a.compareTo(e) < 0 && this.a.contains(dfVar)) {
                n(aVar.a);
                bf.b c = bf.b.c(aVar.a);
                if (c != null) {
                    aVar.a(efVar, c);
                    m();
                    e = e(dfVar);
                } else {
                    throw new IllegalStateException(C0059ao.a(5762) + aVar.a);
                }
            }
            if (!z) {
                p();
            }
            this.d--;
        }
    }

    @Override // defpackage.bf
    public bf.c b() {
        return this.b;
    }

    @Override // defpackage.bf
    public void c(df dfVar) {
        f(C0059ao.a(5763));
        this.a.h(dfVar);
    }

    public final void d(ef efVar) {
        Iterator<Map.Entry<df, a>> a2 = this.a.a();
        while (a2.hasNext() && !this.f) {
            Map.Entry<df, a> next = a2.next();
            a value = next.getValue();
            while (value.a.compareTo(this.b) > 0 && !this.f && this.a.contains(next.getKey())) {
                bf.b a3 = bf.b.a(value.a);
                if (a3 != null) {
                    n(a3.b());
                    value.a(efVar, a3);
                    m();
                } else {
                    throw new IllegalStateException(C0059ao.a(5764) + value.a);
                }
            }
        }
    }

    public final bf.c e(df dfVar) {
        Map.Entry<df, a> i = this.a.i(dfVar);
        bf.c cVar = null;
        bf.c cVar2 = i != null ? i.getValue().a : null;
        if (!this.g.isEmpty()) {
            ArrayList<bf.c> arrayList = this.g;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return k(k(this.b, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    public final void f(String str) {
        if (!this.h || w3.d().b()) {
            return;
        }
        throw new IllegalStateException(C0059ao.a(5765) + str + C0059ao.a(5766));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(ef efVar) {
        a4<df, a>.d d = this.a.d();
        while (d.hasNext() && !this.f) {
            Map.Entry next = d.next();
            a aVar = (a) next.getValue();
            while (aVar.a.compareTo(this.b) < 0 && !this.f && this.a.contains(next.getKey())) {
                n(aVar.a);
                bf.b c = bf.b.c(aVar.a);
                if (c != null) {
                    aVar.a(efVar, c);
                    m();
                } else {
                    throw new IllegalStateException(C0059ao.a(5767) + aVar.a);
                }
            }
        }
    }

    public void h(bf.b bVar) {
        f(C0059ao.a(5768));
        l(bVar.b());
    }

    public final boolean i() {
        if (this.a.size() == 0) {
            return true;
        }
        bf.c cVar = this.a.b().getValue().a;
        bf.c cVar2 = this.a.e().getValue().a;
        return cVar == cVar2 && this.b == cVar2;
    }

    @Deprecated
    public void j(bf.c cVar) {
        f(C0059ao.a(5769));
        o(cVar);
    }

    public final void l(bf.c cVar) {
        if (this.b == cVar) {
            return;
        }
        this.b = cVar;
        if (!this.e && this.d == 0) {
            this.e = true;
            p();
            this.e = false;
            return;
        }
        this.f = true;
    }

    public final void m() {
        ArrayList<bf.c> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void n(bf.c cVar) {
        this.g.add(cVar);
    }

    public void o(bf.c cVar) {
        f(C0059ao.a(5770));
        l(cVar);
    }

    public final void p() {
        ef efVar = this.c.get();
        if (efVar != null) {
            while (!i()) {
                this.f = false;
                if (this.b.compareTo(this.a.b().getValue().a) < 0) {
                    d(efVar);
                }
                Map.Entry<df, a> e = this.a.e();
                if (!this.f && e != null && this.b.compareTo(e.getValue().a) > 0) {
                    g(efVar);
                }
            }
            this.f = false;
            return;
        }
        throw new IllegalStateException(C0059ao.a(5771));
    }

    public ff(ef efVar, boolean z) {
        this.a = new z3<>();
        this.d = 0;
        this.e = false;
        this.f = false;
        this.g = new ArrayList<>();
        this.c = new WeakReference<>(efVar);
        this.b = bf.c.INITIALIZED;
        this.h = z;
    }
}
