package com.appsflyer;

import com.appsflyer.internal.ae;
import myunmn.C0059ao;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ServerConfigHandler {
    public static String getUrl(String str) {
        return String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AppsFlyerLibCore.getInstance().getHostName());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static JSONObject m133(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean z = AppsFlyerProperties.getInstance().getBoolean(C0059ao.a(3027), false);
            if (jSONObject.optBoolean(C0059ao.a(3028), false) && !z) {
                ae.m150().m162();
            } else {
                ae.m150().m161();
                ae.m150().m163();
            }
            if (jSONObject.has(C0059ao.a(3029))) {
                String optString = jSONObject.optString(C0059ao.a(3030), null);
                String optString2 = jSONObject.optString(C0059ao.a(3031), null);
                String optString3 = jSONObject.optString(C0059ao.a(3032), null);
                if (optString != null) {
                    AppsFlyerProperties.getInstance().set(C0059ao.a(3033), optString);
                }
                if (optString2 != null) {
                    AppsFlyerProperties.getInstance().set(C0059ao.a(3034), optString2);
                }
                if (optString3 != null) {
                    AppsFlyerProperties.getInstance().set(C0059ao.a(3035), optString3);
                    return jSONObject;
                }
                return jSONObject;
            }
            return jSONObject;
        } catch (Throwable th2) {
            th = th2;
            jSONObject2 = jSONObject;
            AFLogger.afErrorLog(th.getMessage(), th);
            ae.m150().m161();
            ae.m150().m163();
            return jSONObject2;
        }
    }
}
