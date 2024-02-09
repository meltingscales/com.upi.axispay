package com.google.android.gms.tagmanager;

import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbw extends zzdr {
    private static final String zza = com.google.android.gms.internal.gtm.zza.GREATER_EQUALS.toString();

    public zzbw() {
        super(zza);
    }

    @Override // com.google.android.gms.tagmanager.zzdr
    public final boolean zzc(zzfu zzfuVar, zzfu zzfuVar2, Map<String, com.google.android.gms.internal.gtm.zzak> map) {
        return zzfuVar.compareTo(zzfuVar2) >= 0;
    }
}
