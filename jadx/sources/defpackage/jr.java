package defpackage;

import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: jr  reason: default package */
/* loaded from: classes.dex */
public final class jr {
    public static <T> void a(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + C0059ao.a(10032));
    }

    public static <T> T b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static <T> T c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
