package com.google.android.gms.internal.gtm;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzui {
    private final Object zza;
    private final int zzb;

    public zzui(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzui) {
            zzui zzuiVar = (zzui) obj;
            return this.zza == zzuiVar.zza && this.zzb == zzuiVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
