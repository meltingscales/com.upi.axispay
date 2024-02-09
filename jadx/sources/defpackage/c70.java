package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.olive.upi.transport.GPSTracker;
import com.olive.upi.transport.model.DeviceDetails;
import com.olive.upi.transport.service.CryptLibOne;
import defpackage.n70;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.UUID;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: c70  reason: default package */
/* loaded from: classes.dex */
public class c70 {
    public static final SecureRandom a = new SecureRandom();

    public static String a(String str) {
        return new BigDecimal(str).movePointLeft(2).toPlainString();
    }

    public static String b(String str) {
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(new SecureRandom().nextInt(899999) + 100000));
        while (stringBuffer.length() < 6) {
            stringBuffer.append(C0059ao.a(2858));
        }
        return stringBuffer.toString();
    }

    public static String c(String str) {
        return a(r(str));
    }

    public static DeviceDetails d(Context context) {
        DeviceDetails deviceDetails = new DeviceDetails();
        n70.a aVar = n70.f;
        deviceDetails.setApp(aVar.a().m(C0059ao.a(2859)));
        deviceDetails.setLocation(C0059ao.a(2860));
        deviceDetails.setCapability(C0059ao.a(2861));
        deviceDetails.setId(aVar.a().m(C0059ao.a(2862)));
        deviceDetails.setGcmId(aVar.a().m(C0059ao.a(2863)));
        deviceDetails.setOs(C0059ao.a(2864) + Build.VERSION.RELEASE);
        GPSTracker gPSTracker = new GPSTracker(context);
        if (gPSTracker.canGetLocation()) {
            double latitude = gPSTracker.getLatitude();
            double longitude = gPSTracker.getLongitude();
            deviceDetails.setGeocode(String.valueOf(longitude) + C0059ao.a(2865) + String.valueOf(latitude));
        }
        deviceDetails.setIp(f(true));
        deviceDetails.setMobile(aVar.a().m(C0059ao.a(2866)));
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(C0059ao.a(2867));
        String str = Build.MODEL;
        sb.append(str);
        String sb2 = sb.toString();
        if (sb2.length() <= 20) {
            str = sb2;
        }
        deviceDetails.setType(str);
        deviceDetails.setVersion(aVar.a().m(C0059ao.a(2868)));
        return deviceDetails;
    }

    public static String e(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), C0059ao.a(2869));
        if (TextUtils.isEmpty(string)) {
            String uuid = UUID.randomUUID().toString();
            uuid.replace(C0059ao.a(2870), C0059ao.a(2871));
            return uuid;
        }
        return string;
    }

    public static String f(boolean z) {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        boolean z2 = hostAddress.indexOf(58) < 0;
                        if (z) {
                            if (z2) {
                                return hostAddress;
                            }
                        } else if (!z2) {
                            int indexOf = hostAddress.indexOf(37);
                            return indexOf < 0 ? hostAddress.toUpperCase() : hostAddress.substring(0, indexOf).toUpperCase();
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return C0059ao.a(2872);
    }

    public static String g(Context context, String str) {
        byte[] bArr;
        CryptLibOne cryptLibOne = new CryptLibOne();
        try {
            bArr = cryptLibOne.SHA256(n70.f.a().m(C0059ao.a(2873)) + str);
        } catch (Exception e) {
            e.getMessage();
            bArr = null;
        }
        return Base64.encodeToString(bArr, 2);
    }

    public static String h() {
        String uuid = UUID.randomUUID().toString();
        StringBuilder sb = new StringBuilder();
        String a2 = C0059ao.a(2874);
        sb.append(a2);
        sb.append(i());
        String sb2 = sb.toString();
        String a3 = C0059ao.a(2875);
        String replaceFirst = uuid.replaceFirst(a3, sb2);
        String replaceFirst2 = replaceFirst.replaceFirst(a3, a2 + i());
        String replaceFirst3 = replaceFirst2.replaceFirst(a3, a2 + i());
        return replaceFirst3.replaceFirst(a3, a2 + i());
    }

    public static char i() {
        return C0059ao.a(2876).charAt(a.nextInt(7));
    }

    public static String j() {
        String replaceAll = UUID.randomUUID().toString().replaceAll(C0059ao.a(2877), C0059ao.a(2878));
        return C0059ao.a(2879) + replaceAll;
    }

    public static String k() {
        String substring = UUID.randomUUID().toString().replaceAll(C0059ao.a(2880), C0059ao.a(2881)).substring(0, 29);
        return C0059ao.a(2882) + substring + C0059ao.a(2883);
    }

    public static String l(String str) {
        Float valueOf = Float.valueOf(Float.parseFloat(str));
        DecimalFormat decimalFormat = new DecimalFormat(C0059ao.a(2884));
        decimalFormat.setMaximumFractionDigits(2);
        return decimalFormat.format(valueOf);
    }

    public static boolean m(Context context) {
        return context != null && ((ConnectivityManager) context.getSystemService(C0059ao.a(2885))).getNetworkInfo(0).isConnectedOrConnecting();
    }

    public static boolean n(Context context) {
        NetworkInfo activeNetworkInfo;
        return (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService(C0059ao.a(2886))).getActiveNetworkInfo()) == null || activeNetworkInfo.getState() != NetworkInfo.State.CONNECTED) ? false : true;
    }

    public static boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        int lastIndexOf = str.lastIndexOf(C0059ao.a(2887));
        return length > 3 && lastIndexOf > 0 && lastIndexOf < length - 1;
    }

    public static String p(String str) {
        return TextUtils.isEmpty(str) ? C0059ao.a(2888) : str.replaceAll(C0059ao.a(2889), C0059ao.a(2890));
    }

    public static void q() {
        n70.a aVar = n70.f;
        aVar.a().A(C0059ao.a(2891), false);
        aVar.a().y(C0059ao.a(2892), C0059ao.a(2893));
    }

    public static String r(String str) {
        return new BigDecimal(str).movePointRight(2).toPlainString();
    }
}
