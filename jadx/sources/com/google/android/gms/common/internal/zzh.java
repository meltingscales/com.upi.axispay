package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzh implements Parcelable.Creator<BinderWrapper> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BinderWrapper createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BinderWrapper[] newArray(int i) {
        return new BinderWrapper[i];
    }
}
