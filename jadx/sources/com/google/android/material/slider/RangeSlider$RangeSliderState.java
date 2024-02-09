package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class RangeSlider$RangeSliderState extends AbsSavedState {
    public static final Parcelable.Creator<RangeSlider$RangeSliderState> CREATOR = new a();
    public float b;
    public int c;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<RangeSlider$RangeSliderState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RangeSlider$RangeSliderState createFromParcel(Parcel parcel) {
            return new RangeSlider$RangeSliderState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RangeSlider$RangeSliderState[] newArray(int i) {
            return new RangeSlider$RangeSliderState[i];
        }
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.b);
        parcel.writeInt(this.c);
    }

    public RangeSlider$RangeSliderState(Parcel parcel) {
        super(parcel.readParcelable(RangeSlider$RangeSliderState.class.getClassLoader()));
        this.b = parcel.readFloat();
        this.c = parcel.readInt();
    }
}
