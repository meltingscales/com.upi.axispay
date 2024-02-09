package defpackage;

import java.util.concurrent.Executor;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: hq  reason: default package */
/* loaded from: classes.dex */
public final class hq implements hr<Executor> {

    /* compiled from: AxisPay */
    /* renamed from: hq$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static final hq a = new hq();
    }

    public static hq a() {
        return a.a;
    }

    public static Executor b() {
        Executor a2 = gq.a();
        jr.c(a2, C0059ao.a(8146));
        return a2;
    }

    @Override // defpackage.wh0
    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
