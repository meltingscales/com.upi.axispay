package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
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
public class RangeDateSelector implements DateSelector<za<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new c();
    public String b;
    public Long c = null;
    public Long d = null;
    public Long e = null;
    public Long f = null;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a extends zw {
        public final /* synthetic */ TextInputLayout h;
        public final /* synthetic */ TextInputLayout i;
        public final /* synthetic */ ix j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, ix ixVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.h = textInputLayout2;
            this.i = textInputLayout3;
            this.j = ixVar;
        }

        @Override // defpackage.zw
        public void e() {
            RangeDateSelector.this.e = null;
            RangeDateSelector.this.n(this.h, this.i, this.j);
        }

        @Override // defpackage.zw
        public void f(Long l) {
            RangeDateSelector.this.e = l;
            RangeDateSelector.this.n(this.h, this.i, this.j);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b extends zw {
        public final /* synthetic */ TextInputLayout h;
        public final /* synthetic */ TextInputLayout i;
        public final /* synthetic */ ix j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, ix ixVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.h = textInputLayout2;
            this.i = textInputLayout3;
            this.j = ixVar;
        }

        @Override // defpackage.zw
        public void e() {
            RangeDateSelector.this.f = null;
            RangeDateSelector.this.n(this.h, this.i, this.j);
        }

        @Override // defpackage.zw
        public void f(Long l) {
            RangeDateSelector.this.f = l;
            RangeDateSelector.this.n(this.h, this.i, this.j);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class c implements Parcelable.Creator<RangeDateSelector> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.c = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.d = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void J(long j) {
        Long l = this.c;
        if (l == null) {
            this.c = Long.valueOf(j);
        } else if (this.d == null && i(l.longValue(), j)) {
            this.d = Long.valueOf(j);
        } else {
            this.d = null;
            this.c = Long.valueOf(j);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, ix<za<Long, Long>> ixVar) {
        View inflate = layoutInflater.inflate(ov.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(mv.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(mv.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (cy.a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.b = inflate.getResources().getString(qv.mtrl_picker_invalid_range);
        SimpleDateFormat k = mx.k();
        Long l = this.c;
        if (l != null) {
            editText.setText(k.format(l));
            this.e = this.c;
        }
        Long l2 = this.d;
        if (l2 != null) {
            editText2.setText(k.format(l2));
            this.f = this.d;
        }
        String l3 = mx.l(inflate.getResources(), k);
        textInputLayout.setPlaceholderText(l3);
        textInputLayout2.setPlaceholderText(l3);
        editText.addTextChangedListener(new a(l3, k, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, ixVar));
        editText2.addTextChangedListener(new b(l3, k, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, ixVar));
        ny.g(editText);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String b(Context context) {
        Resources resources = context.getResources();
        Long l = this.c;
        if (l == null && this.d == null) {
            return resources.getString(qv.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.d;
        if (l2 == null) {
            return resources.getString(qv.mtrl_picker_range_header_only_start_selected, ax.c(l.longValue()));
        }
        if (l == null) {
            return resources.getString(qv.mtrl_picker_range_header_only_end_selected, ax.c(l2.longValue()));
        }
        za<String, String> a2 = ax.a(l, l2);
        return resources.getString(qv.mtrl_picker_range_header_selected, a2.a, a2.b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void g(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.b.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: h */
    public za<Long, Long> z() {
        return new za<>(this.c, this.d);
    }

    public final boolean i(long j, long j2) {
        return j <= j2;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int j(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return sy.c(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(kv.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? iv.materialCalendarTheme : iv.materialCalendarFullscreenTheme, dx.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<za<Long, Long>> k() {
        if (this.c != null && this.d != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new za(this.c, this.d));
            return arrayList;
        }
        return new ArrayList();
    }

    public final void l(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.b);
        textInputLayout2.setError(" ");
    }

    public final void n(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, ix<za<Long, Long>> ixVar) {
        Long l = this.e;
        if (l != null && this.f != null) {
            if (i(l.longValue(), this.f.longValue())) {
                this.c = this.e;
                this.d = this.f;
                ixVar.b(z());
                return;
            }
            l(textInputLayout, textInputLayout2);
            ixVar.a();
            return;
        }
        g(textInputLayout, textInputLayout2);
        ixVar.a();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean r() {
        Long l = this.c;
        return (l == null || this.d == null || !i(l.longValue(), this.d.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<Long> w() {
        ArrayList arrayList = new ArrayList();
        Long l = this.c;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.d;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.c);
        parcel.writeValue(this.d);
    }
}
