package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcu extends ContentObserver {
    public zzcu(zzcs zzcsVar, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        zzcw.zzjp();
    }
}
