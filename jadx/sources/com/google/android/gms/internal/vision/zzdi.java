package com.google.android.gms.internal.vision;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdi {
    public static <T> zzdf<T> zza(zzdf<T> zzdfVar) {
        if ((zzdfVar instanceof zzdk) || (zzdfVar instanceof zzdh)) {
            return zzdfVar;
        }
        if (zzdfVar instanceof Serializable) {
            return new zzdh(zzdfVar);
        }
        return new zzdk(zzdfVar);
    }

    public static <T> zzdf<T> zza(@NullableDecl T t) {
        return new zzdj(t);
    }
}
