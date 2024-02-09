package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class zzby implements zzcv {
    private static volatile zzby zznn;
    private final Clock zzaa;
    private final long zzdp;
    private final zzq zzfq;
    private final Context zzno;
    private final String zznp;
    private final String zznq;
    private final zzt zznr;
    private final zzbf zzns;
    private final zzau zznt;
    private final zzbt zznu;
    private final zzfj zznv;
    private final zzgd zznw;
    private final zzas zznx;
    private final zzed zzny;
    private final zzdd zznz;
    private final zza zzoa;
    private final zzdz zzob;
    private zzaq zzoc;
    private zzeg zzod;
    private zzad zzoe;
    private zzap zzof;
    private zzbl zzog;
    private Boolean zzoh;
    private long zzoi;
    private volatile Boolean zzoj;
    @VisibleForTesting
    private Boolean zzok;
    @VisibleForTesting
    private Boolean zzol;
    private int zzom;
    private final boolean zzv;
    private final String zzx;
    private boolean zzce = false;
    private AtomicInteger zzon = new AtomicInteger(0);

    private zzby(zzdc zzdcVar) {
        Bundle bundle;
        boolean z = false;
        Preconditions.checkNotNull(zzdcVar);
        zzq zzqVar = new zzq(zzdcVar.zzno);
        this.zzfq = zzqVar;
        zzal.zza(zzqVar);
        Context context = zzdcVar.zzno;
        this.zzno = context;
        this.zzx = zzdcVar.zzx;
        this.zznp = zzdcVar.zznp;
        this.zznq = zzdcVar.zznq;
        this.zzv = zzdcVar.zzv;
        this.zzoj = zzdcVar.zzoj;
        com.google.android.gms.internal.measurement.zzy zzyVar = zzdcVar.zzpe;
        if (zzyVar != null && (bundle = zzyVar.zzy) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zzok = (Boolean) obj;
            }
            Object obj2 = zzyVar.zzy.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzol = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzcw.zzq(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzaa = defaultClock;
        this.zzdp = defaultClock.currentTimeMillis();
        this.zznr = new zzt(this);
        zzbf zzbfVar = new zzbf(this);
        zzbfVar.zzai();
        this.zzns = zzbfVar;
        zzau zzauVar = new zzau(this);
        zzauVar.zzai();
        this.zznt = zzauVar;
        zzgd zzgdVar = new zzgd(this);
        zzgdVar.zzai();
        this.zznw = zzgdVar;
        zzas zzasVar = new zzas(this);
        zzasVar.zzai();
        this.zznx = zzasVar;
        this.zzoa = new zza(this);
        zzed zzedVar = new zzed(this);
        zzedVar.zzai();
        this.zzny = zzedVar;
        zzdd zzddVar = new zzdd(this);
        zzddVar.zzai();
        this.zznz = zzddVar;
        zzfj zzfjVar = new zzfj(this);
        zzfjVar.zzai();
        this.zznv = zzfjVar;
        zzdz zzdzVar = new zzdz(this);
        zzdzVar.zzai();
        this.zzob = zzdzVar;
        zzbt zzbtVar = new zzbt(this);
        zzbtVar.zzai();
        this.zznu = zzbtVar;
        com.google.android.gms.internal.measurement.zzy zzyVar2 = zzdcVar.zzpe;
        if (zzyVar2 != null && zzyVar2.zzu != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (context.getApplicationContext() instanceof Application) {
            zzdd zzs = zzs();
            if (zzs.getContext().getApplicationContext() instanceof Application) {
                Application application = (Application) zzs.getContext().getApplicationContext();
                if (zzs.zzpf == null) {
                    zzs.zzpf = new zzdx(zzs, null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(zzs.zzpf);
                    application.registerActivityLifecycleCallbacks(zzs.zzpf);
                    zzs.zzad().zzdi().zzaq("Registered activity lifecycle callback");
                }
            }
        } else {
            zzad().zzdd().zzaq("Application context is not an Application");
        }
        zzbtVar.zza(new zzbz(this, zzdcVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdc zzdcVar) {
        String concat;
        zzaw zzawVar;
        zzac().zzq();
        zzt.zzbo();
        zzad zzadVar = new zzad(this);
        zzadVar.zzai();
        this.zzoe = zzadVar;
        zzap zzapVar = new zzap(this, zzdcVar.zzu);
        zzapVar.zzai();
        this.zzof = zzapVar;
        zzaq zzaqVar = new zzaq(this);
        zzaqVar.zzai();
        this.zzoc = zzaqVar;
        zzeg zzegVar = new zzeg(this);
        zzegVar.zzai();
        this.zzod = zzegVar;
        this.zznw.zzaj();
        this.zzns.zzaj();
        this.zzog = new zzbl(this);
        this.zzof.zzaj();
        zzad().zzdg().zza("App measurement is starting up, version", Long.valueOf(this.zznr.zzav()));
        zzad().zzdg().zzaq("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzan = zzapVar.zzan();
        if (TextUtils.isEmpty(this.zzx)) {
            if (zzab().zzbt(zzan)) {
                zzawVar = zzad().zzdg();
                concat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                zzaw zzdg = zzad().zzdg();
                String valueOf = String.valueOf(zzan);
                concat = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                zzawVar = zzdg;
            }
            zzawVar.zzaq(concat);
        }
        zzad().zzdh().zzaq("Debug-level message logging enabled");
        if (this.zzom != this.zzon.get()) {
            zzad().zzda().zza("Not all components initialized", Integer.valueOf(this.zzom), Integer.valueOf(this.zzon.get()));
        }
        this.zzce = true;
    }

    private final void zzah() {
        if (!this.zzce) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzcv
    public final Context getContext() {
        return this.zzno;
    }

    public final boolean isEnabled() {
        boolean z;
        zzac().zzq();
        zzah();
        if (this.zznr.zza(zzal.zzio)) {
            if (this.zznr.zzbq()) {
                return false;
            }
            Boolean bool = this.zzol;
            if (bool == null || !bool.booleanValue()) {
                Boolean zzdw = zzae().zzdw();
                if (zzdw != null) {
                    return zzdw.booleanValue();
                }
                Boolean zzbr = this.zznr.zzbr();
                if (zzbr != null) {
                    return zzbr.booleanValue();
                }
                Boolean bool2 = this.zzok;
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                if (GoogleServices.isMeasurementExplicitlyDisabled()) {
                    return false;
                }
                if (!this.zznr.zza(zzal.zzik) || this.zzoj == null) {
                    return true;
                }
                return this.zzoj.booleanValue();
            }
            return false;
        } else if (this.zznr.zzbq()) {
            return false;
        } else {
            Boolean zzbr2 = this.zznr.zzbr();
            if (zzbr2 != null) {
                z = zzbr2.booleanValue();
            } else {
                z = !GoogleServices.isMeasurementExplicitlyDisabled();
                if (z && this.zzoj != null && zzal.zzik.get(null).booleanValue()) {
                    z = this.zzoj.booleanValue();
                }
            }
            return zzae().zze(z);
        }
    }

    public final void start() {
        zzac().zzq();
        if (zzae().zzlb.get() == 0) {
            zzae().zzlb.set(this.zzaa.currentTimeMillis());
        }
        if (Long.valueOf(zzae().zzlg.get()).longValue() == 0) {
            zzad().zzdi().zza("Persisting first open", Long.valueOf(this.zzdp));
            zzae().zzlg.set(this.zzdp);
        }
        if (!zzet()) {
            if (isEnabled()) {
                if (!zzab().zzbr("android.permission.INTERNET")) {
                    zzad().zzda().zzaq("App is missing INTERNET permission");
                }
                if (!zzab().zzbr("android.permission.ACCESS_NETWORK_STATE")) {
                    zzad().zzda().zzaq("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!Wrappers.packageManager(this.zzno).isCallerInstantApp() && !this.zznr.zzbw()) {
                    if (!zzbo.zzl(this.zzno)) {
                        zzad().zzda().zzaq("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!zzgd.zzb(this.zzno, false)) {
                        zzad().zzda().zzaq("AppMeasurementService not registered/enabled");
                    }
                }
                zzad().zzda().zzaq("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(zzt().getGmpAppId()) || !TextUtils.isEmpty(zzt().zzao())) {
                zzab();
                if (zzgd.zza(zzt().getGmpAppId(), zzae().zzds(), zzt().zzao(), zzae().zzdt())) {
                    zzad().zzdg().zzaq("Rechecking which service to use due to a GMP App Id change");
                    zzae().zzdv();
                    zzw().resetAnalyticsData();
                    this.zzod.disconnect();
                    this.zzod.zzfh();
                    zzae().zzlg.set(this.zzdp);
                    zzae().zzli.zzav(null);
                }
                zzae().zzat(zzt().getGmpAppId());
                zzae().zzau(zzt().zzao());
                if (this.zznr.zzaa(zzt().zzan())) {
                    this.zznv.zzab(this.zzdp);
                }
            }
            zzs().zzbi(zzae().zzli.zzed());
            if (!TextUtils.isEmpty(zzt().getGmpAppId()) || !TextUtils.isEmpty(zzt().zzao())) {
                boolean isEnabled = isEnabled();
                if (!zzae().zzdz() && !this.zznr.zzbq()) {
                    zzae().zzf(!isEnabled);
                }
                if (!this.zznr.zzs(zzt().zzan()) || isEnabled) {
                    zzs().zzfb();
                }
                zzu().zza(new AtomicReference<>());
            }
        }
        zzae().zzlq.set(this.zznr.zza(zzal.zziw));
        zzae().zzlr.set(this.zznr.zza(zzal.zzix));
    }

    public final zzas zzaa() {
        zza((zzct) this.zznx);
        return this.zznx;
    }

    public final zzgd zzab() {
        zza((zzct) this.zznw);
        return this.zznw;
    }

    @Override // com.google.android.gms.measurement.internal.zzcv
    public final zzbt zzac() {
        zza((zzcu) this.zznu);
        return this.zznu;
    }

    @Override // com.google.android.gms.measurement.internal.zzcv
    public final zzau zzad() {
        zza((zzcu) this.zznt);
        return this.zznt;
    }

    public final zzbf zzae() {
        zza((zzct) this.zzns);
        return this.zzns;
    }

    public final zzt zzaf() {
        return this.zznr;
    }

    @Override // com.google.android.gms.measurement.internal.zzcv
    public final zzq zzag() {
        return this.zzfq;
    }

    public final void zzb(zzcu zzcuVar) {
        this.zzom++;
    }

    public final zzau zzei() {
        zzau zzauVar = this.zznt;
        if (zzauVar == null || !zzauVar.isInitialized()) {
            return null;
        }
        return this.zznt;
    }

    public final zzbl zzej() {
        return this.zzog;
    }

    public final zzbt zzek() {
        return this.zznu;
    }

    public final boolean zzel() {
        return TextUtils.isEmpty(this.zzx);
    }

    public final String zzem() {
        return this.zzx;
    }

    public final String zzen() {
        return this.zznp;
    }

    public final String zzeo() {
        return this.zznq;
    }

    public final boolean zzep() {
        return this.zzv;
    }

    public final boolean zzeq() {
        return this.zzoj != null && this.zzoj.booleanValue();
    }

    public final long zzer() {
        Long valueOf = Long.valueOf(zzae().zzlg.get());
        if (valueOf.longValue() == 0) {
            return this.zzdp;
        }
        return Math.min(this.zzdp, valueOf.longValue());
    }

    public final void zzes() {
        this.zzon.incrementAndGet();
    }

    public final boolean zzet() {
        zzah();
        zzac().zzq();
        Boolean bool = this.zzoh;
        if (bool == null || this.zzoi == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.zzaa.elapsedRealtime() - this.zzoi) > 1000)) {
            this.zzoi = this.zzaa.elapsedRealtime();
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(zzab().zzbr("android.permission.INTERNET") && zzab().zzbr("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zzno).isCallerInstantApp() || this.zznr.zzbw() || (zzbo.zzl(this.zzno) && zzgd.zzb(this.zzno, false))));
            this.zzoh = valueOf;
            if (valueOf.booleanValue()) {
                if (!zzab().zzr(zzt().getGmpAppId(), zzt().zzao()) && TextUtils.isEmpty(zzt().zzao())) {
                    z = false;
                }
                this.zzoh = Boolean.valueOf(z);
            }
        }
        return this.zzoh.booleanValue();
    }

    public final void zzn() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public final void zzo() {
    }

    public final zza zzr() {
        zza zzaVar = this.zzoa;
        if (zzaVar != null) {
            return zzaVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final zzdd zzs() {
        zza((zzf) this.zznz);
        return this.zznz;
    }

    public final zzap zzt() {
        zza((zzf) this.zzof);
        return this.zzof;
    }

    public final zzeg zzu() {
        zza((zzf) this.zzod);
        return this.zzod;
    }

    public final zzed zzv() {
        zza((zzf) this.zzny);
        return this.zzny;
    }

    public final zzaq zzw() {
        zza((zzf) this.zzoc);
        return this.zzoc;
    }

    public final zzfj zzx() {
        zza((zzf) this.zznv);
        return this.zznv;
    }

    public final zzad zzy() {
        zza((zzcu) this.zzoe);
        return this.zzoe;
    }

    @Override // com.google.android.gms.measurement.internal.zzcv
    public final Clock zzz() {
        return this.zzaa;
    }

    public final void zzb(zzf zzfVar) {
        this.zzom++;
    }

    @VisibleForTesting
    public static zzby zza(Context context, String str, String str2, Bundle bundle) {
        return zza(context, new com.google.android.gms.internal.measurement.zzy(0L, 0L, true, null, null, null, bundle));
    }

    public static zzby zza(Context context, com.google.android.gms.internal.measurement.zzy zzyVar) {
        Bundle bundle;
        if (zzyVar != null && (zzyVar.origin == null || zzyVar.zzx == null)) {
            zzyVar = new com.google.android.gms.internal.measurement.zzy(zzyVar.zzt, zzyVar.zzu, zzyVar.zzv, zzyVar.zzw, null, null, zzyVar.zzy);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zznn == null) {
            synchronized (zzby.class) {
                if (zznn == null) {
                    zznn = new zzby(new zzdc(context, zzyVar));
                }
            }
        } else if (zzyVar != null && (bundle = zzyVar.zzy) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            zznn.zza(zzyVar.zzy.getBoolean("dataCollectionDefaultEnabled"));
        }
        return zznn;
    }

    private static void zza(zzcu zzcuVar) {
        if (zzcuVar != null) {
            if (zzcuVar.isInitialized()) {
                return;
            }
            String valueOf = String.valueOf(zzcuVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Component not created");
    }

    private static void zza(zzf zzfVar) {
        if (zzfVar != null) {
            if (zzfVar.isInitialized()) {
                return;
            }
            String valueOf = String.valueOf(zzfVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Component not created");
    }

    private static void zza(zzct zzctVar) {
        if (zzctVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public final void zza(boolean z) {
        this.zzoj = Boolean.valueOf(z);
    }
}
