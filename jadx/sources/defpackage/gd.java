package defpackage;

import android.database.Cursor;
import android.widget.Filter;

/* compiled from: AxisPay */
/* renamed from: gd  reason: default package */
/* loaded from: classes.dex */
public class gd extends Filter {
    public a a;

    /* compiled from: AxisPay */
    /* renamed from: gd$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    public gd(a aVar) {
        this.a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.a.c((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d = this.a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d != null) {
            filterResults.count = d.getCount();
            filterResults.values = d;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b = this.a.b();
        Object obj = filterResults.values;
        if (obj == null || obj == b) {
            return;
        }
        this.a.a((Cursor) obj);
    }
}
