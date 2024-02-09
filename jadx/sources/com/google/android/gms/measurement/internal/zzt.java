package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.vision.barcode.Barcode;
import java.lang.reflect.InvocationTargetException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzt extends zzct {
    private Boolean zzdz;
    private zzv zzea;
    private Boolean zzeb;

    public zzt(zzby zzbyVar) {
        super(zzbyVar);
        this.zzea = zzu.zzec;
        zzal.zza(zzbyVar);
    }

    public static String zzbo() {
        return zzal.zzgd.get(null);
    }

    public static long zzbs() {
        return zzal.zzhg.get(null).longValue();
    }

    public static long zzbt() {
        return zzal.zzgg.get(null).longValue();
    }

    public static boolean zzbv() {
        return zzal.zzgc.get(null).booleanValue();
    }

    public static boolean zzbx() {
        return zzal.zzic.get(null).booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final void zza(zzv zzvVar) {
        this.zzea = zzvVar;
    }

    public final boolean zzaa(String str) {
        return zzd(str, zzal.zzif);
    }

    public final boolean zzab(String str) {
        return zzd(str, zzal.zzig);
    }

    public final boolean zzac(String str) {
        return zzd(str, zzal.zzil);
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

    public final long zzav() {
        zzag();
        return 15300L;
    }

    public final int zzb(String str, zzal.zza<Integer> zzaVar) {
        if (str == null) {
            return zzaVar.get(null).intValue();
        }
        String zzb = this.zzea.zzb(str, zzaVar.getKey());
        if (TextUtils.isEmpty(zzb)) {
            return zzaVar.get(null).intValue();
        }
        try {
            return zzaVar.get(Integer.valueOf(Integer.parseInt(zzb))).intValue();
        } catch (NumberFormatException unused) {
            return zzaVar.get(null).intValue();
        }
    }

    public final boolean zzbp() {
        if (this.zzeb == null) {
            synchronized (this) {
                if (this.zzeb == null) {
                    ApplicationInfo applicationInfo = getContext().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.zzeb = Boolean.valueOf(str != null && str.equals(myProcessName));
                    }
                    if (this.zzeb == null) {
                        this.zzeb = Boolean.TRUE;
                        zzad().zzda().zzaq("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzeb.booleanValue();
    }

    public final boolean zzbq() {
        zzag();
        Boolean zzj = zzj("firebase_analytics_collection_deactivated");
        return zzj != null && zzj.booleanValue();
    }

    public final Boolean zzbr() {
        zzag();
        return zzj("firebase_analytics_collection_enabled");
    }

    public final String zzbu() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "debug.firebase.analytics.app", "");
        } catch (ClassNotFoundException e) {
            zzad().zzda().zza("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            zzad().zzda().zza("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            zzad().zzda().zza("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            zzad().zzda().zza("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public final boolean zzbw() {
        if (this.zzdz == null) {
            Boolean zzj = zzj("app_measurement_lite");
            this.zzdz = zzj;
            if (zzj == null) {
                this.zzdz = Boolean.FALSE;
            }
        }
        return this.zzdz.booleanValue() || !this.zzl.zzep();
    }

    public final double zzc(String str, zzal.zza<Double> zzaVar) {
        if (str == null) {
            return zzaVar.get(null).doubleValue();
        }
        String zzb = this.zzea.zzb(str, zzaVar.getKey());
        if (TextUtils.isEmpty(zzb)) {
            return zzaVar.get(null).doubleValue();
        }
        try {
            return zzaVar.get(Double.valueOf(Double.parseDouble(zzb))).doubleValue();
        } catch (NumberFormatException unused) {
            return zzaVar.get(null).doubleValue();
        }
    }

    public final boolean zzd(String str, zzal.zza<Boolean> zzaVar) {
        if (str == null) {
            return zzaVar.get(null).booleanValue();
        }
        String zzb = this.zzea.zzb(str, zzaVar.getKey());
        if (TextUtils.isEmpty(zzb)) {
            return zzaVar.get(null).booleanValue();
        }
        return zzaVar.get(Boolean.valueOf(Boolean.parseBoolean(zzb))).booleanValue();
    }

    public final boolean zze(String str, zzal.zza<Boolean> zzaVar) {
        return zzd(str, zzaVar);
    }

    public final int zzi(String str) {
        return zzb(str, zzal.zzgr);
    }

    @VisibleForTesting
    public final Boolean zzj(String str) {
        Preconditions.checkNotEmpty(str);
        try {
            if (getContext().getPackageManager() == null) {
                zzad().zzda().zzaq("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(getContext()).getApplicationInfo(getContext().getPackageName(), Barcode.ITF);
            if (applicationInfo == null) {
                zzad().zzda().zzaq("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null) {
                zzad().zzda().zzaq("Failed to load metadata: Metadata bundle is null");
                return null;
            } else if (bundle.containsKey(str)) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
            } else {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            zzad().zzda().zza("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final boolean zzk(String str) {
        return "1".equals(this.zzea.zzb(str, "gaia_collection_enabled"));
    }

    public final boolean zzl(String str) {
        return "1".equals(this.zzea.zzb(str, "measurement.event_sampling_enabled"));
    }

    public final boolean zzm(String str) {
        return zzd(str, zzal.zzhq);
    }

    public final boolean zzn(String str) {
        return zzd(str, zzal.zzhs);
    }

    public final boolean zzo(String str) {
        return zzd(str, zzal.zzht);
    }

    public final boolean zzp(String str) {
        return zzd(str, zzal.zzhk);
    }

    public final String zzq(String str) {
        zzal.zza<String> zzaVar = zzal.zzhl;
        if (str == null) {
            return zzaVar.get(null);
        }
        return zzaVar.get(this.zzea.zzb(str, zzaVar.getKey()));
    }

    public final boolean zzr(String str) {
        return zzd(str, zzal.zzhu);
    }

    public final boolean zzs(String str) {
        return zzd(str, zzal.zzhv);
    }

    public final boolean zzt(String str) {
        return zzd(str, zzal.zzhx);
    }

    public final boolean zzu(String str) {
        return zzd(str, zzal.zzhy);
    }

    public final boolean zzv(String str) {
        return zzd(str, zzal.zzhz);
    }

    public final boolean zzw(String str) {
        return zzd(str, zzal.zzib);
    }

    public final boolean zzx(String str) {
        return zzd(str, zzal.zzia);
    }

    public final boolean zzy(String str) {
        return zzd(str, zzal.zzid);
    }

    public final boolean zzz(String str) {
        return zzd(str, zzal.zzie);
    }

    public final long zza(String str, zzal.zza<Long> zzaVar) {
        if (str == null) {
            return zzaVar.get(null).longValue();
        }
        String zzb = this.zzea.zzb(str, zzaVar.getKey());
        if (TextUtils.isEmpty(zzb)) {
            return zzaVar.get(null).longValue();
        }
        try {
            return zzaVar.get(Long.valueOf(Long.parseLong(zzb))).longValue();
        } catch (NumberFormatException unused) {
            return zzaVar.get(null).longValue();
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

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzn() {
        super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzo() {
        super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzp() {
        super.zzp();
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
    public final /* bridge */ /* synthetic */ void zzq() {
        super.zzq();
    }

    public final boolean zza(zzal.zza<Boolean> zzaVar) {
        return zzd(null, zzaVar);
    }
}
