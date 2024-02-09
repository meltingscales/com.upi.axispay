package com.google.android.gms.internal.gtm;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzwt {
    private static final zzwt zza = new zzwt();
    private final ConcurrentMap<Class<?>, zzwx<?>> zzc = new ConcurrentHashMap();
    private final zzwy zzb = new zzwc();

    private zzwt() {
    }

    public static zzwt zza() {
        return zza;
    }

    public final <T> zzwx<T> zzb(Class<T> cls) {
        zzvi.zzf(cls, "messageType");
        zzwx<T> zzwxVar = (zzwx<T>) this.zzc.get(cls);
        if (zzwxVar == null) {
            zzwxVar = this.zzb.zza(cls);
            zzvi.zzf(cls, "messageType");
            zzvi.zzf(zzwxVar, "schema");
            zzwx putIfAbsent = this.zzc.putIfAbsent(cls, zzwxVar);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return zzwxVar;
    }
}
