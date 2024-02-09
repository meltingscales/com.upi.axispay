package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzgd implements zzgc {
    @Override // com.google.android.gms.internal.measurement.zzgc
    public final Object zzb(Object obj, Object obj2) {
        zzgb zzgbVar = (zzgb) obj;
        zzgb zzgbVar2 = (zzgb) obj2;
        if (!zzgbVar2.isEmpty()) {
            if (!zzgbVar.isMutable()) {
                zzgbVar = zzgbVar.zznn();
            }
            zzgbVar.zza(zzgbVar2);
        }
        return zzgbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzgc
    public final Map<?, ?> zzm(Object obj) {
        return (zzgb) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzgc
    public final Map<?, ?> zzn(Object obj) {
        return (zzgb) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzgc
    public final boolean zzo(Object obj) {
        return !((zzgb) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.measurement.zzgc
    public final Object zzp(Object obj) {
        ((zzgb) obj).zzjz();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzgc
    public final Object zzq(Object obj) {
        return zzgb.zznm().zznn();
    }

    @Override // com.google.android.gms.internal.measurement.zzgc
    public final zzga<?, ?> zzr(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.zzgc
    public final int zzb(int i, Object obj, Object obj2) {
        zzgb zzgbVar = (zzgb) obj;
        if (zzgbVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzgbVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
        return 0;
    }
}
