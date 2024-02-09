package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzac {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzal zzb;
    private Long zzc;

    public zzac(zzal zzalVar, boolean z) {
        this.zzb = zzalVar;
        this.zza = z;
    }

    public final boolean zza(Container container) {
        Clock clock;
        zzam zzamVar;
        if (!this.zza) {
            return !container.isDefault();
        }
        long lastRefreshTime = container.getLastRefreshTime();
        if (this.zzc == null) {
            zzamVar = this.zzb.zzi;
            this.zzc = Long.valueOf(zzamVar.zza());
        }
        clock = this.zzb.zza;
        return lastRefreshTime + this.zzc.longValue() >= clock.currentTimeMillis();
    }
}
