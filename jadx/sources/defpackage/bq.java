package defpackage;

import android.content.Context;
import defpackage.qq;
import java.util.concurrent.Executor;

/* compiled from: AxisPay */
/* renamed from: bq  reason: default package */
/* loaded from: classes.dex */
public final class bq extends qq {
    public wh0<Executor> b;
    public wh0<Context> c;
    public wh0 d;
    public wh0 e;
    public wh0 f;
    public wh0<String> g;
    public wh0<tu> h;
    public wh0<ws> i;
    public wh0<bt> j;
    public wh0<wr> k;
    public wh0<xs> l;
    public wh0<zs> m;
    public wh0<pq> n;

    /* compiled from: AxisPay */
    /* renamed from: bq$b */
    /* loaded from: classes.dex */
    public static final class b implements qq.a {
        public Context a;

        public b() {
        }

        @Override // defpackage.qq.a
        public qq a() {
            jr.a(this.a, Context.class);
            return new bq(this.a);
        }

        @Override // defpackage.qq.a
        public /* bridge */ /* synthetic */ qq.a b(Context context) {
            c(context);
            return this;
        }

        public b c(Context context) {
            jr.b(context);
            this.a = context;
            return this;
        }
    }

    public static qq.a k() {
        return new b();
    }

    @Override // defpackage.qq
    public lu b() {
        return this.h.get();
    }

    @Override // defpackage.qq
    public pq j() {
        return this.n.get();
    }

    public final void m(Context context) {
        this.b = gr.b(hq.a());
        hr a2 = ir.a(context);
        this.c = a2;
        br a3 = br.a(a2, bv.a(), cv.a());
        this.d = a3;
        this.e = gr.b(dr.a(this.c, a3));
        this.f = wu.a(this.c, ou.a(), qu.a());
        this.g = pu.a(this.c);
        this.h = gr.b(uu.a(bv.a(), cv.a(), ru.a(), this.f, this.g));
        as b2 = as.b(bv.a());
        this.i = b2;
        cs a4 = cs.a(this.c, this.h, b2, cv.a());
        this.j = a4;
        wh0<Executor> wh0Var = this.b;
        wh0 wh0Var2 = this.e;
        wh0<tu> wh0Var3 = this.h;
        this.k = xr.a(wh0Var, wh0Var2, a4, wh0Var3, wh0Var3);
        wh0<Context> wh0Var4 = this.c;
        wh0 wh0Var5 = this.e;
        wh0<tu> wh0Var6 = this.h;
        this.l = ys.a(wh0Var4, wh0Var5, wh0Var6, this.j, this.b, wh0Var6, bv.a(), cv.a(), this.h);
        wh0<Executor> wh0Var7 = this.b;
        wh0<tu> wh0Var8 = this.h;
        this.m = at.a(wh0Var7, wh0Var8, this.j, wh0Var8);
        this.n = gr.b(rq.a(bv.a(), cv.a(), this.k, this.l, this.m));
    }

    public bq(Context context) {
        m(context);
    }
}
