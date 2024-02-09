package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzg implements AppMeasurement.OnEventListener {
    private final /* synthetic */ zzf zzabl;

    public zzg(zzf zzfVar) {
        this.zzabl = zzfVar;
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.OnEventListener, com.google.android.gms.measurement.internal.zzdb
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener;
        if (str == null || str.equals("crash") || !zzc.zzch(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle(CrashlyticsAnalyticsListener.EVENT_PARAMS_KEY, bundle);
        analyticsConnectorListener = this.zzabl.zzabh;
        analyticsConnectorListener.onMessageTriggered(3, bundle2);
    }
}
