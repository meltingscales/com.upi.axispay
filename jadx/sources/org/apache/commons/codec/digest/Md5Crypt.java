package org.apache.commons.codec.digest;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Md5Crypt {
    public static final String APR1_PREFIX = null;
    private static final int BLOCKSIZE = 0;
    public static final String MD5_PREFIX = null;
    private static final int ROUNDS = 0;

    static {
        C0059ao.a(Md5Crypt.class, 210);
    }

    public static String apr1Crypt(byte[] bArr) {
        return apr1Crypt(bArr, C0059ao.a(14517) + B64.getRandomSalt(8));
    }

    public static String md5Crypt(byte[] bArr) {
        return md5Crypt(bArr, C0059ao.a(14520) + B64.getRandomSalt(8));
    }

    public static String apr1Crypt(byte[] bArr, Random random) {
        return apr1Crypt(bArr, C0059ao.a(14519) + B64.getRandomSalt(8, random));
    }

    public static String md5Crypt(byte[] bArr, Random random) {
        return md5Crypt(bArr, C0059ao.a(14527) + B64.getRandomSalt(8, random));
    }

    public static String apr1Crypt(byte[] bArr, String str) {
        String a = C0059ao.a(14518);
        if (str != null && !str.startsWith(a)) {
            str = a + str;
        }
        return md5Crypt(bArr, str, a);
    }

    public static String md5Crypt(byte[] bArr, String str) {
        return md5Crypt(bArr, str, C0059ao.a(14521));
    }

    public static String md5Crypt(byte[] bArr, String str, String str2) {
        return md5Crypt(bArr, str, str2, new SecureRandom());
    }

    public static String md5Crypt(byte[] bArr, String str, String str2, Random random) {
        String group;
        int length = bArr.length;
        String a = C0059ao.a(14522);
        if (str == null) {
            group = B64.getRandomSalt(8, random);
        } else {
            Matcher matcher = Pattern.compile(C0059ao.a(14523) + str2.replace(a, C0059ao.a(14524)) + C0059ao.a(14525)).matcher(str);
            if (matcher.find()) {
                group = matcher.group(1);
            } else {
                throw new IllegalArgumentException(C0059ao.a(14526) + str);
            }
        }
        byte[] bytes = group.getBytes(StandardCharsets.UTF_8);
        MessageDigest md5Digest = DigestUtils.getMd5Digest();
        md5Digest.update(bArr);
        md5Digest.update(str2.getBytes(StandardCharsets.UTF_8));
        md5Digest.update(bytes);
        MessageDigest md5Digest2 = DigestUtils.getMd5Digest();
        md5Digest2.update(bArr);
        md5Digest2.update(bytes);
        md5Digest2.update(bArr);
        byte[] digest = md5Digest2.digest();
        int i = length;
        while (true) {
            int i2 = 16;
            if (i <= 0) {
                break;
            }
            if (i <= 16) {
                i2 = i;
            }
            md5Digest.update(digest, 0, i2);
            i -= 16;
        }
        Arrays.fill(digest, (byte) 0);
        while (length > 0) {
            if ((length & 1) == 1) {
                md5Digest.update(digest[0]);
            } else {
                md5Digest.update(bArr[0]);
            }
            length >>= 1;
        }
        StringBuilder sb = new StringBuilder(str2 + group + a);
        byte[] digest2 = md5Digest.digest();
        for (int i3 = 0; i3 < 1000; i3++) {
            md5Digest2 = DigestUtils.getMd5Digest();
            int i4 = i3 & 1;
            if (i4 != 0) {
                md5Digest2.update(bArr);
            } else {
                md5Digest2.update(digest2, 0, 16);
            }
            if (i3 % 3 != 0) {
                md5Digest2.update(bytes);
            }
            if (i3 % 7 != 0) {
                md5Digest2.update(bArr);
            }
            if (i4 != 0) {
                md5Digest2.update(digest2, 0, 16);
            } else {
                md5Digest2.update(bArr);
            }
            digest2 = md5Digest2.digest();
        }
        B64.b64from24bit(digest2[0], digest2[6], digest2[12], 4, sb);
        B64.b64from24bit(digest2[1], digest2[7], digest2[13], 4, sb);
        B64.b64from24bit(digest2[2], digest2[8], digest2[14], 4, sb);
        B64.b64from24bit(digest2[3], digest2[9], digest2[15], 4, sb);
        B64.b64from24bit(digest2[4], digest2[10], digest2[5], 4, sb);
        B64.b64from24bit((byte) 0, (byte) 0, digest2[11], 2, sb);
        md5Digest.reset();
        md5Digest2.reset();
        Arrays.fill(bArr, (byte) 0);
        Arrays.fill(bytes, (byte) 0);
        Arrays.fill(digest2, (byte) 0);
        return sb.toString();
    }

    public static String apr1Crypt(String str) {
        return apr1Crypt(str.getBytes(StandardCharsets.UTF_8));
    }

    public static String apr1Crypt(String str, String str2) {
        return apr1Crypt(str.getBytes(StandardCharsets.UTF_8), str2);
    }
}
