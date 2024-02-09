package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class NavigationBarPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator<NavigationBarPresenter$SavedState> CREATOR = new a();
    public int b;
    public ParcelableSparseArray c;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<NavigationBarPresenter$SavedState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public NavigationBarPresenter$SavedState createFromParcel(Parcel parcel) {
            return new NavigationBarPresenter$SavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public NavigationBarPresenter$SavedState[] newArray(int i) {
            return new NavigationBarPresenter$SavedState[i];
        }
    }

    public NavigationBarPresenter$SavedState() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, 0);
    }

    public NavigationBarPresenter$SavedState(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
    }
}
