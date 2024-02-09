package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

/* compiled from: AxisPay */
@SafeParcelable.Class(creator = "EventParamsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzag extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzag> CREATOR = new zzai();
    @SafeParcelable.Field(getter = "z", id = 2)
    private final Bundle zzfm;

    @SafeParcelable.Constructor
    public zzag(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.zzfm = bundle;
    }

    public final Object get(String str) {
        return this.zzfm.get(str);
    }

    public final Long getLong(String str) {
        return Long.valueOf(this.zzfm.getLong(str));
    }

    public final String getString(String str) {
        return this.zzfm.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zzah(this);
    }

    public final int size() {
        return this.zzfm.size();
    }

    public final String toString() {
        return this.zzfm.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, zzct(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final Double zzaj(String str) {
        return Double.valueOf(this.zzfm.getDouble(str));
    }

    public final Bundle zzct() {
        return new Bundle(this.zzfm);
    }
}
