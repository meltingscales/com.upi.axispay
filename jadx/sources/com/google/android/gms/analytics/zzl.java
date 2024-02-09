package com.google.android.gms.analytics;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashSet;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzl implements Runnable {
    public final /* synthetic */ zzh zza;
    public final /* synthetic */ zzr zzb;

    public zzl(zzr zzrVar, zzh zzhVar) {
        this.zzb = zzrVar;
        this.zza = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<zzs> list;
        this.zza.zzd().zze(this.zza);
        list = this.zzb.zzc;
        for (zzs zzsVar : list) {
            zzsVar.zza();
        }
        zzh zzhVar = this.zza;
        Preconditions.checkNotMainThread("deliver should be called from worker thread");
        Preconditions.checkArgument(zzhVar.zzm(), "Measurement must be submitted");
        List<zzt> zzf = zzhVar.zzf();
        if (zzf.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (zzt zztVar : zzf) {
            Uri zzb = zztVar.zzb();
            if (!hashSet.contains(zzb)) {
                hashSet.add(zzb);
                zztVar.zze(zzhVar);
            }
        }
    }
}
