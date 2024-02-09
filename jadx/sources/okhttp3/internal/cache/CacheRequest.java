package okhttp3.internal.cache;

import java.io.IOException;
import okio.Sink;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface CacheRequest {
    void abort();

    Sink body() throws IOException;
}
