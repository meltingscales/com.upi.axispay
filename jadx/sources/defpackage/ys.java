package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: AxisPay */
/* renamed from: ys  reason: default package */
/* loaded from: classes.dex */
public final class ys implements hr<xs> {
    public final wh0<Context> a;
    public final wh0<wq> b;
    public final wh0<lu> c;
    public final wh0<bt> d;
    public final wh0<Executor> e;
    public final wh0<yu> f;
    public final wh0<zu> g;
    public final wh0<zu> h;
    public final wh0<ku> i;

    public ys(wh0<Context> wh0Var, wh0<wq> wh0Var2, wh0<lu> wh0Var3, wh0<bt> wh0Var4, wh0<Executor> wh0Var5, wh0<yu> wh0Var6, wh0<zu> wh0Var7, wh0<zu> wh0Var8, wh0<ku> wh0Var9) {
        this.a = wh0Var;
        this.b = wh0Var2;
        this.c = wh0Var3;
        this.d = wh0Var4;
        this.e = wh0Var5;
        this.f = wh0Var6;
        this.g = wh0Var7;
        this.h = wh0Var8;
        this.i = wh0Var9;
    }

    public static ys a(wh0<Context> wh0Var, wh0<wq> wh0Var2, wh0<lu> wh0Var3, wh0<bt> wh0Var4, wh0<Executor> wh0Var5, wh0<yu> wh0Var6, wh0<zu> wh0Var7, wh0<zu> wh0Var8, wh0<ku> wh0Var9) {
        return new ys(wh0Var, wh0Var2, wh0Var3, wh0Var4, wh0Var5, wh0Var6, wh0Var7, wh0Var8, wh0Var9);
    }

    public static xs c(Context context, wq wqVar, lu luVar, bt btVar, Executor executor, yu yuVar, zu zuVar, zu zuVar2, ku kuVar) {
        return new xs(context, wqVar, luVar, btVar, executor, yuVar, zuVar, zuVar2, kuVar);
    }

    @Override // defpackage.wh0
    /* renamed from: b */
    public xs get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
