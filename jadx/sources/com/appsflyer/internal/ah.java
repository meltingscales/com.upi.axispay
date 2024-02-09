package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class ah {

    /* renamed from: ǃ  reason: contains not printable characters */
    private c f193 = new c() { // from class: com.appsflyer.internal.ah.4
        @Override // com.appsflyer.internal.ah.c
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Class<?> mo171(String str) throws ClassNotFoundException {
            return Class.forName(str);
        }
    };

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: ǃ */
        Class<?> mo171(String str) throws ClassNotFoundException;
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum e {
        UNITY("android_unity", "com.unity3d.player.UnityPlayer"),
        REACT_NATIVE("android_reactNative", "com.facebook.react.ReactApplication"),
        CORDOVA("android_cordova", "org.apache.cordova.CordovaActivity"),
        SEGMENT("android_segment", "com.segment.analytics.integrations.Integration"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        DEFAULT("android_native", "android_native"),
        ADOBE_EX("android_adobe_ex", "com.appsflyer.adobeextension"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin");
        

        /* renamed from: і  reason: contains not printable characters */
        private String f203;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private String f204;

        e(String str, String str2) {
            this.f204 = str;
            this.f203 = str2;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m169(String str) {
        try {
            this.f193.mo171(str);
            StringBuilder sb = new StringBuilder(C0059ao.a(13401));
            sb.append(str);
            sb.append(C0059ao.a(13402));
            AFLogger.afRDLog(sb.toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m170() {
        e[] values;
        for (e eVar : e.values()) {
            if (m169(eVar.f203)) {
                return eVar.f204;
            }
        }
        return e.DEFAULT.f204;
    }
}
