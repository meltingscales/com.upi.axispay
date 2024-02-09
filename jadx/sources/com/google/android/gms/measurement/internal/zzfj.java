package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfj extends zzf {
    private Handler handler;
    @VisibleForTesting
    private long zzrk;
    @VisibleForTesting
    private long zzrl;
    private final zzab zzrm;
    private final zzab zzrn;

    public zzfj(zzby zzbyVar) {
        super(zzbyVar);
        this.zzrm = new zzfk(this, this.zzl);
        this.zzrn = new zzfl(this, this.zzl);
        long elapsedRealtime = zzz().elapsedRealtime();
        this.zzrk = elapsedRealtime;
        this.zzrl = elapsedRealtime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(long j) {
        zzq();
        zzfn();
        if (zzaf().zze(zzt().zzan(), zzal.zzih)) {
            zzae().zzlv.set(false);
        }
        zzad().zzdi().zza("Activity resumed, time", Long.valueOf(j));
        this.zzrk = j;
        this.zzrl = j;
        if (zzaf().zzaa(zzt().zzan())) {
            zzab(zzz().currentTimeMillis());
            return;
        }
        this.zzrm.cancel();
        this.zzrn.cancel();
        if (zzae().zzx(zzz().currentTimeMillis())) {
            zzae().zzlo.set(true);
            zzae().zzlt.set(0L);
        }
        if (zzae().zzlo.get()) {
            this.zzrm.zzv(Math.max(0L, zzae().zzlm.get() - zzae().zzlt.get()));
        } else {
            this.zzrn.zzv(Math.max(0L, 3600000 - zzae().zzlt.get()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(long j) {
        zzq();
        zzfn();
        if (zzaf().zze(zzt().zzan(), zzal.zzih)) {
            zzae().zzlv.set(true);
        }
        this.zzrm.cancel();
        this.zzrn.cancel();
        zzad().zzdi().zza("Activity paused, time", Long.valueOf(j));
        if (this.zzrk != 0) {
            zzae().zzlt.set(zzae().zzlt.get() + (j - this.zzrk));
        }
    }

    private final void zzad(long j) {
        zzq();
        zzad().zzdi().zza("Session started, time", Long.valueOf(zzz().elapsedRealtime()));
        Long valueOf = zzaf().zzy(zzt().zzan()) ? Long.valueOf(j / 1000) : null;
        zzs().zza("auto", "_sid", valueOf, j);
        zzae().zzlo.set(false);
        Bundle bundle = new Bundle();
        if (zzaf().zzy(zzt().zzan())) {
            bundle.putLong("_sid", valueOf.longValue());
        }
        zzs().zza("auto", "_s", j, bundle);
        zzae().zzls.set(j);
    }

    private final void zzfn() {
        synchronized (this) {
            if (this.handler == null) {
                this.handler = new com.google.android.gms.internal.measurement.zzk(Looper.getMainLooper());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzfr() {
        zzq();
        zza(false, false);
        zzr().zzc(zzz().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final void zza(long j, boolean z) {
        zzq();
        zzfn();
        this.zzrm.cancel();
        this.zzrn.cancel();
        if (zzae().zzx(j)) {
            zzae().zzlo.set(true);
            zzae().zzlt.set(0L);
        }
        if (z && zzaf().zzab(zzt().zzan())) {
            zzae().zzls.set(j);
        }
        if (zzae().zzlo.get()) {
            zzad(j);
        } else {
            this.zzrn.zzv(Math.max(0L, 3600000 - zzae().zzlt.get()));
        }
    }

    public final void zzab(long j) {
        zzq();
        zzfn();
        zza(j, false);
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

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzak() {
        return false;
    }

    public final void zzfo() {
        zzq();
        this.zzrm.cancel();
        this.zzrn.cancel();
        this.zzrk = 0L;
        this.zzrl = 0L;
    }

    @VisibleForTesting
    public final void zzfp() {
        zzq();
        zzad(zzz().currentTimeMillis());
    }

    @VisibleForTesting
    public final long zzfq() {
        long elapsedRealtime = zzz().elapsedRealtime();
        long j = elapsedRealtime - this.zzrl;
        this.zzrl = elapsedRealtime;
        return j;
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

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzgd zzab() {
        return super.zzab();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ zzbt zzac() {
        return super.zzac();
    }

    public final boolean zza(boolean z, boolean z2) {
        zzq();
        zzah();
        long elapsedRealtime = zzz().elapsedRealtime();
        zzae().zzls.set(zzz().currentTimeMillis());
        long j = elapsedRealtime - this.zzrk;
        if (!z && j < 1000) {
            zzad().zzdi().zza("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
            return false;
        }
        zzae().zzlt.set(j);
        zzad().zzdi().zza("Recording user engagement, ms", Long.valueOf(j));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j);
        zzed.zza(zzv().zzfc(), bundle, true);
        if (zzaf().zzac(zzt().zzan())) {
            if (zzaf().zze(zzt().zzan(), zzal.zzim)) {
                if (!z2) {
                    zzfq();
                }
            } else if (z2) {
                bundle.putLong("_fr", 1L);
            } else {
                zzfq();
            }
        }
        if (!zzaf().zze(zzt().zzan(), zzal.zzim) || !z2) {
            zzs().logEvent("auto", "_e", bundle);
        }
        this.zzrk = elapsedRealtime;
        this.zzrn.cancel();
        this.zzrn.zzv(Math.max(0L, 3600000 - zzae().zzlt.get()));
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ zzau zzad() {
        return super.zzad();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzas zzaa() {
        return super.zzaa();
    }
}
