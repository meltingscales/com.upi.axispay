package com.google.android.gms.tagmanager;

import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfk extends zzfl {
    private static final String zza = com.google.android.gms.internal.gtm.zza.STARTS_WITH.toString();

    public zzfk() {
        super(zza);
    }

    @Override // com.google.android.gms.tagmanager.zzfl
    public final boolean zzc(String str, String str2, Map<String, com.google.android.gms.internal.gtm.zzak> map) {
        return str.startsWith(str2);
    }
}
