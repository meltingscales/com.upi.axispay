package defpackage;

import com.google.auto.value.AutoValue;

/* compiled from: AxisPay */
@AutoValue
/* renamed from: wo  reason: default package */
/* loaded from: classes.dex */
public abstract class wo<T> {
    public static <T> wo<T> d(T t) {
        return new uo(null, t, xo.HIGHEST);
    }

    public abstract Integer a();

    public abstract T b();

    public abstract xo c();
}
