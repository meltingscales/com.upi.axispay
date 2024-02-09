package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.Recharge;
import com.upi.axispay.R;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: bf0  reason: default package */
/* loaded from: classes.dex */
public class bf0 extends xc0 implements ng0 {
    public ea0 l;
    public RecyclerView m;
    public TextView n;
    public ArrayList<Recharge> o;
    public Context p;

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.recharge_bill_plans_fragment, viewGroup, false);
        this.m = (RecyclerView) inflate.findViewById(R.id.plans_list);
        this.p = getActivity();
        this.n = (TextView) inflate.findViewById(R.id.empty_view);
        this.m.setLayoutManager(new LinearLayoutManager(k()));
        return inflate;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        y(this.o);
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        if (i != R.id.viewId) {
            return;
        }
        dg0 m = qa0.v().m();
        m.g(((Recharge) obj).getDenomination());
        qa0.v().U(m);
        k().onBackPressed();
    }

    public void x(ArrayList<Recharge> arrayList) {
        this.o = arrayList;
    }

    public void y(ArrayList<Recharge> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            this.n.setVisibility(8);
            this.m.setVisibility(0);
            ea0 ea0Var = this.l;
            if (ea0Var == null) {
                this.l = new ea0(this.p, arrayList);
            } else {
                ea0Var.A(arrayList);
            }
            this.l.y(this);
            this.m.setAdapter(this.l);
            return;
        }
        this.n.setVisibility(0);
        this.m.setVisibility(8);
    }
}
