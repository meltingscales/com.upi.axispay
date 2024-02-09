package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.upi.axispay.R;
import com.upi.axispay.custom.NonScrollListView;

/* compiled from: AxisPay */
/* renamed from: gf0  reason: default package */
/* loaded from: classes.dex */
public class gf0 extends xc0 implements ng0 {
    public NonScrollListView l;
    public ha0 m;
    public ng0 n;

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.recent_recharge_list, viewGroup, false);
        NonScrollListView nonScrollListView = (NonScrollListView) inflate.findViewById(R.id.recycler_view);
        this.l = nonScrollListView;
        nonScrollListView.setLayoutManager(new LinearLayoutManager(k()));
        TextView textView = (TextView) inflate.findViewById(R.id.empty_view);
        return inflate;
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        ng0 ng0Var = this.n;
        if (ng0Var != null) {
            ng0Var.s(i, obj);
        }
    }

    public void x() {
        ha0 ha0Var = this.m;
        if (ha0Var != null) {
            ha0Var.j();
        }
    }
}
