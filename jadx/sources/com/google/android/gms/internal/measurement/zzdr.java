package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdr implements Comparator<zzdp> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzdp zzdpVar, zzdp zzdpVar2) {
        int zza;
        int zza2;
        zzdp zzdpVar3 = zzdpVar;
        zzdp zzdpVar4 = zzdpVar2;
        zzdw zzdwVar = (zzdw) zzdpVar3.iterator();
        zzdw zzdwVar2 = (zzdw) zzdpVar4.iterator();
        while (zzdwVar.hasNext() && zzdwVar2.hasNext()) {
            zza = zzdp.zza(zzdwVar.nextByte());
            zza2 = zzdp.zza(zzdwVar2.nextByte());
            int compare = Integer.compare(zza, zza2);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzdpVar3.size(), zzdpVar4.size());
    }
}
