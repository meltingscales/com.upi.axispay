package defpackage;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.kofigyan.stateprogressbar.StateProgressBar;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.TransportConstants;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.ComplaintResponse;
import com.olive.upi.transport.model.TranHistory;
import com.olive.upi.transport.model.TransactionData;
import com.olive.upi.transport.model.Udir;
import com.olive.upi.transport.model.UdirReasons;
import com.upi.axispay.R;
import defpackage.ua0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: yf0  reason: default package */
/* loaded from: classes.dex */
public class yf0 extends xc0 implements View.OnClickListener, ua0.e {
    public TextView A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TransactionData F;
    public EditText G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public TextView M;
    public TextView N;
    public TextView O;
    public TextView P;
    public Spannable Q;
    public RelativeLayout R;
    public Udir S;
    public StateProgressBar T;
    public int U;
    public int V;
    public RelativeLayout W;
    public RelativeLayout X;
    public RelativeLayout Y;
    public RelativeLayout Z;
    public RelativeLayout a0;
    public RelativeLayout b0;
    public TextView c0;
    public TextView d0;
    public TextView e0;
    public TextView f0;
    public TextView g0;
    public TextView h0;
    public TextView i0;
    public TextView j0;
    public TextView k0;
    public ImageView l;
    public TextView l0;
    public LinearLayout m;
    public TextView m0;
    public LinearLayout n;
    public TextView n0;
    public LinearLayout o;
    public TextView o0;
    public View p;
    public RelativeLayout p0;
    public Button q;
    public RelativeLayout q0;
    public Button r;
    public String r0;
    public TextView s;
    public int s0;
    public TextView t;
    public Dialog t0;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public TextView z;

    /* compiled from: AxisPay */
    /* renamed from: yf0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            qa0.v().u0(null);
            qa0.v().U(null);
            yf0.this.b.o(11, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yf0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            yf0.this.t0.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yf0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ RadioGroup b;
        public final /* synthetic */ List c;

        public c(RadioGroup radioGroup, List list) {
            this.b = radioGroup;
            this.c = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UdirReasons udirReasons;
            int checkedRadioButtonId = this.b.getCheckedRadioButtonId();
            RadioButton radioButton = (RadioButton) yf0.this.t0.findViewById(checkedRadioButtonId);
            UdirReasons udirReasons2 = new UdirReasons();
            if (this.c.size() != 0 && checkedRadioButtonId != -1) {
                switch (checkedRadioButtonId) {
                    case R.id.account /* 2131361856 */:
                        udirReasons = (UdirReasons) this.c.get(2);
                        udirReasons2 = udirReasons;
                        udirReasons2.setTransactionID(yf0.this.F.getTransactionId());
                        break;
                    case R.id.credit /* 2131362125 */:
                        udirReasons = (UdirReasons) this.c.get(1);
                        udirReasons2 = udirReasons;
                        udirReasons2.setTransactionID(yf0.this.F.getTransactionId());
                        break;
                    case R.id.duplicate /* 2131362193 */:
                        udirReasons = (UdirReasons) this.c.get(3);
                        udirReasons2 = udirReasons;
                        udirReasons2.setTransactionID(yf0.this.F.getTransactionId());
                        break;
                    case R.id.goods /* 2131362311 */:
                        udirReasons = (UdirReasons) this.c.get(0);
                        udirReasons2 = udirReasons;
                        udirReasons2.setTransactionID(yf0.this.F.getTransactionId());
                        break;
                    default:
                        udirReasons2.setTransactionID(yf0.this.F.getTransactionId());
                        break;
                }
            }
            yf0.this.t0.dismiss();
            eg0.i(yf0.this.getActivity());
            ua0.d().q(new OliveRequest(24, 96, udirReasons2));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yf0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            yf0.this.t0.dismiss();
        }
    }

    public final void A() {
        if (this.F.getTipAmount() != null) {
            this.r0 = jg0.b(String.format(C0059ao.a(871), Double.valueOf(this.F.getTipAmount().doubleValue() + this.F.getAmount().doubleValue())));
        } else {
            this.r0 = jg0.a(this.F.getAmount());
        }
        if (this.F.getInvoiceName() != null) {
            this.W.setVisibility(0);
            this.j0.setText(this.F.getInvoiceName());
            this.k0.setText(this.F.getInvoiceNo());
            this.c0.setText(this.F.getInvoiceDate().substring(0, 10));
            this.d0.setText(this.r0);
            String gstBrkUp = this.F.getGstBrkUp();
            HashMap hashMap = new HashMap();
            if (gstBrkUp != null) {
                String a2 = C0059ao.a(872);
                boolean contains = gstBrkUp.contains(a2);
                String a3 = C0059ao.a(873);
                if (!contains) {
                    String[] split = gstBrkUp.split(a3);
                    hashMap.put(split[0], split[1]);
                    String a4 = C0059ao.a(874);
                    if (hashMap.containsKey(a4)) {
                        this.Z.setVisibility(0);
                        this.g0.setText((CharSequence) hashMap.get(a4));
                        this.F.setIGST((String) hashMap.get(a4));
                        return;
                    }
                    String a5 = C0059ao.a(875);
                    if (hashMap.containsKey(a5)) {
                        this.b0.setVisibility(0);
                        this.i0.setText((CharSequence) hashMap.get(a5));
                        this.F.setCESS((String) hashMap.get(a5));
                        return;
                    }
                    this.a0.setVisibility(0);
                    TextView textView = this.h0;
                    String a6 = C0059ao.a(876);
                    textView.setText((CharSequence) hashMap.get(a6));
                    this.F.setGST((String) hashMap.get(a6));
                    return;
                }
                this.X.setVisibility(0);
                this.Y.setVisibility(0);
                int indexOf = gstBrkUp.indexOf(a2);
                String substring = gstBrkUp.substring(0, indexOf);
                String substring2 = gstBrkUp.substring(indexOf + 1, gstBrkUp.length() - 1);
                int indexOf2 = substring.indexOf(a3);
                int indexOf3 = substring2.indexOf(a3);
                String substring3 = substring.substring(indexOf2 + 1, substring.length());
                this.f0.setText(substring3);
                this.F.setCGST(substring3);
                String substring4 = substring2.substring(indexOf3 + 1, substring2.length());
                this.e0.setText(substring4);
                this.F.setSGST(substring4);
                return;
            }
            return;
        }
        this.W.setVisibility(8);
    }

    public void B() {
        this.m = (LinearLayout) this.p.findViewById(R.id.layout_query);
        this.n = (LinearLayout) this.p.findViewById(R.id.remarks_layout);
        LinearLayout linearLayout = (LinearLayout) this.p.findViewById(R.id.status_layout);
        this.v = (TextView) this.p.findViewById(R.id.text_sender_vpa_details);
        this.D = (TextView) this.p.findViewById(R.id.text_description);
        this.T = (StateProgressBar) this.p.findViewById(R.id.stepper_indicator);
        this.D.setVisibility(8);
        this.m0 = (TextView) this.p.findViewById(R.id.check_status);
        this.s = (TextView) this.p.findViewById(R.id.text_status);
        this.R = (RelativeLayout) this.p.findViewById(R.id.status_layouts);
        this.p0 = (RelativeLayout) this.p.findViewById(R.id.check_status_layout);
        this.q0 = (RelativeLayout) this.p.findViewById(R.id.raise_complaint_layout);
        this.l0 = (TextView) this.p.findViewById(R.id.text_status_message);
        this.o0 = (TextView) this.p.findViewById(R.id.crn);
        this.n0 = (TextView) this.p.findViewById(R.id.raise_complaint);
        this.l = (ImageView) this.p.findViewById(R.id.image_success);
        this.t = (TextView) this.p.findViewById(R.id.text_date);
        this.u = (TextView) this.p.findViewById(R.id.text_exp_value);
        this.z = (TextView) this.p.findViewById(R.id.text_transaction_id);
        this.A = (TextView) this.p.findViewById(R.id.text_payment_mode);
        this.B = (TextView) this.p.findViewById(R.id.text_sender_vpa_details);
        this.C = (TextView) this.p.findViewById(R.id.text_remark);
        this.G = (EditText) this.p.findViewById(R.id.edit_description);
        this.r = (Button) this.p.findViewById(R.id.button_send);
        this.q = (Button) this.p.findViewById(R.id.button_query);
        this.H = (TextView) this.p.findViewById(R.id.text_sender_title);
        this.J = (TextView) this.p.findViewById(R.id.text_sender_vpa);
        this.K = (TextView) this.p.findViewById(R.id.text_receiver_title);
        this.L = (TextView) this.p.findViewById(R.id.text_receiver_vpa);
        this.y = (TextView) this.p.findViewById(R.id.text_requested);
        this.x = (TextView) this.p.findViewById(R.id.text_amount);
        this.E = (TextView) this.p.findViewById(R.id.text_deemed);
        this.M = (TextView) this.p.findViewById(R.id.text_query);
        this.K.setTypeface(null, 1);
        this.L.setTypeface(null, 1);
        this.x.setTypeface(null, 1);
        this.w = (TextView) this.p.findViewById(R.id.debit_id);
        LinearLayout linearLayout2 = (LinearLayout) this.p.findViewById(R.id.exp_layout);
        this.o = (LinearLayout) this.p.findViewById(R.id.text_exp_layout);
        this.N = (TextView) this.p.findViewById(R.id.text_exp_date_name);
        this.O = (TextView) this.p.findViewById(R.id.text_exp_value);
        this.W = (RelativeLayout) this.p.findViewById(R.id.qr_expire_layout);
        this.j0 = (TextView) this.p.findViewById(R.id.text_invoice_name);
        this.k0 = (TextView) this.p.findViewById(R.id.text_invoice_no);
        TextView textView = (TextView) this.p.findViewById(R.id.text_QR_expiry_date);
        this.c0 = (TextView) this.p.findViewById(R.id.text_invoice_date);
        this.d0 = (TextView) this.p.findViewById(R.id.text_components);
        this.e0 = (TextView) this.p.findViewById(R.id.text_SGST);
        this.f0 = (TextView) this.p.findViewById(R.id.text_CGST);
        this.g0 = (TextView) this.p.findViewById(R.id.text_IGST);
        this.h0 = (TextView) this.p.findViewById(R.id.text_GST);
        this.i0 = (TextView) this.p.findViewById(R.id.text_CESS);
        this.X = (RelativeLayout) this.p.findViewById(R.id.SGST_Layout);
        this.Y = (RelativeLayout) this.p.findViewById(R.id.CGST_Layout);
        this.b0 = (RelativeLayout) this.p.findViewById(R.id.CESS_Layout);
        this.a0 = (RelativeLayout) this.p.findViewById(R.id.GST_layout);
        this.Z = (RelativeLayout) this.p.findViewById(R.id.IGST_layout);
        this.P = (TextView) this.p.findViewById(R.id.text_remark_head);
        this.I = (TextView) this.p.findViewById(R.id.text_amount_status);
        LinearLayout linearLayout3 = (LinearLayout) this.p.findViewById(R.id.umn_layout);
        TextView textView2 = (TextView) this.p.findViewById(R.id.umn_id);
    }

    public void C() {
        this.q.setOnClickListener(this);
        this.r.setOnClickListener(this);
        this.M.setOnClickListener(this);
        this.q0.setOnClickListener(this);
        this.p0.setOnClickListener(this);
    }

    public final void D(String str) {
        int indexOf = str.indexOf(this.r0);
        this.U = indexOf;
        this.V = indexOf + this.r0.length();
        SpannableString spannableString = new SpannableString(str);
        this.Q = spannableString;
        spannableString.setSpan(new ForegroundColorSpan(t8.d(getContext(), R.color.colorPrimary)), this.U, this.V, 33);
        this.Q.setSpan(new StyleSpan(1), this.U, this.V, 33);
        this.Q.setSpan(new RelativeSizeSpan(1.2f), this.U, this.V, 33);
        this.I.setText(this.Q);
    }

    public final void E() {
        int i;
        int i2 = this.s0;
        if (i2 == 1 || i2 == 4 || i2 == 5) {
            this.R.setVisibility(8);
        } else if (i2 == 10) {
            String mcc = this.F.getMcc();
            if (!TextUtils.isEmpty(mcc) && !mcc.equals(C0059ao.a(877))) {
                y();
            } else {
                this.R.setVisibility(8);
            }
        } else {
            if ((this.F.getDirection() == 3) && ((i = this.s0) == 3 || i == 2)) {
                this.R.setVisibility(8);
            } else {
                y();
            }
        }
    }

    public final void F() {
        BeneVpa beneVpa = this.F.getBeneVpa();
        if (beneVpa == null || !beneVpa.getVpa().equalsIgnoreCase(TransportConstants.BILLPAY_UPIID)) {
            return;
        }
        this.w.setText(R.string.your_linked_account_details);
        Account account = this.F.getAccount();
        TextView textView = this.v;
        textView.setText(this.F.getDebitBankName() + C0059ao.a(878) + jg0.s(account.getAccRefNumber()));
        String[] split = this.F.getRemarks().split(C0059ao.a(879));
        if (split.length >= 2) {
            int transactionStatus = this.F.getTransactionStatus();
            this.x.setVisibility(8);
            this.y.setVisibility(8);
            if (split[0].equalsIgnoreCase(C0059ao.a(880))) {
                this.K.setText(split[1]);
                this.L.setText(split[2]);
                if (transactionStatus == 10) {
                    D(getString(R.string.dth_recharge_success, this.r0));
                } else {
                    D(getString(R.string.dth_recharge_fail, this.r0));
                }
            } else if (split[0].equalsIgnoreCase(C0059ao.a(881)) && !split[4].equalsIgnoreCase(C0059ao.a(882)) && split[4].equalsIgnoreCase(C0059ao.a(883))) {
                this.K.setText(split[1]);
                this.L.setText(split[2]);
                if (transactionStatus == 10) {
                    D(getString(R.string.mob_recharge_success, this.r0));
                } else {
                    D(getString(R.string.mob_recharge_fail, this.r0));
                }
            }
            this.n.setVisibility(8);
        }
    }

    public final void G() {
        if (this.F == null) {
            r();
        }
        if (this.F.getUdir() != null) {
            Udir udir = this.F.getUdir();
            this.S = udir;
            String str = udir.txnInitiated;
            String a2 = C0059ao.a(884);
            if (str.equals(a2) && this.S.amtDebited.equals(a2) && this.S.amtCredit.equals(a2) && this.S.txnComplete.equals(a2)) {
                this.T.setCurrentStateNumber(StateProgressBar.StateNumber.FOUR);
            } else {
                boolean equals = this.S.txnInitiated.equals(a2);
                String a3 = C0059ao.a(885);
                if (equals && this.S.amtDebited.equals(a3) && this.S.amtCredit.equals(a3) && this.S.txnComplete.equals(a3)) {
                    this.T.setCurrentStateNumber(StateProgressBar.StateNumber.ONE);
                } else if (this.S.txnInitiated.equals(a2) && this.S.amtDebited.equals(a2) && this.S.amtCredit.equals(a3) && this.S.txnComplete.equals(a3)) {
                    this.T.setCurrentStateNumber(StateProgressBar.StateNumber.TWO);
                } else if (this.S.txnInitiated.equals(a2) && this.S.amtDebited.equals(a2) && this.S.amtCredit.equals(a2) && this.S.txnComplete.equals(a3)) {
                    this.T.setCurrentStateNumber(StateProgressBar.StateNumber.THREE);
                }
            }
        }
        this.o.setVisibility(8);
        this.t.setText(this.F.getTransactionDate());
        this.H.setVisibility(8);
        int transactionMode = this.F.getTransactionMode();
        int i = TransactionData.MODE_COLLECT_NOTIFICATION;
        String a4 = C0059ao.a(886);
        if (transactionMode != i && this.F.getTransactionMode() != TransactionData.MODE_RECEIVE) {
            this.p.findViewById(R.id.exp_layout).setVisibility(0);
        } else if (this.F.getExpiry() != null) {
            this.u.setText(this.F.getExpiry());
        } else {
            this.u.setText(a4);
        }
        this.C.setText(this.F.getRemarks());
        if (this.F.getRefid() != null && !this.F.getRefid().equalsIgnoreCase(a4)) {
            this.z.setText(this.F.getRefid());
        } else {
            this.z.setText(R.string.n_a);
        }
        int transactionStatus = this.F.getTransactionStatus();
        this.E.setVisibility(8);
        if (transactionStatus == 10) {
            MediaPlayer.create(getActivity(), (int) R.raw.pay_success_mogo1_sec).start();
            this.s.setText(R.string.transaction_successful);
            this.l.setImageResource(2131231358);
            this.s.setTextColor(t8.d(k(), R.color.transaction_success));
        } else if (transactionStatus == 1) {
            this.s.setText(R.string.transaction_failed);
            this.l.setImageResource(R.drawable.tra_failed);
            this.D.setVisibility(0);
            this.D.setText(jg0.g(this.F.getDescription()));
            this.s.setTextColor(t8.d(k(), R.color.block));
        } else if (transactionStatus == 2) {
            this.s.setText(R.string.transaction_accepted);
            this.s.setTypeface(null, 1);
            this.l.setImageResource(2131231385);
            this.s.setTextColor(t8.d(k(), R.color.trans_yellow));
        } else if (transactionStatus == 3) {
            this.s.setText(R.string.pending);
            this.l.setImageResource(2131231385);
            this.s.setTextColor(t8.d(k(), R.color.trans_yellow));
        } else if (transactionStatus == 7) {
            this.s.setText(R.string.transaction_pending_status);
            this.E.setVisibility(8);
            this.l.setImageResource(2131231385);
            this.s.setTextColor(t8.d(k(), R.color.block));
        } else if (transactionStatus == 4) {
            this.s.setText(R.string.expired);
            this.l.setImageResource(2131231384);
            this.s.setTextColor(t8.d(k(), R.color.block));
        } else if (transactionStatus == 5) {
            this.s.setText(R.string.transaction_reject);
            this.l.setImageResource(R.drawable.tra_failed);
            this.s.setTextColor(t8.d(k(), R.color.block));
        } else if (transactionStatus == 6) {
            this.s.setText(R.string.blocked);
            this.l.setImageResource(2131231383);
            this.s.setTextColor(t8.d(k(), R.color.block));
        }
        int direction = this.F.getDirection();
        Account account = this.F.getAccount();
        BeneVpa beneVpa = this.F.getBeneVpa();
        boolean isEmpty = TextUtils.isEmpty(this.F.getDebitBankName());
        String a5 = C0059ao.a(887);
        if (isEmpty) {
            this.B.setText(jg0.s(account.getAccRefNumber()));
        } else {
            TextView textView = this.B;
            textView.setText(this.F.getDebitBankName() + a5 + jg0.s(this.F.getDestAccount()));
        }
        this.w.setText(R.string.your_linked_account_details);
        if (direction != 1) {
            String a6 = C0059ao.a(888);
            if (direction == 2) {
                this.J.setText(jg0.j(beneVpa.getVpa()));
                TextView textView2 = this.v;
                textView2.setText(this.F.getDebitBankName() + a5 + jg0.s(this.F.getDestAccount()));
                this.K.setText(jg0.g(TextUtils.isEmpty(this.F.getRemitterName()) ? qa0.v().l(account.getVpa()) : this.F.getRemitterName()));
                this.L.setText(jg0.j(account.getVpa()));
                if (transactionStatus == 1) {
                    D(getString(R.string.amount_string_failed_txn, this.r0));
                } else if (transactionStatus == 3 || transactionStatus == 7) {
                    D(getString(R.string.amount_string_request_pending_with, this.r0));
                    this.o.setVisibility(0);
                    this.n.setVisibility(0);
                    this.N.setText(R.string.remark);
                    if (TextUtils.isEmpty(this.F.getRemarks())) {
                        this.O.setText(a6);
                    } else {
                        this.O.setText(this.F.getRemarks());
                    }
                    this.P.setText(R.string.request_exp_date);
                    this.C.setText(this.F.getExpiry());
                } else if (transactionStatus == 4) {
                    D(getString(R.string.amount_string_request_has_expired, this.r0));
                    this.N.setText(R.string.remark);
                    this.o.setVisibility(0);
                    if (TextUtils.isEmpty(this.F.getRemarks())) {
                        this.O.setText(a6);
                    } else {
                        this.O.setText(this.F.getRemarks());
                    }
                    this.n.setVisibility(0);
                    this.P.setText(R.string.request_exp_date);
                    this.C.setText(this.F.getExpiry());
                } else if (transactionStatus == 10) {
                    D(getString(R.string.amount_string_success_request_of, this.r0));
                } else if (transactionStatus == 5) {
                    D(getString(R.string.amount_string_request_has_been_declined_by, this.r0));
                } else if (transactionStatus == 6) {
                    D(getString(R.string.amount_string_request_has_been_blocked_by, this.r0));
                }
                this.M.setVisibility(8);
            } else if (direction == 3) {
                this.J.setText(jg0.j(account.getVpa()));
                if (transactionStatus == 3) {
                    D(getString(R.string.amount_string_request_pending_with, this.r0));
                    this.o.setVisibility(0);
                    this.n.setVisibility(0);
                    this.N.setText(R.string.remark);
                    if (TextUtils.isEmpty(this.F.getRemarks())) {
                        this.O.setText(a6);
                    } else {
                        this.O.setText(this.F.getRemarks());
                    }
                    this.P.setText(R.string.request_exp_date);
                    this.C.setText(this.F.getExpiry());
                } else if (transactionStatus == 2) {
                    D(getString(R.string.amount_string_request_pending_with, this.r0));
                } else if (transactionStatus == 6) {
                    D(getString(R.string.amount_string_hasbeen_blocked_by, this.r0));
                } else if (transactionStatus == 5) {
                    D(getString(R.string.amount_string_request_has_been_declined_by, this.r0));
                } else if (transactionStatus == 4) {
                    D(getString(R.string.amount_string_request_has_expired, this.r0));
                    this.o.setVisibility(0);
                    this.n.setVisibility(0);
                    this.N.setText(R.string.remark);
                    if (TextUtils.isEmpty(this.F.getRemarks())) {
                        this.O.setText(a6);
                    } else {
                        this.O.setText(this.F.getRemarks());
                    }
                    this.P.setText(R.string.request_exp_date);
                    this.C.setText(this.F.getExpiry());
                } else if (transactionStatus == 10) {
                    D(getString(R.string.amount_string_success_request_of, this.r0));
                } else if (transactionStatus == 1) {
                    D(getString(R.string.amount_string_request_is_failed, this.r0));
                }
                this.K.setText(jg0.g(TextUtils.isEmpty(this.F.getRemitterName()) ? qa0.v().l(beneVpa.getVpa()) : this.F.getRemitterName()));
                this.L.setText(jg0.j(beneVpa.getVpa()));
                this.M.setVisibility(8);
            } else if (direction == 4) {
                this.M.setVisibility(8);
                Account d2 = qa0.v().d(account.getVpa());
                if (d2 != null) {
                    TextView textView3 = this.B;
                    textView3.setText(this.F.getDebitBankName() + a5 + jg0.s(d2.getMaskedAccnumber()));
                }
                this.J.setText(jg0.j(account.getVpa()));
                if (transactionStatus == 3) {
                    D(getString(R.string.amount_string_pending_request_from, this.r0));
                } else if (transactionStatus == 7) {
                    D(getString(R.string.amount_string_pending_request_from, this.r0));
                } else if (transactionStatus == 6) {
                    D(getString(R.string.amount_string_blocked_request, this.r0));
                } else if (transactionStatus == 5) {
                    D(getString(R.string.amount_string_declined_request, this.r0));
                } else if (transactionStatus == 4) {
                    D(getString(R.string.amount_received_expired, this.r0));
                } else if (transactionStatus == 1) {
                    D(getString(R.string.amount_received_failed, this.r0));
                } else if (transactionStatus == 10) {
                    D(getString(R.string.amount_string_success, this.r0));
                }
                if (TextUtils.isEmpty(this.F.getBeneficiaryName())) {
                    qa0.v().l(beneVpa.getVpa());
                } else {
                    this.F.getBeneficiaryName();
                }
                this.K.setText(jg0.g(jg0.j(this.F.getBeneficiaryName())));
                this.L.setText(jg0.j(beneVpa.getVpa()));
            }
        } else {
            this.M.setVisibility(8);
            this.J.setText(jg0.j(account.getVpa()));
            if (transactionStatus == 1) {
                D(getString(R.string.amount_string_failed, this.r0));
            } else if (transactionStatus == 3) {
                D(getString(R.string.amount_string_pending, this.r0));
            } else if (transactionStatus == 7) {
                D(getString(R.string.amount_string_pending, this.r0));
            } else if (transactionStatus == 4) {
                D(getString(R.string.amount_string_expired, this.r0));
            } else if (transactionStatus == 10) {
                D(getString(R.string.amount_string_success, this.r0));
            } else if (transactionStatus == 5) {
                D(getString(R.string.amount_string_declined_request, this.r0));
            } else if (transactionStatus == 6) {
                D(getString(R.string.amount_string_blocked_request, this.r0));
            }
            String debitBankName = this.F.getDebitBankName();
            if (TextUtils.isEmpty(debitBankName)) {
                this.v.setText(jg0.s(account.getAccRefNumber()));
            } else {
                TextView textView4 = this.v;
                textView4.setText(debitBankName + a5 + jg0.s(account.getAccRefNumber()));
            }
            this.K.setText(jg0.g(TextUtils.isEmpty(this.F.getBeneficiaryName()) ? this.F.getBeneVpa().getName() : this.F.getBeneficiaryName()));
            this.L.setText(jg0.j(beneVpa.getVpa()));
        }
        this.A.setText(jg0.A(this.F.getBeneVpa().getVpa()));
    }

    public void H(String str) {
        eg0.o(k(), getString(R.string.thank_you), String.format(getString(R.string.your_query_has_been_raised_successfully), str), getString(R.string.home), new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NonConstantResourceId"})
    public void I() {
        Dialog dialog = new Dialog(getActivity(), R.style.Theme_Dialog);
        this.t0 = dialog;
        dialog.getWindow().requestFeature(1);
        this.t0.setContentView(R.layout.dialog_raise_complain);
        this.t0.getWindow().setLayout(-1, -2);
        ImageView imageView = (ImageView) this.t0.findViewById(R.id.dialog_close);
        Button button = (Button) this.t0.findViewById(R.id.button_no);
        Button button2 = (Button) this.t0.findViewById(R.id.button_yes);
        RadioGroup radioGroup = (RadioGroup) this.t0.findViewById(R.id.radioGroup_dialog);
        RadioButton radioButton = (RadioButton) this.t0.findViewById(R.id.goods);
        RadioButton radioButton2 = (RadioButton) this.t0.findViewById(R.id.credit);
        RadioButton radioButton3 = (RadioButton) this.t0.findViewById(R.id.account);
        RadioButton radioButton4 = (RadioButton) this.t0.findViewById(R.id.duplicate);
        LinearLayout linearLayout = (LinearLayout) this.t0.findViewById(R.id.radio_questions);
        List arrayList = new ArrayList();
        this.F.getTransactionDate().split(C0059ao.a(889));
        ((TextView) this.t0.findViewById(R.id.text_transID)).setText(this.F.getRefid());
        ((TextView) this.t0.findViewById(R.id.text_transDate)).setText(this.F.getTransactionDate());
        ((TextView) this.t0.findViewById(R.id.text_transTime)).setText(this.F.getTransactionDate());
        ((TextView) this.t0.findViewById(R.id.text_remarks)).setText(this.F.getRemarks());
        List list = this.S.reasons;
        List list2 = list != null ? list : arrayList;
        String mcc = this.F.getMcc();
        if (!TextUtils.isEmpty(mcc) && !mcc.equals(C0059ao.a(890)) && this.s0 == 10) {
            linearLayout.setVisibility(0);
            if (list2 != null && list2.size() >= 4) {
                radioButton.setText(((UdirReasons) list2.get(0)).reason);
                radioButton2.setText(((UdirReasons) list2.get(1)).reason);
                radioButton3.setText(((UdirReasons) list2.get(2)).reason);
                radioButton4.setText(((UdirReasons) list2.get(3)).reason);
            }
        } else {
            linearLayout.setVisibility(8);
        }
        this.t0.setCancelable(true);
        this.t0.show();
        button.setOnClickListener(new b());
        button2.setOnClickListener(new c(radioGroup, list2));
        imageView.setOnClickListener(new d());
    }

    public final void J() {
        Udir udir = this.S;
        if (udir != null && udir.isChkTxnInitiated) {
            this.p0.setBackgroundResource(R.drawable.border_background_color);
            this.m0.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            return;
        }
        this.p0.setBackgroundResource(R.drawable.border_full_color_background);
        this.m0.setTextColor(getResources().getColor(R.color.white));
    }

    public final void K() {
        Udir udir = this.S;
        if (udir != null) {
            if (!udir.isChkTxnInitiated && !udir.isComplaintRaised) {
                this.q0.setBackgroundResource(R.drawable.border_background_color);
                this.n0.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                this.l0.setVisibility(8);
                this.o0.setVisibility(8);
            } else if (udir.isComplaintRaised) {
                this.q0.setBackgroundResource(R.drawable.border_background_color);
                this.n0.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                this.l0.setVisibility(0);
                this.o0.setVisibility(0);
                this.l0.setText(R.string.complaint_raise);
            } else {
                this.q0.setBackgroundResource(R.drawable.border_full_color_background);
                this.n0.setTextColor(getResources().getColor(R.color.white));
            }
        }
    }

    public final void L(TranHistory tranHistory) {
        if (tranHistory == null || tranHistory.getRefid() == null || tranHistory.getStatus() == null) {
            return;
        }
        if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(891))) {
            this.F.setTransactionStatus(10);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(892))) {
            this.F.setTransactionStatus(3);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(893))) {
            this.F.setTransactionStatus(1);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(894))) {
            this.F.setTransactionStatus(5);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(895))) {
            this.F.setTransactionStatus(4);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(896))) {
            this.F.setTransactionStatus(6);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(897))) {
            this.F.setTransactionStatus(7);
        }
        Udir udir = tranHistory.getUdir();
        if (udir != null) {
            this.F.setUdir(udir);
        }
        this.s0 = this.F.getTransactionStatus();
    }

    public final void M() {
        Udir udir = this.F.getUdir();
        this.S = udir;
        if (udir == null || !udir.isChkTxnInitiated) {
            return;
        }
        this.l0.setVisibility(0);
        this.o0.setVisibility(0);
        String str = this.S.txnInitiated;
        String a2 = C0059ao.a(898);
        boolean equals = str.equals(a2);
        String a3 = C0059ao.a(899);
        if (equals && this.S.amtDebited.equals(a2) && this.S.amtCredit.equals(a2) && this.S.txnComplete.equals(a2)) {
            this.l0.setText(R.string.transaction_successfuls);
            if (this.F.getMcc().equals(a3)) {
                this.q0.setVisibility(8);
                return;
            } else {
                this.q0.setVisibility(0);
                return;
            }
        }
        boolean equals2 = this.S.txnInitiated.equals(a2);
        String a4 = C0059ao.a(900);
        if (equals2 && this.S.amtDebited.equals(a4) && this.S.amtCredit.equals(a4) && this.S.txnComplete.equals(a4)) {
            this.l0.setText(R.string.transaction_faileds);
        } else if (this.S.txnInitiated.equals(a2) && this.S.amtDebited.equals(a2) && this.S.amtCredit.equals(a4) && this.S.txnComplete.equals(a4)) {
            this.l0.setText(R.string.transaction_credit);
        } else if (this.S.txnInitiated.equals(a2) && this.S.amtDebited.equals(a2) && this.S.amtCredit.equals(a2) && this.S.txnComplete.equals(a4)) {
            this.l0.setText(R.string.transaction_successfuls);
            if (this.F.getMcc().equals(a3)) {
                this.q0.setVisibility(8);
            } else {
                this.q0.setVisibility(0);
            }
        } else {
            this.l0.setText(C0059ao.a(901));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_query /* 2131362032 */:
                this.b.o(11, null);
                return;
            case R.id.button_send /* 2131362039 */:
                if (!TextUtils.isEmpty(this.G.getText()) && this.G.getText().toString().trim().length() > 0) {
                    eg0.i(k());
                    TranHistory tranHistory = new TranHistory();
                    tranHistory.setAmount(String.valueOf(this.F.getAmount()));
                    tranHistory.setTranid(this.F.getTransactionId());
                    tranHistory.setRefid(this.F.getRefid());
                    tranHistory.setQuery(this.G.getText().toString());
                    ua0.d().q(new OliveRequest(24, 33, tranHistory));
                    return;
                }
                eg0.h(k(), null, getString(R.string.enter_your_query));
                return;
            case R.id.check_status_layout /* 2131362071 */:
                Udir udir = this.S;
                if (udir == null || udir.isChkTxnInitiated) {
                    return;
                }
                eg0.i(getActivity());
                ua0.d().q(new OliveRequest(24, 95, this.F));
                return;
            case R.id.invoice /* 2131362381 */:
                if (this.F.getRefUrl() != null) {
                    na0 na0Var = new na0();
                    na0Var.e(this.F.getRefUrl());
                    this.b.t(69, na0Var);
                    return;
                }
                Toast.makeText(k(), C0059ao.a(903), 0).show();
                return;
            case R.id.raise_complaint_layout /* 2131362743 */:
                Udir udir2 = this.S;
                if (udir2 == null || udir2.isComplaintRaised || !udir2.isChkTxnInitiated) {
                    return;
                }
                I();
                return;
            case R.id.text_query /* 2131363016 */:
                if (this.F.getTransactionMode() == TransactionData.MODE_MERCHANT_PAY) {
                    new Intent().putExtra(C0059ao.a(902), jg0.r(this.F));
                    return;
                }
                this.m.setVisibility(0);
                this.G.requestFocus();
                this.r.setVisibility(0);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.p = layoutInflater.inflate(R.layout.fragment_transaction_details, viewGroup, false);
        String[] strArr = {getString(R.string.txninitiated), getString(R.string.debited), getString(R.string.txnsent), getString(R.string.complete)};
        B();
        TransactionData L = qa0.v().L();
        this.F = L;
        this.s0 = L.getTransactionStatus();
        this.T.setStateDescriptionData(strArr);
        z();
        return this.p;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            int requestType = oliveRequest.getRequestType();
            if (requestType == 33) {
                eg0.t(k(), getString(R.string.alert), result.getResult(), getString(R.string.query_footer));
            } else if (requestType == 95) {
                Toast.makeText(getContext(), result.result, 0).show();
            } else if (requestType != 96) {
                eg0.A(k(), result.getResult());
            } else {
                eg0.B();
                Toast.makeText(getContext(), result.result, 0).show();
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(24, getString(R.string.transaction_status));
        super.onResume();
        ua0.e(k()).u(this);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        Udir udir;
        int requestType = oliveRequest.getRequestType();
        if (requestType == 33) {
            eg0.B();
            ua0.d().g(false, new OliveRequest(24, 34, null, true));
            H(result.getData().toString());
        } else if (requestType == 95) {
            eg0.B();
            TranHistory tranHistory = (TranHistory) result.data;
            if (tranHistory != null) {
                this.b.o(301, null);
                if (tranHistory.getUdir() == null && (udir = this.S) != null) {
                    udir.isChkTxnInitiated = true;
                    this.F.setUdir(udir);
                }
                L(tranHistory);
                z();
            }
        } else if (requestType != 96) {
            if (this.g == oliveRequest.getInitiator()) {
                eg0.B();
            }
        } else {
            eg0.B();
            ComplaintResponse complaintResponse = (ComplaintResponse) result.data;
            if (TextUtils.isEmpty(complaintResponse.getCrn())) {
                return;
            }
            this.S.isComplaintRaised = true;
            TextView textView = this.o0;
            textView.setText(C0059ao.a(904) + complaintResponse.getCrn().toString());
            z();
        }
    }

    public void y() {
        if (this.F.getCuurentTime() != null) {
            try {
                if (jg0.z(new SimpleDateFormat(C0059ao.a(905)).parse(this.F.getCuurentTime()), new Date()) >= 3) {
                    this.R.setVisibility(0);
                    J();
                    M();
                    K();
                } else {
                    this.R.setVisibility(8);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    public final void z() {
        A();
        C();
        G();
        E();
        F();
    }
}
