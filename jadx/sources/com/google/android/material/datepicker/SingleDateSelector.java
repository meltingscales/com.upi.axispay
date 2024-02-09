package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new b();
    public Long b;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a extends zw {
        public final /* synthetic */ ix h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, ix ixVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.h = ixVar;
        }

        @Override // defpackage.zw
        public void e() {
            this.h.a();
        }

        @Override // defpackage.zw
        public void f(Long l) {
            if (l == null) {
                SingleDateSelector.this.d();
            } else {
                SingleDateSelector.this.J(l.longValue());
            }
            this.h.b(SingleDateSelector.this.z());
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class b implements Parcelable.Creator<SingleDateSelector> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.b = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void J(long j) {
        this.b = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, ix<Long> ixVar) {
        View inflate = layoutInflater.inflate(ov.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(mv.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (cy.a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat k = mx.k();
        String l = mx.l(inflate.getResources(), k);
        textInputLayout.setPlaceholderText(l);
        Long l2 = this.b;
        if (l2 != null) {
            editText.setText(k.format(l2));
        }
        editText.addTextChangedListener(new a(l, k, textInputLayout, calendarConstraints, ixVar));
        ny.g(editText);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String b(Context context) {
        Resources resources = context.getResources();
        Long l = this.b;
        if (l == null) {
            return resources.getString(qv.mtrl_picker_date_header_unselected);
        }
        return resources.getString(qv.mtrl_picker_date_header_selected, ax.j(l.longValue()));
    }

    public final void d() {
        this.b = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: e */
    public Long z() {
        return this.b;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int j(Context context) {
        return sy.c(context, iv.materialCalendarTheme, dx.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<za<Long, Long>> k() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean r() {
        return this.b != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<Long> w() {
        ArrayList arrayList = new ArrayList();
        Long l = this.b;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.b);
    }
}
