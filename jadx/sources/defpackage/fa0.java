package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.TransportConstants;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.TranHistory;
import com.pkmmte.view.CircularImageView;
import com.upi.axispay.R;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: fa0  reason: default package */
/* loaded from: classes.dex */
public class fa0 extends RecyclerView.h<c> {
    public Context d;
    public ng0 e;
    public ArrayList<TranHistory> f;

    /* compiled from: AxisPay */
    /* renamed from: fa0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ TranHistory b;

        public a(TranHistory tranHistory) {
            this.b = tranHistory;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ng0 ng0Var = fa0.this.e;
            if (ng0Var != null) {
                ng0Var.s(R.id.query_row, this.b);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: fa0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnLongClickListener {
        public final /* synthetic */ TranHistory b;

        public b(TranHistory tranHistory) {
            this.b = tranHistory;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            fa0.this.e.a(R.id.query_row, this.b, view);
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: fa0$c */
    /* loaded from: classes.dex */
    public class c extends RecyclerView.d0 {
        public TextView A;
        public TextView B;
        public TextView C;
        public TextView D;
        public View E;
        public ImageView F;
        public ImageView G;
        public CircularImageView H;
        public TextView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public c(fa0 fa0Var, View view) {
            super(view);
            this.E = view;
            this.w = (TextView) view.findViewById(R.id.tran_type);
            this.v = (TextView) view.findViewById(R.id.text_receiver_name);
            this.C = (TextView) view.findViewById(R.id.text_receiver_vpa);
            this.B = (TextView) view.findViewById(R.id.query_initiated_date);
            this.D = (TextView) view.findViewById(R.id.query_answered_date);
            this.z = (TextView) view.findViewById(R.id.text_transaction_id);
            this.A = (TextView) view.findViewById(R.id.transaction_date);
            this.x = (TextView) view.findViewById(R.id.text_tran_amount);
            this.y = (TextView) view.findViewById(R.id.text_tran_status);
            this.F = (ImageView) view.findViewById(R.id.query_status_in_progress_image);
            this.G = (ImageView) view.findViewById(R.id.query_status_closed);
            this.H = (CircularImageView) view.findViewById(R.id.tran_icon);
        }
    }

    public fa0(Context context, ArrayList<TranHistory> arrayList) {
        this.f = arrayList;
        this.d = context;
    }

    public void A(ng0 ng0Var) {
        this.e = ng0Var;
    }

    public void B(ArrayList<TranHistory> arrayList) {
        this.f = arrayList;
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<TranHistory> arrayList = this.f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g(int i) {
        return 0;
    }

    public final int[] w(String str) {
        int i;
        int i2 = -65536;
        if (str.equals(C0059ao.a(3357))) {
            i = R.string.success;
            i2 = t8.d(this.d, R.color.transaction_success);
        } else if (str.equals(C0059ao.a(3358))) {
            i = R.string.pending;
            i2 = t8.d(this.d, R.color.transaction_pending);
        } else if (str.equals(C0059ao.a(3359))) {
            i = R.string.declined;
        } else {
            i = str.equals(C0059ao.a(3360)) ? R.string.expired : R.string.failure;
        }
        return new int[]{i, i2};
    }

    public final boolean x(TranHistory tranHistory, c cVar) {
        String creditVpa = tranHistory.getCreditVpa();
        if (creditVpa == null || !creditVpa.equalsIgnoreCase(TransportConstants.BILLPAY_UPIID)) {
            return false;
        }
        String[] split = tranHistory.getRemarks().split(C0059ao.a(3361));
        if (split.length >= 2) {
            if (split[0].equalsIgnoreCase(C0059ao.a(3362))) {
                cVar.w.setText(R.string.dth_recharg_for);
            } else if (split[0].equalsIgnoreCase(C0059ao.a(3363))) {
                if (split[4].equalsIgnoreCase(C0059ao.a(3364))) {
                    cVar.w.setText(R.string.paid_bill_for);
                } else if (split[4].equalsIgnoreCase(C0059ao.a(3365))) {
                    cVar.w.setText(R.string.mob_recharg_for);
                }
            }
            cVar.H.setImageDrawable(jg0.y(split[2], t8.d(this.d, R.color.debit)));
            cVar.C.setText(split[1]);
            cVar.v.setVisibility(8);
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: y */
    public void l(c cVar, int i) {
        TranHistory tranHistory = this.f.get(i);
        cVar.v.setText(tranHistory.getCreditBankName());
        cVar.z.setText(tranHistory.getRefid() == null ? tranHistory.getTranid() : tranHistory.getRefid());
        cVar.A.setText(tranHistory.getExpirydateTime());
        cVar.B.setText(tranHistory.getQuerydate());
        if (!TextUtils.isEmpty(tranHistory.getAmount())) {
            TextView textView = cVar.x;
            textView.setText(C0059ao.a(3366) + String.valueOf(tranHistory.getAmount()));
        }
        if (!TextUtils.isEmpty(tranHistory.getStatus())) {
            int[] w = w(tranHistory.getStatus());
            cVar.y.setText(w[0]);
            cVar.y.setTextColor(w[1]);
        }
        cVar.H.setImageDrawable(jg0.y(tranHistory.getCreditBankName(), t8.d(this.d, R.color.sender)));
        Account d = qa0.v().d(tranHistory.getCreditVpa());
        if (!x(tranHistory, cVar)) {
            if (d != null) {
                String l = qa0.v().l(tranHistory.getDebitVpa());
                tranHistory.getDebitVpa();
                if (TextUtils.isEmpty(l)) {
                    cVar.v.setVisibility(8);
                } else {
                    cVar.v.setVisibility(0);
                    cVar.v.setText(l);
                }
                cVar.C.setText(jg0.j(tranHistory.getDebitVpa()));
            } else {
                String l2 = qa0.v().l(tranHistory.getCreditVpa());
                String creditVpa = tranHistory.getCreditVpa();
                if (TextUtils.isEmpty(l2)) {
                    cVar.v.setVisibility(8);
                    l2 = creditVpa;
                } else {
                    cVar.v.setVisibility(0);
                    cVar.v.setText(l2);
                }
                cVar.H.setImageDrawable(jg0.y(l2, t8.d(this.d, R.color.debit)));
                cVar.C.setText(jg0.j(tranHistory.getCreditVpa()));
            }
        }
        if (tranHistory.getQueryStatus().equals(C0059ao.a(3367))) {
            cVar.D.setText(C0059ao.a(3368));
            cVar.G.setImageResource(R.drawable.grey_dot_query_status);
            cVar.F.setImageResource(R.drawable.pink_dot_query_status);
        } else {
            cVar.D.setText(tranHistory.getExpirydateTime());
            cVar.F.setImageResource(R.drawable.grey_dot_query_status);
            cVar.G.setImageResource(R.drawable.green_tick_query_status);
        }
        cVar.E.setOnClickListener(new a(tranHistory));
        cVar.E.setOnLongClickListener(new b(tranHistory));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: z */
    public c n(ViewGroup viewGroup, int i) {
        return new c(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.query_status_row, viewGroup, false));
    }
}
