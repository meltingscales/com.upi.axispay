package com.google.android.gms.internal.measurement;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzgr {
    private static final zzgp zzajr = zzny();
    private static final zzgp zzajs = new zzgq();

    public static zzgp zznw() {
        return zzajr;
    }

    public static zzgp zznx() {
        return zzajs;
    }

    private static zzgp zzny() {
        try {
            return (zzgp) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
