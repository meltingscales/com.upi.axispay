package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.upi.axispay.R;
import com.upi.axispay.activity.MainActivity;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: kd0  reason: default package */
/* loaded from: classes.dex */
public class kd0 extends xc0 implements ng0 {
    public ListView l;
    public int m;

    /* compiled from: AxisPay */
    /* renamed from: kd0$a */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            kd0 kd0Var = kd0.this;
            kd0Var.m = i;
            if (i == 0) {
                kd0Var.z(C0059ao.a(1096));
                kd0.this.x();
            } else if (i != 1) {
            } else {
                kd0Var.z(C0059ao.a(1095));
                kd0.this.x();
            }
        }
    }

    public static kd0 y() {
        return new kd0();
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_language, viewGroup, false);
        this.l = (ListView) inflate.findViewById(R.id.languageList);
        Button button = (Button) inflate.findViewById(R.id.btn_verify);
        this.l.setAdapter((ListAdapter) new ArrayAdapter(k(), 17367061, new String[]{C0059ao.a(7770), C0059ao.a(7771)}));
        this.l.setOnItemClickListener(new a());
        return inflate;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(93, getString(R.string.change_language));
        super.onResume();
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        this.m = this.l.getSelectedItemPosition();
    }

    public void x() {
        Intent intent = new Intent(getContext(), MainActivity.class);
        k().finish();
        startActivity(intent);
    }

    public void z(String str) {
        d70.e(k()).i(str);
        n70.f.a().m(C0059ao.a(7772));
    }
}
