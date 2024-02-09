package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final /* synthetic */ class zzk implements ThreadFactory {
    public static final ThreadFactory zzan = new zzk();

    private zzk() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return zzh.zza(runnable);
    }
}
