package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputLayout;
import com.kofigyan.stateprogressbar.StateProgressBar;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.MandateCreateRequest;
import com.olive.upi.transport.model.MandateTransactionData;
import com.olive.upi.transport.model.PayerInfo;
import com.olive.upi.transport.model.TransactionData;
import com.olive.upi.transport.model.VpaVerify;
import com.upi.axispay.R;
import com.upi.axispay.custom.CustomAutoComplete;
import defpackage.qa0;
import defpackage.ua0;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: sd0  reason: default package */
/* loaded from: classes.dex */
public class sd0 extends xc0 implements View.OnClickListener, ua0.e, ng0 {
    public static int E;
    public MandateTransactionData A;
    public s90 B;
    public Boolean C;
    public Boolean D;
    public View l;
    public String[] m;
    public Button n;
    public Button o;
    public LinearLayout p;
    public LinearLayout q;
    public LinearLayout r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public CustomAutoComplete w;
    public CheckBox x;
    public String y;
    public TextInputLayout z;

    /* compiled from: AxisPay */
    /* renamed from: sd0$a */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            BeneVpa item = sd0.this.B.getItem(i);
            sd0.this.q.setVisibility(8);
            sd0.this.r.setVisibility(8);
            sd0.this.n.setVisibility(8);
            sd0.this.s.setVisibility(0);
            sd0.this.t.setVisibility(0);
            sd0.this.p.setVisibility(0);
            sd0.this.o.setVisibility(0);
            sd0.this.u.setText(item.getVpa());
            sd0.this.t.setText(item.getName());
            sd0.this.w.setText(item.getVpa());
            sd0.this.x.setChecked(false);
            sd0 sd0Var = sd0.this;
            jg0.C(sd0Var.w, sd0Var.getContext());
            sd0.this.A.setPayeeName(item.getVpa());
            sd0.this.A.setBeneVpa(item);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: sd0$b */
    /* loaded from: classes.dex */
    public class b implements TextWatcher {
        public b() {
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
                sd0.this.n.setBackgroundResource(R.drawable.background_button_grey_rounded);
                sd0.this.n.setClickable(false);
            } else {
                sd0.this.n.setBackgroundResource(R.drawable.background_button_dark_rounded);
                sd0.this.n.setClickable(true);
            }
            sd0.this.v.setVisibility(4);
        }
    }

    public sd0() {
        new MandateCreateRequest();
        Boolean bool = Boolean.FALSE;
        this.C = bool;
        this.D = bool;
    }

    public static sd0 z(int i) {
        E = i;
        return new sd0();
    }

    public void A(View view) {
        this.m = getResources().getStringArray(R.array.mandate_state_list);
        ((StateProgressBar) view.findViewById(R.id.stepper_indicator)).setStateDescriptionData(this.m);
        this.p = (LinearLayout) view.findViewById(R.id.layout_vpa_view);
        this.w = (CustomAutoComplete) view.findViewById(R.id.edit_vpa);
        this.z = (TextInputLayout) view.findViewById(R.id.layout_edit_vpa);
        this.q = (LinearLayout) view.findViewById(R.id.edit_text_layout);
        this.r = (LinearLayout) view.findViewById(R.id.layout_contact);
        this.s = (TextView) view.findViewById(R.id.register_name);
        this.t = (TextView) view.findViewById(R.id.text_receiver_title);
        this.u = (TextView) view.findViewById(R.id.text_receiver_vpa);
        Button button = (Button) view.findViewById(R.id.button_verify);
        this.n = button;
        button.setBackgroundResource(R.drawable.background_button_grey_rounded);
        this.x = (CheckBox) view.findViewById(R.id.favourite_icon);
        this.v = (TextView) view.findViewById(R.id.error_text);
        Button button2 = (Button) view.findViewById(R.id.button_proceed);
        this.o = button2;
        button2.setOnClickListener(this);
        this.n.setOnClickListener(this);
    }

    public final void B() {
        ArrayList<BeneVpa> N = qa0.v().N(qa0.e.VPA);
        if (N != null && N.size() > 0) {
            C(N);
        } else {
            ua0.d().j(true, new OliveRequest(106, 18, null));
        }
    }

    public final void C(ArrayList<BeneVpa> arrayList) {
        s90 s90Var = new s90(k(), arrayList);
        this.B = s90Var;
        this.w.setAdapter(s90Var);
        this.w.setThreshold(1);
    }

    public final void D() {
        String lowerCase = this.w.getText().toString().toLowerCase();
        this.v.setVisibility(0);
        if (lowerCase != null && this.w.getText().length() != 0) {
            if (lowerCase.length() < 3) {
                this.v.setText(getString(R.string.upi_id_set));
                return;
            } else if (!c70.o(lowerCase.toLowerCase())) {
                this.v.setText(getString(R.string.enter_valid_recipient_id));
                return;
            } else {
                jg0.C(this.w, getContext());
                VpaVerify vpaVerify = new VpaVerify();
                vpaVerify.setCustomerid(n70.f.a().m(C0059ao.a(14746)));
                vpaVerify.setVpa(lowerCase);
                vpaVerify.setDevice(c70.d(k()));
                PayerInfo payerInfo = new PayerInfo();
                ArrayList<Account> h = qa0.v().h(qa0.c.ACTIVE_VPA);
                if (h != null) {
                    payerInfo.setPayervpa(h.get(0).getVpa());
                    payerInfo.setAccountnumber(h.get(0).getAccRefNumber());
                    payerInfo.setName(h.get(0).getName());
                    payerInfo.setMcc(C0059ao.a(14747));
                }
                vpaVerify.setPayerInfo(payerInfo);
                eg0.i(getActivity());
                ua0.d().q(new OliveRequest(106, 79, vpaVerify));
                return;
            }
        }
        this.v.setText(getString(R.string.enter_valid_id));
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.button_proceed) {
            if (id != R.id.button_verify) {
                return;
            }
            D();
        } else if (this.C.booleanValue()) {
            if (this.x.isChecked()) {
                eg0.i(k());
                BeneVpa beneVpa = new BeneVpa();
                beneVpa.setVpa(this.w.getText().toString());
                beneVpa.setNickname(this.y);
                beneVpa.setName(this.y);
                beneVpa.setFavorite(C0059ao.a(14748));
                ua0.d().q(new OliveRequest(106, 17, beneVpa));
            }
            BeneVpa beneVpa2 = new BeneVpa();
            beneVpa2.setName(this.t.getText().toString());
            beneVpa2.setVpa(this.u.getText().toString());
            this.A.setPayeeName(this.u.getText().toString());
            this.A.setMandateType(E);
            this.A.setBeneVpa(beneVpa2);
            this.b.t(108, null);
        } else {
            this.D = Boolean.TRUE;
            D();
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mandate_bene_details, viewGroup, false);
        this.l = inflate;
        A(inflate);
        this.A = qa0.v().z();
        int i = E;
        if (i == 1) {
            v(106, getString(R.string.create_auto_debit_mandate));
            this.z.setHint(getString(R.string.payer_hint));
        } else if (i == 2) {
            v(106, getString(R.string.request_mandate));
            this.z.setHint(getString(R.string.payee_hint));
        } else if (i == 3) {
            v(106, getString(R.string.modify_mandate));
        }
        this.w.setFocusable(true);
        this.w.setOnItemClickListener(new a());
        this.w.addTextChangedListener(new b());
        return this.l;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        if (n(oliveRequest, result) || oliveRequest.getRequestType() != 79) {
            return;
        }
        this.v.setVisibility(0);
        this.v.setText(result.getResult());
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        int i = E;
        if (i == 1) {
            v(106, C0059ao.a(14749));
            this.z.setHint(getString(R.string.payer_hint));
        } else if (i == 2) {
            v(106, C0059ao.a(14750));
            this.z.setHint(getString(R.string.payee_hint));
        } else if (i == 3) {
            v(106, C0059ao.a(14751));
        }
        this.A = qa0.v().z();
        ua0.e(k()).u(this);
        B();
        BeneVpa beneVpa = this.A.getBeneVpa();
        if (beneVpa != null) {
            this.q.setVisibility(8);
            this.r.setVisibility(8);
            this.n.setVisibility(8);
            this.s.setVisibility(0);
            this.t.setVisibility(0);
            this.p.setVisibility(0);
            this.o.setVisibility(0);
            this.u.setText(beneVpa.getVpa());
            this.t.setText(beneVpa.getName());
            this.w.setText(beneVpa.getVpa());
            this.x.setChecked(false);
            jg0.C(this.w, getContext());
            this.A.setPayeeName(beneVpa.getVpa());
            this.A.setBeneVpa(beneVpa);
        } else if (this.A.getTransactionMode() != TransactionData.MODE_PAYER_UPDATE_MANDATE && this.A.getTransactionMode() != TransactionData.MODE_PAYEE_UPDATE_MANDATE) {
            this.q.setVisibility(0);
            this.r.setVisibility(0);
            this.n.setVisibility(0);
            this.s.setVisibility(8);
            this.t.setVisibility(8);
            this.p.setVisibility(8);
            this.o.setVisibility(8);
            this.x.setChecked(true);
        } else {
            this.q.setVisibility(8);
            this.r.setVisibility(8);
            this.n.setVisibility(8);
            this.s.setVisibility(0);
            this.w.setText(beneVpa.getVpa());
            this.t.setVisibility(0);
            this.p.setVisibility(0);
            this.o.setVisibility(0);
            this.u.setText(this.A.getPayeeVpa());
            this.t.setText(this.A.getPayeeName());
        }
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        int requestType = oliveRequest.getRequestType();
        if (requestType == 17) {
            Toast.makeText(k(), getString(R.string.contacts_saved), 0).show();
        } else if (requestType == 18) {
            qa0.v().n0((ArrayList) result.getData());
            C(qa0.v().N(qa0.e.VPA));
        } else if (requestType != 79) {
            if (oliveRequest.getInitiator() == this.g) {
                eg0.B();
            }
        } else {
            String str = result.mcccode;
            if (str == null || str.equalsIgnoreCase(C0059ao.a(14752))) {
                this.A.isP2P(true);
            }
            this.C = Boolean.TRUE;
            if (this.D.booleanValue()) {
                BeneVpa beneVpa = new BeneVpa();
                beneVpa.setName(this.t.getText().toString());
                beneVpa.setVpa(this.u.getText().toString());
                this.A.setPayeeName(this.u.getText().toString());
                this.A.setMandateType(E);
                this.A.setBeneVpa(beneVpa);
                this.b.t(108, null);
                return;
            }
            this.y = (String) result.getData();
            this.q.setVisibility(8);
            this.r.setVisibility(0);
            this.n.setVisibility(8);
            this.s.setVisibility(0);
            this.t.setVisibility(0);
            this.p.setVisibility(0);
            this.o.setVisibility(0);
            this.u.setText(this.w.getText().toString());
            this.t.setText(this.y);
        }
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
    }
}
