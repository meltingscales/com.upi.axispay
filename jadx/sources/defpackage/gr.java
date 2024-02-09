package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: gr  reason: default package */
/* loaded from: classes.dex */
public final class gr<T> implements wh0<T>, fr<T> {
    public static final Object c = new Object();
    public volatile wh0<T> a;
    public volatile Object b = c;

    public gr(wh0<T> wh0Var) {
        this.a = wh0Var;
    }

    public static <P extends wh0<T>, T> fr<T> a(P p) {
        if (p instanceof fr) {
            return (fr) p;
        }
        jr.b(p);
        return new gr(p);
    }

    public static <P extends wh0<T>, T> wh0<T> b(P p) {
        jr.b(p);
        return p instanceof gr ? p : new gr(p);
    }

    public static Object c(Object obj, Object obj2) {
        if (!(obj != c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException(C0059ao.a(6784) + obj + C0059ao.a(6785) + obj2 + C0059ao.a(6786));
    }

    @Override // defpackage.wh0
    public T get() {
        T t = (T) this.b;
        Object obj = c;
        if (t == obj) {
            synchronized (this) {
                t = this.b;
                if (t == obj) {
                    t = this.a.get();
                    c(this.b, t);
                    this.b = t;
                    this.a = null;
                }
            }
        }
        return t;
    }
}
