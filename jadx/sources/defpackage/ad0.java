package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.OliveUpiManager;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BbpsPay;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.BillPay;
import com.olive.upi.transport.model.BillerChargeReq;
import com.olive.upi.transport.model.BillerChargeRes;
import com.olive.upi.transport.model.BillerRegEnqResponse;
import com.olive.upi.transport.model.Billers;
import com.olive.upi.transport.model.NameVal;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.activity.MainActivity;
import com.upi.axispay.custom.SpacesItemDecoration;
import defpackage.n70;
import defpackage.qa0;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ad0  reason: default package */
/* loaded from: classes.dex */
public class ad0 extends xc0 implements View.OnClickListener, ua0.e {
    public LinearLayout A;
    public LinearLayout B;
    public LinearLayout C;
    public LinearLayout D;
    public Billers E;
    public TransactionData F;
    public RecyclerView G;
    public BillerChargeReq H;
    public double I;
    public View l;
    public TextView m;
    public TextView n;
    public TextView o;
    public TextView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public BillerChargeRes w;
    public Button x;
    public ImageView y;
    public LinearLayout z;

    /* compiled from: AxisPay */
    /* renamed from: ad0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            ad0.this.b.o(11, null);
            ad0 ad0Var = ad0.this;
            ad0Var.b.t(118, ad0Var.F.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ad0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            ad0.this.z();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ad0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            ad0.this.b.o(11, null);
            ad0 ad0Var = ad0.this;
            ad0Var.b.t(118, ad0Var.F.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ad0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            ad0.this.b.o(11, null);
            ad0.this.b.t(21, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ad0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            ad0.this.b.t(24, null);
        }
    }

    public void A(BillerChargeRes billerChargeRes) {
        this.w = billerChargeRes;
    }

    public void B() {
        this.m = (TextView) this.l.findViewById(R.id.text_name);
        RecyclerView recyclerView = (RecyclerView) this.l.findViewById(R.id.keyval_list);
        this.G = recyclerView;
        recyclerView.addItemDecoration(new SpacesItemDecoration(20));
        this.o = (TextView) this.l.findViewById(R.id.amount_value);
        this.y = (ImageView) this.l.findViewById(R.id.biller_icon);
        this.v = (TextView) this.l.findViewById(R.id.biller_name);
        this.p = (TextView) this.l.findViewById(R.id.amount_value_convinience);
        this.q = (TextView) this.l.findViewById(R.id.amount_value_tax1);
        this.r = (TextView) this.l.findViewById(R.id.amount_value_tax2);
        this.s = (TextView) this.l.findViewById(R.id.amount_value_tax3);
        this.t = (TextView) this.l.findViewById(R.id.amount_value_tax_total);
        this.u = (TextView) this.l.findViewById(R.id.amount_value_total_bill);
        this.x = (Button) this.l.findViewById(R.id.button_pay);
        TextView textView = (TextView) this.l.findViewById(R.id.text_offer);
        this.n = textView;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        this.z = (LinearLayout) this.l.findViewById(R.id.conv_layout);
        this.A = (LinearLayout) this.l.findViewById(R.id.tax1_layout);
        this.B = (LinearLayout) this.l.findViewById(R.id.tax2_layout);
        this.C = (LinearLayout) this.l.findViewById(R.id.tax3_layout);
        this.D = (LinearLayout) this.l.findViewById(R.id.total_tax_layout);
    }

    public final void C() {
        BillerRegEnqResponse c2 = oa0.f().c();
        this.H = qa0.v().o();
        this.m.setText(c2.getNM());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameVal(getString(R.string.bill_number), c2.getINVOICE_NO()));
        arrayList.add(new NameVal(getString(R.string.bill_period), c2.getBILL_PERIOD()));
        arrayList.add(new NameVal(getString(R.string.bill_date), c2.getVLD_FRM()));
        arrayList.add(new NameVal(getString(R.string.due_date), c2.getEXPR_DT()));
        arrayList.add(new NameVal(getString(R.string.consumer_number), c2.getCUST_CIF()));
        Iterator<NameVal> it = c2.getADDTNL_INFO().getTag().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        f90 f90Var = new f90(getContext(), arrayList);
        this.G.setLayoutManager(new GridLayoutManager(k(), 2));
        this.G.setAdapter(f90Var);
        this.v.setText(oa0.f().h().getNAME());
        jg0.K(this.y, oa0.f().h().getIconUrl(), R.drawable.def);
        this.o.setText(this.H.getAMT());
        if (D(this.w.getCHRG_AMT())) {
            this.p.setText(this.w.getCHRG_AMT());
        } else {
            this.z.setVisibility(8);
        }
        if (D(this.w.getTAX_AMT1())) {
            this.q.setText(this.w.getTAX_AMT1());
        } else {
            this.A.setVisibility(8);
        }
        if (D(this.w.getTAX_AMT2())) {
            this.r.setText(this.w.getTAX_AMT2());
        } else {
            this.B.setVisibility(8);
        }
        if (D(this.w.getTAX_AMT3())) {
            this.s.setText(this.w.getTAX_AMT3());
        } else {
            this.C.setVisibility(8);
        }
        if (D(this.w.getNET_CHRG_AMT())) {
            this.t.setText(this.w.getNET_CHRG_AMT());
        } else {
            this.D.setVisibility(8);
        }
        this.I = Double.parseDouble(this.H.getAMT()) + Double.parseDouble(this.w.getCHRG_AMT()) + Double.parseDouble(this.w.getTAX_AMT1()) + Double.parseDouble(this.w.getTAX_AMT2()) + Double.parseDouble(this.w.getTAX_AMT3()) + Double.parseDouble(this.w.getNET_CHRG_AMT());
        oa0.f().p(Double.valueOf(this.I));
        this.u.setText(String.valueOf(this.I));
    }

    public final boolean D(String str) {
        try {
            return Double.parseDouble(str) > 0.0d;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.button_pay) {
            return;
        }
        z();
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
        eg0.i(k());
        if (i != 69) {
            return;
        }
        BbpsPay bbpsPay = new BbpsPay();
        bbpsPay.setPayRequest(((BillPay) obj).getPayRequest());
        bbpsPay.setBbpspay(oa0.f().c());
        eg0.i(k());
        ua0.e(k()).q(new OliveRequest(105, 69, bbpsPay));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.l = layoutInflater.inflate(R.layout.fragment_generic_confirmation, viewGroup, false);
        B();
        this.x.setOnClickListener(this);
        C();
        this.F = qa0.v().L();
        return this.l;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            eg0.B();
            eg0.A(k(), result.getResult());
            String code = result.getCode();
            if (oliveRequest.getRequestType() == 69) {
                eg0.B();
                if (this.b == null) {
                    this.b = (MainActivity) getActivity();
                }
                this.b.o(301, null);
                qa0.v().Z(null);
                String lastTransactionId = OliveUpiManager.getInstance(k()).getLastTransactionId();
                this.F.setTransactionId(lastTransactionId);
                if (result.getData() != null) {
                    String obj = result.getData().toString();
                    this.F.setRefid(obj);
                    this.F.setApprovalRefNo(obj);
                } else {
                    this.F.setRefid(lastTransactionId);
                }
                this.F.setDescription(result.getResult());
                this.F.setResponseCode(code);
                this.F.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(2895)));
                this.F.setTransactionStatus(1);
                qa0.v().u0(this.F);
                if (code.equals(C0059ao.a(2896))) {
                    this.F.setTransactionId(null);
                    eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.fail_text), getString(R.string.reset_upi_pin).toUpperCase(), new a(), getString(R.string.retry).toUpperCase(), new b(), true);
                    return;
                } else if (code.equals(C0059ao.a(2897))) {
                    eg0.o(k(), getString(R.string.alert), getString(R.string.transaction_failed_max_retry), getString(R.string.okay), new c());
                    return;
                } else if (code.equals(C0059ao.a(2898))) {
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
        Billers h = oa0.f().h();
        this.E = h;
        v(105, h.getNAME());
        super.onResume();
        ua0.e(getActivity()).u(this);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (oliveRequest.getRequestType() != 69) {
            if (this.g == oliveRequest.getInitiator()) {
                eg0.B();
                return;
            }
            return;
        }
        eg0.B();
        this.b.o(301, null);
        qa0.v().Z(null);
        String f = ua0.e(k()).f();
        this.F.setApprovalRefNo(result.getCode());
        this.F.setResponseCode(result.getCode());
        if (result.getData() != null) {
            String obj = result.getData().toString();
            this.F.setTransactionId(f);
            this.F.setRefid(obj);
        } else {
            this.F.setTransactionId(f);
        }
        this.F.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(2899)));
        this.F.setTransactionStatus(10);
        qa0.v().u0(this.F);
        n70.a aVar = n70.f;
        n70 a2 = aVar.a();
        String a3 = C0059ao.a(2900);
        aVar.a().v(a3, a2.j(a3) + 1);
        aVar.a().A(C0059ao.a(2901), false);
        eg0.B();
        this.b.t(24, null);
    }

    public final void y(Account account) {
        qa0.v().m();
        BeneVpa beneVpa = new BeneVpa();
        beneVpa.setVpa(C0059ao.a(2902));
        beneVpa.setName(C0059ao.a(2903));
        beneVpa.setNickname(C0059ao.a(2904));
        TransactionData L = qa0.v().L();
        L.setAccount(account);
        L.setTransactionMode(TransactionData.MODE_SEND);
        L.setRemarks(C0059ao.a(2905));
        L.setDirection(1);
        L.setBeneVpa(beneVpa);
        String a2 = C0059ao.a(2906);
        L.setRefUrl(a2);
        L.setMcc(a2);
        L.setOrderId(a2);
        L.setAmount(Double.valueOf(this.I));
        L.setBillInfoString(String.valueOf(jg0.f(oa0.f().g())));
        L.setBillpayKey(C0059ao.a(2907));
        OliveRequest oliveRequest = new OliveRequest(105, 510, L);
        oliveRequest.setClMode(10);
        ua0.d().q(oliveRequest);
    }

    public final void z() {
        ArrayList<Account> h = qa0.v().h(qa0.c.ACTIVE_VPA);
        if (h != null) {
            if (h.size() > 1) {
                this.b.t(80, oa0.f().i().getCODE_VAL());
                return;
            } else if (h.size() == 1) {
                y(h.get(0));
                return;
            } else {
                return;
            }
        }
        eg0.m(k(), getString(R.string.no_active_account_found));
    }
}
