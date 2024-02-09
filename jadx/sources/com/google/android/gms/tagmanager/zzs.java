package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* compiled from: AxisPay */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzs<K, V> {
    @VisibleForTesting
    public final zzr<K, V> zza = new zzq(this);

    public static final zzdb zza(int i, zzr<K, V> zzrVar) {
        return new zzdb(CommonUtils.BYTES_IN_A_MEGABYTE, zzrVar);
    }
}
