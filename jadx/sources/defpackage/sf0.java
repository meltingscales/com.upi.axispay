package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.PayerInfo;
import com.olive.upi.transport.model.TransactionData;
import com.olive.upi.transport.model.VpaVerify;
import com.upi.axispay.R;
import com.upi.axispay.custom.FloatingInputLayout;
import com.upi.axispay.custom.NonScrollListView;
import defpackage.qa0;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: sf0  reason: default package */
/* loaded from: classes.dex */
public class sf0 extends xc0 implements View.OnClickListener, ng0, ua0.e {
    public LinearLayout l;
    public TextView m;
    public FloatingInputLayout n;
    public k90 o;
    public TransactionData p;
    public Account r;
    public View s;
    public Button t;
    public int u;
    public NonScrollListView v;
    public BeneVpa x;
    public BeneVpa q = new BeneVpa();
    public ArrayList<BeneVpa> w = new ArrayList<>();

    /* compiled from: AxisPay */
    /* renamed from: sf0$a */
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
            sf0.this.D(charSequence.toString());
            sf0.this.n.hideError();
        }
    }

    public static sf0 y() {
        return new sf0();
    }

    public void A(String str, String str2) {
        this.r = this.p.getAccount();
        this.q.setVpa(this.n.getText());
        this.q.setName(str);
        this.p.setMcc(str2);
        this.p.setBeneVpa(this.q);
        TransactionData.setIsSelectedFromList(false);
        qa0.v().u0(this.p);
        eg0.B();
        this.b.t(9, this.r);
    }

    public final void B(ArrayList<BeneVpa> arrayList) {
        k90 k90Var = this.o;
        if (k90Var == null) {
            this.o = new k90(k(), arrayList, this.u);
        } else {
            k90Var.z(arrayList, this.u);
        }
        this.o.y(this);
        this.v.setAdapter(this.o);
    }

    public void C(ArrayList<BeneVpa> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            this.w = new ArrayList<>();
            Iterator<BeneVpa> it = arrayList.iterator();
            while (it.hasNext()) {
                BeneVpa next = it.next();
                if (!qa0.v().P(next.getVpa())) {
                    this.w.add(next);
                }
            }
            ArrayList<BeneVpa> arrayList2 = this.w;
            if (arrayList2 != null && arrayList2.size() > 0) {
                B(this.w);
                this.l.setVisibility(0);
                this.m.setVisibility(8);
            } else {
                this.l.setVisibility(8);
                this.m.setVisibility(0);
            }
        } else {
            this.l.setVisibility(8);
            this.m.setVisibility(0);
        }
        eg0.B();
    }

    public final void D(String str) {
        if (this.w != null) {
            if (TextUtils.isEmpty(str)) {
                B(this.w);
                return;
            }
            ArrayList<BeneVpa> arrayList = new ArrayList<>();
            Iterator<BeneVpa> it = this.w.iterator();
            while (it.hasNext()) {
                BeneVpa next = it.next();
                if (next.getVpa().contains(str.toLowerCase())) {
                    arrayList.add(next);
                }
            }
            if (str.length() < 3) {
                this.t.setBackgroundResource(R.drawable.background_button_grey_rounded);
                this.t.setClickable(false);
                this.t.setEnabled(false);
                this.t.setTag(0);
                this.t.setText(getResources().getString(R.string.verify));
            } else if (arrayList.size() > 0) {
                if (arrayList.size() == 1 && str.equals(arrayList.get(0).getVpa())) {
                    this.x = arrayList.get(0);
                    this.t.setTag(1);
                    this.t.setText(getResources().getString(R.string.proceed));
                    this.t.setBackgroundResource(R.drawable.background_button_dark_rounded);
                    this.t.setClickable(true);
                    this.t.setEnabled(true);
                } else {
                    if (qa0.v().f(str) != null) {
                        this.t.setBackgroundResource(R.drawable.background_button_dark_rounded);
                        this.t.setClickable(true);
                        this.t.setEnabled(true);
                    } else {
                        this.t.setBackgroundResource(R.drawable.background_button_dark_rounded);
                        this.t.setClickable(true);
                        this.t.setEnabled(true);
                    }
                    this.t.setTag(0);
                    this.t.setText(getResources().getString(R.string.verify));
                }
            } else {
                this.t.setBackgroundResource(R.drawable.background_button_dark_rounded);
                this.t.setClickable(true);
                this.t.setEnabled(true);
                this.t.setTag(0);
                this.t.setText(getResources().getString(R.string.verify));
            }
            B(arrayList);
        }
    }

    public final void E() {
        String lowerCase = this.n.getText().toLowerCase();
        if (TextUtils.isEmpty(lowerCase)) {
            this.n.showError(getString(R.string.enter_valid_id));
        } else if (lowerCase.length() < 3) {
            this.n.showError(getString(R.string.upi_id_set));
        } else if (qa0.v().P(lowerCase)) {
            this.n.showError(getString(R.string.you_blocked_the_upi));
        } else if (!c70.o(lowerCase.toLowerCase())) {
            this.n.showError(getString(R.string.enter_valid_recipient_id));
        } else if (lowerCase.length() > 30) {
            this.n.showError(getString(R.string.only_30_characters_allowed));
        } else {
            jg0.C(this.n, getContext());
            VpaVerify vpaVerify = new VpaVerify();
            vpaVerify.setCustomerid(n70.f.a().m(C0059ao.a(268)));
            vpaVerify.setVpa(lowerCase);
            vpaVerify.setDevice(c70.d(k()));
            PayerInfo payerInfo = new PayerInfo();
            ArrayList<Account> h = qa0.v().h(qa0.c.ACTIVE_VPA);
            if (h != null) {
                payerInfo.setPayervpa(h.get(0).getVpa());
                payerInfo.setAccountnumber(h.get(0).getAccRefNumber());
                payerInfo.setName(h.get(0).getName());
                payerInfo.setMcc(C0059ao.a(269));
            }
            vpaVerify.setPayerInfo(payerInfo);
            eg0.i(k());
            ua0.d().q(new OliveRequest(40, 79, vpaVerify));
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
        if (((Integer) this.t.getTag()).intValue() == 1) {
            qa0.v().L().setBeneVpa(this.x);
            TransactionData.setIsSelectedFromList(true);
            if (qa0.v().M() != qa0.e.ALL) {
                this.b.t(9, this.r);
                return;
            }
            return;
        }
        E();
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
        if (i != 10) {
            return;
        }
        eg0.i(k());
        ua0.e(k()).q(new OliveRequest(40, 10, obj));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.s = layoutInflater.inflate(R.layout.fragment_send_money_vpa, viewGroup, false);
        TransactionData L = qa0.v().L();
        this.p = L;
        L.getTransactionMode();
        z();
        this.t.setBackgroundResource(R.drawable.background_button_grey_rounded);
        this.t.setClickable(false);
        this.t.setEnabled(false);
        this.l = (LinearLayout) this.s.findViewById(R.id.layout_list);
        this.v.setLayoutManager(new LinearLayoutManager(k()));
        this.n.setInputType(2);
        this.t.setOnClickListener(this);
        this.n.getInputField().addTextChangedListener(new a());
        return this.s;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result) && oliveRequest.getRequestType() == 79) {
            eg0.B();
            eg0.A(k(), result.getResult());
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(40, getString(R.string.send_money));
        super.onResume();
        ua0.e(k()).u(this);
        ua0.d().a(false, new OliveRequest(40, 53, null, true));
        ua0.d().j(false, new OliveRequest(40, 18, null));
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType == 18) {
            C(qa0.v().N(qa0.e.VPA));
            eg0.B();
        } else if (requestType == 53) {
            eg0.B();
            C(qa0.v().N(qa0.e.VPA));
        } else if (requestType != 79) {
            if (this.g == oliveRequest.getInitiator()) {
                eg0.B();
            }
        } else {
            eg0.B();
            A((String) result.getData(), result.getMcccode());
        }
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        if (i == R.id.bene_item && this.u != 5) {
            BeneVpa beneVpa = (BeneVpa) obj;
            qa0.v().L().setBeneVpa(beneVpa);
            TransactionData.setIsSelectedFromList(true);
            if (qa0.v().M() != qa0.e.ALL) {
                this.n.setText(beneVpa.getVpa());
                E();
            }
        }
    }

    public final void z() {
        this.n = (FloatingInputLayout) this.s.findViewById(R.id.edit_vpa);
        this.t = (Button) this.s.findViewById(R.id.button_verify);
        this.m = (TextView) this.s.findViewById(R.id.text_intro);
        this.v = (NonScrollListView) this.s.findViewById(R.id.vpa_list);
        TextView textView = (TextView) this.s.findViewById(R.id.empty_view);
    }
}
