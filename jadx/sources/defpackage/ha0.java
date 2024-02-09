package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.RecentBPTHistory;
import com.upi.axispay.R;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ha0  reason: default package */
/* loaded from: classes.dex */
public class ha0 extends RecyclerView.h<b> {
    public ArrayList<RecentBPTHistory> d;
    public Context e;
    public ng0 f;

    /* compiled from: AxisPay */
    /* renamed from: ha0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ RecentBPTHistory b;

        public a(RecentBPTHistory recentBPTHistory) {
            this.b = recentBPTHistory;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ha0.this.f.s(R.id.recent_list, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ha0$b */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.d0 {
        public ImageView A;
        public View B;
        public TextView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public b(ha0 ha0Var, View view) {
            super(view);
            this.B = view;
            this.v = (TextView) view.findViewById(R.id.line1);
            this.w = (TextView) view.findViewById(R.id.line2);
            this.x = (TextView) view.findViewById(R.id.line3);
            this.A = (ImageView) view.findViewById(R.id.icon);
            this.y = (TextView) view.findViewById(R.id.line4);
            this.z = (TextView) view.findViewById(R.id.plan_amount);
        }
    }

    public ha0(Context context, ArrayList<RecentBPTHistory> arrayList) {
        this.d = arrayList;
        this.e = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<RecentBPTHistory> arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(b bVar, int i) {
        RecentBPTHistory recentBPTHistory = this.d.get(i);
        TextView textView = bVar.z;
        textView.setText(C0059ao.a(14129) + recentBPTHistory.getAmount());
        bVar.v.setText(recentBPTHistory.getMobn_subid());
        bVar.w.setText(recentBPTHistory.getOperator());
        bVar.y.setText(String.format(this.e.getString(R.string.last_recharge), recentBPTHistory.getDatetime()));
        bVar.x.setVisibility(8);
        jg0.M(bVar.A, recentBPTHistory.getIcon(), recentBPTHistory.getOperator());
        bVar.B.setOnClickListener(new a(recentBPTHistory));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public b n(ViewGroup viewGroup, int i) {
        return new b(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recent_recharge_item, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.f = ng0Var;
    }

    public void z(ArrayList<RecentBPTHistory> arrayList) {
        this.d = arrayList;
        j();
    }
}
