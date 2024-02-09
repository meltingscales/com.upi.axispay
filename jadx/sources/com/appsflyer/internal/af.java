package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.AndroidUtils;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.b;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class af {
    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m166(Context context) {
        if (AppsFlyerLib.getInstance().isTrackingStopped()) {
            return false;
        }
        try {
            Class.forName(C0059ao.a(13279));
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.afErrorLog(C0059ao.a(13282), th);
        }
        if (AndroidUtils.m46(context, new Intent(C0059ao.a(13280), null, context, FirebaseMessagingServiceListener.class))) {
            return true;
        }
        AFLogger.afWarnLog(C0059ao.a(13281));
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m165(Context context, String str) {
        String str2;
        if (str != null) {
            AFLogger.afInfoLog(C0059ao.a(13276).concat(String.valueOf(str)));
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String a = C0059ao.a(13277);
            b.a.C0005a m195 = b.a.C0005a.m195(appsFlyerProperties.getString(a));
            SharedPreferences sharedPreferences = AppsFlyerLibCore.getSharedPreferences(context);
            if (sharedPreferences.getBoolean(C0059ao.a(13278), false) && (str2 = m195.f244) != null && str2.equals(str)) {
                return;
            }
            AppsFlyerProperties.getInstance().set(a, str);
            if (AppsFlyerLibCore.m72(sharedPreferences)) {
                AppsFlyerLibCore.getInstance().m122(context, str);
            }
        }
    }
}
