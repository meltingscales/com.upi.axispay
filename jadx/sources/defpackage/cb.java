package defpackage;

/* compiled from: AxisPay */
/* renamed from: cb  reason: default package */
/* loaded from: classes.dex */
public class cb<T> extends bb<T> {
    public final Object c;

    public cb(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.bb, defpackage.ab
    public boolean a(T t) {
        boolean a;
        synchronized (this.c) {
            a = super.a(t);
        }
        return a;
    }

    @Override // defpackage.bb, defpackage.ab
    public T b() {
        T t;
        synchronized (this.c) {
            t = (T) super.b();
        }
        return t;
    }
}
