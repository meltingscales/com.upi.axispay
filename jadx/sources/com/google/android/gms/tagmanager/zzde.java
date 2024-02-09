package com.google.android.gms.tagmanager;

import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzde extends zzdr {
    private static final String zza = com.google.android.gms.internal.gtm.zza.LESS_THAN.toString();

    public zzde() {
        super(zza);
    }

    @Override // com.google.android.gms.tagmanager.zzdr
    public final boolean zzc(zzfu zzfuVar, zzfu zzfuVar2, Map<String, com.google.android.gms.internal.gtm.zzak> map) {
        return zzfuVar.compareTo(zzfuVar2) < 0;
    }
}
