package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.ChangeAppPin;
import com.upi.axispay.R;
import com.upi.axispay.custom.FloatingInputLayout;
import defpackage.ua0;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ed0  reason: default package */
/* loaded from: classes.dex */
public class ed0 extends xc0 implements ua0.e {
    public static int p;
    public FloatingInputLayout l;
    public FloatingInputLayout m;
    public FloatingInputLayout n;
    public Button o;

    /* compiled from: AxisPay */
    /* renamed from: ed0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ed0.this.y();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ed0$b */
    /* loaded from: classes.dex */
    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() == 6) {
                if (jg0.J(ed0.this.l.getText().toString())) {
                    ed0.this.l.showError(R.string.weak_passcode);
                    eg0.z(ed0.this.k(), R.string.weak_passcode_try_another);
                    return;
                }
                ed0.this.l.hideError();
                return;
            }
            ed0.this.l.hideError();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ed0$c */
    /* loaded from: classes.dex */
    public class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() == 6) {
                if (jg0.J(editable.toString())) {
                    ed0.this.m.showError(R.string.weak_passcode);
                    eg0.A(ed0.this.k(), ed0.this.getString(R.string.weak_passcode_try_another));
                    ed0.this.o.setEnabled(false);
                    ed0 ed0Var = ed0.this;
                    ed0Var.o.setBackgroundColor(t8.d(ed0Var.k(), R.color.colorDivider));
                    return;
                }
                ed0.this.m.hideError();
                return;
            }
            ed0.this.m.hideError();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ed0$d */
    /* loaded from: classes.dex */
    public class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() == 6) {
                if (jg0.J(ed0.this.n.getText())) {
                    ed0.this.n.showError(R.string.weak_passcode);
                    ed0.this.o.setEnabled(false);
                    ed0 ed0Var = ed0.this;
                    ed0Var.o.setBackgroundColor(t8.d(ed0Var.k(), R.color.colorDivider));
                    return;
                } else if (ed0.this.m.getText().equalsIgnoreCase(ed0.this.n.getText())) {
                    ed0.this.o.setEnabled(true);
                    ed0 ed0Var2 = ed0.this;
                    ed0Var2.o.setBackgroundColor(t8.d(ed0Var2.k(), R.color.colorPrimary));
                    return;
                } else {
                    ed0.this.n.showError(R.string.old_passcode);
                    ed0.this.o.setEnabled(false);
                    ed0 ed0Var3 = ed0.this;
                    ed0Var3.o.setBackgroundColor(t8.d(ed0Var3.k(), R.color.colorDivider));
                    return;
                }
            }
            ed0.this.n.hideError();
            ed0.this.o.setEnabled(false);
            ed0 ed0Var4 = ed0.this;
            ed0Var4.o.setBackgroundColor(t8.d(ed0Var4.k(), R.color.colorDivider));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static ed0 B() {
        return new ed0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void A(View view) {
        eg0.c();
        this.b.o(11, null);
    }

    public void C() {
        eg0.o(k(), getString(R.string.successful), getString(R.string.successfully_changed_passcode), getString(R.string.okay), new View.OnClickListener() { // from class: kb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ed0.this.A(view);
            }
        });
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_change_passcode, viewGroup, false);
        this.l = (FloatingInputLayout) inflate.findViewById(R.id.edit_old_passcode);
        this.m = (FloatingInputLayout) inflate.findViewById(R.id.edit_new_passcode);
        this.n = (FloatingInputLayout) inflate.findViewById(R.id.edit_reenter);
        Button button = (Button) inflate.findViewById(R.id.button_create);
        this.o = button;
        button.setOnClickListener(new a());
        this.n.setInputType(4);
        this.n.setMaxLength(getResources().getInteger(R.integer.maxlength_mpin));
        this.m.setInputType(4);
        this.m.setMaxLength(getResources().getInteger(R.integer.maxlength_mpin));
        this.l.setInputType(4);
        this.l.setMaxLength(getResources().getInteger(R.integer.maxlength_mpin));
        this.m.setLeftIcon(R.drawable.pass_key);
        this.l.setLeftIcon(R.drawable.pass_key);
        this.n.setLeftIcon(R.drawable.pass_key);
        FloatingInputLayout floatingInputLayout = this.l;
        String a2 = C0059ao.a(9597);
        floatingInputLayout.setEditTextImeOptions(a2);
        this.m.setEditTextImeOptions(a2);
        this.n.setEditTextImeOptions(C0059ao.a(9598));
        this.l.getInputField().addTextChangedListener(new b());
        this.m.getInputField().addTextChangedListener(new c());
        this.n.getInputField().addTextChangedListener(new d());
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        if (!n(oliveRequest, result)) {
            eg0.A(k(), result.getResult());
        }
        if (result.getCode().equals(C0059ao.a(9599))) {
            p++;
            FloatingInputLayout floatingInputLayout = this.l;
            String a2 = C0059ao.a(9600);
            floatingInputLayout.setText(a2);
            this.m.setText(a2);
            this.n.setText(a2);
            this.l.requestFocus();
            return;
        }
        eg0.h(k(), null, getString(R.string.Miscellaneous_App_Error));
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(43, getString(R.string.change_pass));
        super.onResume();
        ua0.e(k()).u(this);
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
        p = 0;
        eg0.B();
        new ch0(k()).h(C0059ao.a(9601), c70.g(k(), this.m.getText()), true);
        C();
    }

    public final void y() {
        int length = this.l.getText().length();
        int integer = getResources().getInteger(R.integer.maxlength_mpin);
        String a2 = C0059ao.a(9602);
        if (length < integer) {
            this.l.setText(a2);
            this.l.showError(R.string.enter_old_passcode);
        } else if (this.m.getText().length() < getResources().getInteger(R.integer.maxlength_mpin)) {
            this.m.setText(a2);
            this.m.showError(R.string.enter_new_passcode);
        } else if (this.n.getText().length() < getResources().getInteger(R.integer.maxlength_mpin)) {
            this.n.setText(a2);
            this.n.showError(R.string.re_enter_passcode);
        } else if (this.l.getText().equals(this.m.getText())) {
            this.m.setText(a2);
            this.n.setText(a2);
            this.n.showError(R.string.new_Old_cant_be_same);
        } else if (!this.m.getText().equals(this.n.getText())) {
            this.m.setText(a2);
            this.n.setText(a2);
            this.n.showError(R.string.pin_doesnt_match);
        } else if (jg0.J(this.m.getText())) {
            this.m.showError(R.string.weak_passcode);
        } else {
            eg0.i(k());
            ChangeAppPin changeAppPin = new ChangeAppPin();
            changeAppPin.setOldPin(this.l.getText());
            changeAppPin.setNewPin(this.m.getText());
            ua0.d().q(new OliveRequest(43, 35, changeAppPin));
        }
    }
}
