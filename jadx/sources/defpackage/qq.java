package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: AxisPay */
/* renamed from: qq  reason: default package */
/* loaded from: classes.dex */
public abstract class qq implements Closeable {

    /* compiled from: AxisPay */
    /* renamed from: qq$a */
    /* loaded from: classes.dex */
    public interface a {
        qq a();

        a b(Context context);
    }

    public abstract lu b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b().close();
    }

    public abstract pq j();
}
