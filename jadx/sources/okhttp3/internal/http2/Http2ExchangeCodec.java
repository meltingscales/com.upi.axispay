package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.Sink;
import okio.Source;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {
    private static final String CONNECTION = null;
    public static final Companion Companion;
    private static final String ENCODING = null;
    private static final String HOST = null;
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS;
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS;
    private static final String KEEP_ALIVE = null;
    private static final String PROXY_CONNECTION = null;
    private static final String TE = null;
    private static final String TRANSFER_ENCODING = null;
    private static final String UPGRADE = null;
    private volatile boolean canceled;
    private final RealInterceptorChain chain;
    private final RealConnection connection;
    private final Http2Connection http2Connection;
    private final Protocol protocol;
    private volatile Http2Stream stream;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final List<Header> http2HeadersList(Request request) {
            yl0.e(request, C0059ao.a(5968));
            Headers headers = request.headers();
            ArrayList arrayList = new ArrayList(headers.size() + 4);
            arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
            arrayList.add(new Header(Header.TARGET_PATH, RequestLine.INSTANCE.requestPath(request.url())));
            String header = request.header(C0059ao.a(5969));
            if (header != null) {
                arrayList.add(new Header(Header.TARGET_AUTHORITY, header));
            }
            arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                Locale locale = Locale.US;
                yl0.d(locale, C0059ao.a(5970));
                Objects.requireNonNull(name, C0059ao.a(5971));
                String lowerCase = name.toLowerCase(locale);
                yl0.d(lowerCase, C0059ao.a(5972));
                if (!Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS.contains(lowerCase) || (yl0.a(lowerCase, C0059ao.a(5973)) && yl0.a(headers.value(i), C0059ao.a(5974)))) {
                    arrayList.add(new Header(lowerCase, headers.value(i)));
                }
            }
            return arrayList;
        }

        public final Response.Builder readHttp2HeadersList(Headers headers, Protocol protocol) {
            yl0.e(headers, C0059ao.a(5975));
            yl0.e(protocol, C0059ao.a(5976));
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            StatusLine statusLine = null;
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                String value = headers.value(i);
                if (!yl0.a(name, C0059ao.a(5977))) {
                    if (!Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(name)) {
                        builder.addLenient$okhttp(name, value);
                    }
                } else {
                    StatusLine.Companion companion = StatusLine.Companion;
                    statusLine = companion.parse(C0059ao.a(5978) + value);
                }
            }
            if (statusLine != null) {
                return new Response.Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
            }
            throw new ProtocolException(C0059ao.a(5979));
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    static {
        C0059ao.a(Http2ExchangeCodec.class, 72);
        Companion = new Companion(null);
        HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableListOf(C0059ao.a(15053), C0059ao.a(15054), C0059ao.a(15055), C0059ao.a(15056), C0059ao.a(15057), C0059ao.a(15058), C0059ao.a(15059), C0059ao.a(15060), C0059ao.a(15061), C0059ao.a(15062), C0059ao.a(15063), C0059ao.a(15064));
        HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableListOf(C0059ao.a(15065), C0059ao.a(15066), C0059ao.a(15067), C0059ao.a(15068), C0059ao.a(15069), C0059ao.a(15070), C0059ao.a(15071), C0059ao.a(15072));
    }

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        yl0.e(okHttpClient, C0059ao.a(15073));
        yl0.e(realConnection, C0059ao.a(15074));
        yl0.e(realInterceptorChain, C0059ao.a(15075));
        yl0.e(http2Connection, C0059ao.a(15076));
        this.connection = realConnection;
        this.chain = realInterceptorChain;
        this.http2Connection = http2Connection;
        List<Protocol> protocols = okHttpClient.protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.protocol = protocols.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.canceled = true;
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Sink createRequestBody(Request request, long j) {
        yl0.e(request, C0059ao.a(15077));
        Http2Stream http2Stream = this.stream;
        yl0.c(http2Stream);
        return http2Stream.getSink();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        Http2Stream http2Stream = this.stream;
        yl0.c(http2Stream);
        http2Stream.getSink().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.http2Connection.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Source openResponseBodySource(Response response) {
        yl0.e(response, C0059ao.a(15078));
        Http2Stream http2Stream = this.stream;
        yl0.c(http2Stream);
        return http2Stream.getSource$okhttp();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z) {
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            Response.Builder readHttp2HeadersList = Companion.readHttp2HeadersList(http2Stream.takeHeaders(), this.protocol);
            if (z && readHttp2HeadersList.getCode$okhttp() == 100) {
                return null;
            }
            return readHttp2HeadersList;
        }
        throw new IOException(C0059ao.a(15079));
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        yl0.e(response, C0059ao.a(15080));
        if (HttpHeaders.promisesBody(response)) {
            return Util.headersContentLength(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        Http2Stream http2Stream = this.stream;
        yl0.c(http2Stream);
        return http2Stream.trailers();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        yl0.e(request, C0059ao.a(15081));
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.newStream(Companion.http2HeadersList(request), request.body() != null);
        if (!this.canceled) {
            Http2Stream http2Stream = this.stream;
            yl0.c(http2Stream);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            http2Stream.readTimeout().timeout(this.chain.getReadTimeoutMillis$okhttp(), timeUnit);
            Http2Stream http2Stream2 = this.stream;
            yl0.c(http2Stream2);
            http2Stream2.writeTimeout().timeout(this.chain.getWriteTimeoutMillis$okhttp(), timeUnit);
            return;
        }
        Http2Stream http2Stream3 = this.stream;
        yl0.c(http2Stream3);
        http2Stream3.closeLater(ErrorCode.CANCEL);
        throw new IOException(C0059ao.a(15082));
    }
}
