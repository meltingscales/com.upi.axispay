package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.TransportConstants;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.ChangeAppPin;
import com.upi.axispay.R;
import com.upi.axispay.custom.FloatingInputLayout;
import defpackage.ua0;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: uf0  reason: default package */
/* loaded from: classes.dex */
public class uf0 extends xc0 implements View.OnClickListener, ua0.e {
    public static int s;
    public FloatingInputLayout l;
    public FloatingInputLayout m;
    public Button n;
    public Button o;
    public View p;
    public String q;
    public TextView r;

    /* compiled from: AxisPay */
    /* renamed from: uf0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            uf0.this.y();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: uf0$b */
    /* loaded from: classes.dex */
    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            uf0.this.l.hideError();
            if (editable.length() == 6) {
                if (jg0.J(uf0.this.l.getText())) {
                    uf0.this.l.showError(R.string.weak_passcode);
                    eg0.m(uf0.this.k(), uf0.this.getString(R.string.weak_passcode_try_another));
                    uf0.this.o.setEnabled(false);
                    uf0 uf0Var = uf0.this;
                    uf0Var.o.setBackgroundColor(t8.d(uf0Var.getContext(), R.color.colorDivider));
                    return;
                } else if (uf0.this.l.getText().equals(uf0.this.m.getText())) {
                    uf0.this.o.setEnabled(true);
                    uf0 uf0Var2 = uf0.this;
                    uf0Var2.o.setBackgroundColor(t8.d(uf0Var2.getContext(), R.color.colorPrimaryDark));
                    return;
                } else {
                    uf0.this.o.setEnabled(false);
                    uf0 uf0Var3 = uf0.this;
                    uf0Var3.o.setBackgroundColor(t8.d(uf0Var3.getContext(), R.color.colorDivider));
                    return;
                }
            }
            uf0.this.o.setEnabled(false);
            uf0 uf0Var4 = uf0.this;
            uf0Var4.o.setBackgroundColor(t8.d(uf0Var4.getContext(), R.color.colorDivider));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: uf0$c */
    /* loaded from: classes.dex */
    public class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            uf0.this.m.hideError();
            if (editable.length() == 6) {
                if (jg0.J(uf0.this.m.getText())) {
                    uf0.this.m.showError(R.string.weak_passcode);
                    eg0.m(uf0.this.k(), uf0.this.getString(R.string.weak_passcode_try_another));
                    uf0.this.o.setEnabled(false);
                    uf0 uf0Var = uf0.this;
                    uf0Var.o.setBackgroundColor(t8.d(uf0Var.getContext(), R.color.colorDivider));
                    return;
                } else if (uf0.this.l.getText().equalsIgnoreCase(uf0.this.m.getText())) {
                    uf0.this.o.setEnabled(true);
                    uf0 uf0Var2 = uf0.this;
                    uf0Var2.o.setBackgroundColor(t8.d(uf0Var2.getContext(), R.color.colorPrimaryDark));
                    return;
                } else if (TextUtils.isEmpty(uf0.this.l.getText())) {
                    uf0.this.m.showError(R.string.enter_password);
                    uf0.this.o.setEnabled(false);
                    uf0 uf0Var3 = uf0.this;
                    uf0Var3.o.setBackgroundColor(t8.d(uf0Var3.getContext(), R.color.colorDivider));
                    return;
                } else {
                    uf0.this.m.showError(R.string.passcode_does_not_match);
                    uf0.this.o.setEnabled(false);
                    uf0 uf0Var4 = uf0.this;
                    uf0Var4.o.setBackgroundColor(t8.d(uf0Var4.getContext(), R.color.colorDivider));
                    return;
                }
            }
            uf0.this.o.setEnabled(false);
            uf0 uf0Var5 = uf0.this;
            uf0Var5.o.setBackgroundColor(t8.d(uf0Var5.getContext(), R.color.colorDivider));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static uf0 B(int i) {
        s = i;
        return new uf0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void A(View view) {
        eg0.c();
        this.b.o(11, null);
    }

    public final void C() {
        TextView textView = (TextView) this.p.findViewById(R.id.set_your_6digit_passcode);
        this.r = textView;
        textView.setTypeface(null, 1);
        this.l = (FloatingInputLayout) this.p.findViewById(R.id.enter_passcode);
        this.m = (FloatingInputLayout) this.p.findViewById(R.id.confirm_pass);
        this.n = (Button) this.p.findViewById(R.id.btn_register);
        Button button = (Button) this.p.findViewById(R.id.btn_set);
        this.o = button;
        button.setOnClickListener(this);
    }

    public void D() {
        eg0.o(k(), getString(R.string.successful), getString(R.string.successfully_changed_passcode), getString(R.string.okay), new View.OnClickListener() { // from class: oc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uf0.this.A(view);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.btn_set) {
            return;
        }
        y();
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.p = layoutInflater.inflate(R.layout.fragment_set_passcode, viewGroup, false);
        C();
        this.l.setInputType(4);
        this.l.setMaxLength(6);
        this.m.setInputType(4);
        this.m.setMaxLength(6);
        this.l.getInputField().setCompoundDrawablesWithIntrinsicBounds(R.drawable.pass_key, 0, 0, 0);
        this.l.getRightIcon().setOnClickListener(this);
        this.m.getInputField().setCompoundDrawablesWithIntrinsicBounds(R.drawable.pass_key, 0, 0, 0);
        this.m.getRightIcon().setOnClickListener(this);
        this.n.setEnabled(false);
        this.o.setEnabled(false);
        this.o.setBackgroundColor(t8.d(getContext(), R.color.colorDivider));
        this.n.setOnClickListener(new a());
        this.l.getInputField().addTextChangedListener(new b());
        this.m.getInputField().addTextChangedListener(new c());
        return this.p;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        if (n(oliveRequest, result)) {
            return;
        }
        eg0.A(k(), result.getResult());
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        v(75, getString(R.string.registration));
        ua0.d().u(this);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (oliveRequest.getRequestType() != 35) {
            if (oliveRequest.getInitiator() == this.g) {
                eg0.B();
                return;
            }
            return;
        }
        eg0.B();
        ch0 ch0Var = new ch0(k());
        n70.f.a().v(C0059ao.a(10990), vg0.d);
        ch0Var.h(C0059ao.a(10991), this.q, true);
        D();
    }

    public final void y() {
        jg0.C(getView(), getContext());
        int length = this.l.getText().length();
        int integer = getResources().getInteger(R.integer.maxlength_mpin);
        String a2 = C0059ao.a(10992);
        if (length < integer) {
            this.l.showError(R.string.please_enter_passcode);
            this.l.setText(a2);
        } else if (this.m.getText().length() < getResources().getInteger(R.integer.maxlength_mpin)) {
            this.m.showError(R.string.re_enter_passcode);
            this.m.setText(a2);
        } else if (!this.l.getText().equals(this.m.getText())) {
            this.m.showError(R.string.pin_doesnt_match);
            this.l.setText(a2);
            this.m.setText(a2);
        } else if (jg0.E(this.l.getText())) {
            this.l.showError(R.string.new_passcode_has_all_same_digits);
            this.l.setText(a2);
            this.m.setText(a2);
        } else if (jg0.F(this.l.getText())) {
            this.l.showError(R.string.new_passcode_consecutive_digit);
            this.l.setText(a2);
            this.m.setText(a2);
        } else if (s != 5) {
            pa0.a().e(this.m.getText());
            this.b.t(37, null);
        } else {
            ch0 ch0Var = new ch0(k());
            ch0Var.h(C0059ao.a(10993), c70.g(k(), null), false);
            eg0.i(k());
            ChangeAppPin changeAppPin = new ChangeAppPin();
            changeAppPin.setOldPin(ch0Var.f());
            changeAppPin.setType(TransportConstants.REG_TYPE_DEVICE);
            String g = c70.g(k(), this.l.getText());
            this.q = g;
            changeAppPin.setNewPin(g);
            ua0.d().q(new OliveRequest(75, 35, changeAppPin));
        }
    }
}
