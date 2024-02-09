package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: eo0  reason: default package */
/* loaded from: classes.dex */
public class eo0 extends do0 {
    public static final String q0(String str, int i) {
        yl0.e(str, C0059ao.a(3613));
        if (i >= 0) {
            String substring = str.substring(0, tm0.c(i, str.length()));
            yl0.d(substring, C0059ao.a(3614));
            return substring;
        }
        throw new IllegalArgumentException((C0059ao.a(3615) + i + C0059ao.a(3616)).toString());
    }
}
