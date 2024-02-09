package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbf extends zzcu {
    @VisibleForTesting
    public static final Pair<String, Long> zzky = new Pair<>("", 0L);
    private SharedPreferences zzkz;
    public zzbj zzla;
    public final zzbi zzlb;
    public final zzbi zzlc;
    public final zzbi zzld;
    public final zzbi zzle;
    public final zzbi zzlf;
    public final zzbi zzlg;
    public final zzbi zzlh;
    public final zzbk zzli;
    private String zzlj;
    private boolean zzlk;
    private long zzll;
    public final zzbi zzlm;
    public final zzbi zzln;
    public final zzbh zzlo;
    public final zzbk zzlp;
    public final zzbh zzlq;
    public final zzbh zzlr;
    public final zzbi zzls;
    public final zzbi zzlt;
    public boolean zzlu;
    public zzbh zzlv;

    public zzbf(zzby zzbyVar) {
        super(zzbyVar);
        this.zzlb = new zzbi(this, "last_upload", 0L);
        this.zzlc = new zzbi(this, "last_upload_attempt", 0L);
        this.zzld = new zzbi(this, "backoff", 0L);
        this.zzle = new zzbi(this, "last_delete_stale", 0L);
        this.zzlm = new zzbi(this, "time_before_start", 10000L);
        this.zzln = new zzbi(this, "session_timeout", 1800000L);
        this.zzlo = new zzbh(this, "start_new_session", true);
        this.zzls = new zzbi(this, "last_pause_time", 0L);
        this.zzlt = new zzbi(this, "time_active", 0L);
        this.zzlp = new zzbk(this, "non_personalized_ads", null);
        this.zzlq = new zzbh(this, "use_dynamite_api", false);
        this.zzlr = new zzbh(this, "allow_remote_dynamite", false);
        this.zzlf = new zzbi(this, "midnight_offset", 0L);
        this.zzlg = new zzbi(this, "first_open_time", 0L);
        this.zzlh = new zzbi(this, "app_install_time", 0L);
        this.zzli = new zzbk(this, "app_instance_id", null);
        this.zzlv = new zzbh(this, "app_backgrounded", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences zzdr() {
        zzq();
        zzah();
        return this.zzkz;
    }

    public final void setMeasurementEnabled(boolean z) {
        zzq();
        zzad().zzdi().zza("Setting measurementEnabled", Boolean.valueOf(z));
        SharedPreferences.Editor edit = zzdr().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    @Override // com.google.android.gms.measurement.internal.zzcu
    public final boolean zzak() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzcu
    public final void zzal() {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzkz = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzlu = z;
        if (!z) {
            SharedPreferences.Editor edit = this.zzkz.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.zzla = new zzbj(this, "health_monitor", Math.max(0L, zzal.zzgf.get(null).longValue()));
    }

    public final Pair<String, Boolean> zzar(String str) {
        zzq();
        long elapsedRealtime = zzz().elapsedRealtime();
        if (this.zzlj != null && elapsedRealtime < this.zzll) {
            return new Pair<>(this.zzlj, Boolean.valueOf(this.zzlk));
        }
        this.zzll = elapsedRealtime + zzaf().zza(str, zzal.zzge);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(getContext());
            if (advertisingIdInfo != null) {
                this.zzlj = advertisingIdInfo.getId();
                this.zzlk = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.zzlj == null) {
                this.zzlj = "";
            }
        } catch (Exception e) {
            zzad().zzdh().zza("Unable to get advertising id", e);
            this.zzlj = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.zzlj, Boolean.valueOf(this.zzlk));
    }

    public final String zzas(String str) {
        zzq();
        String str2 = (String) zzar(str).first;
        MessageDigest messageDigest = zzgd.getMessageDigest();
        if (messageDigest == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest(str2.getBytes())));
    }

    public final void zzat(String str) {
        zzq();
        SharedPreferences.Editor edit = zzdr().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    public final void zzau(String str) {
        zzq();
        SharedPreferences.Editor edit = zzdr().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    public final void zzd(boolean z) {
        zzq();
        zzad().zzdi().zza("Setting useService", Boolean.valueOf(z));
        SharedPreferences.Editor edit = zzdr().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    public final String zzds() {
        zzq();
        return zzdr().getString("gmp_app_id", null);
    }

    public final String zzdt() {
        zzq();
        return zzdr().getString("admob_app_id", null);
    }

    public final Boolean zzdu() {
        zzq();
        if (zzdr().contains("use_service")) {
            return Boolean.valueOf(zzdr().getBoolean("use_service", false));
        }
        return null;
    }

    public final void zzdv() {
        zzq();
        zzad().zzdi().zzaq("Clearing collection preferences.");
        if (zzaf().zza(zzal.zzio)) {
            Boolean zzdw = zzdw();
            SharedPreferences.Editor edit = zzdr().edit();
            edit.clear();
            edit.apply();
            if (zzdw != null) {
                setMeasurementEnabled(zzdw.booleanValue());
                return;
            }
            return;
        }
        boolean contains = zzdr().contains("measurement_enabled");
        boolean zze = contains ? zze(true) : true;
        SharedPreferences.Editor edit2 = zzdr().edit();
        edit2.clear();
        edit2.apply();
        if (contains) {
            setMeasurementEnabled(zze);
        }
    }

    public final Boolean zzdw() {
        zzq();
        if (zzdr().contains("measurement_enabled")) {
            return Boolean.valueOf(zzdr().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final String zzdx() {
        zzq();
        String string = zzdr().getString("previous_os_version", null);
        zzy().zzah();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = zzdr().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    public final boolean zzdy() {
        zzq();
        return zzdr().getBoolean("deferred_analytics_collection", false);
    }

    public final boolean zzdz() {
        return this.zzkz.contains("deferred_analytics_collection");
    }

    public final boolean zze(boolean z) {
        zzq();
        return zzdr().getBoolean("measurement_enabled", z);
    }

    public final void zzf(boolean z) {
        zzq();
        zzad().zzdi().zza("Updating deferred analytics collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = zzdr().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    public final boolean zzx(long j) {
        return j - this.zzln.get() > this.zzls.get();
    }
}
