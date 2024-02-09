package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzgu {
    private static final zzgu zzajt = new zzgu();
    private final ConcurrentMap<Class<?>, zzgy<?>> zzajv = new ConcurrentHashMap();
    private final zzgz zzaju = new zzfw();

    private zzgu() {
    }

    public static zzgu zznz() {
        return zzajt;
    }

    public final <T> zzgy<T> zzf(Class<T> cls) {
        zzfb.zza(cls, "messageType");
        zzgy<T> zzgyVar = (zzgy<T>) this.zzajv.get(cls);
        if (zzgyVar == null) {
            zzgy<T> zze = this.zzaju.zze(cls);
            zzfb.zza(cls, "messageType");
            zzfb.zza(zze, "schema");
            zzgy<T> zzgyVar2 = (zzgy<T>) this.zzajv.putIfAbsent(cls, zze);
            return zzgyVar2 != null ? zzgyVar2 : zze;
        }
        return zzgyVar;
    }

    public final <T> zzgy<T> zzv(T t) {
        return zzf(t.getClass());
    }
}
