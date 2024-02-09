package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.model.Inbox;
import com.upi.axispay.R;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: qd0  reason: default package */
/* loaded from: classes.dex */
public class qd0 extends xc0 implements ng0 {
    public View l;
    public RecyclerView m;
    public ProgressBar n;
    public q90 o;
    public TextView p;
    public og0 q;

    /* compiled from: AxisPay */
    /* renamed from: qd0$a */
    /* loaded from: classes.dex */
    public class a implements SwipeRefreshLayout.j {
        public final /* synthetic */ SwipeRefreshLayout a;

        public a(SwipeRefreshLayout swipeRefreshLayout) {
            this.a = swipeRefreshLayout;
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            qd0.this.q.i(1);
            this.a.setRefreshing(false);
            qd0.this.n.setVisibility(0);
            qd0.this.p.setVisibility(8);
        }
    }

    public static qd0 B() {
        return new qd0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void z(Inbox inbox, View view) {
        eg0.c();
        eg0.i(k());
        inbox.setIsDelete(C0059ao.a(4241));
        ua0.e(k()).q(new OliveRequest(71, 81, inbox));
    }

    public void C(og0 og0Var) {
        this.q = og0Var;
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_inbox, viewGroup, false);
        this.l = inflate;
        this.m = (RecyclerView) inflate.findViewById(R.id.inbox_list);
        this.p = (TextView) this.l.findViewById(R.id.empty_view);
        this.n = (ProgressBar) this.l.findViewById(R.id.progress);
        this.m.setLayoutManager(new LinearLayoutManager(k()));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.l.findViewById(R.id.swipe_container);
        swipeRefreshLayout.setOnRefreshListener(new a(swipeRefreshLayout));
        return this.l;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        final Inbox inbox = (Inbox) obj;
        if (i == R.id.delete) {
            eg0.r(k(), getString(R.string.delete), getString(R.string.inbox_delete_confirmaton), getString(R.string.okay), new View.OnClickListener() { // from class: bc0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qd0.this.z(inbox, view);
                }
            }, getString(R.string.cancel), new View.OnClickListener() { // from class: ac0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    eg0.c();
                }
            });
        } else if (i != R.id.list_item) {
        } else {
            inbox.setIsRead(C0059ao.a(4242));
            ua0.e(k()).q(new OliveRequest(71, 81, inbox));
        }
    }

    public void x(ArrayList<Inbox> arrayList) {
        if (this.i) {
            q90 q90Var = this.o;
            if (q90Var == null) {
                this.o = new q90(k(), arrayList);
            } else {
                q90Var.z(arrayList);
            }
            this.o.y(this);
            this.m.setAdapter(this.o);
            this.n.setVisibility(8);
            if (arrayList.size() > 0) {
                this.p.setVisibility(8);
            } else {
                this.p.setVisibility(0);
            }
        }
    }
}
