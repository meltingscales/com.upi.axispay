package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFExecutor;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.ServerConfigHandler;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class LinkGenerator {

    /* renamed from: ı  reason: contains not printable characters */
    private String f350;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private String f351;

    /* renamed from: ǃ  reason: contains not printable characters */
    public String f352;

    /* renamed from: ɨ  reason: contains not printable characters */
    private String f354;

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f355;

    /* renamed from: ɪ  reason: contains not printable characters */
    private String f356;

    /* renamed from: ɹ  reason: contains not printable characters */
    private String f357;

    /* renamed from: Ι  reason: contains not printable characters */
    private String f358;

    /* renamed from: ι  reason: contains not printable characters */
    public String f359;

    /* renamed from: І  reason: contains not printable characters */
    private String f360;

    /* renamed from: і  reason: contains not printable characters */
    private String f361;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private String f362;

    /* renamed from: ӏ  reason: contains not printable characters */
    private Map<String, String> f363 = new HashMap();

    /* renamed from: ȷ  reason: contains not printable characters */
    private Map<String, String> f353 = new HashMap();

    public LinkGenerator(String str) {
        this.f355 = str;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private StringBuilder m233() {
        StringBuilder sb = new StringBuilder();
        String str = this.f359;
        if (str != null && str.startsWith(C0059ao.a(1833))) {
            sb.append(this.f359);
        } else {
            sb.append(ServerConfigHandler.getUrl(Constants.f344));
        }
        if (this.f352 != null) {
            sb.append('/');
            sb.append(this.f352);
        }
        this.f353.put(C0059ao.a(1834), this.f355);
        sb.append('?');
        sb.append(C0059ao.a(1835));
        sb.append(m234(this.f355, C0059ao.a(1836)));
        String str2 = this.f361;
        if (str2 != null) {
            this.f353.put(C0059ao.a(1837), str2);
            sb.append('&');
            sb.append(C0059ao.a(1838));
            sb.append(m234(this.f361, C0059ao.a(1839)));
        }
        String str3 = this.f358;
        if (str3 != null) {
            this.f353.put(C0059ao.a(1840), str3);
            sb.append('&');
            sb.append(C0059ao.a(1841));
            sb.append(m234(this.f358, C0059ao.a(1842)));
        }
        String str4 = this.f360;
        if (str4 != null) {
            this.f353.put(C0059ao.a(1843), str4);
            sb.append('&');
            sb.append(C0059ao.a(1844));
            sb.append(m234(this.f360, C0059ao.a(1845)));
        }
        String str5 = this.f350;
        if (str5 != null) {
            this.f353.put(C0059ao.a(1846), str5);
            sb.append('&');
            sb.append(C0059ao.a(1847));
            sb.append(m234(this.f350, C0059ao.a(1848)));
        }
        String str6 = this.f351;
        if (str6 != null) {
            this.f353.put(C0059ao.a(1849), str6);
            sb.append('&');
            sb.append(C0059ao.a(1850));
            sb.append(m234(this.f351, C0059ao.a(1851)));
        }
        String str7 = this.f357;
        if (str7 != null) {
            this.f353.put(C0059ao.a(1852), str7);
            sb.append('&');
            sb.append(C0059ao.a(1853));
            sb.append(m234(this.f357, C0059ao.a(1854)));
        }
        if (this.f356 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f356);
            String str8 = this.f356;
            String a = C0059ao.a(1855);
            boolean endsWith = str8.endsWith(a);
            String a2 = C0059ao.a(1856);
            sb2.append(endsWith ? a2 : a);
            String str9 = this.f362;
            if (str9 != null) {
                sb2.append(str9);
            }
            this.f353.put(C0059ao.a(1857), sb2.toString());
            sb.append('&');
            sb.append(C0059ao.a(1858));
            sb.append(m234(this.f356, C0059ao.a(1859)));
            if (this.f362 != null) {
                if (!this.f356.endsWith(a)) {
                    a2 = C0059ao.a(1860);
                }
                sb.append(a2);
                sb.append(m234(this.f362, C0059ao.a(1861)));
            }
        }
        for (String str10 : this.f363.keySet()) {
            String obj = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str10);
            sb3.append(C0059ao.a(1862));
            sb3.append(m234(this.f363.get(str10), str10));
            if (!obj.contains(sb3.toString())) {
                sb.append('&');
                sb.append(str10);
                sb.append('=');
                sb.append(m234(this.f363.get(str10), str10));
            }
        }
        return sb;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m234(String str, String str2) {
        String a = C0059ao.a(1863);
        try {
            return URLEncoder.encode(str, C0059ao.a(1864));
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb = new StringBuilder(C0059ao.a(1865));
            sb.append(str2);
            sb.append(C0059ao.a(1866));
            sb.append(str);
            AFLogger.afErrorLog(sb.toString(), e);
            return a;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th);
            return a;
        }
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.f363.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.f363.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        return m233().toString();
    }

    public String getBrandDomain() {
        return this.f354;
    }

    public String getCampaign() {
        return this.f350;
    }

    public String getChannel() {
        return this.f358;
    }

    public String getMediaSource() {
        return this.f355;
    }

    public Map<String, String> getParameters() {
        return this.f363;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.f356 = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        String a = C0059ao.a(1870);
        if (str == null || str.length() <= 0) {
            this.f359 = String.format(a, ServerConfigHandler.getUrl(C0059ao.a(1872)), str3);
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = C0059ao.a(1871);
            }
            this.f359 = String.format(a, str2, str);
        }
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.f354 = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.f350 = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.f358 = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.f362 = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.f360 = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.f357 = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.f351 = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.f361 = str;
        return this;
    }

    public void generateLink(Context context, CreateOneLinkHttpTask.ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(C0059ao.a(1867));
        if (!this.f363.isEmpty()) {
            for (Map.Entry<String, String> entry : this.f363.entrySet()) {
                this.f353.put(entry.getKey(), entry.getValue());
            }
        }
        m233();
        String str = this.f354;
        Map<String, String> map = this.f353;
        if (AppsFlyerProperties.getInstance().getBoolean(C0059ao.a(1868), false)) {
            AFLogger.afInfoLog(C0059ao.a(1869), true);
            return;
        }
        CreateOneLinkHttpTask createOneLinkHttpTask = new CreateOneLinkHttpTask(string, map, AppsFlyerLibCore.getInstance(), context, AppsFlyerLib.getInstance().isTrackingStopped());
        createOneLinkHttpTask.setConnProvider(new OneLinkHttpTask.HttpsUrlConnectionProvider());
        createOneLinkHttpTask.setListener(responseListener);
        createOneLinkHttpTask.setBrandDomain(str);
        AFExecutor.getInstance().getThreadPoolExecutor().execute(createOneLinkHttpTask);
    }
}
