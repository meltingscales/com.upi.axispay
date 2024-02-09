package defpackage;

import java.util.Collection;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ri0  reason: default package */
/* loaded from: classes.dex */
public abstract class ri0<E> implements Collection<E>, om0 {

    /* compiled from: AxisPay */
    /* renamed from: ri0$a */
    /* loaded from: classes.dex */
    public static final class a extends zl0 implements dl0<E, CharSequence> {
        public final /* synthetic */ ri0<E> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ri0<? extends E> ri0Var) {
            super(1);
            this.b = ri0Var;
        }

        @Override // defpackage.dl0
        /* renamed from: b */
        public final CharSequence invoke(E e) {
            return e == this.b ? C0059ao.a(10904) : String.valueOf(e);
        }
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException(C0059ao.a(6000));
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException(C0059ao.a(6001));
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(C0059ao.a(6002));
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(E e) {
        if (isEmpty()) {
            return false;
        }
        for (E e2 : this) {
            if (yl0.a(e2, e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        yl0.e(collection, C0059ao.a(6003));
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public abstract int getSize();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public abstract Iterator<E> iterator();

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(C0059ao.a(6004));
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(C0059ao.a(6005));
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(C0059ao.a(6006));
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return ul0.a(this);
    }

    public String toString() {
        return ij0.A(this, C0059ao.a(6008), C0059ao.a(6009), C0059ao.a(6010), 0, null, new a(this), 24, null);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        yl0.e(tArr, C0059ao.a(6007));
        return (T[]) ul0.b(this, tArr);
    }
}
