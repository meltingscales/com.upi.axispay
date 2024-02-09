package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: kj0  reason: default package */
/* loaded from: classes.dex */
public final class kj0 implements List, Serializable, RandomAccess, om0 {
    public static final kj0 b = new kj0();

    public void a(int i, Void r2) {
        throw new UnsupportedOperationException(C0059ao.a(13684));
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        a(i, (Void) obj);
        throw null;
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException(C0059ao.a(13685));
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException(C0059ao.a(13686));
    }

    public boolean b(Void r2) {
        throw new UnsupportedOperationException(C0059ao.a(13687));
    }

    public boolean c(Void r2) {
        yl0.e(r2, C0059ao.a(13688));
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(C0059ao.a(13689));
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return c((Void) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        yl0.e(collection, C0059ao.a(13690));
        return collection.isEmpty();
    }

    public Void d(int i) {
        throw new IndexOutOfBoundsException(C0059ao.a(13691) + i + '.');
    }

    public int e() {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public int f(Void r2) {
        yl0.e(r2, C0059ao.a(13692));
        return -1;
    }

    public int g(Void r2) {
        yl0.e(r2, C0059ao.a(13693));
        return -1;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        d(i);
        throw null;
    }

    public Void h(int i, Void r2) {
        throw new UnsupportedOperationException(C0059ao.a(13694));
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return f((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return jj0.b;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return g((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return jj0.b;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException(C0059ao.a(13696));
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(C0059ao.a(13697));
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException(C0059ao.a(13698));
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException(C0059ao.a(13699));
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        h(i, (Void) obj);
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(C0059ao.a(13700) + i + C0059ao.a(13701) + i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return ul0.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        yl0.e(tArr, C0059ao.a(13702));
        return (T[]) ul0.b(this, tArr);
    }

    public String toString() {
        return C0059ao.a(13703);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        b((Void) obj);
        throw null;
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        if (i == 0) {
            return jj0.b;
        }
        throw new IndexOutOfBoundsException(yl0.l(C0059ao.a(13695), Integer.valueOf(i)));
    }
}
