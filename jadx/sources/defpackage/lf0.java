package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.PayerInfo;
import com.olive.upi.transport.model.TransactionData;
import com.olive.upi.transport.model.VpaVerify;
import com.upi.axispay.R;
import com.upi.axispay.custom.FloatingInputLayout;
import defpackage.qa0;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: lf0  reason: default package */
/* loaded from: classes.dex */
public class lf0 extends xc0 implements View.OnClickListener, ng0, ua0.e {
    public Button l;
    public TransactionData m;
    public FloatingInputLayout n;
    public k90 o;
    public LinearLayout p;
    public TextView q;
    public int r;
    public Account t;
    public RecyclerView v;
    public int w;
    public BeneVpa x;
    public BeneVpa s = new BeneVpa();
    public ArrayList<BeneVpa> u = new ArrayList<>();

    /* compiled from: AxisPay */
    /* renamed from: lf0$a */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            lf0.this.C(editable.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: lf0$b */
    /* loaded from: classes.dex */
    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            lf0.this.C(editable.toString());
            lf0.this.n.hideError();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static lf0 y(Account account) {
        return new lf0();
    }

    public final void A(ArrayList<BeneVpa> arrayList) {
        k90 k90Var = this.o;
        if (k90Var == null) {
            this.o = new k90(k(), arrayList, this.w);
        } else {
            k90Var.z(arrayList, this.w);
        }
        this.o.y(this);
        this.v.setAdapter(this.o);
    }

    public void B(ArrayList<BeneVpa> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            this.u = new ArrayList<>();
            Iterator<BeneVpa> it = arrayList.iterator();
            while (it.hasNext()) {
                BeneVpa next = it.next();
                if (!qa0.v().P(next.getVpa())) {
                    this.u.add(next);
                }
            }
            ArrayList<BeneVpa> arrayList2 = this.u;
            if (arrayList2 != null && arrayList2.size() > 0) {
                A(this.u);
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

    public final void C(String str) {
        if (this.u != null) {
            if (TextUtils.isEmpty(str)) {
                A(this.u);
                return;
            }
            ArrayList<BeneVpa> arrayList = new ArrayList<>();
            Iterator<BeneVpa> it = this.u.iterator();
            while (it.hasNext()) {
                BeneVpa next = it.next();
                if (next.getVpa().contains(str.toLowerCase())) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() > 0) {
                if (arrayList.size() == 1 && str.equals(arrayList.get(0).getVpa())) {
                    this.x = arrayList.get(0);
                    this.l.setTag(1);
                    this.l.setText(R.string.proceed);
                    this.l.setBackgroundResource(R.drawable.background_button_dark_rounded);
                    this.l.setClickable(true);
                    this.l.setEnabled(true);
                } else {
                    this.l.setBackgroundResource(R.drawable.background_button_grey_rounded);
                    this.l.setClickable(false);
                    this.l.setEnabled(false);
                    this.l.setTag(0);
                    this.l.setText(R.string.verify);
                }
            } else {
                if (str.length() < 3) {
                    this.l.setBackgroundResource(R.drawable.background_button_grey_rounded);
                    this.l.setClickable(false);
                    this.l.setEnabled(false);
                } else {
                    this.l.setBackgroundResource(R.drawable.background_button_dark_rounded);
                    this.l.setClickable(true);
                    this.l.setEnabled(true);
                }
                this.l.setTag(0);
                this.l.setText(R.string.verify);
            }
            A(arrayList);
        }
    }

    public final void D() {
        String lowerCase = this.n.getText().trim().toLowerCase();
        if (TextUtils.isEmpty(lowerCase)) {
            this.n.showError(getString(R.string.enter_valid_id));
        } else if (lowerCase.length() < 3) {
            this.n.showError(getString(R.string.upi_id_set));
        } else if (!c70.o(lowerCase.toLowerCase())) {
            this.n.showError(getString(R.string.enter_valid_recipient_id));
        } else if (lowerCase.length() > 30) {
            this.n.showError(getString(R.string.only_30_characters_allowed));
        } else {
            jg0.C(this.n, getContext());
            VpaVerify vpaVerify = new VpaVerify();
            vpaVerify.setCustomerid(n70.f.a().m(C0059ao.a(4625)));
            vpaVerify.setVpa(lowerCase);
            vpaVerify.setDevice(c70.d(k()));
            PayerInfo payerInfo = new PayerInfo();
            ArrayList<Account> h = qa0.v().h(qa0.c.ACTIVE_VPA);
            if (h != null) {
                payerInfo.setPayervpa(h.get(0).getVpa());
                payerInfo.setAccountnumber(h.get(0).getAccRefNumber());
                payerInfo.setName(h.get(0).getName());
                payerInfo.setMcc(C0059ao.a(4626));
            }
            vpaVerify.setPayerInfo(payerInfo);
            eg0.i(k());
            ua0.d().q(new OliveRequest(62, 79, vpaVerify));
        }
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.button_verify) {
            return;
        }
        jg0.C(getView(), getContext());
        if (((Integer) this.l.getTag()).intValue() == 1) {
            qa0.v().L().setBeneVpa(this.x);
            TransactionData.setIsSelectedFromList(false);
            if (qa0.v().M() != qa0.e.ALL) {
                this.b.t(50, this.t);
                return;
            }
            return;
        }
        D();
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_send_money_via_vpa, viewGroup, false);
        TransactionData L = qa0.v().L();
        this.m = L;
        this.r = L.getTransactionMode();
        FloatingInputLayout floatingInputLayout = (FloatingInputLayout) inflate.findViewById(R.id.edit_vpa);
        this.n = floatingInputLayout;
        floatingInputLayout.setInputType(2);
        Button button = (Button) inflate.findViewById(R.id.button_verify);
        this.l = button;
        button.setBackgroundResource(R.drawable.background_button_grey_rounded);
        this.l.setClickable(false);
        this.l.setEnabled(false);
        this.v = (RecyclerView) inflate.findViewById(R.id.vpa_list);
        this.p = (LinearLayout) inflate.findViewById(R.id.layout_list);
        this.v.setLayoutManager(new LinearLayoutManager(k()));
        TextView textView = (TextView) inflate.findViewById(R.id.empty_view);
        EditText editText = (EditText) inflate.findViewById(R.id.search_vpa);
        this.q = (TextView) inflate.findViewById(R.id.text_intro);
        editText.setVisibility(8);
        editText.addTextChangedListener(new a());
        this.n.getInputField().addTextChangedListener(new b());
        this.l.setOnClickListener(this);
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            if (oliveRequest.getRequestType() != 79) {
                eg0.B();
            } else {
                eg0.A(k(), result.getResult());
                eg0.m(k(), result.getResult());
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ua0.e(k()).u(this);
        u(62);
        this.q.setText(getString(R.string.no_existing_upi_contacts_request));
        int i = this.r;
        if (i == TransactionData.MODE_SEND) {
            this.b.o(90, new tg0(getString(R.string.send_money), false, true, true, false));
            w(getString(R.string.send_money));
        } else if (i == TransactionData.MODE_RECEIVE) {
            this.b.o(90, new tg0(getString(R.string.request_money_via_vpa_id), false, true, true, false));
            w(getString(R.string.request_money_upi_id));
        }
        ua0.e(k()).j(false, new OliveRequest(62, 18, null));
        this.m.getAccount();
        qa0.v().v0(qa0.e.VPA);
        BeneVpa beneVpa = this.m.getBeneVpa();
        if (beneVpa != null) {
            beneVpa.getVpa();
            int i2 = this.r;
            if (i2 == TransactionData.MODE_SEND) {
                this.b.t(9, this.m.getAccount());
            } else if (i2 == TransactionData.MODE_RECEIVE) {
                this.b.t(50, this.m.getAccount());
            }
        }
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType == 18) {
            eg0.B();
            B(qa0.v().N(qa0.e.VPA));
        } else if (requestType == 53) {
            eg0.B();
            B(qa0.v().N(qa0.e.VPA));
        } else if (requestType != 79) {
            if (this.g == oliveRequest.getInitiator()) {
                eg0.B();
            }
        } else {
            eg0.B();
            z((String) result.getData());
        }
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        if (i != R.id.bene_item || this.w == 5) {
            return;
        }
        TransactionData L = qa0.v().L();
        L.setBeneVpa((BeneVpa) obj);
        TransactionData.setIsSelectedFromList(true);
        qa0.v().u0(L);
        this.b.t(50, this.t);
    }

    public void z(String str) {
        this.t = this.m.getAccount();
        this.s.setVpa(this.n.getText().toString());
        this.s.setName(str.toString());
        this.m.setBeneVpa(this.s);
        TransactionData.setIsSelectedFromList(false);
        qa0.v().u0(this.m);
        this.b.t(50, this.t);
    }
}
