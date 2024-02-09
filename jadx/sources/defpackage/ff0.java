package defpackage;

import android.app.AlertDialog;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.TransportConstants;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import defpackage.ua0;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ff0  reason: default package */
/* loaded from: classes.dex */
public class ff0 extends xc0 implements View.OnClickListener, ua0.e {
    public TextView A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public ImageView H;
    public Spannable I;
    public int J;
    public int K;
    public String L;
    public View l;
    public LinearLayout m;
    public TextView n;
    public TextView o;
    public TextView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TransactionData u;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public TextView z;

    /* compiled from: AxisPay */
    /* renamed from: ff0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ AlertDialog b;

        public a(AlertDialog alertDialog) {
            this.b = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.dismiss();
            qa0.v().u0(null);
            ff0.this.b.o(11, null);
        }
    }

    public final void A() {
        BeneVpa beneVpa = this.u.getBeneVpa();
        if (beneVpa == null || !beneVpa.getVpa().equalsIgnoreCase(TransportConstants.BILLPAY_UPIID)) {
            return;
        }
        String[] split = this.u.getRemarks().split(C0059ao.a(6177));
        if (split.length >= 2) {
            if (!split[0].equalsIgnoreCase(C0059ao.a(6178)) && split[0].equalsIgnoreCase(C0059ao.a(6179)) && !split[4].equalsIgnoreCase(C0059ao.a(6180))) {
                split[4].equalsIgnoreCase(C0059ao.a(6181));
            }
            this.m.setVisibility(8);
            this.x.setText(split[2]);
            this.y.setText(split[1]);
        }
    }

    public final void B() {
        if (this.u.getTransactionMode() != TransactionData.MODE_COLLECT_NOTIFICATION && this.u.getTransactionMode() != TransactionData.MODE_RECEIVE) {
            this.l.findViewById(R.id.exp_layout).setVisibility(8);
        } else {
            this.o.setText(this.u.getExpiry());
            this.o.setText(this.u.getExpiry());
        }
        TextView textView = this.p;
        textView.setText(C0059ao.a(6182) + this.u.getAmount().toString());
        this.t.setText(this.u.getRemarks());
        String refid = this.u.getRefid();
        String a2 = C0059ao.a(6183);
        String a3 = C0059ao.a(6184);
        if (refid != null && !this.u.getRefid().equalsIgnoreCase(a2)) {
            this.q.setText(this.u.getRefid());
        } else {
            this.q.setText(a3);
        }
        if (this.u.getDescription() != null && !this.u.getDescription().equalsIgnoreCase(a2) && !TextUtils.isEmpty(this.u.getDescription())) {
            this.z.setText(this.u.getDescription());
        } else {
            this.z.setText(a3);
        }
        if (this.u.getTransactionStatus() == 10) {
            this.n.setText(R.string.transaction_successful);
            this.H.setImageResource(2131231358);
            this.n.setTextColor(t8.d(k(), R.color.transaction_success));
        } else if (this.u.getTransactionStatus() == 1) {
            this.n.setText(R.string.transaction_failed);
            this.H.setImageResource(R.drawable.tra_failed);
            this.n.setTextColor(t8.d(k(), R.color.red));
        } else if (this.u.getTransactionStatus() == 2) {
            this.n.setText(R.string.pending);
            this.H.setImageResource(2131231385);
            this.n.setTextColor(t8.d(k(), R.color.trans_yellow));
        } else if (this.u.getTransactionStatus() == 3) {
            this.n.setText(R.string.pending);
            this.H.setImageResource(2131231385);
            this.n.setTextColor(t8.d(k(), R.color.trans_yellow));
        } else if (this.u.getTransactionStatus() == 4) {
            this.n.setText(R.string.expired);
            this.H.setImageResource(2131231384);
            this.n.setTextColor(t8.d(k(), R.color.block));
        } else if (this.u.getTransactionStatus() == 5) {
            this.n.setText(R.string.transaction_reject);
            this.H.setImageResource(R.drawable.tra_failed);
            this.n.setTextColor(t8.d(k(), R.color.block));
        } else if (this.u.getTransactionStatus() == 6) {
            this.n.setText(R.string.blocked);
            this.H.setImageResource(2131231383);
            this.n.setTextColor(t8.d(k(), R.color.block));
        } else if (this.u.getTransactionStatus() == 7) {
            this.n.setText(R.string.unknown);
            this.H.setImageResource(R.drawable.block);
            this.n.setTextColor(t8.d(k(), R.color.block));
        }
        String queryCloserComment = this.u.getQueryCloserComment();
        String a4 = C0059ao.a(6185);
        if (queryCloserComment != null && !this.u.getQueryCloserComment().equalsIgnoreCase(a4)) {
            this.F.setText(this.u.getQueryCloserComment());
        } else {
            this.F.setText(R.string.in_progress);
        }
        boolean isEmpty = TextUtils.isEmpty(this.u.getExpirydateTime());
        String a5 = C0059ao.a(6186);
        if (isEmpty) {
            this.E.setText(a5);
        } else if (this.u.getExpirydateTime().equalsIgnoreCase(a4)) {
            this.E.setText(a5);
        } else {
            this.E.setText(this.u.getExpirydateTime());
        }
        this.G.setText(this.u.getQueryComment());
        this.A.setText(this.u.getQueryid());
        this.C.setText(this.u.getQueryStatus());
        this.D.setText(this.u.getQuerydate());
        Account account = this.u.getAccount();
        BeneVpa beneVpa = this.u.getBeneVpa();
        this.s.setText(jg0.s(account.getAccRefNumber()));
        if (this.u.getTransactionMode() == TransactionData.MODE_SEND) {
            this.w.setText(jg0.j(account.getVpa()));
            if (this.u.getTransactionStatus() == 1) {
                z(getString(R.string.amount_string_failed, this.L));
            } else if (this.u.getTransactionStatus() == 3) {
                z(getString(R.string.amount_string_pending, this.L));
            } else if (this.u.getTransactionStatus() == 7) {
                z(getString(R.string.amount_string_unknown, this.L));
            } else if (this.u.getTransactionStatus() == 4) {
                z(getString(R.string.amount_string_expired, this.L));
            } else if (this.u.getTransactionStatus() == 10) {
                z(getString(R.string.amount_string_success, this.L));
            } else if (this.u.getTransactionStatus() == 5) {
                z(getString(R.string.amount_string_declined_request_of, this.L));
            } else if (this.u.getTransactionStatus() == 6) {
                z(getString(R.string.amount_string_blocked_request_of, this.L));
            }
            this.v.setText(R.string.you);
            this.x.setText(qa0.v().l(beneVpa.getVpa()));
            this.y.setText(jg0.j(beneVpa.getVpa()));
        } else {
            this.w.setText(jg0.j(beneVpa.getVpa()));
            this.v.setText(R.string.you);
            this.x.setText(jg0.j(qa0.v().l(account.getVpa())));
            this.y.setText(jg0.j(account.getVpa()));
            if (this.u.getTransactionStatus() == 1) {
                z(getString(R.string.amount_string_request_is_failed, this.L));
            } else if (this.u.getTransactionStatus() == 3) {
                z(getString(R.string.amount_string_request_pending_with, this.L));
            } else if (this.u.getTransactionStatus() == 4) {
                z(getString(R.string.amount_string_request_has_expired, this.L));
            } else if (this.u.getTransactionStatus() == 10) {
                z(getString(R.string.amount_string_request_is_successfully_done_to, this.L));
            } else if (this.u.getTransactionStatus() == 5) {
                z(getString(R.string.amount_string_request_has_been_declined_by, this.L));
            } else if (this.u.getTransactionStatus() == 6) {
                z(getString(R.string.amount_string_request_has_been_blocked_by, this.L));
            }
        }
        this.r.setText(jg0.A(this.u.getBeneVpa().getVpa()));
    }

    public void C() {
        AlertDialog.Builder builder = new AlertDialog.Builder(k());
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(k()).inflate(R.layout.dialog_received_query, (ViewGroup) null);
        builder.setView(linearLayout);
        AlertDialog create = builder.create();
        ((TextView) linearLayout.findViewById(R.id.text_docket_id)).setText(this.u.getRefid());
        ((Button) linearLayout.findViewById(R.id.button_home)).setOnClickListener(new a(create));
        create.setCancelable(false);
        create.show();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.l = layoutInflater.inflate(R.layout.fragment_query_status, viewGroup, false);
        y();
        B();
        A();
        return this.l;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            oliveRequest.getRequestType();
            eg0.B();
            eg0.A(k(), result.getResult());
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(70, getString(R.string.query_status));
        super.onResume();
        ua0.d().u(this);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (oliveRequest.getRequestType() != 33) {
            if (this.g == oliveRequest.getInitiator()) {
                eg0.B();
                return;
            }
            return;
        }
        eg0.B();
        C();
    }

    public void x(TransactionData transactionData) {
        this.u = transactionData;
    }

    public void y() {
        LinearLayout linearLayout = (LinearLayout) this.l.findViewById(R.id.layout_query);
        this.n = (TextView) this.l.findViewById(R.id.text_status);
        this.o = (TextView) this.l.findViewById(R.id.text_expiry_date);
        this.p = (TextView) this.l.findViewById(R.id.text_amount);
        this.q = (TextView) this.l.findViewById(R.id.text_transaction_id);
        this.r = (TextView) this.l.findViewById(R.id.text_payment_mode);
        this.s = (TextView) this.l.findViewById(R.id.text_sender_vpa_details);
        this.t = (TextView) this.l.findViewById(R.id.text_remark);
        this.v = (TextView) this.l.findViewById(R.id.text_sender_title);
        this.w = (TextView) this.l.findViewById(R.id.text_sender_vpa);
        this.x = (TextView) this.l.findViewById(R.id.text_receiver_title);
        this.y = (TextView) this.l.findViewById(R.id.text_receiver_vpa);
        this.m = (LinearLayout) this.l.findViewById(R.id.remarks_layout);
        this.A = (TextView) this.l.findViewById(R.id.text_query_id);
        this.C = (TextView) this.l.findViewById(R.id.text_query_status);
        this.D = (TextView) this.l.findViewById(R.id.text_query_date);
        this.E = (TextView) this.l.findViewById(R.id.text_expiry_date);
        this.F = (TextView) this.l.findViewById(R.id.text_comment);
        this.G = (TextView) this.l.findViewById(R.id.text_raised_comment);
        this.z = (TextView) this.l.findViewById(R.id.text_description);
        this.H = (ImageView) this.l.findViewById(R.id.image_success);
        this.p = (TextView) this.l.findViewById(R.id.text_amount);
        this.B = (TextView) this.l.findViewById(R.id.text_amount_status);
        this.L = jg0.a(this.u.getAmount());
    }

    public final void z(String str) {
        int indexOf = str.indexOf(this.L);
        this.J = indexOf;
        this.K = indexOf + this.L.length();
        SpannableString spannableString = new SpannableString(str);
        this.I = spannableString;
        spannableString.setSpan(new ForegroundColorSpan(t8.d(k(), R.color.colorPrimary)), this.J, this.K, 33);
        this.I.setSpan(new StyleSpan(1), this.J, this.K, 33);
        this.I.setSpan(new RelativeSizeSpan(1.2f), this.J, this.K, 33);
        this.B.setText(this.I);
    }
}
