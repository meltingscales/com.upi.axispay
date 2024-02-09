package defpackage;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.TransportConstants;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.ChangeAppPin;
import com.upi.axispay.R;
import defpackage.n70;
import defpackage.ua0;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: nf0  reason: default package */
/* loaded from: classes.dex */
public class nf0 extends xc0 implements ua0.e, View.OnClickListener {
    public static int u;
    public RadioGroup l;
    public Button m;
    public View n;
    public TextView o;
    public RadioButton p;
    public RadioButton q;
    public Activity r;
    public boolean s = true;
    public String t;

    public static nf0 A(int i) {
        u = i;
        return new nf0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void y(View view) {
        eg0.c();
        this.b.o(11, null);
    }

    public static nf0 z() {
        u = -1;
        return new nf0();
    }

    public void B() {
        if (this.l.getCheckedRadioButtonId() == R.id.security_option1) {
            if (Build.VERSION.SDK_INT < 23) {
                eg0.z(k(), R.string.feature_not_supported);
                return;
            }
            pa0.a().g(R.id.security_option1);
            KeyguardManager keyguardManager = (KeyguardManager) k().getSystemService(C0059ao.a(945));
            if (keyguardManager != null) {
                if (!keyguardManager.isKeyguardSecure()) {
                    this.s = false;
                    startActivityForResult(new Intent(C0059ao.a(946)), 101);
                } else if (jg0.D()) {
                    if (u != 5) {
                        Intent createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(getString(R.string.app_name), getString(R.string.unlock_to_register));
                        if (createConfirmDeviceCredentialIntent != null) {
                            startActivityForResult(createConfirmDeviceCredentialIntent, 100);
                            return;
                        }
                        return;
                    }
                    Intent createConfirmDeviceCredentialIntent2 = keyguardManager.createConfirmDeviceCredentialIntent(getString(R.string.app_name), getString(R.string.menu_change_security));
                    if (createConfirmDeviceCredentialIntent2 != null) {
                        startActivityForResult(createConfirmDeviceCredentialIntent2, 100);
                    }
                }
            }
        } else if (this.l.getCheckedRadioButtonId() == R.id.security_option2) {
            pa0.a().g(R.id.security_option2);
            int i = u;
            String a = C0059ao.a(947);
            if (i != 5) {
                n70.f.a().v(a, vg0.d);
                this.b.t(75, Integer.valueOf(u));
            } else if (n70.f.a().j(a) == vg0.d) {
                this.b.t(43, Integer.valueOf(u));
            } else {
                this.b.t(75, Integer.valueOf(u));
            }
        } else {
            Toast.makeText(k(), getString(R.string.select_secure_option), 0).show();
        }
    }

    public final void C() {
        int i = u;
        String a = C0059ao.a(948);
        String a2 = C0059ao.a(949);
        if (i != 5) {
            n70.a aVar = n70.f;
            String m = aVar.a().m(a);
            aVar.a().v(C0059ao.a(950), vg0.e);
            ch0 ch0Var = new ch0(k());
            String b = c70.b(m);
            pa0.a().e(b);
            ch0Var.h(a2, c70.g(k(), b), true);
            this.b.t(37, null);
            return;
        }
        ch0 ch0Var2 = new ch0(k());
        ch0Var2.h(a2, c70.g(k(), null), false);
        eg0.i(k());
        ChangeAppPin changeAppPin = new ChangeAppPin();
        changeAppPin.setOldPin(ch0Var2.f());
        String g = c70.g(k(), c70.b(n70.f.a().m(a)));
        this.t = g;
        changeAppPin.setNewPin(g);
        changeAppPin.setType(TransportConstants.REG_TYPE_DEVICE);
        ua0.d().q(new OliveRequest(75, 35, changeAppPin));
    }

    public final void D() {
        this.l = (RadioGroup) this.n.findViewById(R.id.security_selection);
        TextView textView = (TextView) this.n.findViewById(R.id.security_title);
        this.o = textView;
        textView.setTypeface(null, 1);
        RadioButton radioButton = (RadioButton) this.n.findViewById(R.id.security_option1);
        this.p = radioButton;
        radioButton.setTypeface(null, 1);
        RadioButton radioButton2 = (RadioButton) this.n.findViewById(R.id.security_option2);
        this.q = radioButton2;
        radioButton2.setTypeface(null, 1);
        this.m = (Button) this.n.findViewById(R.id.btn_next1);
        this.n.findViewById(R.id.security_option_text1).setOnClickListener(this);
        this.n.findViewById(R.id.security_option_text2).setOnClickListener(this);
        if (u == 5) {
            this.m.setText(this.r.getString(R.string.proceed));
        }
        this.m.setOnClickListener(this);
        if (Build.VERSION.SDK_INT < 23) {
            this.p.setEnabled(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100) {
            if (i2 == -1 || i2 == 1) {
                C();
            }
        } else if (i == 101) {
            KeyguardManager keyguardManager = (KeyguardManager) k().getSystemService(C0059ao.a(951));
            if (i2 != -1 && i2 != 1) {
                if (i2 != 0 || keyguardManager == null || this.s == keyguardManager.isKeyguardSecure()) {
                    return;
                }
                C();
                return;
            }
            C();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_next1 /* 2131361989 */:
                B();
                return;
            case R.id.security_option_text1 /* 2131362806 */:
                this.l.check(R.id.security_option1);
                return;
            case R.id.security_option_text2 /* 2131362807 */:
                this.l.check(R.id.security_option2);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.n = layoutInflater.inflate(R.layout.fragment_security_selection, viewGroup, false);
        this.r = getActivity();
        this.b.o(90, new tg0(getString(R.string.change_security_option), false, true, true, false));
        D();
        this.l.clearCheck();
        int j = n70.f.a().j(C0059ao.a(952));
        int i = R.id.security_option1;
        if (j != 0) {
            RadioGroup radioGroup = this.l;
            if (j != vg0.e) {
                i = R.id.security_option2;
            }
            radioGroup.check(i);
        } else {
            this.l.check(R.id.security_option1);
        }
        return this.n;
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
        v(74, getString(R.string.registration));
        ua0.d().u(this);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (oliveRequest.getRequestType() != 35) {
            return;
        }
        eg0.B();
        n70.f.a().v(C0059ao.a(953), vg0.e);
        new ch0(k()).h(C0059ao.a(954), this.t, true);
        eg0.o(k(), getString(R.string.successful), getString(R.string.successfully_changed_passcode), getString(R.string.okay), new View.OnClickListener() { // from class: nc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nf0.this.y(view);
            }
        });
    }
}
