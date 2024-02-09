package com.google.android.gms.internal.crash;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class zzb {
    private static final ClassLoader zzc = zzb.class.getClassLoader();

    private zzb() {
    }

    public static void writeBoolean(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static boolean zza(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void zza(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void zza(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
