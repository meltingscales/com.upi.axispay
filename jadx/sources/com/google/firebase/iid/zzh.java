package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzh {
    private static final Executor zzaf = zzj.zzam;

    public static final /* synthetic */ Thread zza(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }

    public static Executor zzd() {
        return zzaf;
    }

    public static Executor zze() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzk.zzan);
    }
}
