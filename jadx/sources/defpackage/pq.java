package defpackage;

import android.content.Context;
import defpackage.fq;
import defpackage.lq;
import defpackage.qq;
import java.util.Collections;
import java.util.Set;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: pq  reason: default package */
/* loaded from: classes.dex */
public class pq implements oq {
    public static volatile qq e;
    public final zu a;
    public final zu b;
    public final yr c;
    public final xs d;

    public pq(zu zuVar, zu zuVar2, yr yrVar, xs xsVar, zs zsVar) {
        this.a = zuVar;
        this.b = zuVar2;
        this.c = yrVar;
        this.d = xsVar;
        zsVar.a();
    }

    public static pq c() {
        qq qqVar = e;
        if (qqVar != null) {
            return qqVar.j();
        }
        throw new IllegalStateException(C0059ao.a(15552));
    }

    public static Set<vo> d(cq cqVar) {
        if (cqVar instanceof dq) {
            return Collections.unmodifiableSet(((dq) cqVar).b());
        }
        return Collections.singleton(vo.b(C0059ao.a(15553)));
    }

    public static void f(Context context) {
        if (e == null) {
            synchronized (pq.class) {
                if (e == null) {
                    qq.a k = bq.k();
                    k.b(context);
                    e = k.a();
                }
            }
        }
    }

    @Override // defpackage.oq
    public void a(kq kqVar, bp bpVar) {
        this.c.a(kqVar.f().f(kqVar.c().c()), b(kqVar), bpVar);
    }

    public final fq b(kq kqVar) {
        fq.a a = fq.a();
        a.i(this.a.a());
        a.k(this.b.a());
        a.j(kqVar.g());
        a.h(new eq(kqVar.b(), kqVar.d()));
        a.g(kqVar.c().a());
        return a.d();
    }

    public xs e() {
        return this.d;
    }

    public ap g(cq cqVar) {
        Set<vo> d = d(cqVar);
        lq.a a = lq.a();
        a.b(cqVar.a());
        a.c(cqVar.getExtras());
        return new mq(d, a.a(), this);
    }
}
