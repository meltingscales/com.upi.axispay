package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ir  reason: default package */
/* loaded from: classes.dex */
public final class ir<T> implements hr<T>, fr<T> {
    public final T a;

    public ir(T t) {
        this.a = t;
    }

    public static <T> hr<T> a(T t) {
        jr.c(t, C0059ao.a(9154));
        return new ir(t);
    }

    @Override // defpackage.wh0
    public T get() {
        return this.a;
    }
}
