package okhttp3.internal.http1;

import com.google.android.gms.common.api.Api;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion;
    private static final long NO_CHUNK_YET = 0;
    private static final int STATE_CLOSED = 0;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 0;
    private static final int STATE_OPEN_RESPONSE_BODY = 0;
    private static final int STATE_READING_RESPONSE_BODY = 0;
    private static final int STATE_READ_RESPONSE_HEADERS = 0;
    private static final int STATE_WRITING_REQUEST_BODY = 0;
    private final OkHttpClient client;
    private final RealConnection connection;
    private final HeadersReader headersReader;
    private final BufferedSink sink;
    private final BufferedSource source;
    private int state;
    private Headers trailers;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public abstract class AbstractSource implements Source {
        private boolean closed;
        private final ForwardingTimeout timeout;

        public AbstractSource() {
            this.timeout = new ForwardingTimeout(Http1ExchangeCodec.this.source.timeout());
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final ForwardingTimeout getTimeout() {
            return this.timeout;
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) {
            yl0.e(buffer, C0059ao.a(15777));
            try {
                return Http1ExchangeCodec.this.source.read(buffer, j);
            } catch (IOException e) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e;
            }
        }

        public final void responseBodyComplete() {
            if (Http1ExchangeCodec.this.state == 6) {
                return;
            }
            if (Http1ExchangeCodec.this.state == 5) {
                Http1ExchangeCodec.this.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 6;
                return;
            }
            throw new IllegalStateException(C0059ao.a(15778) + Http1ExchangeCodec.this.state);
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.timeout;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class ChunkedSink implements Sink {
        private boolean closed;
        private final ForwardingTimeout timeout;

        public ChunkedSink() {
            this.timeout = new ForwardingTimeout(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.sink.writeUtf8(C0059ao.a(15740));
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.timeout;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) {
            yl0.e(buffer, C0059ao.a(15741));
            if (!(!this.closed)) {
                throw new IllegalStateException(C0059ao.a(15743).toString());
            }
            if (j == 0) {
                return;
            }
            Http1ExchangeCodec.this.sink.writeHexadecimalUnsignedLong(j);
            BufferedSink bufferedSink = Http1ExchangeCodec.this.sink;
            String a = C0059ao.a(15742);
            bufferedSink.writeUtf8(a);
            Http1ExchangeCodec.this.sink.write(buffer, j);
            Http1ExchangeCodec.this.sink.writeUtf8(a);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        public final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super();
            yl0.e(httpUrl, C0059ao.a(12772));
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        private final void readChunkSize() {
            if (this.bytesRemainingInChunk != -1) {
                this.this$0.source.readUtf8LineStrict();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.readHexadecimalUnsignedLong();
                String readUtf8LineStrict = this.this$0.source.readUtf8LineStrict();
                if (readUtf8LineStrict != null) {
                    String obj = co0.p0(readUtf8LineStrict).toString();
                    if (this.bytesRemainingInChunk >= 0) {
                        if (!(obj.length() > 0) || bo0.w(obj, C0059ao.a(12773), false, 2, null)) {
                            if (this.bytesRemainingInChunk == 0) {
                                this.hasMoreChunks = false;
                                Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                                http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
                                OkHttpClient okHttpClient = this.this$0.client;
                                yl0.c(okHttpClient);
                                CookieJar cookieJar = okHttpClient.cookieJar();
                                HttpUrl httpUrl = this.url;
                                Headers headers = this.this$0.trailers;
                                yl0.c(headers);
                                HttpHeaders.receiveHeaders(cookieJar, httpUrl, headers);
                                responseBodyComplete();
                                return;
                            }
                            return;
                        }
                    }
                    throw new ProtocolException(C0059ao.a(12774) + C0059ao.a(12775) + this.bytesRemainingInChunk + obj + '\"');
                }
                throw new NullPointerException(C0059ao.a(12776));
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(Buffer buffer, long j) {
            yl0.e(buffer, C0059ao.a(12777));
            if (j >= 0) {
                if (!getClosed()) {
                    if (this.hasMoreChunks) {
                        long j2 = this.bytesRemainingInChunk;
                        if (j2 == 0 || j2 == -1) {
                            readChunkSize();
                            if (!this.hasMoreChunks) {
                                return -1L;
                            }
                        }
                        long read = super.read(buffer, Math.min(j, this.bytesRemainingInChunk));
                        if (read != -1) {
                            this.bytesRemainingInChunk -= read;
                            return read;
                        }
                        this.this$0.getConnection().noNewExchanges$okhttp();
                        ProtocolException protocolException = new ProtocolException(C0059ao.a(12778));
                        responseBodyComplete();
                        throw protocolException;
                    }
                    return -1L;
                }
                throw new IllegalStateException(C0059ao.a(12779).toString());
            }
            throw new IllegalArgumentException((C0059ao.a(12780) + j).toString());
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j) {
            super();
            this.bytesRemaining = j;
            if (j == 0) {
                responseBodyComplete();
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(Buffer buffer, long j) {
            yl0.e(buffer, C0059ao.a(3505));
            if (j >= 0) {
                if (!getClosed()) {
                    long j2 = this.bytesRemaining;
                    if (j2 == 0) {
                        return -1L;
                    }
                    long read = super.read(buffer, Math.min(j2, j));
                    if (read != -1) {
                        long j3 = this.bytesRemaining - read;
                        this.bytesRemaining = j3;
                        if (j3 == 0) {
                            responseBodyComplete();
                        }
                        return read;
                    }
                    Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                    ProtocolException protocolException = new ProtocolException(C0059ao.a(3506));
                    responseBodyComplete();
                    throw protocolException;
                }
                throw new IllegalStateException(C0059ao.a(3507).toString());
            }
            throw new IllegalArgumentException((C0059ao.a(3508) + j).toString());
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class KnownLengthSink implements Sink {
        private boolean closed;
        private final ForwardingTimeout timeout;

        public KnownLengthSink() {
            this.timeout = new ForwardingTimeout(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.timeout;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) {
            yl0.e(buffer, C0059ao.a(14753));
            if (!this.closed) {
                Util.checkOffsetAndCount(buffer.size(), 0L, j);
                Http1ExchangeCodec.this.sink.write(buffer, j);
                return;
            }
            throw new IllegalStateException(C0059ao.a(14754).toString());
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(Buffer buffer, long j) {
            yl0.e(buffer, C0059ao.a(10856));
            if (j >= 0) {
                if (!getClosed()) {
                    if (this.inputExhausted) {
                        return -1L;
                    }
                    long read = super.read(buffer, j);
                    if (read == -1) {
                        this.inputExhausted = true;
                        responseBodyComplete();
                        return -1L;
                    }
                    return read;
                }
                throw new IllegalStateException(C0059ao.a(10857).toString());
            }
            throw new IllegalArgumentException((C0059ao.a(10858) + j).toString());
        }
    }

    static {
        C0059ao.a(Http1ExchangeCodec.class, 214);
        Companion = new Companion(null);
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        yl0.e(realConnection, C0059ao.a(14835));
        yl0.e(bufferedSource, C0059ao.a(14836));
        yl0.e(bufferedSink, C0059ao.a(14837));
        this.client = okHttpClient;
        this.connection = realConnection;
        this.source = bufferedSource;
        this.sink = bufferedSink;
        this.headersReader = new HeadersReader(bufferedSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(ForwardingTimeout forwardingTimeout) {
        Timeout delegate = forwardingTimeout.delegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        return bo0.j(C0059ao.a(14841), Response.header$default(response, C0059ao.a(14840), null, 2, null), true);
    }

    private final Sink newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException((C0059ao.a(14842) + this.state).toString());
    }

    private final Source newChunkedSource(HttpUrl httpUrl) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(this, httpUrl);
        }
        throw new IllegalStateException((C0059ao.a(14843) + this.state).toString());
    }

    private final Source newFixedLengthSource(long j) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        throw new IllegalStateException((C0059ao.a(14844) + this.state).toString());
    }

    private final Sink newKnownLengthSink() {
        if (this.state == 1) {
            this.state = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException((C0059ao.a(14845) + this.state).toString());
    }

    private final Source newUnknownLengthSource() {
        if (this.state == 4) {
            this.state = 5;
            getConnection().noNewExchanges$okhttp();
            return new UnknownLengthSource();
        }
        throw new IllegalStateException((C0059ao.a(14846) + this.state).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Sink createRequestBody(Request request, long j) {
        yl0.e(request, C0059ao.a(14847));
        if (request.body() == null || !request.body().isDuplex()) {
            if (isChunked(request)) {
                return newChunkedSink();
            }
            if (j != -1) {
                return newKnownLengthSink();
            }
            throw new IllegalStateException(C0059ao.a(14849));
        }
        throw new ProtocolException(C0059ao.a(14848));
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Source openResponseBodySource(Response response) {
        yl0.e(response, C0059ao.a(14850));
        if (HttpHeaders.promisesBody(response)) {
            if (isChunked(response)) {
                return newChunkedSource(response.request().url());
            }
            long headersContentLength = Util.headersContentLength(response);
            if (headersContentLength != -1) {
                return newFixedLengthSource(headersContentLength);
            }
            return newUnknownLengthSource();
        }
        return newFixedLengthSource(0L);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z) {
        int i = this.state;
        boolean z2 = true;
        if (i != 1 && i != 2 && i != 3) {
            z2 = false;
        }
        if (z2) {
            try {
                StatusLine parse = StatusLine.Companion.parse(this.headersReader.readLine());
                Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(this.headersReader.readHeaders());
                if (z && parse.code == 100) {
                    return null;
                }
                if (parse.code == 100) {
                    this.state = 3;
                    return headers;
                }
                this.state = 4;
                return headers;
            } catch (EOFException e) {
                String redact = getConnection().route().address().url().redact();
                throw new IOException(C0059ao.a(14851) + redact, e);
            }
        }
        throw new IllegalStateException((C0059ao.a(14852) + this.state).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        yl0.e(response, C0059ao.a(14853));
        if (HttpHeaders.promisesBody(response)) {
            if (isChunked(response)) {
                return -1L;
            }
            return Util.headersContentLength(response);
        }
        return 0L;
    }

    public final void skipConnectBody(Response response) {
        yl0.e(response, C0059ao.a(14854));
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength == -1) {
            return;
        }
        Source newFixedLengthSource = newFixedLengthSource(headersContentLength);
        Util.skipAll(newFixedLengthSource, Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
        newFixedLengthSource.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        if (this.state == 6) {
            Headers headers = this.trailers;
            return headers != null ? headers : Util.EMPTY_HEADERS;
        }
        throw new IllegalStateException(C0059ao.a(14855).toString());
    }

    public final void writeRequest(Headers headers, String str) {
        yl0.e(headers, C0059ao.a(14856));
        yl0.e(str, C0059ao.a(14857));
        if (this.state == 0) {
            BufferedSink writeUtf8 = this.sink.writeUtf8(str);
            String a = C0059ao.a(14858);
            writeUtf8.writeUtf8(a);
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                this.sink.writeUtf8(headers.name(i)).writeUtf8(C0059ao.a(14859)).writeUtf8(headers.value(i)).writeUtf8(a);
            }
            this.sink.writeUtf8(a);
            this.state = 1;
            return;
        }
        throw new IllegalStateException((C0059ao.a(14860) + this.state).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        yl0.e(request, C0059ao.a(14861));
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().route().proxy().type();
        yl0.d(type, C0059ao.a(14862));
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    private final boolean isChunked(Request request) {
        return bo0.j(C0059ao.a(14839), request.header(C0059ao.a(14838)), true);
    }
}
