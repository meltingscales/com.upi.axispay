package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.Collectbeneblock;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import defpackage.qa0;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: yc0  reason: default package */
/* loaded from: classes.dex */
public class yc0 extends xc0 implements gd0, ua0.e {
    public static ma0 A;
    public BeneVpa m;
    public Collectbeneblock n;
    public c r;
    public TransactionData s;
    public tc0 t;
    public tc0 u;
    public dd0 v;
    public int w;
    public tc0 x;
    public TabLayout y;
    public ViewPager z;
    public Integer[] l = {2131231393, 2131231183, 2131230849, Integer.valueOf((int) R.drawable.favorate)};
    public int o = 0;
    public ArrayList<BeneVpa> p = new ArrayList<>();
    public ArrayList<Collectbeneblock> q = new ArrayList<>();

    /* compiled from: AxisPay */
    /* renamed from: yc0$a */
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
            yc0 yc0Var = yc0.this;
            yc0Var.o = i;
            yc0Var.C(i, yc0Var.p);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yc0$b */
    /* loaded from: classes.dex */
    public class b implements TabLayout.d {
        public b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
            yc0.this.y.x(0).p(yc0.this.l[0].intValue());
            yc0.this.y.x(1).p(yc0.this.l[1].intValue());
            yc0.this.y.x(2).p(yc0.this.l[2].intValue());
            yc0.this.y.x(3).p(yc0.this.l[3].intValue());
            jg0.T(yc0.this.y, gVar.g(), 1);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yc0$c */
    /* loaded from: classes.dex */
    public class c extends he {
        public final List<Fragment> j;
        public final List<String> k;

        public c(FragmentManager fragmentManager) {
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
            return new ArrayList(yc0.this.getFragmentManager().v0()).contains((Fragment) obj) ? -2 : -1;
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

    public yc0() {
        new SparseArray();
    }

    public static yc0 B(ma0 ma0Var) {
        ma0Var.b();
        ma0Var.a();
        A = ma0Var;
        return new yc0();
    }

    public final void C(int i, ArrayList<BeneVpa> arrayList) {
        tc0 tc0Var;
        if (i == 0) {
            tc0 tc0Var2 = this.t;
            if (tc0Var2 != null) {
                tc0Var2.H(qa0.v().N(qa0.e.VPA), 1);
            }
        } else if (i == 1) {
            tc0 tc0Var3 = this.x;
            if (tc0Var3 != null) {
                tc0Var3.H(qa0.v().N(qa0.e.IFSC), 2);
            }
        } else if (i != 2) {
            if (i == 3 && (tc0Var = this.u) != null) {
                tc0Var.H(z(arrayList), 0);
            }
        } else {
            dd0 dd0Var = this.v;
            if (dd0Var != null) {
                dd0Var.E();
            }
        }
    }

    public void D(ArrayList<BeneVpa> arrayList) {
        this.p = arrayList;
        E(this.z);
        this.y.x(0).p(this.l[0].intValue());
        this.y.x(1).p(this.l[1].intValue());
        this.y.x(2).p(this.l[2].intValue());
        this.y.x(3).p(this.l[3].intValue());
    }

    public final void E(ViewPager viewPager) {
        if (this.r == null) {
            this.r = new c(getChildFragmentManager());
        }
        tc0 tc0Var = this.t;
        if (tc0Var == null) {
            tc0 tc0Var2 = new tc0();
            this.t = tc0Var2;
            tc0Var2.E(A);
            this.t.C(qa0.v().N(qa0.e.VPA), 1);
            this.t.F(false);
            t(this.t);
            this.r.u(this.t, C0059ao.a(12729));
        } else {
            tc0Var.C(qa0.v().N(qa0.e.VPA), 1);
        }
        tc0 tc0Var3 = this.x;
        if (tc0Var3 == null) {
            tc0 tc0Var4 = new tc0();
            this.x = tc0Var4;
            tc0Var4.E(A);
            this.x.C(qa0.v().N(qa0.e.IFSC), 2);
            t(this.x);
            this.r.u(this.x, C0059ao.a(12730));
        } else {
            tc0Var3.C(qa0.v().N(qa0.e.IFSC), 2);
        }
        dd0 dd0Var = this.v;
        if (dd0Var == null) {
            dd0 dd0Var2 = new dd0();
            this.v = dd0Var2;
            dd0Var2.C(A);
            this.v.A(this.q);
            t(this.v);
            this.r.u(this.v, getString(R.string.blocked));
        } else {
            dd0Var.A(this.q);
        }
        tc0 tc0Var5 = this.u;
        if (tc0Var5 == null) {
            tc0 tc0Var6 = new tc0();
            this.u = tc0Var6;
            tc0Var6.E(A);
            this.u.C(z(this.p), 0);
            this.u.F(true);
            t(this.u);
            this.r.u(this.u, getString(R.string.favourites));
        } else {
            tc0Var5.C(z(this.p), 0);
        }
        this.t.D(this);
        this.x.D(this);
        this.v.B(this);
        this.u.D(this);
        viewPager.setAdapter(this.r);
        viewPager.setCurrentItem(this.o);
        this.y.K(viewPager, true);
        this.y.x(this.o).l();
        viewPager.addOnPageChangeListener(new a());
        this.y.d(new b());
    }

    public void F() {
        eg0.o(k(), getString(R.string.unblock), getString(R.string.successfully_unblocked), getString(R.string.okay), new View.OnClickListener() { // from class: hb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eg0.c();
            }
        });
    }

    @Override // defpackage.gd0
    public void g(int i, Object obj, int i2) {
        this.w = i2;
        if (i != 1) {
            this.m = (BeneVpa) obj;
        } else {
            this.n = (Collectbeneblock) obj;
        }
    }

    @Override // defpackage.gd0
    public void h() {
        eg0.i(k());
        ua0.d().j(false, new OliveRequest(17, 18, null));
        ArrayList<Collectbeneblock> q = qa0.v().q();
        if (q == null || q.size() == 0) {
            ua0.d().a(false, new OliveRequest(17, 53, null, true));
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_beneficiary, viewGroup, false);
        ua0.e(k()).u(this);
        TransactionData L = qa0.v().L();
        this.s = L;
        L.getTransactionMode();
        this.z = (ViewPager) inflate.findViewById(R.id.viewpager);
        this.y = (TabLayout) inflate.findViewById(R.id.tabs);
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            eg0.A(k(), result.getResult());
            int requestType = oliveRequest.getRequestType();
            if (requestType == 17) {
                boolean isEmpty = TextUtils.isEmpty(this.m.getFavorite());
                String a2 = C0059ao.a(12731);
                if (!isEmpty && this.m.getFavorite().contentEquals(a2)) {
                    this.m.setFavorite(C0059ao.a(12732));
                } else {
                    this.m.setFavorite(a2);
                }
                Iterator<BeneVpa> it = this.p.iterator();
                while (it.hasNext()) {
                    BeneVpa next = it.next();
                    if (next.getVpa().equals(this.m.getVpa())) {
                        next.setFavorite(this.m.getFavorite());
                    }
                }
                eg0.B();
                qa0.v().z0(this.p);
                C(this.o, this.p);
            } else if (requestType != 18) {
                eg0.B();
            } else {
                eg0.B();
                C(this.o, qa0.v().O());
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(17, getString(R.string.manage_beneficiary));
        super.onResume();
        ua0.e(k()).u(this);
        D(qa0.v().O());
        ArrayList<BeneVpa> F = qa0.v().F();
        if (F == null || F.size() == 0) {
            eg0.i(k());
            ua0.d().j(false, new OliveRequest(17, 18, null));
        }
        ArrayList<Collectbeneblock> q = qa0.v().q();
        if (q == null || q.size() == 0) {
            ua0.d().a(false, new OliveRequest(17, 53, null, true));
        }
        ViewPager viewPager = this.z;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        this.z.getAdapter().j();
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (isDetached() || result == null || k() == null) {
            return;
        }
        result.getCode();
        int requestType = oliveRequest.getRequestType();
        if (requestType == 17) {
            eg0.B();
            if (this.m.getFavorite().equals(BeneVpa.FAVORITE)) {
                eg0.A(k(), getString(R.string.selected_contact_favorite));
            } else {
                eg0.A(k(), getString(R.string.selected_contact_unfavorite));
            }
            ArrayList<BeneVpa> arrayList = this.p;
            if (arrayList != null) {
                Iterator<BeneVpa> it = arrayList.iterator();
                while (it.hasNext()) {
                    BeneVpa next = it.next();
                    if (next.getVpa().equals(this.m.getVpa())) {
                        next.setFavorite(this.m.getFavorite());
                    }
                }
            }
            qa0.v().z0(this.p);
            C(this.o, this.p);
        } else if (requestType == 18) {
            eg0.B();
            this.p = qa0.v().O();
            C(this.o, qa0.v().O());
        } else if (requestType == 32) {
            eg0.B();
            eg0.A(k(), getString(R.string.bene_removed_successfully));
            this.p.remove(this.m);
            qa0.v().z0(this.p);
            if (this.w == 2) {
                ArrayList<Collectbeneblock> arrayList2 = this.q;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    this.q.remove(this.n);
                    qa0.v().X(this.q);
                    C(this.o, this.p);
                    return;
                }
                eg0.i(k());
                ua0.d().a(true, new OliveRequest(17, 53, null));
                return;
            }
            C(this.o, this.p);
        } else if (requestType == 52) {
            eg0.B();
            ArrayList<Collectbeneblock> q = qa0.v().q();
            this.q = q;
            q.remove(this.n);
            eg0.i(k());
            ua0.d().a(true, new OliveRequest(17, 53, null));
            F();
        } else if (requestType != 53) {
            if (this.g == oliveRequest.getInitiator()) {
                eg0.B();
            }
        } else {
            eg0.B();
            this.q = qa0.v().q();
            C(this.o, this.p);
        }
    }

    public final ArrayList<BeneVpa> z(ArrayList<BeneVpa> arrayList) {
        if (arrayList != null) {
            ArrayList<BeneVpa> arrayList2 = new ArrayList<>();
            Iterator<BeneVpa> it = arrayList.iterator();
            while (it.hasNext()) {
                BeneVpa next = it.next();
                if (!TextUtils.isEmpty(next.getFavorite()) && next.getFavorite().contains(C0059ao.a(12733))) {
                    arrayList2.add(next);
                }
            }
            return arrayList2;
        }
        return null;
    }
}
