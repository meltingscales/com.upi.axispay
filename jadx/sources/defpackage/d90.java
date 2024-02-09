package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.TransportConstants;
import com.olive.upi.transport.model.TranHistory;
import com.upi.axispay.R;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: d90  reason: default package */
/* loaded from: classes.dex */
public class d90 extends RecyclerView.h<a> {
    public ng0 d;
    public ArrayList<TranHistory> e;
    public Activity f;

    /* compiled from: AxisPay */
    /* renamed from: d90$a */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.d0 {
        public TextView A;
        public TextView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public a(d90 d90Var, View view) {
            super(view);
            this.v = (TextView) view.findViewById(R.id.text_date);
            this.w = (TextView) view.findViewById(R.id.text_amount);
            this.x = (TextView) view.findViewById(R.id.pay_type);
            this.y = (TextView) view.findViewById(R.id.text_head);
            this.z = (TextView) view.findViewById(R.id.vpa_id);
            this.A = (TextView) view.findViewById(R.id.text_tran_status);
        }
    }

    public d90(Activity activity, ArrayList<TranHistory> arrayList) {
        this.e = arrayList;
        this.f = activity;
    }

    public void A(ArrayList<TranHistory> arrayList) {
        this.e = arrayList;
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<TranHistory> arrayList = this.e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final boolean w(TranHistory tranHistory, a aVar) {
        String creditVpa = tranHistory.getCreditVpa();
        if (creditVpa != null && creditVpa.equalsIgnoreCase(TransportConstants.BILLPAY_UPIID)) {
            String[] split = tranHistory.getRemarks().split(C0059ao.a(3633));
            if (split.length >= 2) {
                if (split[0].equalsIgnoreCase(C0059ao.a(3634))) {
                    aVar.y.setText(R.string.dth_recharg_for);
                    aVar.x.setText(R.string.dth_no);
                } else if (split[0].equalsIgnoreCase(C0059ao.a(3635))) {
                    if (split[4].equalsIgnoreCase(C0059ao.a(3636))) {
                        aVar.y.setText(R.string.paid_bill_for);
                        aVar.x.setText(R.string.postpaid_no);
                    } else if (split[4].equalsIgnoreCase(C0059ao.a(3637))) {
                        aVar.y.setText(R.string.mob_recharg_for);
                        aVar.x.setText(R.string.mobile_no);
                    }
                }
                aVar.z.setText(split[1]);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public void l(a aVar, int i) {
        TranHistory tranHistory = this.e.get(i);
        boolean equals = tranHistory.getType().equals(C0059ao.a(3638));
        boolean equals2 = tranHistory.getType().equals(C0059ao.a(3639));
        String lowerCase = tranHistory.getCreditVpa().toLowerCase();
        if (!TextUtils.isEmpty(tranHistory.getStatus())) {
            aVar.A.setText(jg0.w(this.f, tranHistory.getStatus())[0]);
            aVar.A.setTextColor(t8.d(this.f, R.color.secondary_text));
        }
        aVar.v.setText(tranHistory.getDateTime());
        TextView textView = aVar.w;
        textView.setText(C0059ao.a(3640) + tranHistory.getAmount());
        aVar.x.setText(lowerCase.endsWith(C0059ao.a(3641)) ? R.string.ifsc : R.string.vpas);
        if (!equals) {
            if (equals2) {
                if (qa0.v().d(tranHistory.getCreditVpa()) != null) {
                    aVar.z.setText(jg0.j(tranHistory.getDebitVpa()));
                    aVar.y.setText(R.string.requested_to);
                    return;
                }
                aVar.z.setText(jg0.j(tranHistory.getCreditVpa()));
                aVar.y.setText(R.string.request_received_from);
            }
        } else if (w(tranHistory, aVar)) {
            tranHistory.setDirection(1);
        } else if (qa0.v().d(tranHistory.getDebitVpa()) != null) {
            aVar.z.setText(jg0.j(tranHistory.getCreditVpa()));
            aVar.y.setText(R.string.sent_to);
        } else {
            aVar.z.setText(jg0.j(tranHistory.getDebitVpa()));
            aVar.y.setText(R.string.received_form);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: y */
    public a n(ViewGroup viewGroup, int i) {
        return new a(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recent_transaction_list_row, viewGroup, false));
    }

    public void z(ng0 ng0Var) {
        this.d = ng0Var;
    }

    public d90(Activity activity) {
        this.f = activity;
    }
}
