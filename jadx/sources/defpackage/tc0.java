package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.model.BeneVpa;
import com.upi.axispay.R;
import defpackage.qa0;
import java.util.ArrayList;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: tc0  reason: default package */
/* loaded from: classes.dex */
public class tc0 extends xc0 implements ng0 {
    public TextView l;
    public int m;
    public boolean p;
    public k90 q;
    public Button r;
    public gd0 s;
    public RecyclerView t;
    public int u;
    public ProgressBar v;
    public int n = 1;
    public int o = 2;
    public ArrayList<BeneVpa> w = new ArrayList<>();

    /* compiled from: AxisPay */
    /* renamed from: tc0$a */
    /* loaded from: classes.dex */
    public class a implements SwipeRefreshLayout.j {
        public final /* synthetic */ SwipeRefreshLayout a;

        public a(SwipeRefreshLayout swipeRefreshLayout) {
            this.a = swipeRefreshLayout;
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            tc0.this.s.h();
            this.a.setRefreshing(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void y(View view) {
        int i = this.m;
        if (i == this.n) {
            this.b.t(11, null);
        } else if (i == this.o) {
            this.b.t(12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void A(Object obj, int i, View view) {
        BeneVpa beneVpa = (BeneVpa) obj;
        String vpa = beneVpa.getVpa();
        eg0.c();
        eg0.i(k());
        ua0.d().q(new OliveRequest(17, 32, vpa));
        this.s.g(i, beneVpa, 0);
    }

    public void C(ArrayList<BeneVpa> arrayList, int i) {
        this.w = arrayList;
        this.m = i;
    }

    public void D(yc0 yc0Var) {
        this.s = yc0Var;
    }

    public void E(ma0 ma0Var) {
        this.u = ma0Var.b();
        ma0Var.a();
    }

    public void F(boolean z) {
        this.p = z;
    }

    public final void G(ArrayList<BeneVpa> arrayList) {
        k90 k90Var = this.q;
        if (k90Var == null) {
            this.q = new k90(k(), arrayList, this.u);
        } else {
            k90Var.z(arrayList, this.u);
        }
        this.q.y(this);
        this.t.setAdapter(this.q);
        this.v.setVisibility(8);
    }

    public void H(ArrayList<BeneVpa> arrayList, int i) {
        this.m = i;
        if (!isAdded() || isDetached()) {
            return;
        }
        if (i == 1) {
            this.r.setText(getString(R.string.add_upi_id_contact));
        } else if (i == 2) {
            this.r.setText(getString(R.string.add_ifsc_contact));
        } else if (i == 3) {
            this.r.setText(getString(R.string.add_aadhar_contact));
        }
        if (arrayList != null && arrayList.size() > 0) {
            this.w = new ArrayList<>();
            Iterator<BeneVpa> it = arrayList.iterator();
            while (it.hasNext()) {
                BeneVpa next = it.next();
                if (!qa0.v().P(next.getVpa())) {
                    this.w.add(next);
                }
            }
            if (this.w.size() > 0) {
                G(this.w);
                this.t.setVisibility(0);
                this.l.setVisibility(8);
            } else {
                this.t.setVisibility(8);
                this.l.setVisibility(0);
            }
        } else {
            this.t.setVisibility(8);
            this.l.setVisibility(0);
        }
        this.v.setVisibility(8);
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_allconnections, viewGroup, false);
        qa0.v().L();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.vpa_list);
        this.t = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(k()));
        this.l = (TextView) inflate.findViewById(R.id.empty_view);
        this.v = (ProgressBar) inflate.findViewById(R.id.progress);
        Button button = (Button) inflate.findViewById(R.id.add_upi_contact);
        this.r = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: db0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tc0.this.y(view);
            }
        });
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_container);
        swipeRefreshLayout.setOnRefreshListener(new a(swipeRefreshLayout));
        return inflate;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        H(this.w, this.m);
        if (this.p) {
            this.r.setVisibility(8);
        } else {
            this.r.setVisibility(0);
        }
    }

    @Override // defpackage.ng0
    public void s(final int i, final Object obj) {
        if (i == R.id.bene_item) {
            if (this.u != 5) {
                qa0.v().L().setBeneVpa((BeneVpa) obj);
                if (qa0.v().M() != qa0.e.ALL) {
                    k().onBackPressed();
                }
            }
        } else if (i == R.id.contact_delete) {
            eg0.r(k(), getString(R.string.confirmation), getString(R.string.delete_bene), getString(R.string.okay), new View.OnClickListener() { // from class: eb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tc0.this.A(obj, i, view);
                }
            }, getString(R.string.cancel), new View.OnClickListener() { // from class: cb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    eg0.c();
                }
            });
        } else if (i != R.id.favourite_icon) {
        } else {
            BeneVpa beneVpa = (BeneVpa) obj;
            boolean isEmpty = TextUtils.isEmpty(beneVpa.getFavorite());
            String a2 = C0059ao.a(11157);
            if (isEmpty) {
                beneVpa.setFavorite(a2);
            } else {
                String favorite = beneVpa.getFavorite();
                String a3 = C0059ao.a(11158);
                if (favorite.equals(a3)) {
                    beneVpa.setFavorite(a2);
                } else {
                    beneVpa.setFavorite(a3);
                }
            }
            eg0.i(k());
            ua0.d().q(new OliveRequest(17, 17, beneVpa));
            this.s.g(i, beneVpa, 0);
        }
    }
}
