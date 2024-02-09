package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: AxisPay */
/* renamed from: b  reason: default package */
/* loaded from: classes.dex */
public abstract class b {
    public boolean a;
    public CopyOnWriteArrayList<a> b = new CopyOnWriteArrayList<>();

    public b(boolean z) {
        this.a = z;
    }

    public void a(a aVar) {
        this.b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.a;
    }

    public final void d() {
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public void e(a aVar) {
        this.b.remove(aVar);
    }

    public final void f(boolean z) {
        this.a = z;
    }
}
