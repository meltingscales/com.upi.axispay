package com.google.android.gms.identity.intents;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzb extends zzc {
    public final /* synthetic */ UserAddressRequest zza;
    public final /* synthetic */ int zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(GoogleApiClient googleApiClient, UserAddressRequest userAddressRequest, int i) {
        super(googleApiClient);
        this.zza = userAddressRequest;
        this.zzb = i;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.internal.identity.zze zzeVar) throws RemoteException {
        zzeVar.zzp(this.zza, this.zzb);
        setResult((zzb) Status.RESULT_SUCCESS);
    }
}
