package defpackage;

import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: nn0  reason: default package */
/* loaded from: classes.dex */
public final class nn0<T, R> implements hn0<R> {
    public final hn0<T> a;
    public final dl0<T, R> b;

    /* compiled from: AxisPay */
    /* renamed from: nn0$a */
    /* loaded from: classes.dex */
    public static final class a implements Iterator<R>, om0 {
        public final Iterator<T> b;
        public final /* synthetic */ nn0<T, R> c;

        public a(nn0<T, R> nn0Var) {
            this.c = nn0Var;
            this.b = nn0Var.a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.c.b.invoke(this.b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(C0059ao.a(7989));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nn0(hn0<? extends T> hn0Var, dl0<? super T, ? extends R> dl0Var) {
        yl0.e(hn0Var, C0059ao.a(6374));
        yl0.e(dl0Var, C0059ao.a(6375));
        this.a = hn0Var;
        this.b = dl0Var;
    }

    @Override // defpackage.hn0
    public Iterator<R> iterator() {
        return new a(this);
    }
}
