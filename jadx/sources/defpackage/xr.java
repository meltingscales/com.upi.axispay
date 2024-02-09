package defpackage;

import java.util.concurrent.Executor;

/* compiled from: AxisPay */
/* renamed from: xr  reason: default package */
/* loaded from: classes.dex */
public final class xr implements hr<wr> {
    public final wh0<Executor> a;
    public final wh0<wq> b;
    public final wh0<bt> c;
    public final wh0<lu> d;
    public final wh0<yu> e;

    public xr(wh0<Executor> wh0Var, wh0<wq> wh0Var2, wh0<bt> wh0Var3, wh0<lu> wh0Var4, wh0<yu> wh0Var5) {
        this.a = wh0Var;
        this.b = wh0Var2;
        this.c = wh0Var3;
        this.d = wh0Var4;
        this.e = wh0Var5;
    }

    public static xr a(wh0<Executor> wh0Var, wh0<wq> wh0Var2, wh0<bt> wh0Var3, wh0<lu> wh0Var4, wh0<yu> wh0Var5) {
        return new xr(wh0Var, wh0Var2, wh0Var3, wh0Var4, wh0Var5);
    }

    public static wr c(Executor executor, wq wqVar, bt btVar, lu luVar, yu yuVar) {
        return new wr(executor, wqVar, btVar, luVar, yuVar);
    }

    @Override // defpackage.wh0
    /* renamed from: b */
    public wr get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
