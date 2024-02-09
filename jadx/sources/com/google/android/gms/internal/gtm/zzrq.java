package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AxisPay */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzrq {
    private final Map<String, zzak> zza = new HashMap();
    private zzak zzb;

    private zzrq() {
    }

    public final zzro zza() {
        return new zzro(this.zza, this.zzb, null);
    }

    public final zzrq zzb(String str, zzak zzakVar) {
        this.zza.put(str, zzakVar);
        return this;
    }

    public final zzrq zzc(zzak zzakVar) {
        this.zzb = zzakVar;
        return this;
    }

    public /* synthetic */ zzrq(zzrp zzrpVar) {
    }
}
