package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import defpackage.fq;
import defpackage.mr;
import defpackage.xq;
import defpackage.yq;
import defpackage.yu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: xs  reason: default package */
/* loaded from: classes.dex */
public class xs {
    public final Context a;
    public final wq b;
    public final lu c;
    public final bt d;
    public final Executor e;
    public final yu f;
    public final zu g;
    public final zu h;
    public final ku i;

    public xs(Context context, wq wqVar, lu luVar, bt btVar, Executor executor, yu yuVar, zu zuVar, zu zuVar2, ku kuVar) {
        this.a = context;
        this.b = wqVar;
        this.c = luVar;
        this.d = btVar;
        this.e = executor;
        this.f = yuVar;
        this.g = zuVar;
        this.h = zuVar2;
        this.i = kuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Boolean d(lq lqVar) {
        return Boolean.valueOf(this.c.E(lqVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ Iterable f(lq lqVar) {
        return this.c.o(lqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ Object h(Iterable iterable, lq lqVar, long j) {
        this.c.I(iterable);
        this.c.t(lqVar, this.g.a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object j(Iterable iterable) {
        this.c.f(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Object l() {
        this.i.m();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Object n(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.i.k(((Integer) entry.getValue()).intValue(), mr.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object p(lq lqVar, long j) {
        this.c.t(lqVar, this.g.a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object r(lq lqVar, int i) {
        this.d.a(lqVar, i + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void t(final lq lqVar, final int i, Runnable runnable) {
        try {
            try {
                yu yuVar = this.f;
                final lu luVar = this.c;
                Objects.requireNonNull(luVar);
                yuVar.b(new yu.a() { // from class: es
                    @Override // defpackage.yu.a
                    public final Object execute() {
                        return Integer.valueOf(lu.this.e());
                    }
                });
                if (!b()) {
                    this.f.b(new yu.a() { // from class: ns
                        @Override // defpackage.yu.a
                        public final Object execute() {
                            return xs.this.r(lqVar, i);
                        }
                    });
                } else {
                    u(lqVar, i);
                }
            } catch (xu unused) {
                this.d.a(lqVar, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public fq a(er erVar) {
        yu yuVar = this.f;
        final ku kuVar = this.i;
        Objects.requireNonNull(kuVar);
        fq.a a = fq.a();
        a.i(this.g.a());
        a.k(this.h.a());
        a.j(C0059ao.a(6840));
        a.h(new eq(vo.b(C0059ao.a(6841)), ((kr) yuVar.b(new yu.a() { // from class: rs
            @Override // defpackage.yu.a
            public final Object execute() {
                return ku.this.j();
            }
        })).f()));
        return erVar.a(a.d());
    }

    public boolean b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService(C0059ao.a(6842))).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void u(final lq lqVar, int i) {
        yq b;
        er a = this.b.a(lqVar.b());
        long j = 0;
        while (true) {
            final long j2 = j;
            while (((Boolean) this.f.b(new yu.a() { // from class: hs
                @Override // defpackage.yu.a
                public final Object execute() {
                    return xs.this.d(lqVar);
                }
            })).booleanValue()) {
                final Iterable<su> iterable = (Iterable) this.f.b(new yu.a() { // from class: js
                    @Override // defpackage.yu.a
                    public final Object execute() {
                        return xs.this.f(lqVar);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return;
                }
                if (a == null) {
                    qr.a(C0059ao.a(6843), C0059ao.a(6844), lqVar);
                    b = yq.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (su suVar : iterable) {
                        arrayList.add(suVar.b());
                    }
                    if (lqVar.e()) {
                        arrayList.add(a(a));
                    }
                    xq.a a2 = xq.a();
                    a2.b(arrayList);
                    a2.c(lqVar.c());
                    b = a.b(a2.a());
                }
                if (b.c() == yq.a.TRANSIENT_ERROR) {
                    this.f.b(new yu.a() { // from class: ks
                        @Override // defpackage.yu.a
                        public final Object execute() {
                            return xs.this.h(iterable, lqVar, j2);
                        }
                    });
                    this.d.b(lqVar, i + 1, true);
                    return;
                }
                this.f.b(new yu.a() { // from class: ms
                    @Override // defpackage.yu.a
                    public final Object execute() {
                        return xs.this.j(iterable);
                    }
                });
                if (b.c() == yq.a.OK) {
                    j = Math.max(j2, b.b());
                    if (lqVar.e()) {
                        this.f.b(new yu.a() { // from class: os
                            @Override // defpackage.yu.a
                            public final Object execute() {
                                return xs.this.l();
                            }
                        });
                    }
                } else if (b.c() == yq.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    for (su suVar2 : iterable) {
                        String j3 = suVar2.b().j();
                        if (!hashMap.containsKey(j3)) {
                            hashMap.put(j3, 1);
                        } else {
                            hashMap.put(j3, Integer.valueOf(((Integer) hashMap.get(j3)).intValue() + 1));
                        }
                    }
                    this.f.b(new yu.a() { // from class: is
                        @Override // defpackage.yu.a
                        public final Object execute() {
                            return xs.this.n(hashMap);
                        }
                    });
                }
            }
            this.f.b(new yu.a() { // from class: ls
                @Override // defpackage.yu.a
                public final Object execute() {
                    return xs.this.p(lqVar, j2);
                }
            });
            return;
        }
    }

    public void v(final lq lqVar, final int i, final Runnable runnable) {
        this.e.execute(new Runnable() { // from class: gs
            @Override // java.lang.Runnable
            public final void run() {
                xs.this.t(lqVar, i, runnable);
            }
        });
    }
}
