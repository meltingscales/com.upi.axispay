package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: AxisPay */
@SafeParcelable.Class(creator = "BarcodeDetectorOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzj();
    @SafeParcelable.Field(id = 2)
    public int zza;
    @SafeParcelable.Field(id = 3)
    private boolean zzb;

    public zzk() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) boolean z) {
        this.zza = i;
        this.zzb = z;
    }
}
