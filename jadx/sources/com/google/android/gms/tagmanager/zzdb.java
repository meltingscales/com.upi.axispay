package com.google.android.gms.tagmanager;

import android.annotation.TargetApi;
import android.util.LruCache;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* compiled from: AxisPay */
@TargetApi(12)
/* loaded from: classes.dex */
public final class zzdb<K, V> {
    private final LruCache<K, V> zza;

    public zzdb(int i, zzr<K, V> zzrVar) {
        this.zza = new zzda(this, CommonUtils.BYTES_IN_A_MEGABYTE, zzrVar);
    }

    public final V zza(K k) {
        return this.zza.get(k);
    }

    public final void zzb(K k, V v) {
        this.zza.put(k, v);
    }
}
