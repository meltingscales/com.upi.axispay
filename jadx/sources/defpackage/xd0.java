package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.OliveUpiEventListener;
import com.olive.upi.transport.OliveUpiManager;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.Mandate;
import com.olive.upi.transport.model.MandateRequest;
import com.olive.upi.transport.model.MandateTransactionData;
import com.olive.upi.transport.model.Payee;
import com.upi.axispay.R;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: xd0  reason: default package */
/* loaded from: classes.dex */
public class xd0 extends xc0 implements OliveUpiEventListener {
    public View l;
    public Button m;
    public TextView n;
    public TextView o;
    public TextView p;
    public TextView q;
    public sg0 r;
    public Mandate s;
    public MandateTransactionData t;

    /* compiled from: AxisPay */
    /* renamed from: xd0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            xd0.this.y();
        }
    }

    public static xd0 x() {
        return new xd0();
    }

    @Override // com.olive.upi.transport.OliveUpiEventListener
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mandate_confirmation, viewGroup, false);
        this.l = inflate;
        Button button = (Button) inflate.findViewById(R.id.button_confirm);
        this.m = button;
        button.setBackgroundResource(R.drawable.button_shape);
        this.n = (TextView) this.l.findViewById(R.id.fromdate);
        this.o = (TextView) this.l.findViewById(R.id.todate);
        this.p = (TextView) this.l.findViewById(R.id.amount);
        this.q = (TextView) this.l.findViewById(R.id.tv_frequency);
        this.s = qa0.v().w();
        this.r = qa0.v().x();
        this.n.setText(this.s.getValiditystart());
        this.o.setText(this.s.getValidityend());
        this.p.setText(this.s.getAmount());
        this.q.setText(this.r.a());
        this.s.setRecurrence(this.r.a());
        Mandate mandate = this.s;
        String a2 = C0059ao.a(22);
        mandate.setName(a2);
        this.s.setTxnid(a2);
        this.s.setRecurrencetype(a2);
        this.s.setAmount(C0059ao.a(23));
        Mandate mandate2 = this.s;
        String a3 = C0059ao.a(24);
        mandate2.setRevokeable(a3);
        this.s.setRule(C0059ao.a(25));
        this.s.setRecurrencetype(a2);
        this.s.setSharetopayee(a3);
        this.s.setType(a2);
        this.s.setRecurrencetype(a2);
        this.m.setOnClickListener(new a());
        return this.l;
    }

    @Override // com.olive.upi.transport.OliveUpiEventListener
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (n(oliveRequest, result) || oliveRequest.getRequestType() != 59) {
            return;
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(117, getString(R.string.request_mandate));
        super.onResume();
        OliveUpiManager.getInstance(k()).setListener(this);
    }

    @Override // com.olive.upi.transport.OliveUpiEventListener
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (oliveRequest.getRequestType() != 59) {
            return;
        }
        eg0.B();
        Toast.makeText(k(), result.getResult(), 1).show();
    }

    public void y() {
        this.t = new MandateTransactionData();
        Payee payee = new Payee();
        payee.setBeneVpa(C0059ao.a(26));
        String a2 = C0059ao.a(27);
        payee.setBamount(a2);
        Account account = new Account();
        MandateRequest mandateRequest = new MandateRequest();
        mandateRequest.setCustomerid(n70.f.a().m(C0059ao.a(28)));
        mandateRequest.setPayervpa(C0059ao.a(29));
        mandateRequest.setPayee(payee);
        mandateRequest.setTxnid(this.t.getTransactionId());
        mandateRequest.setAmount(a2);
        mandateRequest.setRemarks(C0059ao.a(30));
        String a3 = C0059ao.a(31);
        mandateRequest.setApprovalref(a3);
        mandateRequest.setCustomerrefid(a3);
        mandateRequest.setMcc(a3);
        mandateRequest.setOrderid(a3);
        mandateRequest.setMinamount(a3);
        mandateRequest.setRefurl(a3);
        mandateRequest.setAc(account);
        mandateRequest.setMandate(this.s);
    }
}
