package defpackage;

import java.util.Locale;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: db  reason: default package */
/* loaded from: classes.dex */
public final class db {
    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int b(int i, int i2, int i3, String str) {
        if (i >= i2) {
            if (i <= i3) {
                return i;
            }
            throw new IllegalArgumentException(String.format(Locale.US, C0059ao.a(3786), str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, C0059ao.a(3787), str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static int c(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static int d(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        throw new IllegalArgumentException(C0059ao.a(3788) + Integer.toHexString(i) + C0059ao.a(3789) + Integer.toHexString(i2) + C0059ao.a(3790));
    }

    public static <T> T e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static <T> T f(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
