package com.google.android.gms.internal.crash;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crash.FirebaseCrash;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import java.util.concurrent.ExecutorService;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzr implements AnalyticsConnector.AnalyticsConnectorListener {
    private final FirebaseCrash.zza zzac;
    private final ExecutorService zzao;
    private final Context zzf;

    public zzr(Context context, ExecutorService executorService, FirebaseCrash.zza zzaVar) {
        this.zzf = context.getApplicationContext();
        this.zzao = executorService;
        this.zzac = zzaVar;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public final void onMessageTriggered(int i, Bundle bundle) {
        if (i != 3 || this.zzac == null || bundle == null) {
            return;
        }
        this.zzao.execute(new zzd(this.zzf, this.zzac, bundle.getString("name"), bundle.getLong("timestampInMillis"), bundle.getBundle(CrashlyticsAnalyticsListener.EVENT_PARAMS_KEY)));
    }
}
