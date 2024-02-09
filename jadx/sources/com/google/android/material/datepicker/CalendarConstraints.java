package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();
    public final Month b;
    public final Month c;
    public final DateValidator d;
    public Month e;
    public final int f;
    public final int g;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface DateValidator extends Parcelable {
        boolean m(long j);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class b {
        public static final long e = mx.a(Month.c(1900, 0).g);
        public static final long f = mx.a(Month.c(2100, 11).g);
        public long a;
        public long b;
        public Long c;
        public DateValidator d;

        public b(CalendarConstraints calendarConstraints) {
            this.a = e;
            this.b = f;
            this.d = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.a = calendarConstraints.b.g;
            this.b = calendarConstraints.c.g;
            this.c = Long.valueOf(calendarConstraints.e.g);
            this.d = calendarConstraints.d;
        }

        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.d);
            Month d = Month.d(this.a);
            Month d2 = Month.d(this.b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.c;
            return new CalendarConstraints(d, d2, dateValidator, l == null ? null : Month.d(l.longValue()), null);
        }

        public b b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, a aVar) {
        this(month, month2, dateValidator, month3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CalendarConstraints) {
            CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
            return this.b.equals(calendarConstraints.b) && this.c.equals(calendarConstraints.c) && ya.a(this.e, calendarConstraints.e) && this.d.equals(calendarConstraints.d);
        }
        return false;
    }

    public Month f(Month month) {
        if (month.compareTo(this.b) < 0) {
            return this.b;
        }
        return month.compareTo(this.c) > 0 ? this.c : month;
    }

    public DateValidator g() {
        return this.d;
    }

    public Month h() {
        return this.c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.e, this.d});
    }

    public int i() {
        return this.g;
    }

    public Month l() {
        return this.e;
    }

    public Month n() {
        return this.b;
    }

    public int o() {
        return this.f;
    }

    public boolean p(long j) {
        if (this.b.g(1) <= j) {
            Month month = this.c;
            if (j <= month.g(month.f)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.d, 0);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
        this.b = month;
        this.c = month2;
        this.e = month3;
        this.d = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.g = month.o(month2) + 1;
        this.f = (month2.d - month.d) + 1;
    }
}
