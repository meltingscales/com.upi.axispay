package androidx.lifecycle;

import defpackage.bf;
import defpackage.ye;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements cf {
    public final Object a;
    public final ye.a b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.b = ye.c.c(obj.getClass());
    }

    @Override // defpackage.cf
    public void d(ef efVar, bf.b bVar) {
        this.b.a(efVar, bVar, this.a);
    }
}
