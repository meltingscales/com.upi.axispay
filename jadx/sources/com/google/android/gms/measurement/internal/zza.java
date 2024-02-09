package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zza extends zze {
    private final Map<String, Long> zzby;
    private final Map<String, Integer> zzbz;
    private long zzca;

    public zza(zzby zzbyVar) {
        super(zzbyVar);
        this.zzbz = new o4();
        this.zzby = new o4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str, long j) {
        zzo();
        zzq();
        Preconditions.checkNotEmpty(str);
        if (this.zzbz.isEmpty()) {
            this.zzca = j;
        }
        Integer num = this.zzbz.get(str);
        if (num != null) {
            this.zzbz.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.zzbz.size() >= 100) {
            zzad().zzdd().zzaq("Too many ads visible");
        } else {
            this.zzbz.put(str, 1);
            this.zzby.put(str, Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(String str, long j) {
        zzo();
        zzq();
        Preconditions.checkNotEmpty(str);
        Integer num = this.zzbz.get(str);
        if (num != null) {
            zzec zzfc = zzv().zzfc();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.zzbz.remove(str);
                Long l = this.zzby.get(str);
                if (l == null) {
                    zzad().zzda().zzaq("First ad unit exposure time was never set");
                } else {
                    this.zzby.remove(str);
                    zza(str, j - l.longValue(), zzfc);
                }
                if (this.zzbz.isEmpty()) {
                    long j2 = this.zzca;
                    if (j2 == 0) {
                        zzad().zzda().zzaq("First ad exposure time was never set");
                        return;
                    }
                    zza(j - j2, zzfc);
                    this.zzca = 0L;
                    return;
                }
                return;
            }
            this.zzbz.put(str, Integer.valueOf(intValue));
            return;
        }
        zzad().zzda().zza("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(long j) {
        for (String str : this.zzby.keySet()) {
            this.zzby.put(str, Long.valueOf(j));
        }
        if (this.zzby.isEmpty()) {
            return;
        }
        this.zzca = j;
    }

    public final void beginAdUnitExposure(String str, long j) {
        if (str != null && str.length() != 0) {
            zzac().zza(new zzb(this, str, j));
        } else {
            zzad().zzda().zzaq("Ad unit id must be a non-empty string");
        }
    }

    public final void endAdUnitExposure(String str, long j) {
        if (str != null && str.length() != 0) {
            zzac().zza(new zzc(this, str, j));
        } else {
            zzad().zzda().zzaq("Ad unit id must be a non-empty string");
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzas zzaa() {
        return super.zzaa();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzgd zzab() {
        return super.zzab();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ zzbt zzac() {
        return super.zzac();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ zzau zzad() {
        return super.zzad();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzbf zzae() {
        return super.zzae();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzt zzaf() {
        return super.zzaf();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ zzq zzag() {
        return super.zzag();
    }

    public final void zzc(long j) {
        zzec zzfc = zzv().zzfc();
        for (String str : this.zzby.keySet()) {
            zza(str, j - this.zzby.get(str).longValue(), zzfc);
        }
        if (!this.zzby.isEmpty()) {
            zza(j - this.zzca, zzfc);
        }
        zzd(j);
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzn() {
        super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzo() {
        super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzp() {
        super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzq() {
        super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zza zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzdd zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzap zzt() {
        return super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzeg zzu() {
        return super.zzu();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzed zzv() {
        return super.zzv();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzaq zzw() {
        return super.zzw();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzfj zzx() {
        return super.zzx();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzad zzy() {
        return super.zzy();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Clock zzz() {
        return super.zzz();
    }

    private final void zza(long j, zzec zzecVar) {
        if (zzecVar == null) {
            zzad().zzdi().zzaq("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            zzad().zzdi().zza("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            zzed.zza(zzecVar, bundle, true);
            zzs().logEvent("am", "_xa", bundle);
        }
    }

    private final void zza(String str, long j, zzec zzecVar) {
        if (zzecVar == null) {
            zzad().zzdi().zzaq("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            zzad().zzdi().zza("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            zzed.zza(zzecVar, bundle, true);
            zzs().logEvent("am", "_xu", bundle);
        }
    }
}
