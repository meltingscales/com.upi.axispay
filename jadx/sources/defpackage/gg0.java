package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.util.Date;
import javax.crypto.Cipher;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: gg0  reason: default package */
/* loaded from: classes.dex */
public class gg0 {
    public static byte[] a(String str, PublicKey publicKey) {
        try {
            Cipher cipher = Cipher.getInstance(C0059ao.a(4105));
            cipher.init(1, publicKey);
            return cipher.doFinal(str.getBytes());
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(cg0.b(a(str, c(C0059ao.a(4106)))), C0059ao.a(4107));
    }

    public static PublicKey c(String str) {
        try {
            return KeyFactory.getInstance(C0059ao.a(4108)).generatePublic(new X509EncodedKeySpec(cg0.a(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static long d(int i, int i2) {
        return Double.valueOf(Math.floor((new SecureRandom().nextDouble() * ((i2 - i) + 1)) + i)).longValue();
    }

    public static String e(String str) throws Exception {
        long parseLong = Long.parseLong(str) * d(1, 999);
        long time = new Date().getTime();
        return parseLong + C0059ao.a(4109) + time;
    }
}
