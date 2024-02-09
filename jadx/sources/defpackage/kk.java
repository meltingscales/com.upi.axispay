package defpackage;

import defpackage.cm;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: kk  reason: default package */
/* loaded from: classes.dex */
public final class kk implements cm.c {
    public final cm.c a;
    public final ik b;

    static {
        C0095z.a();
    }

    public kk(cm.c cVar, ik ikVar) {
        this.a = cVar;
        this.b = ikVar;
    }

    @Override // defpackage.cm.c
    /* renamed from: b */
    public jk a(cm.b bVar) {
        return new jk(this.a.a(bVar), this.b);
    }
}
