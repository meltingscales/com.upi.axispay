package com.google.android.gms.internal.vision;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzaw extends ContentObserver {
    private final /* synthetic */ zzau zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaw(zzau zzauVar, Handler handler) {
        super(null);
        this.zza = zzauVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zza();
    }
}
