package com.appsflyer.share;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.internal.ai;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CrossPromotionHelper {

    /* renamed from: ı  reason: contains not printable characters */
    private static String f345;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class d implements Runnable {

        /* renamed from: ı  reason: contains not printable characters */
        private final ai f346;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final WeakReference<Context> f347;

        /* renamed from: Ι  reason: contains not printable characters */
        private final boolean f348;

        /* renamed from: ι  reason: contains not printable characters */
        private final String f349;

        public d(String str, ai aiVar, Context context, boolean z) {
            this.f349 = str;
            this.f346 = aiVar;
            this.f347 = new WeakReference<>(context);
            this.f348 = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HttpURLConnection httpURLConnection;
            Throwable th;
            if (this.f348) {
                return;
            }
            try {
                httpURLConnection = (HttpURLConnection) new URL(this.f349).openConnection();
            } catch (Throwable th2) {
                httpURLConnection = null;
                th = th2;
            }
            try {
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setInstanceFollowRedirects(false);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    StringBuilder sb = new StringBuilder(C0059ao.a(938));
                    sb.append(this.f349);
                    AFLogger.afInfoLog(sb.toString(), false);
                } else if (responseCode != 301 && responseCode != 302) {
                    StringBuilder sb2 = new StringBuilder(C0059ao.a(933));
                    sb2.append(this.f349);
                    sb2.append(C0059ao.a(934));
                    sb2.append(responseCode);
                    AFLogger.afInfoLog(sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder(C0059ao.a(935));
                    sb3.append(this.f349);
                    AFLogger.afInfoLog(sb3.toString(), false);
                    if (this.f346 != null && this.f347.get() != null) {
                        this.f346.f205 = httpURLConnection.getHeaderField(C0059ao.a(936));
                        ai aiVar = this.f346;
                        Context context = this.f347.get();
                        if (aiVar.f205 != null) {
                            context.startActivity(new Intent(C0059ao.a(937), Uri.parse(aiVar.f205)).setFlags(268435456));
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    AFLogger.afErrorLog(th.getMessage(), th, true);
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

    static {
        C0059ao.a(CrossPromotionHelper.class, 327);
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != 96801) {
                if (hashCode == 120623625 && key.equals(C0059ao.a(5919))) {
                    c = 1;
                }
            } else if (key.equals(C0059ao.a(5920))) {
                c = 0;
            }
            if (c == 0) {
                Constants.f344 = value;
            } else if (c == 1) {
                f345 = value;
            }
        }
    }

    public static void trackAndOpenStore(Context context, String str, String str2) {
        trackAndOpenStore(context, str, str2, null);
    }

    public static void trackCrossPromoteImpression(Context context, String str, String str2) {
        trackCrossPromoteImpression(context, str, str2, null);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static LinkGenerator m232(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator(C0059ao.a(5927));
        linkGenerator.f359 = str3;
        linkGenerator.f352 = str;
        linkGenerator.addParameter(C0059ao.a(5928), context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString(C0059ao.a(5929));
        if (string != null) {
            linkGenerator.addParameter(C0059ao.a(5930), string);
        }
        return linkGenerator;
    }

    public static void trackAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator m232 = m232(context, str, str2, map, ServerConfigHandler.getUrl(Constants.f344));
        if (AppsFlyerProperties.getInstance().getBoolean(C0059ao.a(5921), false)) {
            AFLogger.afInfoLog(C0059ao.a(5922), true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(C0059ao.a(5923), str2);
        AppsFlyerLib.getInstance().trackEvent(context, C0059ao.a(5924), map);
        new Thread(new d(m232.generateLink(), new ai(), context, AppsFlyerLib.getInstance().isTrackingStopped())).start();
    }

    public static void trackCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(C0059ao.a(5925), false)) {
            AFLogger.afInfoLog(C0059ao.a(5926), true);
        } else {
            new Thread(new d(m232(context, str, str2, map, ServerConfigHandler.getUrl(f345)).generateLink(), null, null, AppsFlyerLib.getInstance().isTrackingStopped())).start();
        }
    }
}
