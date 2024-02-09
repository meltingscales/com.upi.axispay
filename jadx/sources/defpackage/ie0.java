package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.BillerCategory;
import com.olive.upi.transport.model.Billers;
import com.olive.upi.transport.model.DTHOperator;
import com.olive.upi.transport.model.OperatorsLogos;
import com.upi.axispay.R;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: AxisPay */
/* renamed from: ie0  reason: default package */
/* loaded from: classes.dex */
public class ie0 extends xc0 implements ng0, ua0.e {
    public BillerCategory l;
    public View m;
    public RecyclerView n;
    public ba0 o;

    /* compiled from: AxisPay */
    /* renamed from: ie0$a */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.o {
        public int a;
        public int b;
        public boolean c;

        public a(ie0 ie0Var, int i, int i2, boolean z) {
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

    public static ie0 A() {
        return new ie0();
    }

    public void B(BillerCategory billerCategory) {
        this.l = billerCategory;
    }

    public final void C(ArrayList<DTHOperator> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<DTHOperator> it = arrayList.iterator();
            while (it.hasNext()) {
                Billers billers = new Billers();
                billers.setName(it.next().getDesc());
                arrayList2.add(billers);
            }
            ba0 ba0Var = this.o;
            if (ba0Var == null) {
                this.o = new ba0(getContext(), arrayList2);
            } else {
                ba0Var.z(arrayList2);
            }
            this.n.setAdapter(this.o);
            this.o.y(this);
            return;
        }
        eg0.m(k(), getString(R.string.no_operator_found));
    }

    public final void D(ArrayList<Billers> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            ba0 ba0Var = this.o;
            if (ba0Var == null) {
                this.o = new ba0(getContext(), arrayList);
            } else {
                ba0Var.z(arrayList);
            }
            this.n.setAdapter(this.o);
            this.o.y(this);
            return;
        }
        eg0.m(k(), getString(R.string.no_operator_found));
    }

    public void E(ArrayList<Billers> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            ba0 ba0Var = this.o;
            if (ba0Var == null) {
                this.o = new ba0(getContext(), arrayList);
            } else {
                ba0Var.z(arrayList);
            }
            this.n.setAdapter(this.o);
            this.o.y(this);
            return;
        }
        eg0.m(k(), getString(R.string.no_operator_found));
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
        View inflate = layoutInflater.inflate(R.layout.fragment_mobile_operator, viewGroup, false);
        this.m = inflate;
        this.n = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        this.n.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.n.addItemDecoration(new a(this, 3, jg0.d(getContext(), 2), true));
        this.n.setItemAnimator(new xi());
        return this.m;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            eg0.B();
            eg0.A(k(), result.getResult());
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(100, getString(R.string.select_operator));
        super.onResume();
        ua0.e(k()).u(this);
        BillerCategory billerCategory = this.l;
        if (billerCategory != null) {
            if (billerCategory.getFixedCategory() == 81) {
                this.b.o(90, new tg0(getString(R.string.select_operator), false, false, true, false));
                z();
            } else if (this.l.getFixedCategory() == 85) {
                this.b.o(90, new tg0(getString(R.string.select_operator), false, false, true, false));
                y();
            } else {
                this.b.o(90, new tg0(this.l.getDSCRPTN(), false, false, true, false));
                eg0.i(k());
                ua0.d().q(new OliveRequest(100, 64, this.l.getCODE_VAL()));
            }
        }
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType == 51) {
            eg0.B();
            C(qa0.v().t());
        } else if (requestType == 61) {
            eg0.B();
            E(x(qa0.v().D()));
        } else if (requestType != 64) {
            if (this.g == oliveRequest.getInitiator()) {
                eg0.B();
            }
        } else {
            eg0.B();
            D(oa0.f().d());
        }
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        Billers billers = (Billers) obj;
        if (this.l.getFixedCategory() == 81) {
            dg0 m = qa0.v().m();
            if (m != null) {
                m.j(billers.getNAME());
            }
            this.b.t(101, billers);
        } else if (this.l.getFixedCategory() == 85) {
            dg0 m2 = qa0.v().m();
            if (m2 == null) {
                m2 = new dg0();
            }
            m2.j(billers.getNAME());
            qa0.v().U(m2);
            k().onBackPressed();
        } else {
            oa0.f().r(i);
            this.b.t(120, billers);
        }
    }

    public final ArrayList<Billers> x(ArrayList<OperatorsLogos> arrayList) {
        if (arrayList == null) {
            return null;
        }
        ArrayList<Billers> arrayList2 = new ArrayList<>();
        Iterator<OperatorsLogos> it = arrayList.iterator();
        while (it.hasNext()) {
            OperatorsLogos next = it.next();
            Billers billers = new Billers();
            billers.setName(next.getName());
            billers.setIconUrl(next.getLogo());
            arrayList2.add(billers);
        }
        return arrayList2;
    }

    public final void y() {
        if (isDetached() || k() == null) {
            return;
        }
        ArrayList<DTHOperator> t = qa0.v().t();
        if (t != null && t.size() != 0) {
            C(t);
        } else {
            ua0.d().o(new OliveRequest(100, 51, null));
        }
    }

    public void z() {
        if (isDetached() || k() == null) {
            return;
        }
        ArrayList<OperatorsLogos> D = qa0.v().D();
        if (D != null && D.size() != 0) {
            E(x(D));
        } else {
            ua0.d().p(new OliveRequest(100, 61, null));
        }
    }
}
