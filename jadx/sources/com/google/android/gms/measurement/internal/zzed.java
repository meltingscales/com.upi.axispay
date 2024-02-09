package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzed extends zzf {
    @VisibleForTesting
    public zzec zzpy;
    private volatile zzec zzpz;
    private zzec zzqa;
    private final Map<Activity, zzec> zzqb;
    private zzec zzqc;
    private String zzqd;

    public zzed(zzby zzbyVar) {
        super(zzbyVar);
        this.zzqb = new o4();
    }

    private final void zza(Activity activity, zzec zzecVar, boolean z) {
        zzec zzecVar2 = this.zzpz == null ? this.zzqa : this.zzpz;
        if (zzecVar.zzpv == null) {
            zzecVar = new zzec(zzecVar.zzpu, zzbj(activity.getClass().getCanonicalName()), zzecVar.zzpw);
        }
        this.zzqa = this.zzpz;
        this.zzpz = zzecVar;
        zzac().zza(new zzee(this, z, zzecVar2, zzecVar));
    }

    @VisibleForTesting
    private static String zzbj(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzqb.put(activity, new zzec(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.zzqb.remove(activity);
    }

    public final void onActivityPaused(Activity activity) {
        zzec zza = zza(activity);
        this.zzqa = this.zzpz;
        this.zzpz = null;
        zzac().zza(new zzef(this, zza));
    }

    public final void onActivityResumed(Activity activity) {
        zza(activity, zza(activity), false);
        zza zzr = zzr();
        zzr.zzac().zza(new zzd(zzr, zzr.zzz().elapsedRealtime()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzec zzecVar;
        if (bundle == null || (zzecVar = this.zzqb.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzecVar.zzpw);
        bundle2.putString("name", zzecVar.zzpu);
        bundle2.putString("referrer_name", zzecVar.zzpv);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (this.zzpz == null) {
            zzad().zzdd().zzaq("setCurrentScreen cannot be called while no activity active");
        } else if (this.zzqb.get(activity) == null) {
            zzad().zzdd().zzaq("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = zzbj(activity.getClass().getCanonicalName());
            }
            boolean equals = this.zzpz.zzpv.equals(str2);
            boolean zzs = zzgd.zzs(this.zzpz.zzpu, str);
            if (equals && zzs) {
                zzad().zzdf().zzaq("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                zzad().zzdd().zza("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
                zzad().zzdd().zza("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            } else {
                zzad().zzdi().zza("Setting current screen to name, class", str == null ? "null" : str, str2);
                zzec zzecVar = new zzec(str, str2, zzab().zzgk());
                this.zzqb.put(activity, zzecVar);
                zza(activity, zzecVar, true);
            }
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

    public final zzec zzfc() {
        zzah();
        zzq();
        return this.zzpy;
    }

    public final zzec zzfd() {
        zzo();
        return this.zzpz;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzec zzecVar, boolean z) {
        zzr().zzc(zzz().elapsedRealtime());
        if (zzx().zza(zzecVar.zzpx, z)) {
            zzecVar.zzpx = false;
        }
    }

    public static void zza(zzec zzecVar, Bundle bundle, boolean z) {
        if (bundle != null && zzecVar != null && (!bundle.containsKey("_sc") || z)) {
            String str = zzecVar.zzpu;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", zzecVar.zzpv);
            bundle.putLong("_si", zzecVar.zzpw);
        } else if (bundle != null && zzecVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void zza(String str, zzec zzecVar) {
        zzq();
        synchronized (this) {
            String str2 = this.zzqd;
            if (str2 == null || str2.equals(str) || zzecVar != null) {
                this.zzqd = str;
                this.zzqc = zzecVar;
            }
        }
    }

    private final zzec zza(Activity activity) {
        Preconditions.checkNotNull(activity);
        zzec zzecVar = this.zzqb.get(activity);
        if (zzecVar == null) {
            zzec zzecVar2 = new zzec(null, zzbj(activity.getClass().getCanonicalName()), zzab().zzgk());
            this.zzqb.put(activity, zzecVar2);
            return zzecVar2;
        }
        return zzecVar;
    }
}
