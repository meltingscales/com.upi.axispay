package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: gp  reason: default package */
/* loaded from: classes.dex */
public final class gp {
    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                if (str2.length() > i) {
                    sb.append(str2.charAt(i));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException(C0059ao.a(6747));
    }
}
