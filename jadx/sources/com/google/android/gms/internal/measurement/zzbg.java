package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzaa;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbg extends zzaa.zza {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ zzaa.zzd zzbx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbg(zzaa.zzd zzdVar, Activity activity) {
        super(zzaa.this);
        this.zzbx = zzdVar;
        this.val$activity = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzaa.zza
    public final void zzl() throws RemoteException {
        zzn zznVar;
        zznVar = zzaa.this.zzan;
        zznVar.onActivityResumed(ObjectWrapper.wrap(this.val$activity), this.zzbs);
    }
}
