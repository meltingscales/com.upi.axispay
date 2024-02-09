package com.google.android.gms.internal.crash;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: AxisPay */
@SafeParcelable.Class(creator = "FirebaseCrashOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    @SafeParcelable.Field(getter = "getAppID", id = 2)
    private String zzak;
    @SafeParcelable.Field(getter = "getApiKey", id = 3)
    private String zzal;

    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2) {
        this.zzak = str;
        this.zzal = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzak, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzal, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
