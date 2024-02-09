package com.google.firebase.crash;

import com.google.android.gms.internal.crash.zzm;
import java.util.concurrent.Callable;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzg implements Callable<zzm> {
    private final /* synthetic */ zzf zzy;

    public zzg(zzf zzfVar) {
        this.zzy = zzfVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzm call() throws Exception {
        return this.zzy.zzj();
    }
}
