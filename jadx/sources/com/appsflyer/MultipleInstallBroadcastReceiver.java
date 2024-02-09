package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        String a = C0059ao.a(4963);
        String a2 = C0059ao.a(4964);
        if (intent == null) {
            return;
        }
        try {
            str = intent.getStringExtra(a2);
        } catch (Throwable th) {
            AFLogger.afErrorLog(a, th);
            str = null;
        }
        if (str != null && AppsFlyerLibCore.getSharedPreferences(context).getString(a2, null) != null) {
            AppsFlyerLibCore.getInstance();
            AppsFlyerLibCore.m53(context, str);
            return;
        }
        AFLogger.afInfoLog(C0059ao.a(4965));
        AppsFlyerLibCore.getInstance().m121(context, intent);
        PackageManager packageManager = context.getPackageManager();
        String a3 = C0059ao.a(4966);
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(new Intent(a3), 0)) {
            String action = intent.getAction();
            if (((PackageItemInfo) resolveInfo.activityInfo).packageName.equals(context.getPackageName()) && a3.equals(action) && !getClass().getName().equals(((PackageItemInfo) resolveInfo.activityInfo).name)) {
                StringBuilder sb = new StringBuilder(C0059ao.a(4967));
                sb.append(((PackageItemInfo) resolveInfo.activityInfo).name);
                AFLogger.afInfoLog(sb.toString());
                try {
                    ((BroadcastReceiver) Class.forName(((PackageItemInfo) resolveInfo.activityInfo).name).newInstance()).onReceive(context, intent);
                } catch (Throwable th2) {
                    StringBuilder sb2 = new StringBuilder(a);
                    sb2.append(((PackageItemInfo) resolveInfo.activityInfo).name);
                    AFLogger.afErrorLog(sb2.toString(), th2);
                }
            }
        }
    }
}
