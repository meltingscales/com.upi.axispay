package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.vision.barcode.Barcode;
import java.security.MessageDigest;
import java.util.Formatter;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class ac {
    /* renamed from: ı  reason: contains not printable characters */
    private static String m142(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            formatter.format(C0059ao.a(13726), Byte.valueOf(bArr[i]));
        }
        String obj = formatter.toString();
        formatter.close();
        return obj;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static String m144(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C0059ao.a(13728));
            messageDigest.reset();
            messageDigest.update(str.getBytes(C0059ao.a(13729)));
            return m142(messageDigest.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(C0059ao.a(13730));
            sb.append(str.substring(0, 6));
            sb.append(C0059ao.a(13731));
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static String m145(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C0059ao.a(13732));
            messageDigest.reset();
            messageDigest.update(str.getBytes(C0059ao.a(13733)));
            return m142(messageDigest.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(C0059ao.a(13734));
            sb.append(str.substring(0, 6));
            sb.append(C0059ao.a(13735));
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static String m146(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C0059ao.a(13736));
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toString((b & 255) + Barcode.QR_CODE, 16).substring(1));
            }
            return sb.toString();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder(C0059ao.a(13737));
            sb2.append(str.substring(0, 6));
            sb2.append(C0059ao.a(13738));
            AFLogger.afErrorLog(sb2.toString(), e);
            return null;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static String m143(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(AppsFlyerProperties.getInstance().getString(C0059ao.a(13727)));
        sb.append(j);
        return m144(sb.toString());
    }
}
