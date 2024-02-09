package com.google.android.gms.internal.identity;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.identity.intents.UserAddressRequest;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzh extends zza implements IInterface {
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.identity.intents.internal.IAddressService");
    }

    public final void zzc(zzg zzgVar, UserAddressRequest userAddressRequest, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzgVar);
        zzc.zzb(zza, userAddressRequest);
        zzc.zzb(zza, bundle);
        zzb(2, zza);
    }
}
