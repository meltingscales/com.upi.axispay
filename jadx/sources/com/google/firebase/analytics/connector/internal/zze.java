package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.connector.AnalyticsConnector;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zze implements AppMeasurement.OnEventListener {
    private final /* synthetic */ zzd zzabj;

    public zze(zzd zzdVar) {
        this.zzabj = zzdVar;
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.OnEventListener, com.google.android.gms.measurement.internal.zzdb
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener;
        if (this.zzabj.zzabg.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", zzc.zzck(str2));
            analyticsConnectorListener = this.zzabj.zzabh;
            analyticsConnectorListener.onMessageTriggered(2, bundle2);
        }
    }
}
