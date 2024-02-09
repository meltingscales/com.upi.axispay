package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.OliveUpiManager;
import com.olive.upi.transport.TransportConstants;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.Banner;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.BillPayDataMaxAmount;
import com.olive.upi.transport.model.BillerCategory;
import com.olive.upi.transport.model.DTHOperator;
import com.olive.upi.transport.model.LimitCheckReq;
import com.olive.upi.transport.model.Payee;
import com.olive.upi.transport.model.RecentBPTHistory;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.activity.MainActivity;
import com.upi.axispay.custom.FloatingInputLayout;
import com.upi.axispay.custom.NonScrollListView;
import defpackage.n70;
import defpackage.qa0;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Hashtable;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: te0  reason: default package */
/* loaded from: classes.dex */
public class te0 extends xc0 implements ng0, View.OnClickListener, ua0.e {
    public static Account D;
    public ha0 A;
    public BillerCategory B;
    public gf0 C;
    public View l;
    public FloatingInputLayout m;
    public FloatingInputLayout n;
    public FloatingInputLayout o;
    public FloatingInputLayout p;
    public TransactionData q;
    public dg0 r;
    public BillPayDataMaxAmount s;
    public ArrayList<DTHOperator> t;
    public Button u;
    public DTHOperator v;
    public ViewPager w;
    public NonScrollListView x;
    public TextView y;
    public wc0 z;

    /* compiled from: AxisPay */
    /* renamed from: te0$a */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            te0.this.m.hideError();
            FloatingInputLayout floatingInputLayout = te0.this.o;
            String a = C0059ao.a(5293);
            floatingInputLayout.setText(a);
            if (editable.length() == 0) {
                qa0.v().U(null);
                te0.this.n.setText(a);
            } else if (editable.length() == 1) {
                te0.this.z(editable.toString());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: te0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            te0.this.b.o(11, null);
            te0 te0Var = te0.this;
            te0Var.b.t(118, te0Var.q.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: te0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            te0.this.y();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: te0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            te0.this.b.o(11, null);
            te0 te0Var = te0.this;
            te0Var.b.t(118, te0Var.q.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: te0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            te0.this.b.o(11, null);
            te0.this.b.t(21, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: te0$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            te0.this.b.t(24, null);
        }
    }

    public static te0 B() {
        return new te0();
    }

    public void A() {
        BillPayDataMaxAmount n = qa0.v().n();
        this.s = n;
        if (n == null) {
            ua0.e(k()).n(new OliveRequest(85, 50, null, true));
        }
    }

    public final void C() {
        dg0 dg0Var = new dg0();
        this.r = dg0Var;
        dg0Var.m(this.m.getText());
        this.r.j(this.v.getDesc());
        this.r.g(this.o.getText());
        this.r.l(C0059ao.a(13021));
        qa0.v().U(this.r);
    }

    public final void D() {
        this.p = (FloatingInputLayout) this.l.findViewById(R.id.promo_layout);
        this.m = (FloatingInputLayout) this.l.findViewById(R.id.dth_num_layout);
        this.n = (FloatingInputLayout) this.l.findViewById(R.id.operator_layout);
        this.o = (FloatingInputLayout) this.l.findViewById(R.id.amount_layout);
        ViewPager viewPager = (ViewPager) this.l.findViewById(R.id.pager_list);
        TabLayout tabLayout = (TabLayout) this.l.findViewById(R.id.pager_tab);
        this.u = (Button) this.l.findViewById(R.id.button_proceed);
        NonScrollListView nonScrollListView = (NonScrollListView) this.l.findViewById(R.id.recycler_view);
        this.x = nonScrollListView;
        nonScrollListView.setLayoutManager(new LinearLayoutManager(k()));
        this.y = (TextView) this.l.findViewById(R.id.empty_view);
    }

    public final void E() {
        this.p.getRightText().setOnClickListener(this);
        this.o.getRightText().setOnClickListener(this);
        this.n.getRightText().setOnClickListener(this);
        this.u.setOnClickListener(this);
    }

    public void F(BillerCategory billerCategory) {
        this.B = billerCategory;
    }

    public void G(ArrayList<RecentBPTHistory> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            ha0 ha0Var = this.A;
            if (ha0Var == null) {
                this.A = new ha0(k(), arrayList);
            } else {
                ha0Var.z(arrayList);
            }
            this.A.y(this);
            this.x.setAdapter(this.A);
            this.A.j();
            this.y.setVisibility(8);
            this.x.setVisibility(0);
            return;
        }
        this.x.setVisibility(8);
        this.y.setText(R.string.no_transaction_found);
        this.y.setVisibility(0);
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.browse_plan /* 2131361981 */:
                break;
            case R.id.button_proceed /* 2131362031 */:
                LimitCheckReq limitCheckReq = new LimitCheckReq();
                limitCheckReq.setAc(D);
                limitCheckReq.setDevice(c70.d(k()));
                Payee payee = new Payee();
                payee.setBeneVpa(new BeneVpa().getVpa());
                payee.setBamount(jg0.B(this.o.getText().toString()));
                ArrayList arrayList = new ArrayList();
                arrayList.add(payee);
                limitCheckReq.setPayees(arrayList);
                limitCheckReq.setAmount(jg0.B(this.o.getText().toString()));
                OliveUpiManager.getInstance(k()).verifyLimit(new OliveRequest(85, 98, limitCheckReq));
                break;
            case R.id.operator_change /* 2131362652 */:
                if (TextUtils.isEmpty(this.m.getText())) {
                    this.m.showError(getString(R.string.enter_subscriber_id_number));
                    return;
                } else {
                    this.b.t(100, this.B);
                    return;
                }
            case R.id.verify_code /* 2131363145 */:
                eg0.i(k());
                ua0.e(k()).q(new OliveRequest(85, 56, this.p.getText()));
                return;
            default:
                return;
        }
        if (TextUtils.isEmpty(this.m.getText())) {
            this.m.showError(getString(R.string.enter_subscriber_id_number));
        } else if (TextUtils.isEmpty(this.n.getText())) {
            this.b.t(100, this.B);
        } else {
            C();
            if (TextUtils.isEmpty(this.r.f())) {
                this.m.showError(getString(R.string.enter_subscriber_id_number));
            } else if (TextUtils.isEmpty(this.r.d())) {
                this.m.hideError();
                this.n.showError(getString(R.string.select_operator));
            } else {
                this.b.t(83, this.r);
            }
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
        if (i != 45) {
            return;
        }
        eg0.i(k());
        ua0.e(k()).q(new OliveRequest(85, 45, obj));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.l = layoutInflater.inflate(R.layout.fragment_new_dth_recharge, viewGroup, false);
        getActivity();
        D();
        E();
        wc0 C = wc0.C();
        this.z = C;
        C.w(getString(R.string.dth_recharg));
        Bundle bundle2 = new Bundle();
        bundle2.putInt(C0059ao.a(13022), 85);
        this.z.setArguments(bundle2);
        je n = getChildFragmentManager().n();
        n.r(R.id.fragment_connection, this.z);
        t(this.z);
        n.j();
        this.m.setInputType(1);
        this.m.setMaxLength(20);
        this.n.setActive(false);
        this.o.setInputType(6);
        this.o.getInputField().addTextChangedListener(new bg0(this.o.getInputField(), 1));
        this.o.setLeftImageSize(getResources().getInteger(R.integer.rupee_height), getResources().getInteger(R.integer.rupee_height));
        this.o.getInputField().setTextSize(22.0f);
        this.m.getInputField().addTextChangedListener(new a());
        return this.l;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (n(oliveRequest, result)) {
            return;
        }
        String code = result != null ? result.getCode() : C0059ao.a(13023);
        int requestType = oliveRequest.getRequestType();
        if (requestType == 45) {
            eg0.B();
            if (this.b == null) {
                this.b = (MainActivity) getActivity();
            }
            this.b.o(301, null);
            qa0.v().Z(null);
            String lastTransactionId = OliveUpiManager.getInstance(k()).getLastTransactionId();
            this.q.setTransactionId(lastTransactionId);
            if (result.getData() != null) {
                String obj = result.getData().toString();
                this.q.setRefid(obj);
                this.q.setApprovalRefNo(obj);
            } else {
                this.q.setRefid(lastTransactionId);
            }
            this.q.setDescription(result.getResult());
            this.q.setResponseCode(code);
            this.q.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(13024)));
            this.q.setTransactionStatus(1);
            qa0.v().u0(this.q);
            if (code.equals(C0059ao.a(13025))) {
                this.q.setTransactionId(null);
                eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.fail_text), getString(R.string.reset_upi_pin).toUpperCase(), new b(), getString(R.string.retry).toUpperCase(), new c(), true);
                return;
            } else if (code.equals(C0059ao.a(13026))) {
                eg0.o(k(), getString(R.string.alert), getString(R.string.transaction_failed_max_retry), getString(R.string.okay), new d());
                return;
            } else if (code.equals(C0059ao.a(13027))) {
                eg0.B();
                eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.insufficient_text), getString(R.string.check_balance).toUpperCase(), new e(), getString(R.string.ok_text), new f(), true);
                return;
            } else {
                this.b.t(24, null);
            }
        } else if (requestType == 56) {
            eg0.B();
        } else if (requestType != 98) {
            eg0.B();
        } else {
            Toast.makeText(this.c, result.getResult().toString(), 0).show();
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(85, getString(R.string.dth_recharg));
        super.onResume();
        ua0.e(k()).u(this);
        ViewPager viewPager = this.w;
        if (viewPager != null && viewPager.getAdapter() != null) {
            this.w.getAdapter().j();
        }
        ArrayList<RecentBPTHistory> s = qa0.v().s();
        if (s != null && s.size() > 0) {
            G(s);
        } else {
            ua0.e(k()).q(new OliveRequest(85, 560, C0059ao.a(13028), true));
        }
        ArrayList<DTHOperator> t = qa0.v().t();
        this.t = t;
        if (t == null || t.size() == 0) {
            ua0.d().o(new OliveRequest(85, 51, null));
        }
        A();
        dg0 m = qa0.v().m();
        this.r = m;
        if (m != null) {
            int i = 0;
            while (true) {
                ArrayList<DTHOperator> arrayList = this.t;
                if (arrayList == null || i >= arrayList.size()) {
                    break;
                }
                DTHOperator dTHOperator = this.t.get(i);
                if (!TextUtils.isEmpty(this.r.d()) && this.r.d().equalsIgnoreCase(dTHOperator.getDesc())) {
                    this.n.setText(dTHOperator.getDesc());
                    this.v = dTHOperator;
                    break;
                }
                i++;
            }
            if (TextUtils.isEmpty(this.r.a())) {
                return;
            }
            this.o.setText(String.valueOf(this.r.a()));
        }
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType == 45) {
            this.b.o(301, null);
            ua0.e(k()).q(new OliveRequest(85, 560, C0059ao.a(13029), true));
            String lastTransactionId = OliveUpiManager.getInstance(k()).getLastTransactionId();
            this.q.setApprovalRefNo(result.getCode());
            this.q.setResponseCode(result.getCode());
            this.q.setTransactionId(lastTransactionId);
            if (result.getData() != null) {
                this.q.setRefid(result.getData().toString());
            }
            this.q.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(13030)));
            this.q.setTransactionStatus(10);
            qa0.v().u0(this.q);
            n70.a aVar = n70.f;
            n70 a2 = aVar.a();
            n70 a3 = aVar.a();
            String a4 = C0059ao.a(13031);
            a2.v(a4, a3.j(a4) + 1);
            aVar.a().A(C0059ao.a(13032), false);
            eg0.B();
            this.b.t(24, null);
        } else if (requestType == 46) {
            eg0.B();
            wc0 wc0Var = this.z;
            if (wc0Var != null) {
                wc0Var.H();
            }
        } else if (requestType == 50) {
            eg0.B();
            this.s = qa0.v().n();
        } else if (requestType == 51) {
            eg0.B();
            if (qa0.v().t() != null) {
                this.t = new ArrayList<>();
                this.t = qa0.v().t();
            }
            gf0 gf0Var = this.C;
            if (gf0Var != null) {
                gf0Var.x();
            }
        } else if (requestType == 56) {
            eg0.B();
        } else if (requestType == 98) {
            y();
        } else if (requestType != 560) {
            if (this.g == oliveRequest.getInitiator()) {
                eg0.B();
            }
        } else {
            eg0.B();
            qa0.v().Z((ArrayList) result.getData());
            G(qa0.v().s());
        }
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        if (i == R.id.image) {
            Banner banner = (Banner) obj;
            na0 na0Var = new na0();
            na0Var.e(banner.getClickUrl());
            this.b.t(69, na0Var);
            HashMap hashMap = new HashMap();
            hashMap.put(C0059ao.a(13033), getString(R.string.dth_recharge));
            hashMap.put(C0059ao.a(13034), banner.getClickUrl());
            ah0.c(k(), C0059ao.a(13035), hashMap);
        } else if (i != R.id.recent_list) {
        } else {
            RecentBPTHistory recentBPTHistory = (RecentBPTHistory) obj;
            this.m.setText(recentBPTHistory.getMobn_subid());
            int i2 = 0;
            while (true) {
                ArrayList<DTHOperator> arrayList = this.t;
                if (arrayList == null || i2 >= arrayList.size()) {
                    break;
                }
                DTHOperator dTHOperator = this.t.get(i2);
                if (!TextUtils.isEmpty(recentBPTHistory.getOperator()) && recentBPTHistory.getOperator().equalsIgnoreCase(dTHOperator.getDesc())) {
                    this.v = dTHOperator;
                    this.n.setText(dTHOperator.getDesc());
                    break;
                }
                i2++;
            }
            this.o.setText(recentBPTHistory.getAmount());
        }
    }

    public final void x(Account account) {
        this.r = qa0.v().m();
        BeneVpa beneVpa = new BeneVpa();
        beneVpa.setVpa(TransportConstants.BILLPAY_UPIID);
        beneVpa.setName(C0059ao.a(13036));
        beneVpa.setNickname(C0059ao.a(13037));
        this.q.setAccount(account);
        this.q.setTransactionMode(TransactionData.MODE_SEND);
        this.q.setDirection(1);
        this.q.setBeneVpa(beneVpa);
        TransactionData transactionData = this.q;
        String a2 = C0059ao.a(13038);
        transactionData.setRefUrl(a2);
        this.q.setMcc(a2);
        this.q.setOrderId(a2);
        this.q.setAmount(Double.valueOf(this.r.a()));
        TransactionData transactionData2 = this.q;
        transactionData2.setRemarks(C0059ao.a(13039) + this.r.f() + C0059ao.a(13040) + this.r.d());
        Hashtable hashtable = new Hashtable();
        hashtable.put(C0059ao.a(13041), this.r.f());
        hashtable.put(C0059ao.a(13042), this.r.d());
        hashtable.put(C0059ao.a(13043), this.r.a());
        String valueOf = String.valueOf(jg0.f(hashtable));
        this.q.setBillpayKey(C0059ao.a(13044));
        this.q.setBillInfoString(valueOf);
        OliveRequest oliveRequest = new OliveRequest(9, 510, this.q);
        oliveRequest.setClMode(7);
        ua0.d().q(oliveRequest);
    }

    public boolean y() {
        if (TextUtils.isEmpty(this.m.getText())) {
            this.m.showError(getString(R.string.enter_subscriber_id_number));
            this.m.requestFocus();
            return false;
        } else if (this.v != null && this.m.getText().length() < Integer.parseInt(this.v.getMinIdLength())) {
            this.m.showError(String.format(getString(R.string.subscriber_id_min_validation), this.v.getMinIdLength()));
            return false;
        } else if (this.v != null && this.m.getText().length() > Integer.parseInt(this.v.getMaxIdLength())) {
            this.m.showError(String.format(getString(R.string.subscriber_id_max_validation), this.v.getMaxIdLength()));
            return false;
        } else if (TextUtils.isEmpty(this.n.getText())) {
            this.m.hideError();
            this.n.showError(getString(R.string.select_operator));
            return false;
        } else if (!TextUtils.isEmpty(this.o.getText()) && Double.parseDouble(this.o.getText()) >= 1.0d) {
            if (this.s == null) {
                return false;
            }
            if (Double.parseDouble(this.o.getText()) > Double.parseDouble(this.s.getDthPrepaidMaxAmount())) {
                FloatingInputLayout floatingInputLayout = this.o;
                floatingInputLayout.showError(getString(R.string.dth_max_amount_validation) + C0059ao.a(13045) + this.s.getDthPrepaidMaxAmount());
                return false;
            }
            this.o.hideError();
            C();
            this.q = qa0.v().L();
            qa0.v().U(this.r);
            ArrayList<Account> h = qa0.v().h(qa0.c.ACTIVE_VPA);
            if (h != null) {
                if (h.size() > 1) {
                    this.b.t(80, C0059ao.a(13046));
                } else if (h.size() == 1) {
                    x(h.get(0));
                }
            } else {
                eg0.m(k(), getString(R.string.no_active_account));
            }
            return true;
        } else {
            this.n.hideError();
            this.m.hideError();
            this.o.showError(getString(R.string.enter_amount));
            this.o.requestFocus();
            return false;
        }
    }

    public void z(String str) {
        int i = 0;
        while (true) {
            ArrayList<DTHOperator> arrayList = this.t;
            if (arrayList == null || i >= arrayList.size()) {
                return;
            }
            DTHOperator dTHOperator = this.t.get(i);
            if (str.equalsIgnoreCase(dTHOperator.getPrefix())) {
                this.n.setText(dTHOperator.getDesc());
                this.v = dTHOperator;
                return;
            }
            this.n.setText(C0059ao.a(13047));
            i++;
        }
    }
}
