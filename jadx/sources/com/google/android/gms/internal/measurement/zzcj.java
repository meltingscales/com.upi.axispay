package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcj extends ContentObserver {
    public zzcj(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = zzci.zzyx;
        atomicBoolean.set(true);
    }
}
