package com.google.android.gms.internal.measurement;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzge {
    private static final zzgc zzaiw = zznr();
    private static final zzgc zzaix = new zzgd();

    public static zzgc zznp() {
        return zzaiw;
    }

    public static zzgc zznq() {
        return zzaix;
    }

    private static zzgc zznr() {
        try {
            return (zzgc) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
