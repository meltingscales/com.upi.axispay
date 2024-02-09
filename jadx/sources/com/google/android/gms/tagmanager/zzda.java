package com.google.android.gms.tagmanager;

import android.util.LruCache;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzda extends LruCache {
    public final /* synthetic */ zzr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzda(zzdb zzdbVar, int i, zzr zzrVar) {
        super(CommonUtils.BYTES_IN_A_MEGABYTE);
        this.zza = zzrVar;
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        return this.zza.zza(obj, obj2);
    }
}
