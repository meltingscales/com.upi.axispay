package com.google.android.gms.internal.measurement;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfy implements zzgg {
    private zzgg[] zzair;

    public zzfy(zzgg... zzggVarArr) {
        this.zzair = zzggVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzgg
    public final boolean zzb(Class<?> cls) {
        for (zzgg zzggVar : this.zzair) {
            if (zzggVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzgg
    public final zzgf zzc(Class<?> cls) {
        zzgg[] zzggVarArr;
        for (zzgg zzggVar : this.zzair) {
            if (zzggVar.zzb(cls)) {
                return zzggVar.zzc(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
