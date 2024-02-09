package org.apache.commons.codec.net;

import myunmn.C0059ao;
import org.apache.commons.codec.DecoderException;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Utils {
    private static final int RADIX = 0;

    static {
        C0059ao.a(Utils.class, 376);
    }

    public static int digit16(byte b) throws DecoderException {
        int digit = Character.digit((char) b, 16);
        if (digit != -1) {
            return digit;
        }
        throw new DecoderException(C0059ao.a(8449) + ((int) b));
    }

    public static char hexDigit(int i) {
        return Character.toUpperCase(Character.forDigit(i & 15, 16));
    }
}
