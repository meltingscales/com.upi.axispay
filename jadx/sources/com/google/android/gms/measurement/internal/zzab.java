package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzab {
    private static volatile Handler handler;
    private final zzcv zzer;
    private final Runnable zzes;
    private volatile long zzet;

    public zzab(zzcv zzcvVar) {
        Preconditions.checkNotNull(zzcvVar);
        this.zzer = zzcvVar;
        this.zzes = new zzac(this, zzcvVar);
    }

    private final Handler getHandler() {
        Handler handler2;
        if (handler != null) {
            return handler;
        }
        synchronized (zzab.class) {
            if (handler == null) {
                handler = new com.google.android.gms.internal.measurement.zzk(this.zzer.getContext().getMainLooper());
            }
            handler2 = handler;
        }
        return handler2;
    }

    public static /* synthetic */ long zza(zzab zzabVar, long j) {
        zzabVar.zzet = 0L;
        return 0L;
    }

    public final void cancel() {
        this.zzet = 0L;
        getHandler().removeCallbacks(this.zzes);
    }

    public abstract void run();

    public final boolean zzcn() {
        return this.zzet != 0;
    }

    public final void zzv(long j) {
        cancel();
        if (j >= 0) {
            this.zzet = this.zzer.zzz().currentTimeMillis();
            if (getHandler().postDelayed(this.zzes, j)) {
                return;
            }
            this.zzer.zzad().zzda().zza("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }
}
