package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzu extends zzb implements zzt {
    public zzu() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onEvent(parcel.readString(), parcel.readString(), (Bundle) zzc.zza(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int id = id();
            parcel2.writeNoException();
            parcel2.writeInt(id);
        }
        return true;
    }
}
