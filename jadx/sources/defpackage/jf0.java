package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.TransportConstants;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Authenticate;
import com.olive.upi.transport.model.MasterUpdate;
import com.olive.upi.transport.model.Registration;
import com.olive.upi.transport.model.TokenResponse;
import com.olive.upi.transport.model.UserRegister;
import com.upi.axispay.R;
import com.upi.axispay.activity.MainActivity;
import com.upi.axispay.activity.TnCActivity;
import com.upi.axispay.custom.FloatingInputLayout;
import defpackage.n70;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.HashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: jf0  reason: default package */
/* loaded from: classes.dex */
public class jf0 extends xc0 implements ua0.e, View.OnClickListener {
    public Registration l;
    public FloatingInputLayout m;
    public FloatingInputLayout n;
    public FloatingInputLayout o;
    public FloatingInputLayout p;
    public Button q;
    public CheckBox r;
    public TextView s;
    public TextView t;
    public View u;
    public LinearLayout v;
    public boolean w;
    public boolean x;
    public String z;
    public int y = 0;
    public int A = 108;

    /* compiled from: AxisPay */
    /* renamed from: jf0$a */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            jf0.this.o.hideError();
            jf0 jf0Var = jf0.this;
            jf0Var.w = true;
            jf0Var.x = false;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: jf0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            jf0.this.k().startActivity(new Intent(jf0.this.k(), TnCActivity.class));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: jf0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            jf0.this.A();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: jf0$d */
    /* loaded from: classes.dex */
    public class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            jf0.this.m.hideError();
            if (jf0.this.m.getText().length() >= 3) {
                jf0.this.H();
                return;
            }
            jf0.this.q.setEnabled(false);
            jf0 jf0Var = jf0.this;
            jf0Var.q.setBackgroundColor(t8.d(jf0Var.k(), R.color.colorDivider));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: jf0$e */
    /* loaded from: classes.dex */
    public class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            jf0.this.n.hideError();
            if (TextUtils.isEmpty(jf0.this.n.getText())) {
                jf0.this.q.setEnabled(false);
                jf0 jf0Var = jf0.this;
                jf0Var.q.setBackgroundColor(t8.d(jf0Var.k(), R.color.colorDivider));
            } else if (jg0.H(jf0.this.n.getText().trim())) {
                jf0.this.H();
            } else {
                jf0.this.q.setEnabled(false);
                jf0 jf0Var2 = jf0.this;
                jf0Var2.q.setBackgroundColor(t8.d(jf0Var2.k(), R.color.colorDivider));
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
    /* renamed from: jf0$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            eg0.i(jf0.this.j);
            ua0.e(jf0.this.j).q(new OliveRequest(37, 37, new UserRegister(pa0.a().b(), jf0.this.m.getText(), jf0.this.n.getText(), jf0.this.o.getText(), jf0.this.z)));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: jf0$g */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            eg0.i(jf0.this.k());
            ua0.e(jf0.this.k()).q(new OliveRequest(37, 37, new UserRegister(pa0.a().b(), jf0.this.m.getText(), jf0.this.n.getText(), jf0.this.o.getText(), jf0.this.z)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void D(DialogInterface dialogInterface, int i) {
        k().finish();
    }

    public static jf0 E(Registration registration) {
        return new jf0();
    }

    public final void A() {
        jg0.C(getView(), getContext());
        if (TextUtils.isEmpty(this.m.getText())) {
            this.m.showError(R.string.enter_name);
        } else if (this.m.getText().length() < 3) {
            this.m.showError(R.string.enter_valid_user_name);
        } else if (TextUtils.isEmpty(this.n.getText())) {
            this.n.showError(getString(R.string.your_email));
        } else if (!jg0.H(this.n.getText().trim())) {
            this.n.showError(R.string.invalid_email);
            this.n.setText(C0059ao.a(11024));
        } else if (!this.r.isChecked()) {
            eg0.m(k(), getString(R.string.agree_tnc));
        } else {
            I();
        }
    }

    public final void B(int i) {
        Intent intent = new Intent(getContext(), MainActivity.class);
        if (i != 0) {
            intent.putExtra(C0059ao.a(11025), i);
        }
        startActivity(intent);
        k().finish();
    }

    public final void F() {
        this.t = (TextView) this.u.findViewById(R.id.selected_security_lock);
        this.p = (FloatingInputLayout) this.u.findViewById(R.id.enter_security_type);
        this.t.setTypeface(null, 1);
        this.m = (FloatingInputLayout) this.u.findViewById(R.id.enter_name);
        this.n = (FloatingInputLayout) this.u.findViewById(R.id.enter_email);
        this.r = (CheckBox) this.u.findViewById(R.id.launcher_tc);
        this.s = (TextView) this.u.findViewById(R.id.text_tcn);
        this.o = (FloatingInputLayout) this.u.findViewById(R.id.enter_ref_code);
        this.v = (LinearLayout) this.u.findViewById(R.id.have_referralcode);
        Button button = (Button) this.u.findViewById(R.id.btn_register);
        this.q = button;
        button.setText(R.string.confirm);
        TextView textView = (TextView) this.u.findViewById(R.id.security_type);
        if (pa0.a().d() == R.id.security_option1) {
            this.p.setText(getString(R.string.screen_lock));
            this.z = TransportConstants.REG_TYPE_DEVICE;
        } else {
            this.p.setText(getString(R.string.security_option_passcode));
            this.z = TransportConstants.REG_TYPE_PASSCODE;
        }
        this.o.setInputType(2);
    }

    public void G() {
        eg0.i(k());
        ua0.e(k()).b(true, new OliveRequest(37, 15, null));
    }

    public final void H() {
        if (!TextUtils.isEmpty(this.m.getText()) && !TextUtils.isEmpty(this.n.getText()) && this.m.getText().length() != 0 && this.n.getText().length() != 0) {
            this.q.setEnabled(true);
            this.q.setBackgroundColor(t8.d(k(), R.color.colorPrimaryDark));
            return;
        }
        this.q.setEnabled(false);
        this.q.setBackgroundColor(t8.d(k(), R.color.colorDivider));
    }

    public final void I() {
        String lowerCase = this.o.getText().trim().toLowerCase();
        if (TextUtils.isEmpty(lowerCase)) {
            eg0.i(k());
            ua0.e(k()).q(new OliveRequest(37, 37, new UserRegister(pa0.a().b(), this.m.getText(), this.n.getText(), this.o.getText(), this.z)));
        } else if (lowerCase.length() > 1 && lowerCase.length() < 3) {
            this.o.showError(getString(R.string.invalid_ref_code));
        } else if (!c70.o(lowerCase.toLowerCase())) {
            this.o.showError(getString(R.string.invalid_ref_code));
        } else if (lowerCase.length() > 30) {
            this.o.showError(getString(R.string.invalid_ref_code));
        } else if (!lowerCase.endsWith(C0059ao.a(11026))) {
            this.o.showError(getString(R.string.invalid_ref_code));
            eg0.u(k(), getString(R.string.sorry), getString(R.string.invalid_ref_code), true, getString(R.string.continue_anyways), new g());
        } else {
            jg0.C(this.o, getContext());
            eg0.i(k());
            ua0.e(k()).q(new OliveRequest(37, 57, this.o.getText()));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.have_referralcode) {
            this.o.setVisibility(0);
        } else if (id != R.id.verify_code) {
        } else {
            String lowerCase = this.o.getText().toLowerCase();
            if (TextUtils.isEmpty(lowerCase)) {
                this.o.showError(getString(R.string.invalid_referral));
            } else if (lowerCase.startsWith(C0059ao.a(11027))) {
                this.o.showError(getString(R.string.invalid_referral));
            } else if (lowerCase.length() < 3) {
                this.o.showError(getString(R.string.upi_id_set));
            } else if (!c70.o(lowerCase.toLowerCase())) {
                this.o.showError(getString(R.string.enter_valid_recipient_id));
            } else if (!TextUtils.isEmpty(this.o.getText())) {
                jg0.C(this.o, getContext());
                eg0.i(k());
                ua0.e(k()).q(new OliveRequest(37, 57, this.o.getText()));
            } else {
                this.o.showError(R.string.enter_ref_code);
            }
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.u = layoutInflater.inflate(R.layout.fragment_registration, viewGroup, false);
        F();
        Registration registration = this.l;
        if (registration != null && registration.getType().equals(C0059ao.a(11028))) {
            this.v.setVisibility(0);
        } else {
            this.v.setVisibility(8);
        }
        this.m.setInputType(5);
        this.m.setMaxLength(20);
        this.m.setSingleLine();
        this.m.getInputField().setCompoundDrawablesWithIntrinsicBounds(R.drawable.name_person_icon, 0, 0, 0);
        this.n.getInputField().setCompoundDrawablesWithIntrinsicBounds(R.drawable.email_icon_grey, 0, 0, 0);
        this.p.getInputField().setCompoundDrawablesWithIntrinsicBounds(R.drawable.key_icon, 0, 0, 0);
        this.p.setActive(false);
        this.o.getInputField().setCompoundDrawablesWithIntrinsicBounds(R.drawable.referel_icon, 0, 0, 0);
        this.o.getInputField().addTextChangedListener(new a());
        this.v.setOnClickListener(this);
        this.o.getRightText().setOnClickListener(this);
        z();
        this.s.setOnClickListener(new b());
        this.q.setEnabled(false);
        this.q.setOnClickListener(new c());
        this.m.getInputField().addTextChangedListener(new d());
        this.n.getInputField().addTextChangedListener(new e());
        H();
        return this.u;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (n(oliveRequest, result)) {
            return;
        }
        if (oliveRequest.getRequestType() == 57) {
            String code = result.getCode();
            code.hashCode();
            char c2 = 65535;
            switch (code.hashCode()) {
                case 2433828:
                    if (code.equals(C0059ao.a(11031))) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 2433829:
                    if (code.equals(C0059ao.a(11030))) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 2433830:
                    if (code.equals(C0059ao.a(11029))) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                case 2:
                    this.o.showError(result.getResult());
                    eg0.B();
                    eg0.u(k(), getString(R.string.sorry), result.getResult(), true, getString(R.string.continue_anyways), new f());
                    break;
            }
            int i = this.y;
            if (i > 1) {
                eg0.B();
                eg0.m(k(), getString(R.string.Miscellaneous_App_Error));
                return;
            }
            this.y = i + 1;
            I();
        } else if (oliveRequest.getRequestType() == 37) {
            String code2 = result.getCode();
            code2.hashCode();
            if (!code2.equals(C0059ao.a(11032))) {
                int i2 = this.y;
                if (i2 > 1) {
                    eg0.B();
                    eg0.m(k(), getString(R.string.Miscellaneous_App_Error));
                    return;
                }
                this.y = i2 + 1;
                I();
                return;
            }
            eg0.B();
            eg0.f(k(), C0059ao.a(11033), result.getResult(), getString(R.string.exit), new DialogInterface.OnClickListener() { // from class: mc0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    jf0.this.D(dialogInterface, i3);
                }
            });
        } else if (oliveRequest.getRequestType() == 15) {
            B(58);
        } else if (oliveRequest.getRequestType() == 23) {
            eg0.B();
            if (result.getCode().equals(C0059ao.a(11034))) {
                jg0.W(k());
            } else {
                eg0.m(k(), getString(R.string.Miscellaneous_App_Error));
            }
        } else {
            eg0.B();
            eg0.m(k(), getString(R.string.Miscellaneous_App_Error));
        }
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ua0.e(k()).u(this);
        v(37, getString(R.string.registration));
        this.l = pa0.a().c();
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType != 4) {
            if (requestType == 15) {
                ArrayList arrayList = (ArrayList) result.getData();
                if (arrayList != null && arrayList.size() > 0) {
                    B(0);
                    return;
                } else {
                    B(58);
                    return;
                }
            } else if (requestType != 23) {
                if (requestType != 37) {
                    if (requestType != 57) {
                        return;
                    }
                    this.y = 0;
                    this.o.showError(result.getResult(), R.color.radio_green);
                    ua0.e(k()).q(new OliveRequest(37, 37, new UserRegister(pa0.a().b(), this.m.getText(), this.n.getText(), this.o.getText(), this.z)));
                    return;
                }
                this.y = 0;
                n70.f.a().y(C0059ao.a(11035), this.m.getText());
                String g2 = c70.g(k(), pa0.a().b());
                Authenticate authenticate = new Authenticate(g2);
                authenticate.setAppVersion(C0059ao.a(11036));
                authenticate.setType(1);
                new ch0(k()).h(C0059ao.a(11037), g2, true);
                ua0.d().q(new OliveRequest(37, 23, authenticate));
                return;
            }
        }
        G();
        n70.a aVar = n70.f;
        aVar.a().y(C0059ao.a(11038), this.n.getText());
        aVar.a().A(C0059ao.a(11039), true);
        aVar.a().A(C0059ao.a(11040), true);
        eg0.B();
        TokenResponse tokenResponse = (TokenResponse) result.getData();
        if (tokenResponse != null) {
            MasterUpdate masterUpdate = new MasterUpdate();
            masterUpdate.setBanner(tokenResponse.getBannerVersion());
            masterUpdate.setEncryptionFlag(tokenResponse.getEncryptionFlag());
            aVar.a().v(C0059ao.a(11041), tokenResponse.getBannerVersion());
            masterUpdate.setDthOperator(tokenResponse.getDthOperatorVersion());
            aVar.a().v(C0059ao.a(11042), tokenResponse.getDthOperatorVersion());
            masterUpdate.setMobileOperator(tokenResponse.getMobOperatorVersion());
            aVar.a().v(C0059ao.a(11043), tokenResponse.getMobOperatorVersion());
            masterUpdate.setBill_pay_max(tokenResponse.getBillpayMaxAmtVersion());
            aVar.a().v(C0059ao.a(11044), tokenResponse.getBillpayMaxAmtVersion());
            aVar.a().y(C0059ao.a(11045), tokenResponse.getAsap());
            aVar.a().y(C0059ao.a(11046), tokenResponse.getChecksumWebUrl());
            qa0.v().i0(masterUpdate);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(C0059ao.a(11047), C0059ao.a(11048));
        hashMap.put(C0059ao.a(11049), getString(R.string.registration));
        ah0.c(k(), C0059ao.a(11050), hashMap);
        ua0.d().q(new OliveRequest(37, 12, null));
    }

    public void z() {
        if (j(C0059ao.a(11051), this.A)) {
            n70.a aVar = n70.f;
            n70 a2 = aVar.a();
            String a3 = C0059ao.a(11052);
            if (TextUtils.isEmpty(a2.m(a3))) {
                Cursor query = k().getContentResolver().query(ContactsContract.Profile.CONTENT_URI, null, null, null, null);
                if (query != null && query.moveToFirst()) {
                    this.m.setText(jg0.Q(query.getString(query.getColumnIndex(C0059ao.a(11053)))));
                    query.close();
                }
            } else {
                this.m.setText(aVar.a().m(a3));
            }
            Account[] accounts = AccountManager.get(k()).getAccounts();
            if (accounts != null) {
                for (Account account : accounts) {
                    if (account.type.equals(C0059ao.a(11054))) {
                        this.n.setText(account.name);
                        return;
                    }
                }
            }
        }
    }
}
