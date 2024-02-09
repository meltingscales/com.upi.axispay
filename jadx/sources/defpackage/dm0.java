package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: dm0  reason: default package */
/* loaded from: classes.dex */
public final class dm0 implements sl0 {
    public final Class<?> b;

    public dm0(Class<?> cls, String str) {
        yl0.e(cls, C0059ao.a(2703));
        yl0.e(str, C0059ao.a(2704));
        this.b = cls;
    }

    @Override // defpackage.sl0
    public Class<?> a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof dm0) && yl0.a(a(), ((dm0) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return yl0.l(a().toString(), C0059ao.a(2705));
    }
}
