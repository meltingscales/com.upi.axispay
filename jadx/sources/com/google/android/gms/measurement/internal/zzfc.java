package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfc implements Runnable {
    private final /* synthetic */ zzey zzqz;

    public zzfc(zzey zzeyVar) {
        this.zzqz = zzeyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeg zzegVar = this.zzqz.zzqq;
        Context context = this.zzqz.zzqq.getContext();
        this.zzqz.zzqq.zzag();
        zzegVar.onServiceDisconnected(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
