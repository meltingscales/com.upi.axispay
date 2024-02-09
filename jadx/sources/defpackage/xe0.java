package defpackage;

import android.app.Dialog;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v4.media.session.IMediaSession;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.material.tabs.TabLayout;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.OliveUpiManager;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.AuthorizeMandateRequest;
import com.olive.upi.transport.model.BannerOffersVo;
import com.olive.upi.transport.model.GetMandate;
import com.olive.upi.transport.model.Inbox;
import com.olive.upi.transport.model.MandateTransactionData;
import com.olive.upi.transport.model.PayRequest;
import com.olive.upi.transport.model.PendingMandateReqVo;
import com.olive.upi.transport.model.PendingReqVo;
import com.olive.upi.transport.model.RecurrenceAuthorization;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.activity.MainActivity;
import defpackage.n70;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: xe0  reason: default package */
/* loaded from: classes.dex */
public class xe0 extends xc0 implements ua0.e, og0 {
    public String l = C0059ao.a(2989);
    public TabLayout m;
    public j n;
    public ye0 o;
    public af0 p;
    public qd0 q;
    public ze0 r;
    public TransactionData s;
    public MandateTransactionData t;
    public ArrayList<PendingReqVo> u;
    public ArrayList<BannerOffersVo> v;
    public int w;

    /* compiled from: AxisPay */
    /* renamed from: xe0$a */
    /* loaded from: classes.dex */
    public class a implements TabLayout.d {
        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
            jg0.T(xe0.this.m, gVar.g(), 0);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
            jg0.T(xe0.this.m, gVar.g(), 1);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xe0$b */
    /* loaded from: classes.dex */
    public class b implements ViewPager.j {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i) {
            xe0 xe0Var = xe0.this;
            xe0Var.w = i;
            xe0Var.I(i);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xe0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c(xe0 xe0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xe0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d(xe0 xe0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xe0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public final /* synthetic */ Dialog b;

        public e(Dialog dialog) {
            this.b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            GetMandate getMandate = new GetMandate();
            n70.a aVar = n70.f;
            getMandate.setCustomerid(aVar.a().m(C0059ao.a(2908)));
            getMandate.setUmn(c70.k());
            getMandate.setTxnid(c70.j());
            getMandate.setAppid(aVar.a().m(C0059ao.a(2909)));
            eg0.i(xe0.this.getActivity());
            ua0.d().q(new OliveRequest(71, 75, getMandate));
            this.b.hide();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xe0$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public final /* synthetic */ Dialog b;

        public f(xe0 xe0Var, Dialog dialog) {
            this.b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            this.b.hide();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xe0$g */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            xe0.this.b.o(11, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xe0$h */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            xe0.this.b.o(11, null);
            xe0 xe0Var = xe0.this;
            xe0Var.b.t(118, xe0Var.s.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xe0$i */
    /* loaded from: classes.dex */
    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            xe0.this.b.o(11, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xe0$j */
    /* loaded from: classes.dex */
    public class j extends he {
        public final List<Fragment> j;
        public final List<String> k;

        public j(xe0 xe0Var, FragmentManager fragmentManager) {
            super(fragmentManager);
            this.j = new ArrayList();
            this.k = new ArrayList();
        }

        @Override // defpackage.no
        public int d() {
            return this.j.size();
        }

        @Override // defpackage.no
        public int e(Object obj) {
            return -2;
        }

        @Override // defpackage.no
        public CharSequence f(int i) {
            return this.k.get(i);
        }

        @Override // defpackage.he
        public Fragment t(int i) {
            return this.j.get(i);
        }

        public void u(Fragment fragment, String str) {
            this.j.add(fragment);
            this.k.add(str);
        }
    }

    public xe0() {
        new HashSet();
        this.u = new ArrayList<>();
    }

    public static xe0 A() {
        return new xe0();
    }

    public void B(ArrayList<PendingReqVo> arrayList) {
        this.u = arrayList;
    }

    public void C(int i2) {
        this.w = i2;
    }

    public final void D(ViewPager viewPager) {
        if (this.n == null) {
            this.n = new j(this, getChildFragmentManager());
        }
        if (this.p == null) {
            af0 B = af0.B(this.u);
            this.p = B;
            B.E(this);
            this.p.D(0);
            t(this.p);
            this.n.u(this.p, getString(R.string.pending_requests));
        }
        if (this.q == null) {
            qd0 B2 = qd0.B();
            this.q = B2;
            B2.C(this);
            t(this.q);
            this.n.u(this.q, getString(R.string.inbox));
        }
        if (this.o == null) {
            ye0 y = ye0.y();
            this.o = y;
            y.z(this);
            this.o.A(this.v);
            t(this.o);
            this.n.u(this.o, getString(R.string.offers));
        }
        if (this.r == null) {
            ze0 D = ze0.D();
            this.r = D;
            D.F(this);
            t(this.r);
            this.n.u(this.r, C0059ao.a(2990));
        }
        viewPager.setAdapter(this.n);
        if (this.s.isThroughNotificationCrossSell()) {
            this.w = 2;
        }
        viewPager.setCurrentItem(this.w, true);
        I(this.w);
        this.m.K(viewPager, true);
        this.m.d(new a());
        viewPager.addOnPageChangeListener(new b());
    }

    public void E(ArrayList<BannerOffersVo> arrayList) {
        this.o.A(arrayList);
    }

    public void F(ArrayList<Inbox> arrayList) {
        this.q.x(arrayList);
    }

    public void G(ArrayList<PendingMandateReqVo> arrayList) {
        this.r.H(arrayList);
    }

    public void H(ArrayList<PendingReqVo> arrayList) {
        this.u = arrayList;
        this.p.H(arrayList);
        qa0.v().q0(this.u, getContext());
        this.b.o(10, null);
    }

    public final void I(int i2) {
        if (i2 == 0) {
            getString(R.string.pending_request);
            this.b.o(90, new tg0(getString(R.string.pending_requests), false, true, false, false));
            this.p.G(true);
            ua0.d().q(new OliveRequest(71, 27, null));
        } else if (i2 == 1) {
            this.b.o(90, new tg0(C0059ao.a(2994), false, true, false, false));
            ua0.d().q(new OliveRequest(71, 72, null));
        } else if (i2 == 2) {
            this.b.o(90, new tg0(getString(R.string.promotional_offers), false, true, false, false));
            ua0.d().q(new OliveRequest(71, 85, null));
        } else if (i2 != 3) {
        } else {
            this.b.o(90, new tg0(C0059ao.a(2991), false, true, false, false));
            GetMandate getMandate = new GetMandate();
            n70.a aVar = n70.f;
            getMandate.setCustomerid(aVar.a().m(C0059ao.a(2992)));
            getMandate.setUmn(c70.k());
            getMandate.setTxnid(c70.j());
            getMandate.setAppid(aVar.a().m(C0059ao.a(2993)));
            ua0.e(k()).u(this);
            eg0.i(k());
            ua0.d().q(new OliveRequest(71, 75, getMandate));
        }
    }

    @Override // defpackage.og0
    public void i(int i2) {
        I(i2);
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i2, Object obj) {
        if (i2 == 24) {
            eg0.i(getActivity());
            ua0.e(k()).q(new OliveRequest(71, 24, obj));
            return;
        }
        String a2 = C0059ao.a(2995);
        if (i2 != 77) {
            if (i2 != 92) {
                return;
            }
            PayRequest payRequest = (PayRequest) obj;
            new RecurrenceAuthorization();
            RecurrenceAuthorization recurrenceAuthorization = new RecurrenceAuthorization();
            recurrenceAuthorization.setTxnid(payRequest.getTxnId());
            recurrenceAuthorization.setAction(a2);
            recurrenceAuthorization.setPayervpa(payRequest.getAc().getVpa());
            recurrenceAuthorization.setPayeevpa(payRequest.getPayees().get(0).getBeneVpa());
            recurrenceAuthorization.setCred(payRequest.getCred());
            recurrenceAuthorization.setUmn(this.s.getUmn());
            eg0.i(getActivity());
            ua0.d().q(new OliveRequest(113, 92, recurrenceAuthorization));
            return;
        }
        PayRequest payRequest2 = (PayRequest) obj;
        AuthorizeMandateRequest authorizeMandateRequest = new AuthorizeMandateRequest();
        eg0.i(getActivity());
        authorizeMandateRequest.setCustomerid(payRequest2.getCustomerId());
        authorizeMandateRequest.setTxnid(payRequest2.getTxnId());
        if (this.t.getUmnID() != null && !TextUtils.isEmpty(this.t.getUmnID())) {
            authorizeMandateRequest.setUmn(this.t.getUmnID());
        } else {
            authorizeMandateRequest.setUmn(c70.k());
        }
        authorizeMandateRequest.setDevice(payRequest2.getDevice());
        authorizeMandateRequest.setAction(a2);
        authorizeMandateRequest.setAccount(payRequest2.getAc());
        authorizeMandateRequest.setCreds(payRequest2.getCred());
        eg0.i(getActivity());
        ua0.d().q(new OliveRequest(129, 77, authorizeMandateRequest));
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.v = new ArrayList<>();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_notification_tab, viewGroup, false);
        this.s = qa0.v().L();
        this.t = qa0.v().z();
        this.m = (TabLayout) inflate.findViewById(R.id.tabs);
        ua0.e(k()).u(this);
        D((ViewPager) inflate.findViewById(R.id.viewpager));
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            String code = result != null ? result.getCode() : C0059ao.a(2996);
            int requestType = oliveRequest.getRequestType();
            if (requestType != 10 && requestType != 24) {
                if (requestType != 27) {
                    eg0.B();
                    return;
                }
                eg0.B();
                this.p.F();
                return;
            }
            this.b.o(301, null);
            TransactionData L = qa0.v().L();
            this.s = L;
            if (!TextUtils.isEmpty(L.getRemitterVpa())) {
                this.s.getAccount().setVpa(this.s.getRemitterVpa().toLowerCase());
            }
            if (code.equals(C0059ao.a(2997))) {
                if (oliveRequest.getRequestType() == 24) {
                    eg0.o(k(), getString(R.string.alert), getString(R.string.transaction_failed_wrong_pin), getString(R.string.okay), new g());
                    return;
                } else {
                    eg0.m(k(), getString(R.string.transaction_failed_wrong_pin));
                    return;
                }
            } else if (code.equals(C0059ao.a(2998))) {
                eg0.o(k(), getString(R.string.alert), getString(R.string.transaction_failed_max_retry), getString(R.string.okay), new h());
                return;
            } else if (code.equals(C0059ao.a(2999))) {
                if (oliveRequest.getRequestType() == 24) {
                    eg0.q(k(), getString(R.string.alert), result.getResult(), getString(R.string.okay), new i(), true);
                    return;
                } else {
                    eg0.m(k(), result.getResult());
                    return;
                }
            } else {
                String lastTransactionId = OliveUpiManager.getInstance(k()).getLastTransactionId();
                this.s.setTransactionId(lastTransactionId);
                this.s.setRefid(lastTransactionId);
                if (result.getData() != null) {
                    this.s.setApprovalRefNo(result.getData().toString());
                }
                this.s.setTransactionId(lastTransactionId);
                this.s.setResponseCode(code);
                this.s.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(3000)));
                this.s.setTransactionStatus(1);
                this.s.setDescription(result.getResult());
                qa0.v().u0(this.s);
                if (this.b == null) {
                    this.b = (MainActivity) k();
                }
                this.b.t(24, this.s);
                return;
            }
        }
        if (oliveRequest.getRequestType() == 27) {
            this.p.F();
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        this.s = qa0.v().L();
        this.t = qa0.v().z();
        v(71, getString(R.string.notifications));
        super.onResume();
        ua0.e(k()).u(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        NotificationManager notificationManager;
        int requestType = oliveRequest.getRequestType();
        String a2 = C0059ao.a(3001);
        switch (requestType) {
            case -100:
                if (TextUtils.isEmpty(((MainActivity) k()).q0())) {
                    return;
                }
                n70.f.a().v(C0059ao.a(3012), 3);
                return;
            case 10:
            case 24:
                ua0.d().q(new OliveRequest(71, 27, null));
                this.s = qa0.v().L();
                String lastTransactionId = OliveUpiManager.getInstance(k()).getLastTransactionId();
                this.s.setApprovalRefNo(result.getCode());
                this.s.setResponseCode(result.getCode());
                String str = (String) result.getData();
                this.s.setTransactionId(lastTransactionId);
                if (result.getData() != null && !TextUtils.isEmpty(str)) {
                    this.s.setRefid(str);
                }
                this.s.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(3005)));
                this.s.setTransactionStatus(10);
                this.s.setDescription(result.getResult());
                qa0.v().u0(this.s);
                n70.a aVar = n70.f;
                n70 a3 = aVar.a();
                n70 a4 = aVar.a();
                String a5 = C0059ao.a(3006);
                a3.v(a5, a4.j(a5));
                aVar.a().A(C0059ao.a(3007), false);
                eg0.B();
                HashMap hashMap = new HashMap();
                hashMap.put(C0059ao.a(3008), getString(R.string.pending_request));
                hashMap.put(C0059ao.a(3009), jg0.l(this.s.getAmount()));
                Account account = this.s.getAccount();
                if (account != null) {
                    hashMap.put(C0059ao.a(3010), jg0.n(account.getBankName()));
                }
                z k = k();
                String a6 = C0059ao.a(3011);
                ah0.d(k, a6, hashMap, true);
                Product product = new Product();
                product.setName(a6);
                product.setPrice(this.s.getAmount().doubleValue());
                product.setId(this.s.getRefid());
                if (account != null) {
                    product.setBrand(account.getBankName());
                }
                this.b.o(301, null);
                ah0.e(k(), a6, product, hashMap);
                if (oliveRequest.getRequestType() == 24 && (notificationManager = (NotificationManager) k().getSystemService(a2)) != null) {
                    notificationManager.cancelAll();
                }
                if (!TextUtils.isEmpty(this.s.getRemitterVpa())) {
                    this.s.getAccount().setVpa(this.s.getRemitterVpa().toLowerCase());
                }
                this.b.t(24, this.s);
                return;
            case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                eg0.B();
                this.p.G(false);
                H((ArrayList) result.getData());
                return;
            case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                eg0.B();
                this.b.o(301, null);
                eg0.n(k(), getString(R.string.notification_reject_success), new c(this));
                H((ArrayList) result.getData());
                return;
            case 52:
                eg0.B();
                this.b.o(301, null);
                eg0.n(k(), getString(R.string.decline_and_block), new d(this));
                ua0.d().a(true, new OliveRequest(71, 53, null, true));
                ua0.d().q(new OliveRequest(71, 27, null));
                NotificationManager notificationManager2 = (NotificationManager) k().getSystemService(a2);
                if (notificationManager2 != null) {
                    notificationManager2.cancelAll();
                    return;
                }
                return;
            case 72:
                eg0.B();
                F((ArrayList) result.getData());
                return;
            case 75:
                eg0.B();
                G((ArrayList) result.getData());
                return;
            case 77:
                eg0.B();
                if (result.getResult().equalsIgnoreCase(C0059ao.a(3002))) {
                    eg0.B();
                    z(R.drawable.cancelled, getString(R.string.the_mandate_request_has_been_n_declined));
                    break;
                } else if (result.getResult().equalsIgnoreCase(C0059ao.a(3003))) {
                    eg0.B();
                    z(R.drawable.cancelled, getString(R.string.the_mandate_request_has_been_n_blocked));
                    break;
                } else {
                    eg0.B();
                    z(R.drawable.mandate_success, C0059ao.a(3004));
                    break;
                }
            case 81:
                break;
            case 85:
                eg0.B();
                ArrayList<BannerOffersVo> arrayList = (ArrayList) result.getData();
                qa0.v().S(arrayList);
                E(arrayList);
                return;
            default:
                if (this.g == oliveRequest.getInitiator()) {
                    eg0.B();
                    return;
                }
                return;
        }
        eg0.B();
        ua0.d().q(new OliveRequest(71, 72, null));
    }

    public void z(int i2, String str) {
        Dialog dialog = new Dialog(getActivity(), R.style.Theme_Dialog);
        dialog.getWindow().requestFeature(1);
        dialog.setContentView(R.layout.dialog_mandate_reuest_success);
        dialog.getWindow().setLayout(-1, -2);
        Button button = (Button) dialog.findViewById(R.id.button_ok);
        ((TextView) dialog.findViewById(R.id.dialog_message)).setText(str);
        ((ImageView) dialog.findViewById(R.id.dialog_icon)).setImageResource(i2);
        button.setText(getString(R.string.ok_text));
        dialog.setCancelable(true);
        dialog.show();
        button.setOnClickListener(new e(dialog));
        ((ImageView) dialog.findViewById(R.id.dialog_close)).setOnClickListener(new f(this, dialog));
    }
}
