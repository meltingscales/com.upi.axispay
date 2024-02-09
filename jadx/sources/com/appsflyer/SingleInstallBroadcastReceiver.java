package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        String a = C0059ao.a(6618);
        if (intent == null) {
            return;
        }
        try {
            str = intent.getStringExtra(a);
        } catch (Throwable th) {
            AFLogger.afErrorLog(C0059ao.a(6619), th);
            str = null;
        }
        if (str != null && AppsFlyerLibCore.getSharedPreferences(context).getString(a, null) != null) {
            AppsFlyerLibCore.getInstance();
            AppsFlyerLibCore.m53(context, str);
            return;
        }
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String a2 = C0059ao.a(6620);
        String string = appsFlyerProperties.getString(a2);
        long currentTimeMillis = System.currentTimeMillis();
        if (string == null || currentTimeMillis - Long.valueOf(string).longValue() >= 2000) {
            AFLogger.afInfoLog(C0059ao.a(6621));
            AppsFlyerLibCore.getInstance().m121(context, intent);
            AppsFlyerProperties.getInstance().set(a2, String.valueOf(System.currentTimeMillis()));
        }
    }
}
