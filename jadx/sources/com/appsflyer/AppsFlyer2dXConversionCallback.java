package com.appsflyer;

import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r7 == 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
        onAttributionFailureNative(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m47(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5b
            r1.<init>()     // Catch: org.json.JSONException -> L5b
            r0 = 14969(0x3a79, float:2.0976E-41)
            java.lang.String r2 = myunmn.C0059ao.a(r0)     // Catch: org.json.JSONException -> L5b
            r0 = 14970(0x3a7a, float:2.0977E-41)
            java.lang.String r3 = myunmn.C0059ao.a(r0)     // Catch: org.json.JSONException -> L5b
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L5b
            r0 = 14971(0x3a7b, float:2.0979E-41)
            java.lang.String r2 = myunmn.C0059ao.a(r0)     // Catch: org.json.JSONException -> L5b
            r1.put(r2, r7)     // Catch: org.json.JSONException -> L5b
            r7 = -1
            int r2 = r6.hashCode()     // Catch: org.json.JSONException -> L5b
            r3 = -1390007222(0xffffffffad262c4a, float:-9.445842E-12)
            r4 = 1
            if (r2 == r3) goto L40
            r3 = 1050716216(0x3ea0a838, float:0.3137834)
            if (r2 == r3) goto L31
            goto L4e
        L31:
            r0 = 14972(0x3a7c, float:2.098E-41)
            java.lang.String r2 = myunmn.C0059ao.a(r0)     // Catch: org.json.JSONException -> L5b
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L5b
            if (r6 == 0) goto L4e
            r7 = 0
            goto L4e
        L40:
            r0 = 14973(0x3a7d, float:2.0982E-41)
            java.lang.String r2 = myunmn.C0059ao.a(r0)     // Catch: org.json.JSONException -> L5b
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L5b
            if (r6 == 0) goto L4e
            r7 = r4
        L4e:
            if (r7 == 0) goto L57
            if (r7 == r4) goto L53
            goto L56
        L53:
            r5.onAttributionFailureNative(r1)     // Catch: org.json.JSONException -> L5b
        L56:
            return
        L57:
            r5.onInstallConversionFailureNative(r1)     // Catch: org.json.JSONException -> L5b
            return
        L5b:
            r6 = move-exception
            r6.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyer2dXConversionCallback.m47(java.lang.String, java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    public native void onAppOpenAttributionNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        m47(C0059ao.a(14974), str);
    }

    public native void onAttributionFailureNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        m47(C0059ao.a(14975), str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);
}
