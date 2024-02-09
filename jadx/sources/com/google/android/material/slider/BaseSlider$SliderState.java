package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BaseSlider$SliderState extends View.BaseSavedState {
    public static final Parcelable.Creator<BaseSlider$SliderState> CREATOR = new a();
    public float b;
    public float c;
    public ArrayList<Float> d;
    public float e;
    public boolean f;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<BaseSlider$SliderState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BaseSlider$SliderState createFromParcel(Parcel parcel) {
            return new BaseSlider$SliderState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BaseSlider$SliderState[] newArray(int i) {
            return new BaseSlider$SliderState[i];
        }
    }

    public /* synthetic */ BaseSlider$SliderState(Parcel parcel, pz pzVar) {
        this(parcel);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeList(this.d);
        parcel.writeFloat(this.e);
        parcel.writeBooleanArray(new boolean[]{this.f});
    }

    public BaseSlider$SliderState(Parcel parcel) {
        super(parcel);
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        ArrayList<Float> arrayList = new ArrayList<>();
        this.d = arrayList;
        parcel.readList(arrayList, Float.class.getClassLoader());
        this.e = parcel.readFloat();
        this.f = parcel.createBooleanArray()[0];
    }
}
