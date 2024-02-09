package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfa implements Runnable {
    private final /* synthetic */ ComponentName val$name;
    private final /* synthetic */ zzey zzqz;

    public zzfa(zzey zzeyVar, ComponentName componentName) {
        this.zzqz = zzeyVar;
        this.val$name = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzqz.zzqq.onServiceDisconnected(this.val$name);
    }
}
