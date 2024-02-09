package defpackage;

import java.io.Serializable;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: qi0  reason: default package */
/* loaded from: classes.dex */
public final class qi0<T> implements ci0<T>, Serializable {
    public sk0<? extends T> b;
    public Object c;

    public qi0(sk0<? extends T> sk0Var) {
        yl0.e(sk0Var, C0059ao.a(11329));
        this.b = sk0Var;
        this.c = ni0.a;
    }

    public boolean a() {
        return this.c != ni0.a;
    }

    @Override // defpackage.ci0
    public T getValue() {
        if (this.c == ni0.a) {
            sk0<? extends T> sk0Var = this.b;
            yl0.c(sk0Var);
            this.c = sk0Var.invoke();
            this.b = null;
        }
        return (T) this.c;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : C0059ao.a(11330);
    }
}
