package defpackage;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Authenticate;
import com.olive.upi.transport.model.Banner;
import com.olive.upi.transport.model.MasterUpdate;
import com.olive.upi.transport.model.TokenResponse;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.activity.MainActivity;
import com.upi.axispay.custom.PinEntryView;
import defpackage.n70;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: rd0  reason: default package */
/* loaded from: classes.dex */
public class rd0 extends xc0 implements ua0.e, View.OnClickListener {
    public TextView l;
    public TextView m;
    public LinearLayout n;
    public LinearLayout o;
    public Activity p;
    public int q;
    public PinEntryView r;
    public RelativeLayout t;
    public ImageView u;
    public int s = 108;
    public boolean v = false;
    public boolean w = true;

    /* compiled from: AxisPay */
    /* renamed from: rd0$a */
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
            if (charSequence.toString().length() == 6) {
                rd0.this.I(charSequence.toString());
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rd0$b */
    /* loaded from: classes.dex */
    public class b implements TextView.OnEditorActionListener {
        public b() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (((keyEvent == null || keyEvent.getKeyCode() != 66) && i != 6) || rd0.this.r.getText().toString().length() != 6) {
                return false;
            }
            rd0 rd0Var = rd0.this;
            rd0Var.I(rd0Var.r.getText().toString());
            return false;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rd0$c */
    /* loaded from: classes.dex */
    public class c extends TypeToken<List<Banner>> {
        public c(rd0 rd0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void C(DialogInterface dialogInterface, int i) {
        k().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void E(DialogInterface dialogInterface, int i) {
        k().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void G(View view) {
        k().finish();
    }

    public static rd0 H() {
        return new rd0();
    }

    public final void A(int i) {
        if (k() instanceof MainActivity) {
            this.b.o(11, null);
            return;
        }
        Intent intent = new Intent(k(), MainActivity.class);
        if (i != 0) {
            vg0.a = false;
            intent.putExtra(C0059ao.a(3535), i);
        } else {
            vg0.a = true;
        }
        startActivity(intent);
        this.p.overridePendingTransition(17432576, 17432577);
        this.p.finish();
    }

    public final void I(String str) {
        J(str, 0);
    }

    public final void J(String str, int i) {
        jg0.C(this.r, k());
        this.v = false;
        eg0.i(k());
        n70.a aVar = n70.f;
        n70 a2 = aVar.a();
        String a3 = C0059ao.a(3536);
        String m = a2.m(a3);
        boolean isEmpty = TextUtils.isEmpty(m);
        String a4 = C0059ao.a(3537);
        String a5 = C0059ao.a(3538);
        String a6 = C0059ao.a(3539);
        if (isEmpty) {
            aVar.a().y(a3, a6);
            aVar.a().y(a5, a4);
        } else if (!m.equalsIgnoreCase(a6)) {
            aVar.a().y(a3, a6);
            aVar.a().y(a5, a4);
        }
        Authenticate authenticate = new Authenticate(str);
        authenticate.setAppVersion(a6);
        authenticate.setType(i);
        ua0.e(k()).q(new OliveRequest(4, 23, authenticate));
    }

    public void K(TokenResponse tokenResponse) {
        MasterUpdate masterUpdate = new MasterUpdate();
        masterUpdate.setBanner(tokenResponse.getBannerVersion());
        masterUpdate.setEncryptionFlag(tokenResponse.getEncryptionFlag());
        masterUpdate.setDthOperator(tokenResponse.getDthOperatorVersion());
        masterUpdate.setMobileOperator(tokenResponse.getMobOperatorVersion());
        masterUpdate.setBill_pay_max(tokenResponse.getBillpayMaxAmtVersion());
        n70.a aVar = n70.f;
        aVar.a().v(C0059ao.a(3540), tokenResponse.getBannerVersion());
        aVar.a().v(C0059ao.a(3541), tokenResponse.getDthOperatorVersion());
        aVar.a().v(C0059ao.a(3542), tokenResponse.getMobOperatorVersion());
        aVar.a().v(C0059ao.a(3543), tokenResponse.getBillpayMaxAmtVersion());
        aVar.a().y(C0059ao.a(3544), tokenResponse.getAsap());
        aVar.a().y(C0059ao.a(3545), tokenResponse.getChecksumWebUrl());
        qa0.v().i0(masterUpdate);
    }

    public void L(int i) {
        this.q = i;
    }

    public final void M() {
        ArrayList arrayList = (ArrayList) new Gson().fromJson(ua0.e(k()).r(46), new c(this).getType());
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Banner banner = (Banner) arrayList.get(0);
        if (TextUtils.isEmpty(banner.getImageUrl())) {
            return;
        }
        jg0.K(this.u, banner.getImageUrl(), R.drawable.banner1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        String a2 = C0059ao.a(3546);
        String a3 = C0059ao.a(3547);
        String a4 = C0059ao.a(3548);
        if (i == 100) {
            if (i2 == -1) {
                ch0 ch0Var = new ch0(this.p);
                ch0Var.h(a4, a3, false);
                if (TextUtils.isEmpty(ch0Var.f())) {
                    Toast.makeText(k(), a2, 0).show();
                    return;
                } else {
                    J(ch0Var.f(), 1);
                    return;
                }
            }
            k().finish();
        } else if (i == 101) {
            KeyguardManager keyguardManager = (KeyguardManager) k().getSystemService(C0059ao.a(3549));
            if (i2 == -1 || i2 == 1) {
                ch0 ch0Var2 = new ch0(this.p);
                ch0Var2.h(a4, a3, false);
                if (TextUtils.isEmpty(ch0Var2.f())) {
                    Toast.makeText(k(), a2, 0).show();
                } else {
                    J(ch0Var2.f(), 1);
                }
            } else if (i2 != 0) {
            } else {
                if (keyguardManager != null && this.w != keyguardManager.isKeyguardSecure()) {
                    ch0 ch0Var3 = new ch0(this.p);
                    ch0Var3.h(a4, a3, false);
                    if (TextUtils.isEmpty(ch0Var3.f())) {
                        Toast.makeText(k(), a2, 0).show();
                        return;
                    } else {
                        J(ch0Var3.f(), 1);
                        return;
                    }
                }
                k().finish();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.generate_layout /* 2131362305 */:
                this.b.t(65, 4);
                return;
            case R.id.login_forgot_passcode /* 2131362477 */:
                this.b.t(22, 13);
                return;
            case R.id.login_register /* 2131362481 */:
                qa0.d0(null);
                n70.f.a().c(C0059ao.a(3550));
                this.b.t(22, null);
                return;
            case R.id.scan_layout /* 2131362780 */:
                this.b.t(54, 4);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k().getWindow().setSoftInputMode(32);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.new_fragment_login, viewGroup, false);
        this.p = getActivity();
        ua0.e(k()).u(this);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.login_layout);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.qr_layout);
        this.t = (RelativeLayout) inflate.findViewById(R.id.dummy_layout);
        if (n70.f.a().j(C0059ao.a(3551)) == vg0.e) {
            y();
            this.u = (ImageView) inflate.findViewById(R.id.image);
            this.t.setVisibility(0);
            M();
        } else {
            this.t.setVisibility(8);
        }
        ScrollView scrollView = (ScrollView) inflate.findViewById(R.id.login_scroll_view);
        this.l = (TextView) inflate.findViewById(R.id.login_forgot_passcode);
        TextView textView = (TextView) inflate.findViewById(R.id.version);
        textView.setText(C0059ao.a(3552));
        textView.setVisibility(8);
        this.m = (TextView) inflate.findViewById(R.id.login_register);
        ((TextView) inflate.findViewById(R.id.version)).setText(ah0.b(this.p));
        PinEntryView pinEntryView = (PinEntryView) inflate.findViewById(R.id.pin_entry_colors);
        this.r = pinEntryView;
        pinEntryView.addTextChangedListener(new a());
        this.r.getEditText().setOnEditorActionListener(new b());
        this.l.setOnClickListener(this);
        this.m.setOnClickListener(this);
        LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(R.id.scan_layout);
        this.n = linearLayout3;
        linearLayout3.setOnClickListener(this);
        LinearLayout linearLayout4 = (LinearLayout) inflate.findViewById(R.id.generate_layout);
        this.o = linearLayout4;
        linearLayout4.setOnClickListener(this);
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        if (k() == null || isDetached()) {
            return;
        }
        int j = n70.f.a().j(C0059ao.a(3553));
        this.r.clearText();
        if (!n(oliveRequest, result)) {
            eg0.A(k(), result.getResult());
            if (oliveRequest.getRequestType() == 23) {
                String code = result.getCode();
                this.r.clearText();
                code.hashCode();
                char c2 = 65535;
                switch (code.hashCode()) {
                    case 1537:
                        if (code.equals(C0059ao.a(3558))) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 1568:
                        if (code.equals(C0059ao.a(3557))) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 1600:
                        if (code.equals(C0059ao.a(3556))) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 1601:
                        if (code.equals(C0059ao.a(3555))) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 1823:
                        if (code.equals(C0059ao.a(3554))) {
                            c2 = 4;
                            break;
                        }
                        break;
                }
                String a2 = C0059ao.a(3559);
                switch (c2) {
                    case 0:
                        if (j == vg0.e) {
                            y();
                            break;
                        }
                        break;
                    case 1:
                        eg0.f(k(), a2, getString(R.string.device_block), getString(R.string.exit), new DialogInterface.OnClickListener() { // from class: dc0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                rd0.this.C(dialogInterface, i);
                            }
                        });
                        break;
                    case 2:
                        jg0.W(k());
                        break;
                    case 3:
                        jg0.V(k());
                        break;
                    case 4:
                        eg0.f(k(), a2, getString(R.string.customer_block), getString(R.string.exit), new DialogInterface.OnClickListener() { // from class: cc0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                rd0.this.E(dialogInterface, i);
                            }
                        });
                        break;
                }
            } else {
                this.r.clearText();
            }
        } else if (j == vg0.e) {
            y();
        }
        this.r.clearText();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ua0.e(k()).u(this);
        ua0.e(k()).v(null);
        n70.a aVar = n70.f;
        if (aVar.a().j(C0059ao.a(3560)) == 2) {
            aVar.a().v(C0059ao.a(3561), 0);
        }
        z();
        v(4, getString(R.string.login));
        qa0.v().t0(null);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (k() != null && !isDetached()) {
            String code = result.getCode();
            int requestType = oliveRequest.getRequestType();
            String a2 = C0059ao.a(3562);
            String a3 = C0059ao.a(3563);
            String a4 = C0059ao.a(3564);
            if (requestType == 4) {
                TokenResponse tokenResponse = (TokenResponse) result.getData();
                if (tokenResponse != null) {
                    K(tokenResponse);
                }
                n70.f.a().A(a2, true);
                int i = this.q;
                if (i == 36 || i == 56) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(a4, getString(R.string.send_money_merchant));
                    ah0.c(k(), a3, hashMap);
                    if (getActivity() instanceof MainActivity) {
                        this.b.t(5, Boolean.FALSE);
                        this.b.t(6, Integer.valueOf(TransactionData.MODE_MERCHANT_PAY));
                    } else {
                        A(this.q);
                    }
                } else if (i == 31) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(a4, getString(R.string.pending_request));
                    ah0.c(k(), a3, hashMap2);
                    if (getActivity() instanceof MainActivity) {
                        this.b.t(5, Boolean.FALSE);
                        this.b.t(this.q, null);
                    } else {
                        A(this.q);
                    }
                } else {
                    A(0);
                }
                eg0.B();
                return;
            }
            String a5 = C0059ao.a(3565);
            if (requestType != 23) {
                if (requestType != 39) {
                    if (this.g == oliveRequest.getInitiator()) {
                        eg0.B();
                        return;
                    }
                    return;
                }
                if (result.getCode().equals(a5)) {
                    qa0.v().c();
                    eg0.o(k(), getString(R.string.alert), getString(R.string.successfully_deregistered), getString(R.string.okay), new View.OnClickListener() { // from class: ec0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            rd0.this.G(view);
                        }
                    });
                }
                eg0.B();
                return;
            }
            if (code.equals(a5)) {
                n70.a aVar = n70.f;
                aVar.a().A(a2, true);
                aVar.a().v(C0059ao.a(3566), 0);
                String obj = this.r.getText().toString();
                if (!TextUtils.isEmpty(obj)) {
                    new ch0(k()).h(C0059ao.a(3567), c70.g(k(), obj), true);
                }
                int i2 = this.q;
                if (i2 == 36 || i2 == 56) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put(a4, getString(R.string.send_money_merchant));
                    ah0.c(k(), a3, hashMap3);
                    if (getActivity() instanceof MainActivity) {
                        this.b.t(5, Boolean.FALSE);
                        this.b.t(6, Integer.valueOf(TransactionData.MODE_MERCHANT_PAY));
                    } else {
                        A(this.q);
                    }
                } else if (i2 == 31) {
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put(a4, getString(R.string.pending_request));
                    ah0.c(k(), a3, hashMap4);
                    if (getActivity() instanceof MainActivity) {
                        this.b.t(5, Boolean.FALSE);
                        this.b.t(this.q, null);
                    } else {
                        A(this.q);
                    }
                } else if (i2 == 30) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put(a4, getString(R.string.deregister));
                    ah0.c(k(), a3, hashMap5);
                    ua0.e(k()).w();
                } else {
                    A(0);
                }
            }
            eg0.B();
            return;
        }
        eg0.B();
    }

    public final void y() {
        Intent createConfirmDeviceCredentialIntent;
        KeyguardManager keyguardManager = (KeyguardManager) this.p.getSystemService(C0059ao.a(3568));
        if (keyguardManager != null) {
            if (!keyguardManager.isKeyguardSecure()) {
                this.w = false;
                startActivityForResult(new Intent(C0059ao.a(3569)), 101);
            } else if (!jg0.D() || (createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(getString(R.string.app_name), getString(R.string.unlock_to_login))) == null || this.v) {
            } else {
                startActivityForResult(createConfirmDeviceCredentialIntent, 100);
                this.v = true;
            }
        }
    }

    public void z() {
        int i = this.s;
        String a2 = C0059ao.a(3570);
        if (!j(a2, i)) {
            if (this.f < 2) {
                q(a2);
                return;
            }
            return;
        }
        this.b.o(201, null);
    }
}
