package org.apache.commons.codec.language;

import java.util.Locale;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Caverphone1 extends AbstractCaverphone {
    private static final String SIX_1 = null;

    static {
        C0059ao.a(Caverphone1.class, 409);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        String a = C0059ao.a(8660);
        if (str == null || str.length() == 0) {
            return a;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        String a2 = C0059ao.a(8661);
        String a3 = C0059ao.a(8662);
        String replaceAll = lowerCase.replaceAll(a2, a3).replaceAll(C0059ao.a(8663), C0059ao.a(8664)).replaceAll(C0059ao.a(8665), C0059ao.a(8666)).replaceAll(C0059ao.a(8667), C0059ao.a(8668)).replaceAll(C0059ao.a(8669), C0059ao.a(8670)).replaceAll(C0059ao.a(8671), C0059ao.a(8672)).replaceAll(C0059ao.a(8673), C0059ao.a(8674)).replaceAll(C0059ao.a(8675), C0059ao.a(8676)).replaceAll(C0059ao.a(8677), C0059ao.a(8678)).replaceAll(C0059ao.a(8679), C0059ao.a(8680)).replaceAll(C0059ao.a(8681), C0059ao.a(8682)).replaceAll(C0059ao.a(8683), C0059ao.a(8684));
        String a4 = C0059ao.a(8685);
        String a5 = C0059ao.a(8686);
        String replaceAll2 = replaceAll.replaceAll(a4, a5).replaceAll(C0059ao.a(8687), a5).replaceAll(C0059ao.a(8688), a5).replaceAll(C0059ao.a(8689), C0059ao.a(8690)).replaceAll(C0059ao.a(8691), C0059ao.a(8692)).replaceAll(C0059ao.a(8693), C0059ao.a(8694)).replaceAll(C0059ao.a(8695), C0059ao.a(8696)).replaceAll(C0059ao.a(8697), C0059ao.a(8698)).replaceAll(C0059ao.a(8699), C0059ao.a(8700)).replaceAll(C0059ao.a(8701), C0059ao.a(8702)).replaceAll(C0059ao.a(8703), C0059ao.a(8704)).replaceAll(C0059ao.a(8705), C0059ao.a(8706));
        String a6 = C0059ao.a(8707);
        String a7 = C0059ao.a(8708);
        String replaceAll3 = replaceAll2.replaceAll(a6, a7);
        String a8 = C0059ao.a(8709);
        String a9 = C0059ao.a(8710);
        String replaceAll4 = replaceAll3.replaceAll(a8, a9).replaceAll(C0059ao.a(8711), C0059ao.a(8712)).replaceAll(C0059ao.a(8713), C0059ao.a(8714)).replaceAll(C0059ao.a(8715), a5).replaceAll(C0059ao.a(8716), C0059ao.a(8717)).replaceAll(C0059ao.a(8718), C0059ao.a(8719)).replaceAll(C0059ao.a(8720), C0059ao.a(8721)).replaceAll(C0059ao.a(8722), C0059ao.a(8723)).replaceAll(C0059ao.a(8724), C0059ao.a(8725)).replaceAll(C0059ao.a(8726), C0059ao.a(8727)).replaceAll(C0059ao.a(8728), C0059ao.a(8729)).replaceAll(C0059ao.a(8730), C0059ao.a(8731)).replaceAll(C0059ao.a(8732), C0059ao.a(8733)).replaceAll(C0059ao.a(8734), C0059ao.a(8735)).replaceAll(C0059ao.a(8736), C0059ao.a(8737));
        String a10 = C0059ao.a(8738);
        String a11 = C0059ao.a(8739);
        String replaceAll5 = replaceAll4.replaceAll(a10, a11).replaceAll(C0059ao.a(8740), a7).replaceAll(C0059ao.a(8741), a11).replaceAll(C0059ao.a(8742), C0059ao.a(8743)).replaceAll(C0059ao.a(8744), C0059ao.a(8745)).replaceAll(C0059ao.a(8746), a11).replaceAll(C0059ao.a(8747), C0059ao.a(8748)).replaceAll(C0059ao.a(8749), C0059ao.a(8750)).replaceAll(C0059ao.a(8751), a11);
        String a12 = C0059ao.a(8752);
        String a13 = C0059ao.a(8753);
        String replaceAll6 = replaceAll5.replaceAll(a12, a13).replaceAll(C0059ao.a(8754), C0059ao.a(8755)).replaceAll(a13, a11).replaceAll(a11, a3).replaceAll(a9, a3);
        return (replaceAll6 + a).substring(0, 6);
    }
}
