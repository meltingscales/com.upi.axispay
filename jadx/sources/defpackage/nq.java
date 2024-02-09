package defpackage;

import defpackage.kq;

/* compiled from: AxisPay */
/* renamed from: nq  reason: default package */
/* loaded from: classes.dex */
public final class nq<T> implements zo<T> {
    public final lq a;
    public final String b;
    public final vo c;
    public final yo<T, byte[]> d;
    public final oq e;

    public nq(lq lqVar, String str, vo voVar, yo<T, byte[]> yoVar, oq oqVar) {
        this.a = lqVar;
        this.b = str;
        this.c = voVar;
        this.d = yoVar;
        this.e = oqVar;
    }

    @Override // defpackage.zo
    public void a(wo<T> woVar, bp bpVar) {
        oq oqVar = this.e;
        kq.a a = kq.a();
        a.e(this.a);
        a.c(woVar);
        a.f(this.b);
        a.d(this.d);
        a.b(this.c);
        oqVar.a(a.a(), bpVar);
    }
}
