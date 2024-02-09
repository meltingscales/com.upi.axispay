package com.google.android.gms.internal.gtm;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzwr {
    private static final zzwq zza;
    private static final zzwq zzb;

    static {
        zzwq zzwqVar;
        try {
            zzwqVar = (zzwq) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzwqVar = null;
        }
        zza = zzwqVar;
        zzb = new zzwq();
    }

    public static zzwq zza() {
        return zza;
    }

    public static zzwq zzb() {
        return zzb;
    }
}
