package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzez;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzey implements zzgg {
    private static final zzey zzagm = new zzey();

    private zzey() {
    }

    public static zzey zzmf() {
        return zzagm;
    }

    @Override // com.google.android.gms.internal.measurement.zzgg
    public final boolean zzb(Class<?> cls) {
        return zzez.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zzgg
    public final zzgf zzc(Class<?> cls) {
        if (!zzez.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (zzgf) zzez.zzd(cls.asSubclass(zzez.class)).zza(zzez.zze.zzagw, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
