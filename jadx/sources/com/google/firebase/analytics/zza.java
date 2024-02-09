package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.measurement.internal.zzby;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zza implements Callable<String> {
    private final /* synthetic */ FirebaseAnalytics zzaar;

    public zza(FirebaseAnalytics firebaseAnalytics) {
        this.zzaar = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        String zzj;
        boolean z;
        zzby zzbyVar;
        String zzy;
        zzaa zzaaVar;
        zzj = this.zzaar.zzj();
        if (zzj != null) {
            return zzj;
        }
        z = this.zzaar.zzn;
        if (z) {
            zzaaVar = this.zzaar.zzaan;
            zzy = zzaaVar.getAppInstanceId();
        } else {
            zzbyVar = this.zzaar.zzl;
            zzy = zzbyVar.zzs().zzy(120000L);
        }
        if (zzy != null) {
            this.zzaar.zzbi(zzy);
            return zzy;
        }
        throw new TimeoutException();
    }
}
