package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.OliveUpiManager;
import com.olive.upi.transport.TransportConstants;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BbpsPay;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.BillPay;
import com.olive.upi.transport.model.MandateTransactionData;
import com.olive.upi.transport.model.PayRequest;
import com.olive.upi.transport.model.Payee;
import com.olive.upi.transport.model.PayeeInitiatedMandate;
import com.olive.upi.transport.model.PayerInitiatedMandate;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.activity.MainActivity;
import com.upi.axispay.custom.SpacesItemDecoration;
import defpackage.n70;
import defpackage.qa0;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: bd0  reason: default package */
/* loaded from: classes.dex */
public class bd0 extends xc0 implements ng0, ua0.e {
    public static bd0 r;
    public static String s;
    public RecyclerView l;
    public MandateTransactionData m;
    public h90 n;
    public dg0 o;
    public View p;
    public TextView q;

    /* compiled from: AxisPay */
    /* renamed from: bd0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            bd0.this.b.o(11, null);
            bd0 bd0Var = bd0.this;
            bd0Var.b.t(118, bd0Var.m.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bd0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            bd0.this.m.setTransactionId(null);
            bd0 bd0Var = bd0.this;
            bd0Var.D(bd0Var.m.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bd0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            bd0.this.b.o(11, null);
            bd0 bd0Var = bd0.this;
            bd0Var.b.t(118, bd0Var.m.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bd0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            bd0.this.b.o(11, null);
            bd0.this.b.t(21, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bd0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            bd0.this.b.t(24, null);
        }
    }

    public static bd0 C(String str) {
        if (r == null) {
            r = new bd0();
        }
        s = str;
        return r;
    }

    public final void A(Account account) {
        Payee payee = new Payee();
        MandateTransactionData z = qa0.v().z();
        payee.setBeneVpa(z.getPayeeName());
        payee.setBamount(String.valueOf(z.getAmount()));
        z.setAccount(account);
        z.setPayeeData(payee);
        if (z.getMandateType() == 1) {
            eg0.i(k());
            OliveRequest oliveRequest = new OliveRequest(80, 510, z);
            oliveRequest.setClMode(9);
            ua0.d().q(oliveRequest);
        } else if (z.getTransactionMode() == TransactionData.MODE_PAYER_UPDATE_MANDATE) {
            eg0.i(k());
            OliveRequest oliveRequest2 = new OliveRequest(80, 510, z);
            oliveRequest2.setClMode(12);
            ua0.d().q(oliveRequest2);
        } else {
            new d70(k());
            PayeeInitiatedMandate payeeInitiatedMandate = new PayeeInitiatedMandate();
            eg0.i(k());
            payeeInitiatedMandate.setCustomerid(n70.f.a().m(C0059ao.a(46)));
            payeeInitiatedMandate.setTxnid(c70.j());
            String a2 = C0059ao.a(47);
            payeeInitiatedMandate.setMandatename(a2);
            payeeInitiatedMandate.setRevocable(C0059ao.a(48));
            if (z.getStartMandate() != null) {
                payeeInitiatedMandate.setValiditystart(jg0.O(z.getStartMandate()));
            }
            if (z.getEndmandate() != null) {
                payeeInitiatedMandate.setValidityend(jg0.O(z.getEndmandate()));
            }
            if (z.getAmount() != null) {
                payeeInitiatedMandate.setAmount(c70.c(String.valueOf(z.getAmount())));
            }
            payeeInitiatedMandate.setMandatetype(C0059ao.a(49));
            payeeInitiatedMandate.setRule(C0059ao.a(50));
            payeeInitiatedMandate.setRecurrence(C0059ao.a(51));
            payeeInitiatedMandate.setRulevalue(C0059ao.a(52));
            payeeInitiatedMandate.setRuletype(C0059ao.a(53));
            payeeInitiatedMandate.setMonthlylimit(C0059ao.a(54));
            payeeInitiatedMandate.setNote(a2);
            payeeInitiatedMandate.setPayeraddr(z.getPayeeData().getBeneVpa());
            payeeInitiatedMandate.setPayername(z.getBeneVpa().getName());
            payeeInitiatedMandate.setPayeeaddr(z.getAccount().getVpa());
            payeeInitiatedMandate.setPayeename(z.getAccount().getName());
            ua0.e(k()).q(new OliveRequest(80, 59, payeeInitiatedMandate));
        }
    }

    public final void B(Account account) {
        E();
        Hashtable hashtable = new Hashtable();
        hashtable.put(C0059ao.a(55), this.o.c());
        hashtable.put(C0059ao.a(56), this.o.d());
        hashtable.put(C0059ao.a(57), this.o.b());
        hashtable.put(C0059ao.a(58), this.o.a());
        hashtable.put(C0059ao.a(59), this.o.e());
        this.m.setBillInfoString(jg0.f(hashtable));
        this.m.setBillpayKey(C0059ao.a(60));
        OliveRequest oliveRequest = new OliveRequest(80, 510, this.m);
        oliveRequest.setClMode(7);
        ua0.d().q(oliveRequest);
    }

    public final void D(Account account) {
        String str = s;
        if (str == C0059ao.a(61)) {
            eg0.i(k());
            B(account);
        } else if (str == C0059ao.a(62)) {
            eg0.i(k());
            z(account);
        } else if (str == C0059ao.a(63)) {
            this.b.o(151, account);
        } else if (str == C0059ao.a(64)) {
            eg0.i(k());
            A(account);
        } else if (str == oa0.f().i().getCODE_VAL()) {
            eg0.i(k());
            y(account);
        }
    }

    public void E() {
        this.o = qa0.v().m();
        BeneVpa beneVpa = new BeneVpa();
        beneVpa.setName(C0059ao.a(65));
        beneVpa.setNickname(C0059ao.a(66));
        beneVpa.setVpa(TransportConstants.BILLPAY_UPIID);
        this.m.setTransactionMode(TransactionData.MODE_SEND);
        this.m.setDirection(1);
        this.m.setBeneVpa(beneVpa);
        MandateTransactionData mandateTransactionData = this.m;
        String a2 = C0059ao.a(67);
        mandateTransactionData.setRefUrl(a2);
        this.m.setMcc(a2);
        this.m.setOrderId(a2);
        this.m.setAmount(Double.valueOf(this.o.a()));
        String str = s;
        String a3 = C0059ao.a(68);
        if (str == C0059ao.a(69)) {
            MandateTransactionData mandateTransactionData2 = this.m;
            mandateTransactionData2.setRemarks(C0059ao.a(70) + this.o.c() + a3 + this.o.d() + a3 + this.o.b() + a3 + this.o.e());
            return;
        }
        MandateTransactionData mandateTransactionData3 = this.m;
        mandateTransactionData3.setRemarks(C0059ao.a(71) + this.o.f() + a3 + this.o.d());
    }

    public final void F(ArrayList<Account> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            this.l.setVisibility(0);
            this.q.setVisibility(8);
            h90 h90Var = this.n;
            if (h90Var == null) {
                this.n = new h90(k(), arrayList);
            } else {
                h90Var.A(arrayList);
            }
            this.n.y(this);
            this.l.setAdapter(this.n);
            return;
        }
        this.l.setVisibility(8);
        this.q.setVisibility(0);
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
        String a2 = C0059ao.a(72);
        String a3 = C0059ao.a(73);
        String a4 = C0059ao.a(74);
        String a5 = C0059ao.a(75);
        String a6 = C0059ao.a(76);
        String a7 = C0059ao.a(77);
        String a8 = C0059ao.a(78);
        if (i == 9) {
            eg0.i(k());
            PayRequest payRequest = (PayRequest) obj;
            PayerInitiatedMandate payerInitiatedMandate = new PayerInitiatedMandate();
            MandateTransactionData z = qa0.v().z();
            if (payRequest != null) {
                eg0.i(k());
                payerInitiatedMandate.setCustomerid(payRequest.getCustomerId());
                payerInitiatedMandate.setTxnid(payRequest.getTxnId());
                payerInitiatedMandate.setUmn(c70.k());
                z.setUmnID(payerInitiatedMandate.getUmn());
                payerInitiatedMandate.setMandatename(a7);
                payerInitiatedMandate.setRevocable(a8);
                payerInitiatedMandate.setSharetopayee(this.m.getSharetoPayee());
                payerInitiatedMandate.setValiditystart(jg0.O(z.getStartMandate()));
                payerInitiatedMandate.setValidityend(jg0.O(z.getEndmandate()));
                payerInitiatedMandate.setAmount(c70.c(String.valueOf(z.getAmount())));
                String a9 = C0059ao.a(80);
                payerInitiatedMandate.setMandatetype(a9);
                payerInitiatedMandate.setMandatetype(a9);
                payerInitiatedMandate.setAmountrule(a6);
                payerInitiatedMandate.setRecurrence(a5);
                payerInitiatedMandate.setRulevalue(a4);
                payerInitiatedMandate.setRuletype(a3);
                payerInitiatedMandate.setMonthlylimit(a2);
                payerInitiatedMandate.setNote(z.getRemarks());
                payerInitiatedMandate.setPayeraddr(z.getAccount().getVpa());
                payerInitiatedMandate.setPayername(z.getAccount().getName());
                payerInitiatedMandate.setPayeeaddr(z.getPayeeData().getBeneVpa());
                payerInitiatedMandate.setPayeename(z.getBeneVpa().getName());
                payerInitiatedMandate.setExecutebypayeepsp(a8);
                payerInitiatedMandate.setDevice(payRequest.getDevice());
                payerInitiatedMandate.setCreds(payRequest.getCred());
                ua0.e(k()).q(new OliveRequest(80, 58, payerInitiatedMandate));
            }
        } else if (i != 12) {
            if (i == 19) {
                eg0.i(k());
                ua0.e(k()).q(new OliveRequest(80, 19, obj));
            } else if (i == 45) {
                eg0.i(k());
                ua0.e(k()).q(new OliveRequest(80, 45, obj));
            } else if (i != 69) {
            } else {
                BbpsPay bbpsPay = new BbpsPay();
                bbpsPay.setPayRequest(((BillPay) obj).getPayRequest());
                bbpsPay.setBbpspay(oa0.f().c());
                eg0.i(k());
                ua0.e(k()).q(new OliveRequest(80, 69, bbpsPay));
            }
        } else {
            eg0.i(k());
            PayRequest payRequest2 = (PayRequest) obj;
            PayerInitiatedMandate payerInitiatedMandate2 = new PayerInitiatedMandate();
            MandateTransactionData z2 = qa0.v().z();
            if (payRequest2 != null) {
                eg0.i(k());
                payerInitiatedMandate2.setCustomerid(payRequest2.getCustomerId());
                payerInitiatedMandate2.setTxnid(payRequest2.getTxnId());
                payerInitiatedMandate2.setUmn(z2.getUmnID());
                z2.setUmnID(payerInitiatedMandate2.getUmn());
                payerInitiatedMandate2.setMandatename(a7);
                payerInitiatedMandate2.setRevocable(a8);
                payerInitiatedMandate2.setSharetopayee(this.m.getSharetoPayee());
                payerInitiatedMandate2.setValiditystart(jg0.O(z2.getStartMandate()));
                payerInitiatedMandate2.setValidityend(jg0.O(z2.getEndmandate()));
                payerInitiatedMandate2.setAmount(c70.c(String.valueOf(z2.getAmount())));
                payerInitiatedMandate2.setMandatetype(C0059ao.a(79));
                payerInitiatedMandate2.setAmountrule(a6);
                payerInitiatedMandate2.setRecurrence(a5);
                payerInitiatedMandate2.setRulevalue(a4);
                payerInitiatedMandate2.setRuletype(a3);
                payerInitiatedMandate2.setMonthlylimit(a2);
                payerInitiatedMandate2.setNote(z2.getRemarks());
                payerInitiatedMandate2.setPayeraddr(z2.getAccount().getVpa());
                payerInitiatedMandate2.setPayername(z2.getAccount().getName());
                payerInitiatedMandate2.setPayeeaddr(z2.getPayeeData().getBeneVpa());
                payerInitiatedMandate2.setPayeename(z2.getBeneVpa().getName());
                payerInitiatedMandate2.setExecutebypayeepsp(a8);
                payerInitiatedMandate2.setDevice(payRequest2.getDevice());
                payerInitiatedMandate2.setCreds(payRequest2.getCred());
                ua0.e(k()).q(new OliveRequest(80, 58, payerInitiatedMandate2));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_bill_pay_myaccounts, viewGroup, false);
        this.p = inflate;
        this.l = (RecyclerView) inflate.findViewById(R.id.my_account_list);
        this.q = (TextView) this.p.findViewById(R.id.empty_view);
        this.l.setLayoutManager(new LinearLayoutManager(k()));
        this.l.addItemDecoration(new SpacesItemDecoration(20));
        this.m = qa0.v().z();
        return this.p;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            String code = result != null ? result.getCode() : C0059ao.a(81);
            int requestType = oliveRequest.getRequestType();
            if (requestType != 45) {
                String a2 = C0059ao.a(82);
                if (requestType == 58) {
                    eg0.B();
                    MandateTransactionData z = qa0.v().z();
                    this.m = z;
                    z.setTransactionStatus(1);
                    this.m.setResult(result.getResult());
                    this.m.setRefid((String) result.getData());
                    MandateTransactionData mandateTransactionData = this.m;
                    if (!TextUtils.isEmpty(mandateTransactionData.getUmnID())) {
                        a2 = this.m.getUmnID();
                    }
                    mandateTransactionData.setUmnID(a2);
                    qa0.v().h0(this.m);
                    this.b.t(110, null);
                } else if (requestType != 59) {
                    eg0.B();
                } else {
                    eg0.B();
                    MandateTransactionData z2 = qa0.v().z();
                    this.m = z2;
                    z2.setTransactionStatus(1);
                    this.m.setResult(result.getResult());
                    this.m.setRefid((String) result.getData());
                    MandateTransactionData mandateTransactionData2 = this.m;
                    if (!TextUtils.isEmpty(mandateTransactionData2.getUmnID())) {
                        a2 = this.m.getUmnID();
                    }
                    mandateTransactionData2.setUmnID(a2);
                    qa0.v().h0(this.m);
                    this.b.t(110, null);
                }
            } else {
                if (this.b == null) {
                    this.b = (MainActivity) getActivity();
                }
                if (s.equals(C0059ao.a(83))) {
                    qa0.v().k0(null);
                } else if (s.equals(C0059ao.a(84))) {
                    qa0.v().Z(null);
                }
                this.b.o(301, null);
                String lastTransactionId = OliveUpiManager.getInstance(k()).getLastTransactionId();
                this.m.setTransactionId(lastTransactionId);
                if (result.getData() != null) {
                    String obj = result.getData().toString();
                    this.m.setRefid(obj);
                    this.m.setApprovalRefNo(obj);
                } else {
                    this.m.setRefid(lastTransactionId);
                    this.m.setApprovalRefNo(lastTransactionId);
                }
                this.m.setResponseCode(code);
                this.m.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(85)));
                this.m.setTransactionStatus(1);
                this.m.setDescription(result.getResult());
                qa0.v().u0(this.m);
                eg0.B();
                if (code.equals(C0059ao.a(86))) {
                    eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.fail_text), getString(R.string.reset_upi_pin).toUpperCase(), new a(), getString(R.string.retry).toUpperCase(), new b(), true);
                    return;
                } else if (code.equals(C0059ao.a(87))) {
                    eg0.B();
                    eg0.o(k(), getString(R.string.alert), getString(R.string.transaction_failed_max_retry), getString(R.string.okay), new c());
                    return;
                } else if (code.equals(C0059ao.a(88))) {
                    eg0.B();
                    eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.insufficient_text), getString(R.string.check_balance).toUpperCase(), new d(), getString(R.string.ok_text), new e(), true);
                    return;
                } else {
                    this.b.t(24, null);
                }
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(80, getString(R.string.billpay_my_accounts));
        super.onResume();
        ua0.e(k()).u(this);
        ArrayList<Account> h = qa0.v().h(qa0.c.ACTIVE_VPA);
        if (h == null) {
            eg0.i(k());
            ua0.d().b(false, new OliveRequest(80, 15, null));
            return;
        }
        F(h);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        Object data;
        int requestType = oliveRequest.getRequestType();
        if (requestType == 15) {
            eg0.B();
            F(qa0.v().h(qa0.c.ACTIVE_VPA));
        } else if (requestType == 19) {
            eg0.B();
            if (!result.getCode().equals(C0059ao.a(97)) || (data = result.getData()) == null) {
                return;
            }
            this.n.B(data.toString());
        } else {
            String a2 = C0059ao.a(89);
            String a3 = C0059ao.a(90);
            String a4 = C0059ao.a(91);
            if (requestType == 45) {
                this.b.o(301, null);
                String lastTransactionId = OliveUpiManager.getInstance(k()).getLastTransactionId();
                this.m.setResponseCode(result.getCode());
                String obj = result.getData().toString();
                this.m.setTransactionId(lastTransactionId);
                if (result.getData() != null && !TextUtils.isEmpty(obj)) {
                    this.m.setRefid(obj);
                    this.m.setApprovalRefNo(obj);
                }
                this.m.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), a3));
                this.m.setTransactionStatus(10);
                qa0.v().u0(this.m);
                n70.a aVar = n70.f;
                aVar.a().v(a4, aVar.a().j(a4));
                aVar.a().A(a2, false);
                String str = s;
                String a5 = C0059ao.a(93);
                if (str.equals(a5)) {
                    ua0.e(k()).q(new OliveRequest(80, 60, a5, true));
                    aVar.a().y(C0059ao.a(94), this.o.c());
                    aVar.a().x(C0059ao.a(95), new Date().getTime());
                } else {
                    String str2 = s;
                    String a6 = C0059ao.a(96);
                    if (str2.equals(a6)) {
                        ua0.e(k()).q(new OliveRequest(80, 560, a6, true));
                    }
                }
                eg0.B();
                this.b.t(24, null);
            } else if (requestType == 69) {
                eg0.B();
                this.b.o(301, null);
                qa0.v().Z(null);
                String lastTransactionId2 = OliveUpiManager.getInstance(k()).getLastTransactionId();
                this.m.setApprovalRefNo(result.getCode());
                this.m.setResponseCode(result.getCode());
                this.m.setTransactionId(lastTransactionId2);
                if (result.getData() != null) {
                    this.m.setRefid(result.getData().toString());
                }
                this.m.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), a3));
                this.m.setTransactionStatus(10);
                qa0.v().u0(this.m);
                n70.a aVar2 = n70.f;
                aVar2.a().v(a4, aVar2.a().j(a4));
                aVar2.a().A(a2, false);
                eg0.B();
                this.b.t(24, null);
            } else {
                String a7 = C0059ao.a(92);
                if (requestType == 58) {
                    eg0.B();
                    this.m = qa0.v().z();
                    this.m.setTransactionStatus(10);
                    this.m.setRefid((String) result.getData());
                    MandateTransactionData mandateTransactionData = this.m;
                    if (!TextUtils.isEmpty(mandateTransactionData.getUmnID())) {
                        a7 = this.m.getUmnID();
                    }
                    mandateTransactionData.setUmnID(a7);
                    qa0.v().h0(this.m);
                    this.b.t(110, null);
                } else if (requestType != 59) {
                    oliveRequest.getInitiator();
                    eg0.B();
                } else {
                    eg0.B();
                    MandateTransactionData z = qa0.v().z();
                    this.m = z;
                    z.setTransactionStatus(10);
                    this.m.setRefid((String) result.getData());
                    MandateTransactionData mandateTransactionData2 = this.m;
                    if (!TextUtils.isEmpty(mandateTransactionData2.getUmnID())) {
                        a7 = this.m.getUmnID();
                    }
                    mandateTransactionData2.setUmnID(a7);
                    qa0.v().h0(this.m);
                    this.b.t(110, null);
                }
            }
        }
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        Account account = (Account) obj;
        if (i != R.id.account_refresh_balance) {
            if (i != R.id.layout_details) {
                return;
            }
            this.m.setAccount(account);
            D(account);
            return;
        }
        ua0.d().q(new OliveRequest(80, 519, account));
        HashMap hashMap = new HashMap();
        hashMap.put(C0059ao.a(98), jg0.n(account.getBankName()));
        ah0.c(k(), C0059ao.a(99), hashMap);
    }

    public final void y(Account account) {
        qa0.v().m();
        BeneVpa beneVpa = new BeneVpa();
        beneVpa.setVpa(C0059ao.a(100));
        beneVpa.setName(C0059ao.a(101));
        beneVpa.setNickname(C0059ao.a(102));
        TransactionData L = qa0.v().L();
        L.setAccount(account);
        L.setTransactionMode(TransactionData.MODE_SEND);
        L.setRemarks(C0059ao.a(103));
        L.setDirection(1);
        L.setBeneVpa(beneVpa);
        String a2 = C0059ao.a(104);
        L.setRefUrl(a2);
        L.setMcc(a2);
        L.setOrderId(a2);
        L.setAmount(oa0.f().e());
        String valueOf = String.valueOf(jg0.f(oa0.f().g()));
        L.setBillpayKey(C0059ao.a(105));
        L.setBillInfoString(valueOf);
        OliveRequest oliveRequest = new OliveRequest(80, 510, L);
        oliveRequest.setClMode(10);
        ua0.d().q(oliveRequest);
    }

    public final void z(Account account) {
        E();
        Hashtable hashtable = new Hashtable();
        hashtable.put(C0059ao.a(106), this.o.f());
        hashtable.put(C0059ao.a(107), this.o.d());
        hashtable.put(C0059ao.a(108), this.o.a());
        String valueOf = String.valueOf(jg0.f(hashtable));
        this.m.setBillpayKey(C0059ao.a(109));
        this.m.setBillInfoString(valueOf);
        OliveRequest oliveRequest = new OliveRequest(80, 510, this.m);
        oliveRequest.setClMode(7);
        ua0.d().q(oliveRequest);
    }
}
