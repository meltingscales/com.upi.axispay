package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.model.BeneVpaBlock;
import com.olive.upi.transport.model.Collectbeneblock;
import com.upi.axispay.R;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: dd0  reason: default package */
/* loaded from: classes.dex */
public class dd0 extends xc0 implements ng0 {
    public TextView l;
    public Activity m;
    public ArrayList<Collectbeneblock> n = new ArrayList<>();
    public j90 o;
    public View p;
    public RecyclerView q;
    public int r;
    public gd0 s;

    /* compiled from: AxisPay */
    /* renamed from: dd0$a */
    /* loaded from: classes.dex */
    public class a implements SwipeRefreshLayout.j {
        public final /* synthetic */ SwipeRefreshLayout a;

        public a(SwipeRefreshLayout swipeRefreshLayout) {
            this.a = swipeRefreshLayout;
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            dd0.this.s.h();
            this.a.setRefreshing(false);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: dd0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b(dd0 dd0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void y(Object obj, View view) {
        eg0.c();
        Collectbeneblock collectbeneblock = (Collectbeneblock) obj;
        String vpa = collectbeneblock.getVpa();
        this.s.g(1, collectbeneblock, 2);
        eg0.i(k());
        ua0.d().q(new OliveRequest(17, 32, vpa));
    }

    public static dd0 z() {
        return new dd0();
    }

    public void A(ArrayList<Collectbeneblock> arrayList) {
        this.n = arrayList;
    }

    public void B(yc0 yc0Var) {
        this.s = yc0Var;
    }

    public void C(ma0 ma0Var) {
        this.r = ma0Var.b();
        ma0Var.a();
    }

    public final void D(ArrayList<Collectbeneblock> arrayList) {
        j90 j90Var = this.o;
        if (j90Var == null) {
            this.o = new j90(this.m, arrayList, this.r);
        } else {
            j90Var.z(arrayList, this.r);
        }
        this.o.y(this);
        this.q.setAdapter(this.o);
    }

    public void E() {
        F(qa0.v().q());
    }

    public void F(ArrayList<Collectbeneblock> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            this.n = arrayList;
            D(arrayList);
            this.q.setVisibility(0);
            this.l.setVisibility(8);
            return;
        }
        this.q.setVisibility(8);
        this.l.setVisibility(0);
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.p = layoutInflater.inflate(R.layout.fragment_blocked_vpa_list, viewGroup, false);
        this.m = getActivity();
        RecyclerView recyclerView = (RecyclerView) this.p.findViewById(R.id.blocked_list);
        this.q = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(k()));
        this.l = (TextView) this.p.findViewById(R.id.empty_view);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.p.findViewById(R.id.swipe_container);
        swipeRefreshLayout.setOnRefreshListener(new a(swipeRefreshLayout));
        return this.p;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        E();
        ArrayList<Collectbeneblock> arrayList = this.n;
        if (arrayList != null && arrayList.size() > 0) {
            this.q.setVisibility(0);
            this.l.setVisibility(8);
            return;
        }
        this.q.setVisibility(8);
        this.l.setVisibility(0);
    }

    @Override // defpackage.ng0
    public void s(int i, final Object obj) {
        if (i != R.id.button_unblockk) {
            if (i != R.id.contact_delete) {
                return;
            }
            eg0.r(k(), getString(R.string.confirmation), getString(R.string.delete_bene), getString(R.string.okay), new View.OnClickListener() { // from class: jb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dd0.this.y(obj, view);
                }
            }, getString(R.string.cancel), new b(this));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Collectbeneblock collectbeneblock = (Collectbeneblock) obj;
        arrayList.add(new BeneVpaBlock(null, C0059ao.a(10512), collectbeneblock.getVpa(), null));
        eg0.i(k());
        this.s.g(1, collectbeneblock, 2);
        ua0.e(k()).q(new OliveRequest(17, 52, arrayList));
    }
}
