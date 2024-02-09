package defpackage;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.IMediaSession;
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
import com.olive.upi.transport.model.Billers;
import com.olive.upi.transport.model.LimitCheckReq;
import com.olive.upi.transport.model.OperatorsLogos;
import com.olive.upi.transport.model.Payee;
import com.olive.upi.transport.model.PrefixMobile;
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
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ue0  reason: default package */
/* loaded from: classes.dex */
public class ue0 extends xc0 implements ng0, View.OnClickListener, ua0.e {
    public static Account I;
    public ha0 A;
    public PrefixMobile B;
    public dg0 C;
    public TransactionData D;
    public ViewPager F;
    public BillerCategory G;
    public gf0 H;
    public FloatingInputLayout l;
    public FloatingInputLayout m;
    public FloatingInputLayout n;
    public FloatingInputLayout o;
    public FloatingInputLayout p;
    public ViewPager q;
    public BillPayDataMaxAmount r;
    public Button u;
    public TabLayout v;
    public View w;
    public wc0 x;
    public NonScrollListView y;
    public TextView z;
    public boolean s = false;
    public boolean t = false;
    public int E = 108;

    /* compiled from: AxisPay */
    /* renamed from: ue0$a */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            View currentFocus = ue0.this.k().getCurrentFocus();
            if (currentFocus == null || currentFocus.getId() != ue0.this.l.getInputField().getId()) {
                return;
            }
            ue0.this.l.hideError();
            FloatingInputLayout floatingInputLayout = ue0.this.o;
            String a = C0059ao.a(704);
            floatingInputLayout.setText(a);
            qa0.v().U(null);
            if (editable.length() < 4) {
                ue0 ue0Var = ue0.this;
                ue0Var.s = false;
                ue0Var.m.hideError();
                ue0.this.m.setText(a);
                ue0.this.n.setText(a);
                ue0.this.n.hideError();
            } else if (editable.length() == 4) {
                ue0.this.A(editable.toString());
                ue0 ue0Var2 = ue0.this;
                ue0Var2.t = true;
                ue0Var2.s = false;
            } else if (editable.length() > 4) {
                ue0 ue0Var3 = ue0.this;
                if (ue0Var3.t) {
                    return;
                }
                ue0Var3.A(editable.toString().substring(0, 5));
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
    /* renamed from: ue0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            ue0.this.b.o(11, null);
            ue0 ue0Var = ue0.this;
            ue0Var.b.t(118, ue0Var.D.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ue0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ue0.this.D.setTransactionId(null);
            eg0.c();
            ue0.this.z();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ue0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            ue0.this.b.o(11, null);
            ue0 ue0Var = ue0.this;
            ue0Var.b.t(118, ue0Var.D.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ue0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            ue0.this.b.o(11, null);
            ue0.this.b.t(21, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ue0$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            ue0.this.b.t(24, null);
        }
    }

    public static ue0 C() {
        return new ue0();
    }

    public void A(String str) {
        ua0.d().q(new OliveRequest(81, 47, str));
    }

    public void B() {
        BillPayDataMaxAmount n = qa0.v().n();
        this.r = n;
        if (n == null) {
            ua0.e(k()).n(new OliveRequest(81, 50, null, true));
        }
    }

    public final void D() {
        Intent intent = new Intent(C0059ao.a(12169), Uri.parse(C0059ao.a(12168)));
        intent.setType(C0059ao.a(12170));
        startActivityForResult(intent, 1);
    }

    public final void E() {
        dg0 dg0Var = new dg0();
        this.C = dg0Var;
        dg0Var.i(this.l.getText().trim());
        this.C.j(this.m.getText().trim());
        this.C.h(this.n.getText().trim());
        this.C.g(this.o.getText().trim());
        this.C.k(this.p.getText());
        this.C.l(C0059ao.a(12171));
        qa0.v().U(this.C);
    }

    public final void F() {
        this.q = (ViewPager) this.w.findViewById(R.id.pager_list);
        this.v = (TabLayout) this.w.findViewById(R.id.pager_tab);
        this.u = (Button) this.w.findViewById(R.id.button_proceed);
        this.l = (FloatingInputLayout) this.w.findViewById(R.id.mobile_num_layout);
        this.o = (FloatingInputLayout) this.w.findViewById(R.id.amount_layout);
        this.m = (FloatingInputLayout) this.w.findViewById(R.id.mobile_operator_layout);
        this.n = (FloatingInputLayout) this.w.findViewById(R.id.circle_layout);
        this.p = (FloatingInputLayout) this.w.findViewById(R.id.promo_layout);
        NonScrollListView nonScrollListView = (NonScrollListView) this.w.findViewById(R.id.recycler_view);
        this.y = nonScrollListView;
        nonScrollListView.setLayoutManager(new LinearLayoutManager(k()));
        this.z = (TextView) this.w.findViewById(R.id.empty_view);
    }

    public final void G() {
        this.l.getRightIcon().setOnClickListener(this);
        this.u.setOnClickListener(this);
        this.m.setOnClickListener(this);
        this.m.getInputField().setOnClickListener(this);
        this.m.getRightText().setOnClickListener(this);
        this.n.setOnClickListener(this);
        this.n.getInputField().setOnClickListener(this);
        this.n.getRightText().setOnClickListener(this);
        this.p.getRightText().setOnClickListener(this);
    }

    public void H(BillerCategory billerCategory) {
        this.G = billerCategory;
    }

    public void I(ArrayList<RecentBPTHistory> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            ha0 ha0Var = this.A;
            if (ha0Var == null) {
                this.A = new ha0(k(), arrayList);
            } else {
                ha0Var.z(arrayList);
            }
            this.A.y(this);
            this.y.setAdapter(this.A);
            this.A.j();
            this.z.setVisibility(8);
            this.y.setVisibility(0);
            return;
        }
        this.y.setVisibility(8);
        this.z.setText(R.string.no_transaction_found);
        this.z.setVisibility(0);
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        if (i == 1 && i2 == -1) {
            Uri data = intent.getData();
            String a2 = C0059ao.a(12172);
            String[] strArr = {a2};
            if (data == null) {
                return;
            }
            Cursor query = k().getContentResolver().query(data, strArr, null, null, null);
            if (query != null) {
                query.moveToFirst();
                str = query.getString(query.getColumnIndex(a2));
                query.close();
            } else {
                str = null;
            }
            if (str == null) {
                return;
            }
            String a3 = C0059ao.a(12173);
            String a4 = C0059ao.a(12174);
            String replaceAll = str.replaceAll(a3, a4);
            this.s = true;
            this.C = null;
            qa0.v().U(null);
            this.o.setText(a4);
            if (replaceAll.length() == 12 && replaceAll.startsWith(C0059ao.a(12175))) {
                this.l.setText(replaceAll.substring(2));
                A(replaceAll.substring(2, 6));
            } else if (replaceAll.length() == 10) {
                this.l.setText(replaceAll);
                A(replaceAll.substring(0, 4));
            } else if (replaceAll.length() == 11 && replaceAll.startsWith(C0059ao.a(12176))) {
                this.l.setText(replaceAll.substring(1));
                A(replaceAll.substring(1, 5));
            } else {
                this.s = false;
                eg0.m(k(), getString(R.string.please_select_valid_mobile_number));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.browse_plan /* 2131361981 */:
                E();
                if (this.C.c().length() < 10) {
                    this.l.showError(getString(R.string.mobile_number_length_validation));
                    return;
                } else if (TextUtils.isEmpty(this.C.d())) {
                    this.m.showError(R.string.select_operator);
                    return;
                } else if (TextUtils.isEmpty(this.C.b())) {
                    this.n.showError(R.string.select_circle);
                    return;
                } else {
                    this.b.t(83, this.C);
                    return;
                }
            case R.id.button_proceed /* 2131362031 */:
                LimitCheckReq limitCheckReq = new LimitCheckReq();
                limitCheckReq.setAc(I);
                limitCheckReq.setDevice(c70.d(k()));
                Payee payee = new Payee();
                payee.setBeneVpa(new BeneVpa().getVpa());
                payee.setBamount(jg0.B(this.o.getText()));
                ArrayList arrayList = new ArrayList();
                arrayList.add(payee);
                limitCheckReq.setPayees(arrayList);
                limitCheckReq.setAmount(jg0.B(this.o.getText()));
                OliveUpiManager.getInstance(k()).verifyLimit(new OliveRequest(81, 98, limitCheckReq));
                return;
            case R.id.circle_change /* 2131362085 */:
            case R.id.circle_layout /* 2131362087 */:
                if (this.l.getText().length() < 10) {
                    this.l.showError(getString(R.string.mobile_number_length_validation));
                    return;
                }
                E();
                this.n.hideError();
                this.l.getInputField().setFocusable(false);
                if (TextUtils.isEmpty(this.m.getText())) {
                    this.b.t(100, this.G);
                    return;
                }
                Billers billers = new Billers();
                billers.setName(this.m.getText());
                this.b.t(101, billers);
                return;
            case R.id.contact_pick /* 2131362109 */:
                this.l.hideError();
                y();
                return;
            case R.id.operator_change /* 2131362652 */:
            case R.id.operator_layout /* 2131362653 */:
                if (this.l.getText().length() < 10) {
                    this.l.showError(getString(R.string.mobile_number_length_validation));
                    return;
                }
                E();
                this.m.hideError();
                this.l.getInputField().setFocusable(false);
                this.b.t(100, this.G);
                return;
            case R.id.verify_code /* 2131363145 */:
                eg0.i(k());
                ua0.e(k()).q(new OliveRequest(81, 56, this.p.getText()));
                return;
            default:
                return;
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
        if (i == 45) {
            eg0.i(k());
            ua0.e(k()).q(new OliveRequest(81, 45, obj));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.w = layoutInflater.inflate(R.layout.fragment_new_mobile_recharge, viewGroup, false);
        F();
        G();
        wc0 C = wc0.C();
        this.x = C;
        C.w(getString(R.string.mobile_rechargee));
        Bundle bundle2 = new Bundle();
        bundle2.putInt(C0059ao.a(12177), 81);
        this.x.setArguments(bundle2);
        je n = getChildFragmentManager().n();
        n.r(R.id.fragment_connection, this.x);
        t(this.x);
        n.j();
        this.q.setAdapter(new ia0(getChildFragmentManager()));
        this.v.setupWithViewPager(this.q);
        this.l.setInputType(1);
        this.l.setMaxLength(10);
        this.m.setActive(false);
        this.n.setActive(false);
        this.o.setInputType(6);
        this.o.getInputField().addTextChangedListener(new bg0(this.o.getInputField(), 1));
        this.o.setLeftImageSize(getResources().getInteger(R.integer.rupee_height), getResources().getInteger(R.integer.rupee_height));
        this.o.getInputField().setTextSize(22.0f);
        this.o.getRightText().setOnClickListener(this);
        this.l.getInputField().addTextChangedListener(new a());
        return this.w;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            String a2 = C0059ao.a(12178);
            String code = result != null ? result.getCode() : a2;
            int requestType = oliveRequest.getRequestType();
            if (requestType == 45) {
                this.b.o(301, null);
                qa0.v().k0(null);
                String lastTransactionId = OliveUpiManager.getInstance(k()).getLastTransactionId();
                this.D.setTransactionId(lastTransactionId);
                if (result.getData() != null) {
                    String obj = result.getData().toString();
                    this.D.setRefid(obj);
                    this.D.setApprovalRefNo(obj);
                } else {
                    this.D.setRefid(lastTransactionId);
                }
                this.D.setDescription(result.getResult());
                this.D.setResponseCode(code);
                this.D.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(12179)));
                this.D.setTransactionStatus(1);
                qa0.v().u0(this.D);
                if (this.b == null) {
                    this.b = (MainActivity) k();
                }
                eg0.B();
                if (code.equals(C0059ao.a(12180))) {
                    eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.fail_text), getString(R.string.reset_upi_pin).toUpperCase(), new b(), getString(R.string.retry).toUpperCase(), new c(), true);
                    return;
                } else if (code.equals(C0059ao.a(12181))) {
                    eg0.o(k(), getString(R.string.alert), getString(R.string.transaction_failed_max_retry), getString(R.string.okay), new d());
                    return;
                } else if (code.equals(C0059ao.a(12182))) {
                    eg0.B();
                    eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.insufficient_text), getString(R.string.check_balance).toUpperCase(), new e(), getString(R.string.ok_text), new f(), true);
                    return;
                } else {
                    this.b.t(24, null);
                }
            } else if (requestType == 47) {
                this.t = false;
                this.n.setText(a2);
                this.m.setText(a2);
                if (this.s) {
                    A(this.l.getText().substring(0, 5));
                    this.s = false;
                    return;
                }
            } else if (requestType != 98) {
                eg0.B();
            } else {
                Toast.makeText(this.c, result.getResult().toString(), 0).show();
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(81, getString(R.string.set_mobile_recharge));
        super.onResume();
        ua0.e(k()).u(this);
        ViewPager viewPager = this.F;
        if (viewPager != null && viewPager.getAdapter() != null) {
            this.F.getAdapter().j();
        }
        if (qa0.v().C() != null && qa0.v().C().size() > 0) {
            I(qa0.v().C());
        } else {
            ua0.e(k()).q(new OliveRequest(81, 60, C0059ao.a(12183), true));
        }
        B();
        ArrayList<OperatorsLogos> D = qa0.v().D();
        if (D == null || D.size() == 0) {
            ua0.d().p(new OliveRequest(81, 61, null));
        }
        dg0 m = qa0.v().m();
        this.C = m;
        if (m == null) {
            return;
        }
        if (!TextUtils.isEmpty(m.b())) {
            this.n.setText(this.C.b());
        }
        if (!TextUtils.isEmpty(this.C.d())) {
            this.m.setText(this.C.d());
        }
        if (TextUtils.isEmpty(this.C.a())) {
            return;
        }
        this.o.setText(this.C.a());
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType == 50) {
            this.r = qa0.v().n();
        } else if (requestType == 56) {
            eg0.B();
        } else if (requestType == 98) {
            z();
        } else if (requestType == 60) {
            I(qa0.v().C());
        } else if (requestType != 61) {
            switch (requestType) {
                case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                    this.b.o(301, null);
                    ua0.e(k()).q(new OliveRequest(81, 60, C0059ao.a(12186), true));
                    String lastTransactionId = OliveUpiManager.getInstance(k()).getLastTransactionId();
                    this.D.setApprovalRefNo(result.getCode());
                    this.D.setResponseCode(result.getCode());
                    if (result.getData() != null) {
                        String obj = result.getData().toString();
                        this.D.setTransactionId(lastTransactionId);
                        this.D.setRefid(obj);
                    } else {
                        this.D.setTransactionId(lastTransactionId);
                    }
                    this.D.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(12187)));
                    this.D.setTransactionStatus(10);
                    this.D.setDescription(result.getResult());
                    qa0.v().u0(this.D);
                    n70.a aVar = n70.f;
                    n70 a2 = aVar.a();
                    n70 a3 = aVar.a();
                    String a4 = C0059ao.a(12188);
                    a2.v(a4, a3.j(a4) + 1);
                    aVar.a().y(C0059ao.a(12189), this.C.c());
                    aVar.a().x(C0059ao.a(12190), new Date().getTime());
                    aVar.a().A(C0059ao.a(12191), false);
                    eg0.B();
                    this.b.t(24, null);
                    return;
                case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                    eg0.B();
                    wc0 wc0Var = this.x;
                    if (wc0Var != null) {
                        wc0Var.H();
                        return;
                    }
                    return;
                case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                    PrefixMobile prefixMobile = (PrefixMobile) result.getData();
                    this.B = prefixMobile;
                    if (prefixMobile != null) {
                        this.t = true;
                        this.s = false;
                        if (this.l.getInputField().length() > 3) {
                            if (this.B.getCircle() != null) {
                                String circle = this.B.getCircle();
                                String a5 = C0059ao.a(12184);
                                if (circle.split(a5).length > 0) {
                                    this.n.setText(this.B.getCircle().split(a5)[1].trim());
                                }
                            }
                            this.m.setText(this.B.getOperator());
                        }
                        this.m.hideError();
                        return;
                    }
                    this.t = false;
                    FloatingInputLayout floatingInputLayout = this.n;
                    String a6 = C0059ao.a(12185);
                    floatingInputLayout.setText(a6);
                    this.m.setText(a6);
                    this.m.hideError();
                    if (this.s) {
                        A(this.l.getText().substring(0, 5));
                        this.s = false;
                        return;
                    }
                    return;
                case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                    return;
                default:
                    if (oliveRequest.getInitiator() == this.g) {
                        eg0.B();
                        return;
                    }
                    return;
            }
        } else {
            gf0 gf0Var = this.H;
            if (gf0Var != null) {
                gf0Var.x();
            }
        }
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        if (i != R.id.image) {
            if (i != R.id.recent_list) {
                return;
            }
            this.s = true;
            RecentBPTHistory recentBPTHistory = (RecentBPTHistory) obj;
            String mobn_subid = recentBPTHistory.getMobn_subid();
            this.l.setText(mobn_subid);
            this.o.setText(recentBPTHistory.getAmount());
            if (mobn_subid.length() > 4) {
                A(mobn_subid.substring(0, 4));
                return;
            }
            return;
        }
        Banner banner = (Banner) obj;
        na0 na0Var = new na0();
        na0Var.e(banner.getClickUrl());
        this.b.t(69, na0Var);
        HashMap hashMap = new HashMap();
        hashMap.put(C0059ao.a(12192), getString(R.string.mobile_rechargee));
        hashMap.put(C0059ao.a(12193), banner.getClickUrl());
        ah0.c(k(), C0059ao.a(12194), hashMap);
    }

    public final void x(Account account) {
        this.C = qa0.v().m();
        BeneVpa beneVpa = new BeneVpa();
        beneVpa.setVpa(TransportConstants.BILLPAY_UPIID);
        beneVpa.setName(C0059ao.a(12195));
        beneVpa.setNickname(C0059ao.a(12196));
        this.D.setAccount(account);
        this.D.setTransactionMode(TransactionData.MODE_SEND);
        this.D.setDirection(1);
        this.D.setBeneVpa(beneVpa);
        TransactionData transactionData = this.D;
        String a2 = C0059ao.a(12197);
        transactionData.setRefUrl(a2);
        this.D.setMcc(a2);
        this.D.setOrderId(a2);
        this.D.setAmount(Double.valueOf(this.C.a()));
        TransactionData transactionData2 = this.D;
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(12198));
        sb.append(this.C.c());
        String a3 = C0059ao.a(12199);
        sb.append(a3);
        sb.append(this.C.d());
        sb.append(a3);
        sb.append(this.C.b());
        sb.append(a3);
        sb.append(this.C.e());
        transactionData2.setRemarks(sb.toString());
        Hashtable hashtable = new Hashtable();
        hashtable.put(C0059ao.a(12200), this.C.c());
        hashtable.put(C0059ao.a(12201), this.C.d());
        hashtable.put(C0059ao.a(12202), this.C.b());
        hashtable.put(C0059ao.a(12203), this.C.a());
        hashtable.put(C0059ao.a(12204), this.C.e());
        this.D.setBillInfoString(jg0.f(hashtable));
        this.D.setBillpayKey(C0059ao.a(12205));
        eg0.i(k());
        OliveRequest oliveRequest = new OliveRequest(81, 510, this.D);
        oliveRequest.setClMode(7);
        ua0.d().q(oliveRequest);
    }

    public void y() {
        int i = this.E;
        String a2 = C0059ao.a(12206);
        if (!j(a2, i)) {
            if (this.f < 2) {
                q(a2);
                return;
            }
            return;
        }
        D();
    }

    public boolean z() {
        if (this.l.getText().length() < 10) {
            this.l.showError(getString(R.string.mobile_number_length_validation));
            return false;
        } else if (TextUtils.isEmpty(this.m.getText())) {
            this.m.showError(R.string.select_operator);
            return false;
        } else if (TextUtils.isEmpty(this.n.getText())) {
            this.n.showError(R.string.select_circle);
            return false;
        } else if (!TextUtils.isEmpty(this.o.getText()) && Double.parseDouble(this.o.getText().toString()) >= 1.0d) {
            if (this.r == null) {
                return false;
            }
            if (Double.parseDouble(this.o.getText().toString()) > Double.parseDouble(this.r.getMobilePrepaidMaxAmount())) {
                FloatingInputLayout floatingInputLayout = this.o;
                floatingInputLayout.showError(getString(R.string.mobile_max_amount_validation) + C0059ao.a(12207) + this.r.getMobilePrepaidMaxAmount());
                return false;
            }
            E();
            ArrayList<Account> h = qa0.v().h(qa0.c.ACTIVE_VPA);
            long time = new Date().getTime();
            n70.a aVar = n70.f;
            n70 a2 = aVar.a();
            String a3 = C0059ao.a(12208);
            int k = ((int) (((time - a2.k(a3)) / 1000) % 3600)) / 60;
            n70 a4 = aVar.a();
            String a5 = C0059ao.a(12209);
            if (a4.m(a5) != null && aVar.a().k(a3) != 0 && aVar.a().m(a5).equalsIgnoreCase(this.C.c()) && k <= 5) {
                eg0.m(k(), getString(R.string.time_interval));
                return false;
            }
            this.D = qa0.v().L();
            if (h != null) {
                if (h.size() > 1) {
                    this.b.t(80, C0059ao.a(12210));
                } else if (h.size() == 1) {
                    x(h.get(0));
                }
            } else {
                eg0.m(k(), getString(R.string.no_active_account));
            }
            return true;
        } else {
            this.o.showError(R.string.enter_amount);
            this.o.requestFocus();
            return false;
        }
    }
}
