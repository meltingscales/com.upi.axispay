package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjb;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzjc implements zzkl {
    private static final zzjc zza = new zzjc();

    private zzjc() {
    }

    public static zzjc zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.vision.zzkl
    public final zzki zzb(Class<?> cls) {
        if (!zzjb.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (zzki) zzjb.zza((Class<zzjb>) cls.asSubclass(zzjb.class)).zza(zzjb.zzg.zzc, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkl
    public final boolean zza(Class<?> cls) {
        return zzjb.class.isAssignableFrom(cls);
    }
}
