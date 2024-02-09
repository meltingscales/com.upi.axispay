package okhttp3.internal.http;

import java.io.IOException;
import myunmn.C0059ao;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;
import okio.Sink;
import okio.Source;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface ExchangeCodec {
    public static final Companion Companion;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 0;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE;
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 0;

        static {
            C0059ao.a(Companion.class, 174);
            $$INSTANCE = new Companion();
        }

        private Companion() {
        }
    }

    static {
        C0059ao.a(ExchangeCodec.class, 345);
        Companion = Companion.$$INSTANCE;
    }

    void cancel();

    Sink createRequestBody(Request request, long j) throws IOException;

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    RealConnection getConnection();

    Source openResponseBodySource(Response response) throws IOException;

    Response.Builder readResponseHeaders(boolean z) throws IOException;

    long reportedContentLength(Response response) throws IOException;

    Headers trailers() throws IOException;

    void writeRequestHeaders(Request request) throws IOException;
}
