package com.google.android.gms.internal.vision;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzej<E> extends zzeb<E> implements Set<E> {
    @NullableDecl
    private transient zzee<E> zza;

    public static int zza(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        zzde.zza(max < 1073741824, "collection too large");
        return CommonUtils.BYTES_IN_A_GIGABYTE;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzej) && zzg() && ((zzej) obj).zzg() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzey.zza(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzey.zza(this);
    }

    @Override // com.google.android.gms.internal.vision.zzeb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.android.gms.internal.vision.zzeb
    public zzee<E> zze() {
        zzee<E> zzeeVar = this.zza;
        if (zzeeVar == null) {
            zzee<E> zzh = zzh();
            this.zza = zzh;
            return zzh;
        }
        return zzeeVar;
    }

    public boolean zzg() {
        return false;
    }

    public zzee<E> zzh() {
        return zzee.zza(toArray());
    }
}
