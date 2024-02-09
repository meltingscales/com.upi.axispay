package com.google.android.gms.tagmanager;

import android.os.Build;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzew extends zzbu {
    private static final String zza = com.google.android.gms.internal.gtm.zza.SDK_VERSION.toString();

    public zzew() {
        super(zza, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.zzbu
    public final com.google.android.gms.internal.gtm.zzak zza(Map<String, com.google.android.gms.internal.gtm.zzak> map) {
        return zzfv.zzc(Integer.valueOf(Build.VERSION.SDK_INT));
    }

    @Override // com.google.android.gms.tagmanager.zzbu
    public final boolean zzb() {
        return true;
    }
}
