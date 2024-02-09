package defpackage;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.TransportConstants;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.Bank;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.IntentData;
import com.olive.upi.transport.model.PayerInfo;
import com.olive.upi.transport.model.TransactionData;
import com.olive.upi.transport.model.VerifyMarchantResponse;
import com.olive.upi.transport.model.VpaVerify;
import com.upi.axispay.R;
import defpackage.n70;
import defpackage.qa0;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: tf0  reason: default package */
/* loaded from: classes.dex */
public class tf0 extends xc0 implements View.OnClickListener, ua0.e {
    public TextView A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public RelativeLayout F;
    public Integer G;
    public RelativeLayout H;
    public RelativeLayout I;
    public RelativeLayout J;
    public RelativeLayout K;
    public RelativeLayout L;
    public RelativeLayout M;
    public TextView N;
    public TextView O;
    public TextView P;
    public TextView Q;
    public TextView R;
    public TextView S;
    public TextView T;
    public TextView U;
    public TextView V;
    public TextView W;
    public la0 X;
    public TransactionData Y;
    public String a0;
    public String b0;
    public View l;
    public Spinner m;
    public Button n;
    public Button o;
    public TextView p;
    public ImageView r;
    public LinearLayout s;
    public LinearLayout t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public TextView z;
    public boolean q = false;
    public Account Z = new Account();
    public int c0 = 2;
    public int d0 = 1;
    public int e0 = 0;

    /* compiled from: AxisPay */
    /* renamed from: tf0$a */
    /* loaded from: classes.dex */
    public class a extends CountDownTimer {

        /* compiled from: AxisPay */
        /* renamed from: tf0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class View$OnClickListenerC0038a implements View.OnClickListener {
            public View$OnClickListenerC0038a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                tf0.this.b.o(11, null);
            }
        }

        public a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            tf0 tf0Var = tf0.this;
            if (tf0Var.q) {
                return;
            }
            tf0Var.q = true;
            eg0.n(tf0Var.c, C0059ao.a(15437), new View$OnClickListenerC0038a());
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: tf0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qa0.v().u0(tf0.this.Y);
            int intValue = tf0.this.n.getTag() != null ? ((Integer) tf0.this.n.getTag()).intValue() : 0;
            tf0 tf0Var = tf0.this;
            if (intValue == tf0Var.d0) {
                if (tf0Var.m.getSelectedItemPosition() == 0) {
                    eg0.m(tf0.this.k(), tf0.this.getString(R.string.select_account));
                    return;
                } else {
                    tf0.this.C(true);
                    return;
                }
            }
            tf0Var.b.t(58, tf0Var.Z);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: tf0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            tf0.this.b.o(11, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: tf0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            tf0.this.b.o(11, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: tf0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            tf0.this.b.o(11, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: tf0$f */
    /* loaded from: classes.dex */
    public class f implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ ArrayList b;

        /* compiled from: AxisPay */
        /* renamed from: tf0$f$a */
        /* loaded from: classes.dex */
        public class a implements View.OnClickListener {
            public final /* synthetic */ Account b;

            public a(Account account) {
                this.b = account;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.b.getStatus().equalsIgnoreCase(C0059ao.a(14962))) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(C0059ao.a(14963), tf0.this.b0);
                    hashMap.put(C0059ao.a(14964), jg0.n(this.b.getBankName()));
                    ah0.c(tf0.this.k(), C0059ao.a(14965), hashMap);
                    ua0.d().q(new OliveRequest(6, 519, this.b));
                    return;
                }
                eg0.m(tf0.this.k(), C0059ao.a(14966));
            }
        }

        public f(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 0) {
                tf0.this.F.setVisibility(8);
                tf0.this.o.setVisibility(8);
                return;
            }
            Account account = (Account) this.b.get(i);
            tf0.this.G = Integer.valueOf(i);
            if (account == null) {
                tf0.this.z();
                tf0.this.z.setVisibility(8);
                tf0.this.F.setVisibility(8);
                tf0.this.o.setVisibility(8);
                return;
            }
            tf0 tf0Var = tf0.this;
            tf0Var.Z = account;
            tf0Var.Y.setAccount(account);
            tf0.this.v.setText(account.getType());
            tf0.this.w.setText(account.getMaskedAccnumber());
            tf0.this.D.setText(account.getIfsc());
            tf0.this.x.setText(account.getBankName());
            tf0.this.E.setText(account.getVpa());
            Bank e = qa0.v().e(account.getIin());
            if (e != null) {
                jg0.K(tf0.this.r, e.getLogo(), 2131230832);
            } else {
                tf0.this.r.setImageResource(2131230832);
            }
            tf0.this.o.setOnClickListener(new a(account));
            tf0.this.z.setVisibility(0);
            tf0.this.F.setVisibility(0);
            tf0.this.o.setVisibility(0);
            tf0.this.A.setVisibility(4);
            tf0.this.y.setVisibility(4);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static tf0 A() {
        return new tf0();
    }

    public final void B(Account account, String str) {
        if (account != null && this.m.getSelectedItemPosition() != 0) {
            if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase(C0059ao.a(15371))) {
                this.b.t(131, 4);
                return;
            } else if (str.equalsIgnoreCase(C0059ao.a(15372))) {
                this.b.t(106, 4);
                return;
            } else {
                this.b.t(9, account);
                return;
            }
        }
        eg0.m(k(), getString(R.string.select_account));
    }

    public void C(boolean z) {
        TransactionData L = qa0.v().L();
        String sign = L.getSign();
        String intentData = L.getIntentData();
        if (TextUtils.isEmpty(sign) || L.isSignVerified()) {
            if (z) {
                String a2 = C0059ao.a(15375);
                if (intentData.startsWith(a2)) {
                    B(this.Z, a2);
                    return;
                } else {
                    B(this.Z, String.valueOf(L.getUpiTransactionMode()));
                    return;
                }
            }
            return;
        }
        IntentData intentData2 = new IntentData();
        n70.a aVar = n70.f;
        intentData2.setAppId(aVar.a().m(C0059ao.a(15373)));
        intentData2.setCustomerId(aVar.a().m(C0059ao.a(15374)));
        intentData2.setData(intentData);
        intentData2.setIntentData(intentData);
        eg0.i(getActivity());
        ua0.d().q(new OliveRequest(6, 84, intentData2));
    }

    public final void D() {
        this.A.setVisibility(0);
        this.A.setText(getString(R.string.last_check_on, jg0.x(Calendar.getInstance().getTime(), C0059ao.a(15376))));
        this.A.setVisibility(0);
        this.y.setVisibility(0);
    }

    public void E(int i) {
    }

    public final void F(ArrayList<Account> arrayList) {
        la0 la0Var = this.X;
        if (la0Var == null) {
            this.X = new la0(k(), arrayList);
        } else {
            la0Var.c(arrayList);
        }
        if (arrayList != null && arrayList.size() != 0) {
            this.B.setVisibility(8);
            this.n.setTag(Integer.valueOf(this.d0));
            this.m.setAdapter((SpinnerAdapter) this.X);
            Account account = this.Z;
            if (account != null) {
                this.m.setSelection(this.X.b(account.getVpa()));
            } else if (this.G.intValue() < this.X.getCount()) {
                this.m.setSelection(this.G.intValue());
            } else {
                this.m.setSelection(0);
            }
            this.m.setOnItemSelectedListener(new f(arrayList));
            return;
        }
        z();
    }

    public final void G() {
        BeneVpa beneVpa = this.Y.getBeneVpa();
        if (beneVpa != null) {
            String vpa = beneVpa.getVpa();
            String name = beneVpa.getName();
            if (!TextUtils.isEmpty(vpa) && !vpa.endsWith(C0059ao.a(15377)) && !vpa.endsWith(C0059ao.a(15378))) {
                VpaVerify vpaVerify = new VpaVerify();
                vpaVerify.setCustomerid(n70.f.a().m(C0059ao.a(15379)));
                vpaVerify.setVpa(vpa);
                vpaVerify.setDevice(c70.d(k()));
                PayerInfo payerInfo = new PayerInfo();
                ArrayList<Account> h = qa0.v().h(qa0.c.ACTIVE_VPA);
                if (h != null && h.size() > 0) {
                    payerInfo.setPayervpa(h.get(0).getVpa());
                    payerInfo.setAccountnumber(h.get(0).getAccRefNumber());
                    payerInfo.setName(h.get(0).getName());
                    vpaVerify.setPayerInfo(payerInfo);
                    if (this.Y.getQrMedium() != null && (this.Y.getQrMedium().equals(C0059ao.a(15380)) || this.Y.getQrMedium().equals(C0059ao.a(15381)))) {
                        ua0.d().q(new OliveRequest(6, 79, vpaVerify));
                        new a(3000L, 1000L).start();
                    } else {
                        ua0.d().q(new OliveRequest(6, 79, vpaVerify));
                    }
                } else {
                    eg0.i(k());
                    ua0.d().b(false, new OliveRequest(6, 15, null));
                    return;
                }
            }
            this.C.setText(name);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.vpa_layout) {
            return;
        }
        this.m.performClick();
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
        if (i != 19) {
            return;
        }
        eg0.i(k());
        ua0.e(k()).q(new OliveRequest(6, 19, obj));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sender_vpa_qr_scan, viewGroup, false);
        this.l = inflate;
        this.H = (RelativeLayout) inflate.findViewById(R.id.qr_expire_layout);
        LinearLayout linearLayout = (LinearLayout) this.l.findViewById(R.id.account_layout_vpa);
        this.t = (LinearLayout) this.l.findViewById(R.id.GSTIN_layout_vpa);
        TextView textView = (TextView) this.l.findViewById(R.id.text_account_numbers);
        TextView textView2 = (TextView) this.l.findViewById(R.id.text_ifscs);
        this.u = (TextView) this.l.findViewById(R.id.text_gstin);
        LinearLayout linearLayout2 = (LinearLayout) this.l.findViewById(R.id.IFSC_layout_vpa);
        this.U = (TextView) this.l.findViewById(R.id.text_invoice_name);
        this.V = (TextView) this.l.findViewById(R.id.text_invoice_no);
        this.W = (TextView) this.l.findViewById(R.id.text_QR_expiry_date);
        this.N = (TextView) this.l.findViewById(R.id.text_invoice_date);
        this.O = (TextView) this.l.findViewById(R.id.text_components);
        this.P = (TextView) this.l.findViewById(R.id.text_SGST);
        this.Q = (TextView) this.l.findViewById(R.id.text_CGST);
        this.R = (TextView) this.l.findViewById(R.id.text_IGST);
        this.S = (TextView) this.l.findViewById(R.id.text_GST);
        this.T = (TextView) this.l.findViewById(R.id.text_CESS);
        this.I = (RelativeLayout) this.l.findViewById(R.id.SGST_Layout);
        this.J = (RelativeLayout) this.l.findViewById(R.id.CGST_Layout);
        this.M = (RelativeLayout) this.l.findViewById(R.id.CESS_Layout);
        this.L = (RelativeLayout) this.l.findViewById(R.id.GST_layout);
        this.K = (RelativeLayout) this.l.findViewById(R.id.IGST_layout);
        this.m = (Spinner) this.l.findViewById(R.id.spinner_select_account);
        this.n = (Button) this.l.findViewById(R.id.button_proceed);
        this.r = (ImageView) this.l.findViewById(R.id.image_bank);
        this.p = (TextView) this.l.findViewById(R.id.text_receiver_title);
        LinearLayout linearLayout3 = (LinearLayout) this.l.findViewById(R.id.vpa_layout);
        this.s = linearLayout3;
        linearLayout3.setOnClickListener(this);
        RelativeLayout relativeLayout = (RelativeLayout) this.l.findViewById(R.id.pager);
        this.F = relativeLayout;
        relativeLayout.setVisibility(8);
        this.y = (TextView) this.l.findViewById(R.id.text_balance);
        this.B = (TextView) this.l.findViewById(R.id.empty_view);
        this.v = (TextView) this.l.findViewById(R.id.account_type);
        this.w = (TextView) this.l.findViewById(R.id.text_acc_number);
        this.D = (TextView) this.l.findViewById(R.id.text_ifsc);
        this.x = (TextView) this.l.findViewById(R.id.text_bank_name);
        this.A = (TextView) this.l.findViewById(R.id.text_time);
        this.z = (TextView) this.l.findViewById(R.id.text_link);
        this.C = (TextView) this.l.findViewById(R.id.text_receiver_name);
        this.E = (TextView) this.l.findViewById(R.id.account_vpa);
        this.z.setVisibility(8);
        Button button = (Button) this.l.findViewById(R.id.button_refresh_balance);
        this.o = button;
        button.setVisibility(8);
        TransactionData L = qa0.v().L();
        this.Y = L;
        if (L.getBeneVpa() != null && !TextUtils.isEmpty(this.Y.getBeneVpa().getVpa())) {
            this.p.setText(this.Y.getBeneVpa().getVpa());
        }
        if (this.Y.getInvoiceName() != null) {
            this.t.setVisibility(0);
            this.u.setText(this.Y.getGstIn());
            this.H.setVisibility(0);
            this.U.setText(this.Y.getInvoiceName());
            this.V.setText(this.Y.getInvoiceNo());
            String qRexpire = this.Y.getQRexpire();
            String invoiceDate = this.Y.getInvoiceDate();
            this.W.setText(qRexpire.substring(0, 10));
            this.N.setText(invoiceDate.substring(0, 10));
            this.O.setText(this.Y.getAmount().toString());
            String gstBrkUp = this.Y.getGstBrkUp();
            new HashMap();
            if (gstBrkUp != null) {
                String a2 = C0059ao.a(15382);
                boolean contains = gstBrkUp.contains(a2);
                String a3 = C0059ao.a(15383);
                if (contains) {
                    for (String str : gstBrkUp.split(C0059ao.a(15384))) {
                        String[] split = str.split(a3);
                        if (split[0].equalsIgnoreCase(C0059ao.a(15385))) {
                            this.K.setVisibility(0);
                            this.R.setText(split[1]);
                            this.Y.setIGST(split[1]);
                        } else if (split[0].equalsIgnoreCase(C0059ao.a(15386))) {
                            this.M.setVisibility(0);
                            this.T.setText(split[1]);
                            this.Y.setCESS(split[1]);
                        } else if (split[0].equalsIgnoreCase(C0059ao.a(15387))) {
                            this.L.setVisibility(0);
                            this.S.setText(split[1]);
                            this.Y.setGST(split[1]);
                        } else if (split[0].equalsIgnoreCase(C0059ao.a(15388))) {
                            this.I.setVisibility(0);
                            this.P.setText(split[1]);
                            this.Y.setSGST(split[1]);
                        } else if (split[0].equalsIgnoreCase(C0059ao.a(15389))) {
                            this.J.setVisibility(0);
                            this.Q.setText(split[1]);
                            this.Y.setCGST(split[1]);
                        }
                    }
                } else {
                    this.I.setVisibility(0);
                    this.J.setVisibility(0);
                    int indexOf = gstBrkUp.indexOf(a2);
                    String substring = gstBrkUp.substring(0, indexOf);
                    String substring2 = gstBrkUp.substring(indexOf + 1, gstBrkUp.length() - 1);
                    int indexOf2 = substring.indexOf(a3);
                    int indexOf3 = substring2.indexOf(a3);
                    String substring3 = substring.substring(indexOf2 + 1, substring.length());
                    this.Q.setText(substring3);
                    this.Y.setCGST(substring3);
                    String substring4 = substring2.substring(indexOf3 + 1, substring2.length());
                    this.P.setText(substring4);
                    this.Y.setSGST(substring4);
                }
            }
        } else {
            this.H.setVisibility(8);
        }
        this.n.setOnClickListener(new b());
        return this.l;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            int requestType = oliveRequest.getRequestType();
            if (requestType == 19) {
                eg0.B();
                eg0.m(k(), result.getResult());
            } else if (requestType != 79) {
                if (requestType != 84) {
                    eg0.B();
                    eg0.A(k(), result.getResult());
                } else {
                    eg0.B();
                    this.Y.setSignVerified(false);
                    int i = this.e0;
                    if (i == 1) {
                        this.b.t(131, 4);
                    } else if (i == 2) {
                        this.b.t(106, 4);
                    } else {
                        this.b.t(9, this.Z);
                    }
                }
            } else if (this.q) {
                return;
            } else {
                this.q = true;
                eg0.B();
                eg0.m(k(), getString(R.string.invalid_upi_id));
                k().onBackPressed();
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        TransactionData L = qa0.v().L();
        this.Y = L;
        int transactionMode = L.getTransactionMode();
        if (transactionMode == TransactionData.MODE_COLLECT_NOTIFICATION) {
            String string = getString(R.string.pending_request);
            this.a0 = string;
            this.b0 = string;
        } else if (transactionMode != TransactionData.MODE_QR_PAY && transactionMode != TransactionData.MODE_BHARAT_QR_PAY) {
            if (transactionMode == TransactionData.MODE_MERCHANT_PAY) {
                this.a0 = getString(R.string.axis_pay_upi);
                this.b0 = getString(R.string.intent_pay_select_acc);
            } else {
                this.a0 = getString(R.string.send_money);
                this.b0 = getString(R.string.send_money);
            }
        } else {
            this.a0 = getString(R.string.scan_pay);
            this.b0 = getString(R.string.scan_pay_select_acc);
        }
        this.b.o(90, new tg0(this.a0, false, true, true, false));
        v(6, this.a0);
        ua0.e(k()).u(this);
        F(qa0.v().h(qa0.c.ACTIVE_VPA));
        G();
        String intentData = this.Y.getIntentData();
        if (!TextUtils.isEmpty(intentData) && intentData.startsWith(C0059ao.a(15390))) {
            this.e0 = 1;
            C(false);
        } else if (TextUtils.isEmpty(intentData) || !intentData.startsWith(C0059ao.a(15391))) {
        } else {
            this.e0 = 2;
            C(false);
        }
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType == 15) {
            eg0.B();
            F(qa0.v().h(qa0.c.ACTIVE_VPA));
            G();
        } else if (requestType == 19) {
            eg0.B();
            TextView textView = this.y;
            textView.setText(C0059ao.a(15399) + result.getData().toString());
            D();
        } else {
            String a2 = C0059ao.a(15392);
            if (requestType != 79) {
                if (requestType == 84) {
                    eg0.B();
                    this.Y.setSignVerified(true);
                    B(this.Z, this.Y.getUpiTransactionMode());
                } else if (requestType != 97) {
                    if (oliveRequest.getInitiator() == this.g) {
                        eg0.B();
                    }
                } else {
                    eg0.B();
                    this.Y.setIsVerified(((VerifyMarchantResponse) result.getData()).getIsVerifyedMerchant());
                    if (!TextUtils.isEmpty(this.Y.getIsVerified()) && !this.Y.getIsVerified().equalsIgnoreCase(C0059ao.a(15393))) {
                        Double amount = this.Y.getAmount();
                        if (amount.doubleValue() != 0.0d) {
                            if (amount.doubleValue() > TransportConstants.MAX_AMOUNT_ALLOWED.doubleValue()) {
                                z zVar = this.c;
                                eg0.n(zVar, a2 + TransportConstants.MAX_AMOUNT_ALLOWED + C0059ao.a(15394), new e());
                                return;
                            }
                            return;
                        }
                        B(this.Z, this.Y.getUpiTransactionMode());
                        return;
                    }
                    B(this.Z, this.Y.getUpiTransactionMode());
                }
            } else if (this.q) {
            } else {
                this.q = true;
                if (result.getMcccode() != null) {
                    eg0.B();
                    String str = (String) result.getData();
                    this.C.setText(str);
                    this.Y.getBeneVpa().setName(str);
                    BeneVpa beneVpa = this.Y.getBeneVpa();
                    String qrMedium = this.Y.getQrMedium();
                    boolean isEmpty = TextUtils.isEmpty(qrMedium);
                    String a3 = C0059ao.a(15395);
                    String a4 = C0059ao.a(15396);
                    String a5 = C0059ao.a(15397);
                    if (!isEmpty && (qrMedium.equalsIgnoreCase(C0059ao.a(15398)) || qrMedium.equalsIgnoreCase(a4))) {
                        if (!result.getMcccode().equals(a5)) {
                            ua0.e(k()).q(new OliveRequest(6, 97, beneVpa.getVpa()));
                            return;
                        } else if (result.getMcccode().equals(a5)) {
                            this.Y.setMcc(result.getMcccode());
                            qa0.v().u0(this.Y);
                            Double amount2 = this.Y.getAmount();
                            if (amount2.doubleValue() == 0.0d || amount2.doubleValue() <= TransportConstants.MAX_AMOUNT_ALLOWED.doubleValue()) {
                                return;
                            }
                            z zVar2 = this.c;
                            eg0.n(zVar2, a2 + TransportConstants.MAX_AMOUNT_ALLOWED + a3, new c());
                            return;
                        } else {
                            return;
                        }
                    } else if (this.Y.getQrMedium() != null && this.Y.getQrMedium().equalsIgnoreCase(a4)) {
                        if (!result.getMcccode().equals(a5)) {
                            ua0.e(k()).q(new OliveRequest(6, 97, beneVpa.getVpa()));
                            return;
                        } else if (result.getMcccode().equals(a5)) {
                            this.Y.setMcc(result.getMcccode());
                            qa0.v().u0(this.Y);
                            Double amount3 = this.Y.getAmount();
                            if (amount3.doubleValue() == 0.0d || amount3.doubleValue() <= TransportConstants.MAX_AMOUNT_ALLOWED.doubleValue()) {
                                return;
                            }
                            z zVar3 = this.c;
                            eg0.n(zVar3, a2 + TransportConstants.MAX_AMOUNT_ALLOWED + a3, new d());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        C(false);
                        return;
                    }
                }
                eg0.B();
                String str2 = (String) result.getData();
                this.C.setText(str2);
                this.Y.getBeneVpa().setName(str2);
            }
        }
    }

    public final void z() {
        this.B.setVisibility(0);
        int transactionMode = this.Y.getTransactionMode();
        if (transactionMode != TransactionData.MODE_QR_PAY && transactionMode != TransactionData.MODE_BHARAT_QR_PAY) {
            this.B.setText(R.string.add_account_pay);
        } else {
            this.B.setText(R.string.add_account_scan);
        }
        this.n.setTag(Integer.valueOf(this.c0));
    }
}
