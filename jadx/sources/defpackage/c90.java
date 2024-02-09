package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.upi.axispay.R;
import com.upi.axispay.activity.CloseActivity;
import com.upi.axispay.activity.LoginActivity;
import com.upi.axispay.custom.NpciLayoutChangeListener;
import defpackage.n70;
import java.util.List;
import myunmn.C0059ao;
import myunmn.S;

/* compiled from: AxisPay */
/* renamed from: c90  reason: default package */
/* loaded from: classes.dex */
public class c90 extends z {
    public static boolean A;
    public static boolean B;
    public static boolean C;
    public static long z;
    public wg0 q;
    public int r = 0;
    public boolean s = false;
    public int t = 1;
    public int u = 2;
    public int v = 3;
    public int w = 108;
    public BroadcastReceiver x = new a();
    public final Application.ActivityLifecycleCallbacks y = new c(this);

    /* compiled from: AxisPay */
    /* renamed from: c90$a */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                return;
            }
            String action = intent.getAction();
            if (action.equalsIgnoreCase(C0059ao.a(7592))) {
                if (c90.this.r == 22) {
                    return;
                }
                Bundle extras = intent.getExtras();
                String string = extras != null ? extras.getString(C0059ao.a(7593)) : C0059ao.a(7594);
                string.hashCode();
                if (string.equals(C0059ao.a(7595))) {
                    c90 c90Var = c90.this;
                    c90Var.b0(c90Var.v);
                } else if (string.equals(C0059ao.a(7596))) {
                    c90 c90Var2 = c90.this;
                    c90Var2.b0(c90Var2.u);
                }
            } else if (action.equals(C0059ao.a(7597)) || action.equals(C0059ao.a(7598))) {
                if (c70.n(context)) {
                    c90.C = true;
                } else {
                    c90.C = false;
                }
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: c90$b */
    /* loaded from: classes.dex */
    public class b implements OnSuccessListener<InstanceIdResult> {
        public b(c90 c90Var) {
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: a */
        public void onSuccess(InstanceIdResult instanceIdResult) {
            String token = instanceIdResult.getToken();
            if (TextUtils.isEmpty(token)) {
                return;
            }
            n70.a aVar = n70.f;
            aVar.a().y(C0059ao.a(6852), token);
            aVar.a().y(C0059ao.a(6853), C0059ao.a(6854));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: c90$c */
    /* loaded from: classes.dex */
    public class c implements Application.ActivityLifecycleCallbacks {
        public ViewTreeObserver.OnGlobalLayoutListener b;

        public c(c90 c90Var) {
        }

        public final boolean a(Activity activity) {
            return activity.getLocalClassName().equals(C0059ao.a(6888));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (a(activity)) {
                S.a(activity.getWindow(), UserMetadata.MAX_INTERNAL_KEY_SIZE, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                this.b = new NpciLayoutChangeListener(activity);
                activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.b);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        C0059ao.a(c90.class, 119);
    }

    public void X() {
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService(C0059ao.a(4635));
        if (keyguardManager == null || keyguardManager.isKeyguardSecure()) {
            return;
        }
        startActivityForResult(new Intent(C0059ao.a(4636)), 101);
    }

    public final boolean Y() {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(this);
        if (isGooglePlayServicesAvailable != 0) {
            if (googleApiAvailability.isUserResolvableError(isGooglePlayServicesAvailable)) {
                googleApiAvailability.getErrorDialog(this, isGooglePlayServicesAvailable, 9000).show();
                return false;
            }
            finish();
            return false;
        }
        return true;
    }

    public final boolean Z() {
        if (z != 0 && System.currentTimeMillis() - z > 120000) {
            if (!C0059ao.a(4637).equals(getIntent().getAction())) {
                if (!C0059ao.a(4638).equals(getIntent().getAction())) {
                    return true;
                }
            }
        }
        return false;
    }

    @TargetApi(19)
    public void a0(Fragment fragment, Fragment fragment2) {
        if (Build.VERSION.SDK_INT < 19 || fragment == null || fragment2 == null) {
            return;
        }
        try {
            sm smVar = new sm();
            smVar.T(300L);
            fragment.setExitTransition(smVar);
            fragment2.setEnterTransition(smVar);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.z, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        xg0.b(context);
        super.attachBaseContext(qh0.b(context));
    }

    public void b0(int i) {
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService(C0059ao.a(4639));
        n70 a2 = n70.f.a();
        String a3 = C0059ao.a(4640);
        String m = a2.m(a3);
        Context applicationContext = getApplicationContext();
        String a4 = C0059ao.a(4641);
        if (t8.a(applicationContext, a4) != 0) {
            d8.o(this, new String[]{a4}, this.w);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 2;
        int i4 = 0;
        String a5 = C0059ao.a(4642);
        if (i2 >= 22) {
            SubscriptionManager from = SubscriptionManager.from(getApplicationContext());
            if (from.getActiveSubscriptionInfoCount() >= 1) {
                List<SubscriptionInfo> activeSubscriptionInfoList = from.getActiveSubscriptionInfoList();
                if (activeSubscriptionInfoList != null && activeSubscriptionInfoList.size() > 0) {
                    for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                        if (TextUtils.isEmpty(m)) {
                            m = String.valueOf(subscriptionInfo.getSubscriptionId());
                            n70.f.a().y(a3, m);
                        }
                        if (String.valueOf(subscriptionInfo.getSubscriptionId()).equals(m)) {
                            i4++;
                        }
                    }
                }
                if (i4 != 0 || this.s) {
                    return;
                }
                this.s = true;
                Intent intent = new Intent(getApplicationContext(), CloseActivity.class);
                intent.putExtra(a5, 2);
                intent.addFlags(67108864);
                startActivity(intent);
                finish();
                return;
            }
            getString(R.string.no_sim_detect);
            if (this.s) {
                return;
            }
            this.s = true;
            Intent intent2 = new Intent(getApplicationContext(), CloseActivity.class);
            intent2.putExtra(a5, 1);
            intent2.addFlags(67108864);
            startActivity(intent2);
            finish();
            return;
        }
        if (m == null && telephonyManager != null) {
            m = telephonyManager.getSimSerialNumber();
        }
        if (m == null || m.equalsIgnoreCase(m)) {
            i3 = i == this.u ? 1 : 0;
        }
        if (i3 <= this.t || this.s) {
            return;
        }
        Intent intent3 = new Intent(getApplicationContext(), CloseActivity.class);
        intent3.putExtra(a5, i3);
        intent3.addFlags(131072);
        startActivity(intent3);
        finish();
    }

    public final void c0() {
        if (TextUtils.isEmpty(n70.f.a().m(C0059ao.a(4643)))) {
            FirebaseInstanceId.getInstance().getInstanceId().addOnSuccessListener(this, new b(this));
        }
    }

    @Override // defpackage.sd, androidx.activity.ComponentActivity, defpackage.j8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FirebaseAnalytics.getInstance(this);
        S.a(getWindow(), UserMetadata.MAX_INTERNAL_KEY_SIZE, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        this.s = false;
        ch0 b2 = ch0.e.b(this);
        n70.f.b(this);
        b2.i();
        Y();
        if (!(Thread.getDefaultUncaughtExceptionHandler() instanceof wg0)) {
            wg0 wg0Var = new wg0(this);
            this.q = wg0Var;
            Thread.setDefaultUncaughtExceptionHandler(wg0Var);
        }
        c0();
        getApplication().registerActivityLifecycleCallbacks(this.y);
    }

    @Override // defpackage.z, defpackage.sd, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        eg0.B();
        eg0.c();
        BroadcastReceiver broadcastReceiver = this.x;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        this.x = null;
        wg0 wg0Var = this.q;
        if (wg0Var != null) {
            wg0Var.a(null);
            this.q = null;
        }
        getApplication().unregisterActivityLifecycleCallbacks(this.y);
    }

    @Override // defpackage.sd, android.app.Activity
    public void onPause() {
        super.onPause();
        A = true;
    }

    @Override // defpackage.sd, android.app.Activity
    public void onResume() {
        super.onResume();
        Display[] displays = ((DisplayManager) getSystemService(C0059ao.a(4644))).getDisplays();
        if (displays != null && displays.length > 1) {
            finish();
        }
        new d70(this);
        IntentFilter intentFilter = new IntentFilter(C0059ao.a(4645));
        intentFilter.addAction(C0059ao.a(4646));
        intentFilter.addAction(C0059ao.a(4647));
        registerReceiver(this.x, intentFilter);
        Intent intent = getIntent();
        String a2 = C0059ao.a(4648);
        int intExtra = intent.getIntExtra(a2, 0);
        if (!B) {
            B = true;
            A = false;
        } else if (A) {
            A = false;
        } else if (Z()) {
            n70.f.a().A(C0059ao.a(4649), false);
            Intent intent2 = new Intent(this, LoginActivity.class);
            if (getIntent().getExtras() != null) {
                intent2.putExtras(getIntent().getExtras());
            }
            intent2.putExtra(a2, intExtra);
            intent2.setFlags(268468224);
            intent2.putExtra(C0059ao.a(4650), true);
            startActivity(intent2);
            eg0.c();
            finish();
        }
    }

    @Override // defpackage.z, defpackage.sd, android.app.Activity
    public void onStop() {
        super.onStop();
        A = false;
        z = System.currentTimeMillis();
        new d70(this);
    }
}
