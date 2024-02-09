package com.google.firebase.crash;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzd implements Runnable {
    private final /* synthetic */ FirebaseCrash zzq;

    public zzd(FirebaseCrash firebaseCrash) {
        this.zzq = firebaseCrash;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzq.zzb();
    }
}
