package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zze extends zzb implements zzf {
    public static zzf zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof zzf) {
            return (zzf) queryLocalInterface;
        }
        return new zzd(iBinder);
    }
}
