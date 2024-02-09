package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.GetMandate;
import com.olive.upi.transport.model.PendingMandateReqVo;
import com.upi.axispay.R;
import defpackage.n70;
import defpackage.qa0;
import defpackage.ua0;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ud0  reason: default package */
/* loaded from: classes.dex */
public class ud0 extends xc0 implements ua0.e, ng0 {
    public static ud0 t;
    public RecyclerView l;
    public Activity m;
    public View n;
    public r90 o;
    public ArrayList<rg0> p;
    public GetMandate q;
    public int r;
    public ArrayList<PendingMandateReqVo> s;

    /* compiled from: AxisPay */
    /* renamed from: ud0$a */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.o {
        public int a;
        public int b;
        public boolean c;

        public a(ud0 ud0Var, int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = this.a;
            int i2 = childAdapterPosition % i;
            if (this.c) {
                int i3 = this.b;
                rect.left = i3 - ((i2 * i3) / i);
                rect.right = ((i2 + 1) * i3) / i;
                if (childAdapterPosition < i) {
                    rect.top = i3;
                }
                rect.bottom = i3;
                return;
            }
            int i4 = this.b;
            rect.left = (i2 * i4) / i;
            rect.right = i4 - (((i2 + 1) * i4) / i);
            if (childAdapterPosition >= i) {
                rect.top = i4;
            }
        }
    }

    public static ud0 y() {
        if (t == null) {
            t = new ud0();
        }
        return t;
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.n = layoutInflater.inflate(R.layout.mandate_dashboard, viewGroup, false);
        this.m = getActivity();
        this.l = (RecyclerView) this.n.findViewById(R.id.recycler_view);
        this.l.setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.l.addItemDecoration(new a(this, 1, x(2), true));
        this.l.setItemAnimator(new xi());
        ArrayList<rg0> arrayList = new ArrayList<>();
        this.p = arrayList;
        arrayList.add(new rg0(C0059ao.a(9015), (int) R.drawable.create_new_mandate, (int) R.drawable.ctreate_new_background, true, 106, 1, (int) R.drawable.white_line, t8.d(getContext(), R.color.white)));
        this.p.add(new rg0(C0059ao.a(9016), (int) R.drawable.scan_mandate, (int) R.drawable.mandate_scan_back, true, 133, (int) R.drawable.white_line, t8.d(getContext(), R.color.white), false));
        this.p.add(new rg0(C0059ao.a(9017), (int) R.drawable.my_mandate, (int) R.drawable.mandate_white_back, true, 113, (int) R.drawable.bur_line, t8.d(getContext(), R.color.grey), false));
        this.p.add(new rg0(C0059ao.a(9018), (int) R.drawable.received_mandate, (int) R.drawable.mandate_white_back, true, 129, (int) R.drawable.bur_line, t8.d(getContext(), R.color.grey), true));
        r90 r90Var = this.o;
        if (r90Var == null) {
            this.o = new r90(this.m, this.p);
        } else {
            r90Var.A(this.p);
        }
        this.l.setAdapter(this.o);
        this.o.y(this);
        qa0.v().h0(null);
        return this.n;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        if (n(oliveRequest, result)) {
            return;
        }
        Toast.makeText(k(), result.getResult(), 0).show();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(119, getString(R.string.mandate));
        super.onResume();
        GetMandate getMandate = new GetMandate();
        this.q = getMandate;
        n70.a aVar = n70.f;
        getMandate.setCustomerid(aVar.a().m(C0059ao.a(9019)));
        this.q.setUmn(c70.k());
        this.q.setTxnid(c70.j());
        this.q.setAppid(aVar.a().m(C0059ao.a(9020)));
        ua0.e(k()).u(this);
        eg0.i(k());
        ua0.d().q(new OliveRequest(119, 75, this.q));
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (oliveRequest.getRequestType() != 75) {
            if (oliveRequest.getInitiator() == this.g) {
                eg0.B();
                return;
            }
            return;
        }
        eg0.B();
        if (result.getCode().equals(C0059ao.a(9021))) {
            ArrayList<PendingMandateReqVo> arrayList = (ArrayList) result.getData();
            this.s = arrayList;
            this.r = arrayList.size();
            if (this.o == null) {
                this.o = new r90();
            }
            this.o.z(this.r);
        }
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        if (i != R.id.grid_item) {
            return;
        }
        rg0 rg0Var = (rg0) obj;
        if (rg0Var.b() == 133) {
            ArrayList<Account> h = qa0.v().h(qa0.c.ACTIVE_VPA);
            if (h != null && h.size() > 0) {
                this.b.t(54, 133);
                return;
            } else {
                eg0.m(k(), getString(R.string.no_active_account));
                return;
            }
        }
        this.b.t(rg0Var.b(), Integer.valueOf(rg0Var.e()));
    }

    public final int x(int i) {
        return Math.round(TypedValue.applyDimension(1, i, getResources().getDisplayMetrics()));
    }
}
