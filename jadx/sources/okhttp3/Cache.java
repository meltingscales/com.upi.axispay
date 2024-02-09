package okhttp3;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import myunmn.C0059ao;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Cache implements Closeable, Flushable {
    public static final Companion Companion;
    private static final int ENTRY_BODY = 0;
    private static final int ENTRY_COUNT = 0;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 0;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class CacheResponseBody extends ResponseBody {
        private final BufferedSource bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            yl0.e(snapshot, C0059ao.a(5352));
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            final Source source = snapshot.getSource(1);
            this.bodySource = Okio.buffer(new ForwardingSource(source) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    CacheResponseBody.this.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.contentLength;
            if (str != null) {
                return Util.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        public BufferedSource source() {
            return this.bodySource;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if (bo0.j(C0059ao.a(5079), headers.name(i), true)) {
                    String value = headers.value(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(bo0.k(mm0.a));
                    }
                    for (String str : co0.h0(value, new char[]{','}, false, 0, 6, null)) {
                        Objects.requireNonNull(str, C0059ao.a(5080));
                        treeSet.add(co0.p0(str).toString());
                    }
                }
            }
            return treeSet != null ? treeSet : sj0.b();
        }

        public final boolean hasVaryAll(Response response) {
            yl0.e(response, C0059ao.a(5081));
            return varyFields(response.headers()).contains(C0059ao.a(5082));
        }

        public final String key(HttpUrl httpUrl) {
            yl0.e(httpUrl, C0059ao.a(5083));
            return ByteString.Companion.encodeUtf8(httpUrl.toString()).md5().hex();
        }

        public final int readInt$okhttp(BufferedSource bufferedSource) throws IOException {
            yl0.e(bufferedSource, C0059ao.a(5084));
            try {
                long readDecimalLong = bufferedSource.readDecimalLong();
                String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
                if (readDecimalLong >= 0 && readDecimalLong <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
                    if (!(readUtf8LineStrict.length() > 0)) {
                        return (int) readDecimalLong;
                    }
                }
                throw new IOException(C0059ao.a(5085) + readDecimalLong + readUtf8LineStrict + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final Headers varyHeaders(Response response) {
            yl0.e(response, C0059ao.a(5086));
            Response networkResponse = response.networkResponse();
            yl0.c(networkResponse);
            return varyHeaders(networkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(Response response, Headers headers, Request request) {
            yl0.e(response, C0059ao.a(5087));
            yl0.e(headers, C0059ao.a(5088));
            yl0.e(request, C0059ao.a(5089));
            Set<String> varyFields = varyFields(response.headers());
            if ((varyFields instanceof Collection) && varyFields.isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if (!yl0.a(headers.values(str), request.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> varyFields = varyFields(headers2);
            if (varyFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                if (varyFields.contains(name)) {
                    builder.add(name, headers.value(i));
                }
            }
            return builder.build();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class RealCacheRequest implements CacheRequest {
        private final Sink body;
        private final Sink cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;
        public final /* synthetic */ Cache this$0;

        public RealCacheRequest(Cache cache, DiskLruCache.Editor editor) {
            yl0.e(editor, C0059ao.a(4653));
            this.this$0 = cache;
            this.editor = editor;
            Sink newSink = editor.newSink(1);
            this.cacheOut = newSink;
            this.body = new ForwardingSink(newSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    synchronized (RealCacheRequest.this.this$0) {
                        if (RealCacheRequest.this.getDone()) {
                            return;
                        }
                        RealCacheRequest.this.setDone(true);
                        Cache cache2 = RealCacheRequest.this.this$0;
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount$okhttp() + 1);
                        super.close();
                        RealCacheRequest.this.editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            synchronized (this.this$0) {
                if (this.done) {
                    return;
                }
                this.done = true;
                Cache cache = this.this$0;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public Sink body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z) {
            this.done = z;
        }
    }

    static {
        C0059ao.a(Cache.class, 309);
        Companion = new Companion(null);
    }

    public Cache(File file, long j, FileSystem fileSystem) {
        yl0.e(file, C0059ao.a(14762));
        yl0.e(fileSystem, C0059ao.a(14763));
        this.cache = new DiskLruCache(fileSystem, file, 201105, 2, j, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static final String key(HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    /* renamed from: -deprecated_directory  reason: not valid java name */
    public final File m252deprecated_directory() {
        return this.cache.getDirectory();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public final void delete() throws IOException {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() throws IOException {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    public final Response get$okhttp(Request request) {
        yl0.e(request, C0059ao.a(14764));
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot != null) {
                try {
                    Entry entry = new Entry(snapshot.getSource(0));
                    Response response = entry.response(snapshot);
                    if (entry.matches(request, response)) {
                        return response;
                    }
                    ResponseBody body = response.body();
                    if (body != null) {
                        Util.closeQuietly(body);
                    }
                    return null;
                } catch (IOException unused) {
                    Util.closeQuietly(snapshot);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() throws IOException {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final CacheRequest put$okhttp(Response response) {
        DiskLruCache.Editor editor;
        yl0.e(response, C0059ao.a(14765));
        String method = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if (!yl0.a(method, C0059ao.a(14766))) {
            return null;
        } else {
            Companion companion = Companion;
            if (companion.hasVaryAll(response)) {
                return null;
            }
            Entry entry = new Entry(response);
            try {
                editor = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
                if (editor != null) {
                    try {
                        entry.writeTo(editor);
                        return new RealCacheRequest(this, editor);
                    } catch (IOException unused2) {
                        abortQuietly(editor);
                        return null;
                    }
                }
                return null;
            } catch (IOException unused3) {
                editor = null;
            }
        }
    }

    public final void remove$okhttp(Request request) throws IOException {
        yl0.e(request, C0059ao.a(14767));
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        yl0.e(cacheStrategy, C0059ao.a(14768));
        this.requestCount++;
        if (cacheStrategy.getNetworkRequest() != null) {
            this.networkCount++;
        } else if (cacheStrategy.getCacheResponse() != null) {
            this.hitCount++;
        }
    }

    public final void update$okhttp(Response response, Response response2) {
        yl0.e(response, C0059ao.a(14769));
        yl0.e(response2, C0059ao.a(14770));
        Entry entry = new Entry(response2);
        ResponseBody body = response.body();
        Objects.requireNonNull(body, C0059ao.a(14771));
        DiskLruCache.Editor editor = null;
        try {
            editor = ((CacheResponseBody) body).getSnapshot().edit();
            if (editor != null) {
                entry.writeTo(editor);
                editor.commit();
            }
        } catch (IOException unused) {
            abortQuietly(editor);
        }
    }

    public final Iterator<String> urls() throws IOException {
        return new Cache$urls$1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
        yl0.e(file, C0059ao.a(14761));
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Entry {
        public static final Companion Companion = new Companion(null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final HttpUrl url;
        private final Headers varyHeaders;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(vl0 vl0Var) {
                this();
            }
        }

        static {
            Platform.Companion companion;
            StringBuilder sb = new StringBuilder();
            sb.append(Platform.Companion.get().getPrefix());
            sb.append(C0059ao.a(14528));
            SENT_MILLIS = sb.toString();
            RECEIVED_MILLIS = companion.get().getPrefix() + C0059ao.a(14529);
        }

        public Entry(Source source) throws IOException {
            TlsVersion tlsVersion;
            yl0.e(source, C0059ao.a(14531));
            try {
                BufferedSource buffer = Okio.buffer(source);
                String readUtf8LineStrict = buffer.readUtf8LineStrict();
                HttpUrl parse = HttpUrl.Companion.parse(readUtf8LineStrict);
                if (parse != null) {
                    this.url = parse;
                    this.requestMethod = buffer.readUtf8LineStrict();
                    Headers.Builder builder = new Headers.Builder();
                    int readInt$okhttp = Cache.Companion.readInt$okhttp(buffer);
                    for (int i = 0; i < readInt$okhttp; i++) {
                        builder.addLenient$okhttp(buffer.readUtf8LineStrict());
                    }
                    this.varyHeaders = builder.build();
                    StatusLine parse2 = StatusLine.Companion.parse(buffer.readUtf8LineStrict());
                    this.protocol = parse2.protocol;
                    this.code = parse2.code;
                    this.message = parse2.message;
                    Headers.Builder builder2 = new Headers.Builder();
                    int readInt$okhttp2 = Cache.Companion.readInt$okhttp(buffer);
                    for (int i2 = 0; i2 < readInt$okhttp2; i2++) {
                        builder2.addLenient$okhttp(buffer.readUtf8LineStrict());
                    }
                    String str = SENT_MILLIS;
                    String str2 = builder2.get(str);
                    String str3 = RECEIVED_MILLIS;
                    String str4 = builder2.get(str3);
                    builder2.removeAll(str);
                    builder2.removeAll(str3);
                    this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                    this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                    this.responseHeaders = builder2.build();
                    if (isHttps()) {
                        String readUtf8LineStrict2 = buffer.readUtf8LineStrict();
                        if (!(readUtf8LineStrict2.length() > 0)) {
                            CipherSuite forJavaName = CipherSuite.Companion.forJavaName(buffer.readUtf8LineStrict());
                            List<Certificate> readCertificateList = readCertificateList(buffer);
                            List<Certificate> readCertificateList2 = readCertificateList(buffer);
                            if (!buffer.exhausted()) {
                                tlsVersion = TlsVersion.Companion.forJavaName(buffer.readUtf8LineStrict());
                            } else {
                                tlsVersion = TlsVersion.SSL_3_0;
                            }
                            this.handshake = Handshake.Companion.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                        } else {
                            throw new IOException(C0059ao.a(14532) + readUtf8LineStrict2 + '\"');
                        }
                    } else {
                        this.handshake = null;
                    }
                    pi0 pi0Var = pi0.a;
                    pk0.a(source, null);
                    return;
                }
                IOException iOException = new IOException(C0059ao.a(14533) + readUtf8LineStrict);
                Platform.Companion.get().log(C0059ao.a(14534), 5, iOException);
                pi0 pi0Var2 = pi0.a;
                throw iOException;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    pk0.a(source, th);
                    throw th2;
                }
            }
        }

        private final boolean isHttps() {
            return yl0.a(this.url.scheme(), C0059ao.a(14535));
        }

        private final List<Certificate> readCertificateList(BufferedSource bufferedSource) throws IOException {
            int readInt$okhttp = Cache.Companion.readInt$okhttp(bufferedSource);
            if (readInt$okhttp == -1) {
                return aj0.f();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(C0059ao.a(14536));
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                for (int i = 0; i < readInt$okhttp; i++) {
                    String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
                    Buffer buffer = new Buffer();
                    ByteString decodeBase64 = ByteString.Companion.decodeBase64(readUtf8LineStrict);
                    yl0.c(decodeBase64);
                    buffer.write(decodeBase64);
                    arrayList.add(certificateFactory.generateCertificate(buffer.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private final void writeCertList(BufferedSink bufferedSink, List<? extends Certificate> list) throws IOException {
            try {
                bufferedSink.writeDecimalLong(list.size()).writeByte(10);
                for (Certificate certificate : list) {
                    byte[] encoded = certificate.getEncoded();
                    ByteString.Companion companion = ByteString.Companion;
                    yl0.d(encoded, C0059ao.a(14537));
                    bufferedSink.writeUtf8(ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            yl0.e(request, C0059ao.a(14538));
            yl0.e(response, C0059ao.a(14539));
            return yl0.a(this.url, request.url()) && yl0.a(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request);
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            yl0.e(snapshot, C0059ao.a(14540));
            String str = this.responseHeaders.get(C0059ao.a(14541));
            String str2 = this.responseHeaders.get(C0059ao.a(14542));
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(DiskLruCache.Editor editor) throws IOException {
            String a;
            yl0.e(editor, C0059ao.a(14543));
            BufferedSink buffer = Okio.buffer(editor.newSink(0));
            try {
                buffer.writeUtf8(this.url.toString()).writeByte(10);
                buffer.writeUtf8(this.requestMethod).writeByte(10);
                buffer.writeDecimalLong(this.varyHeaders.size()).writeByte(10);
                int size = this.varyHeaders.size();
                int i = 0;
                while (true) {
                    a = C0059ao.a(14544);
                    if (i >= size) {
                        break;
                    }
                    buffer.writeUtf8(this.varyHeaders.name(i)).writeUtf8(a).writeUtf8(this.varyHeaders.value(i)).writeByte(10);
                    i++;
                }
                buffer.writeUtf8(new StatusLine(this.protocol, this.code, this.message).toString()).writeByte(10);
                buffer.writeDecimalLong(this.responseHeaders.size() + 2).writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    buffer.writeUtf8(this.responseHeaders.name(i2)).writeUtf8(a).writeUtf8(this.responseHeaders.value(i2)).writeByte(10);
                }
                buffer.writeUtf8(SENT_MILLIS).writeUtf8(a).writeDecimalLong(this.sentRequestMillis).writeByte(10);
                buffer.writeUtf8(RECEIVED_MILLIS).writeUtf8(a).writeDecimalLong(this.receivedResponseMillis).writeByte(10);
                if (isHttps()) {
                    buffer.writeByte(10);
                    Handshake handshake = this.handshake;
                    yl0.c(handshake);
                    buffer.writeUtf8(handshake.cipherSuite().javaName()).writeByte(10);
                    writeCertList(buffer, this.handshake.peerCertificates());
                    writeCertList(buffer, this.handshake.localCertificates());
                    buffer.writeUtf8(this.handshake.tlsVersion().javaName()).writeByte(10);
                }
                pi0 pi0Var = pi0.a;
                pk0.a(buffer, null);
            } finally {
            }
        }

        public Entry(Response response) {
            yl0.e(response, C0059ao.a(14530));
            this.url = response.request().url();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
