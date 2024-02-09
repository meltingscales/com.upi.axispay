package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.RechargePlanParam;
import com.olive.upi.transport.model.Rechargeplan;
import com.olive.upi.transport.model.Rechargetype;
import com.upi.axispay.R;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: hf0  reason: default package */
/* loaded from: classes.dex */
public class hf0 extends xc0 implements View.OnClickListener, ua0.e {
    public static dg0 u;
    public Rechargeplan l;
    public int m = 0;
    public ArrayList<Rechargetype> n = null;
    public b o;
    public View p;
    public TabLayout q;
    public ViewPager r;
    public LinearLayout s;
    public Button t;

    /* compiled from: AxisPay */
    /* renamed from: hf0$a */
    /* loaded from: classes.dex */
    public class a implements ViewPager.j {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i) {
            hf0 hf0Var = hf0.this;
            hf0Var.m = i;
            hf0Var.F(i);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: hf0$b */
    /* loaded from: classes.dex */
    public class b extends he {
        public List<Fragment> j;
        public List<String> k;

        public b(hf0 hf0Var, FragmentManager fragmentManager) {
            super(fragmentManager);
            this.j = new ArrayList();
            this.k = new ArrayList();
        }

        @Override // defpackage.no
        public int d() {
            List<Fragment> list = this.j;
            if (list != null) {
                return list.size();
            }
            return 0;
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
            List<Fragment> list = this.j;
            if (list == null || i >= list.size()) {
                return null;
            }
            return this.j.get(i);
        }

        public void u(Fragment fragment, String str) {
            this.j.add(fragment);
            this.k.add(str);
        }
    }

    public static hf0 z(dg0 dg0Var) {
        u = dg0Var;
        return new hf0();
    }

    public void A(Rechargeplan rechargeplan) {
        this.l = rechargeplan;
        D(this.r);
        this.q.setupWithViewPager(this.r);
    }

    public final void B() {
        this.r = (ViewPager) this.p.findViewById(R.id.pager_list);
        this.q = (TabLayout) this.p.findViewById(R.id.pager_tab);
        this.s = (LinearLayout) this.p.findViewById(R.id.layout_nodata);
        TextView textView = (TextView) this.p.findViewById(R.id.empty_view);
        this.t = (Button) this.p.findViewById(R.id.retry);
    }

    public final void C() {
        this.t.setOnClickListener(this);
    }

    public final void D(ViewPager viewPager) {
        if (this.o == null) {
            this.o = new b(this, getChildFragmentManager());
        }
        if (!this.h) {
            F(this.m);
        } else {
            Rechargeplan rechargeplan = this.l;
            if (rechargeplan != null && rechargeplan.getCircle() != null) {
                ArrayList<Rechargetype> rechargetype = this.l.getCircle().getRechargetype();
                this.n = rechargetype;
                if (rechargetype == null) {
                    E(false);
                    return;
                }
                E(true);
                Iterator<Rechargetype> it = this.n.iterator();
                while (it.hasNext()) {
                    Rechargetype next = it.next();
                    bf0 bf0Var = new bf0();
                    bf0Var.x(next.getRecharge());
                    String title = next.getTitle();
                    if (TextUtils.isEmpty(title)) {
                        title = next.getName();
                    }
                    this.o.u(bf0Var, title);
                }
                viewPager.setAdapter(this.o);
                F(this.m);
            } else {
                E(false);
                return;
            }
        }
        viewPager.addOnPageChangeListener(new a());
        this.h = false;
    }

    public final void E(boolean z) {
        if (z) {
            this.r.setVisibility(0);
            this.q.setVisibility(0);
            this.s.setVisibility(8);
            return;
        }
        this.r.setVisibility(8);
        this.q.setVisibility(8);
        this.s.setVisibility(0);
    }

    public final void F(int i) {
        ArrayList<Rechargetype> arrayList;
        bf0 bf0Var = (bf0) this.o.t(i);
        if (bf0Var == null || (arrayList = this.n) == null || arrayList.size() <= i) {
            return;
        }
        bf0Var.x(this.n.get(i).getRecharge());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.retry) {
            return;
        }
        y();
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.p = layoutInflater.inflate(R.layout.fragment_plan_tabs, viewGroup, false);
        B();
        C();
        return this.p;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        n(oliveRequest, result);
        eg0.B();
        this.h = true;
        E(false);
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ua0.e(k()).u(this);
        u(83);
        String e = u.e();
        e.hashCode();
        if (e.equals(C0059ao.a(261))) {
            this.b.o(90, new tg0(getString(R.string.dth_plans), false, false, false, false));
        } else if (e.equals(C0059ao.a(262))) {
            this.b.o(90, new tg0(getString(R.string.mobile_plans), false, false, false, false));
        }
        if (this.l == null) {
            y();
        }
        A(this.l);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        String code = result.getCode();
        if (oliveRequest.getRequestType() != 55) {
            eg0.B();
            return;
        }
        eg0.B();
        if (code != null && code.equals(C0059ao.a(263))) {
            Rechargeplan rechargeplan = (Rechargeplan) result.getData();
            this.l = rechargeplan;
            if (rechargeplan != null) {
                E(true);
                A(this.l);
                return;
            }
            E(false);
            return;
        }
        E(false);
    }

    public final void y() {
        String e = u.e();
        e.hashCode();
        String a2 = C0059ao.a(264);
        if (e.equals(a2)) {
            eg0.i(k());
            ua0.e(k()).q(new OliveRequest(83, 55, new RechargePlanParam(a2, u.f(), u.d(), C0059ao.a(267))));
        } else if (e.equals(C0059ao.a(265))) {
            eg0.i(k());
            ua0.e(k()).q(new OliveRequest(83, 55, new RechargePlanParam(C0059ao.a(266), u.c(), u.d(), u.b())));
        }
    }
}
