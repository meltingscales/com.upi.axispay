package org.apache.commons.codec.digest;

import java.security.SecureRandom;
import java.util.Random;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class B64 {
    public static final char[] B64T_ARRAY;
    public static final String B64T_STRING = null;

    static {
        C0059ao.a(B64.class, 333);
        B64T_ARRAY = C0059ao.a(9964).toCharArray();
    }

    public static void b64from24bit(byte b, byte b2, byte b3, int i, StringBuilder sb) {
        int i2 = ((b << 16) & 16777215) | ((b2 << 8) & 65535) | (b3 & 255);
        while (true) {
            int i3 = i - 1;
            if (i <= 0) {
                return;
            }
            sb.append(B64T_ARRAY[i2 & 63]);
            i2 >>= 6;
            i = i3;
        }
    }

    public static String getRandomSalt(int i) {
        return getRandomSalt(i, new SecureRandom());
    }

    public static String getRandomSalt(int i, Random random) {
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 1; i2 <= i; i2++) {
            sb.append(C0059ao.a(9965).charAt(random.nextInt(64)));
        }
        return sb.toString();
    }
}
