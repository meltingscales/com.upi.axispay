package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tagmanager.DataLayer;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import com.google.firebase.crashlytics.internal.settings.SettingsJsonConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdd extends zzf {
    @VisibleForTesting
    public zzdx zzpf;
    private zzda zzpg;
    private final Set<zzdb> zzph;
    private boolean zzpi;
    private final AtomicReference<String> zzpj;
    @VisibleForTesting
    public boolean zzpk;

    public zzdd(zzby zzbyVar) {
        super(zzbyVar);
        this.zzph = new CopyOnWriteArraySet();
        this.zzpk = true;
        this.zzpj = new AtomicReference<>();
    }

    private final void zzb(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zzac().zza(new zzdf(this, str, str2, j, zzgd.zzh(bundle), z, z2, z3, str3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(Bundle bundle) {
        zzq();
        zzah();
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle.getString("name"));
        Preconditions.checkNotEmpty(bundle.getString("origin"));
        Preconditions.checkNotNull(bundle.get("value"));
        if (!this.zzl.isEnabled()) {
            zzad().zzdh().zzaq("Conditional property not sent since collection is disabled");
            return;
        }
        zzga zzgaVar = new zzga(bundle.getString("name"), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP), bundle.get("value"), bundle.getString("origin"));
        try {
            zzaj zza = zzab().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), bundle.getString("origin"), 0L, true, false);
            zzu().zzd(new zzr(bundle.getString("app_id"), bundle.getString("origin"), zzgaVar, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), zzab().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), bundle.getString("origin"), 0L, true, false), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), zza, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzab().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), bundle.getString("origin"), 0L, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(Bundle bundle) {
        zzq();
        zzah();
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle.getString("name"));
        if (!this.zzl.isEnabled()) {
            zzad().zzdh().zzaq("Conditional property not cleared since collection is disabled");
            return;
        }
        try {
            zzu().zzd(new zzr(bundle.getString("app_id"), bundle.getString("origin"), new zzga(bundle.getString("name"), 0L, null, null), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzab().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), bundle.getString("origin"), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzfa() {
        if (zzaf().zze(zzt().zzan(), zzal.zzin)) {
            zzq();
            String zzed = zzae().zzlp.zzed();
            if (zzed != null) {
                if ("unset".equals(zzed)) {
                    zza(SettingsJsonConstants.APP_KEY, "_npa", (Object) null, zzz().currentTimeMillis());
                } else {
                    zza(SettingsJsonConstants.APP_KEY, "_npa", Long.valueOf("true".equals(zzed) ? 1L : 0L), zzz().currentTimeMillis());
                }
            }
        }
        if (zzaf().zzs(zzt().zzan()) && this.zzl.isEnabled() && this.zzpk) {
            zzad().zzdh().zzaq("Recording app launch after enabling measurement for the first time (FE)");
            zzfb();
            return;
        }
        zzad().zzdh().zzaq("Updating Scion state (FE)");
        zzu().zzfe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg(boolean z) {
        zzq();
        zzo();
        zzah();
        zzad().zzdh().zza("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        zzae().setMeasurementEnabled(z);
        zzfa();
    }

    private final String zzz(long j) {
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            zzac().zza(new zzdi(this, atomicReference));
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                zzad().zzdd().zzaq("Interrupted waiting for app instance id");
                return null;
            }
        }
        return (String) atomicReference.get();
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzo();
        zza((String) null, str, str2, bundle);
    }

    public final void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotEmpty(str);
        zzn();
        zza(str, str2, str3, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final String getCurrentScreenClass() {
        zzec zzfd = this.zzl.zzv().zzfd();
        if (zzfd != null) {
            return zzfd.zzpv;
        }
        return null;
    }

    public final String getCurrentScreenName() {
        zzec zzfd = this.zzl.zzv().zzfd();
        if (zzfd != null) {
            return zzfd.zzpu;
        }
        return null;
    }

    public final String getGmpAppId() {
        if (this.zzl.zzem() != null) {
            return this.zzl.zzem();
        }
        try {
            return GoogleServices.getGoogleAppId();
        } catch (IllegalStateException e) {
            this.zzl.zzad().zzda().zza("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    public final Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        zzo();
        return zzb((String) null, str, str2, z);
    }

    public final Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        Preconditions.checkNotEmpty(str);
        zzn();
        return zzb(str, str2, str3, z);
    }

    public final void logEvent(String str, String str2, Bundle bundle) {
        logEvent(str, str2, bundle, true, true, zzz().currentTimeMillis());
    }

    public final void resetAnalyticsData(long j) {
        zzbi(null);
        zzac().zza(new zzdj(this, j));
    }

    public final void setConditionalUserProperty(Bundle bundle) {
        setConditionalUserProperty(bundle, zzz().currentTimeMillis());
    }

    public final void setMeasurementEnabled(boolean z) {
        zzah();
        zzo();
        zzac().zza(new zzdt(this, z));
    }

    public final void setMinimumSessionDuration(long j) {
        zzo();
        zzac().zza(new zzdv(this, j));
    }

    public final void setSessionTimeoutDuration(long j) {
        zzo();
        zzac().zza(new zzdw(this, j));
    }

    public final void zza(boolean z) {
        zzah();
        zzo();
        zzac().zza(new zzdu(this, z));
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

    public final void zzbi(String str) {
        this.zzpj.set(str);
    }

    public final void zzd(Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle.getString("app_id"));
        zzn();
        zza(new Bundle(bundle), zzz().currentTimeMillis());
    }

    public final void zzeu() {
        if (getContext().getApplicationContext() instanceof Application) {
            ((Application) getContext().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zzpf);
        }
    }

    public final Boolean zzev() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzac().zza(atomicReference, 15000L, "boolean test flag value", new zzde(this, atomicReference));
    }

    public final String zzew() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzac().zza(atomicReference, 15000L, "String test flag value", new zzdo(this, atomicReference));
    }

    public final Long zzex() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzac().zza(atomicReference, 15000L, "long test flag value", new zzdq(this, atomicReference));
    }

    public final Integer zzey() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzac().zza(atomicReference, 15000L, "int test flag value", new zzdr(this, atomicReference));
    }

    public final Double zzez() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzac().zza(atomicReference, 15000L, "double test flag value", new zzds(this, atomicReference));
    }

    public final void zzfb() {
        zzq();
        zzo();
        zzah();
        if (this.zzl.zzet()) {
            zzu().zzfb();
            this.zzpk = false;
            String zzdx = zzae().zzdx();
            if (TextUtils.isEmpty(zzdx)) {
                return;
            }
            zzy().zzah();
            if (zzdx.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", zzdx);
            logEvent("auto", "_ou", bundle);
        }
    }

    public final List<zzga> zzh(boolean z) {
        zzo();
        zzah();
        zzad().zzdh().zzaq("Fetching user attributes (FE)");
        if (zzac().zzef()) {
            zzad().zzda().zzaq("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        } else if (zzq.isMainThread()) {
            zzad().zzda().zzaq("Cannot get all user properties from main thread");
            return Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.zzl.zzac().zza(new zzdh(this, atomicReference, z));
                try {
                    atomicReference.wait(5000L);
                } catch (InterruptedException e) {
                    zzad().zzdd().zza("Interrupted waiting for get user properties", e);
                }
            }
            List<zzga> list = (List) atomicReference.get();
            if (list == null) {
                zzad().zzdd().zzaq("Timed out waiting for get user properties");
                return Collections.emptyList();
            }
            return list;
        }
    }

    public final String zzj() {
        zzo();
        return this.zzpj.get();
    }

    public final ArrayList<Bundle> zzn(String str, String str2) {
        zzo();
        return zzf(null, str, str2);
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

    public final String zzy(long j) {
        if (zzac().zzef()) {
            zzad().zzda().zzaq("Cannot retrieve app instance id from analytics worker thread");
            return null;
        } else if (zzq.isMainThread()) {
            zzad().zzda().zzaq("Cannot retrieve app instance id from main thread");
            return null;
        } else {
            long elapsedRealtime = zzz().elapsedRealtime();
            String zzz = zzz(120000L);
            long elapsedRealtime2 = zzz().elapsedRealtime() - elapsedRealtime;
            return (zzz != null || elapsedRealtime2 >= 120000) ? zzz : zzz(120000 - elapsedRealtime2);
        }
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        zzo();
        zzb(str == null ? SettingsJsonConstants.APP_KEY : str, str2, j, bundle == null ? new Bundle() : bundle, z2, !z2 || this.zzpg == null || zzgd.zzbs(str2), !z, null);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        zzo();
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzad().zzdd().zzaq("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        zza(bundle2, j);
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzn() {
        super.zzn();
    }

    public final void zzb(String str, String str2, Object obj, boolean z) {
        zza(str, str2, obj, z, zzz().currentTimeMillis());
    }

    public final void zza(String str, String str2, Bundle bundle, boolean z) {
        logEvent(str, str2, bundle, false, true, zzz().currentTimeMillis());
    }

    public final void zzb(zzdb zzdbVar) {
        zzo();
        zzah();
        Preconditions.checkNotNull(zzdbVar);
        if (this.zzph.remove(zzdbVar)) {
            return;
        }
        zzad().zzdd().zzaq("OnEventListener had not been registered");
    }

    public final void zza(String str, String str2, Bundle bundle) {
        zzo();
        zzq();
        zza(str, str2, zzz().currentTimeMillis(), bundle);
    }

    public final void zza(String str, String str2, long j, Bundle bundle) {
        zzo();
        zzq();
        zza(str, str2, j, bundle, true, this.zzpg == null || zzgd.zzbs(str2), false, null);
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzad zzy() {
        return super.zzy();
    }

    @VisibleForTesting
    private final Map<String, Object> zzb(String str, String str2, String str3, boolean z) {
        if (zzac().zzef()) {
            zzad().zzda().zzaq("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (zzq.isMainThread()) {
            zzad().zzda().zzaq("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.zzl.zzac().zza(new zzdp(this, atomicReference, str, str2, str3, z));
                try {
                    atomicReference.wait(5000L);
                } catch (InterruptedException e) {
                    zzad().zzdd().zza("Interrupted waiting for get user properties", e);
                }
            }
            List<zzga> list = (List) atomicReference.get();
            if (list == null) {
                zzad().zzdd().zzaq("Timed out waiting for get user properties");
                return Collections.emptyMap();
            }
            o4 o4Var = new o4(list.size());
            for (zzga zzgaVar : list) {
                o4Var.put(zzgaVar.name, zzgaVar.getValue());
            }
            return o4Var;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Clock zzz() {
        return super.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        long j2;
        String str4;
        String str5;
        boolean z4;
        zzdd zzddVar;
        String str6;
        String str7;
        ArrayList arrayList;
        String str8;
        zzec zzecVar;
        Bundle bundle2;
        long j3;
        String str9;
        int i;
        Class<?> cls;
        Preconditions.checkNotEmpty(str);
        if (!zzaf().zze(str3, zzal.zzis)) {
            Preconditions.checkNotEmpty(str2);
        }
        Preconditions.checkNotNull(bundle);
        zzq();
        zzah();
        if (!this.zzl.isEnabled()) {
            zzad().zzdh().zzaq("Event not sent since app measurement is disabled");
            return;
        }
        if (!this.zzpi) {
            this.zzpi = true;
            try {
                if (!this.zzl.zzep()) {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, getContext().getClassLoader());
                } else {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                }
                try {
                    cls.getDeclaredMethod("initialize", Context.class).invoke(null, getContext());
                } catch (Exception e) {
                    zzad().zzdd().zza("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                zzad().zzdg().zzaq("Tag Manager is not found and thus will not be used");
            }
        }
        if (z3) {
            zzag();
            if (!"_iap".equals(str2)) {
                zzgd zzab = this.zzl.zzab();
                int i2 = 2;
                if (zzab.zzp(DataLayer.EVENT_KEY, str2)) {
                    if (!zzab.zza(DataLayer.EVENT_KEY, zzcx.zzoy, str2)) {
                        i2 = 13;
                    } else if (zzab.zza(DataLayer.EVENT_KEY, 40, str2)) {
                        i2 = 0;
                    }
                }
                if (i2 != 0) {
                    zzad().zzdc().zza("Invalid public event name. Event will not be logged (FE)", zzaa().zzal(str2));
                    this.zzl.zzab();
                    this.zzl.zzab().zza(i2, "_ev", zzgd.zza(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzag();
        zzec zzfc = zzv().zzfc();
        if (zzfc != null && !bundle.containsKey("_sc")) {
            zzfc.zzpx = true;
        }
        zzed.zza(zzfc, bundle, z && z3);
        boolean equals = "am".equals(str);
        boolean zzbs = zzgd.zzbs(str2);
        if (z && this.zzpg != null && !zzbs && !equals) {
            zzad().zzdh().zza("Passing event to registered event handler (FE)", zzaa().zzal(str2), zzaa().zzc(bundle));
            this.zzpg.interceptEvent(str, str2, bundle, j);
        } else if (this.zzl.zzet()) {
            int zzbn = zzab().zzbn(str2);
            if (zzbn != 0) {
                zzad().zzdc().zza("Invalid event name. Event will not be logged (FE)", zzaa().zzal(str2));
                zzab();
                this.zzl.zzab().zza(str3, zzbn, "_ev", zzgd.zza(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            List<String> listOf = CollectionUtils.listOf((Object[]) new String[]{CrashlyticsAnalyticsListener.EVENT_ORIGIN_KEY, "_sn", "_sc", "_si"});
            Bundle zza = zzab().zza(str3, str2, bundle, listOf, z3, true);
            zzec zzecVar2 = (zza != null && zza.containsKey("_sc") && zza.containsKey("_si")) ? new zzec(zza.getString("_sn"), zza.getString("_sc"), Long.valueOf(zza.getLong("_si")).longValue()) : null;
            zzec zzecVar3 = zzecVar2 == null ? zzfc : zzecVar2;
            String str10 = "_ae";
            if (zzaf().zzac(str3)) {
                zzag();
                if (zzv().zzfc() != null && "_ae".equals(str2)) {
                    long zzfq = zzx().zzfq();
                    if (zzfq > 0) {
                        zzab().zzb(zza, zzfq);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(zza);
            long nextLong = zzab().zzgl().nextLong();
            if (zzaf().zze(zzt().zzan(), zzal.zzih) && zzae().zzls.get() > 0 && zzae().zzx(j) && zzae().zzlv.get()) {
                zzad().zzdi().zzaq("Current session is expired, remove the session number and Id");
                if (zzaf().zze(zzt().zzan(), zzal.zzid)) {
                    j2 = nextLong;
                    z4 = true;
                    str4 = str3;
                    str5 = str2;
                    zza("auto", "_sid", (Object) null, zzz().currentTimeMillis());
                } else {
                    j2 = nextLong;
                    str4 = str3;
                    str5 = str2;
                    z4 = true;
                }
                if (zzaf().zze(zzt().zzan(), zzal.zzie)) {
                    zza("auto", "_sno", (Object) null, zzz().currentTimeMillis());
                }
            } else {
                j2 = nextLong;
                str4 = str3;
                str5 = str2;
                z4 = true;
            }
            if (zzaf().zzab(zzt().zzan()) && zza.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, 0L) == 1) {
                zzad().zzdi().zzaq("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                zzddVar = this;
                zzddVar.zzl.zzx().zza(j, z4);
            } else {
                zzddVar = this;
            }
            String[] strArr = (String[]) zza.keySet().toArray(new String[bundle.size()]);
            Arrays.sort(strArr);
            int length = strArr.length;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String str11 = "_eid";
                if (i3 >= length) {
                    break;
                }
                String str12 = strArr[i3];
                Object obj = zza.get(str12);
                zzab();
                String[] strArr2 = strArr;
                Bundle[] zzb = zzgd.zzb(obj);
                int i5 = length;
                if (zzb != null) {
                    zza.putInt(str12, zzb.length);
                    int i6 = 0;
                    while (i6 < zzb.length) {
                        Bundle bundle3 = zzb[i6];
                        zzed.zza(zzecVar3, bundle3, true);
                        String str13 = str11;
                        ArrayList arrayList3 = arrayList2;
                        Bundle zza2 = zzab().zza(str3, "_ep", bundle3, listOf, z3, false);
                        zza2.putString("_en", str2);
                        zza2.putLong(str13, j2);
                        zza2.putString("_gn", str12);
                        zza2.putInt("_ll", zzb.length);
                        zza2.putInt("_i", i6);
                        arrayList3.add(zza2);
                        i6++;
                        zza = zza;
                        str5 = str2;
                        zzecVar3 = zzecVar3;
                        i4 = i4;
                        str10 = str10;
                        arrayList2 = arrayList3;
                        str11 = str13;
                    }
                    int i7 = i4;
                    arrayList = arrayList2;
                    str8 = str10;
                    zzecVar = zzecVar3;
                    bundle2 = zza;
                    j3 = j2;
                    str9 = str5;
                    i = zzb.length + i7;
                } else {
                    int i8 = i4;
                    arrayList = arrayList2;
                    str8 = str10;
                    zzecVar = zzecVar3;
                    bundle2 = zza;
                    j3 = j2;
                    str9 = str5;
                    i = i8;
                }
                i3++;
                zza = bundle2;
                str5 = str9;
                j2 = j3;
                length = i5;
                zzecVar3 = zzecVar;
                str10 = str8;
                i4 = i;
                arrayList2 = arrayList;
                strArr = strArr2;
            }
            int i9 = i4;
            ArrayList arrayList4 = arrayList2;
            String str14 = str10;
            Bundle bundle4 = zza;
            long j4 = j2;
            String str15 = str5;
            if (i9 != 0) {
                bundle4.putLong("_eid", j4);
                bundle4.putInt("_epc", i9);
            }
            int i10 = 0;
            while (i10 < arrayList4.size()) {
                Bundle bundle5 = (Bundle) arrayList4.get(i10);
                if (i10 != 0) {
                    str7 = "_ep";
                    str6 = str;
                } else {
                    str6 = str;
                    str7 = str15;
                }
                bundle5.putString(CrashlyticsAnalyticsListener.EVENT_ORIGIN_KEY, str6);
                if (z2) {
                    bundle5 = zzab().zzg(bundle5);
                }
                Bundle bundle6 = bundle5;
                zzad().zzdh().zza("Logging event (FE)", zzaa().zzal(str15), zzaa().zzc(bundle6));
                String str16 = str14;
                zzdd zzddVar2 = zzddVar;
                zzu().zzc(new zzaj(str7, new zzag(bundle6), str, j), str4);
                if (!equals) {
                    for (zzdb zzdbVar : zzddVar2.zzph) {
                        zzdbVar.onEvent(str, str2, new Bundle(bundle6), j);
                    }
                }
                i10++;
                str14 = str16;
                zzddVar = zzddVar2;
            }
            String str17 = str14;
            zzag();
            if (zzv().zzfc() == null || !str17.equals(str15)) {
                return;
            }
            zzx().zza(true, true);
        }
    }

    @VisibleForTesting
    private final ArrayList<Bundle> zzf(String str, String str2, String str3) {
        if (zzac().zzef()) {
            zzad().zzda().zzaq("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (zzq.isMainThread()) {
            zzad().zzda().zzaq("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.zzl.zzac().zza(new zzdn(this, atomicReference, str, str2, str3));
                try {
                    atomicReference.wait(5000L);
                } catch (InterruptedException e) {
                    zzad().zzdd().zza("Interrupted waiting for get conditional user properties", str, e);
                }
            }
            List list = (List) atomicReference.get();
            if (list == null) {
                zzad().zzdd().zza("Timed out waiting for get conditional user properties", str);
                return new ArrayList<>();
            }
            return zzgd.zzc(list);
        }
    }

    public final ArrayList<Bundle> zze(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzn();
        return zzf(str, str2, str3);
    }

    public final void zza(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = SettingsJsonConstants.APP_KEY;
        }
        String str3 = str;
        int i = 6;
        if (z) {
            i = zzab().zzbo(str2);
        } else {
            zzgd zzab = zzab();
            if (zzab.zzp("user property", str2)) {
                if (!zzab.zza("user property", zzcz.zzpc, str2)) {
                    i = 15;
                } else if (zzab.zza("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            zzab();
            this.zzl.zzab().zza(i, "_ev", zzgd.zza(str2, 24, true), str2 != null ? str2.length() : 0);
        } else if (obj != null) {
            int zzc = zzab().zzc(str2, obj);
            if (zzc != 0) {
                zzab();
                String zza = zzgd.zza(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    r0 = String.valueOf(obj).length();
                }
                this.zzl.zzab().zza(zzc, "_ev", zza, r0);
                return;
            }
            Object zzd = zzab().zzd(str2, obj);
            if (zzd != null) {
                zza(str3, str2, j, zzd);
            }
        } else {
            zza(str3, str2, j, (Object) null);
        }
    }

    private final void zza(String str, String str2, long j, Object obj) {
        zzac().zza(new zzdg(this, str, str2, obj, j));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.zzq()
            r8.zzo()
            r8.zzah()
            com.google.android.gms.measurement.internal.zzt r0 = r8.zzaf()
            com.google.android.gms.measurement.internal.zzap r1 = r8.zzt()
            java.lang.String r1 = r1.zzan()
            com.google.android.gms.measurement.internal.zzal$zza<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzal.zzin
            boolean r0 = r0.zze(r1, r2)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L77
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L77
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L67
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L67
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L4c
            r4 = r2
            goto L4e
        L4c:
            r4 = 0
        L4e:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.zzbf r0 = r8.zzae()
            com.google.android.gms.measurement.internal.zzbk r0 = r0.zzlp
            long r4 = r10.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L62
            java.lang.String r11 = "true"
        L62:
            r0.zzav(r11)
            r6 = r10
            goto L75
        L67:
            if (r11 != 0) goto L77
            com.google.android.gms.measurement.internal.zzbf r10 = r8.zzae()
            com.google.android.gms.measurement.internal.zzbk r10 = r10.zzlp
            java.lang.String r0 = "unset"
            r10.zzav(r0)
            r6 = r11
        L75:
            r3 = r1
            goto L79
        L77:
            r3 = r10
            r6 = r11
        L79:
            com.google.android.gms.measurement.internal.zzby r10 = r8.zzl
            boolean r10 = r10.isEnabled()
            if (r10 != 0) goto L8f
            com.google.android.gms.measurement.internal.zzau r9 = r8.zzad()
            com.google.android.gms.measurement.internal.zzaw r9 = r9.zzdh()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.zzaq(r10)
            return
        L8f:
            com.google.android.gms.measurement.internal.zzby r10 = r8.zzl
            boolean r10 = r10.zzet()
            if (r10 != 0) goto L98
            return
        L98:
            com.google.android.gms.measurement.internal.zzau r10 = r8.zzad()
            com.google.android.gms.measurement.internal.zzaw r10 = r10.zzdh()
            com.google.android.gms.measurement.internal.zzas r11 = r8.zzaa()
            java.lang.String r11 = r11.zzal(r3)
            java.lang.String r0 = "Setting user property (FE)"
            r10.zza(r0, r11, r6)
            com.google.android.gms.measurement.internal.zzga r10 = new com.google.android.gms.measurement.internal.zzga
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzeg r9 = r8.zzu()
            r9.zzb(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzdd.zza(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void zza(zzda zzdaVar) {
        zzda zzdaVar2;
        zzq();
        zzo();
        zzah();
        if (zzdaVar != null && zzdaVar != (zzdaVar2 = this.zzpg)) {
            Preconditions.checkState(zzdaVar2 == null, "EventInterceptor already set.");
        }
        this.zzpg = zzdaVar;
    }

    public final void zza(zzdb zzdbVar) {
        zzo();
        zzah();
        Preconditions.checkNotNull(zzdbVar);
        if (this.zzph.add(zzdbVar)) {
            return;
        }
        zzad().zzdd().zzaq("OnEventListener already registered");
    }

    private final void zza(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        zzcw.zza(bundle, "app_id", String.class, null);
        zzcw.zza(bundle, "origin", String.class, null);
        zzcw.zza(bundle, "name", String.class, null);
        zzcw.zza(bundle, "value", Object.class, null);
        zzcw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzcw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzcw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzcw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzcw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzcw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzcw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzcw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzcw.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle.getString("name"));
        Preconditions.checkNotEmpty(bundle.getString("origin"));
        Preconditions.checkNotNull(bundle.get("value"));
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle.getString("name");
        Object obj = bundle.get("value");
        if (zzab().zzbo(string) != 0) {
            zzad().zzda().zza("Invalid conditional user property name", zzaa().zzan(string));
        } else if (zzab().zzc(string, obj) != 0) {
            zzad().zzda().zza("Invalid conditional user property value", zzaa().zzan(string), obj);
        } else {
            Object zzd = zzab().zzd(string, obj);
            if (zzd == null) {
                zzad().zzda().zza("Unable to normalize conditional user property value", zzaa().zzan(string), obj);
                return;
            }
            zzcw.zza(bundle, zzd);
            long j2 = bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
            if (!TextUtils.isEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME)) && (j2 > 15552000000L || j2 < 1)) {
                zzad().zzda().zza("Invalid conditional user property timeout", zzaa().zzan(string), Long.valueOf(j2));
                return;
            }
            long j3 = bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
            if (j3 <= 15552000000L && j3 >= 1) {
                zzac().zza(new zzdl(this, bundle));
            } else {
                zzad().zzda().zza("Invalid conditional user property time to live", zzaa().zzan(string), Long.valueOf(j3));
            }
        }
    }

    private final void zza(String str, String str2, String str3, Bundle bundle) {
        long currentTimeMillis = zzz().currentTimeMillis();
        Preconditions.checkNotEmpty(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str3 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str3);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzac().zza(new zzdm(this, bundle2));
    }
}
