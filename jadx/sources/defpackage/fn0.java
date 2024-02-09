package defpackage;

import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: fn0  reason: default package */
/* loaded from: classes.dex */
public final class fn0<T> implements hn0<T>, gn0<T> {
    public final hn0<T> a;
    public final int b;

    /* compiled from: AxisPay */
    /* renamed from: fn0$a */
    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, om0 {
        public final Iterator<T> b;
        public int c;
        public final /* synthetic */ fn0<T> d;

        public a(fn0<T> fn0Var) {
            this.d = fn0Var;
            this.b = fn0Var.a.iterator();
            this.c = fn0Var.b;
        }

        public final void a() {
            while (this.c > 0 && this.b.hasNext()) {
                this.b.next();
                this.c--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(C0059ao.a(3211));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fn0(hn0<? extends T> hn0Var, int i) {
        yl0.e(hn0Var, C0059ao.a(15734));
        this.a = hn0Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException((C0059ao.a(15735) + i + '.').toString());
    }

    @Override // defpackage.gn0
    public hn0<T> a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new fn0(this, i) : new fn0(this.a, i2);
    }

    @Override // defpackage.hn0
    public Iterator<T> iterator() {
        return new a(this);
    }
}
