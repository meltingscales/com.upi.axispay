package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.OliveUpiManager;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.MandateTransactionData;
import com.olive.upi.transport.model.PayRequest;
import com.olive.upi.transport.model.Payee;
import com.olive.upi.transport.model.PayeeInitiatedMandate;
import com.olive.upi.transport.model.PayerInitiatedMandate;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import defpackage.qa0;
import defpackage.ua0;
import java.io.PrintStream;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: td0  reason: default package */
/* loaded from: classes.dex */
public class td0 extends xc0 implements ua0.e, View.OnClickListener {
    public static int I;
    public TextView A;
    public LinearLayout B;
    public LinearLayout C;
    public ImageView D;
    public MandateTransactionData E;
    public int F = 106;
    public Bitmap G;
    public Bitmap H;
    public View l;
    public Button m;
    public TextView n;
    public TextView o;
    public TextView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public TextView z;

    /* compiled from: AxisPay */
    /* renamed from: td0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            td0.this.b.o(11, null);
            td0.this.b.t(21, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: td0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b(td0 td0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: td0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ LayoutInflater b;
        public final /* synthetic */ ViewGroup c;

        public c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            this.b = layoutInflater;
            this.c = viewGroup;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String a = ig0.a(qa0.v().z());
            try {
                td0 td0Var = td0.this;
                td0Var.G = jg0.e(a, td0Var.k(), 250);
                td0.this.C(this.b, this.c);
                yg0.c(td0.this.k(), td0.this.H);
            } catch (d30 unused) {
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: td0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            td0.this.b.o(11, null);
            td0 td0Var = td0.this;
            td0Var.b.t(118, td0Var.E.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: td0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            td0.this.E.setTransactionId(null);
            td0.this.z();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: td0$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f(td0 td0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: td0$g */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            td0.this.b.o(11, null);
            td0.this.b.t(21, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: td0$h */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public h(td0 td0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: td0$i */
    /* loaded from: classes.dex */
    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            td0.this.b.o(11, null);
            td0 td0Var = td0.this;
            td0Var.b.t(118, td0Var.E.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: td0$j */
    /* loaded from: classes.dex */
    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            td0.this.E.setTransactionId(null);
            td0.this.z();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: td0$k */
    /* loaded from: classes.dex */
    public class k implements View.OnClickListener {
        public k(td0 td0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    public static td0 A(int i2) {
        I = i2;
        return new td0();
    }

    public final void B(Account account) {
        Payee payee = new Payee();
        payee.setBeneVpa(this.E.getPayeeName());
        payee.setBamount(String.valueOf(this.E.getAmount()));
        this.E.setAccount(account);
        this.E.setPayeeData(payee);
        eg0.i(k());
        if (this.E.getTransactionMode() == TransactionData.MODE_PAYER_UPDATE_MANDATE) {
            OliveRequest oliveRequest = new OliveRequest(107, 510, this.E);
            oliveRequest.setClMode(12);
            ua0.d().q(oliveRequest);
            return;
        }
        OliveRequest oliveRequest2 = new OliveRequest(107, 510, this.E);
        oliveRequest2.setClMode(9);
        ua0.d().q(oliveRequest2);
    }

    public final void C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout_mandate_share, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.outer_layout);
        ((ImageView) inflate.findViewById(R.id.img_qr_code)).setImageBitmap(this.G);
        inflate.setDrawingCacheEnabled(true);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        k().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        inflate.buildDrawingCache(true);
        this.H = Bitmap.createBitmap(inflate.getDrawingCache());
        inflate.setDrawingCacheEnabled(false);
    }

    public void D() {
        B(this.E.getAccount());
    }

    public final void E() {
        this.m = (Button) this.l.findViewById(R.id.button_confirm);
        this.p = (TextView) this.l.findViewById(R.id.fromdate);
        this.n = (TextView) this.l.findViewById(R.id.debit_date);
        this.o = (TextView) this.l.findViewById(R.id.debit_acc_no);
        this.q = (TextView) this.l.findViewById(R.id.todate);
        this.r = (TextView) this.l.findViewById(R.id.amount);
        this.s = (TextView) this.l.findViewById(R.id.tv_frequency);
        this.t = (TextView) this.l.findViewById(R.id.payee_id);
        this.u = (TextView) this.l.findViewById(R.id.payee_name);
        this.v = (TextView) this.l.findViewById(R.id.payment_day);
        this.w = (TextView) this.l.findViewById(R.id.description);
        this.x = (TextView) this.l.findViewById(R.id.confirm_text);
        this.A = (TextView) this.l.findViewById(R.id.umn);
        TextView textView = (TextView) this.l.findViewById(R.id.payment_id);
        ImageView imageView = (ImageView) this.l.findViewById(R.id.image_success);
        this.B = (LinearLayout) this.l.findViewById(R.id.info_text);
        LinearLayout linearLayout = (LinearLayout) this.l.findViewById(R.id.umn_layout);
        this.C = (LinearLayout) this.l.findViewById(R.id.paymentid_layout);
        this.y = (TextView) this.l.findViewById(R.id.trans_status);
        this.z = (TextView) this.l.findViewById(R.id.trans_details);
        this.D = (ImageView) this.l.findViewById(R.id.share_qr);
        this.y.setTypeface(null, 1);
    }

    public final void F() {
        this.m.setOnClickListener(this);
    }

    @Override // defpackage.xc0
    public void m(int i2) {
        super.m(i2);
        if (i2 == this.F) {
            yg0.c(k(), this.H);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.button_confirm) {
            return;
        }
        z();
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i2, Object obj) {
        String a2 = C0059ao.a(14012);
        String a3 = C0059ao.a(14013);
        String a4 = C0059ao.a(14014);
        String a5 = C0059ao.a(14015);
        String a6 = C0059ao.a(14016);
        String a7 = C0059ao.a(14017);
        String a8 = C0059ao.a(14018);
        String a9 = C0059ao.a(14019);
        if (i2 == 9) {
            PayRequest payRequest = (PayRequest) obj;
            PayerInitiatedMandate payerInitiatedMandate = new PayerInitiatedMandate();
            if (payRequest != null) {
                eg0.i(k());
                payerInitiatedMandate.setCustomerid(payRequest.getCustomerId());
                payerInitiatedMandate.setTxnid(payRequest.getTxnId());
                payerInitiatedMandate.setUmn(c70.k());
                this.E.setUmnID(payerInitiatedMandate.getUmn());
                payerInitiatedMandate.setMandatename(a8);
                payerInitiatedMandate.setRevocable(a9);
                payerInitiatedMandate.setSharetopayee(this.E.getSharetoPayee());
                payerInitiatedMandate.setValiditystart(jg0.O(this.p.getText().toString()));
                payerInitiatedMandate.setValidityend(jg0.O(this.q.getText().toString()));
                payerInitiatedMandate.setAmount(c70.c(String.valueOf(this.E.getAmount())));
                payerInitiatedMandate.setMandatetype(C0059ao.a(14020));
                payerInitiatedMandate.setAmountrule(this.E.getAmountRule());
                payerInitiatedMandate.setRecurrence(this.E.getOccurence());
                payerInitiatedMandate.setRulevalue(a7);
                payerInitiatedMandate.setRuletype(this.E.getTransactionOn());
                payerInitiatedMandate.setMonthlylimit(a6);
                payerInitiatedMandate.setNote(this.w.getText().toString());
                payerInitiatedMandate.setPayeraddr(this.E.getAccount().getVpa());
                payerInitiatedMandate.setPayername(this.E.getAccount().getName());
                payerInitiatedMandate.setPayeeaddr(this.E.getPayeeData().getBeneVpa());
                payerInitiatedMandate.setPayeename(this.E.getBeneVpa().getName());
                if (this.E.getOccurence().equalsIgnoreCase(a5) && this.E.getBlockFund().equalsIgnoreCase(a9)) {
                    payerInitiatedMandate.setPurposecode(a2);
                    payerInitiatedMandate.setBlockfund(a9);
                } else {
                    payerInitiatedMandate.setPurposecode(a4);
                    payerInitiatedMandate.setBlockfund(a3);
                }
                payerInitiatedMandate.setExecutebypayeepsp(a9);
                payerInitiatedMandate.setDevice(payRequest.getDevice());
                payerInitiatedMandate.setCreds(payRequest.getCred());
                ua0.d().q(new OliveRequest(107, 58, payerInitiatedMandate));
            }
        } else if (i2 == 12) {
            PayRequest payRequest2 = (PayRequest) obj;
            PayerInitiatedMandate payerInitiatedMandate2 = new PayerInitiatedMandate();
            if (payRequest2 != null) {
                eg0.i(k());
                payerInitiatedMandate2.setCustomerid(payRequest2.getCustomerId());
                payerInitiatedMandate2.setTxnid(payRequest2.getTxnId());
                payerInitiatedMandate2.setUmn(this.E.getUmnID());
                this.E.setUmnID(payerInitiatedMandate2.getUmn());
                payerInitiatedMandate2.setMandatename(a8);
                payerInitiatedMandate2.setRevocable(a9);
                payerInitiatedMandate2.setSharetopayee(this.E.getSharetoPayee());
                payerInitiatedMandate2.setValiditystart(jg0.O(this.p.getText().toString()));
                payerInitiatedMandate2.setValidityend(jg0.O(this.q.getText().toString()));
                payerInitiatedMandate2.setAmount(c70.c(String.valueOf(this.E.getAmount())));
                payerInitiatedMandate2.setMandatetype(C0059ao.a(14021));
                payerInitiatedMandate2.setAmountrule(this.E.getAmountRule());
                payerInitiatedMandate2.setRecurrence(this.E.getOccurence());
                payerInitiatedMandate2.setRulevalue(a7);
                payerInitiatedMandate2.setRuletype(this.E.getTransactionOn());
                payerInitiatedMandate2.setMonthlylimit(a6);
                payerInitiatedMandate2.setNote(this.w.getText().toString());
                payerInitiatedMandate2.setPayeraddr(this.E.getAccount().getVpa());
                payerInitiatedMandate2.setPayername(this.E.getAccount().getName());
                payerInitiatedMandate2.setPayeeaddr(this.E.getPayeeData().getBeneVpa());
                payerInitiatedMandate2.setPayeename(this.E.getBeneVpa().getName());
                payerInitiatedMandate2.setExecutebypayeepsp(a9);
                payerInitiatedMandate2.setDevice(payRequest2.getDevice());
                payerInitiatedMandate2.setCreds(payRequest2.getCred());
                if (this.E.getOccurence().equalsIgnoreCase(a5) && this.E.getBlockFund().equalsIgnoreCase(a9)) {
                    payerInitiatedMandate2.setPurposecode(a2);
                    payerInitiatedMandate2.setBlockfund(a9);
                } else {
                    payerInitiatedMandate2.setPurposecode(a4);
                    payerInitiatedMandate2.setBlockfund(a3);
                }
                ua0.d().q(new OliveRequest(107, 58, payerInitiatedMandate2));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.l = layoutInflater.inflate(R.layout.fragment_mandate_confirmation, viewGroup, false);
        MandateTransactionData z = qa0.v().z();
        this.E = z;
        if (z.getMandateType() == 2) {
            v(107, getString(R.string.request_mandate));
        } else if (this.E.getMandateType() == 3) {
            v(107, getString(R.string.confirmation_caps));
        } else {
            v(107, getString(R.string.create_auto_debit_mandate));
        }
        E();
        F();
        this.m.setBackgroundResource(R.drawable.button_shape);
        BeneVpa beneVpa = this.E.getBeneVpa();
        this.p.setText(this.E.getStartMandate());
        TextView textView = this.n;
        textView.setText(this.E.getTransactionOn() + C0059ao.a(14022) + this.E.getStartMandate());
        this.o.setText(this.E.getDebitAccountNo());
        this.q.setText(this.E.getEndmandate());
        this.r.setText(jg0.b(String.valueOf(this.E.getAmount())));
        this.s.setText(this.E.getOccurence());
        this.t.setText(beneVpa.getVpa());
        this.u.setText(jg0.g(beneVpa.getName()));
        this.v.setText(String.format(getString(R.string.payment_day), this.E.getTransactionOn()));
        PrintStream printStream = System.out;
        printStream.println(C0059ao.a(14023) + this.E.getOccurence());
        if (this.E.getBlockFund().equalsIgnoreCase(C0059ao.a(14024))) {
            this.B.setVisibility(8);
        }
        this.x.setText(String.format(getString(R.string.confirm_text_new), String.valueOf(this.E.getAmount()), this.E.getStartMandate(), this.E.getEndmandate()));
        if (this.E.getMandateType() == 2) {
            this.x.setText(String.format(getString(R.string.confirm_text), String.valueOf(this.E.getAmount())));
        }
        this.w.setText(this.E.getRemarks());
        this.D.setOnClickListener(new c(layoutInflater, viewGroup));
        return this.l;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        if (n(oliveRequest, result)) {
            return;
        }
        int requestType = oliveRequest.getRequestType();
        String a2 = C0059ao.a(14025);
        String a3 = C0059ao.a(14026);
        String a4 = C0059ao.a(14027);
        String a5 = C0059ao.a(14028);
        String a6 = C0059ao.a(14029);
        String a7 = C0059ao.a(14030);
        String a8 = C0059ao.a(14031);
        String a9 = C0059ao.a(14032);
        String a10 = C0059ao.a(14033);
        if (requestType != 58) {
            if (requestType != 59) {
                return;
            }
            this.C.setVisibility(8);
            this.y.setText(C0059ao.a(14034));
            this.z.setText(result.getResult());
            this.E.setResult(result.getResult());
            this.E.setRefid((String) result.getData());
            MandateTransactionData mandateTransactionData = this.E;
            if (!TextUtils.isEmpty(mandateTransactionData.getUmnID())) {
                a10 = this.E.getUmnID();
            }
            mandateTransactionData.setUmnID(a10);
            this.E.setTransactionStatus(1);
            if (result.getCode().equals(a9)) {
                eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.fail_text), C0059ao.a(14035).toUpperCase(), new i(), a7.toUpperCase(), new j(), true);
                return;
            } else if (result.getCode().equals(a8)) {
                eg0.B();
                eg0.o(k(), a5, a4, a3, new k(this));
                return;
            } else if (result.getCode().equals(a6)) {
                eg0.B();
                eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.insufficient_text), a2.toUpperCase(), new a(), C0059ao.a(14036), new b(this), true);
                return;
            } else {
                this.b.t(110, null);
                return;
            }
        }
        this.C.setVisibility(8);
        this.y.setText(result.getResult());
        this.z.setText(result.getResult());
        this.E.setResult(result.getResult());
        this.E.setRefid((String) result.getData());
        MandateTransactionData mandateTransactionData2 = this.E;
        if (!TextUtils.isEmpty(mandateTransactionData2.getUmnID())) {
            a10 = this.E.getUmnID();
        }
        mandateTransactionData2.setUmnID(a10);
        this.E.setTransactionStatus(1);
        if (result.getCode().equals(a9)) {
            eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.fail_text), C0059ao.a(14037), new d(), a7.toUpperCase(), new e(), true);
        } else if (result.getCode().equals(a8)) {
            eg0.B();
            eg0.o(k(), a5, a4, a3, new f(this));
        } else if (result.getCode().equals(a6)) {
            eg0.B();
            eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.insufficient_text), a2.toUpperCase(), new g(), C0059ao.a(14038), new h(this), true);
        } else {
            this.b.t(110, null);
        }
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ua0.e(k()).u(this);
        if (this.E.getMandateType() == 2) {
            v(107, getString(R.string.request_mandate));
        } else if (this.E.getMandateType() == 3) {
            v(107, getString(R.string.confirmation_caps));
        } else {
            v(107, getString(R.string.create_auto_debit_mandate));
        }
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        this.C.setVisibility(8);
        TextView textView = this.A;
        boolean isEmpty = TextUtils.isEmpty(this.E.getUmnID());
        String a2 = C0059ao.a(14039);
        textView.setText(isEmpty ? a2 : this.E.getUmnID());
        int requestType = oliveRequest.getRequestType();
        String a3 = C0059ao.a(14040);
        if (requestType == 58) {
            String str = (String) result.getData();
            this.z.setText(result.getResult());
            this.E.setResult(result.getResult());
            if (result.getCode().equals(a3)) {
                this.E.setTransactionStatus(10);
                this.E.setRefid(str);
                MandateTransactionData mandateTransactionData = this.E;
                if (!TextUtils.isEmpty(mandateTransactionData.getUmnID())) {
                    a2 = this.E.getUmnID();
                }
                mandateTransactionData.setUmnID(a2);
                this.E.setTransactionId(OliveUpiManager.getInstance(k()).getLastTransactionId());
                qa0.v().h0(this.E);
                this.b.t(110, null);
                return;
            }
            this.E.setRefid(str);
            MandateTransactionData mandateTransactionData2 = this.E;
            if (!TextUtils.isEmpty(mandateTransactionData2.getUmnID())) {
                a2 = this.E.getUmnID();
            }
            mandateTransactionData2.setUmnID(a2);
            this.E.setTransactionStatus(1);
            this.b.t(110, null);
        } else if (requestType != 59) {
        } else {
            String str2 = (String) result.getData();
            this.y.setText(C0059ao.a(14041));
            this.z.setText(R.string.success_requested_msg);
            this.E.setResult(result.getResult());
            if (result.getCode().equals(a3)) {
                this.E.setRefid(str2);
                MandateTransactionData mandateTransactionData3 = this.E;
                if (!TextUtils.isEmpty(mandateTransactionData3.getUmnID())) {
                    a2 = this.E.getUmnID();
                }
                mandateTransactionData3.setUmnID(a2);
                this.E.setTransactionStatus(10);
                qa0.v().h0(this.E);
                this.b.t(110, null);
                return;
            }
            this.E.setRefid(str2);
            MandateTransactionData mandateTransactionData4 = this.E;
            if (!TextUtils.isEmpty(mandateTransactionData4.getUmnID())) {
                a2 = this.E.getUmnID();
            }
            mandateTransactionData4.setUmnID(a2);
            this.E.setTransactionStatus(1);
            this.b.t(110, null);
        }
    }

    public final void z() {
        PayeeInitiatedMandate payeeInitiatedMandate = new PayeeInitiatedMandate();
        if (I == 1) {
            qa0.v().h0(null);
            this.b.o(11, null);
        } else if (this.E.getMandateType() != 1 && this.E.getMandateType() != 4) {
            if (this.E.getMandateType() == 3 && this.E.getTransactionMode() == TransactionData.MODE_PAYER_UPDATE_MANDATE) {
                D();
                return;
            }
            ArrayList<Account> h2 = qa0.v().h(qa0.c.ACTIVE_VPA);
            if (h2 != null && h2.size() > 0) {
                if (h2.size() > 1) {
                    this.b.t(80, C0059ao.a(14042));
                    return;
                }
                int transactionMode = this.E.getTransactionMode();
                int i2 = TransactionData.MODE_PAYEE_UPDATE_MANDATE;
                String a2 = C0059ao.a(14043);
                String a3 = C0059ao.a(14044);
                String a4 = C0059ao.a(14045);
                String a5 = C0059ao.a(14046);
                String a6 = C0059ao.a(14047);
                if (transactionMode == i2) {
                    eg0.i(k());
                    payeeInitiatedMandate.setCustomerid(n70.f.a().m(a6));
                    payeeInitiatedMandate.setTxnid(this.E.getTransactionId());
                    payeeInitiatedMandate.setUmn(this.E.getUmnID());
                    payeeInitiatedMandate.setMandatename(a5);
                    payeeInitiatedMandate.setRevocable(a4);
                    payeeInitiatedMandate.setValiditystart(jg0.O(this.p.getText().toString()));
                    payeeInitiatedMandate.setValidityend(jg0.O(this.q.getText().toString()));
                    payeeInitiatedMandate.setAmount(c70.c(String.valueOf(this.E.getAmount())));
                    payeeInitiatedMandate.setMandatetype(C0059ao.a(14048));
                    payeeInitiatedMandate.setRule(this.E.getAmountRule());
                    payeeInitiatedMandate.setRecurrence(this.E.getOccurence());
                    payeeInitiatedMandate.setRulevalue(a3);
                    payeeInitiatedMandate.setRuletype(this.E.getTransactionOn());
                    payeeInitiatedMandate.setMonthlylimit(a2);
                    payeeInitiatedMandate.setNote(this.w.getText().toString());
                    payeeInitiatedMandate.setPayeraddr(this.E.getBeneVpa().getVpa());
                    payeeInitiatedMandate.setPayername(this.E.getBeneVpa().getName());
                    payeeInitiatedMandate.setPayeeaddr(h2.get(0).getVpa());
                    payeeInitiatedMandate.setPayeename(h2.get(0).getName());
                    payeeInitiatedMandate.setDevice(c70.d(k()));
                    ua0.d().q(new OliveRequest(107, 59, payeeInitiatedMandate));
                    return;
                }
                eg0.i(k());
                payeeInitiatedMandate.setCustomerid(n70.f.a().m(a6));
                payeeInitiatedMandate.setTxnid(c70.j());
                payeeInitiatedMandate.setMandatename(a5);
                payeeInitiatedMandate.setRevocable(a4);
                payeeInitiatedMandate.setValiditystart(jg0.O(this.p.getText().toString()));
                payeeInitiatedMandate.setValidityend(jg0.O(this.q.getText().toString()));
                payeeInitiatedMandate.setAmount(c70.c(String.valueOf(this.E.getAmount())));
                payeeInitiatedMandate.setMandatetype(C0059ao.a(14049));
                payeeInitiatedMandate.setRule(this.E.getAmountRule());
                payeeInitiatedMandate.setRecurrence(this.E.getOccurence());
                payeeInitiatedMandate.setRulevalue(a3);
                payeeInitiatedMandate.setRuletype(this.E.getTransactionOn());
                payeeInitiatedMandate.setMonthlylimit(a2);
                payeeInitiatedMandate.setNote(this.w.getText().toString());
                payeeInitiatedMandate.setPayeraddr(this.E.getBeneVpa().getVpa());
                payeeInitiatedMandate.setPayername(this.E.getBeneVpa().getName());
                payeeInitiatedMandate.setPayeeaddr(h2.get(0).getVpa());
                payeeInitiatedMandate.setPayeename(h2.get(0).getName());
                payeeInitiatedMandate.setDevice(c70.d(k()));
                ua0.d().q(new OliveRequest(107, 59, payeeInitiatedMandate));
                return;
            }
            eg0.m(k(), C0059ao.a(14050));
        } else {
            D();
        }
    }
}
