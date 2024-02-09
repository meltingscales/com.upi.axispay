package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdm implements Runnable {
    private final /* synthetic */ zzdd zzpm;
    private final /* synthetic */ Bundle zzpt;

    public zzdm(zzdd zzddVar, Bundle bundle) {
        this.zzpm = zzddVar;
        this.zzpt = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzpm.zzf(this.zzpt);
    }
}
