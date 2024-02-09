package defpackage;

import defpackage.bl;
import defpackage.cm;
import java.util.concurrent.Executor;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: xk  reason: default package */
/* loaded from: classes.dex */
public final class xk implements cm.c {
    public final cm.c a;
    public final bl.f b;
    public final Executor c;

    static {
        C0095z.a();
    }

    public xk(cm.c cVar, bl.f fVar, Executor executor) {
        this.a = cVar;
        this.b = fVar;
        this.c = executor;
    }

    @Override // defpackage.cm.c
    public cm a(cm.b bVar) {
        return new wk(this.a.a(bVar), this.b, this.c);
    }
}
