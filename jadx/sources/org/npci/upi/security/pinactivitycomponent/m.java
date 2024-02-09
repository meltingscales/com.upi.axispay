package org.npci.upi.security.pinactivitycomponent;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Timer;
import java.util.TimerTask;
import myunmn.C0059ao;
import org.json.JSONArray;
import org.json.JSONObject;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemView;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class m extends Fragment implements FormItemView.a {
    public PopupWindow h;
    public Timer j;
    public Handler k;
    public Runnable l;
    public Context p;
    public JSONObject b = null;
    public JSONObject c = null;
    public JSONArray d = null;
    public Timer e = null;
    public ArrayList<org.npci.upi.security.pinactivitycomponent.widget.a> f = new ArrayList<>();
    public int g = -1;
    public Timer i = null;
    public JSONObject m = null;
    public JSONArray n = new JSONArray();
    public long o = 3000;
    public String q = C0059ao.a(2624);
    public boolean r = false;

    private void w() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = null;
        JSONObject jSONObject3 = null;
        JSONObject jSONObject4 = null;
        JSONObject jSONObject5 = null;
        for (int i = 0; i < this.d.length(); i++) {
            try {
                String optString = ((JSONObject) this.d.get(i)).optString(C0059ao.a(2625), C0059ao.a(2626));
                if (optString.equals(C0059ao.a(2627))) {
                    jSONObject = this.d.getJSONObject(i);
                }
                if (optString.equals(C0059ao.a(2628))) {
                    jSONObject3 = this.d.getJSONObject(i);
                }
                if (optString.matches(C0059ao.a(2629))) {
                    jSONObject5 = this.d.getJSONObject(i);
                }
                if (optString.equals(C0059ao.a(2630))) {
                    jSONObject2 = this.d.getJSONObject(i);
                }
                if (optString.equals(C0059ao.a(2631))) {
                    jSONObject4 = this.d.getJSONObject(i);
                }
            } catch (Exception e) {
                l.a(C0059ao.a(2632), e);
            }
        }
        if (this.d.length() == 3 && jSONObject != null && jSONObject5 != null && jSONObject2 != null) {
            arrayList.add(jSONObject5);
            arrayList.add(jSONObject);
            arrayList.add(jSONObject2);
        }
        if (this.d.length() == 3 && jSONObject3 != null && jSONObject5 != null && jSONObject2 != null) {
            arrayList.add(jSONObject5);
            arrayList.add(jSONObject3);
            arrayList.add(jSONObject2);
        }
        if (this.d.length() == 2 && jSONObject5 != null && jSONObject2 != null) {
            arrayList.add(jSONObject5);
            arrayList.add(jSONObject2);
        }
        if (this.d.length() == 2 && jSONObject2 != null && jSONObject4 != null) {
            arrayList.add(jSONObject2);
            arrayList.add(jSONObject4);
        }
        if (arrayList.size() > 0) {
            this.d = new JSONArray((Collection) arrayList);
        }
    }

    public int j(float f) {
        return (int) (f * (getResources().getDisplayMetrics().densityDpi / 160));
    }

    public FormItemView k(String str, int i, int i2, String str2, String str3) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        FormItemView formItemView = new FormItemView(getActivity(), this.p);
        formItemView.setActionBarPositionTop(true);
        layoutParams.width = -2;
        formItemView.getFormInputView().setCharSize(0.0f);
        formItemView.getFormInputView().setSpace(j(15.0f));
        formItemView.getFormInputView().setFontSize(j(24.0f));
        formItemView.getFormInputView().setMargin(new int[]{80, j(25.0f), 80, 0});
        formItemView.getFormInputView().setLineStrokeCentered(true);
        formItemView.getFormInputView().setLineStrokeSelected(j(2.0f));
        formItemView.getFormInputView().setColorStates(t8.e(getActivity(), R.color.form_item_input_colors_transparent));
        formItemView.setLayoutParams(layoutParams);
        formItemView.setInputLength(i2);
        formItemView.setFormItemListener(this);
        formItemView.setTitle(str);
        formItemView.setFormItemTag(i);
        formItemView.setEducationalText(str2);
        formItemView.setSubtype(str3);
        return formItemView;
    }

    public abstract void l();

    public void m(final int i) {
        if (getActivity() != null && (getActivity() instanceof GetCredential)) {
            ((GetCredential) getActivity()).x0(i);
        }
        final o oVar = new o(getActivity());
        Timer timer = new Timer();
        this.e = timer;
        timer.scheduleAtFixedRate(new TimerTask() { // from class: org.npci.upi.security.pinactivitycomponent.m.1
            public long b = System.currentTimeMillis() - 45000;

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                final n c = oVar.c(i, this.b - 2000);
                if (c != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: org.npci.upi.security.pinactivitycomponent.m.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            m.this.q(c);
                        }
                    });
                }
                this.b = System.currentTimeMillis();
            }
        }, 100L, 2000L);
    }

    public void n(View view, String str) {
        PopupWindow popupWindow = this.h;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        final View findViewById = getActivity().findViewById(R.id.popupView);
        findViewById.setVisibility(0);
        findViewById.setAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.npci_slide_in_top));
        ((TextView) findViewById.findViewById(R.id.popup_text)).setText(str);
        findViewById.findViewById(R.id.popup_button).setOnClickListener(new View.OnClickListener(this) { // from class: org.npci.upi.security.pinactivitycomponent.m.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                findViewById.setVisibility(8);
            }
        });
        this.j = new Timer();
        Handler handler = new Handler(Looper.getMainLooper());
        this.k = handler;
        Runnable runnable = new Runnable(this) { // from class: org.npci.upi.security.pinactivitycomponent.m.3
            @Override // java.lang.Runnable
            public void run() {
                findViewById.setVisibility(8);
            }
        };
        this.l = runnable;
        handler.postDelayed(runnable, this.o);
    }

    public void o(Boolean bool) {
        if (!this.r || bool.booleanValue()) {
            getActivity().runOnUiThread(new Runnable() { // from class: org.npci.upi.security.pinactivitycomponent.m.4
                @Override // java.lang.Runnable
                public void run() {
                    m mVar = m.this;
                    int i = mVar.g;
                    if (i == -1 || !(mVar.f.get(i) instanceof FormItemView)) {
                        return;
                    }
                    m mVar2 = m.this;
                    ((FormItemView) mVar2.f.get(mVar2.g)).l(false);
                }
            });
        } else {
            FormItemView formItemView = (FormItemView) this.f.get(this.g);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.p = context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Runnable runnable;
        super.onDestroy();
        p(this.e);
        p(this.i);
        p(this.j);
        Handler handler = this.k;
        if (handler != null && (runnable = this.l) != null) {
            handler.removeCallbacks(runnable);
        }
        PopupWindow popupWindow = this.h;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getActivity() instanceof GetCredential) {
            ((GetCredential) getActivity()).w0(this);
        }
    }

    public void p(Timer timer) {
        if (timer != null) {
            try {
                timer.cancel();
            } catch (Exception e) {
                l.a(C0059ao.a(2633), e);
            }
        }
    }

    public void q(n nVar) {
        try {
            int i = this.g;
            if (i != -1) {
                this.r = true;
                this.f.get(i).setText(nVar.c());
            }
        } catch (Exception unused) {
        }
    }

    public void r(FormItemView formItemView) {
        formItemView.a(C0059ao.a(2634), null, null, 0, false, false);
        formItemView.j(null, false);
        formItemView.k(getString(R.string.waiting_for_otp), null, true, false);
        formItemView.l(false);
    }

    public abstract void t();

    public void u(n nVar) {
        q(nVar);
    }

    public void v() {
        String a = C0059ao.a(2635);
        String a2 = C0059ao.a(2636);
        String a3 = C0059ao.a(2637);
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                String string = arguments.getString(C0059ao.a(2638));
                if (string != null) {
                    this.b = new JSONObject(string);
                }
                if (this.b.has(a2)) {
                    this.b.getString(a2);
                }
                String string2 = arguments.getString(C0059ao.a(2639));
                if (string2 != null) {
                    JSONObject jSONObject = new JSONObject(string2);
                    this.m = jSONObject;
                    String string3 = jSONObject.getString(C0059ao.a(2640));
                    if (string3 != null) {
                        this.d = new JSONArray(string3);
                        w();
                    }
                }
                String string4 = arguments.getString(C0059ao.a(2641));
                if (string4 != null) {
                    this.c = new JSONObject(string4);
                }
                String string5 = arguments.getString(C0059ao.a(2642));
                if (string5 != null) {
                    this.n = new JSONArray(string5);
                }
                for (int i = 0; i < this.n.length(); i++) {
                    try {
                    } catch (Exception e) {
                        l.a(a3, e);
                    }
                    if (((JSONObject) this.n.get(i)).optString(C0059ao.a(2643), a).equals(C0059ao.a(2644))) {
                        String optString = ((JSONObject) this.n.get(i)).optString(C0059ao.a(2645), a);
                        this.q = optString;
                        this.q = optString.substring(optString.length() - 4, this.q.length());
                        this.q = C0059ao.a(2646) + this.q;
                        return;
                    }
                    continue;
                }
            } catch (Exception e2) {
                l.b(a3, C0059ao.a(2647) + e2);
            }
        }
    }
}
