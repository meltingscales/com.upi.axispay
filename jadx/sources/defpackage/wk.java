package defpackage;

import defpackage.bl;
import java.util.concurrent.Executor;

/* compiled from: AxisPay */
/* renamed from: wk  reason: default package */
/* loaded from: classes.dex */
public final class wk implements cm, mk {
    public final cm b;
    public final bl.f c;
    public final Executor d;

    public wk(cm cmVar, bl.f fVar, Executor executor) {
        this.b = cmVar;
        this.c = fVar;
        this.d = executor;
    }

    @Override // defpackage.cm
    public bm G() {
        return new vk(this.b.G(), this.c, this.d);
    }

    @Override // defpackage.cm
    public bm K() {
        return new vk(this.b.K(), this.c, this.d);
    }

    @Override // defpackage.cm, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // defpackage.cm
    public String getDatabaseName() {
        return this.b.getDatabaseName();
    }

    @Override // defpackage.mk
    public cm getDelegate() {
        return this.b;
    }

    @Override // defpackage.cm
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.b.setWriteAheadLoggingEnabled(z);
    }
}
