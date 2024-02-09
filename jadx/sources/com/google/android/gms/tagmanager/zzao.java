package com.google.android.gms.tagmanager;

import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzao extends zzfl {
    private static final String zza = com.google.android.gms.internal.gtm.zza.CONTAINS.toString();

    public zzao() {
        super(zza);
    }

    @Override // com.google.android.gms.tagmanager.zzfl
    public final boolean zzc(String str, String str2, Map<String, com.google.android.gms.internal.gtm.zzak> map) {
        return str.contains(str2);
    }
}
