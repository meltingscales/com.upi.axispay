package com.google.android.gms.internal.vision;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzir {
    private static final zziq<?> zza = new zzip();
    private static final zziq<?> zzb = zzc();

    public static zziq<?> zza() {
        return zza;
    }

    public static zziq<?> zzb() {
        zziq<?> zziqVar = zzb;
        if (zziqVar != null) {
            return zziqVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static zziq<?> zzc() {
        try {
            return (zziq) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
