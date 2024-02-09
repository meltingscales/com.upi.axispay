package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.BbpsHistory;
import com.upi.axispay.R;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: ga0  reason: default package */
/* loaded from: classes.dex */
public class ga0 extends RecyclerView.h<b> {
    public ArrayList<BbpsHistory> d;
    public Context e;
    public ng0 f;

    /* compiled from: AxisPay */
    /* renamed from: ga0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ BbpsHistory b;

        public a(BbpsHistory bbpsHistory) {
            this.b = bbpsHistory;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ga0.this.f.s(R.id.recent_list, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ga0$b */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.d0 {
        public ImageView A;
        public View B;
        public TextView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public b(ga0 ga0Var, View view) {
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

    public ga0(Context context, ArrayList<BbpsHistory> arrayList) {
        this.d = arrayList;
        this.e = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<BbpsHistory> arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(b bVar, int i) {
        BbpsHistory bbpsHistory = this.d.get(i);
        bVar.z.setText(bbpsHistory.getAmount());
        bVar.v.setText(bbpsHistory.getBillername());
        bVar.w.setText(bbpsHistory.getRrn());
        bVar.y.setText(String.format(this.e.getString(R.string.last_recharge), bbpsHistory.getTxndate()));
        bVar.x.setVisibility(8);
        if (TextUtils.isEmpty(bbpsHistory.getRrn())) {
            bVar.A.setImageDrawable(t8.f(this.e, R.drawable.def));
        } else {
            jg0.K(bVar.A, bbpsHistory.getRrn(), R.drawable.def);
        }
        bVar.B.setOnClickListener(new a(bbpsHistory));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public b n(ViewGroup viewGroup, int i) {
        return new b(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recent_recharge_item, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.f = ng0Var;
    }

    public void z(ArrayList<BbpsHistory> arrayList) {
        this.d = arrayList;
        j();
    }
}
