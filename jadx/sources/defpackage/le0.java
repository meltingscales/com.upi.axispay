package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.MandatesVo;
import com.upi.axispay.R;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: le0  reason: default package */
/* loaded from: classes.dex */
public class le0 extends xc0 implements ng0 {
    public View l;
    public ArrayList<MandatesVo> m = new ArrayList<>();
    public le0 n;
    public v90 o;
    public RecyclerView p;
    public TextView q;

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_my_mandates_cancelled, viewGroup, false);
        this.l = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.empty_view);
        this.q = textView;
        textView.setText(C0059ao.a(5826));
        RecyclerView recyclerView = (RecyclerView) this.l.findViewById(R.id.cancelled_mandate_list);
        this.p = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(k()));
        return this.l;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
    }

    public void x(ArrayList<MandatesVo> arrayList) {
        this.m = arrayList;
    }

    public final void y(ArrayList<MandatesVo> arrayList) {
        if (this.n == null) {
            this.o = new v90(arrayList, getContext());
        } else {
            this.o.z(arrayList);
        }
        this.o.y(this);
        this.p.setAdapter(this.o);
        this.o.j();
    }

    public void z(ArrayList<MandatesVo> arrayList) {
        ArrayList<MandatesVo> arrayList2 = this.m;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList<MandatesVo> arrayList3 = new ArrayList<>(arrayList);
            this.m = arrayList3;
            if (arrayList3.size() > 0) {
                y(this.m);
                this.p.setVisibility(0);
                this.q.setVisibility(8);
                return;
            }
            this.p.setVisibility(8);
            this.q.setVisibility(0);
            return;
        }
        this.p.setVisibility(8);
        this.q.setVisibility(0);
    }
}
