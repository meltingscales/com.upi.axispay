package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import defpackage.bl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: vk  reason: default package */
/* loaded from: classes.dex */
public final class vk implements bm {
    public final bm b;
    public final bl.f c;
    public final Executor d;

    public vk(bm bmVar, bl.f fVar, Executor executor) {
        this.b = bmVar;
        this.c = fVar;
        this.d = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void O(String str) {
        this.c.a(str, Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void Q(em emVar, yk ykVar) {
        this.c.a(emVar.b(), ykVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void S(em emVar, yk ykVar) {
        this.c.a(emVar.b(), ykVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void U() {
        this.c.a(C0059ao.a(4823), Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void j() {
        this.c.a(C0059ao.a(4824), Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m() {
        this.c.a(C0059ao.a(4825), Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void w() {
        this.c.a(C0059ao.a(4826), Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void J(String str) {
        this.c.a(str, new ArrayList(0));
    }

    @Override // defpackage.bm
    public boolean B() {
        return this.b.B();
    }

    @Override // defpackage.bm
    public void D() {
        this.d.execute(new Runnable() { // from class: uj
            @Override // java.lang.Runnable
            public final void run() {
                vk.this.U();
            }
        });
        this.b.D();
    }

    @Override // defpackage.bm
    public void F() {
        this.d.execute(new Runnable() { // from class: tj
            @Override // java.lang.Runnable
            public final void run() {
                vk.this.m();
            }
        });
        this.b.F();
    }

    @Override // defpackage.bm
    public Cursor N(final String str) {
        this.d.execute(new Runnable() { // from class: xj
            @Override // java.lang.Runnable
            public final void run() {
                vk.this.O(str);
            }
        });
        return this.b.N(str);
    }

    @Override // defpackage.bm
    public void c() {
        this.d.execute(new Runnable() { // from class: sj
            @Override // java.lang.Runnable
            public final void run() {
                vk.this.w();
            }
        });
        this.b.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b.close();
    }

    @Override // defpackage.bm
    public void d() {
        this.d.execute(new Runnable() { // from class: zj
            @Override // java.lang.Runnable
            public final void run() {
                vk.this.j();
            }
        });
        this.b.d();
    }

    @Override // defpackage.bm
    public List<Pair<String, String>> g() {
        return this.b.g();
    }

    @Override // defpackage.bm
    public String getPath() {
        return this.b.getPath();
    }

    @Override // defpackage.bm
    public void h(int i) {
        this.b.h(i);
    }

    @Override // defpackage.bm
    public void i(final String str) throws SQLException {
        this.d.execute(new Runnable() { // from class: vj
            @Override // java.lang.Runnable
            public final void run() {
                vk.this.J(str);
            }
        });
        this.b.i(str);
    }

    @Override // defpackage.bm
    public boolean isOpen() {
        return this.b.isOpen();
    }

    @Override // defpackage.bm
    public fm n(String str) {
        return new zk(this.b.n(str), this.c, str, this.d);
    }

    @Override // defpackage.bm
    public Cursor p(final em emVar) {
        final yk ykVar = new yk();
        emVar.j(ykVar);
        this.d.execute(new Runnable() { // from class: wj
            @Override // java.lang.Runnable
            public final void run() {
                vk.this.Q(emVar, ykVar);
            }
        });
        return this.b.p(emVar);
    }

    @Override // defpackage.bm
    public Cursor u(final em emVar, CancellationSignal cancellationSignal) {
        final yk ykVar = new yk();
        emVar.j(ykVar);
        this.d.execute(new Runnable() { // from class: yj
            @Override // java.lang.Runnable
            public final void run() {
                vk.this.S(emVar, ykVar);
            }
        });
        return this.b.p(emVar);
    }

    @Override // defpackage.bm
    public boolean v() {
        return this.b.v();
    }
}
