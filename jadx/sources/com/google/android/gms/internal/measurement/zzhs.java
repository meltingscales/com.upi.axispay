package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzhs extends zzhq<zzhr, zzhr> {
    private static void zza(Object obj, zzhr zzhrVar) {
        ((zzez) obj).zzagn = zzhrVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final boolean zza(zzgx zzgxVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final /* synthetic */ void zzb(zzhr zzhrVar, int i, long j) {
        zzhrVar.zzb((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final /* synthetic */ void zzc(zzhr zzhrVar, zzil zzilVar) throws IOException {
        zzhrVar.zza(zzilVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final /* synthetic */ void zze(Object obj, zzhr zzhrVar) {
        zza(obj, zzhrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final /* synthetic */ void zzf(Object obj, zzhr zzhrVar) {
        zza(obj, zzhrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final /* synthetic */ zzhr zzg(zzhr zzhrVar, zzhr zzhrVar2) {
        zzhr zzhrVar3 = zzhrVar;
        zzhr zzhrVar4 = zzhrVar2;
        return zzhrVar4.equals(zzhr.zzor()) ? zzhrVar3 : zzhr.zza(zzhrVar3, zzhrVar4);
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final void zzi(Object obj) {
        ((zzez) obj).zzagn.zzjz();
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final /* synthetic */ zzhr zzoq() {
        return zzhr.zzos();
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final /* synthetic */ zzhr zzp(zzhr zzhrVar) {
        zzhr zzhrVar2 = zzhrVar;
        zzhrVar2.zzjz();
        return zzhrVar2;
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final /* synthetic */ int zzs(zzhr zzhrVar) {
        return zzhrVar.zzly();
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final /* synthetic */ zzhr zzw(Object obj) {
        return ((zzez) obj).zzagn;
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final /* synthetic */ zzhr zzx(Object obj) {
        zzhr zzhrVar = ((zzez) obj).zzagn;
        if (zzhrVar == zzhr.zzor()) {
            zzhr zzos = zzhr.zzos();
            zza(obj, zzos);
            return zzos;
        }
        return zzhrVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final /* synthetic */ int zzy(zzhr zzhrVar) {
        return zzhrVar.zzot();
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final /* synthetic */ void zza(zzhr zzhrVar, zzil zzilVar) throws IOException {
        zzhrVar.zzb(zzilVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final /* synthetic */ void zzc(zzhr zzhrVar, int i, int i2) {
        zzhrVar.zzb((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final /* synthetic */ void zza(zzhr zzhrVar, int i, zzhr zzhrVar2) {
        zzhrVar.zzb((i << 3) | 3, zzhrVar2);
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final /* synthetic */ void zza(zzhr zzhrVar, int i, zzdp zzdpVar) {
        zzhrVar.zzb((i << 3) | 2, zzdpVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final /* synthetic */ void zza(zzhr zzhrVar, int i, long j) {
        zzhrVar.zzb(i << 3, Long.valueOf(j));
    }
}
