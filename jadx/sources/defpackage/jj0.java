package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: jj0  reason: default package */
/* loaded from: classes.dex */
public final class jj0 implements ListIterator, om0 {
    public static final jj0 b = new jj0();

    public void a(Void r2) {
        throw new UnsupportedOperationException(C0059ao.a(14730));
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(Object obj) {
        a((Void) obj);
        throw null;
    }

    public Void b() {
        throw new NoSuchElementException();
    }

    public Void c() {
        throw new NoSuchElementException();
    }

    public void d(Void r2) {
        throw new UnsupportedOperationException(C0059ao.a(14731));
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        b();
        throw null;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ Object previous() {
        c();
        throw null;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(C0059ao.a(14732));
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(Object obj) {
        d((Void) obj);
        throw null;
    }
}
