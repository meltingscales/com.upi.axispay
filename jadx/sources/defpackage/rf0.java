package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.material.textfield.TextInputLayout;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.OliveUpiManager;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.Bank;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.LimitCheckReq;
import com.olive.upi.transport.model.Payee;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.activity.MainActivity;
import com.upi.axispay.custom.FloatingInputLayout;
import defpackage.n70;
import defpackage.qa0;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: rf0  reason: default package */
/* loaded from: classes.dex */
public class rf0 extends xc0 implements ua0.e {
    public static Account P;
    public BeneVpa A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public TextInputLayout H;
    public TextInputLayout I;
    public ImageView J;
    public LinearLayout K;
    public Spinner L;
    public la0 M;
    public Button l;
    public Button m;
    public FloatingInputLayout n;
    public FloatingInputLayout o;
    public FloatingInputLayout p;
    public CheckBox q;
    public String r;
    public TransactionData s;
    public LinearLayout t;
    public LinearLayout u;
    public BeneVpa w;
    public TextView x;
    public EditText y;
    public EditText z;
    public String v = C0059ao.a(5294);
    public Account N = new Account();
    public TextWatcher O = new g();

    /* compiled from: AxisPay */
    /* renamed from: rf0$a */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            rf0 rf0Var = rf0.this;
            rf0Var.N = rf0Var.M.getItem(i);
            rf0.this.s.setAccount(qa0.v().d(rf0.this.N.getVpa()));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rf0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            rf0.this.b.o(11, null);
            rf0 rf0Var = rf0.this;
            rf0Var.b.t(118, rf0Var.s.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rf0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            rf0.this.B();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rf0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            rf0.this.b.o(11, null);
            rf0 rf0Var = rf0.this;
            rf0Var.b.t(118, rf0Var.s.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rf0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            rf0.this.b.o(11, null);
            rf0.this.b.t(21, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rf0$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            rf0.this.b.t(20, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rf0$g */
    /* loaded from: classes.dex */
    public class g implements TextWatcher {
        public g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String str = rf0.this.z.getText().toString() + C0059ao.a(11495) + rf0.this.D.getText().toString() + C0059ao.a(11496);
            rf0.this.A = qa0.v().L().getBeneVpa();
            rf0 rf0Var = rf0.this;
            if (rf0Var.A == null && !rf0Var.v.equals(str)) {
                rf0.this.t.setVisibility(0);
                rf0.this.u.setVisibility(0);
                return;
            }
            rf0.this.t.setVisibility(8);
            rf0.this.u.setVisibility(8);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rf0$h */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            rf0.this.b.t(104, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rf0$i */
    /* loaded from: classes.dex */
    public class i implements TextWatcher {
        public i() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            rf0.this.B.setText(C0059ao.a(11863));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            rf0.this.A();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rf0$j */
    /* loaded from: classes.dex */
    public class j implements TextWatcher {
        public j() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            rf0.this.C.setText(C0059ao.a(11428));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            rf0.this.A();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rf0$k */
    /* loaded from: classes.dex */
    public class k implements TextWatcher {
        public k() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            rf0.this.E.setText(C0059ao.a(11446));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            rf0.this.A();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rf0$l */
    /* loaded from: classes.dex */
    public class l implements TextWatcher {
        public l() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            rf0.this.n.showError(C0059ao.a(11457));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            rf0.this.A();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rf0$m */
    /* loaded from: classes.dex */
    public class m implements View.OnClickListener {
        public m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LimitCheckReq limitCheckReq = new LimitCheckReq();
            limitCheckReq.setAc(rf0.P);
            limitCheckReq.setDevice(c70.d(rf0.this.k()));
            Payee payee = new Payee();
            payee.setBeneVpa(new BeneVpa().getVpa());
            payee.setBamount(jg0.B(rf0.this.n.getText().toString()));
            ArrayList arrayList = new ArrayList();
            arrayList.add(payee);
            limitCheckReq.setPayees(arrayList);
            limitCheckReq.setAmount(jg0.B(rf0.this.n.getText().toString()));
            OliveUpiManager.getInstance(rf0.this.k()).verifyLimit(new OliveRequest(63, 98, limitCheckReq));
            rf0.this.B();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rf0$n */
    /* loaded from: classes.dex */
    public class n implements View.OnClickListener {
        public n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            rf0.this.C();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rf0$o */
    /* loaded from: classes.dex */
    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            rf0.this.L.performClick();
        }
    }

    public static rf0 D() {
        return new rf0();
    }

    public void A() {
        if (this.t.getVisibility() == 0 && (TextUtils.isEmpty(this.y.getText().toString()) || TextUtils.isEmpty(this.z.getText().toString()) || TextUtils.isEmpty(this.D.getText().toString()) || TextUtils.isEmpty(this.n.getText()) || TextUtils.isEmpty(this.p.getText().trim()))) {
            this.n.getInputField().setTypeface(null, 1);
            this.l.setBackgroundResource(R.drawable.background_button_grey_rounded);
            this.l.setClickable(true);
        } else if (this.t.getVisibility() != 0 && (TextUtils.isEmpty(this.y.getText().toString()) || TextUtils.isEmpty(this.z.getText().toString()) || TextUtils.isEmpty(this.D.getText().toString()) || TextUtils.isEmpty(this.n.getText()))) {
            this.n.getInputField().setTypeface(null, 1);
            this.l.setBackgroundResource(R.drawable.background_button_grey_rounded);
            this.l.setClickable(true);
        } else {
            this.l.setBackgroundResource(R.drawable.background_button_dark_rounded);
            this.l.setClickable(true);
        }
    }

    public final void B() {
        jg0.C(getView(), k());
        String trim = this.p.getText().trim();
        String trim2 = this.y.getText().toString().trim();
        String trim3 = this.z.getText().toString().trim();
        String trim4 = this.D.getText().toString().trim();
        String str = this.F.getText().toString().toLowerCase() + trim4.toLowerCase();
        if (this.A == null && TextUtils.isEmpty(trim)) {
            this.p.showError(getString(R.string.select_bank_name));
        } else if (TextUtils.isEmpty(trim2)) {
            this.p.hideError();
            this.B.setVisibility(0);
            this.B.setText(getString(R.string.enter_nick_name));
        } else if (trim2.length() < 3) {
            this.B.setVisibility(0);
            this.B.setText(getString(R.string.valid_nick_name));
        } else if (TextUtils.isEmpty(trim3)) {
            this.B.setVisibility(4);
            this.C.setVisibility(0);
            this.C.setText(getString(R.string.enter_account_num));
        } else if (!jg0.G(getContext(), trim3)) {
            this.B.setVisibility(4);
            this.C.setVisibility(0);
            this.C.setText(getString(R.string.enter_valid_account));
        } else if (TextUtils.isEmpty(trim4)) {
            this.C.setVisibility(4);
            this.B.setVisibility(4);
            this.E.setVisibility(0);
            this.E.setText(getString(R.string.enter_empty_ifsc));
        } else if (!jg0.I(str)) {
            this.C.setVisibility(4);
            this.B.setVisibility(4);
            this.E.setVisibility(0);
            this.E.setText(getString(R.string.enter_ifsc));
        } else {
            this.E.setVisibility(4);
            Double valueOf = Double.valueOf(0.0d);
            try {
                valueOf = Double.valueOf(Double.parseDouble(jg0.B(this.n.getText())));
            } catch (Exception unused) {
            }
            if (valueOf.doubleValue() == 0.0d) {
                this.n.showError(getString(R.string.enter_amount));
            } else if (valueOf.doubleValue() < 1.0d) {
                this.n.showError(getString(R.string.amount_validation_text));
            } else {
                this.n.hideError();
                this.r = trim3 + C0059ao.a(5295) + str + C0059ao.a(5296);
                BeneVpa beneVpa = new BeneVpa();
                this.w = beneVpa;
                beneVpa.setVpa(this.r.toLowerCase());
                this.w.setNickname(this.y.getText().toString());
                this.w.setName(this.y.getText().toString());
                BeneVpa beneVpa2 = this.w;
                boolean isChecked = this.q.isChecked();
                String a2 = C0059ao.a(5297);
                beneVpa2.setFavorite(isChecked ? C0059ao.a(5298) : a2);
                this.s.setBeneVpa(this.w);
                this.s.setTransactionMode(TransactionData.MODE_SEND_VIA_IFSC);
                if (this.q.isChecked() && qa0.v().g(this.r) == null) {
                    this.w.setFavorite(a2);
                    ua0.d().q(new OliveRequest(64, 17, this.w));
                }
                this.s.setAmount(valueOf);
                if (!TextUtils.isEmpty(this.o.getText())) {
                    this.s.setRemarks(this.o.getText());
                } else {
                    this.s.setRemarks(getString(R.string.default_remark));
                }
                this.m.setVisibility(0);
                this.l.setVisibility(8);
                this.y.setEnabled(false);
                this.z.setEnabled(false);
                this.D.setEnabled(false);
                this.n.getInputField().setEnabled(false);
                this.o.getInputField().setEnabled(false);
                this.p.setEnabled(false);
                this.L.setEnabled(false);
                this.K.setEnabled(false);
            }
        }
    }

    public final void C() {
        eg0.i(k());
        OliveRequest oliveRequest = new OliveRequest(64, 510, this.s);
        oliveRequest.setClMode(5);
        ua0.d().q(oliveRequest);
    }

    public final void E(ArrayList<Account> arrayList) {
        la0 la0Var = this.M;
        if (la0Var == null) {
            this.M = new la0(k(), arrayList);
        } else {
            la0Var.c(arrayList);
        }
        this.L.setAdapter((SpinnerAdapter) this.M);
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i2, Object obj) {
        if (i2 != 10) {
            return;
        }
        eg0.i(k());
        ua0.e(k()).q(new OliveRequest(64, 10, obj));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.send_money_via_ifsc, viewGroup, false);
        TransactionData L = qa0.v().L();
        this.s = L;
        L.setDirection(1);
        this.x = (TextView) inflate.findViewById(R.id.text_receiver_vpa);
        this.y = (EditText) inflate.findViewById(R.id.edit_name);
        EditText editText = (EditText) inflate.findViewById(R.id.edit_acc);
        this.z = editText;
        editText.setSingleLine();
        this.n = (FloatingInputLayout) inflate.findViewById(R.id.edit_amount);
        this.J = (ImageView) inflate.findViewById(R.id.bank_logo);
        this.G = (TextView) inflate.findViewById(R.id.ifsc_title);
        TextView textView = (TextView) inflate.findViewById(R.id.ifsc_prefix);
        this.F = textView;
        textView.setTypeface(null, 1);
        this.n.setInputType(6);
        this.n.setLeftImageSize(getResources().getInteger(R.integer.rupee_height), getResources().getInteger(R.integer.rupee_height));
        this.n.getInputField().setTextSize(22.0f);
        this.n.getInputField().addTextChangedListener(new bg0(this.n.getInputField(), 1));
        FloatingInputLayout floatingInputLayout = (FloatingInputLayout) inflate.findViewById(R.id.edit_remark);
        this.o = floatingInputLayout;
        floatingInputLayout.setInputType(7);
        this.o.setSingleLine();
        this.o.setMaxLength(20);
        Button button = (Button) inflate.findViewById(R.id.button_confirm);
        this.l = button;
        button.setBackgroundResource(R.drawable.background_button_grey_rounded);
        this.m = (Button) inflate.findViewById(R.id.button_pay);
        this.l.setClickable(true);
        EditText editText2 = (EditText) inflate.findViewById(R.id.edit_ifsc_no);
        this.D = editText2;
        editText2.setTypeface(null, 1);
        if (this.F.length() > 0) {
            this.D.setFilters(new InputFilter[]{new InputFilter.LengthFilter(7)});
        } else {
            this.D.setFilters(new InputFilter[]{new InputFilter.LengthFilter(11)});
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.text_sender_title);
        FloatingInputLayout floatingInputLayout2 = (FloatingInputLayout) inflate.findViewById(R.id.spinner_select_bank);
        this.p = floatingInputLayout2;
        floatingInputLayout2.getInputField().setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.spin_icon, 0);
        this.p.getInputField().setFocusable(false);
        this.p.getInputField().setClickable(true);
        this.H = (TextInputLayout) inflate.findViewById(R.id.name_input_layout);
        this.I = (TextInputLayout) inflate.findViewById(R.id.acc_input_layout);
        this.B = (TextView) inflate.findViewById(R.id.text_name_error);
        this.E = (TextView) inflate.findViewById(R.id.text_ifsc_error);
        this.C = (TextView) inflate.findViewById(R.id.text_acc_error);
        this.q = (CheckBox) inflate.findViewById(R.id.favourite_icon);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.layout_amount);
        this.t = (LinearLayout) inflate.findViewById(R.id.layout_select_bank);
        this.u = (LinearLayout) inflate.findViewById(R.id.layout_contact);
        TextView textView3 = (TextView) inflate.findViewById(R.id.text_receiver_title);
        this.p.getInputField().setOnClickListener(new h());
        this.y.addTextChangedListener(new i());
        this.z.addTextChangedListener(new j());
        this.D.addTextChangedListener(new k());
        this.n.getInputField().addTextChangedListener(new l());
        this.l.setOnClickListener(new m());
        this.m.setOnClickListener(new n());
        this.z.addTextChangedListener(this.O);
        this.D.addTextChangedListener(this.O);
        this.L = (Spinner) inflate.findViewById(R.id.spinner_select_account);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.vpa_layout);
        this.K = linearLayout2;
        linearLayout2.setOnClickListener(new o());
        E(qa0.v().h(qa0.c.WITH_VPA));
        this.L.setSelection(this.M.b(this.s.getAccount().getVpa()));
        this.L.setOnItemSelectedListener(new a());
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            String code = result != null ? result.getCode() : C0059ao.a(5299);
            int requestType = oliveRequest.getRequestType();
            if (requestType == 10) {
                this.b.o(301, null);
                String lastTransactionId = OliveUpiManager.getInstance(k()).getLastTransactionId();
                this.s.setTransactionId(lastTransactionId);
                if (result.getData() != null) {
                    String obj = result.getData().toString();
                    this.s.setRefid(obj);
                    this.s.setApprovalRefNo(obj);
                } else {
                    this.s.setRefid(lastTransactionId);
                }
                this.s.setResponseCode(code);
                this.s.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(5300)));
                this.s.setTransactionStatus(1);
                this.s.setDescription(result.getResult());
                qa0.v().u0(this.s);
                if (code.equals(C0059ao.a(5301))) {
                    this.s.setTransactionId(null);
                    eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.fail_text), getString(R.string.reset_upi_pin).toUpperCase(), new b(), getString(R.string.retry).toUpperCase(), new c(), true);
                    return;
                } else if (code.equals(C0059ao.a(5302))) {
                    eg0.o(k(), getString(R.string.alert), getString(R.string.transaction_failed_max_retry), getString(R.string.okay), new d());
                    return;
                } else if (code.equals(C0059ao.a(5303))) {
                    eg0.B();
                    if (this.b == null) {
                        this.b = (MainActivity) k();
                    }
                    eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.insufficient_text), getString(R.string.check_balance).toUpperCase(), new e(), getString(R.string.ok_text), new f(), true);
                    return;
                } else {
                    this.b.t(20, null);
                    this.n.getInputField().getText().clear();
                    this.o.getInputField().getText().clear();
                }
            } else if (requestType != 98) {
                eg0.B();
            } else {
                Toast.makeText(this.c, result.getResult().toString(), 0).show();
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        String str;
        v(64, getString(R.string.beneficiary_details));
        super.onResume();
        qa0.v().v0(qa0.e.IFSC);
        ua0.e(k()).u(this);
        BeneVpa beneVpa = qa0.v().L().getBeneVpa();
        this.A = beneVpa;
        if (beneVpa != null) {
            this.y.setFocusable(false);
            this.z.setFocusable(false);
            this.D.setFocusable(false);
            this.y.setClickable(false);
            this.z.setClickable(false);
            this.D.setClickable(false);
            TextView textView = this.F;
            String a2 = C0059ao.a(5304);
            textView.setText(a2);
            this.H.setHint(getString(R.string.name));
            this.y.setBackground(null);
            this.I.setHint(getString(R.string.account_number));
            this.z.setBackground(null);
            this.G.setText(R.string.ifsc_code);
            this.D.setBackground(null);
            this.q.setChecked(false);
            String vpa = this.A.getVpa();
            this.v = vpa;
            int indexOf = vpa.indexOf(C0059ao.a(5305));
            if (indexOf > 0) {
                String substring = vpa.substring(0, indexOf);
                int indexOf2 = vpa.indexOf(C0059ao.a(5306));
                if (indexOf2 > 0) {
                    a2 = vpa.substring(indexOf + 1, indexOf2);
                }
                str = a2;
                a2 = substring;
            } else {
                str = a2;
            }
            this.t.setVisibility(8);
            this.u.setVisibility(8);
            this.x.setText(this.A.getVpa());
            this.y.setText(this.A.getName());
            this.z.setText(a2);
            this.D.setText(str.toUpperCase());
            ArrayList<Bank> j2 = qa0.v().j();
            if (j2 != null) {
                Iterator<Bank> it = j2.iterator();
                while (it.hasNext()) {
                    Bank next = it.next();
                    String ifsc = next.getIfsc();
                    if (!TextUtils.isEmpty(ifsc) && ifsc.trim().equalsIgnoreCase(str.substring(0, 4))) {
                        jg0.K(this.J, next.getLogo(), 2131230832);
                    }
                }
            }
        } else {
            this.q.setChecked(true);
            this.t.setVisibility(0);
            this.u.setVisibility(0);
        }
        if (qa0.v().J() != null) {
            this.p.setText(qa0.v().J().getName());
            String ifsc2 = qa0.v().J().getIfsc();
            if (ifsc2.length() > 0) {
                this.D.setFilters(new InputFilter[]{new InputFilter.LengthFilter(7)});
            } else {
                this.D.setFilters(new InputFilter[]{new InputFilter.LengthFilter(11)});
            }
            if (!TextUtils.isEmpty(ifsc2)) {
                this.G.setText(R.string.enter_ifsc_code);
                this.F.setText(ifsc2.toUpperCase());
                jg0.K(this.J, qa0.v().J().getLogo(), 2131230832);
            }
            qa0.v().s0(null);
            A();
        }
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType != 10) {
            if (requestType == 17) {
                eg0.B();
                qa0.v().b(this.w);
                qa0.v().b0(true);
                eg0.A(k(), getString(R.string.contac_is_successfully_added));
                return;
            } else if (requestType != 24) {
                if (requestType != 98) {
                    if (this.g == oliveRequest.getInitiator()) {
                        eg0.B();
                        return;
                    }
                    return;
                }
                B();
                return;
            }
        }
        this.b.o(301, null);
        String lastTransactionId = OliveUpiManager.getInstance(k()).getLastTransactionId();
        this.s.setResponseCode(result.getCode());
        String str = (String) result.getData();
        this.s.setTransactionId(lastTransactionId);
        if (result.getData() != null && !TextUtils.isEmpty(str)) {
            this.s.setRefid(str);
            this.s.setApprovalRefNo(str);
        }
        this.s.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(5307)));
        this.s.setTransactionStatus(10);
        this.s.setDescription(result.getResult());
        qa0.v().u0(this.s);
        n70.a aVar = n70.f;
        n70 a2 = aVar.a();
        n70 a3 = aVar.a();
        String a4 = C0059ao.a(5308);
        a2.v(a4, a3.j(a4) + 1);
        aVar.a().A(C0059ao.a(5309), false);
        eg0.B();
        if (!TextUtils.isEmpty(this.s.getRemitterVpa())) {
            this.s.getAccount().setVpa(this.s.getRemitterVpa().toLowerCase());
        }
        this.b.t(24, null);
        String string = getString(R.string.send_money_ifsc_amount);
        String a5 = C0059ao.a(5310);
        boolean Q = qa0.v().Q();
        String a6 = C0059ao.a(5311);
        String a7 = C0059ao.a(5312);
        String a8 = C0059ao.a(5313);
        if (Q) {
            HashMap hashMap = new HashMap();
            hashMap.put(a8, string);
            hashMap.put(a7, jg0.l(this.s.getAmount()));
            hashMap.put(a6, jg0.n(this.s.getAccount().getBankName()));
            z k2 = k();
            String a9 = C0059ao.a(5314);
            ah0.d(k2, a9, hashMap, true);
            Product product = new Product();
            product.setName(string);
            product.setPrice(jg0.m(this.s.getAmount()).doubleValue());
            product.setId(this.s.getRefid());
            product.setBrand(this.s.getAccount().getBankName());
            ah0.e(k(), a9, product, hashMap);
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(a8, string);
            hashMap2.put(a7, jg0.l(this.s.getAmount()));
            hashMap2.put(a6, jg0.n(this.s.getAccount().getBankName()));
            ah0.d(k(), a5, hashMap2, true);
            Product product2 = new Product();
            product2.setName(a5);
            product2.setPrice(jg0.m(this.s.getAmount()).doubleValue());
            product2.setId(this.s.getRefid());
            product2.setBrand(this.s.getAccount().getBankName());
            ah0.e(k(), a5, product2, hashMap2);
        }
        this.n.getInputField().getText().clear();
        this.o.getInputField().getText().clear();
    }
}
