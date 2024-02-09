package defpackage;

import java.util.concurrent.Executor;

/* compiled from: AxisPay */
/* renamed from: at  reason: default package */
/* loaded from: classes.dex */
public final class at implements hr<zs> {
    public final wh0<Executor> a;
    public final wh0<lu> b;
    public final wh0<bt> c;
    public final wh0<yu> d;

    public at(wh0<Executor> wh0Var, wh0<lu> wh0Var2, wh0<bt> wh0Var3, wh0<yu> wh0Var4) {
        this.a = wh0Var;
        this.b = wh0Var2;
        this.c = wh0Var3;
        this.d = wh0Var4;
    }

    public static at a(wh0<Executor> wh0Var, wh0<lu> wh0Var2, wh0<bt> wh0Var3, wh0<yu> wh0Var4) {
        return new at(wh0Var, wh0Var2, wh0Var3, wh0Var4);
    }

    public static zs c(Executor executor, lu luVar, bt btVar, yu yuVar) {
        return new zs(executor, luVar, btVar, yuVar);
    }

    @Override // defpackage.wh0
    /* renamed from: b */
    public zs get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
