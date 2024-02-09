package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzht extends AbstractList<String> implements zzfq, RandomAccess {
    private final zzfq zzakr;

    public zzht(zzfq zzfqVar) {
        this.zzakr = zzfqVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.zzakr.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzhv(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new zzhu(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzakr.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzfq
    public final Object zzaw(int i) {
        return this.zzakr.zzaw(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzfq
    public final void zzc(zzdp zzdpVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.zzfq
    public final List<?> zzng() {
        return this.zzakr.zzng();
    }

    @Override // com.google.android.gms.internal.measurement.zzfq
    public final zzfq zznh() {
        return this;
    }
}
