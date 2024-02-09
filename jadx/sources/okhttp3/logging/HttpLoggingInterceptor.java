package okhttp3.logging;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okhttp3.logging.internal.Utf8Kt;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface Logger {
        public static final Companion Companion = new Companion(null);
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = null;

            /* compiled from: AxisPay */
            /* loaded from: classes.dex */
            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(String str) {
                    yl0.e(str, C0059ao.a(5232));
                    Platform.log$default(Platform.Companion.get(), str, 0, null, 6, null);
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(vl0 vl0Var) {
                this();
            }
        }

        void log(String str);
    }

    public HttpLoggingInterceptor() {
        this(null, 1, null);
    }

    public HttpLoggingInterceptor(Logger logger) {
        yl0.e(logger, C0059ao.a(13429));
        this.logger = logger;
        this.headersToRedact = sj0.b();
        this.level = Level.NONE;
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get(C0059ao.a(13430));
        return (str == null || bo0.j(str, C0059ao.a(13431), true) || bo0.j(str, C0059ao.a(13432), true)) ? false : true;
    }

    private final void logHeader(Headers headers, int i) {
        String a = this.headersToRedact.contains(headers.name(i)) ? C0059ao.a(13433) : headers.value(i);
        Logger logger = this.logger;
        logger.log(headers.name(i) + C0059ao.a(13434) + a);
    }

    /* renamed from: -deprecated_level  reason: not valid java name */
    public final Level m375deprecated_level() {
        return this.level;
    }

    public final Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        String str;
        char c;
        String sb;
        Charset charset;
        Charset charset2;
        yl0.e(chain, C0059ao.a(13435));
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z = level == Level.BODY;
        boolean z2 = z || level == Level.HEADERS;
        RequestBody body = request.body();
        Connection connection = chain.connection();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C0059ao.a(13436));
        sb2.append(request.method());
        sb2.append(' ');
        sb2.append(request.url());
        String a = C0059ao.a(13437);
        sb2.append(connection != null ? C0059ao.a(13438) + connection.protocol() : a);
        String sb3 = sb2.toString();
        String a2 = C0059ao.a(13439);
        String a3 = C0059ao.a(13440);
        if (!z2 && body != 0) {
            sb3 = sb3 + a3 + body.contentLength() + a2;
        }
        this.logger.log(sb3);
        String a4 = C0059ao.a(13441);
        String a5 = C0059ao.a(13442);
        if (z2) {
            Headers headers = request.headers();
            if (body != null) {
                MediaType contentType = body.contentType();
                if (contentType != null && headers.get(C0059ao.a(13443)) == null) {
                    this.logger.log(C0059ao.a(13444) + contentType);
                }
                if (body.contentLength() != -1 && headers.get(C0059ao.a(13445)) == null) {
                    this.logger.log(C0059ao.a(13446) + body.contentLength());
                }
            }
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                logHeader(headers, i);
            }
            String a6 = C0059ao.a(13447);
            if (z && body != null) {
                if (bodyHasUnknownEncoding(request.headers())) {
                    this.logger.log(a6 + request.method() + C0059ao.a(13448));
                } else if (body.isDuplex()) {
                    this.logger.log(a6 + request.method() + C0059ao.a(13449));
                } else if (body.isOneShot()) {
                    this.logger.log(a6 + request.method() + C0059ao.a(13450));
                } else {
                    Buffer buffer = new Buffer();
                    body.writeTo(buffer);
                    MediaType contentType2 = body.contentType();
                    if (contentType2 == null || (charset2 = contentType2.charset(StandardCharsets.UTF_8)) == null) {
                        charset2 = StandardCharsets.UTF_8;
                        yl0.d(charset2, a5);
                    }
                    this.logger.log(a);
                    if (Utf8Kt.isProbablyUtf8(buffer)) {
                        this.logger.log(buffer.readString(charset2));
                        this.logger.log(a6 + request.method() + a3 + body.contentLength() + a2);
                    } else {
                        this.logger.log(a6 + request.method() + C0059ao.a(13451) + body.contentLength() + a4);
                    }
                }
            } else {
                this.logger.log(a6 + request.method());
            }
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            yl0.c(body2);
            long contentLength = body2.contentLength();
            String a7 = contentLength != -1 ? contentLength + C0059ao.a(13452) : C0059ao.a(13453);
            Logger logger = this.logger;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(C0059ao.a(13454));
            sb4.append(proceed.code());
            if (proceed.message().length() == 0) {
                str = a4;
                sb = a;
                c = ' ';
            } else {
                String message = proceed.message();
                StringBuilder sb5 = new StringBuilder();
                str = a4;
                c = ' ';
                sb5.append(String.valueOf(' '));
                sb5.append(message);
                sb = sb5.toString();
            }
            sb4.append(sb);
            sb4.append(c);
            sb4.append(proceed.request().url());
            sb4.append(a3);
            sb4.append(millis);
            sb4.append(C0059ao.a(13455));
            sb4.append(z2 ? a : C0059ao.a(13456) + a7 + C0059ao.a(13457));
            sb4.append(')');
            logger.log(sb4.toString());
            if (z2) {
                Headers headers2 = proceed.headers();
                int size2 = headers2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    logHeader(headers2, i2);
                }
                if (z && HttpHeaders.promisesBody(proceed)) {
                    if (bodyHasUnknownEncoding(proceed.headers())) {
                        this.logger.log(C0059ao.a(13458));
                    } else {
                        BufferedSource source = body2.source();
                        source.request(RecyclerView.FOREVER_NS);
                        Buffer buffer2 = source.getBuffer();
                        Long l = null;
                        if (bo0.j(C0059ao.a(13460), headers2.get(C0059ao.a(13459)), true)) {
                            Long valueOf = Long.valueOf(buffer2.size());
                            GzipSource gzipSource = new GzipSource(buffer2.clone());
                            try {
                                buffer2 = new Buffer();
                                buffer2.writeAll(gzipSource);
                                pk0.a(gzipSource, null);
                                l = valueOf;
                            } finally {
                            }
                        }
                        MediaType contentType3 = body2.contentType();
                        if (contentType3 == null || (charset = contentType3.charset(StandardCharsets.UTF_8)) == null) {
                            charset = StandardCharsets.UTF_8;
                            yl0.d(charset, a5);
                        }
                        if (!Utf8Kt.isProbablyUtf8(buffer2)) {
                            this.logger.log(a);
                            this.logger.log(C0059ao.a(13461) + buffer2.size() + str);
                            return proceed;
                        }
                        if (contentLength != 0) {
                            this.logger.log(a);
                            this.logger.log(buffer2.clone().readString(charset));
                        }
                        String a8 = C0059ao.a(13462);
                        if (l != null) {
                            this.logger.log(a8 + buffer2.size() + C0059ao.a(13463) + l + C0059ao.a(13464));
                        } else {
                            this.logger.log(a8 + buffer2.size() + a2);
                        }
                    }
                } else {
                    this.logger.log(C0059ao.a(13465));
                }
            }
            return proceed;
        } catch (Exception e) {
            this.logger.log(C0059ao.a(13466) + e);
            throw e;
        }
    }

    public final void level(Level level) {
        yl0.e(level, C0059ao.a(13467));
        this.level = level;
    }

    public final void redactHeader(String str) {
        yl0.e(str, C0059ao.a(13468));
        TreeSet treeSet = new TreeSet(bo0.k(mm0.a));
        fj0.q(treeSet, this.headersToRedact);
        treeSet.add(str);
        this.headersToRedact = treeSet;
    }

    public final HttpLoggingInterceptor setLevel(Level level) {
        yl0.e(level, C0059ao.a(13469));
        this.level = level;
        return this;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i, vl0 vl0Var) {
        this((i & 1) != 0 ? Logger.DEFAULT : logger);
    }
}
