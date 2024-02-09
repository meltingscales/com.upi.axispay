package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public final d b;
    public final List<CalendarConstraints.DateValidator> c;
    public static final d d = new a();
    public static final d e = new b();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new c();

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class a implements d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public boolean a(List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.m(j)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public int getId() {
            return 1;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class b implements d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public boolean a(List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.m(j)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public int getId() {
            return 2;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class c implements Parcelable.Creator<CompositeDateValidator> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CompositeDateValidator createFromParcel(Parcel parcel) {
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            d dVar = readInt == 2 ? CompositeDateValidator.e : readInt == 1 ? CompositeDateValidator.d : CompositeDateValidator.e;
            db.e(readArrayList);
            return new CompositeDateValidator(readArrayList, dVar, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface d {
        boolean a(List<CalendarConstraints.DateValidator> list, long j);

        int getId();
    }

    public /* synthetic */ CompositeDateValidator(List list, d dVar, a aVar) {
        this(list, dVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CompositeDateValidator) {
            CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
            return this.c.equals(compositeDateValidator.c) && this.b.getId() == compositeDateValidator.b.getId();
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean m(long j) {
        return this.b.a(this.c, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.c);
        parcel.writeInt(this.b.getId());
    }

    public CompositeDateValidator(List<CalendarConstraints.DateValidator> list, d dVar) {
        this.c = list;
        this.b = dVar;
    }
}
