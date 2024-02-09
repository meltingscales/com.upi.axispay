package com.appsflyer;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import myunmn.C0059ao;
import org.json.JSONException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class OneLinkHttpTask implements Runnable {
    public static String BASE_URL;
    public static final String NO_CONNECTION_ERROR_MSG = null;
    private static final int WAIT_TIMEOUT = 0;
    private AppsFlyerLibCore afLib;
    private HttpsUrlConnectionProvider connectionProvider;
    public String oneLinkId;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class HttpsUrlConnectionProvider {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final HttpsURLConnection m132(String str) throws IOException {
            return (HttpsURLConnection) new URL(str).openConnection();
        }
    }

    static {
        C0059ao.a(OneLinkHttpTask.class, 245);
    }

    public OneLinkHttpTask(AppsFlyerLibCore appsFlyerLibCore) {
        this.afLib = appsFlyerLibCore;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void doRequest() {
        /*
            r8 = this;
            r0 = 13760(0x35c0, float:1.9282E-41)
            java.lang.String r1 = myunmn.C0059ao.a(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            java.lang.String r4 = r8.getOneLinkUrl()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r0 = 13761(0x35c1, float:1.9283E-41)
            java.lang.String r6 = myunmn.C0059ao.a(r0)
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.appsflyer.AFLogger.afRDLog(r5)
            com.appsflyer.OneLinkHttpTask$HttpsUrlConnectionProvider r5 = r8.connectionProvider     // Catch: java.lang.Throwable -> La8
            javax.net.ssl.HttpsURLConnection r5 = r5.m132(r4)     // Catch: java.lang.Throwable -> La8
            r0 = 13762(0x35c2, float:1.9285E-41)
            java.lang.String r6 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> La8
            r0 = 13763(0x35c3, float:1.9286E-41)
            java.lang.String r7 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> La8
            r5.addRequestProperty(r6, r7)     // Catch: java.lang.Throwable -> La8
            r0 = 13764(0x35c4, float:1.9287E-41)
            java.lang.String r6 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> La8
            java.lang.String r7 = com.appsflyer.internal.ac.m143(r2)     // Catch: java.lang.Throwable -> La8
            r5.addRequestProperty(r6, r7)     // Catch: java.lang.Throwable -> La8
            r0 = 13765(0x35c5, float:1.9289E-41)
            java.lang.String r6 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> La8
            r5.addRequestProperty(r6, r2)     // Catch: java.lang.Throwable -> La8
            r2 = 3000(0xbb8, float:4.204E-42)
            r5.setReadTimeout(r2)     // Catch: java.lang.Throwable -> La8
            r5.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> La8
            r8.initRequest(r5)     // Catch: java.lang.Throwable -> La8
            int r2 = r5.getResponseCode()     // Catch: java.lang.Throwable -> La8
            com.appsflyer.AppsFlyerLibCore r3 = r8.afLib     // Catch: java.lang.Throwable -> La8
            java.lang.String r3 = r3.m119(r5)     // Catch: java.lang.Throwable -> La8
            r5 = 200(0xc8, float:2.8E-43)
            if (r2 != r5) goto L82
            r0 = 13766(0x35c6, float:1.929E-41)
            java.lang.String r2 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> La6
            com.appsflyer.AFLogger.afInfoLog(r2)     // Catch: java.lang.Throwable -> La6
            goto Le4
        L82:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r1.<init>()     // Catch: java.lang.Throwable -> La6
            r0 = 13767(0x35c7, float:1.9292E-41)
            java.lang.String r5 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> La6
            r1.append(r5)     // Catch: java.lang.Throwable -> La6
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            r0 = 13768(0x35c8, float:1.9293E-41)
            java.lang.String r2 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> La6
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            r1.append(r3)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La6
            goto Le4
        La6:
            r1 = move-exception
            goto Lab
        La8:
            r2 = move-exception
            r3 = r1
            r1 = r2
        Lab:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r0 = 13769(0x35c9, float:1.9294E-41)
            java.lang.String r5 = myunmn.C0059ao.a(r0)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.appsflyer.AFLogger.afErrorLog(r2, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r4)
            r0 = 13770(0x35ca, float:1.9296E-41)
            java.lang.String r4 = myunmn.C0059ao.a(r0)
            r2.append(r4)
            java.lang.String r1 = r1.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        Le4:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L107
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 13771(0x35cb, float:1.9297E-41)
            java.lang.String r2 = myunmn.C0059ao.a(r0)
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.appsflyer.AFLogger.afInfoLog(r1)
            r8.handleResponse(r3)
            goto L123
        L107:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r0 = 13772(0x35cc, float:1.9299E-41)
            java.lang.String r3 = myunmn.C0059ao.a(r0)
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.appsflyer.AFLogger.afWarnLog(r1)
            r8.onErrorResponse()
        L123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.OneLinkHttpTask.doRequest():void");
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (C0059ao.a(13773).equals(entry.getKey())) {
                BASE_URL = entry.getValue();
            }
        }
    }

    public abstract String getOneLinkUrl();

    public abstract void handleResponse(String str);

    public abstract void initRequest(HttpsURLConnection httpsURLConnection) throws JSONException, IOException;

    public abstract void onErrorResponse();

    @Override // java.lang.Runnable
    public void run() {
        doRequest();
    }

    public void setConnProvider(HttpsUrlConnectionProvider httpsUrlConnectionProvider) {
        this.connectionProvider = httpsUrlConnectionProvider;
    }
}
