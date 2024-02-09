package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: AxisPay */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public abstract class GCoreWakefulBroadcastReceiver extends we {
    @KeepForSdk
    public static boolean completeWakefulIntent(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        return we.completeWakefulIntent(intent);
    }
}
