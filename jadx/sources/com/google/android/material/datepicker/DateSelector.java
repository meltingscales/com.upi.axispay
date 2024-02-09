package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface DateSelector<S> extends Parcelable {
    void J(long j);

    View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, ix<S> ixVar);

    String b(Context context);

    int j(Context context);

    Collection<za<Long, Long>> k();

    boolean r();

    Collection<Long> w();

    S z();
}
