package com.google.android.gms.internal.gtm;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzwg {
    private static final zzwf zza;
    private static final zzwf zzb;

    static {
        zzwf zzwfVar;
        try {
            zzwfVar = (zzwf) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzwfVar = null;
        }
        zza = zzwfVar;
        zzb = new zzwf();
    }

    public static zzwf zza() {
        return zza;
    }

    public static zzwf zzb() {
        return zzb;
    }
}
