package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: AxisPay */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class ActivityLifecycleObserver {
    @KeepForSdk
    public static final ActivityLifecycleObserver of(Activity activity) {
        return new zab(zaa.zaa(activity));
    }

    @KeepForSdk
    public abstract ActivityLifecycleObserver onStopCallOnce(Runnable runnable);
}
