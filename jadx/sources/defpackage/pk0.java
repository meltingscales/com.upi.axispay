package defpackage;

import java.io.Closeable;

/* compiled from: AxisPay */
/* renamed from: pk0  reason: default package */
/* loaded from: classes.dex */
public final class pk0 {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            xh0.a(th, th2);
        }
    }
}
