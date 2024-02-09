package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: k60  reason: default package */
/* loaded from: classes.dex */
public final class k60 {
    public final Executor a;
    public final Executor b;
    public final w60 c;

    /* compiled from: AxisPay */
    /* renamed from: k60$b */
    /* loaded from: classes.dex */
    public static class b {
        public static final n60 y = n60.FIFO;
        public Context a;
        public r60 v;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public x60 f = null;
        public Executor g = null;
        public Executor h = null;
        public boolean i = false;
        public boolean j = false;
        public int k = 3;
        public int l = 3;
        public boolean m = false;
        public n60 n = y;
        public int o = 0;
        public long p = 0;
        public int q = 0;
        public d60 r = null;
        public t50 s = null;
        public a60 t = null;
        public w60 u = null;
        public i60 w = null;
        public boolean x = false;

        public b(Context context) {
            this.a = context.getApplicationContext();
        }

        public k60 t() {
            w();
            return new k60(this);
        }

        public b u(i60 i60Var) {
            this.w = i60Var;
            return this;
        }

        public b v(int i) {
            if (i > 0) {
                if (this.s != null) {
                    y60.e(C0059ao.a(4295), new Object[0]);
                }
                this.p = i;
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(4296));
        }

        public final void w() {
            if (this.g == null) {
                this.g = h60.c(this.k, this.l, this.n);
            } else {
                this.i = true;
            }
            if (this.h == null) {
                this.h = h60.c(this.k, this.l, this.n);
            } else {
                this.j = true;
            }
            if (this.s == null) {
                if (this.t == null) {
                    this.t = h60.d();
                }
                this.s = h60.b(this.a, this.t, this.p, this.q);
            }
            if (this.r == null) {
                this.r = h60.g(this.a, this.o);
            }
            if (this.m) {
                this.r = new e60(this.r, z60.a());
            }
            if (this.u == null) {
                this.u = h60.f(this.a);
            }
            if (this.v == null) {
                this.v = h60.e(this.x);
            }
            if (this.w == null) {
                this.w = i60.a();
            }
        }

        public b x(d60 d60Var) {
            if (this.o != 0) {
                y60.e(C0059ao.a(4297), new Object[0]);
            }
            this.r = d60Var;
            return this;
        }
    }

    public k60(b bVar) {
        bVar.a.getResources();
        int unused = bVar.b;
        int unused2 = bVar.c;
        int unused3 = bVar.d;
        int unused4 = bVar.e;
        x60 unused5 = bVar.f;
        this.a = bVar.g;
        this.b = bVar.h;
        int unused6 = bVar.k;
        int unused7 = bVar.l;
        n60 unused8 = bVar.n;
        t50 unused9 = bVar.s;
        d60 unused10 = bVar.r;
        i60 unused11 = bVar.w;
        this.c = bVar.u;
        r60 unused12 = bVar.v;
        boolean unused13 = bVar.i;
        boolean unused14 = bVar.j;
        y60.f(bVar.x);
    }
}
