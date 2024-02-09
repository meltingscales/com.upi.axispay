package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcn extends ContentObserver {
    private final /* synthetic */ zzcl zzzp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcn(zzcl zzclVar, Handler handler) {
        super(null);
        this.zzzp = zzclVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zzzp.zzjk();
    }
}
