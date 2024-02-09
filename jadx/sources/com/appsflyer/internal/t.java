package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class t {

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: ɩ  reason: contains not printable characters */
        public final String f327;

        /* renamed from: Ι  reason: contains not printable characters */
        public final String f328;

        /* renamed from: ι  reason: contains not printable characters */
        public final String f329;

        public c(String str, String str2, String str3) {
            this.f327 = str;
            this.f329 = str2;
            this.f328 = str3;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: ı  reason: contains not printable characters */
        public static final t f330 = new t();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean m220(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static c m221(Context context) {
        String str;
        String str2;
        String str3;
        String a = C0059ao.a(12054);
        String str4 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(C0059ao.a(12055));
            String a2 = C0059ao.a(12056);
            String a3 = C0059ao.a(12057);
            if (connectivityManager != null) {
                int i = 0;
                if (21 <= Build.VERSION.SDK_INT) {
                    Network[] allNetworks = connectivityManager.getAllNetworks();
                    int length = allNetworks.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
                        if (!m220(networkInfo)) {
                            i++;
                        } else if (1 != networkInfo.getType()) {
                            if (networkInfo.getType() == 0) {
                            }
                        }
                    }
                } else {
                    if (!m220(connectivityManager.getNetworkInfo(1))) {
                        if (!m220(connectivityManager.getNetworkInfo(0))) {
                            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            if (m220(activeNetworkInfo)) {
                                if (1 != activeNetworkInfo.getType()) {
                                    if (activeNetworkInfo.getType() == 0) {
                                    }
                                }
                            }
                        }
                        a = a2;
                    }
                    a = a3;
                }
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(C0059ao.a(12058));
            str2 = telephonyManager.getSimOperatorName();
            try {
                str3 = telephonyManager.getNetworkOperatorName();
                if ((str3 == null || str3.isEmpty()) && 2 == telephonyManager.getPhoneType()) {
                    str3 = C0059ao.a(12059);
                }
            } catch (Throwable th) {
                th = th;
                str = null;
                str4 = str2;
                AFLogger.afErrorLog(C0059ao.a(12060), th);
                String str5 = str;
                str2 = str4;
                str3 = str5;
                return new c(a, str3, str2);
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
        return new c(a, str3, str2);
    }
}
