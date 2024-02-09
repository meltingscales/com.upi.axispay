package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ji0  reason: default package */
/* loaded from: classes.dex */
public final class ji0<T> implements ci0<T>, Serializable {
    public static final AtomicReferenceFieldUpdater<ji0<?>, Object> d = AtomicReferenceFieldUpdater.newUpdater(ji0.class, Object.class, C0059ao.a(15331));
    public volatile sk0<? extends T> b;
    private volatile Object c;

    public ji0(sk0<? extends T> sk0Var) {
        yl0.e(sk0Var, C0059ao.a(15332));
        this.b = sk0Var;
        this.c = ni0.a;
    }

    public boolean a() {
        return this.c != ni0.a;
    }

    @Override // defpackage.ci0
    public T getValue() {
        T t = (T) this.c;
        ni0 ni0Var = ni0.a;
        if (t != ni0Var) {
            return t;
        }
        sk0<? extends T> sk0Var = this.b;
        if (sk0Var != null) {
            T invoke = sk0Var.invoke();
            if (d.compareAndSet(this, ni0Var, invoke)) {
                this.b = null;
                return invoke;
            }
        }
        return (T) this.c;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : C0059ao.a(15333);
    }
}
