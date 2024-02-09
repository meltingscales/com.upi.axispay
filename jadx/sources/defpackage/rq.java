package defpackage;

/* compiled from: AxisPay */
/* renamed from: rq  reason: default package */
/* loaded from: classes.dex */
public final class rq implements hr<pq> {
    public final wh0<zu> a;
    public final wh0<zu> b;
    public final wh0<yr> c;
    public final wh0<xs> d;
    public final wh0<zs> e;

    public rq(wh0<zu> wh0Var, wh0<zu> wh0Var2, wh0<yr> wh0Var3, wh0<xs> wh0Var4, wh0<zs> wh0Var5) {
        this.a = wh0Var;
        this.b = wh0Var2;
        this.c = wh0Var3;
        this.d = wh0Var4;
        this.e = wh0Var5;
    }

    public static rq a(wh0<zu> wh0Var, wh0<zu> wh0Var2, wh0<yr> wh0Var3, wh0<xs> wh0Var4, wh0<zs> wh0Var5) {
        return new rq(wh0Var, wh0Var2, wh0Var3, wh0Var4, wh0Var5);
    }

    public static pq c(zu zuVar, zu zuVar2, yr yrVar, xs xsVar, zs zsVar) {
        return new pq(zuVar, zuVar2, yrVar, xsVar, zsVar);
    }

    @Override // defpackage.wh0
    /* renamed from: b */
    public pq get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
