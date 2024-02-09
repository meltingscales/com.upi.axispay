package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.internal.ae;
import com.appsflyer.internal.model.event.Purchase;
import com.appsflyer.internal.model.event.SdkServices;
import com.appsflyer.internal.model.event.Validate;
import com.appsflyer.internal.w;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AFValidateInAppPurchase implements Runnable {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static String f62;

    /* renamed from: ι  reason: contains not printable characters */
    private static String f63;

    /* renamed from: ı  reason: contains not printable characters */
    private final Intent f64;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private String f65;

    /* renamed from: ǃ  reason: contains not printable characters */
    private String f66;

    /* renamed from: ɪ  reason: contains not printable characters */
    private Map<String, String> f67;

    /* renamed from: ɹ  reason: contains not printable characters */
    private String f68;

    /* renamed from: Ι  reason: contains not printable characters */
    private WeakReference<Context> f69;

    /* renamed from: І  reason: contains not printable characters */
    private String f70;

    /* renamed from: і  reason: contains not printable characters */
    private String f71;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private String f72;

    static {
        C0059ao.a(AFValidateInAppPurchase.class, 331);
        StringBuilder sb = new StringBuilder(C0059ao.a(13505));
        sb.append(AppsFlyerLibCore.f77);
        sb.append(C0059ao.a(13506));
        f62 = sb.toString();
    }

    public AFValidateInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, Intent intent) {
        this.f69 = new WeakReference<>(context);
        this.f66 = str;
        this.f72 = str2;
        this.f68 = str4;
        this.f71 = str5;
        this.f70 = str6;
        this.f67 = map;
        this.f65 = str3;
        this.f64 = intent;
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1421272810) {
                if (hashCode == 454162577 && key.equals(C0059ao.a(13507))) {
                    c = 0;
                }
            } else if (key.equals(C0059ao.a(13508))) {
                c = 1;
            }
            if (c == 0) {
                f63 = value;
            } else if (c == 1) {
                f62 = value;
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static HttpURLConnection m39(Purchase purchase) {
        StringBuilder sb = new StringBuilder(C0059ao.a(13509));
        sb.append(purchase.urlString());
        AFLogger.afDebugLog(sb.toString());
        return new w(purchase.trackingStopped(AppsFlyerLib.getInstance().isTrackingStopped())).m226();
    }

    @Override // java.lang.Runnable
    public void run() {
        String a = C0059ao.a(13525);
        String str = this.f66;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isTrackingStopped()) {
            return;
        }
        HttpURLConnection httpURLConnection = null;
        try {
            Context context = this.f69.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(C0059ao.a(13526), this.f72);
            hashMap.put(C0059ao.a(13527), this.f68);
            hashMap.put(C0059ao.a(13528), this.f65);
            final HashMap hashMap2 = new HashMap(hashMap);
            new Thread(new Runnable() { // from class: com.appsflyer.AFValidateInAppPurchase.2
                @Override // java.lang.Runnable
                public final void run() {
                    AFValidateInAppPurchase aFValidateInAppPurchase = AFValidateInAppPurchase.this;
                    AFValidateInAppPurchase.m43(aFValidateInAppPurchase, hashMap2, aFValidateInAppPurchase.f67, AFValidateInAppPurchase.this.f69);
                }
            }).start();
            hashMap.put(C0059ao.a(13529), this.f66);
            hashMap.put(C0059ao.a(13530), context.getPackageName());
            hashMap.put(C0059ao.a(13531), AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            hashMap.put(a, AppsFlyerProperties.getInstance().getString(a));
            String jSONObject = new JSONObject(hashMap).toString();
            String url = ServerConfigHandler.getUrl(f63);
            ae.m150().m160(C0059ao.a(13532), url, jSONObject);
            HttpURLConnection m39 = m39((Purchase) new SdkServices().params(hashMap).urlString(url));
            int responseCode = m39 != null ? m39.getResponseCode() : -1;
            String m119 = AppsFlyerLibCore.getInstance().m119(m39);
            ae.m150().m160(C0059ao.a(13533), url, String.valueOf(responseCode), m119);
            JSONObject jSONObject2 = new JSONObject(m119);
            jSONObject2.put(C0059ao.a(13534), responseCode);
            if (responseCode == 200) {
                StringBuilder sb = new StringBuilder(C0059ao.a(13535));
                sb.append(jSONObject2.toString());
                AFLogger.afInfoLog(sb.toString());
                m41(jSONObject2.optBoolean(C0059ao.a(13536)), this.f68, this.f71, this.f70, jSONObject2.toString());
            } else {
                AFLogger.afInfoLog(C0059ao.a(13537));
                m41(false, this.f68, this.f71, this.f70, jSONObject2.toString());
            }
            if (m39 != null) {
                m39.disconnect();
            }
        } catch (Throwable th) {
            try {
                if (AppsFlyerLibCore.f75 != null) {
                    AFLogger.afErrorLog(C0059ao.a(13538), th);
                    m41(false, this.f68, this.f71, this.f70, th.getMessage());
                }
                AFLogger.afErrorLog(th.getMessage(), th);
            } finally {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m41(boolean z, String str, String str2, String str3, String str4) {
        if (AppsFlyerLibCore.f75 != null) {
            StringBuilder sb = new StringBuilder(C0059ao.a(13510));
            sb.append(str);
            String a = C0059ao.a(13511);
            sb.append(a);
            sb.append(str2);
            sb.append(a);
            sb.append(str3);
            AFLogger.afDebugLog(sb.toString());
            if (z) {
                AFLogger.afDebugLog(C0059ao.a(13512).concat(String.valueOf(str4)));
                AppsFlyerLibCore.f75.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog(C0059ao.a(13513).concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AppsFlyerLibCore.f75;
            if (str4 == null) {
                str4 = C0059ao.a(13514);
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static /* synthetic */ void m43(AFValidateInAppPurchase aFValidateInAppPurchase, Map map, Map map2, WeakReference weakReference) {
        if (weakReference.get() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(ServerConfigHandler.getUrl(f62));
            sb.append(((Context) weakReference.get()).getPackageName());
            String obj = sb.toString();
            String string = AppsFlyerLibCore.getSharedPreferences((Context) weakReference.get()).getString(C0059ao.a(13515), C0059ao.a(13516));
            AFEvent key = new Validate((Context) weakReference.get()).key(aFValidateInAppPurchase.f66);
            key.f22 = string;
            key.f9 = aFValidateInAppPurchase.f64;
            AFEvent aFEvent = (Validate) key;
            Map<String, Object> m120 = AppsFlyerLibCore.getInstance().m120(aFEvent);
            m120.put(C0059ao.a(13517), aFValidateInAppPurchase.f71);
            m120.put(C0059ao.a(13518), aFValidateInAppPurchase.f70);
            m120.put(C0059ao.a(13519), map);
            if (map2 != null) {
                m120.put(C0059ao.a(13520), map2);
            }
            ae.m150().m160(C0059ao.a(13521), obj, new JSONObject(m120).toString());
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = m39((Purchase) aFEvent.params(m120).urlString(obj));
                int responseCode = httpURLConnection != null ? httpURLConnection.getResponseCode() : -1;
                String m119 = AppsFlyerLibCore.getInstance().m119(httpURLConnection);
                ae.m150().m160(C0059ao.a(13522), obj, String.valueOf(responseCode), m119);
                StringBuilder sb2 = new StringBuilder(C0059ao.a(13523));
                sb2.append(responseCode);
                sb2.append(C0059ao.a(13524));
                sb2.append(new JSONObject(m119).toString());
                AFLogger.afInfoLog(sb2.toString());
            } catch (Throwable th) {
                try {
                    AFLogger.afErrorLog(th.getMessage(), th);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        }
    }
}
