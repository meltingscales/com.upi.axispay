package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfp extends zzdj<String> implements zzfq, RandomAccess {
    private static final zzfp zzaih;
    private static final zzfq zzaii;
    private final List<Object> zzaij;

    static {
        zzfp zzfpVar = new zzfp();
        zzaih = zzfpVar;
        zzfpVar.zzjz();
        zzaii = zzfpVar;
    }

    public zzfp() {
        this(10);
    }

    private static String zzk(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdp) {
            return ((zzdp) obj).zzkd();
        }
        return zzfb.zzk((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zzka();
        this.zzaij.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzka();
        this.zzaij.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzaij.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdp) {
            zzdp zzdpVar = (zzdp) obj;
            String zzkd = zzdpVar.zzkd();
            if (zzdpVar.zzke()) {
                this.zzaij.set(i, zzkd);
            }
            return zzkd;
        }
        byte[] bArr = (byte[]) obj;
        String zzk = zzfb.zzk(bArr);
        if (zzfb.zzj(bArr)) {
            this.zzaij.set(i, zzk);
        }
        return zzk;
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        zzka();
        return zzk(this.zzaij.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzaij.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzfq
    public final Object zzaw(int i) {
        return this.zzaij.get(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzfq
    public final void zzc(zzdp zzdpVar) {
        zzka();
        this.zzaij.add(zzdpVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, com.google.android.gms.internal.measurement.zzfg
    public final /* bridge */ /* synthetic */ boolean zzjy() {
        return super.zzjy();
    }

    @Override // com.google.android.gms.internal.measurement.zzfq
    public final List<?> zzng() {
        return Collections.unmodifiableList(this.zzaij);
    }

    @Override // com.google.android.gms.internal.measurement.zzfq
    public final zzfq zznh() {
        return zzjy() ? new zzht(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.zzfg
    public final /* synthetic */ zzfg zzq(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzaij);
            return new zzfp(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public zzfp(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzka();
        if (collection instanceof zzfq) {
            collection = ((zzfq) collection).zzng();
        }
        boolean addAll = this.zzaij.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzka();
        Object remove = this.zzaij.remove(i);
        ((AbstractList) this).modCount++;
        return zzk(remove);
    }

    private zzfp(ArrayList<Object> arrayList) {
        this.zzaij = arrayList;
    }
}
