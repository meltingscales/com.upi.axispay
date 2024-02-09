package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.MandateTransactionData;
import com.olive.upi.transport.model.MandatesVo;
import com.olive.upi.transport.model.ReqMandateTxn;
import com.olive.upi.transport.model.TransactionData;
import com.olive.upi.transport.model.UpdateMandate;
import com.olive.upi.transport.model.UpdateMandateRequest;
import com.upi.axispay.R;
import defpackage.n70;
import defpackage.qa0;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ne0  reason: default package */
/* loaded from: classes.dex */
public class ne0 extends xc0 implements ua0.e {
    public int l = 0;
    public ke0 m;
    public le0 n;
    public me0 o;
    public oe0 p;
    public j q;
    public View r;
    public TabLayout s;
    public ViewPager t;
    public ArrayList<MandatesVo> u;
    public MandateTransactionData v;

    /* compiled from: AxisPay */
    /* renamed from: ne0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a(ne0 ne0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ne0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            ne0.this.b.o(11, null);
            ne0 ne0Var = ne0.this;
            ne0Var.b.t(118, ne0Var.v.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ne0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            ne0.this.v.setTransactionId(null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ne0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            ne0.this.b.o(306, 1);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ne0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            ne0.this.b.o(11, null);
            ne0.this.b.t(21, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ne0$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            ne0.this.b.o(306, 1);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ne0$g */
    /* loaded from: classes.dex */
    public class g implements TabLayout.d {
        public g() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
            jg0.T(ne0.this.s, gVar.g(), 0);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
            jg0.T(ne0.this.s, gVar.g(), 1);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ne0$h */
    /* loaded from: classes.dex */
    public class h implements ViewPager.j {
        public h() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i) {
            ne0 ne0Var = ne0.this;
            ne0Var.l = i;
            ne0Var.B(i, ne0Var.u);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ne0$i */
    /* loaded from: classes.dex */
    public class i implements TabLayout.d {
        public i() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
            ne0.this.s.x(0).p(2131230806);
            ne0.this.s.x(1).p(R.drawable.icon_pending);
            ne0.this.s.x(2).p(R.drawable.completed_icon);
            ne0.this.s.x(3).p(R.drawable.cancelled);
            jg0.T(ne0.this.s, gVar.g(), 1);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ne0$j */
    /* loaded from: classes.dex */
    public class j extends ee {
        public final List<Fragment> h;
        public final List<String> i;

        public j(ne0 ne0Var, FragmentManager fragmentManager) {
            super(fragmentManager);
            this.h = new ArrayList();
            this.i = new ArrayList();
        }

        @Override // defpackage.no
        public int d() {
            return this.h.size();
        }

        @Override // defpackage.no
        public int e(Object obj) {
            return -2;
        }

        @Override // defpackage.no
        public CharSequence f(int i) {
            return this.i.get(i);
        }

        @Override // defpackage.ee
        public Fragment t(int i) {
            return this.h.get(i);
        }

        public void w(Fragment fragment, String str) {
            this.h.add(fragment);
            this.i.add(str);
        }
    }

    public static ne0 A() {
        return new ne0();
    }

    public final void B(int i2, ArrayList<MandatesVo> arrayList) {
        le0 le0Var;
        if (i2 == 0) {
            ke0 ke0Var = this.m;
            if (ke0Var != null) {
                ke0Var.B(qa0.v().A(qa0.d.ACTIVE, getContext()));
            }
        } else if (i2 == 1) {
            oe0 oe0Var = this.p;
            if (oe0Var != null) {
                oe0Var.C(qa0.v().A(qa0.d.PENDING, getContext()));
            }
        } else if (i2 != 2) {
            if (i2 == 3 && (le0Var = this.n) != null) {
                le0Var.z(qa0.v().A(qa0.d.CANCELLED, getContext()));
            }
        } else {
            me0 me0Var = this.o;
            if (me0Var != null) {
                me0Var.z(qa0.v().A(qa0.d.COMPLETED, getContext()));
            }
        }
    }

    public void C(ArrayList<MandatesVo> arrayList) {
        this.u = arrayList;
        D(this.t);
        this.s.x(0).p(2131230806);
        this.s.x(1).p(R.drawable.icon_pending);
        this.s.x(2).p(R.drawable.completed_icon);
        this.s.x(3).p(R.drawable.cancelled);
    }

    public final void D(ViewPager viewPager) {
        if (this.q == null) {
            this.q = new j(this, getChildFragmentManager());
        }
        if (this.m == null) {
            ke0 ke0Var = new ke0();
            this.m = ke0Var;
            ke0Var.y(qa0.v().A(qa0.d.ACTIVE, getContext()));
            t(this.m);
            this.q.w(this.m, C0059ao.a(14327));
        }
        if (this.p == null) {
            oe0 oe0Var = new oe0();
            this.p = oe0Var;
            oe0Var.z(qa0.v().A(qa0.d.PENDING, getContext()));
            t(this.p);
            this.q.w(this.p, C0059ao.a(14328));
        }
        if (this.o == null) {
            me0 me0Var = new me0();
            this.o = me0Var;
            me0Var.x(qa0.v().A(qa0.d.COMPLETED, getContext()));
            t(this.o);
            this.q.w(this.o, C0059ao.a(14329));
        }
        if (this.n == null) {
            le0 le0Var = new le0();
            this.n = le0Var;
            le0Var.x(qa0.v().A(qa0.d.CANCELLED, getContext()));
            t(this.n);
            this.q.w(this.n, C0059ao.a(14330));
        }
        viewPager.setAdapter(this.q);
        B(this.l, null);
        viewPager.setCurrentItem(this.l, true);
        this.s.K(viewPager, true);
        this.s.d(new g());
        viewPager.addOnPageChangeListener(new h());
        this.s.d(new i());
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i2, Object obj) {
        if (i2 == 76) {
            eg0.i(k());
            UpdateMandateRequest updateMandateRequest = new UpdateMandateRequest();
            n70.a aVar = n70.f;
            updateMandateRequest.setAppId(aVar.a().m(C0059ao.a(14331)));
            updateMandateRequest.setCustomerId(aVar.a().m(C0059ao.a(14332)));
            updateMandateRequest.setUpdateMandate((UpdateMandate) obj);
            ua0.d().q(new OliveRequest(113, 76, updateMandateRequest));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.r = layoutInflater.inflate(R.layout.fragment_my_mandates, viewGroup, false);
        this.v = qa0.v().z();
        this.t = (ViewPager) this.r.findViewById(R.id.viewpager);
        this.s = (TabLayout) this.r.findViewById(R.id.tabs);
        return this.r;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        if (n(oliveRequest, result)) {
            return;
        }
        int requestType = oliveRequest.getRequestType();
        String a2 = C0059ao.a(14333);
        String a3 = C0059ao.a(14334);
        String a4 = C0059ao.a(14335);
        if (requestType != 76) {
            if (requestType == 78) {
                C(qa0.v().y());
                B(this.l, this.u);
            } else if (requestType == 82) {
                String code = result.getCode();
                if (code.equals(C0059ao.a(14336))) {
                    this.v.setTransactionStatus(10);
                    this.v.setRefid((String) result.getData());
                    MandateTransactionData mandateTransactionData = this.v;
                    if (!TextUtils.isEmpty(mandateTransactionData.getUmnID())) {
                        a4 = this.v.getUmnID();
                    }
                    mandateTransactionData.setUmnID(a4);
                    qa0.v().h0(this.v);
                    this.b.t(110, null);
                } else if (code.equals(C0059ao.a(14337))) {
                    eg0.o(k(), a3, result.getResult().toString(), a2, new a(this));
                } else {
                    this.v.setTransactionStatus(1);
                    this.v.setRefid((String) result.getData());
                    this.v.setResult(result.getResult());
                    MandateTransactionData mandateTransactionData2 = this.v;
                    if (!TextUtils.isEmpty(mandateTransactionData2.getUmnID())) {
                        a4 = this.v.getUmnID();
                    }
                    mandateTransactionData2.setUmnID(a4);
                    qa0.v().h0(this.v);
                    this.b.t(110, null);
                }
            }
        } else if (result.getCode().equals(C0059ao.a(14338))) {
            eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.fail_text), C0059ao.a(14339).toUpperCase(), new b(), C0059ao.a(14340).toUpperCase(), new c(), true);
            return;
        } else if (result.getCode().equals(C0059ao.a(14341))) {
            eg0.B();
            eg0.o(k(), a3, C0059ao.a(14342), a2, new d());
            return;
        } else if (result.getCode().equals(C0059ao.a(14343))) {
            eg0.B();
            eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.insufficient_text), C0059ao.a(14344).toUpperCase(), new e(), C0059ao.a(14345), new f(), true);
            return;
        } else {
            this.v.setTransactionStatus(1);
            this.v.setTransactionMode(TransactionData.MODE_REVOKE_MANDATE);
            this.v.setRefid((String) result.getData());
            MandateTransactionData mandateTransactionData3 = this.v;
            if (!TextUtils.isEmpty(mandateTransactionData3.getUmnID())) {
                a4 = this.v.getUmnID();
            }
            mandateTransactionData3.setUmnID(a4);
            this.v.setResult(result.getResult());
            qa0.v().h0(this.v);
            this.b.t(110, null);
        }
        Toast.makeText(k(), result.getResult(), 0).show();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.b.o(90, new tg0(getString(R.string.my_mandates), false, true, true, false));
        ua0.e(k()).u(this);
        v(113, getString(R.string.my_mandates));
        qa0.v().y();
        eg0.i(k());
        ReqMandateTxn reqMandateTxn = new ReqMandateTxn();
        n70.a aVar = n70.f;
        reqMandateTxn.setCustomerid(aVar.a().m(C0059ao.a(14346)));
        reqMandateTxn.setTimestamp(jg0.x(new Date(), C0059ao.a(14347)));
        reqMandateTxn.setPageSize(C0059ao.a(14348));
        reqMandateTxn.setAppid(aVar.a().m(C0059ao.a(14349)));
        eg0.i(k());
        ua0.d().q(new OliveRequest(113, 78, reqMandateTxn));
        B(this.l, qa0.v().y());
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        int requestType = oliveRequest.getRequestType();
        String a2 = C0059ao.a(14350);
        String a3 = C0059ao.a(14351);
        if (requestType == 76) {
            if (result.getCode().equals(a3)) {
                this.v.setTransactionMode(TransactionData.MODE_REVOKE_MANDATE);
                String str = C0059ao.a(14353) + this.v.getTransactionMode();
                this.v.setTransactionStatus(10);
                this.v.setRefid((String) result.getData());
                MandateTransactionData mandateTransactionData = this.v;
                if (!TextUtils.isEmpty(mandateTransactionData.getUmnID())) {
                    a2 = this.v.getUmnID();
                }
                mandateTransactionData.setUmnID(a2);
                qa0.v().h0(this.v);
                this.b.t(110, null);
            }
        } else if (requestType == 78) {
            if (result.getCode().equals(a3)) {
                this.u = (ArrayList) result.getData();
                qa0.v().g0(this.u);
                C(qa0.v().y());
                B(this.l, this.u);
            }
        } else if (requestType != 82) {
            if (requestType != 83) {
                return;
            }
            eg0.B();
            try {
                this.m.z(new String(Base64.decode(result.getData().toString(), 2), C0059ao.a(14352)));
            } catch (Exception unused) {
            }
        } else if (result.getCode().equals(a3)) {
            this.v.setTransactionStatus(10);
            this.v.setRefid((String) result.getData());
            MandateTransactionData mandateTransactionData2 = this.v;
            if (!TextUtils.isEmpty(mandateTransactionData2.getUmnID())) {
                a2 = this.v.getUmnID();
            }
            mandateTransactionData2.setUmnID(a2);
            qa0.v().h0(this.v);
            this.b.t(110, null);
        }
    }
}
