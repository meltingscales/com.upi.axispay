package com.google.android.gms.vision.clearcut;

import javax.annotation.concurrent.GuardedBy;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzb {
    private final Object zzb = new Object();
    @GuardedBy("lock")
    private long zzc = Long.MIN_VALUE;
    private final long zza = Math.round(30000.0d);

    public zzb(double d) {
    }

    public final boolean zza() {
        synchronized (this.zzb) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.zzc + this.zza > currentTimeMillis) {
                return false;
            }
            this.zzc = currentTimeMillis;
            return true;
        }
    }
}
