package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzq {
    private final boolean zzdu = false;

    public zzq(Context context) {
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
