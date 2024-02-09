package com.google.android.gms.internal.gtm;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzwb implements zzwi {
    private final zzwi[] zza;

    public zzwb(zzwi... zzwiVarArr) {
        this.zza = zzwiVarArr;
    }

    @Override // com.google.android.gms.internal.gtm.zzwi
    public final zzwh zzb(Class<?> cls) {
        zzwi[] zzwiVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzwi zzwiVar = zzwiVarArr[i];
            if (zzwiVar.zzc(cls)) {
                return zzwiVar.zzb(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.gtm.zzwi
    public final boolean zzc(Class<?> cls) {
        zzwi[] zzwiVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzwiVarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
