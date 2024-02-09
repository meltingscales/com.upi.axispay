package defpackage;

import defpackage.bl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: AxisPay */
/* renamed from: zk  reason: default package */
/* loaded from: classes.dex */
public final class zk implements fm {
    public final fm b;
    public final bl.f c;
    public final String d;
    public final List<Object> e = new ArrayList();
    public final Executor f;

    public zk(fm fmVar, bl.f fVar, String str, Executor executor) {
        this.b = fmVar;
        this.c = fVar;
        this.d = str;
        this.f = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void j() {
        this.c.a(this.d, this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m() {
        this.c.a(this.d, this.e);
    }

    @Override // defpackage.dm
    public void C(int i, long j) {
        r(i, Long.valueOf(j));
        this.b.C(i, j);
    }

    @Override // defpackage.dm
    public void H(int i, byte[] bArr) {
        r(i, bArr);
        this.b.H(i, bArr);
    }

    @Override // defpackage.fm
    public long L() {
        this.f.execute(new Runnable() { // from class: ak
            @Override // java.lang.Runnable
            public final void run() {
                zk.this.j();
            }
        });
        return this.b.L();
    }

    @Override // defpackage.dm
    public void a(int i, String str) {
        r(i, str);
        this.b.a(i, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b.close();
    }

    @Override // defpackage.fm
    public int l() {
        this.f.execute(new Runnable() { // from class: bk
            @Override // java.lang.Runnable
            public final void run() {
                zk.this.m();
            }
        });
        return this.b.l();
    }

    @Override // defpackage.dm
    public void q(int i) {
        r(i, this.e.toArray());
        this.b.q(i);
    }

    public final void r(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.e.size()) {
            for (int size = this.e.size(); size <= i2; size++) {
                this.e.add(null);
            }
        }
        this.e.set(i2, obj);
    }

    @Override // defpackage.dm
    public void s(int i, double d) {
        r(i, Double.valueOf(d));
        this.b.s(i, d);
    }
}
