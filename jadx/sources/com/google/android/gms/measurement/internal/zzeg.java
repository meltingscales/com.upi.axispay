package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AxisPay */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzeg extends zzf {
    private final zzey zzqj;
    private zzam zzqk;
    private volatile Boolean zzql;
    private final zzab zzqm;
    private final zzfo zzqn;
    private final List<Runnable> zzqo;
    private final zzab zzqp;

    public zzeg(zzby zzbyVar) {
        super(zzbyVar);
        this.zzqo = new ArrayList();
        this.zzqn = new zzfo(zzbyVar.zzz());
        this.zzqj = new zzey(this);
        this.zzqm = new zzeh(this, zzbyVar);
        this.zzqp = new zzeq(this, zzbyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onServiceDisconnected(ComponentName componentName) {
        zzq();
        if (this.zzqk != null) {
            this.zzqk = null;
            zzad().zzdi().zza("Disconnected from device MeasurementService", componentName);
            zzq();
            zzfh();
        }
    }

    private final boolean zzff() {
        zzag();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzfg() {
        zzq();
        this.zzqn.start();
        this.zzqm.zzv(zzal.zzhj.get(null).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzfj() {
        zzq();
        if (isConnected()) {
            zzad().zzdi().zzaq("Inactivity, disconnecting from the service");
            disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzfk() {
        zzq();
        zzad().zzdi().zza("Processing queued up service tasks", Integer.valueOf(this.zzqo.size()));
        for (Runnable runnable : this.zzqo) {
            try {
                runnable.run();
            } catch (Exception e) {
                zzad().zzda().zza("Task exception while flushing queue", e);
            }
        }
        this.zzqo.clear();
        this.zzqp.cancel();
    }

    private final zzm zzi(boolean z) {
        zzag();
        return zzt().zzak(z ? zzad().zzdk() : null);
    }

    public final void disconnect() {
        zzq();
        zzah();
        this.zzqj.zzfl();
        try {
            ConnectionTracker.getInstance().unbindService(getContext(), this.zzqj);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzqk = null;
    }

    public final void getAppInstanceId(com.google.android.gms.internal.measurement.zzq zzqVar) {
        zzq();
        zzah();
        zzd(new zzem(this, zzi(false), zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final boolean isConnected() {
        zzq();
        zzah();
        return this.zzqk != null;
    }

    public final void resetAnalyticsData() {
        zzq();
        zzo();
        zzah();
        zzm zzi = zzi(false);
        if (zzff()) {
            zzw().resetAnalyticsData();
        }
        zzd(new zzek(this, zzi));
    }

    @VisibleForTesting
    public final void zza(zzam zzamVar, AbstractSafeParcelable abstractSafeParcelable, zzm zzmVar) {
        int i;
        List<AbstractSafeParcelable> zzc;
        zzq();
        zzo();
        zzah();
        boolean zzff = zzff();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!zzff || (zzc = zzw().zzc(100)) == null) {
                i = 0;
            } else {
                arrayList.addAll(zzc);
                i = zzc.size();
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzaj) {
                    try {
                        zzamVar.zza((zzaj) abstractSafeParcelable2, zzmVar);
                    } catch (RemoteException e) {
                        zzad().zzda().zza("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzga) {
                    try {
                        zzamVar.zza((zzga) abstractSafeParcelable2, zzmVar);
                    } catch (RemoteException e2) {
                        zzad().zzda().zza("Failed to send attribute to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzr) {
                    try {
                        zzamVar.zza((zzr) abstractSafeParcelable2, zzmVar);
                    } catch (RemoteException e3) {
                        zzad().zzda().zza("Failed to send conditional property to the service", e3);
                    }
                } else {
                    zzad().zzda().zzaq("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
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

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzak() {
        return false;
    }

    public final void zzb(zzga zzgaVar) {
        zzq();
        zzah();
        zzd(new zzei(this, zzff() && zzw().zza(zzgaVar), zzgaVar, zzi(true)));
    }

    public final void zzc(zzaj zzajVar, String str) {
        Preconditions.checkNotNull(zzajVar);
        zzq();
        zzah();
        boolean zzff = zzff();
        zzd(new zzes(this, zzff, zzff && zzw().zza(zzajVar), zzajVar, zzi(true), str));
    }

    public final void zzd(zzr zzrVar) {
        Preconditions.checkNotNull(zzrVar);
        zzq();
        zzah();
        zzag();
        zzd(new zzet(this, true, zzw().zzc(zzrVar), new zzr(zzrVar), zzi(true), zzrVar));
    }

    public final void zzfb() {
        zzq();
        zzah();
        zzd(new zzen(this, zzi(true)));
    }

    public final void zzfe() {
        zzq();
        zzah();
        zzd(new zzer(this, zzi(true)));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzfh() {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeg.zzfh():void");
    }

    public final Boolean zzfi() {
        return this.zzql;
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

    private final void zzd(Runnable runnable) throws IllegalStateException {
        zzq();
        if (isConnected()) {
            runnable.run();
        } else if (this.zzqo.size() >= 1000) {
            zzad().zzda().zzaq("Discarding data. Max runnable queue size reached");
        } else {
            this.zzqo.add(runnable);
            this.zzqp.zzv(60000L);
            zzfh();
        }
    }

    public final void zza(AtomicReference<List<zzr>> atomicReference, String str, String str2, String str3) {
        zzq();
        zzah();
        zzd(new zzeu(this, atomicReference, str, str2, str3, zzi(false)));
    }

    public final void zza(com.google.android.gms.internal.measurement.zzq zzqVar, String str, String str2) {
        zzq();
        zzah();
        zzd(new zzev(this, str, str2, zzi(false), zzqVar));
    }

    public final void zza(AtomicReference<List<zzga>> atomicReference, String str, String str2, String str3, boolean z) {
        zzq();
        zzah();
        zzd(new zzew(this, atomicReference, str, str2, str3, z, zzi(false)));
    }

    public final void zza(com.google.android.gms.internal.measurement.zzq zzqVar, String str, String str2, boolean z) {
        zzq();
        zzah();
        zzd(new zzex(this, str, str2, z, zzi(false), zzqVar));
    }

    public final void zza(AtomicReference<List<zzga>> atomicReference, boolean z) {
        zzq();
        zzah();
        zzd(new zzej(this, atomicReference, zzi(false), z));
    }

    public final void zza(AtomicReference<String> atomicReference) {
        zzq();
        zzah();
        zzd(new zzel(this, atomicReference, zzi(false)));
    }

    public final void zza(zzec zzecVar) {
        zzq();
        zzah();
        zzd(new zzeo(this, zzecVar));
    }

    @VisibleForTesting
    public final void zza(zzam zzamVar) {
        zzq();
        Preconditions.checkNotNull(zzamVar);
        this.zzqk = zzamVar;
        zzfg();
        zzfk();
    }

    public final void zza(com.google.android.gms.internal.measurement.zzq zzqVar, zzaj zzajVar, String str) {
        zzq();
        zzah();
        if (zzab().zzd(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            zzad().zzdd().zzaq("Not bundling data. Service unavailable or out of date");
            zzab().zza(zzqVar, new byte[0]);
            return;
        }
        zzd(new zzep(this, zzajVar, str, zzqVar));
    }

    public static /* synthetic */ zzam zza(zzeg zzegVar, zzam zzamVar) {
        zzegVar.zzqk = null;
        return null;
    }
}
