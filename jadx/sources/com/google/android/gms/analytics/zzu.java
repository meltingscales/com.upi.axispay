package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzbi;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbt;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzcf;
import com.google.android.gms.internal.gtm.zzcx;
import com.google.android.gms.internal.gtm.zzex;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.internal.gtm.zzfb;
import com.google.android.gms.internal.gtm.zzfs;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzu implements Runnable {
    public final /* synthetic */ Map zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ boolean zzf;
    public final /* synthetic */ String zzg;
    public final /* synthetic */ Tracker zzh;

    public zzu(Tracker tracker, Map map, boolean z, String str, long j, boolean z2, boolean z3, String str2) {
        this.zzh = tracker;
        this.zza = map;
        this.zzb = z;
        this.zzc = str;
        this.zzd = j;
        this.zze = z2;
        this.zzf = z3;
        this.zzg = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzv zzvVar;
        double d;
        zzbi zzr;
        zzcf zzu;
        zzcx zzx;
        zzcx zzx2;
        zzbq zzs;
        zzbq zzs2;
        zzfb zzz;
        zzez zzezVar;
        zzfb zzz2;
        zzvVar = this.zzh.zze;
        if (zzvVar.zzf()) {
            this.zza.put("sc", "start");
        }
        Map map = this.zza;
        GoogleAnalytics zzp = this.zzh.zzp();
        Preconditions.checkNotMainThread("getClientId can not be called from the main thread");
        String zzb = zzp.zzb().zzi().zzb();
        if (zzb != null && TextUtils.isEmpty((CharSequence) map.get("cid"))) {
            map.put("cid", zzb);
        }
        String str = (String) this.zza.get("sf");
        if (str != null) {
            try {
                d = Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                d = 100.0d;
            }
            if (zzfs.zzj(d, (String) this.zza.get("cid"))) {
                this.zzh.zzG("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d));
                return;
            }
        }
        zzr = this.zzh.zzr();
        if (this.zzb) {
            Map map2 = this.zza;
            boolean zzb2 = zzr.zzb();
            if (!map2.containsKey("ate")) {
                map2.put("ate", true != zzb2 ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1");
            }
            zzfs.zzg(this.zza, "adid", zzr.zza());
        } else {
            this.zza.remove("ate");
            this.zza.remove("adid");
        }
        zzu = this.zzh.zzu();
        zzav zza = zzu.zza();
        zzfs.zzg(this.zza, "an", zza.zzf());
        zzfs.zzg(this.zza, "av", zza.zzg());
        zzfs.zzg(this.zza, "aid", zza.zzd());
        zzfs.zzg(this.zza, "aiid", zza.zze());
        this.zza.put("v", "1");
        this.zza.put("_v", zzbt.zzb);
        Map map3 = this.zza;
        zzx = this.zzh.zzx();
        zzfs.zzg(map3, "ul", zzx.zza().zzd());
        Map map4 = this.zza;
        zzx2 = this.zzh.zzx();
        zzfs.zzg(map4, "sr", zzx2.zzb());
        if (!this.zzc.equals("transaction") && !this.zzc.equals("item")) {
            zzezVar = this.zzh.zzd;
            if (!zzezVar.zza()) {
                zzz2 = this.zzh.zzz();
                zzz2.zzc(this.zza, "Too many hits sent too quickly, rate limiting invoked");
                return;
            }
        }
        long zza2 = zzfs.zza((String) this.zza.get("ht"));
        if (zza2 == 0) {
            zza2 = this.zzd;
        }
        long j = zza2;
        if (this.zze) {
            zzex zzexVar = new zzex(this.zzh, this.zza, j, this.zzf);
            zzz = this.zzh.zzz();
            zzz.zzN("Dry run enabled. Would have sent hit", zzexVar);
            return;
        }
        String str2 = (String) this.zza.get("cid");
        HashMap hashMap = new HashMap();
        zzfs.zzh(hashMap, "uid", this.zza);
        zzfs.zzh(hashMap, "an", this.zza);
        zzfs.zzh(hashMap, "aid", this.zza);
        zzfs.zzh(hashMap, "av", this.zza);
        zzfs.zzh(hashMap, "aiid", this.zza);
        Preconditions.checkNotNull(str2);
        zzbx zzbxVar = new zzbx(0L, str2, this.zzg, !TextUtils.isEmpty((CharSequence) this.zza.get("adid")), 0L, hashMap);
        zzs = this.zzh.zzs();
        this.zza.put("_s", String.valueOf(zzs.zza(zzbxVar)));
        zzex zzexVar2 = new zzex(this.zzh, this.zza, j, this.zzf);
        zzs2 = this.zzh.zzs();
        zzs2.zzh(zzexVar2);
    }
}
