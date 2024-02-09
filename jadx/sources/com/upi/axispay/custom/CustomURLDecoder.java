package com.upi.axispay.custom;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CustomURLDecoder {
    @Deprecated
    public static String decode(String str) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
        throw new java.lang.IllegalArgumentException(myunmn.C0059ao.a(431) + r12.substring(r5, r5 + 3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String decode(java.lang.String r12, java.lang.String r13) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upi.axispay.custom.CustomURLDecoder.decode(java.lang.String, java.lang.String):java.lang.String");
    }

    private static boolean isValidHexChar(char c) {
        return ('0' <= c && c <= '9') || ('a' <= c && c <= 'f') || ('A' <= c && c <= 'F');
    }
}
