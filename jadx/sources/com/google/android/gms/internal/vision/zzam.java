package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: AxisPay */
@ShowFirstParty
@SafeParcelable.Class(creator = "TextRecognizerOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzam> CREATOR = new zzap();
    @SafeParcelable.Field(getter = "getCustomModelsDir", id = 2)
    private final String zza;

    @SafeParcelable.Constructor
    public zzam(@SafeParcelable.Param(id = 2) String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzam() {
        this(null);
    }
}
