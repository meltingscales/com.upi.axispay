package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: fe0  reason: default package */
/* loaded from: classes.dex */
public class fe0 extends xc0 implements View.OnClickListener {
    public TextView l;
    public TextView m;
    public TextView n;
    public TextView o;
    public TextView p;
    public TextView q;
    public Button r;

    public static fe0 x() {
        return new fe0();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.btn_pay) {
            qa0.v().L().setTransactionMode(TransactionData.MODE_MERCHANT_PAY);
            if (n70.f.a().e(C0059ao.a(6849))) {
                this.b.t(36, Integer.valueOf(TransactionData.MODE_MERCHANT_PAY));
            } else {
                this.b.t(4, 36);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_merchant_listener, viewGroup, false);
        this.l = (TextView) inflate.findViewById(R.id.payee_app_name);
        this.m = (TextView) inflate.findViewById(R.id.pay_app_id);
        this.n = (TextView) inflate.findViewById(R.id.pay_amount);
        this.o = (TextView) inflate.findViewById(R.id.payee_name);
        this.p = (TextView) inflate.findViewById(R.id.pay_refno);
        this.q = (TextView) inflate.findViewById(R.id.pay_note);
        Button button = (Button) inflate.findViewById(R.id.btn_pay);
        this.r = button;
        button.setOnClickListener(this);
        TransactionData L = qa0.v().L();
        TextView textView = this.l;
        textView.setText(C0059ao.a(6850) + L.getPayeeAppName());
        this.m.setText(L.getPayAppId());
        this.o.setText(L.getPayeeName());
        TextView textView2 = this.n;
        textView2.setText(L.getAmount() + C0059ao.a(6851) + L.getPayCurrency());
        this.p.setText(L.getRefid());
        this.q.setText(L.getRemarks());
        return inflate;
    }
}
