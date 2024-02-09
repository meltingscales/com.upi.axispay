package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.Recharge;
import com.upi.axispay.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ea0  reason: default package */
/* loaded from: classes.dex */
public class ea0 extends RecyclerView.h<c> {
    public Context d;
    public ng0 e;
    public ArrayList<Recharge> f;

    /* compiled from: AxisPay */
    /* renamed from: ea0$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<Recharge> {
        public a(ea0 ea0Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Recharge recharge, Recharge recharge2) {
            try {
                return Double.compare(Double.valueOf(Double.parseDouble(recharge.getDenomination())).doubleValue(), Double.valueOf(Double.parseDouble(recharge2.getDenomination())).doubleValue());
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ea0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ Recharge b;

        public b(Recharge recharge) {
            this.b = recharge;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ea0.this.e.s(R.id.viewId, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ea0$c */
    /* loaded from: classes.dex */
    public class c extends RecyclerView.d0 {
        public TextView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public View z;

        public c(ea0 ea0Var, View view) {
            super(view);
            this.z = view;
            this.v = (TextView) view.findViewById(R.id.plan_line1);
            this.w = (TextView) view.findViewById(R.id.plan_line2);
            this.x = (TextView) view.findViewById(R.id.plan_line3);
            this.y = (TextView) view.findViewById(R.id.plan_amount);
        }
    }

    public ea0(Context context, ArrayList<Recharge> arrayList) {
        this.f = arrayList;
        z(arrayList);
        this.d = context;
    }

    public void A(ArrayList<Recharge> arrayList) {
        this.f = arrayList;
        z(arrayList);
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<Recharge> arrayList = this.f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(c cVar, int i) {
        Recharge recharge = this.f.get(i);
        TextView textView = cVar.v;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.getString(R.string.talktime));
        String a2 = C0059ao.a(4213);
        sb.append(a2);
        sb.append(recharge.getTalktime());
        textView.setText(sb.toString());
        TextView textView2 = cVar.w;
        textView2.setText(this.d.getString(R.string.validity) + a2 + recharge.getValidity());
        cVar.x.setText(recharge.getRemarks());
        TextView textView3 = cVar.y;
        textView3.setText(C0059ao.a(4214) + String.valueOf(recharge.getDenomination()));
        cVar.z.setOnClickListener(new b(recharge));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public c n(ViewGroup viewGroup, int i) {
        return new c(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recharge_plan_item, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.e = ng0Var;
    }

    public final void z(ArrayList<Recharge> arrayList) {
        if (arrayList != null) {
            Collections.sort(arrayList, new a(this));
        }
    }
}
