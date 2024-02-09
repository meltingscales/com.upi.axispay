package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.internal.model.event.BackgroundEvent;
import com.appsflyer.internal.model.event.ProxyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import myunmn.C0059ao;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class ae {

    /* renamed from: ı  reason: contains not printable characters */
    private static String f181;

    /* renamed from: Ι  reason: contains not printable characters */
    private static ae f182;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f183;

    /* renamed from: ɩ  reason: contains not printable characters */
    private JSONObject f185;

    /* renamed from: ι  reason: contains not printable characters */
    public boolean f187;

    /* renamed from: І  reason: contains not printable characters */
    private boolean f188;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f190;

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f184 = true;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final List<String> f186 = new ArrayList();

    /* renamed from: і  reason: contains not printable characters */
    private String f189 = C0059ao.a(13234);

    static {
        C0059ao.a(ae.class, 402);
    }

    private ae() {
        this.f183 = 0;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(C0059ao.a(13235), false);
        this.f190 = z;
        this.f187 = true ^ z;
        this.f183 = 0;
        this.f188 = false;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private synchronized String m149() {
        String str;
        try {
            this.f185.put(C0059ao.a(13236), new JSONArray((Collection) this.f186));
            str = this.f185.toString();
            try {
                m152();
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            str = null;
        }
        return str;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static ae m150() {
        if (f182 == null) {
            f182 = new ae();
        }
        return f182;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private synchronized void m151(String str, String str2, String str3, String str4) {
        try {
            this.f185.put(C0059ao.a(13237), str);
            if (str2 != null && str2.length() > 0) {
                this.f185.put(C0059ao.a(13238), str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.f185.put(C0059ao.a(13239), str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.f185.put(C0059ao.a(13240), str4);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private synchronized void m152() {
        this.f186.clear();
        this.f183 = 0;
    }

    /* renamed from: і  reason: contains not printable characters */
    private boolean m157() {
        if (this.f187) {
            return this.f184 || this.f188;
        }
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized void m159(String str) {
        this.f189 = str;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final synchronized void m162() {
        this.f188 = true;
        m160(C0059ao.a(13271), new SimpleDateFormat(C0059ao.a(13272), Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final synchronized void m163() {
        m160(C0059ao.a(13273), new SimpleDateFormat(C0059ao.a(13274), Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.f188 = false;
        this.f184 = false;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final boolean m164() {
        return this.f188;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized void m158() {
        this.f185 = null;
        f182 = null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private synchronized void m154(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.f185.put(C0059ao.a(13251), str);
            this.f185.put(C0059ao.a(13252), str2);
            this.f185.put(C0059ao.a(13253), C0059ao.a(13254));
            this.f185.put(C0059ao.a(13255), str3);
            if (str4 != null && str4.length() > 0) {
                this.f185.put(C0059ao.a(13256), str4);
            }
            if (str5 != null && str5.length() > 0) {
                this.f185.put(C0059ao.a(13257), str5);
            }
            if (str6 != null && str6.length() > 0) {
                this.f185.put(C0059ao.a(13258), str6);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final synchronized void m160(String str, String str2, String... strArr) {
        String obj;
        if (m157()) {
            if (this.f183 < 98304) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String join = TextUtils.join(C0059ao.a(13263), strArr);
                    if (str != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(currentTimeMillis);
                        sb.append(C0059ao.a(13264));
                        sb.append(Thread.currentThread().getId());
                        sb.append(C0059ao.a(13265));
                        sb.append(str);
                        sb.append(C0059ao.a(13266));
                        sb.append(str2);
                        sb.append(C0059ao.a(13267));
                        sb.append(join);
                        obj = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(currentTimeMillis);
                        sb2.append(C0059ao.a(13268));
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(C0059ao.a(13269));
                        sb2.append(str2);
                        sb2.append(C0059ao.a(13270));
                        sb2.append(join);
                        obj = sb2.toString();
                    }
                    this.f186.add(obj);
                    this.f183 += obj.length() << 1;
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private synchronized void m155(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.f185.put(C0059ao.a(13259), str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.f185.put(C0059ao.a(13260), str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.f185.put(C0059ao.a(13261), str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.f185.put(C0059ao.a(13262), str4);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m148(String str, PackageManager packageManager) {
        try {
            if (f182 == null) {
                f182 = new ae();
            }
            f182.m153(str, packageManager);
            if (f182 == null) {
                f182 = new ae();
            }
            BackgroundEvent trackingStopped = new ProxyEvent().body(f182.m149()).trackingStopped(AppsFlyerLib.getInstance().isTrackingStopped());
            StringBuilder sb = new StringBuilder();
            sb.append(ServerConfigHandler.getUrl(f181));
            sb.append(str);
            new Thread(new w((BackgroundEvent) trackingStopped.urlString(sb.toString()))).start();
        } catch (Throwable th) {
            AFLogger.afErrorLog(th);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final synchronized void m161() {
        this.f184 = false;
        m152();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static String[] m156(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        for (int i = 1; i < stackTraceElementArr.length; i++) {
            strArr[i] = stackTraceElementArr[i].toString();
        }
        return strArr;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private synchronized void m153(String str, PackageManager packageManager) {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        AppsFlyerLibCore appsFlyerLibCore = AppsFlyerLibCore.getInstance();
        String string = appsFlyerProperties.getString(C0059ao.a(13241));
        if (string != null) {
            try {
                this.f185 = new JSONObject(string);
            } catch (Throwable unused) {
            }
        } else {
            this.f185 = new JSONObject();
            m154(Build.BRAND, Build.MODEL, Build.VERSION.RELEASE, appsFlyerProperties.getString(C0059ao.a(13242)), appsFlyerLibCore.f104, appsFlyerLibCore.f95);
            StringBuilder sb = new StringBuilder(C0059ao.a(13243));
            sb.append(AppsFlyerLibCore.f82);
            m151(sb.toString(), appsFlyerProperties.getString(C0059ao.a(13244)), appsFlyerProperties.getString(C0059ao.a(13245)), appsFlyerProperties.getString(C0059ao.a(13246)));
            try {
                int i = packageManager.getPackageInfo(str, 0).versionCode;
                m155(str, String.valueOf(i), appsFlyerProperties.getString(C0059ao.a(13247)), appsFlyerProperties.getString(C0059ao.a(13248)));
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set(C0059ao.a(13249), this.f185.toString());
        }
        try {
            this.f185.put(C0059ao.a(13250), this.f189);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
