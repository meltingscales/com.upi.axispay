package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzcx;
import com.google.android.gms.measurement.internal.zzcz;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.settings.SettingsJsonConstants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzc {
    private static final Set<String> zzaba = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", FirebaseAnalytics.Event.CAMPAIGN_DETAILS, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));
    private static final List<String> zzabb = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", FirebaseAnalytics.Event.APP_OPEN);
    private static final List<String> zzabc = Arrays.asList("auto", SettingsJsonConstants.APP_KEY, "am");
    private static final List<String> zzabd = Arrays.asList("_r", "_dbg");
    private static final List<String> zzabe = Arrays.asList((String[]) ArrayUtils.concat(zzcz.zzpc, zzcz.zzpd));
    private static final List<String> zzabf = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static boolean zza(String str, Bundle bundle) {
        if (zzabb.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String str2 : zzabd) {
                if (bundle.containsKey(str2)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean zzb(String str, String str2, Bundle bundle) {
        if ("_cmp".equals(str2)) {
            if (zzcg(str) && bundle != null) {
                for (String str3 : zzabd) {
                    if (bundle.containsKey(str3)) {
                        return false;
                    }
                }
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case 101200:
                        if (str.equals("fcm")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 101230:
                        if (str.equals("fdl")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3142703:
                        if (str.equals("fiam")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        bundle.putString("_cis", "fcm_integration");
                        return true;
                    case 1:
                        bundle.putString("_cis", "fdl_integration");
                        return true;
                    case 2:
                        bundle.putString("_cis", "fiam_integration");
                        return true;
                    default:
                        return false;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean zzcg(String str) {
        return !zzabc.contains(str);
    }

    public static boolean zzch(String str) {
        return !zzaba.contains(str);
    }

    public static boolean zzci(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (Character.isLetter(codePointAt)) {
            int length = str.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
        return false;
    }

    public static boolean zzcj(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (Character.isLetter(codePointAt) || codePointAt == 95) {
            int length = str.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
        return false;
    }

    public static String zzck(String str) {
        String zzbg = zzcx.zzbg(str);
        return zzbg != null ? zzbg : str;
    }

    public static String zzcl(String str) {
        String zzbh = zzcx.zzbh(str);
        return zzbh != null ? zzbh : str;
    }

    public static boolean zzu(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        } else if (AppMeasurement.UserProperty.FIREBASE_LAST_NOTIFICATION.equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        } else if (zzabe.contains(str2)) {
            return false;
        } else {
            for (String str3 : zzabf) {
                if (str2.matches(str3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean zza(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str;
        if (conditionalUserProperty == null || (str = conditionalUserProperty.origin) == null || str.isEmpty()) {
            return false;
        }
        Object obj = conditionalUserProperty.value;
        if ((obj == null || zzeb.zza(obj) != null) && zzcg(str) && zzu(str, conditionalUserProperty.name)) {
            String str2 = conditionalUserProperty.expiredEventName;
            if (str2 == null || (zza(str2, conditionalUserProperty.expiredEventParams) && zzb(str, conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams))) {
                String str3 = conditionalUserProperty.triggeredEventName;
                if (str3 == null || (zza(str3, conditionalUserProperty.triggeredEventParams) && zzb(str, conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams))) {
                    String str4 = conditionalUserProperty.timedOutEventName;
                    if (str4 != null) {
                        return zza(str4, conditionalUserProperty.timedOutEventParams) && zzb(str, conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static AppMeasurement.ConditionalUserProperty zzb(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        AppMeasurement.ConditionalUserProperty conditionalUserProperty2 = new AppMeasurement.ConditionalUserProperty();
        conditionalUserProperty2.mOrigin = conditionalUserProperty.origin;
        conditionalUserProperty2.mActive = conditionalUserProperty.active;
        conditionalUserProperty2.mCreationTimestamp = conditionalUserProperty.creationTimestamp;
        conditionalUserProperty2.mExpiredEventName = conditionalUserProperty.expiredEventName;
        if (conditionalUserProperty.expiredEventParams != null) {
            conditionalUserProperty2.mExpiredEventParams = new Bundle(conditionalUserProperty.expiredEventParams);
        }
        conditionalUserProperty2.mName = conditionalUserProperty.name;
        conditionalUserProperty2.mTimedOutEventName = conditionalUserProperty.timedOutEventName;
        if (conditionalUserProperty.timedOutEventParams != null) {
            conditionalUserProperty2.mTimedOutEventParams = new Bundle(conditionalUserProperty.timedOutEventParams);
        }
        conditionalUserProperty2.mTimeToLive = conditionalUserProperty.timeToLive;
        conditionalUserProperty2.mTriggeredEventName = conditionalUserProperty.triggeredEventName;
        if (conditionalUserProperty.triggeredEventParams != null) {
            conditionalUserProperty2.mTriggeredEventParams = new Bundle(conditionalUserProperty.triggeredEventParams);
        }
        conditionalUserProperty2.mTriggeredTimestamp = conditionalUserProperty.triggeredTimestamp;
        conditionalUserProperty2.mTriggerEventName = conditionalUserProperty.triggerEventName;
        conditionalUserProperty2.mTriggerTimeout = conditionalUserProperty.triggerTimeout;
        Object obj = conditionalUserProperty.value;
        if (obj != null) {
            conditionalUserProperty2.mValue = zzeb.zza(obj);
        }
        return conditionalUserProperty2;
    }

    public static AnalyticsConnector.ConditionalUserProperty zzb(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty2 = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty2.origin = conditionalUserProperty.mOrigin;
        conditionalUserProperty2.active = conditionalUserProperty.mActive;
        conditionalUserProperty2.creationTimestamp = conditionalUserProperty.mCreationTimestamp;
        conditionalUserProperty2.expiredEventName = conditionalUserProperty.mExpiredEventName;
        if (conditionalUserProperty.mExpiredEventParams != null) {
            conditionalUserProperty2.expiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
        }
        conditionalUserProperty2.name = conditionalUserProperty.mName;
        conditionalUserProperty2.timedOutEventName = conditionalUserProperty.mTimedOutEventName;
        if (conditionalUserProperty.mTimedOutEventParams != null) {
            conditionalUserProperty2.timedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
        }
        conditionalUserProperty2.timeToLive = conditionalUserProperty.mTimeToLive;
        conditionalUserProperty2.triggeredEventName = conditionalUserProperty.mTriggeredEventName;
        if (conditionalUserProperty.mTriggeredEventParams != null) {
            conditionalUserProperty2.triggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
        }
        conditionalUserProperty2.triggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
        conditionalUserProperty2.triggerEventName = conditionalUserProperty.mTriggerEventName;
        conditionalUserProperty2.triggerTimeout = conditionalUserProperty.mTriggerTimeout;
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            conditionalUserProperty2.value = zzeb.zza(obj);
        }
        return conditionalUserProperty2;
    }
}
