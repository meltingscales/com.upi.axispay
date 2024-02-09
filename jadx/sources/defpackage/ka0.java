package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.TransportConstants;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.TranHistory;
import com.pkmmte.view.CircularImageView;
import com.upi.axispay.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ka0  reason: default package */
/* loaded from: classes.dex */
public class ka0 extends RecyclerView.h<b> {
    public int d;
    public Context e;
    public ng0 f;
    public List<TranHistory> g;

    /* compiled from: AxisPay */
    /* renamed from: ka0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ TranHistory c;

        public a(int i, TranHistory tranHistory) {
            this.b = i;
            this.c = tranHistory;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ng0 ng0Var = ka0.this.f;
            if (ng0Var != null) {
                ng0Var.s(this.b, this.c);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ka0$b */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.d0 {
        public TextView A;
        public CircularImageView B;
        public View C;
        public TextView D;
        public TextView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public b(ka0 ka0Var, View view) {
            super(view);
            this.C = view;
            this.v = (TextView) view.findViewById(R.id.tran_type);
            this.D = (TextView) view.findViewById(R.id.button_show_blc);
            TextView textView = (TextView) view.findViewById(R.id.button_check_complain_status);
            this.y = (TextView) view.findViewById(R.id.text_tran_status);
            this.z = (TextView) view.findViewById(R.id.text_tran_name);
            this.B = (CircularImageView) view.findViewById(R.id.tran_icon);
            this.A = (TextView) view.findViewById(R.id.text_tran_date);
            this.w = (TextView) view.findViewById(R.id.text_tran_amount);
            this.x = (TextView) view.findViewById(R.id.text_tran_connection);
        }
    }

    public ka0(Context context, ArrayList<TranHistory> arrayList) {
        this.g = arrayList;
        this.e = context;
    }

    public final void A(TranHistory tranHistory, b bVar, int i) {
        try {
            if (jg0.z(new SimpleDateFormat(C0059ao.a(4787)).parse(tranHistory.getDateTime()), new Date()) >= 3) {
                bVar.D.setVisibility(0);
                bVar.D.setText(R.string.Check_Status);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void B(List<TranHistory> list) {
        this.g = list;
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.g.size() + this.d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g(int i) {
        return 1;
    }

    public final boolean w(TranHistory tranHistory, b bVar) {
        String creditVpa = tranHistory.getCreditVpa();
        if (creditVpa != null && creditVpa.equalsIgnoreCase(TransportConstants.BILLPAY_UPIID)) {
            String[] split = tranHistory.getRemarks().split(C0059ao.a(4788));
            if (split.length >= 2) {
                if (split[0].equalsIgnoreCase(C0059ao.a(4789))) {
                    bVar.v.setText(R.string.dth_recharg_for);
                } else if (split[0].equalsIgnoreCase(C0059ao.a(4790))) {
                    if (split[4].equalsIgnoreCase(C0059ao.a(4791))) {
                        bVar.v.setText(R.string.paid_bill_for);
                    } else if (split[4].equalsIgnoreCase(C0059ao.a(4792))) {
                        bVar.v.setText(R.string.mob_recharg_for);
                    }
                }
                bVar.B.setImageDrawable(jg0.y(split[2], t8.d(this.e, R.color.debit)));
                bVar.z.setText(split[1]);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public void l(b bVar, int i) {
        TranHistory tranHistory = this.g.get(i);
        boolean equals = tranHistory.getType().equals(C0059ao.a(4793));
        String type = tranHistory.getType();
        String a2 = C0059ao.a(4794);
        boolean equals2 = type.equals(a2);
        bVar.D.setVisibility(8);
        String status = tranHistory.getStatus();
        if (!status.equalsIgnoreCase(C0059ao.a(4795)) && !status.equalsIgnoreCase(C0059ao.a(4796)) && !status.equalsIgnoreCase(C0059ao.a(4797))) {
            if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(4798))) {
                if (tranHistory.getMcc() != null && !tranHistory.getMcc().equals(C0059ao.a(4799))) {
                    A(tranHistory, bVar, i);
                }
            } else if (!equals2 || !status.equalsIgnoreCase(C0059ao.a(4800))) {
                A(tranHistory, bVar, i);
            }
        }
        TextView textView = bVar.w;
        textView.setText(C0059ao.a(4801) + String.valueOf(tranHistory.getAmount()));
        bVar.w.setTypeface(null, 1);
        bVar.z.setTypeface(null, 1);
        if (!TextUtils.isEmpty(tranHistory.getStatus())) {
            int[] w = jg0.w(this.e, tranHistory.getStatus());
            bVar.y.setText(w[0]);
            bVar.y.setTextColor(w[1]);
        }
        bVar.A.setText(tranHistory.getDateTime());
        if (tranHistory.getCreditVpa().toLowerCase().endsWith(C0059ao.a(4802))) {
            bVar.x.setText(R.string.ifsc);
        } else {
            bVar.x.setText(R.string.vpas);
        }
        String a3 = C0059ao.a(4803);
        String a4 = C0059ao.a(4804);
        if (equals) {
            if (w(tranHistory, bVar)) {
                tranHistory.setDirection(1);
            } else {
                Account d = qa0.v().d(tranHistory.getDebitVpa());
                if (tranHistory.getCreditdebittype() != null && tranHistory.getCreditdebittype().equalsIgnoreCase(a4)) {
                    tranHistory.setPayType(a4);
                    bVar.B.setImageDrawable(jg0.y(tranHistory.getCreditVpa(), t8.d(this.e, R.color.credit)));
                    bVar.z.setText(jg0.j(tranHistory.getCreditVpa()));
                    bVar.v.setText(R.string.sent_to);
                    tranHistory.setDirection(1);
                } else if (d == null) {
                    bVar.B.setImageDrawable(jg0.y(tranHistory.getDebitVpa(), t8.d(this.e, R.color.debit)));
                    bVar.z.setText(jg0.j(tranHistory.getDebitVpa()));
                    bVar.v.setText(R.string.received_form);
                    tranHistory.setPayType(a3);
                    tranHistory.setDirection(2);
                } else {
                    tranHistory.setPayType(a4);
                    bVar.B.setImageDrawable(jg0.y(tranHistory.getCreditVpa(), t8.d(this.e, R.color.credit)));
                    bVar.z.setText(jg0.j(tranHistory.getCreditVpa()));
                    bVar.v.setText(R.string.sent_to);
                    tranHistory.setDirection(1);
                }
            }
        } else if (tranHistory.getType().equals(a2) && tranHistory.getInitMode() != null && tranHistory.getInitMode().equalsIgnoreCase(C0059ao.a(4805))) {
            Account d2 = qa0.v().d(tranHistory.getDebitVpa());
            if (tranHistory.getCreditdebittype() != null && tranHistory.getCreditdebittype().equalsIgnoreCase(a4)) {
                tranHistory.setPayType(a4);
                bVar.B.setImageDrawable(jg0.y(tranHistory.getCreditVpa(), t8.d(this.e, R.color.credit)));
                bVar.z.setText(jg0.j(tranHistory.getCreditVpa()));
                bVar.v.setText(R.string.sent_to);
                tranHistory.setDirection(1);
            } else if (d2 == null) {
                bVar.B.setImageDrawable(jg0.y(tranHistory.getDebitVpa(), t8.d(this.e, R.color.debit)));
                bVar.z.setText(jg0.j(tranHistory.getDebitVpa()));
                bVar.v.setText(R.string.received_form);
                tranHistory.setPayType(a3);
                tranHistory.setDirection(2);
            } else {
                tranHistory.setPayType(a4);
                bVar.B.setImageDrawable(jg0.y(tranHistory.getCreditVpa(), t8.d(this.e, R.color.credit)));
                bVar.z.setText(jg0.j(tranHistory.getCreditVpa()));
                bVar.v.setText(R.string.sent_to);
                tranHistory.setDirection(1);
            }
        } else if (equals2) {
            Account d3 = qa0.v().d(tranHistory.getCreditVpa());
            if (tranHistory.getCreditdebittype() != null && tranHistory.getCreditdebittype().equalsIgnoreCase(a4)) {
                bVar.B.setImageDrawable(jg0.y(tranHistory.getCreditVpa(), t8.d(this.e, R.color.credit)));
                bVar.z.setText(jg0.j(tranHistory.getCreditVpa()));
                bVar.v.setText(R.string.request_received_from);
                tranHistory.setPayType(a4);
                tranHistory.setDirection(4);
            } else if (tranHistory.getCreditdebittype() != null || d3 != null) {
                bVar.B.setImageDrawable(jg0.y(tranHistory.getDebitVpa(), t8.d(this.e, R.color.debit)));
                bVar.z.setText(jg0.j(tranHistory.getDebitVpa()));
                bVar.v.setText(R.string.requested_to);
                tranHistory.setPayType(a3);
                tranHistory.setDirection(3);
            } else {
                bVar.B.setImageDrawable(jg0.y(tranHistory.getCreditVpa(), t8.d(this.e, R.color.credit)));
                bVar.z.setText(jg0.j(tranHistory.getCreditVpa()));
                bVar.v.setText(R.string.request_received_from);
                tranHistory.setPayType(a4);
                tranHistory.setDirection(4);
            }
        }
        bVar.C.setOnClickListener(new a(i, tranHistory));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: y */
    public b n(ViewGroup viewGroup, int i) {
        return new b(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.transaction_list_single_row, viewGroup, false));
    }

    public void z(ng0 ng0Var) {
        this.f = ng0Var;
    }
}
