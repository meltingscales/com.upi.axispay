package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.olive.upi.transport.model.BeneVpa;
import com.upi.axispay.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: AxisPay */
/* renamed from: s90  reason: default package */
/* loaded from: classes.dex */
public class s90 extends BaseAdapter implements Filterable {
    public ArrayList<BeneVpa> b;
    public b c = new b();
    public LayoutInflater d;
    public ArrayList<BeneVpa> e;

    /* compiled from: AxisPay */
    /* renamed from: s90$a */
    /* loaded from: classes.dex */
    public static class a {
        public TextView a;

        public a(View view) {
            this.a = (TextView) view.findViewById(R.id.text_vpa);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: s90$b */
    /* loaded from: classes.dex */
    public class b extends Filter {
        public b() {
        }

        @Override // android.widget.Filter
        public CharSequence convertResultToString(Object obj) {
            return super.convertResultToString(obj);
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = new ArrayList();
            s90 s90Var = s90.this;
            if (s90Var.e == null) {
                s90Var.e = s90Var.b;
            }
            if (charSequence != null) {
                ArrayList<BeneVpa> arrayList2 = s90.this.e;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    Iterator<BeneVpa> it = s90.this.e.iterator();
                    while (it.hasNext()) {
                        BeneVpa next = it.next();
                        if (next.toString().toLowerCase().contains(charSequence.toString().toLowerCase())) {
                            arrayList.add(next);
                        }
                    }
                }
                filterResults.values = arrayList;
            }
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            s90.this.b = (ArrayList) filterResults.values;
            s90.this.notifyDataSetChanged();
        }
    }

    public s90(Context context, ArrayList<BeneVpa> arrayList) {
        this.b = arrayList;
        this.b = arrayList;
        this.d = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public BeneVpa getItem(int i) {
        ArrayList<BeneVpa> arrayList = this.b;
        if (arrayList == null) {
            return null;
        }
        return arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<BeneVpa> arrayList = this.b;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = this.d.inflate(R.layout.mandate_bene_filter_row, (ViewGroup) null);
            aVar = new a(view);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.a.setText(this.b.get(i).getVpa());
        return view;
    }
}
