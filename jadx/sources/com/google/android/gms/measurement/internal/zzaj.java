package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: AxisPay */
@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzak();
    @SafeParcelable.Field(id = 2)
    public final String name;
    @SafeParcelable.Field(id = 4)
    public final String origin;
    @SafeParcelable.Field(id = 3)
    public final zzag zzfd;
    @SafeParcelable.Field(id = 5)
    public final long zzfp;

    @SafeParcelable.Constructor
    public zzaj(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) zzag zzagVar, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) long j) {
        this.name = str;
        this.zzfd = zzagVar;
        this.origin = str2;
        this.zzfp = j;
    }

    public final String toString() {
        String str = this.origin;
        String str2 = this.name;
        String valueOf = String.valueOf(this.zzfd);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.name, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzfd, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.origin, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzfp);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzaj(zzaj zzajVar, long j) {
        Preconditions.checkNotNull(zzajVar);
        this.name = zzajVar.name;
        this.zzfd = zzajVar.zzfd;
        this.origin = zzajVar.origin;
        this.zzfp = j;
    }
}
