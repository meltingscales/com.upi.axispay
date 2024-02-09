package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.Set;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzf implements zza {
    private AppMeasurement zzaau;
    private AnalyticsConnector.AnalyticsConnectorListener zzabh;
    private zzg zzabk;

    public zzf(AppMeasurement appMeasurement, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zzabh = analyticsConnectorListener;
        this.zzaau = appMeasurement;
        zzg zzgVar = new zzg(this);
        this.zzabk = zzgVar;
        this.zzaau.registerOnMeasurementEventListener(zzgVar);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void registerEventNames(Set<String> set) {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void unregisterEventNames() {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zzju() {
        return this.zzabh;
    }
}
