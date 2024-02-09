package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.PayerInfo;
import com.olive.upi.transport.model.VpaVerify;
import com.upi.axispay.R;
import com.upi.axispay.custom.FloatingInputLayout;
import defpackage.qa0;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.HashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: sc0  reason: default package */
/* loaded from: classes.dex */
public class sc0 extends xc0 implements View.OnClickListener, ua0.e {
    public Button l;
    public LinearLayout m;
    public EditText n;
    public TextView o;
    public Button p;
    public CheckBox q;
    public FloatingInputLayout r;
    public Activity s;
    public View t;

    /* compiled from: AxisPay */
    /* renamed from: sc0$a */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.toString().length() < 3) {
                sc0.this.p.setBackgroundResource(R.drawable.background_button_grey_rounded);
                sc0.this.p.setClickable(false);
            } else {
                sc0.this.p.setBackgroundResource(R.drawable.background_button_dark_rounded);
                sc0.this.p.setClickable(true);
            }
            sc0.this.r.hideError();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: sc0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            jg0.C(sc0.this.getView(), sc0.this.getContext());
            sc0.this.A();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: sc0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            sc0.this.k().onBackPressed();
        }
    }

    public static sc0 z() {
        return new sc0();
    }

    public final void A() {
        if (TextUtils.isEmpty(this.r.getText().trim())) {
            this.r.showError(getString(R.string.enter_valid_id));
        } else if (this.r.getText().length() < 3) {
            this.r.showError(getString(R.string.upi_id_set));
        } else if (qa0.v().P(this.r.getText())) {
            this.r.showError(getString(R.string.you_blocked_the_upi));
        } else if (qa0.v().f(this.r.getText()) != null) {
            this.r.showError(getString(R.string.vpa_already_exist));
        } else if (!c70.o(this.r.getText().toLowerCase())) {
            this.r.showError(getString(R.string.enter_valid_recipient_id));
        } else {
            jg0.C(this.r, getContext());
            VpaVerify vpaVerify = new VpaVerify();
            vpaVerify.setCustomerid(n70.f.a().m(C0059ao.a(15600)));
            vpaVerify.setVpa(this.r.getText().toLowerCase());
            vpaVerify.setDevice(c70.d(k()));
            PayerInfo payerInfo = new PayerInfo();
            ArrayList<Account> h = qa0.v().h(qa0.c.ACTIVE_VPA);
            if (h != null) {
                payerInfo.setPayervpa(h.get(0).getVpa());
                payerInfo.setAccountnumber(h.get(0).getAccRefNumber());
                payerInfo.setName(h.get(0).getName());
                payerInfo.setMcc(C0059ao.a(15601));
            }
            vpaVerify.setPayerInfo(payerInfo);
            eg0.i(this.s);
            ua0.d().q(new OliveRequest(11, 79, vpaVerify));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String a2;
        BeneVpa beneVpa = new BeneVpa();
        if (view.getId() != R.id.button_vpa_confirm) {
            return;
        }
        jg0.C(view, k());
        if (this.q.isChecked()) {
            a2 = C0059ao.a(15602);
            beneVpa.setFavorite(a2);
        } else {
            a2 = C0059ao.a(15603);
            beneVpa.setFavorite(a2);
        }
        String str = this.r.getText().toString();
        String trim = this.n.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            trim = this.o.getText().toString();
        }
        eg0.i(k());
        beneVpa.setVpa(str);
        beneVpa.setName(this.o.getText().toString());
        beneVpa.setNickname(trim);
        beneVpa.setFavorite(a2);
        ua0.d().q(new OliveRequest(11, 17, beneVpa));
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.t = layoutInflater.inflate(R.layout.fragment_add_vpa_connections, viewGroup, false);
        this.s = getActivity();
        y();
        this.r.setInputType(2);
        this.r.getInputField().addTextChangedListener(new a());
        return this.t;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            eg0.B();
            if (result.getCode().equals(C0059ao.a(15604))) {
                eg0.m(k(), getString(R.string.invalid_upi_id));
            } else {
                eg0.m(k(), result.getResult());
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(11, getString(R.string.axis_pay_contact));
        super.onResume();
        ua0.e(k()).u(this);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType == 17) {
            ah0.c(k(), C0059ao.a(15605), new HashMap());
            ua0.d().j(true, new OliveRequest(11, 18, null));
            eg0.n(k(), getString(R.string.contacts_saved), new c());
        } else if (requestType != 79) {
            if (oliveRequest.getInitiator() == this.g) {
                eg0.B();
            }
        } else {
            this.o.setText((String) result.getData());
            this.m.setVisibility(0);
            this.l.setVisibility(0);
            this.r.setEnabled(false);
            this.n.setVisibility(0);
            this.p.setVisibility(8);
            this.o.setEnabled(false);
            eg0.B();
        }
    }

    public final void y() {
        this.r = (FloatingInputLayout) this.t.findViewById(R.id.edit_vpa);
        this.n = (EditText) this.t.findViewById(R.id.edit_nick_name);
        this.o = (TextView) this.t.findViewById(R.id.full_name);
        Button button = (Button) this.t.findViewById(R.id.button_verify);
        this.p = button;
        button.setBackgroundResource(R.drawable.background_button_grey_rounded);
        this.p.setOnClickListener(new b());
        this.q = (CheckBox) this.t.findViewById(R.id.favourite_icon);
        this.l = (Button) this.t.findViewById(R.id.button_vpa_confirm);
        this.m = (LinearLayout) this.t.findViewById(R.id.set_vpa_layout);
        this.l.setOnClickListener(this);
    }
}
