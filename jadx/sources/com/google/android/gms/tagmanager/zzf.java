package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzf extends zzbu {
    private static final String zza = com.google.android.gms.internal.gtm.zza.ADVERTISING_TRACKING_ENABLED.toString();
    private final zzd zzb;

    @VisibleForTesting
    public zzf(zzd zzdVar) {
        super(zza, new String[0]);
        this.zzb = zzdVar;
    }

    @Override // com.google.android.gms.tagmanager.zzbu
    public final com.google.android.gms.internal.gtm.zzak zza(Map<String, com.google.android.gms.internal.gtm.zzak> map) {
        return zzfv.zzc(Boolean.valueOf(!this.zzb.zzf()));
    }

    @Override // com.google.android.gms.tagmanager.zzbu
    public final boolean zzb() {
        return false;
    }
}
