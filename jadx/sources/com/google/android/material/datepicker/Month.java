package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();
    public final Calendar b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final long g;
    public String h;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Month createFromParcel(Parcel parcel) {
            return Month.c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar f = mx.f(calendar);
        this.b = f;
        this.c = f.get(2);
        this.d = f.get(1);
        this.e = f.getMaximum(7);
        this.f = f.getActualMaximum(5);
        this.g = f.getTimeInMillis();
    }

    public static Month c(int i, int i2) {
        Calendar q = mx.q();
        q.set(1, i);
        q.set(2, i2);
        return new Month(q);
    }

    public static Month d(long j) {
        Calendar q = mx.q();
        q.setTimeInMillis(j);
        return new Month(q);
    }

    public static Month e() {
        return new Month(mx.o());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(Month month) {
        return this.b.compareTo(month.b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Month) {
            Month month = (Month) obj;
            return this.c == month.c && this.d == month.d;
        }
        return false;
    }

    public int f() {
        int firstDayOfWeek = this.b.get(7) - this.b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.e : firstDayOfWeek;
    }

    public long g(int i) {
        Calendar f = mx.f(this.b);
        f.set(5, i);
        return f.getTimeInMillis();
    }

    public int h(long j) {
        Calendar f = mx.f(this.b);
        f.setTimeInMillis(j);
        return f.get(5);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public String i(Context context) {
        if (this.h == null) {
            this.h = ax.i(context, this.b.getTimeInMillis());
        }
        return this.h;
    }

    public long l() {
        return this.b.getTimeInMillis();
    }

    public Month n(int i) {
        Calendar f = mx.f(this.b);
        f.add(2, i);
        return new Month(f);
    }

    public int o(Month month) {
        if (this.b instanceof GregorianCalendar) {
            return ((month.d - this.d) * 12) + (month.c - this.c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d);
        parcel.writeInt(this.c);
    }
}
