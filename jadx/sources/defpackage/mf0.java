package defpackage;

import android.app.AlertDialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.ChangeAppPin;
import com.upi.axispay.R;
import com.upi.axispay.custom.PinFieldLayout;
import defpackage.ua0;

/* compiled from: AxisPay */
/* renamed from: mf0  reason: default package */
/* loaded from: classes.dex */
public class mf0 extends xc0 implements ua0.e {
    public PinFieldLayout l;
    public PinFieldLayout m;
    public Button n;
    public CheckBox o;

    /* compiled from: AxisPay */
    /* renamed from: mf0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (mf0.this.l.getPinText().length() < mf0.this.getResources().getInteger(R.integer.maxlength_mpin)) {
                eg0.m(mf0.this.k(), mf0.this.getString(R.string.enter_new_passcode));
            } else if (mf0.this.m.getPinText().length() < mf0.this.getResources().getInteger(R.integer.maxlength_mpin)) {
                eg0.m(mf0.this.k(), mf0.this.getString(R.string.re_enter_passcode));
            } else if (!mf0.this.l.getPinText().equals(mf0.this.m.getPinText())) {
                eg0.m(mf0.this.k(), mf0.this.getString(R.string.pin_doesnt_match));
            } else if (!mf0.this.o.isChecked()) {
                eg0.m(mf0.this.k(), mf0.this.getString(R.string.agree_tnc));
            } else {
                eg0.i(mf0.this.k());
                ChangeAppPin changeAppPin = new ChangeAppPin();
                changeAppPin.setOldPin(mf0.this.l.getPinText());
                changeAppPin.setNewPin(mf0.this.m.getPinText());
                ua0.d().q(new OliveRequest(13, 35, changeAppPin));
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: mf0$b */
    /* loaded from: classes.dex */
    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() == 6) {
                mf0.this.l.setLayoutbgCorrect();
                mf0.this.l.showIndicator();
                return;
            }
            mf0.this.l.setLayoutbg();
            mf0.this.l.hideIndicatorErrorText();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: mf0$c */
    /* loaded from: classes.dex */
    public class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() == 6) {
                if (mf0.this.l.getPinText().equalsIgnoreCase(mf0.this.m.getPinText())) {
                    mf0.this.m.setLayoutbgCorrect();
                    mf0.this.m.showIndicator();
                    mf0.this.n.setClickable(true);
                    mf0.this.n.setEnabled(true);
                    mf0 mf0Var = mf0.this;
                    mf0Var.n.setBackgroundColor(t8.d(mf0Var.k(), R.color.colorAccent));
                    return;
                }
                mf0.this.m.setLayoutbgError();
                mf0.this.m.hideIndicator();
                mf0.this.m.seterrorText();
                mf0.this.n.setClickable(false);
                mf0 mf0Var2 = mf0.this;
                mf0Var2.n.setBackgroundColor(t8.d(mf0Var2.k(), R.color.colorDivider));
                return;
            }
            mf0.this.m.hideIndicatorErrorText();
            mf0.this.m.setLayoutbg();
            mf0.this.n.setClickable(false);
            mf0.this.n.setEnabled(false);
            mf0 mf0Var3 = mf0.this;
            mf0Var3.n.setBackgroundColor(t8.d(mf0Var3.k(), R.color.colorDivider));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: mf0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ AlertDialog b;

        public d(AlertDialog alertDialog) {
            this.b = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.dismiss();
            mf0.this.b.t(4, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: mf0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public final /* synthetic */ AlertDialog b;

        public e(mf0 mf0Var, AlertDialog alertDialog) {
            this.b = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.dismiss();
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_resetpasscode, viewGroup, false);
        this.l = (PinFieldLayout) inflate.findViewById(R.id.enter_passcode);
        this.m = (PinFieldLayout) inflate.findViewById(R.id.re_enter_passcode);
        this.o = (CheckBox) inflate.findViewById(R.id.launcher_tc);
        this.l.setPinTextHint(getResources().getString(R.string.enter_new_passcode));
        this.m.setPinTextHint(getResources().getString(R.string.re_enter_passcode));
        this.l.setEditTextImeOptions(getResources().getString(R.string.next));
        this.m.setEditTextImeOptions(getResources().getString(R.string.done_c));
        Button button = (Button) inflate.findViewById(R.id.btn_set_passcode);
        this.n = button;
        button.setOnClickListener(new a());
        this.l.getTextField().addTextChangedListener(new b());
        this.m.getTextField().addTextChangedListener(new c());
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (n(oliveRequest, result)) {
            return;
        }
        eg0.m(k(), result.getResult());
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        v(13, getString(R.string.reset_passcode));
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        if (oliveRequest.getRequestType() != 35) {
            return;
        }
        x();
        this.b.o(11, null);
    }

    public void x() {
        AlertDialog.Builder builder = new AlertDialog.Builder(k());
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(k()).inflate(R.layout.passcode_change_success_dialog, (ViewGroup) null);
        builder.setView(linearLayout);
        AlertDialog create = builder.create();
        ((Button) linearLayout.findViewById(R.id.submit_btn)).setOnClickListener(new d(create));
        ((ImageView) linearLayout.findViewById(R.id.dialog_close)).setOnClickListener(new e(this, create));
        create.setCancelable(false);
        create.show();
    }
}
