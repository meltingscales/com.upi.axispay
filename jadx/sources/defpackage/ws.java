package defpackage;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import defpackage.us;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import myunmn.C0059ao;

/* compiled from: AxisPay */
@AutoValue
/* renamed from: ws  reason: default package */
/* loaded from: classes.dex */
public abstract class ws {

    /* compiled from: AxisPay */
    /* renamed from: ws$a */
    /* loaded from: classes.dex */
    public static class a {
        public zu a;
        public Map<xo, b> b = new HashMap();

        public a a(xo xoVar, b bVar) {
            this.b.put(xoVar, bVar);
            return this;
        }

        public ws b() {
            Objects.requireNonNull(this.a, C0059ao.a(6921));
            if (this.b.keySet().size() >= xo.values().length) {
                Map<xo, b> map = this.b;
                this.b = new HashMap();
                return ws.d(this.a, map);
            }
            throw new IllegalStateException(C0059ao.a(6922));
        }

        public a c(zu zuVar) {
            this.a = zuVar;
            return this;
        }
    }

    /* compiled from: AxisPay */
    @AutoValue
    /* renamed from: ws$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* compiled from: AxisPay */
        @AutoValue.Builder
        /* renamed from: ws$b$a */
        /* loaded from: classes.dex */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j);

            public abstract a c(Set<c> set);

            public abstract a d(long j);
        }

        public static a a() {
            us.b bVar = new us.b();
            bVar.c(Collections.emptySet());
            return bVar;
        }

        public abstract long b();

        public abstract Set<c> c();

        public abstract long d();
    }

    /* compiled from: AxisPay */
    /* renamed from: ws$c */
    /* loaded from: classes.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a b() {
        return new a();
    }

    public static ws d(zu zuVar, Map<xo, b> map) {
        return new ts(zuVar, map);
    }

    public static ws f(zu zuVar) {
        a b2 = b();
        xo xoVar = xo.DEFAULT;
        b.a a2 = b.a();
        a2.b(30000L);
        a2.d(86400000L);
        b2.a(xoVar, a2.a());
        xo xoVar2 = xo.HIGHEST;
        b.a a3 = b.a();
        a3.b(1000L);
        a3.d(86400000L);
        b2.a(xoVar2, a3.a());
        xo xoVar3 = xo.VERY_LOW;
        b.a a4 = b.a();
        a4.b(86400000L);
        a4.d(86400000L);
        a4.c(i(c.NETWORK_UNMETERED, c.DEVICE_IDLE));
        b2.a(xoVar3, a4.a());
        b2.c(zuVar);
        return b2.b();
    }

    public static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    public final long a(int i, long j) {
        int i2;
        return (long) (Math.pow(3.0d, i - 1) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * i2)));
    }

    public JobInfo.Builder c(JobInfo.Builder builder, xo xoVar, long j, int i) {
        builder.setMinimumLatency(g(xoVar, j, i));
        j(builder, h().get(xoVar).c());
        return builder;
    }

    public abstract zu e();

    public long g(xo xoVar, long j, int i) {
        long a2 = j - e().a();
        b bVar = h().get(xoVar);
        return Math.min(Math.max(a(i, bVar.b()), a2), bVar.d());
    }

    public abstract Map<xo, b> h();

    public final void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
