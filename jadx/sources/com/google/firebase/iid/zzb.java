package com.google.firebase.iid;

import android.content.Intent;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzb implements Runnable {
    private final /* synthetic */ Intent zzq;
    private final /* synthetic */ Intent zzr;
    private final /* synthetic */ zzc zzs;

    public zzb(zzc zzcVar, Intent intent, Intent intent2) {
        this.zzs = zzcVar;
        this.zzq = intent;
        this.zzr = intent2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzs.zzd(this.zzq);
        this.zzs.zza(this.zzr);
    }
}
