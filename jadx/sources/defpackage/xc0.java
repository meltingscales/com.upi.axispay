package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Fade;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.upi.axispay.R;
import com.upi.axispay.activity.LoginActivity;
import defpackage.y80;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: xc0  reason: default package */
/* loaded from: classes.dex */
public class xc0 extends Fragment {
    public mg0 b;
    public z c;
    public String d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public Activity j;
    public String k = C0059ao.a(1025);

    /* compiled from: AxisPay */
    /* renamed from: xc0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (xc0.this.getActivity() == null) {
                xc0.this.r();
            }
            ua0.e(xc0.this.getActivity()).v(null);
            qa0.v().c();
            Intent intent = new Intent(xc0.this.getActivity(), LoginActivity.class);
            intent.setFlags(67108864);
            xc0.this.startActivity(intent);
            xc0.this.getActivity().finish();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xc0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (xc0.this.getActivity() == null) {
                xc0.this.r();
            }
            ua0.e(xc0.this.getActivity()).v(null);
            qa0.v().c();
            Intent intent = new Intent(xc0.this.getActivity(), LoginActivity.class);
            intent.setFlags(67108864);
            xc0.this.startActivity(intent);
            xc0.this.getActivity().finish();
        }
    }

    public boolean j(String str, int i) {
        try {
            this.e = i;
            this.f++;
            if (t8.a(this.c, str) != 0) {
                if (d8.p(this.c, str)) {
                    if (n70.f.a().e(C0059ao.a(1026))) {
                        l(i);
                    }
                } else {
                    requestPermissions(new String[]{str}, 100);
                }
                return false;
            }
            l(i);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public z k() {
        return this.c;
    }

    public void l(int i) {
    }

    public void m(int i) {
    }

    public boolean n(OliveRequest oliveRequest, Result result) {
        return o(oliveRequest, result, true);
    }

    public boolean o(OliveRequest oliveRequest, Result result, boolean z) {
        if (k() != null && !isDetached()) {
            if (oliveRequest.getRequestType() == 4) {
                c70.q();
            }
            if (result != null) {
                String a2 = result.getCode() == null ? C0059ao.a(1027) : result.getCode();
                if (a2.equals(C0059ao.a(1028))) {
                    if (oliveRequest.getInitiator() == this.g && !oliveRequest.isBackgroundCall()) {
                        eg0.x(getView(), R.string.unable_to_process_your_req);
                    }
                    return true;
                }
                if (a2.equalsIgnoreCase(C0059ao.a(1029))) {
                    eg0.x(getView(), R.string.unable_to_process);
                    c70.q();
                } else if (a2.equalsIgnoreCase(C0059ao.a(1030))) {
                    c70.q();
                } else if (a2.equals(C0059ao.a(1031))) {
                    eg0.x(getView(), R.string.no_internet);
                    return true;
                } else if (a2.equals(C0059ao.a(1032))) {
                    eg0.B();
                    eg0.p(getActivity(), getString(R.string.session_timeout), getString(R.string.session_expired_login_continue), getString(R.string.login), new a(), new b());
                    return true;
                } else if (a2.equals(C0059ao.a(1033))) {
                    eg0.B();
                    return true;
                } else if (oliveRequest.getInitiator() != this.g || oliveRequest.isBackgroundCall()) {
                    return true;
                } else {
                    if (TextUtils.isEmpty(result.getResult())) {
                        eg0.m(getActivity(), getString(R.string.Miscellaneous_App_Error));
                        return true;
                    }
                }
                return false;
            }
            if (oliveRequest.getInitiator() == this.g && !oliveRequest.isBackgroundCall() && z) {
                eg0.m(getActivity(), getString(R.string.Miscellaneous_App_Error));
            }
            return true;
        }
        r();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.c = (z) activity;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.h = true;
        this.j = getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.h = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.b = null;
        this.c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.h = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (strArr == null || strArr.length <= 0 || iArr == null || iArr.length <= 0) {
            return;
        }
        int length = iArr.length;
        String a2 = C0059ao.a(1034);
        if (length > 0 && iArr[0] == 0) {
            m(this.e);
            n70.f.a().A(a2, false);
            return;
        }
        int i2 = this.f;
        if (i2 < 2) {
            this.f = i2 + 1;
            requestPermissions(strArr, 100);
            return;
        }
        n70.f.a().A(a2, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.c != null && getActivity() != null && !isDetached()) {
            if (this.d != null) {
                Tracker a2 = y80.b().a(y80.b.APP);
                HitBuilders.ScreenViewBuilder screenViewBuilder = new HitBuilders.ScreenViewBuilder();
                a2.setScreenName(this.d);
                a2.set(C0059ao.a(1036), jg0.o(n70.f.a().m(C0059ao.a(1035))));
                a2.send(screenViewBuilder.build());
            }
            this.b.m(this.g, this.d);
            return;
        }
        r();
    }

    public void p(Object obj) {
    }

    public void q(String str) {
        this.f++;
        requestPermissions(new String[]{str}, 100);
    }

    public void r() {
        Runtime.getRuntime().exit(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.i = z;
    }

    public void t(Fragment fragment) {
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        Fade fade = new Fade();
        fade.setDuration(300L);
        if (fragment != null) {
            fragment.setExitTransition(fade);
            fragment.setEnterTransition(fade);
        }
    }

    public void u(int i) {
        this.g = i;
    }

    public void v(int i, String str) {
        this.d = str;
        this.g = i;
    }

    public void w(String str) {
        this.d = str;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof mg0) {
            this.b = (mg0) context;
        }
    }
}
