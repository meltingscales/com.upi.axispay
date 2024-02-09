package org.npci.upi.security.pinactivitycomponent;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.SmsMessage;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.Thread;
import java.util.Date;
import java.util.Locale;
import myunmn.C0059ao;
import myunmn.S;
import org.json.JSONArray;
import org.json.JSONObject;
import org.npci.upi.security.pinactivitycomponent.Keypad;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class GetCredential extends z {
    public static final String L = GetCredential.class.getSimpleName();
    public a A;
    public View B;
    public View C;
    public TransitionDrawable D;
    public ImageView E;
    public int F;
    public Fragment I;
    public i x;
    public org.npci.upi.security.pinactivitycomponent.a y;
    public final Context q = this;
    public JSONObject r = null;
    public JSONObject s = null;
    public JSONObject t = null;
    public JSONArray u = null;
    public JSONArray v = new JSONArray();
    public String w = C0059ao.a(757);
    public m z = null;
    public boolean G = false;
    public int H = 0;
    public Thread.UncaughtExceptionHandler J = null;
    public Boolean K = Boolean.FALSE;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        public final void a(Intent intent) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                Object[] objArr = (Object[]) extras.get(C0059ao.a(4338));
                int length = objArr.length;
                SmsMessage[] smsMessageArr = new SmsMessage[length];
                for (int i = 0; i < length; i++) {
                    smsMessageArr[i] = SmsMessage.createFromPdu((byte[]) objArr[i]);
                    String upperCase = smsMessageArr[i].getOriginatingAddress().toUpperCase();
                    String upperCase2 = smsMessageArr[i].getMessageBody().toUpperCase();
                    new Date(smsMessageArr[i].getTimestampMillis());
                    n d = new o(GetCredential.this.q).d(GetCredential.this.H, upperCase, upperCase2);
                    if (d != null) {
                        GetCredential.this.z.u(d);
                    }
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                if (intent.getAction().equals(C0059ao.a(4339))) {
                    a(intent);
                }
            } catch (Exception e) {
                l.a(GetCredential.L, e);
            }
        }
    }

    public final void A0() {
        try {
            a aVar = this.A;
            if (aVar != null) {
                unregisterReceiver(aVar);
                this.A = null;
            }
        } catch (Throwable unused) {
            l.b(L, C0059ao.a(758));
        }
    }

    public final void i0() {
        String str;
        String a2;
        StringBuilder sb;
        b bVar;
        this.x = new i();
        try {
            this.y = new org.npci.upi.security.pinactivitycomponent.a(getApplicationContext(), this.x, this);
            this.x.c(getIntent().getExtras(), this);
        } catch (b e) {
            str = L;
            StringBuilder sb2 = new StringBuilder();
            a2 = e.a();
            bVar = e;
            sb = sb2;
            sb.append(a2);
            sb.append(bVar);
            l.b(str, sb.toString());
        } catch (Exception e2) {
            str = L;
            StringBuilder sb3 = new StringBuilder();
            a2 = C0059ao.a(759);
            bVar = e2;
            sb = sb3;
            sb.append(a2);
            sb.append(bVar);
            l.b(str, sb.toString());
        }
    }

    public boolean j0() {
        return checkCallingOrSelfPermission(C0059ao.a(760)) == 0;
    }

    public boolean k0() {
        return checkCallingOrSelfPermission(C0059ao.a(761)) == 0;
    }

    public org.npci.upi.security.pinactivitycomponent.a l0() {
        return this.y;
    }

    public final void m0() {
        Bundle bundle = new Bundle();
        bundle.putString(C0059ao.a(762), C0059ao.a(763));
        l0().f().send(0, bundle);
        finish();
    }

    public final boolean n0() {
        return this.B.getVisibility() == 0;
    }

    public void o0(m mVar, Bundle bundle, boolean z) {
        try {
            FragmentManager D = D();
            if (bundle != null) {
                mVar.setArguments(bundle);
            }
            je n = D.n();
            n.r(R.id.main_inner_layout, mVar);
            if (z) {
                n.h(mVar.getClass().getSimpleName());
            }
            n.k();
            w0(mVar);
        } catch (Exception unused) {
            l.b(C0059ao.a(764), C0059ao.a(765));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.G) {
            this.G = true;
            Toast.makeText(this, getString(R.string.back_button_exit_message), 0).show();
            new Handler().postDelayed(new Runnable() { // from class: org.npci.upi.security.pinactivitycomponent.GetCredential.2
                @Override // java.lang.Runnable
                public void run() {
                    GetCredential.this.G = false;
                }
            }, 2000L);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(C0059ao.a(766), C0059ao.a(767));
        l0().f().send(0, bundle);
        Fragment fragment = this.I;
        if (fragment != null) {
            ((p) fragment).w();
        }
        super.onBackPressed();
    }

    @Override // defpackage.z, defpackage.sd, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.sd, androidx.activity.ComponentActivity, defpackage.j8, android.app.Activity
    public void onCreate(Bundle bundle) {
        S.a(getWindow(), UserMetadata.MAX_INTERNAL_KEY_SIZE, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        super.onCreate(bundle);
        this.J = Thread.currentThread().getUncaughtExceptionHandler();
        Thread.currentThread().setUncaughtExceptionHandler(new g());
        q0();
        r0();
        setContentView(R.layout.activity_pin_activity_component);
        t0();
        u0();
        y0();
        i0();
        ((LinearLayout) findViewById(R.id.toolBar)).setPadding(0, 10, 0, 0);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.main_inner_layout);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.transaction_info_root);
        if (this.K.booleanValue()) {
            frameLayout.setPadding(0, 50, 0, 0);
        } else {
            frameLayout2.setVisibility(8);
        }
        p pVar = new p();
        this.I = pVar;
        o0(pVar, getIntent().getExtras(), false);
        TextView textView = (TextView) findViewById(R.id.go_back);
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: org.npci.upi.security.pinactivitycomponent.GetCredential.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    GetCredential.this.m0();
                }
            });
        }
    }

    @Override // defpackage.z, defpackage.sd, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Thread.currentThread().setUncaughtExceptionHandler(this.J);
    }

    @Override // defpackage.sd, android.app.Activity
    public void onPause() {
        super.onPause();
        A0();
    }

    @Override // defpackage.sd, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!k0()) {
            l.b(L, C0059ao.a(768));
            return;
        }
        this.A = new a();
        s0();
    }

    public final int p0(float f) {
        return (int) (f * (getResources().getDisplayMetrics().densityDpi / 160));
    }

    public final void q0() {
        String string;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            try {
                String string2 = extras.getString(C0059ao.a(769));
                if (string2 != null) {
                    this.r = new JSONObject(string2);
                }
                String string3 = extras.getString(C0059ao.a(770));
                if (string3 != null) {
                    JSONObject jSONObject = new JSONObject(string3);
                    this.s = jSONObject;
                    if (jSONObject != null && (string = jSONObject.getString(C0059ao.a(771))) != null) {
                        this.u = new JSONArray(string);
                    }
                }
                String string4 = extras.getString(C0059ao.a(772));
                if (string4 != null) {
                    this.t = new JSONObject(string4);
                }
                String string5 = extras.getString(C0059ao.a(773));
                if (string5 != null) {
                    this.v = new JSONArray(string5);
                }
                String string6 = extras.getString(C0059ao.a(774));
                if (string6 != null) {
                    this.w = string6;
                    String[] split = string6.split(C0059ao.a(775));
                    Locale locale = new Locale(this.w);
                    if (split.length == 2) {
                        locale = new Locale(split[0], split[1]);
                    }
                    Locale.setDefault(locale);
                    Configuration configuration = new Configuration();
                    configuration.locale = locale;
                    getBaseContext().getResources().updateConfiguration(configuration, getBaseContext().getResources().getDisplayMetrics());
                }
            } catch (Exception e) {
                l.a(L, e);
            }
        }
    }

    public final void r0() {
        JSONArray jSONArray = this.u;
        if (jSONArray == null || jSONArray.length() != 1) {
            return;
        }
        try {
            if (this.u.getJSONObject(0).getString(C0059ao.a(776)).equals(C0059ao.a(777))) {
                this.K = Boolean.TRUE;
            }
        } catch (Exception e) {
            String str = L;
            l.b(str, C0059ao.a(778) + e);
        }
    }

    public final void s0() {
        IntentFilter intentFilter = new IntentFilter();
        try {
            intentFilter.addAction(C0059ao.a(779));
            intentFilter.setPriority(999);
            registerReceiver(this.A, intentFilter);
        } catch (Throwable unused) {
            l.b(L, C0059ao.a(780));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d7, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00de, code lost:
        if (r5 >= r16.v.length()) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f7, code lost:
        if (((org.json.JSONObject) r16.v.get(r5)).optString(r10, r2).equals(myunmn.C0059ao.a(792)) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f9, code lost:
        r7 = (org.json.JSONObject) r16.v.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0101, code lost:
        r0 = r7.optString(r9, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0116, code lost:
        if (((org.json.JSONObject) r16.v.get(r5)).optString(r10, r2).equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0118, code lost:
        r7 = (org.json.JSONObject) r16.v.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0138, code lost:
        if (((org.json.JSONObject) r16.v.get(r5)).optString(myunmn.C0059ao.a(793), r2).equals(r0) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013a, code lost:
        r0 = ((org.json.JSONObject) r16.v.get(r5)).optString(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0147, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0148, code lost:
        org.npci.upi.security.pinactivitycomponent.l.a(org.npci.upi.security.pinactivitycomponent.GetCredential.L, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0150, code lost:
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0151, code lost:
        r5 = (android.widget.LinearLayout) findViewById(org.npci.upi.security.pinactivitycomponent.R.id.transaction_bar_root);
        r7 = (android.widget.TextView) findViewById(org.npci.upi.security.pinactivitycomponent.R.id.tv_acc_or_payee);
        r11 = (android.widget.TextView) findViewById(org.npci.upi.security.pinactivitycomponent.R.id.transaction_bar_title);
        r12 = (android.widget.TextView) findViewById(org.npci.upi.security.pinactivitycomponent.R.id.transaction_bar_info);
        r16.E = (android.widget.ImageView) findViewById(org.npci.upi.security.pinactivitycomponent.R.id.transaction_bar_arrow);
        ((android.widget.TextView) findViewById(org.npci.upi.security.pinactivitycomponent.R.id.tv_acc_or_payee_name)).setText(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x018a, code lost:
        if (r1.equals(r2) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x018c, code lost:
        r7.setText(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0194, code lost:
        if (r3.equals(r2) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0196, code lost:
        if (r3 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a3, code lost:
        if (r3.equalsIgnoreCase(myunmn.C0059ao.a(794)) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ad, code lost:
        if (java.lang.Double.parseDouble(r3) <= 0.0d) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01af, code lost:
        r12.setText(myunmn.C0059ao.a(796) + (myunmn.C0059ao.a(795) + r3));
        r11.setText(myunmn.C0059ao.a(797) + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f8, code lost:
        r11.setText(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0201, code lost:
        if (r4 >= r16.v.length()) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x021a, code lost:
        if (((org.json.JSONObject) r16.v.get(r4)).optString(r10, r2).equals(myunmn.C0059ao.a(798)) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x021c, code lost:
        r0 = ((org.json.JSONObject) r16.v.get(r4)).optString(r9, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0229, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x022a, code lost:
        org.npci.upi.security.pinactivitycomponent.l.a(org.npci.upi.security.pinactivitycomponent.GetCredential.L, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0232, code lost:
        r12.setText(r0);
        r12.setTextSize(14.0f);
        r12.setEllipsize(android.text.TextUtils.TruncateAt.END);
        r12.setSingleLine(true);
        r12.setMaxWidth(700);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0247, code lost:
        r0 = getWindowManager().getDefaultDisplay();
        r1 = new android.graphics.Point();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0258, code lost:
        if (android.os.Build.VERSION.SDK_INT < 13) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x025a, code lost:
        r0.getSize(r1);
        r0 = r1.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0260, code lost:
        r0 = r0.getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0264, code lost:
        r16.F = r0;
        r5.setOnClickListener(new org.npci.upi.security.pinactivitycomponent.GetCredential.AnonymousClass4(r16));
        r16.B = findViewById(org.npci.upi.security.pinactivitycomponent.R.id.transaction_details_scroller);
        r16.C = findViewById(org.npci.upi.security.pinactivitycomponent.R.id.transaction_details_expanded_space);
        r16.B.setOnTouchListener(new org.npci.upi.security.pinactivitycomponent.GetCredential.AnonymousClass5(r16));
        r0 = r16.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x028a, code lost:
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x028c, code lost:
        r0.setOnTouchListener(new org.npci.upi.security.pinactivitycomponent.GetCredential.AnonymousClass6(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0294, code lost:
        r0 = (android.graphics.drawable.TransitionDrawable) findViewById(org.npci.upi.security.pinactivitycomponent.R.id.transaction_info_root).getBackground();
        r16.D = r0;
        r0.setCrossFadeEnabled(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02a5, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t0() {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.GetCredential.t0():void");
    }

    public void u0() {
        String str;
        String a2;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.transaction_details_root);
        for (int i = 0; i < this.v.length(); i++) {
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this).inflate(R.layout.layout_transaction_details_item, (ViewGroup) linearLayout, false);
            TextView textView = (TextView) viewGroup.findViewById(R.id.transaction_details_item_name);
            TextView textView2 = (TextView) viewGroup.findViewById(R.id.transaction_details_item_value);
            LinearLayout linearLayout2 = (LinearLayout) viewGroup.findViewById(R.id.verified_merchant);
            JSONObject optJSONObject = this.v.optJSONObject(i);
            String a3 = C0059ao.a(799);
            String a4 = C0059ao.a(800);
            boolean equals = optJSONObject.optString(a3, a4).equals(C0059ao.a(801));
            String a5 = C0059ao.a(802);
            if (equals) {
                a2 = C0059ao.a(803);
            } else if (optJSONObject.optString(a3, a4).equals(C0059ao.a(804)) || optJSONObject.optString(a3, a4).equals(C0059ao.a(805))) {
                textView.setText(C0059ao.a(814));
                str = C0059ao.a(815) + optJSONObject.optString(a5);
                textView2.setText(str);
                linearLayout.addView(viewGroup);
            } else {
                a2 = optJSONObject.optString(a3, a4).equals(C0059ao.a(806)) ? C0059ao.a(807) : optJSONObject.optString(a3, a4).equals(C0059ao.a(808)) ? C0059ao.a(809) : optJSONObject.optString(a3, a4).equals(C0059ao.a(810)) ? C0059ao.a(811) : optJSONObject.optString(a3, a4).equals(C0059ao.a(812)) ? C0059ao.a(813) : optJSONObject.optString(a3);
            }
            textView.setText(a2.toUpperCase());
            str = optJSONObject.optString(a5);
            textView2.setText(str);
            linearLayout.addView(viewGroup);
        }
        View view = new View(this);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, p0(3.0f)));
        view.setBackgroundColor(-16777216);
        ac.t0(view, 0.33f);
        linearLayout.addView(view);
    }

    public void v0(float f, float f2, int i, View view) {
        RotateAnimation rotateAnimation = new RotateAnimation(f, f2, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(i);
        rotateAnimation.setFillEnabled(true);
        rotateAnimation.setFillAfter(true);
        view.startAnimation(rotateAnimation);
    }

    public void w0(m mVar) {
        this.z = mVar;
    }

    public void x0(int i) {
        this.H = i;
    }

    public final void y0() {
        Keypad keypad = (Keypad) findViewById(R.id.fragmentTelKeyboard);
        if (keypad != null) {
            keypad.setOnKeyPressCallback(new Keypad.a() { // from class: org.npci.upi.security.pinactivitycomponent.GetCredential.3
                @Override // org.npci.upi.security.pinactivitycomponent.Keypad.a
                public void a(View view, int i) {
                    GetCredential.this.dispatchKeyEvent(new KeyEvent(0, i));
                    if (i == 66) {
                        if (GetCredential.this.z != null) {
                            GetCredential.this.z.l();
                        }
                    } else if (i == 67) {
                        GetCredential.this.z.t();
                    }
                }
            });
        }
    }

    public final void z0(final boolean z) {
        ImageView imageView = this.E;
        if (z) {
            v0(0.0f, 180.0f, 300, imageView);
        } else {
            v0(180.0f, 0.0f, 300, imageView);
        }
        if (Build.VERSION.SDK_INT <= 14) {
            this.B.setVisibility(z ? 0 : 8);
            return;
        }
        final int height = this.B.getHeight();
        if (height == 0) {
            height = this.F;
        }
        this.B.clearAnimation();
        this.B.animate().y(z ? 0.0f : height * (-1.0f)).alpha(z ? 1.0f : 0.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator()).setListener(new AnimatorListenerAdapter() { // from class: org.npci.upi.security.pinactivitycomponent.GetCredential.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (z) {
                    return;
                }
                GetCredential.this.B.setVisibility(8);
                GetCredential.this.C.setVisibility(8);
                GetCredential.this.D.resetTransition();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            @TargetApi(17)
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                if (!z) {
                    GetCredential.this.D.reverseTransition(300);
                    return;
                }
                GetCredential.this.D.startTransition(300);
                GetCredential.this.B.setVisibility(0);
                GetCredential.this.C.setVisibility(0);
                GetCredential.this.C.setLayoutDirection(0);
                if (ac.O(GetCredential.this.B) == 0.0f) {
                    GetCredential.this.B.setY(height * (-1));
                }
            }
        });
    }
}
