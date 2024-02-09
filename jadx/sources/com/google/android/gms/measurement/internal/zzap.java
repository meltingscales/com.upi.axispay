package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzap extends zzf {
    private String zzcf;
    private String zzch;
    private String zzcn;
    private String zzcp;
    private long zzcs;
    private String zzcv;
    private int zzdq;
    private int zzjg;
    private String zzjh;
    private long zzji;
    private long zzu;

    public zzap(zzby zzbyVar, long j) {
        super(zzbyVar);
        this.zzu = j;
    }

    @VisibleForTesting
    private final String zzcw() {
        try {
            Class<?> loadClass = getContext().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, getContext());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    zzad().zzdf().zzaq("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                zzad().zzde().zzaq("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final String getGmpAppId() {
        zzah();
        return this.zzch;
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

    public final zzm zzak(String str) {
        Boolean zzj;
        zzq();
        zzo();
        String zzan = zzan();
        String gmpAppId = getGmpAppId();
        zzah();
        String str2 = this.zzcn;
        long zzcx = zzcx();
        zzah();
        String str3 = this.zzcp;
        long zzav = zzaf().zzav();
        zzah();
        zzq();
        if (this.zzji == 0) {
            this.zzji = this.zzl.zzab().zzc(getContext(), getContext().getPackageName());
        }
        long j = this.zzji;
        boolean isEnabled = this.zzl.isEnabled();
        boolean z = !zzae().zzlu;
        zzq();
        zzo();
        String zzcw = (!zzaf().zzr(this.zzcf) || this.zzl.isEnabled()) ? zzcw() : null;
        zzah();
        long j2 = this.zzcs;
        long zzer = this.zzl.zzer();
        int zzcy = zzcy();
        zzt zzaf = zzaf();
        zzaf.zzo();
        Boolean zzj2 = zzaf.zzj("google_analytics_adid_collection_enabled");
        boolean booleanValue = Boolean.valueOf(zzj2 == null || zzj2.booleanValue()).booleanValue();
        zzt zzaf2 = zzaf();
        zzaf2.zzo();
        Boolean zzj3 = zzaf2.zzj("google_analytics_ssaid_collection_enabled");
        return new zzm(zzan, gmpAppId, str2, zzcx, str3, zzav, j, str, isEnabled, z, zzcw, j2, zzer, zzcy, booleanValue, Boolean.valueOf(zzj3 == null || zzj3.booleanValue()).booleanValue(), zzae().zzdy(), zzao(), (!zzaf().zze(zzan(), zzal.zzin) || (zzj = zzaf().zzj("google_analytics_default_allow_ad_personalization_signals")) == null) ? null : Boolean.valueOf(!zzj.booleanValue()), this.zzu);
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzak() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:1|(1:3)(6:65|66|(1:68)(2:83|(1:85))|69|70|(22:72|(1:74)(1:81)|75|76|5|(1:64)(1:9)|10|(1:63)(1:14)|15|(1:(1:18)(1:19))|(2:21|(2:23|(1:25))(1:(1:(11:36|37|(1:41)|42|43|(1:45)(1:59)|46|(1:48)|(1:50)|52|(2:54|55)(2:57|58))(1:35))(2:29|(1:31))))|62|37|(2:39|41)|42|43|(0)(0)|46|(0)|(0)|52|(0)(0)))|4|5|(1:7)|64|10|(1:12)|63|15|(0)|(0)|62|37|(0)|42|43|(0)(0)|46|(0)|(0)|52|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ce, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cf, code lost:
        zzad().zzda().zza("getGoogleAppId or isMeasurementEnabled failed with exception. appId", com.google.android.gms.measurement.internal.zzau.zzao(r0), r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a9 A[Catch: IllegalStateException -> 0x01ce, TryCatch #0 {IllegalStateException -> 0x01ce, blocks: (B:66:0x0195, B:70:0x01a1, B:72:0x01a9, B:74:0x01bc), top: B:84:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bc A[Catch: IllegalStateException -> 0x01ce, TRY_LEAVE, TryCatch #0 {IllegalStateException -> 0x01ce, blocks: (B:66:0x0195, B:70:0x01a1, B:72:0x01a9, B:74:0x01bc), top: B:84:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f1  */
    @Override // com.google.android.gms.measurement.internal.zzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzal() {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzap.zzal():void");
    }

    public final String zzan() {
        zzah();
        return this.zzcf;
    }

    public final String zzao() {
        zzah();
        return this.zzcv;
    }

    public final int zzcx() {
        zzah();
        return this.zzjg;
    }

    public final int zzcy() {
        zzah();
        return this.zzdq;
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
}
