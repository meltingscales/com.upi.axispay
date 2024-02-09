package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AFDeepLinkManager {
    public static AFDeepLinkManager instance;
    public static Uri trampolineUri;

    /* renamed from: ı  reason: contains not printable characters */
    public static String[] f0;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static volatile boolean f1;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static String[] f2;

    /* renamed from: ι  reason: contains not printable characters */
    public static final int f3 = (int) TimeUnit.SECONDS.toMillis(2);

    private AFDeepLinkManager() {
    }

    public static AFDeepLinkManager getInstance() {
        if (instance == null) {
            instance = new AFDeepLinkManager();
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m4(String str) {
        if (f2 == null || str.contains(C0059ao.a(5090))) {
            return false;
        }
        StringBuilder sb = new StringBuilder(C0059ao.a(5091));
        sb.append(Arrays.asList(f2));
        AFLogger.afRDLog(sb.toString());
        try {
            return Arrays.asList(f2).contains(new URL(str).getHost());
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public void collectIntentsFromActivities(Intent intent) {
        Uri uri;
        if (intent != null) {
            if (C0059ao.a(5092).equals(intent.getAction())) {
                uri = intent.getData();
                if (uri != null || intent.getData() == trampolineUri) {
                }
                trampolineUri = intent.getData();
                return;
            }
        }
        uri = null;
        if (uri != null) {
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5(Intent intent, Context context, Map<String, Object> map) {
        String a = C0059ao.a(5093);
        Uri uri = null;
        Uri data = (intent == null || !a.equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = AppsFlyerLibCore.getInstance().pluginDeeplinkIntent;
        if (intent2 != null && a.equals(intent2.getAction())) {
            uri = intent2.getData();
        }
        String a2 = C0059ao.a(5094);
        String a3 = C0059ao.a(5095);
        if (data != null) {
            if (!intent.hasExtra(a3)) {
                intent.putExtra(a3, System.currentTimeMillis());
                m2(context, map, data);
                return;
            }
            StringBuilder sb = new StringBuilder(C0059ao.a(5096));
            sb.append(data.toString());
            sb.append(a2);
            AFLogger.afInfoLog(sb.toString());
        } else if (trampolineUri != null) {
            StringBuilder sb2 = new StringBuilder(C0059ao.a(5097));
            sb2.append(trampolineUri);
            AFLogger.afInfoLog(sb2.toString());
            m2(context, map, trampolineUri);
        } else if (uri != null) {
            if (!intent2.hasExtra(a3)) {
                intent2.putExtra(a3, System.currentTimeMillis());
                StringBuilder sb3 = new StringBuilder(C0059ao.a(5098));
                sb3.append(uri.toString());
                AFLogger.afInfoLog(sb3.toString());
                m2(context, map, uri);
                return;
            }
            StringBuilder sb4 = new StringBuilder(C0059ao.a(5099));
            sb4.append(uri.toString());
            sb4.append(a2);
            AFLogger.afInfoLog(sb4.toString());
        } else {
            AFLogger.afDebugLog(C0059ao.a(5100));
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m2(final Context context, final Map<String, Object> map, final Uri uri) {
        if (m4(uri.toString())) {
            f1 = true;
            AFExecutor aFExecutor = AFExecutor.getInstance();
            if (aFExecutor.f26 == null) {
                aFExecutor.f26 = Executors.newSingleThreadScheduledExecutor(aFExecutor.f27);
            }
            aFExecutor.f26.execute(new Runnable() { // from class: com.appsflyer.AFDeepLinkManager.3
                /* renamed from: ɩ  reason: contains not printable characters */
                private static Map<String, Object> m6(Uri uri2) {
                    HashMap hashMap = new HashMap();
                    try {
                        StringBuilder sb = new StringBuilder(C0059ao.a(12816));
                        sb.append(uri2.toString());
                        AFLogger.afDebugLog(sb.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri2.toString()).openConnection();
                        httpURLConnection.setInstanceFollowRedirects(false);
                        int i = AFDeepLinkManager.f3;
                        httpURLConnection.setReadTimeout(i);
                        httpURLConnection.setConnectTimeout(i);
                        httpURLConnection.setRequestProperty(C0059ao.a(12817), C0059ao.a(12818));
                        httpURLConnection.setRequestProperty(C0059ao.a(12819), C0059ao.a(12820));
                        int responseCode = httpURLConnection.getResponseCode();
                        hashMap.put(C0059ao.a(12821), Integer.valueOf(responseCode));
                        if (300 <= responseCode && responseCode <= 305) {
                            hashMap.put(C0059ao.a(12822), httpURLConnection.getHeaderField(C0059ao.a(12823)));
                        }
                        httpURLConnection.disconnect();
                        AFLogger.afDebugLog(C0059ao.a(12824));
                    } catch (Throwable th) {
                        hashMap.put(C0059ao.a(12825), th.getLocalizedMessage());
                        AFLogger.afErrorLog(th.getMessage(), th);
                    }
                    return hashMap;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    String obj = uri.toString();
                    ArrayList arrayList = new ArrayList();
                    Integer num = null;
                    int i = 0;
                    String str = null;
                    while (i < 5) {
                        Map<String, Object> m6 = m6(Uri.parse(obj));
                        String str2 = (String) m6.get(C0059ao.a(12826));
                        Integer num2 = (Integer) m6.get(C0059ao.a(12827));
                        String str3 = (String) m6.get(C0059ao.a(12828));
                        if (str2 == null || !AFDeepLinkManager.m4(str2)) {
                            str = str3;
                            obj = str2;
                            num = num2;
                            break;
                        }
                        if (i < 4) {
                            arrayList.add(str2);
                        }
                        i++;
                        str = str3;
                        obj = str2;
                        num = num2;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(C0059ao.a(12829), obj != null ? obj : C0059ao.a(12830));
                    hashMap.put(C0059ao.a(12831), Integer.valueOf(num != null ? num.intValue() : -1));
                    if (str != null) {
                        hashMap.put(C0059ao.a(12832), str);
                    }
                    if (!arrayList.isEmpty()) {
                        hashMap.put(C0059ao.a(12833), arrayList);
                    }
                    hashMap.put(C0059ao.a(12834), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    synchronized (map) {
                        map.put(C0059ao.a(12835), hashMap);
                        map.put(C0059ao.a(12836), uri.toString());
                    }
                    AppsFlyerLibCore.getInstance().handleDeepLinkCallback(context, map, obj != null ? Uri.parse(obj) : uri);
                    AFDeepLinkManager.f1 = false;
                }
            });
        } else {
            AppsFlyerLibCore.getInstance().handleDeepLinkCallback(context, map, uri);
        }
        trampolineUri = null;
    }
}
