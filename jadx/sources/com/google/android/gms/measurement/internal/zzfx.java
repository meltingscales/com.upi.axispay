package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfx implements Callable<String> {
    private final /* synthetic */ zzm zzos;
    private final /* synthetic */ zzft zzsr;

    public zzfx(zzft zzftVar, zzm zzmVar) {
        this.zzsr = zzftVar;
        this.zzos = zzmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        zzg zzae;
        if (!this.zzsr.zzaf().zzs(this.zzos.packageName)) {
            zzae = this.zzsr.zzdo().zzae(this.zzos.packageName);
        } else {
            zzae = this.zzsr.zzg(this.zzos);
        }
        if (zzae == null) {
            this.zzsr.zzad().zzdd().zzaq("App info was null when attempting to get app instance id");
            return null;
        }
        return zzae.getAppInstanceId();
    }
}
