package defpackage;

/* compiled from: AxisPay */
/* renamed from: ok  reason: default package */
/* loaded from: classes.dex */
public abstract class ok<T> extends hl {
    public ok(bl blVar) {
        super(blVar);
    }

    public abstract void g(fm fmVar, T t);

    public final long h(T t) {
        fm a = a();
        try {
            g(a, t);
            return a.L();
        } finally {
            f(a);
        }
    }
}
