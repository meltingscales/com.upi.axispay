package com.google.firebase.iid;

import android.util.Log;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzf implements Runnable {
    private final /* synthetic */ zze zzac;
    private final /* synthetic */ zzg zzad;

    public zzf(zzg zzgVar, zze zzeVar) {
        this.zzad = zzgVar;
        this.zzac = zzeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzc zzcVar;
        Log.isLoggable("EnhancedIntentService", 3);
        zzcVar = this.zzad.zzae;
        zzcVar.zzd(this.zzac.intent);
        this.zzac.finish();
    }
}
