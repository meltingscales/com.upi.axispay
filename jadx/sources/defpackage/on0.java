package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: on0  reason: default package */
/* loaded from: classes.dex */
public class on0 {
    public static final int a(int i) {
        boolean z = false;
        if (2 <= i && i < 37) {
            z = true;
        }
        if (z) {
            return i;
        }
        throw new IllegalArgumentException(C0059ao.a(5344) + i + C0059ao.a(5345) + new rm0(2, 36));
    }

    public static final int b(char c, int i) {
        return Character.digit((int) c, i);
    }

    public static final boolean c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
