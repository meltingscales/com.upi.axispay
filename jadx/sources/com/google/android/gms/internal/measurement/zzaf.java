package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzaa;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzaf extends zzaa.zza {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ zzaa zzar;
    private final /* synthetic */ String zzax;
    private final /* synthetic */ String zzay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaf(zzaa zzaaVar, Activity activity, String str, String str2) {
        super(zzaaVar);
        this.zzar = zzaaVar;
        this.val$activity = activity;
        this.zzax = str;
        this.zzay = str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzaa.zza
    public final void zzl() throws RemoteException {
        zzn zznVar;
        zznVar = this.zzar.zzan;
        zznVar.setCurrentScreen(ObjectWrapper.wrap(this.val$activity), this.zzax, this.zzay, this.timestamp);
    }
}
