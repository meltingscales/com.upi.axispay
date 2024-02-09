package com.google.android.gms.tagmanager;

import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbx extends zzdr {
    private static final String zza = com.google.android.gms.internal.gtm.zza.GREATER_THAN.toString();

    public zzbx() {
        super(zza);
    }

    @Override // com.google.android.gms.tagmanager.zzdr
    public final boolean zzc(zzfu zzfuVar, zzfu zzfuVar2, Map<String, com.google.android.gms.internal.gtm.zzak> map) {
        return zzfuVar.compareTo(zzfuVar2) > 0;
    }
}
