package org.npci.upi.security.pinactivitycomponent;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;
import in.org.npci.commonlibrary.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import myunmn.C0059ao;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemPager;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemView;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class p extends m implements FormItemView.a {
    public static final String J = m.class.getSimpleName();
    public Message A;
    public Boolean B;
    public String C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public Boolean H;
    public String I;
    public int s = 0;
    public Boolean t;
    public Timer u;
    public Boolean v;
    public ViewFlipper w;
    public WebView x;
    public HashMap<String, String> y;
    public boolean z;

    public p() {
        Boolean bool = Boolean.FALSE;
        this.t = bool;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = new HashMap<>();
        this.z = false;
        this.B = bool;
        this.C = C0059ao.a(2491);
        this.G = false;
        this.H = bool;
    }

    public final void A(int i) {
        int i2 = this.g;
        if (i2 != -1 && (this.f.get(i2) instanceof FormItemView)) {
            FormItemView formItemView = (FormItemView) this.f.get(this.g);
            r(formItemView);
            formItemView.u();
        }
        int size = this.f.size();
        while (i < size) {
            if (i != this.g) {
                final org.npci.upi.security.pinactivitycomponent.widget.a aVar = this.f.get(i);
                final Drawable f = t8.f(getActivity(), R.drawable.ic_visibility_on);
                Drawable f2 = t8.f(getActivity(), R.drawable.ic_visibility_blue_24px);
                final Drawable f3 = t8.f(getActivity(), R.drawable.ic_visibility_off);
                final String string = getString(R.string.action_hide);
                final String string2 = getString(R.string.action_show);
                aVar.a(string2, f2, new View.OnClickListener(this) { // from class: org.npci.upi.security.pinactivitycomponent.p.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        org.npci.upi.security.pinactivitycomponent.widget.a aVar2;
                        String str;
                        Drawable drawable;
                        int i3;
                        boolean z;
                        boolean z2;
                        int c = aVar.c();
                        boolean d = aVar.d();
                        if (c == 0) {
                            aVar2 = aVar;
                            str = d ? string : string2;
                            drawable = d ? f3 : f;
                            i3 = 0;
                            z = true;
                            z2 = false;
                        } else {
                            aVar2 = aVar;
                            str = d ? string : string2;
                            drawable = d ? f3 : f;
                            i3 = 0;
                            z = true;
                            z2 = true;
                        }
                        aVar2.a(str, drawable, this, i3, z, z2);
                    }
                }, 0, true, false);
            }
            i++;
        }
    }

    public final void B() {
        FormItemView formItemView;
        String inputValue;
        int i = this.g;
        if (i != -1 && (this.f.get(i) instanceof FormItemView) && ((inputValue = (formItemView = (FormItemView) this.f.get(this.g)).getInputValue()) == null || inputValue.length() != formItemView.getInputLength())) {
            n(formItemView, getString(R.string.invalid_otp));
            return;
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            if (this.f.get(i2) instanceof FormItemView) {
                FormItemView formItemView2 = (FormItemView) this.f.get(i2);
                if (formItemView2.getInputValue().length() != formItemView2.getInputLength()) {
                    n(formItemView2, getString(R.string.error_message_mpin, Integer.valueOf(this.D)));
                    return;
                }
            }
        }
        if (this.z) {
            return;
        }
        this.z = true;
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            try {
                JSONObject jSONObject = (JSONObject) this.f.get(i3).getFormDataTag();
                String string = jSONObject.getString(C0059ao.a(2492));
                String string2 = jSONObject.getString(C0059ao.a(2493));
                this.c.put(C0059ao.a(2494), this.f.get(i3).getInputValue());
                JSONObject jSONObject2 = this.c;
                JSONArray jSONArray = new JSONArray();
                jSONObject2.put(C0059ao.a(2495), this.I);
                jSONArray.put(((GetCredential) this.p).l0().b().b(jSONObject2));
                Message b = ((GetCredential) this.p).l0().d().b(jSONArray.getString(0), string, string2, jSONObject2);
                this.A = b;
                if (b != null) {
                    this.y.put(string2, j.a(b));
                }
            } catch (Exception e) {
                l.a(J, e);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable(C0059ao.a(2496), this.y);
        ((GetCredential) this.p).l0().f().send(1, bundle);
        ((GetCredential) this.p).l0().e().finish();
    }

    public final boolean C() {
        Boolean bool;
        Boolean bool2 = this.v;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.d.length(); i++) {
                try {
                    String string = this.d.getJSONObject(i).getString(C0059ao.a(2497));
                    if (string != null) {
                        arrayList.add(string);
                    }
                } catch (Exception e) {
                    l.a(J, e);
                }
            }
            if (arrayList.contains(C0059ao.a(2498)) || arrayList.contains(C0059ao.a(2499)) || arrayList.contains(C0059ao.a(2500)) || arrayList.contains(C0059ao.a(2501)) || (arrayList.contains(C0059ao.a(2502)) && arrayList.contains(C0059ao.a(2503)))) {
                bool = Boolean.TRUE;
                this.v = bool;
                return bool.booleanValue();
            }
        }
        bool = Boolean.FALSE;
        this.v = bool;
        return bool.booleanValue();
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.FormItemView.a
    public void b(int i) {
        if (this.f.get(i) instanceof FormItemPager) {
            return;
        }
        this.s = i;
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.FormItemView.a
    public void d(int i, String str) {
        int i2 = this.g;
        if (i2 != -1 && i2 == i && (this.f.get(i2) instanceof FormItemView)) {
            p(this.u);
            ((FormItemView) this.f.get(this.g)).l(false);
            ((FormItemView) this.f.get(this.g)).k(C0059ao.a(2504), null, false, false);
            ((FormItemView) this.f.get(this.g)).j(t8.f(getActivity(), R.drawable.ic_tick_ok), true);
            this.B = Boolean.TRUE;
        }
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.FormItemView.a
    public void f(View view, String str) {
        n(view, str);
    }

    @Override // org.npci.upi.security.pinactivitycomponent.m
    public void l() {
        View view;
        String string;
        if (this.f.size() == 1) {
            B();
        } else if (this.s == 0) {
            if (!C()) {
                if (((FormItemView) this.f.get(0)).getInputLength() != this.f.get(0).getInputValue().length()) {
                    n((View) this.f.get(0), getString(R.string.error_message_mpin, Integer.valueOf(this.D)));
                    return;
                }
                this.w.showNext();
                this.s++;
            } else if (((FormItemView) this.f.get(0)).getInputLength() == this.f.get(0).getInputValue().length()) {
                this.w.setDisplayedChild(this.s + 1);
                this.s++;
            } else {
                if (this.E != 1) {
                    view = (View) this.f.get(0);
                    string = getString(R.string.error_message_otp, Integer.valueOf(this.E));
                } else {
                    view = (View) this.f.get(0);
                    string = getString(R.string.error_message_mpin, Integer.valueOf(this.D));
                }
                n(view, string);
            }
        } else {
            if (this.t.booleanValue()) {
                int i = this.s;
                if (i == 1) {
                    if (((FormItemView) this.f.get(1)).getInputLength() != this.f.get(1).getInputValue().length()) {
                        n((View) this.f.get(1), getString(R.string.error_message_atm_pin, Integer.valueOf(this.F)));
                        return;
                    }
                    this.w.showNext();
                    this.s++;
                    return;
                }
                if (!this.f.get(i).e()) {
                    n((View) this.f.get(this.s), getString(R.string.componentMessage));
                }
                int i2 = this.s;
                if (i2 != 2 || !this.f.get(i2).b()) {
                    return;
                }
            } else {
                int i3 = this.s;
                if (i3 == 0) {
                    this.w.showNext();
                    this.s++;
                    return;
                } else if (i3 == 1) {
                    if (!this.f.get(i3).e()) {
                        n((View) this.f.get(this.s), getString(R.string.componentMessage));
                        return;
                    } else if (this.f.get(this.s).b()) {
                        B();
                        return;
                    } else {
                        return;
                    }
                } else if (i3 != 2 || !this.f.get(i3).b()) {
                    return;
                }
            }
            B();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_pin, viewGroup, false);
    }

    @Override // org.npci.upi.security.pinactivitycomponent.m, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.main_inner_layout);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.main_layout);
        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.progressbar_layout);
        LinearLayout linearLayout4 = (LinearLayout) view.findViewById(R.id.progressbar_otp);
        v();
        x(view);
        try {
            this.I = this.c.getString(C0059ao.a(2505));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // org.npci.upi.security.pinactivitycomponent.m
    public void t() {
        if (this.B.booleanValue()) {
            this.B = Boolean.FALSE;
            o(Boolean.TRUE);
            ((FormItemView) this.f.get(this.g)).j(t8.f(getActivity(), R.drawable.ic_tick_ok), false);
        }
    }

    public void w() {
        WebView webView = this.x;
        if (webView != null) {
            webView.destroy();
        }
    }

    public final void x(View view) {
        this.w = (ViewFlipper) view.findViewById(R.id.view_switcher);
        if (C()) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.d.length(); i++) {
                try {
                    jSONArray.put(i, this.d.get(i));
                } catch (JSONException e) {
                    l.b(J, C0059ao.a(2506) + e);
                }
            }
            this.d = jSONArray;
            z(view, 0);
            A(0);
        } else {
            z(view, 0);
            A(0);
        }
        view.getFocusables(2).get(0).requestFocus();
    }

    public final void y(View view, int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getActivity());
        linearLayout.setLayoutParams(layoutParams);
        if (Build.VERSION.SDK_INT >= 11) {
            linearLayout.setDividerDrawable(getResources().getDrawable(R.drawable.fragment_transparent_divider));
        }
        linearLayout.setPadding(16, 0, 16, 0);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        linearLayout.setId(i);
        this.w.addView(linearLayout, i2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:27|28|(3:84|85|(10:89|31|(2:33|(4:35|(1:54)(3:42|(2:43|(1:53)(2:45|(2:48|49)(1:47)))|50)|51|52)(4:55|(2:66|(1:68))|69|(1:73)))|74|75|76|77|78|80|16))|30|31|(0)|74|75|76|77|78|80|16) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0353, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ea, code lost:
        if (r2.equals(r15) == false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f A[Catch: Exception -> 0x02a1, TryCatch #3 {Exception -> 0x02a1, blocks: (B:43:0x0112, B:45:0x0118, B:47:0x012a, B:49:0x0149, B:51:0x014f, B:53:0x0155, B:56:0x017b, B:58:0x0188, B:61:0x0193, B:63:0x019b, B:65:0x01bb, B:66:0x01cf, B:67:0x01d2, B:68:0x01de, B:70:0x01e8, B:69:0x01e1, B:71:0x01ec, B:73:0x01f2, B:75:0x01f8, B:77:0x01fe, B:79:0x0204, B:82:0x020b, B:84:0x0211, B:85:0x0222, B:87:0x0268, B:89:0x0274, B:90:0x0279), top: B:121:0x0112 }] */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r1v30, types: [android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(android.view.View r21, java.lang.Integer r22) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.p.z(android.view.View, java.lang.Integer):void");
    }
}
