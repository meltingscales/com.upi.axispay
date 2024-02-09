package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;
import java.util.Set;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzd implements zza {
    private AppMeasurement zzaau;
    public Set<String> zzabg;
    private AnalyticsConnector.AnalyticsConnectorListener zzabh;
    private zze zzabi;

    public zzd(AppMeasurement appMeasurement, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zzabh = analyticsConnectorListener;
        this.zzaau = appMeasurement;
        zze zzeVar = new zze(this);
        this.zzabi = zzeVar;
        this.zzaau.registerOnMeasurementEventListener(zzeVar);
        this.zzabg = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void registerEventNames(Set<String> set) {
        this.zzabg.clear();
        Set<String> set2 = this.zzabg;
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (hashSet.size() >= 50) {
                break;
            } else if (zzc.zzcj(str) && zzc.zzci(str)) {
                hashSet.add(zzc.zzcl(str));
            }
        }
        set2.addAll(hashSet);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void unregisterEventNames() {
        this.zzabg.clear();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zzju() {
        return this.zzabh;
    }
}
