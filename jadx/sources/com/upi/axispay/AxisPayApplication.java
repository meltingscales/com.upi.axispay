package com.upi.axispay;

import android.content.Context;
import android.content.res.Configuration;
import android.os.StrictMode;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.crashlytics.android.Crashlytics;
import defpackage.i60;
import defpackage.k60;
import defpackage.ph0;
import io.fabric.sdk.android.Fabric;
import io.github.inflationx.calligraphy3.CalligraphyConfig;
import io.github.inflationx.calligraphy3.CalligraphyInterceptor;
import java.util.Map;
import myunmn.ApplicationC0063as;
import myunmn.C0059ao;
import myunmn.C0095z;

/* loaded from: classes.dex */
public class AxisPayApplication extends ApplicationC0063as {
    public eh0 b;
    public AppsFlyerConversionListener c = new a(this);

    /* loaded from: classes.dex */
    public class a implements AppsFlyerConversionListener {
        static {
            C0095z.a();
        }

        public a(AxisPayApplication axisPayApplication) {
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onAppOpenAttribution(Map<String, String> map) {
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onAttributionFailure(String str) {
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onConversionDataFail(String str) {
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onConversionDataSuccess(Map<String, Object> map) {
        }
    }

    static {
        C0095z.a();
    }

    public void a(Context context) {
        xg0.b(context);
    }

    @Override // myunmn.ApplicationC0063as, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        n70.f.b(context);
        super.attachBaseContext(xg0.b(context));
        ki.l(this);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        xg0.b(this);
    }

    @Override // myunmn.ApplicationC0063as, android.app.Application
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
        d70.e(this);
        y80.c(this);
        ph0.a c = ph0.c();
        c.a(new CalligraphyInterceptor(new CalligraphyConfig.Builder().setDefaultFontPath(getResources().getString(R.string.font_roboto_regular)).setFontAttrId(R.attr.fontPath).build()));
        ph0.e(c.b());
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        String a2 = C0059ao.a(14200);
        appsFlyerLib.startTracking(this, a2);
        AppsFlyerLib.getInstance().setDebugLog(false);
        AppsFlyerLib.getInstance().init(a2, this.c, getApplicationContext());
        AppsFlyerLib.getInstance().startTracking(this);
        i60.b bVar = new i60.b();
        bVar.v(true);
        bVar.u(true);
        bVar.x(m60.EXACTLY);
        bVar.w(new t60(300));
        i60 t = bVar.t();
        k60.b bVar2 = new k60.b(getApplicationContext());
        bVar2.u(t);
        bVar2.x(new g60());
        bVar2.v(104857600);
        j60.a().b(bVar2.t());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().build());
        ch0 b = ch0.e.b(this);
        n70.f.b(this);
        b.i();
        eh0 eh0Var = new eh0(this);
        this.b = eh0Var;
        eh0Var.b();
    }
}
