package com.google.android.gms.phenotype;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzb extends ContentObserver {
    private final /* synthetic */ zza zzm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(zza zzaVar, Handler handler) {
        super(null);
        this.zzm = zzaVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zzm.zzb();
    }
}
