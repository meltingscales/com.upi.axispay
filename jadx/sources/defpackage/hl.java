package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AxisPay */
/* renamed from: hl  reason: default package */
/* loaded from: classes.dex */
public abstract class hl {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final bl b;
    public volatile fm c;

    public hl(bl blVar) {
        this.b = blVar;
    }

    public fm a() {
        b();
        return e(this.a.compareAndSet(false, true));
    }

    public void b() {
        this.b.a();
    }

    public final fm c() {
        return this.b.d(d());
    }

    public abstract String d();

    public final fm e(boolean z) {
        if (z) {
            if (this.c == null) {
                this.c = c();
            }
            return this.c;
        }
        return c();
    }

    public void f(fm fmVar) {
        if (fmVar == this.c) {
            this.a.set(false);
        }
    }
}
