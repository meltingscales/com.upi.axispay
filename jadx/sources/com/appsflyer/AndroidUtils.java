package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AndroidUtils {
    public static long getVersionCode(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return 0L;
        }
    }

    public static String getVersionName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return C0059ao.a(10745);
        }
    }

    public static boolean isPermissionAvailable(Context context, String str) {
        if (str != null) {
            int checkPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
            StringBuilder sb = new StringBuilder(C0059ao.a(10746));
            sb.append(str);
            sb.append(C0059ao.a(10747));
            sb.append(checkPermission);
            AFLogger.afRDLog(sb.toString());
            return checkPermission == 0;
        }
        throw new IllegalArgumentException(C0059ao.a(10748));
    }

    public static String signature(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException, CertificateException, NoSuchAlgorithmException {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance(C0059ao.a(10750));
        messageDigest.update(((X509Certificate) CertificateFactory.getInstance(C0059ao.a(10749)).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded());
        return String.format(C0059ao.a(10751), new BigInteger(1, messageDigest.digest()));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m44() {
        return Build.BRAND.equals(C0059ao.a(10752));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static Map<String, String> m45(Context context, Map<String, String> map, Uri uri) {
        boolean z;
        String[] split;
        int i;
        String a = C0059ao.a(10753);
        String encodedQuery = uri.getEncodedQuery();
        String a2 = C0059ao.a(10754);
        if (encodedQuery != null) {
            z = false;
            for (String str : uri.getEncodedQuery().split(C0059ao.a(10755))) {
                int indexOf = str.indexOf(C0059ao.a(10756));
                String substring = indexOf > 0 ? str.substring(0, indexOf) : str;
                if (!map.containsKey(substring)) {
                    if (substring.equals(C0059ao.a(10757))) {
                        substring = C0059ao.a(10758);
                    } else if (substring.equals(C0059ao.a(10759))) {
                        substring = a2;
                    } else if (substring.equals(C0059ao.a(10760))) {
                        z = true;
                        substring = C0059ao.a(10761);
                    }
                    map.put(substring, C0059ao.a(10762));
                }
                map.put(substring, (indexOf <= 0 || str.length() <= (i = indexOf + 1)) ? null : str.substring(i));
            }
        } else {
            z = false;
        }
        try {
            if (!map.containsKey(a)) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0059ao.a(10763), Locale.US);
                long j = packageInfo.firstInstallTime;
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone(C0059ao.a(10764)));
                map.put(a, simpleDateFormat.format(new Date(j)));
            }
        } catch (Exception e) {
            AFLogger.afErrorLog(C0059ao.a(10765), e);
        }
        if (uri.getQueryParameter(C0059ao.a(10766)) != null) {
            String a3 = C0059ao.a(10767);
            if (!map.containsKey(a3)) {
                map.put(a3, C0059ao.a(10768));
            }
        }
        if (z) {
            map.remove(a2);
        }
        String path = uri.getPath();
        if (path != null) {
            map.put(C0059ao.a(10769), path);
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            map.put(C0059ao.a(10770), scheme);
        }
        String host = uri.getHost();
        if (host != null) {
            map.put(C0059ao.a(10771), host);
        }
        return map;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m46(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }
}
