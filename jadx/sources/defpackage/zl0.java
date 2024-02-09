package defpackage;

import java.io.Serializable;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: zl0  reason: default package */
/* loaded from: classes.dex */
public abstract class zl0<R> implements wl0<R>, Serializable {
    private final int arity;

    public zl0(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String e = km0.e(this);
        yl0.d(e, C0059ao.a(3650));
        return e;
    }
}
