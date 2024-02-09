package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.OliveUpiManager;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.AuthorizeMandateRequest;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.ExecuteData;
import com.olive.upi.transport.model.GetMandate;
import com.olive.upi.transport.model.MandateTransactionData;
import com.olive.upi.transport.model.PayRequest;
import com.olive.upi.transport.model.Payee;
import com.olive.upi.transport.model.PendingMandateReqVo;
import com.olive.upi.transport.model.RecurrenceAuthorization;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import defpackage.n70;
import defpackage.ua0;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ze0  reason: default package */
/* loaded from: classes.dex */
public class ze0 extends xc0 implements ua0.e, ng0 {
    public Activity l;
    public View m;
    public RecyclerView n;
    public ca0 o;
    public GetMandate p;
    public TextView q;
    public MandateTransactionData r;
    public boolean s = false;
    public boolean t = false;
    public ArrayList<PendingMandateReqVo> u;
    public AuthorizeMandateRequest v;

    /* compiled from: AxisPay */
    /* renamed from: ze0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            eg0.i(ze0.this.getActivity());
            ze0.this.E();
            ua0.d().q(new OliveRequest(129, 75, ze0.this.p));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ze0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            eg0.i(ze0.this.getActivity());
            ze0.this.E();
            ua0.d().q(new OliveRequest(129, 75, ze0.this.p));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ze0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ Dialog b;
        public final /* synthetic */ PendingMandateReqVo c;

        public c(Dialog dialog, PendingMandateReqVo pendingMandateReqVo) {
            this.b = dialog;
            this.c = pendingMandateReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.hide();
            ze0.this.r.setTransactionMode(TransactionData.MODE_APPROVE_MANDATE);
            String str = ze0.this.k;
            StringBuilder sb = new StringBuilder();
            String a = C0059ao.a(13204);
            sb.append(a);
            sb.append(this.c.payerVpa);
            sb.toString();
            Account d = qa0.v().d(this.c.payerVpa.toLowerCase());
            if (d != null) {
                String str2 = ze0.this.k;
                String str3 = C0059ao.a(13205) + d.getVpa();
                String str4 = ze0.this.k;
                String str5 = a + this.c.payerVpa;
                d.setVpa(this.c.payerVpa);
                ze0.this.r.setRemitterVpa(this.c.payerVpa);
                ze0.this.r.setAccount(d);
                String str6 = ze0.this.k;
                String str7 = C0059ao.a(13206) + d.getVpa();
                Payee payee = new Payee();
                payee.setBeneVpa(this.c.payeeVpa);
                payee.setBamount(String.valueOf(ze0.this.r.getAmount()));
                ze0.this.r.setPayeeData(payee);
                BeneVpa beneVpa = new BeneVpa();
                beneVpa.setVpa(this.c.getPayeeVpa());
                ze0.this.r.setBeneVpa(beneVpa);
                ze0.this.r.setAmount(Double.valueOf(this.c.getAmount()));
                ze0.this.r.setTransactionId(this.c.getTxnid());
                ze0.this.r.setStartMandate(jg0.N(this.c.getValidity_start()));
                ze0.this.r.setEndmandate(jg0.N(this.c.getValidity_end()));
                ze0.this.r.setPayeeName(this.c.getBeneName());
                ze0.this.r.setRecurrence(this.c.getRecurrencePattern());
                ze0.this.r.setPayeeVpa(this.c.getPayeeVpa());
                ze0.this.r.setRemarks(this.c.getNotes());
                ze0.this.r.setOccurence(this.c.getRecurrencePattern());
                ze0.this.r.setTransactionOn(this.c.rule_type);
                ze0.this.r.setDebitAccountNo(d.getMaskedAccnumber());
                ze0.this.r.setRemarks(TextUtils.isEmpty(this.c.getNotes()) ? C0059ao.a(13207) : this.c.getNotes());
                ze0 ze0Var = ze0.this;
                ze0Var.r.setUmnID(ze0Var.v.getUmn());
                OliveRequest oliveRequest = new OliveRequest(129, 510, ze0.this.r);
                oliveRequest.setClMode(11);
                ua0.d().q(oliveRequest);
                return;
            }
            eg0.m(ze0.this.k(), C0059ao.a(13208));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ze0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ Dialog b;

        public d(ze0 ze0Var, Dialog dialog) {
            this.b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            this.b.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ze0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public final /* synthetic */ Dialog b;

        public e(ze0 ze0Var, Dialog dialog) {
            this.b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            this.b.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ze0$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public final /* synthetic */ Dialog b;

        public f(Dialog dialog) {
            this.b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            eg0.i(ze0.this.getActivity());
            ua0.d().q(new OliveRequest(129, 75, ze0.this.p));
            this.b.hide();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ze0$g */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public final /* synthetic */ Dialog b;

        public g(ze0 ze0Var, Dialog dialog) {
            this.b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            this.b.hide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void C(Dialog dialog, AuthorizeMandateRequest authorizeMandateRequest, View view) {
        dialog.dismiss();
        eg0.i(getActivity());
        ua0.d().q(new OliveRequest(129, 77, authorizeMandateRequest));
    }

    public static ze0 D() {
        return new ze0();
    }

    public final void E() {
        String str = C0059ao.a(13410) + this.r.getRemitterVpa();
        if (TextUtils.isEmpty(this.r.getRemitterVpa())) {
            return;
        }
        Account account = this.r.getAccount();
        account.setVpa(account.getVpa().toLowerCase());
    }

    public void F(og0 og0Var) {
    }

    public final void G(ArrayList<PendingMandateReqVo> arrayList) {
        ca0 ca0Var = this.o;
        if (ca0Var == null) {
            this.o = new ca0(arrayList);
        } else {
            ca0Var.z(arrayList);
        }
        this.o.y(this);
        this.n.setAdapter(this.o);
        this.o.j();
    }

    public void H(ArrayList<PendingMandateReqVo> arrayList) {
        this.u = arrayList;
        if (arrayList != null && arrayList.size() > 0) {
            G(this.u);
            this.n.setVisibility(0);
            this.q.setVisibility(8);
            return;
        }
        this.n.setVisibility(8);
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
        PayRequest payRequest = (PayRequest) obj;
        this.v = new AuthorizeMandateRequest();
        String a2 = C0059ao.a(13411);
        if (i == 77) {
            eg0.i(getActivity());
            this.v.setCustomerid(payRequest.getCustomerId());
            this.v.setTxnid(payRequest.getTxnId());
            if (this.r.getUmnID() != null && !TextUtils.isEmpty(this.r.getUmnID())) {
                this.v.setUmn(this.r.getUmnID());
            } else {
                this.v.setUmn(c70.k());
            }
            this.v.setDevice(payRequest.getDevice());
            this.v.setAction(a2);
            this.v.setAccount(payRequest.getAc());
            this.v.setCreds(payRequest.getCred());
            eg0.i(getActivity());
            ua0.d().q(new OliveRequest(129, 77, this.v));
        }
        if (i == 92) {
            new RecurrenceAuthorization();
            RecurrenceAuthorization recurrenceAuthorization = new RecurrenceAuthorization();
            recurrenceAuthorization.setTxnid(payRequest.getTxnId());
            recurrenceAuthorization.setAction(a2);
            recurrenceAuthorization.setPayervpa(payRequest.getAc().getVpa());
            recurrenceAuthorization.setPayeevpa(payRequest.getPayees().get(0).getBeneVpa());
            recurrenceAuthorization.setCred(payRequest.getCred());
            recurrenceAuthorization.setUmn(this.r.getUmn());
            eg0.i(k());
            ua0.d().q(new OliveRequest(113, 92, recurrenceAuthorization));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_pending_madate_rewuest, viewGroup, false);
        this.m = inflate;
        this.n = (RecyclerView) inflate.findViewById(R.id.pending_cycle_mandate);
        this.q = (TextView) this.m.findViewById(R.id.empty_view);
        ua0.e(k()).u(this);
        eg0.c();
        GetMandate getMandate = new GetMandate();
        this.p = getMandate;
        n70.a aVar = n70.f;
        getMandate.setCustomerid(aVar.a().m(C0059ao.a(13412)));
        this.p.setUmn(c70.k());
        this.p.setTxnid(c70.j());
        this.p.setAppid(aVar.a().m(C0059ao.a(13413)));
        ua0.d().q(new OliveRequest(129, 75, this.p));
        this.n.setLayoutManager(new LinearLayoutManager(k()));
        ca0 ca0Var = new ca0(this.l);
        this.o = ca0Var;
        this.n.setAdapter(ca0Var);
        this.r = qa0.v().z();
        return this.m;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        int requestType = oliveRequest.getRequestType();
        if (requestType != 77) {
            if (requestType == 92 || requestType == 93) {
                y(R.drawable.tra_failed, result.getResult());
            }
        } else if (this.s) {
            eg0.n(getActivity(), result.getResult(), new a());
        } else if (this.t) {
            eg0.n(getActivity(), result.getResult(), new b());
        } else {
            E();
            this.r.setTransactionStatus(1);
            this.r.setRefid((String) result.getData());
            MandateTransactionData mandateTransactionData = this.r;
            mandateTransactionData.setUmnID(TextUtils.isEmpty(mandateTransactionData.getUmnID()) ? C0059ao.a(13414) : this.r.getUmnID());
            this.r.setResult(result.getResult());
            qa0.v().h0(this.r);
            y(R.drawable.tra_failed, result.getResult());
        }
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.b.o(90, new tg0(getString(R.string.request_received), false, false, false, false));
        ua0.e(k()).u(this);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        String a2 = C0059ao.a(13415);
        if (requestType == 75) {
            eg0.B();
            if (result.getCode().equals(a2)) {
                ArrayList<PendingMandateReqVo> arrayList = (ArrayList) result.getData();
                this.u = arrayList;
                H(arrayList);
            }
        } else if (requestType != 77) {
            if (requestType == 92 || requestType == 93) {
                eg0.B();
                if (result.getCode().equals(a2)) {
                    eg0.B();
                    y(R.drawable.mandate_success, result.getResult());
                }
            }
        } else {
            E();
            this.r.setTransactionStatus(10);
            this.r.setRefid((String) result.getData());
            MandateTransactionData mandateTransactionData = this.r;
            mandateTransactionData.setUmnID(TextUtils.isEmpty(mandateTransactionData.getUmnID()) ? C0059ao.a(13416) : this.r.getUmnID());
            this.r.setTransactionId(OliveUpiManager.getInstance(k()).getLastTransactionId());
            qa0.v().h0(this.r);
            if (!this.s && !result.getResult().equalsIgnoreCase(C0059ao.a(13417))) {
                if (!this.t && !result.getResult().equalsIgnoreCase(C0059ao.a(13418))) {
                    eg0.B();
                    y(R.drawable.mandate_success, C0059ao.a(13419));
                    return;
                }
                eg0.B();
                y(R.drawable.cancelled, getString(R.string.the_mandate_request_has_been_n_blocked));
                return;
            }
            eg0.B();
            y(R.drawable.cancelled, getString(R.string.the_mandate_request_has_been_n_declined));
        }
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        PendingMandateReqVo pendingMandateReqVo = (PendingMandateReqVo) obj;
        this.v = new AuthorizeMandateRequest();
        Account d2 = qa0.v().d(pendingMandateReqVo.payerVpa);
        if (d2 != null) {
            this.v.setAccount(d2);
        }
        this.v.setCustomerid(n70.f.a().m(C0059ao.a(13420)));
        this.v.setTxnid(pendingMandateReqVo.getTxnid());
        this.v.setUmn((pendingMandateReqVo.getUmn() == null || TextUtils.isEmpty(pendingMandateReqVo.getUmn())) ? c70.k() : pendingMandateReqVo.getUmn());
        this.r.setUmnID(this.v.getUmn());
        this.v.setDevice(c70.d(k()));
        String a2 = C0059ao.a(13421);
        switch (i) {
            case R.id.button_approve /* 2131362002 */:
            case R.id.button_approve1 /* 2131362003 */:
                Dialog dialog = new Dialog(k(), R.style.Theme_Dialog);
                dialog.getWindow().requestFeature(1);
                dialog.setContentView(R.layout.dialog_mandate_reuest_success);
                dialog.getWindow().setLayout(-1, -2);
                Button button = (Button) dialog.findViewById(R.id.button_ok);
                ((TextView) dialog.findViewById(R.id.dialog_message)).setText(getString(R.string.my_mandate_accept_text));
                ImageView imageView = (ImageView) dialog.findViewById(R.id.dialog_icon);
                imageView.setImageResource(R.drawable.error_icon_grey);
                imageView.setColorFilter(t8.d(k(), R.color.colorPrimaryDark));
                dialog.setCancelable(true);
                dialog.show();
                button.setText(getString(R.string.proceed));
                button.setAllCaps(false);
                button.setOnClickListener(new c(dialog, pendingMandateReqVo));
                ((ImageView) dialog.findViewById(R.id.dialog_close)).setOnClickListener(new d(this, dialog));
                return;
            case R.id.button_block /* 2131362004 */:
            case R.id.button_block1 /* 2131362005 */:
                this.t = true;
                this.v.setAction(C0059ao.a(13426));
                eg0.i(k());
                ua0.d().q(new OliveRequest(129, 77, this.v));
                return;
            case R.id.button_decline /* 2131362014 */:
            case R.id.button_decline1 /* 2131362015 */:
                this.s = true;
                this.r.setAcceptType(C0059ao.a(13425));
                this.v.setAction(a2);
                z(this.v);
                return;
            case R.id.button_execute /* 2131362018 */:
                ExecuteData executeData = new ExecuteData();
                Account d3 = qa0.v().d(pendingMandateReqVo.payerVpa);
                executeData.setPayervpa(pendingMandateReqVo.payerVpa);
                executeData.setPayeevpa(pendingMandateReqVo.payeeVpa);
                executeData.setAccount(d3);
                executeData.setAction(C0059ao.a(13423));
                executeData.setTxnid(pendingMandateReqVo.txnid);
                executeData.setUmnid(pendingMandateReqVo.umn);
                eg0.i(getActivity());
                BeneVpa beneVpa = new BeneVpa();
                beneVpa.setVpa(pendingMandateReqVo.payeeVpa);
                this.r.setAccount(d3);
                this.r.setBeneVpa(beneVpa);
                this.r.setAmount(Double.valueOf(pendingMandateReqVo.getAmount()));
                this.r.setTransactionId(pendingMandateReqVo.txnid);
                this.r.setRemarks(C0059ao.a(13424));
                this.r.setUmn(pendingMandateReqVo.getUmn());
                OliveRequest oliveRequest = new OliveRequest(129, 592, this.r);
                oliveRequest.setClMode(14);
                ua0.d().q(oliveRequest);
                return;
            case R.id.button_revoke /* 2131362038 */:
                RecurrenceAuthorization recurrenceAuthorization = new RecurrenceAuthorization();
                recurrenceAuthorization.setPayervpa(pendingMandateReqVo.payerVpa);
                recurrenceAuthorization.setPayeevpa(pendingMandateReqVo.payeeVpa);
                recurrenceAuthorization.setAction(a2);
                recurrenceAuthorization.setTxnid(pendingMandateReqVo.txnid);
                recurrenceAuthorization.setUmn(pendingMandateReqVo.getUmn());
                eg0.i(getActivity());
                ua0.d().q(new OliveRequest(129, 93, recurrenceAuthorization));
                return;
            case R.id.invoice /* 2131362381 */:
                if (pendingMandateReqVo.getRefurl() != null) {
                    na0 na0Var = new na0();
                    na0Var.e(pendingMandateReqVo.getRefurl());
                    this.b.t(69, na0Var);
                    return;
                }
                Toast.makeText(k(), C0059ao.a(13422), 0).show();
                return;
            default:
                return;
        }
    }

    public void y(int i, String str) {
        Dialog dialog = new Dialog(getActivity(), R.style.Theme_Dialog);
        dialog.getWindow().requestFeature(1);
        dialog.setContentView(R.layout.dialog_mandate_reuest_success);
        dialog.getWindow().setLayout(-1, -2);
        Button button = (Button) dialog.findViewById(R.id.button_ok);
        ((TextView) dialog.findViewById(R.id.dialog_message)).setText(str);
        ((ImageView) dialog.findViewById(R.id.dialog_icon)).setImageResource(i);
        button.setText(getString(R.string.ok_text));
        dialog.setCancelable(true);
        dialog.show();
        button.setOnClickListener(new f(dialog));
        ((ImageView) dialog.findViewById(R.id.dialog_close)).setOnClickListener(new g(this, dialog));
    }

    public void z(final AuthorizeMandateRequest authorizeMandateRequest) {
        final Dialog dialog = new Dialog(getActivity(), R.style.Theme_Dialog);
        dialog.getWindow().requestFeature(1);
        dialog.setContentView(R.layout.dialog_man_decline);
        dialog.getWindow().setLayout(-1, -2);
        EditText editText = (EditText) dialog.findViewById(R.id.edit_description);
        dialog.setCancelable(true);
        dialog.show();
        ((Button) dialog.findViewById(R.id.button_no)).setOnClickListener(new View.OnClickListener() { // from class: kc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialog.cancel();
            }
        });
        ((Button) dialog.findViewById(R.id.button_yes)).setOnClickListener(new View.OnClickListener() { // from class: lc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ze0.this.C(dialog, authorizeMandateRequest, view);
            }
        });
        ((ImageView) dialog.findViewById(R.id.dialog_close)).setOnClickListener(new e(this, dialog));
    }
}
