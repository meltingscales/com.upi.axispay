package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new a();
    public final long b;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<DateValidatorPointForward> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    }

    public /* synthetic */ DateValidatorPointForward(long j, a aVar) {
        this(j);
    }

    public static DateValidatorPointForward a(long j) {
        return new DateValidatorPointForward(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.b == ((DateValidatorPointForward) obj).b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean m(long j) {
        return j >= this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
    }

    public DateValidatorPointForward(long j) {
        this.b = j;
    }
}
