package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: mj0  reason: default package */
/* loaded from: classes.dex */
public final class mj0 implements Set, Serializable, om0 {
    public static final mj0 b = new mj0();

    public boolean a(Void r2) {
        throw new UnsupportedOperationException(C0059ao.a(7742));
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        a((Void) obj);
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException(C0059ao.a(7743));
    }

    public boolean b(Void r2) {
        yl0.e(r2, C0059ao.a(7744));
        return false;
    }

    public int c() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(C0059ao.a(7745));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return b((Void) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        yl0.e(collection, C0059ao.a(7746));
        return collection.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return jj0.b;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(C0059ao.a(7747));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException(C0059ao.a(7748));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException(C0059ao.a(7749));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return ul0.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        yl0.e(tArr, C0059ao.a(7750));
        return (T[]) ul0.b(this, tArr);
    }

    public String toString() {
        return C0059ao.a(7751);
    }
}
