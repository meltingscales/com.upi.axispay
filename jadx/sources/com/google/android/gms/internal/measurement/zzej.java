package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzej extends zzdj<Double> implements zzfg<Double>, zzgt, RandomAccess {
    private static final zzej zzadg;
    private int size;
    private double[] zzadh;

    static {
        zzej zzejVar = new zzej(new double[0], 0);
        zzadg = zzejVar;
        zzejVar.zzjz();
    }

    public zzej() {
        this(new double[10], 0);
    }

    private final void zzc(int i, double d) {
        int i2;
        zzka();
        if (i >= 0 && i <= (i2 = this.size)) {
            double[] dArr = this.zzadh;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.zzadh, i, dArr2, i + 1, this.size - i);
                this.zzadh = dArr2;
            }
            this.zzadh[i] = d;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzp(i));
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
        zzc(i, ((Double) obj).doubleValue());
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        zzka();
        zzfb.checkNotNull(collection);
        if (!(collection instanceof zzej)) {
            return super.addAll(collection);
        }
        zzej zzejVar = (zzej) collection;
        int i = zzejVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.zzadh;
            if (i3 > dArr.length) {
                this.zzadh = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zzejVar.zzadh, 0, this.zzadh, this.size, zzejVar.size);
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
        if (!(obj instanceof zzej)) {
            return super.equals(obj);
        }
        zzej zzejVar = (zzej) obj;
        if (this.size != zzejVar.size) {
            return false;
        }
        double[] dArr = zzejVar.zzadh;
        for (int i = 0; i < this.size; i++) {
            if (Double.doubleToLongBits(this.zzadh[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzo(i);
        return Double.valueOf(this.zzadh[i]);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzfb.zzba(Double.doubleToLongBits(this.zzadh[i2]));
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzka();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Double.valueOf(this.zzadh[i]))) {
                double[] dArr = this.zzadh;
                System.arraycopy(dArr, i + 1, dArr, i, (this.size - i) - 1);
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
            double[] dArr = this.zzadh;
            System.arraycopy(dArr, i2, dArr, i, this.size - i2);
            this.size -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zzka();
        zzo(i);
        double[] dArr = this.zzadh;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzf(double d) {
        zzc(this.size, d);
    }

    @Override // com.google.android.gms.internal.measurement.zzfg
    public final /* synthetic */ zzfg<Double> zzq(int i) {
        if (i >= this.size) {
            return new zzej(Arrays.copyOf(this.zzadh, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    private zzej(double[] dArr, int i) {
        this.zzadh = dArr;
        this.size = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        zzka();
        zzo(i);
        double[] dArr = this.zzadh;
        double d = dArr[i];
        if (i < this.size - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }
}
