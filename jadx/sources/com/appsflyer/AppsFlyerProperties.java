package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import myunmn.C0059ao;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AppsFlyerProperties {
    public static final String ADDITIONAL_CUSTOM_DATA = null;
    public static final String AF_KEY = null;
    public static final String AF_WAITFOR_CUSTOMERID = null;
    public static final String APP_ID = null;
    public static final String APP_USER_ID = null;
    public static final String CHANNEL = null;
    public static final String COLLECT_ANDROID_ID = null;
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = null;
    public static final String COLLECT_FACEBOOK_ATTR_ID = null;
    public static final String COLLECT_FINGER_PRINT = null;
    public static final String COLLECT_IMEI = null;
    public static final String COLLECT_IMEI_FORCE_BY_USER = null;
    public static final String COLLECT_MAC = null;
    public static final String COLLECT_OAID = null;
    public static final String CURRENCY_CODE = null;
    public static final String DEVICE_TRACKING_DISABLED = null;
    public static final String DISABLE_KEYSTORE = null;
    public static final String DISABLE_LOGS_COMPLETELY = null;
    public static final String DISABLE_OTHER_SDK = null;
    public static final String DPM = null;
    public static final String EMAIL_CRYPT_TYPE = null;
    public static final String ENABLE_GPS_FALLBACK = null;
    public static final String EXTENSION = null;
    public static final String IS_UPDATE = null;
    public static final String LAUNCH_PROTECT_ENABLED = null;
    public static final String NEW_REFERRER_SENT = null;
    public static final String ONELINK_DOMAIN = null;
    public static final String ONELINK_ID = null;
    public static final String ONELINK_SCHEME = null;
    public static final String USER_EMAIL = null;
    public static final String USER_EMAILS = null;
    public static final String USE_HTTP_FALLBACK = null;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static AppsFlyerProperties f146;

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f147;

    /* renamed from: Ι  reason: contains not printable characters */
    private String f149;

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f150;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Map<String, Object> f148 = new HashMap();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f151 = false;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);
        

        /* renamed from: ı  reason: contains not printable characters */
        private final int f153;

        EmailsCryptType(int i) {
            this.f153 = i;
        }

        public final int getValue() {
            return this.f153;
        }
    }

    static {
        C0059ao.a(AppsFlyerProperties.class, 151);
        f146 = new AppsFlyerProperties();
    }

    private AppsFlyerProperties() {
    }

    public static AppsFlyerProperties getInstance() {
        return f146;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m130() {
        return this.f151;
    }

    public boolean getBoolean(String str, boolean z) {
        String string = getString(str);
        return string == null ? z : Boolean.valueOf(string).booleanValue();
    }

    public int getInt(String str, int i) {
        String string = getString(str);
        return string == null ? i : Integer.valueOf(string).intValue();
    }

    public long getLong(String str, long j) {
        String string = getString(str);
        return string == null ? j : Long.valueOf(string).longValue();
    }

    public synchronized Object getObject(String str) {
        return this.f148.get(str);
    }

    public String getReferrer(Context context) {
        String str = this.f149;
        if (str != null) {
            return str;
        }
        String a = C0059ao.a(4499);
        if (getString(a) != null) {
            return getString(a);
        }
        if (context == null) {
            return null;
        }
        return AppsFlyerLibCore.getSharedPreferences(context).getString(C0059ao.a(4500), null);
    }

    public synchronized String getString(String str) {
        return (String) this.f148.get(str);
    }

    public boolean isEnableLog() {
        return getBoolean(C0059ao.a(4501), true);
    }

    public boolean isFirstLaunchCalled() {
        return this.f150;
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean(C0059ao.a(4502), false);
    }

    public boolean isOnReceiveCalled() {
        return this.f147;
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean(C0059ao.a(4503), false);
    }

    public synchronized void loadProperties(Context context) {
        if (m130()) {
            return;
        }
        String string = AppsFlyerLibCore.getSharedPreferences(context).getString(C0059ao.a(4504), null);
        if (string != null) {
            AFLogger.afDebugLog(C0059ao.a(4505));
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (this.f148.get(next) == null) {
                        this.f148.put(next, jSONObject.getString(next));
                    }
                }
                this.f151 = true;
            } catch (JSONException e) {
                AFLogger.afErrorLog(C0059ao.a(4506), e);
            }
            StringBuilder sb = new StringBuilder(C0059ao.a(4507));
            sb.append(this.f151);
            AFLogger.afDebugLog(sb.toString());
        }
    }

    public synchronized void remove(String str) {
        this.f148.remove(str);
    }

    public synchronized void saveProperties(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putString(C0059ao.a(4508), new JSONObject(this.f148).toString()).apply();
    }

    public synchronized void set(String str, String str2) {
        this.f148.put(str, str2);
    }

    public synchronized void setCustomData(String str) {
        this.f148.put(C0059ao.a(4509), str);
    }

    public void setFirstLaunchCalled(boolean z) {
        this.f150 = z;
    }

    public void setOnReceiveCalled() {
        this.f147 = true;
    }

    public void setReferrer(String str) {
        set(C0059ao.a(4510), str);
        this.f149 = str;
    }

    public synchronized void setUserEmails(String str) {
        this.f148.put(C0059ao.a(4511), str);
    }

    public void setFirstLaunchCalled() {
        this.f150 = true;
    }

    public synchronized void set(String str, String[] strArr) {
        this.f148.put(str, strArr);
    }

    public synchronized void set(String str, int i) {
        this.f148.put(str, Integer.toString(i));
    }

    public synchronized void set(String str, long j) {
        this.f148.put(str, Long.toString(j));
    }

    public synchronized void set(String str, boolean z) {
        this.f148.put(str, Boolean.toString(z));
    }
}
