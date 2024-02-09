package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.upi.axispay.R;

/* compiled from: AxisPay */
/* renamed from: qc0  reason: default package */
/* loaded from: classes.dex */
public class qc0 extends xc0 {
    public Context l;
    public RadioButton m;
    public RadioButton n;

    /* compiled from: AxisPay */
    /* renamed from: qc0$a */
    /* loaded from: classes.dex */
    public class a implements RadioGroup.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (i == R.id.button_vpa_connection) {
                qc0.this.m.setTextColor(t8.d(qc0.this.l, R.color.white));
                qc0.this.n.setTextColor(t8.d(qc0.this.l, R.color.connection_button));
                je n = qc0.this.getChildFragmentManager().n();
                n.r(R.id.fragment_connection, sc0.z());
                n.j();
            } else if (i == R.id.button_ifsc_connection) {
                qc0.this.m.setTextColor(t8.d(qc0.this.l, R.color.connection_button));
                qc0.this.n.setTextColor(t8.d(qc0.this.l, R.color.white));
                je n2 = qc0.this.getChildFragmentManager().n();
                n2.r(R.id.fragment_connection, rc0.B());
                n2.j();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_add_connections, viewGroup, false);
        this.l = getActivity();
        this.m = (RadioButton) inflate.findViewById(R.id.button_vpa_connection);
        this.n = (RadioButton) inflate.findViewById(R.id.button_ifsc_connection);
        je n = getChildFragmentManager().n();
        n.r(R.id.fragment_connection, sc0.z());
        n.j();
        ((RadioGroup) inflate.findViewById(R.id.radioGroup)).setOnCheckedChangeListener(new a());
        return inflate;
    }
}
