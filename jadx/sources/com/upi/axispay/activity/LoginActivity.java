package com.upi.axispay.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.OliveUpiManager;
import com.olive.upi.transport.model.Registration;
import com.upi.axispay.R;
import defpackage.n70;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class LoginActivity extends c90 implements mg0 {
    public int D;
    public Fragment E = null;
    public Fragment F = null;

    public final void d0(String str, Fragment fragment) {
        e0(str, fragment, true);
    }

    public final void e0(String str, Fragment fragment, boolean z) {
        this.F = fragment;
        FragmentManager D = D();
        a0(this.E, this.F);
        je n = D.n();
        if (z) {
            n.h(str);
        }
        n.s(R.id.fragment_login, this.F, str);
        n.k();
        this.E = this.F;
    }

    public final void f0(Bundle bundle) {
        int i;
        if (bundle != null && (i = bundle.getInt(C0059ao.a(10738))) != 0) {
            t(i, null);
        } else {
            t(4, null);
        }
    }

    public final void g0() {
        Intent intent = new Intent(this, LoginActivity.class);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.setFlags(67108864);
        startActivity(intent);
    }

    @Override // defpackage.mg0
    public void m(int i, String str) {
        this.D = i;
    }

    @Override // defpackage.mg0
    public void o(int i, Object obj) {
        if (i != 201) {
            return;
        }
        b0(this.t);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (D().o0() <= 1) {
            int i = this.D;
            if (i == 37) {
                n70.f.a().c(C0059ao.a(10739));
            } else if (i == 4 || i == 55 || i == 65 || i == 54) {
                super.onBackPressed();
                return;
            }
            finish();
            return;
        }
        super.onBackPressed();
    }

    @Override // defpackage.c90, defpackage.sd, androidx.activity.ComponentActivity, defpackage.j8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xg0.b(this);
        requestWindowFeature(1);
        setContentView(R.layout.activity_login);
        f0(getIntent().getExtras());
        ua0.e(this).q(new OliveRequest(86, 80, Boolean.TRUE, true));
    }

    @Override // defpackage.sd, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        try {
            f0(intent.getExtras());
        } catch (Exception unused) {
            g0();
        }
    }

    @Override // defpackage.c90, defpackage.sd, android.app.Activity
    public void onResume() {
        super.onResume();
        OliveUpiManager.getInstance(this);
        n70.a aVar = n70.f;
        n70 a = aVar.a();
        String a2 = C0059ao.a(10740);
        if (a.j(a2) > 2) {
            aVar.a().y(a2, String.valueOf(0));
            finish();
        }
    }

    @Override // defpackage.mg0
    public void t(int i, Object obj) {
        if (this.D == i) {
            return;
        }
        this.D = i;
        String valueOf = String.valueOf(i);
        this.r = 0;
        if (i == 4) {
            e0(valueOf, new rd0(), false);
        } else if (i == 13) {
            d0(valueOf, new mf0());
        } else if (i == 22) {
            this.r = 22;
            d0(valueOf, he0.S(obj != null ? ((Integer) obj).intValue() : 0));
        } else if (i == 37) {
            d0(valueOf, jf0.E((Registration) obj));
        } else if (i == 65) {
            int intValue = obj != null ? ((Integer) obj).intValue() : 0;
            qe0 z = qe0.z();
            z.C(intValue);
            d0(valueOf, z);
        } else if (i == 72) {
            d0(valueOf, jd0.C());
        } else if (i == 54) {
            cf0 G = cf0.G();
            G.M(obj);
            d0(valueOf, G);
        } else if (i == 55) {
            d0(valueOf, df0.C((hg0) obj));
        } else if (i == 74) {
            d0(valueOf, nf0.z());
        } else if (i != 75) {
            rd0 rd0Var = new rd0();
            rd0Var.L(i);
            d0(valueOf, rd0Var);
        } else {
            d0(valueOf, uf0.B(((Integer) obj).intValue()));
        }
    }
}
