package com.google.android.material.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class NavigationBarView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<NavigationBarView$SavedState> CREATOR = new a();
    public Bundle d;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class a implements Parcelable.ClassLoaderCreator<NavigationBarView$SavedState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public NavigationBarView$SavedState createFromParcel(Parcel parcel) {
            return new NavigationBarView$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public NavigationBarView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new NavigationBarView$SavedState(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public NavigationBarView$SavedState[] newArray(int i) {
            return new NavigationBarView$SavedState[i];
        }
    }

    public NavigationBarView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        c(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
    }

    public final void c(Parcel parcel, ClassLoader classLoader) {
        this.d = parcel.readBundle(classLoader);
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.d);
    }
}
