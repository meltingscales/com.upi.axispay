package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbn implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zze zzmg;
    private final /* synthetic */ ServiceConnection zzmh;
    private final /* synthetic */ zzbm zzmi;

    public zzbn(zzbm zzbmVar, com.google.android.gms.internal.measurement.zze zzeVar, ServiceConnection serviceConnection) {
        this.zzmi = zzbmVar;
        this.zzmg = zzeVar;
        this.zzmh = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        zzbm zzbmVar = this.zzmi;
        zzbl zzblVar = zzbmVar.zzmf;
        str = zzbmVar.packageName;
        com.google.android.gms.internal.measurement.zze zzeVar = this.zzmg;
        ServiceConnection serviceConnection = this.zzmh;
        Bundle zza = zzblVar.zza(str, zzeVar);
        zzblVar.zzl.zzac().zzq();
        if (zza != null) {
            long j = zza.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                zzblVar.zzl.zzad().zzda().zzaq("Service response is missing Install Referrer install timestamp");
            } else {
                String string = zza.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    zzblVar.zzl.zzad().zzdi().zza("InstallReferrer API result", string);
                    zzgd zzab = zzblVar.zzl.zzab();
                    String valueOf = String.valueOf(string);
                    Bundle zza2 = zzab.zza(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
                    if (zza2 == null) {
                        zzblVar.zzl.zzad().zzda().zzaq("No campaign params defined in install referrer result");
                    } else {
                        String string2 = zza2.getString(FirebaseAnalytics.Param.MEDIUM);
                        if ((string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) ? false : true) {
                            long j2 = zza.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                zzblVar.zzl.zzad().zzda().zzaq("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                zza2.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == zzblVar.zzl.zzae().zzlh.get()) {
                            zzblVar.zzl.zzag();
                            zzblVar.zzl.zzad().zzdi().zzaq("Campaign has already been logged");
                        } else {
                            zzblVar.zzl.zzae().zzlh.set(j);
                            zzblVar.zzl.zzag();
                            zzblVar.zzl.zzad().zzdi().zza("Logging Install Referrer campaign from sdk with ", "referrer API");
                            zza2.putString("_cis", "referrer API");
                            zzblVar.zzl.zzs().logEvent("auto", "_cmp", zza2);
                        }
                    }
                } else {
                    zzblVar.zzl.zzad().zzda().zzaq("No referrer defined in install referrer response");
                }
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.getInstance().unbindService(zzblVar.zzl.getContext(), serviceConnection);
        }
    }
}
