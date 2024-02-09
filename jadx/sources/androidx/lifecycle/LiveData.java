package androidx.lifecycle;

import defpackage.bf;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class LiveData<T> {
    public static final Object j = new Object();
    public final Object a = new Object();
    public a4<kf<? super T>, LiveData<T>.b> b = new a4<>();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.b implements cf {
        public final ef e;

        public LifecycleBoundObserver(ef efVar, kf<? super T> kfVar) {
            super(kfVar);
            this.e = efVar;
        }

        @Override // defpackage.cf
        public void d(ef efVar, bf.b bVar) {
            bf.c b = this.e.getLifecycle().b();
            if (b == bf.c.DESTROYED) {
                LiveData.this.i(this.a);
                return;
            }
            bf.c cVar = null;
            while (cVar != b) {
                h(k());
                cVar = b;
                b = this.e.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.b
        public void i() {
            this.e.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.b
        public boolean j(ef efVar) {
            return this.e == efVar;
        }

        @Override // androidx.lifecycle.LiveData.b
        public boolean k() {
            return this.e.getLifecycle().b().a(bf.c.STARTED);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a extends LiveData<T>.b {
        public a(LiveData liveData, kf<? super T> kfVar) {
            super(kfVar);
        }

        @Override // androidx.lifecycle.LiveData.b
        public boolean k() {
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public abstract class b {
        public final kf<? super T> a;
        public boolean b;
        public int c = -1;

        public b(kf<? super T> kfVar) {
            this.a = kfVar;
        }

        public void h(boolean z) {
            if (z == this.b) {
                return;
            }
            this.b = z;
            LiveData.this.b(z ? 1 : -1);
            if (this.b) {
                LiveData.this.d(this);
            }
        }

        public void i() {
        }

        public boolean j(ef efVar) {
            return false;
        }

        public abstract boolean k();
    }

    public LiveData() {
        Object obj = j;
        this.f = obj;
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        if (w3.d().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void b(int i) {
        int i2 = this.c;
        this.c = i + i2;
        if (this.d) {
            return;
        }
        this.d = true;
        while (true) {
            try {
                int i3 = this.c;
                if (i2 == i3) {
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    g();
                } else if (z2) {
                    h();
                }
                i2 = i3;
            } finally {
                this.d = false;
            }
        }
    }

    public final void c(LiveData<T>.b bVar) {
        if (bVar.b) {
            if (!bVar.k()) {
                bVar.h(false);
                return;
            }
            int i = bVar.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            bVar.c = i2;
            bVar.a.a((Object) this.e);
        }
    }

    public void d(LiveData<T>.b bVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (bVar != null) {
                c(bVar);
                bVar = null;
            } else {
                a4<kf<? super T>, LiveData<T>.b>.d d = this.b.d();
                while (d.hasNext()) {
                    c((b) d.next().getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public void e(ef efVar, kf<? super T> kfVar) {
        a("observe");
        if (efVar.getLifecycle().b() == bf.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(efVar, kfVar);
        LiveData<T>.b g = this.b.g(kfVar, lifecycleBoundObserver);
        if (g != null && !g.j(efVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (g != null) {
            return;
        }
        efVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public void f(kf<? super T> kfVar) {
        a("observeForever");
        a aVar = new a(this, kfVar);
        LiveData<T>.b g = this.b.g(kfVar, aVar);
        if (g instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (g != null) {
            return;
        }
        aVar.h(true);
    }

    public void g() {
    }

    public void h() {
    }

    public void i(kf<? super T> kfVar) {
        a("removeObserver");
        LiveData<T>.b h = this.b.h(kfVar);
        if (h == null) {
            return;
        }
        h.i();
        h.h(false);
    }

    public void j(T t) {
        a("setValue");
        this.g++;
        this.e = t;
        d(null);
    }
}
