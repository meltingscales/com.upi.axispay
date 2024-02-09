package com.google.android.gms.tagmanager;

import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;

/* compiled from: AxisPay */
@ShowFirstParty
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzbs extends zzfl {
    private static final String zza = com.google.android.gms.internal.gtm.zza.EQUALS.toString();

    public zzbs() {
        super(zza);
    }

    @Override // com.google.android.gms.tagmanager.zzfl
    public final boolean zzc(String str, String str2, Map<String, com.google.android.gms.internal.gtm.zzak> map) {
        return str.equals(str2);
    }
}
