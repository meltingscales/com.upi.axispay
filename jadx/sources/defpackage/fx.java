package defpackage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: fx  reason: default package */
/* loaded from: classes.dex */
public final class fx<S> extends jx<S> {
    public int c;
    public DateSelector<S> d;
    public CalendarConstraints e;

    /* compiled from: AxisPay */
    /* renamed from: fx$a */
    /* loaded from: classes.dex */
    public class a extends ix<S> {
        public a() {
        }

        @Override // defpackage.ix
        public void a() {
            Iterator<ix<S>> it = fx.this.b.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // defpackage.ix
        public void b(S s) {
            Iterator<ix<S>> it = fx.this.b.iterator();
            while (it.hasNext()) {
                it.next().b(s);
            }
        }
    }

    public static <T> fx<T> l(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        fx<T> fxVar = new fx<>();
        Bundle bundle = new Bundle();
        bundle.putInt(C0059ao.a(6297), i);
        bundle.putParcelable(C0059ao.a(6298), dateSelector);
        bundle.putParcelable(C0059ao.a(6299), calendarConstraints);
        fxVar.setArguments(bundle);
        return fxVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.c = bundle.getInt(C0059ao.a(6300));
        this.d = (DateSelector) bundle.getParcelable(C0059ao.a(6301));
        this.e = (CalendarConstraints) bundle.getParcelable(C0059ao.a(6302));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.d.M(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.c)), viewGroup, bundle, this.e, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(C0059ao.a(6303), this.c);
        bundle.putParcelable(C0059ao.a(6304), this.d);
        bundle.putParcelable(C0059ao.a(6305), this.e);
    }
}
