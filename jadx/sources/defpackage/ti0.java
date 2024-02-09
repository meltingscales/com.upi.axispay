package defpackage;

import java.util.Collection;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ti0  reason: default package */
/* loaded from: classes.dex */
public final class ti0<T> implements Collection<T>, om0 {
    public final T[] b;
    public final boolean c;

    public ti0(T[] tArr, boolean z) {
        yl0.e(tArr, C0059ao.a(326));
        this.b = tArr;
        this.c = z;
    }

    public int a() {
        return this.b.length;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException(C0059ao.a(327));
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException(C0059ao.a(328));
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(C0059ao.a(329));
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return xi0.k(this.b, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        yl0.e(collection, C0059ao.a(330));
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return ql0.a(this.b);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(C0059ao.a(331));
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(C0059ao.a(332));
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(C0059ao.a(333));
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return zi0.a(this.b, this.c);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        yl0.e(tArr, C0059ao.a(334));
        return (T[]) ul0.b(this, tArr);
    }
}
