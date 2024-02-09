package com.google.android.gms.vision;

import android.util.SparseIntArray;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: AxisPay */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzc {
    private static final Object zza = new Object();
    @GuardedBy("lock")
    private static int zzb;
    @GuardedBy("lock")
    private final SparseIntArray zzc = new SparseIntArray();
    @GuardedBy("lock")
    private final SparseIntArray zzd = new SparseIntArray();

    public final int zza(int i) {
        synchronized (zza) {
            int i2 = this.zzc.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            int i3 = zzb;
            zzb = i3 + 1;
            this.zzc.append(i, i3);
            this.zzd.append(i3, i);
            return i3;
        }
    }

    public final int zzb(int i) {
        int i2;
        synchronized (zza) {
            i2 = this.zzd.get(i);
        }
        return i2;
    }
}
