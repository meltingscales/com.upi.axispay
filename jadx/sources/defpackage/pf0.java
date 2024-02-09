package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;

/* compiled from: AxisPay */
/* renamed from: pf0  reason: default package */
/* loaded from: classes.dex */
public class pf0 extends xc0 {
    public RadioButton l;
    public RadioButton m;

    /* compiled from: AxisPay */
    /* renamed from: pf0$a */
    /* loaded from: classes.dex */
    public class a implements RadioGroup.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (i == R.id.button_vpa_connection) {
                sf0 y = sf0.y();
                pf0.this.m.setBackgroundResource(R.drawable.background_grey);
                pf0.this.l.setBackgroundResource(R.drawable.burgundy_button_style);
                pf0.this.m.setTextColor(pf0.this.getResources().getColor(R.color.black));
                pf0.this.l.setTextColor(pf0.this.getResources().getColor(R.color.white));
                je n = pf0.this.getChildFragmentManager().n();
                pf0.this.t(y);
                n.r(R.id.fragment_connection, y);
                n.k();
            } else if (i == R.id.button_ifsc_connection) {
                ve0 y2 = ve0.y();
                pf0.this.l.setBackgroundResource(R.drawable.background_grey);
                pf0.this.l.setTextColor(pf0.this.getResources().getColor(R.color.black));
                pf0.this.m.setBackgroundResource(R.drawable.burgundy_button_style);
                pf0.this.m.setTextColor(pf0.this.getResources().getColor(R.color.white));
                je n2 = pf0.this.getChildFragmentManager().n();
                pf0.this.t(y2);
                n2.r(R.id.fragment_connection, y2);
                n2.k();
            }
        }
    }

    public static pf0 z() {
        return new pf0();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_send_money_new, viewGroup, false);
        ah0.f(requireContext(), getString(R.string.send_money_key), getString(R.string.send_money_action));
        this.l = (RadioButton) inflate.findViewById(R.id.button_vpa_connection);
        RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.button_ifsc_connection);
        this.m = radioButton;
        radioButton.setTypeface(null, 1);
        this.l.setTypeface(null, 1);
        je n = getChildFragmentManager().n();
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroup);
        if (qa0.v().L().getTransactionMode() == TransactionData.MODE_SEND) {
            this.m.setTextColor(getResources().getColor(R.color.black));
            sf0 y = sf0.y();
            n.r(R.id.fragment_connection, y);
            t(y);
            n.k();
            radioGroup.check(R.id.button_vpa_connection);
        } else {
            ve0 y2 = ve0.y();
            this.l.setBackgroundResource(R.drawable.background_grey);
            this.m.setBackgroundResource(R.drawable.burgundy_button_style);
            je n2 = getChildFragmentManager().n();
            t(y2);
            n2.r(R.id.fragment_connection, y2);
            n2.k();
            radioGroup.check(R.id.button_ifsc_connection);
        }
        radioGroup.setOnCheckedChangeListener(new a());
        return inflate;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.b.o(90, new tg0(getString(R.string.send_money), false, true, true, false));
        w(getString(R.string.send_money));
    }
}
