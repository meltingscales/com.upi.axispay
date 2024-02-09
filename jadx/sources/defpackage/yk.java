package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AxisPay */
/* renamed from: yk  reason: default package */
/* loaded from: classes.dex */
public final class yk implements dm {
    public List<Object> b = new ArrayList();

    @Override // defpackage.dm
    public void C(int i, long j) {
        j(i, Long.valueOf(j));
    }

    @Override // defpackage.dm
    public void H(int i, byte[] bArr) {
        j(i, bArr);
    }

    @Override // defpackage.dm
    public void a(int i, String str) {
        j(i, str);
    }

    public List<Object> b() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void j(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.b.size()) {
            for (int size = this.b.size(); size <= i2; size++) {
                this.b.add(null);
            }
        }
        this.b.set(i2, obj);
    }

    @Override // defpackage.dm
    public void q(int i) {
        j(i, null);
    }

    @Override // defpackage.dm
    public void s(int i, double d) {
        j(i, Double.valueOf(d));
    }
}
