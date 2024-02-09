package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.NameVal;
import com.upi.axispay.R;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: f90  reason: default package */
/* loaded from: classes.dex */
public class f90 extends RecyclerView.h<a> {
    public ArrayList<NameVal> d;

    /* compiled from: AxisPay */
    /* renamed from: f90$a */
    /* loaded from: classes.dex */
    public static class a extends RecyclerView.d0 {
        public TextView v;
        public TextView w;

        public a(View view) {
            super(view);
            this.v = (TextView) view.findViewById(R.id.field_title);
            this.w = (TextView) view.findViewById(R.id.field_value);
        }
    }

    public f90(Context context, ArrayList<NameVal> arrayList) {
        this.d = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<NameVal> arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long f(int i) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(a aVar, int i) {
        NameVal nameVal = this.d.get(i);
        aVar.v.setText(nameVal.getName());
        aVar.w.setText(nameVal.getValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public a n(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bbps_display_items, viewGroup, false));
    }
}
