package defpackage;

import com.google.auto.value.AutoValue;

/* compiled from: AxisPay */
@AutoValue
/* renamed from: yq  reason: default package */
/* loaded from: classes.dex */
public abstract class yq {

    /* compiled from: AxisPay */
    /* renamed from: yq$a */
    /* loaded from: classes.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static yq a() {
        return new tq(a.FATAL_ERROR, -1L);
    }

    public static yq d() {
        return new tq(a.INVALID_PAYLOAD, -1L);
    }

    public static yq e(long j) {
        return new tq(a.OK, j);
    }

    public static yq f() {
        return new tq(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
