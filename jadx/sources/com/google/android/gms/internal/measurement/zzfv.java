package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfv extends zzdj<Long> implements zzff, zzgt, RandomAccess {
    private static final zzfv zzain;
    private int size;
    private long[] zzaio;

    static {
        zzfv zzfvVar = new zzfv(new long[0], 0);
        zzain = zzfvVar;
        zzfvVar.zzjz();
    }

    public zzfv() {
        this(new long[10], 0);
    }

    private final void zzk(int i, long j) {
        int i2;
        zzka();
        if (i >= 0 && i <= (i2 = this.size)) {
            long[] jArr = this.zzaio;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.zzaio, i, jArr2, i + 1, this.size - i);
                this.zzaio = jArr2;
            }
            this.zzaio[i] = j;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzp(i));
    }

    public static zzfv zznk() {
        return zzain;
    }

    private final void zzo(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzp(i));
        }
    }

    private final String zzp(int i) {
        int i2 = this.size;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zzk(i, ((Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        zzka();
        zzfb.checkNotNull(collection);
        if (!(collection instanceof zzfv)) {
            return super.addAll(collection);
        }
        zzfv zzfvVar = (zzfv) collection;
        int i = zzfvVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.zzaio;
            if (i3 > jArr.length) {
                this.zzaio = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zzfvVar.zzaio, 0, this.zzaio, this.size, zzfvVar.size);
            this.size = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfv)) {
            return super.equals(obj);
        }
        zzfv zzfvVar = (zzfv) obj;
        if (this.size != zzfvVar.size) {
            return false;
        }
        long[] jArr = zzfvVar.zzaio;
        for (int i = 0; i < this.size; i++) {
            if (this.zzaio[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzff
    public final long getLong(int i) {
        zzo(i);
        return this.zzaio[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzfb.zzba(this.zzaio[i2]);
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzka();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Long.valueOf(this.zzaio[i]))) {
                long[] jArr = this.zzaio;
                System.arraycopy(jArr, i + 1, jArr, i, (this.size - i) - 1);
                this.size--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzka();
        if (i2 >= i) {
            long[] jArr = this.zzaio;
            System.arraycopy(jArr, i2, jArr, i, this.size - i2);
            this.size -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzka();
        zzo(i);
        long[] jArr = this.zzaio;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.measurement.zzfg
    /* renamed from: zzav */
    public final zzff zzq(int i) {
        if (i >= this.size) {
            return new zzfv(Arrays.copyOf(this.zzaio, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzff
    public final void zzbb(long j) {
        zzk(this.size, j);
    }

    private zzfv(long[] jArr, int i) {
        this.zzaio = jArr;
        this.size = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        zzka();
        zzo(i);
        long[] jArr = this.zzaio;
        long j = jArr[i];
        if (i < this.size - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }
}
