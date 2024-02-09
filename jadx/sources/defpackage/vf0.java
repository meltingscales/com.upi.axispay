package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.kofigyan.stateprogressbar.StateProgressBar;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.ActivateAccount;
import com.olive.upi.transport.model.CustomerBankAccounts;
import com.olive.upi.transport.model.SaveAccount;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.custom.PinEntryView;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.HashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: vf0  reason: default package */
/* loaded from: classes.dex */
public class vf0 extends xc0 implements ua0.e {
    public static Account E;
    public String A;
    public String B;
    public String C;
    public boolean D;
    public View l;
    public Button m;
    public EditText n;
    public EditText o;
    public EditText p;
    public EditText q;
    public EditText r;
    public EditText s;
    public EditText t;
    public EditText u;
    public CheckBox v;
    public StateProgressBar w;
    public String[] x;
    public LinearLayout y;
    public PinEntryView z;

    /* compiled from: AxisPay */
    /* renamed from: vf0$a */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() == vf0.this.getResources().getInteger(R.integer.minlength_debit_pin)) {
                vf0.this.u.requestFocus();
            } else {
                vf0.this.s.requestFocus();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vf0$b */
    /* loaded from: classes.dex */
    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() == vf0.this.getResources().getInteger(R.integer.minlength_debit_pin)) {
                vf0.this.o.requestFocus();
            } else {
                vf0.this.t.requestFocus();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vf0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            vf0.this.b.o(11, null);
            vg0.b = true;
            if (n70.f.a().e(C0059ao.a(12685))) {
                return;
            }
            zg0.b(vf0.this.k());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vf0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            vf0.this.b.o(11, null);
            vg0.b = true;
            if (n70.f.a().e(C0059ao.a(12684))) {
                return;
            }
            zg0.b(vf0.this.k());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vf0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            vf0.this.b.o(11, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vf0$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            vf0.this.D();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vf0$g */
    /* loaded from: classes.dex */
    public class g implements CompoundButton.OnCheckedChangeListener {
        public g() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                vf0.this.o.setText(C0059ao.a(12787));
                vf0.this.p.setText(C0059ao.a(12788));
                vf0.this.o.setEnabled(false);
                vf0.this.p.setEnabled(false);
                return;
            }
            EditText editText = vf0.this.o;
            String a = C0059ao.a(12789);
            editText.setText(a);
            vf0.this.p.setText(a);
            vf0.this.o.setEnabled(true);
            vf0.this.p.setEnabled(true);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vf0$h */
    /* loaded from: classes.dex */
    public class h implements TextWatcher {
        public h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.toString().length() == 6) {
                vf0.this.o.setFocusable(true);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vf0$i */
    /* loaded from: classes.dex */
    public class i implements TextWatcher {
        public i() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() == vf0.this.getResources().getInteger(R.integer.minlength_debit_exp_date)) {
                vf0.this.p.requestFocus();
            } else if (editable.length() == 0) {
                vf0.this.u.requestFocus();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (vf0.this.o.getText().length() == 3) {
                String str = vf0.this.o.getText().toString() + C0059ao.a(12750);
                char charAt = str.charAt(str.length() - 2);
                if (charAt != '/') {
                    char[] charArray = str.toCharArray();
                    charArray[str.length() - 2] = charArray[str.length() - 1];
                    charArray[str.length() - 1] = charAt;
                    String str2 = new String(charArray);
                    vf0.this.o.setText(str2);
                    vf0.this.o.setSelection(str2.length());
                }
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vf0$j */
    /* loaded from: classes.dex */
    public class j implements TextWatcher {
        public j() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() == 0) {
                vf0.this.o.requestFocus();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vf0$k */
    /* loaded from: classes.dex */
    public class k implements TextWatcher {
        public k() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() == vf0.this.getResources().getInteger(R.integer.minlength_debit_pin)) {
                vf0.this.q.requestFocus();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vf0$l */
    /* loaded from: classes.dex */
    public class l implements TextWatcher {
        public l() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() == vf0.this.getResources().getInteger(R.integer.minlength_debit_pin)) {
                vf0.this.r.requestFocus();
            } else {
                vf0.this.n.requestFocus();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vf0$m */
    /* loaded from: classes.dex */
    public class m implements TextWatcher {
        public m() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() == vf0.this.getResources().getInteger(R.integer.minlength_debit_pin)) {
                vf0.this.s.requestFocus();
            } else {
                vf0.this.q.requestFocus();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vf0$n */
    /* loaded from: classes.dex */
    public class n implements TextWatcher {
        public n() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() == vf0.this.getResources().getInteger(R.integer.minlength_debit_pin)) {
                vf0.this.t.requestFocus();
            } else {
                vf0.this.r.requestFocus();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static vf0 y(Account account) {
        E = account;
        return new vf0();
    }

    public final boolean A(String str) {
        String a2 = C0059ao.a(9894);
        if (str.contains(a2)) {
            String[] split = str.split(a2);
            if (split.length == 2) {
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt <= 12 && parseInt2 > 13) {
                        this.C = split[0] + C0059ao.a(9895) + parseInt2;
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    public void B(boolean z) {
        this.D = z;
    }

    public final void C() {
        if (qa0.v().I() == 61) {
            eg0.n(k(), getString(R.string.set_upi_pin_successful), new c());
        } else {
            eg0.n(k(), getString(R.string.upi_pin_reset), new d());
        }
    }

    public final void D() {
        this.A = this.z.getText().toString();
        String obj = this.o.getText().toString();
        String obj2 = this.p.getText().toString();
        this.B = obj + C0059ao.a(9896) + obj2;
        if (this.A.length() < 6) {
            eg0.A(k(), getString(R.string.check_card_details));
        } else if (!A(this.B)) {
            eg0.A(k(), getString(R.string.check_expire_date));
        } else {
            jg0.C(getView(), k());
            eg0.i(k());
            ActivateAccount activateAccount = new ActivateAccount();
            activateAccount.setBankId(E.getIin());
            activateAccount.setAccount(E);
            activateAccount.setCardNo(this.A);
            activateAccount.setExp(this.C);
            ua0.d().q(new OliveRequest(61, 7, activateAccount));
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i2, Object obj) {
        if (i2 != 8) {
            return;
        }
        eg0.i(k());
        ua0.d().q(new OliveRequest(61, 8, obj));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_set_upi_pin, viewGroup, false);
        this.l = inflate;
        this.m = (Button) inflate.findViewById(R.id.button_set_upi);
        z();
        this.m.setOnClickListener(new f());
        return this.l;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            int requestType = oliveRequest.getRequestType();
            if (requestType != 7) {
                if (requestType != 8) {
                    eg0.B();
                    eg0.m(k(), result.getResult());
                } else {
                    eg0.B();
                    if (result.getCode().equals(C0059ao.a(9897))) {
                        eg0.A(k(), getString(R.string.timedout));
                    } else if (result.getCode().equals(C0059ao.a(9898))) {
                        eg0.A(k(), getString(R.string.invalid_card_details));
                    } else if (result.getCode().equals(C0059ao.a(9899))) {
                        eg0.A(k(), getString(R.string.invalid_otp));
                    } else if (result.getCode().equals(C0059ao.a(9900))) {
                        eg0.m(k(), getString(R.string.invalid_card_detail));
                    } else {
                        eg0.m(k(), result.getResult());
                    }
                }
            } else if (result.getCode().equals(C0059ao.a(9901))) {
                eg0.n(k(), result.getResult(), new e());
            } else {
                eg0.m(k(), result.getResult());
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ua0.e(k()).u(this);
        if (this.D) {
            this.b.o(90, new tg0(getString(R.string.reset_upi_pin), false, true, true, false));
            this.w.setVisibility(8);
            this.y.setVisibility(8);
            this.m.setText(getString(R.string.reset_upi_pin));
            v(61, getString(R.string.reset_upi_pin));
        } else {
            this.b.o(90, new tg0(getString(R.string.atm_debit), false, true, true, false));
            this.w.setVisibility(0);
            this.y.setVisibility(0);
            this.m.setText(getString(R.string.set_upi_pin));
            v(61, getString(R.string.atm_debit));
        }
        if (E.getIin().equals(vg0.c)) {
            this.v.setVisibility(0);
        } else {
            this.v.setVisibility(8);
        }
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType == 8) {
            n70.f.a().A(C0059ao.a(9905), true);
            Account account = E;
            account.setStatus(C0059ao.a(9906));
            String vpa = E.getVpa();
            SaveAccount saveAccount = new SaveAccount();
            saveAccount.setAccount(account);
            saveAccount.setVpa(vpa);
            eg0.i(k());
            ua0.d().q(new OliveRequest(61, 9, saveAccount));
        } else if (requestType != 9) {
            if (this.g == oliveRequest.getInitiator()) {
                eg0.B();
            }
        } else {
            eg0.B();
            HashMap hashMap = new HashMap();
            hashMap.put(C0059ao.a(9902), getString(R.string.set_upi_pin));
            hashMap.put(C0059ao.a(9903), jg0.n(E.getBankName()));
            ah0.c(k(), C0059ao.a(9904), hashMap);
            ArrayList<CustomerBankAccounts> arrayList = (ArrayList) result.getData();
            if (arrayList != null) {
                qa0.v().m0(arrayList, k());
                jg0.S(k(), arrayList);
            }
            TransactionData L = qa0.v().L();
            L.setAccount(E);
            L.setBankName(E.getBankName());
            qa0.v().u0(L);
            C();
        }
    }

    public void z() {
        this.z = (PinEntryView) this.l.findViewById(R.id.pin_entry_digit);
        PinEntryView pinEntryView = (PinEntryView) this.l.findViewById(R.id.pin_entry_month);
        this.n = (EditText) this.l.findViewById(R.id.edit_accno);
        this.o = (EditText) this.l.findViewById(R.id.edit_date);
        this.p = (EditText) this.l.findViewById(R.id.edit_year);
        EditText editText = this.o;
        editText.setTypeface(editText.getTypeface(), 1);
        EditText editText2 = this.p;
        editText2.setTypeface(editText2.getTypeface(), 1);
        this.q = (EditText) this.l.findViewById(R.id.edit_pin2);
        this.r = (EditText) this.l.findViewById(R.id.edit_pin3);
        this.s = (EditText) this.l.findViewById(R.id.edit_pin4);
        this.t = (EditText) this.l.findViewById(R.id.edit_pin5);
        this.u = (EditText) this.l.findViewById(R.id.edit_pin6);
        this.x = getResources().getStringArray(R.array.state_list);
        StateProgressBar stateProgressBar = (StateProgressBar) this.l.findViewById(R.id.stepper_indicator);
        this.w = stateProgressBar;
        stateProgressBar.setStateDescriptionData(this.x);
        CheckBox checkBox = (CheckBox) this.l.findViewById(R.id.sbi_text);
        this.v = checkBox;
        checkBox.setOnCheckedChangeListener(new g());
        this.y = (LinearLayout) this.l.findViewById(R.id.text_msg);
        qa0.v().L();
        this.z.addTextChangedListener(new h());
        this.o.addTextChangedListener(new i());
        this.p.addTextChangedListener(new j());
        this.n.addTextChangedListener(new k());
        this.q.addTextChangedListener(new l());
        this.r.addTextChangedListener(new m());
        this.s.addTextChangedListener(new n());
        this.t.addTextChangedListener(new a());
        this.u.addTextChangedListener(new b());
    }
}
