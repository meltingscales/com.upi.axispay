package defpackage;

import java.io.Serializable;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ki0  reason: default package */
/* loaded from: classes.dex */
public final class ki0<T> implements ci0<T>, Serializable {
    public sk0<? extends T> b;
    public volatile Object c;
    public final Object d;

    public ki0(sk0<? extends T> sk0Var, Object obj) {
        yl0.e(sk0Var, C0059ao.a(10910));
        this.b = sk0Var;
        this.c = ni0.a;
        this.d = obj == null ? this : obj;
    }

    public boolean a() {
        return this.c != ni0.a;
    }

    @Override // defpackage.ci0
    public T getValue() {
        T t;
        T t2 = (T) this.c;
        ni0 ni0Var = ni0.a;
        if (t2 != ni0Var) {
            return t2;
        }
        synchronized (this.d) {
            t = (T) this.c;
            if (t == ni0Var) {
                sk0<? extends T> sk0Var = this.b;
                yl0.c(sk0Var);
                t = sk0Var.invoke();
                this.c = t;
                this.b = null;
            }
        }
        return t;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : C0059ao.a(10911);
    }

    public /* synthetic */ ki0(sk0 sk0Var, Object obj, int i, vl0 vl0Var) {
        this(sk0Var, (i & 2) != 0 ? null : obj);
    }
}
