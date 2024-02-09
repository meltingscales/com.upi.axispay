package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzhu implements ListIterator<String> {
    private ListIterator<String> zzaks;
    private final /* synthetic */ int zzakt;
    private final /* synthetic */ zzht zzaku;

    public zzhu(zzht zzhtVar, int i) {
        zzfq zzfqVar;
        this.zzaku = zzhtVar;
        this.zzakt = i;
        zzfqVar = zzhtVar.zzakr;
        this.zzaks = zzfqVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zzaks.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzaks.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.zzaks.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzaks.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.zzaks.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzaks.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
