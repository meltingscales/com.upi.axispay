package okhttp3;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;
import okhttp3.internal.http1.HeadersReader;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.Source;
import okio.Timeout;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Options afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final ByteString crlfDashDashBoundary;
    private PartSource currentPart;
    private final ByteString dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final BufferedSource source;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Options getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Part implements Closeable {
        private final BufferedSource body;
        private final Headers headers;

        public Part(Headers headers, BufferedSource bufferedSource) {
            yl0.e(headers, C0059ao.a(8265));
            yl0.e(bufferedSource, C0059ao.a(8266));
            this.headers = headers;
            this.body = bufferedSource;
        }

        public final BufferedSource body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class PartSource implements Source {
        private final Timeout timeout = new Timeout();

        public PartSource() {
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (yl0.a(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) {
            yl0.e(buffer, C0059ao.a(8100));
            if (j >= 0) {
                if (yl0.a(MultipartReader.this.currentPart, this)) {
                    Timeout timeout = MultipartReader.this.source.timeout();
                    Timeout timeout2 = this.timeout;
                    long timeoutNanos = timeout.timeoutNanos();
                    long minTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(minTimeout, timeUnit);
                    if (timeout.hasDeadline()) {
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            long currentPartBytesRemaining = MultipartReader.this.currentPartBytesRemaining(j);
                            long read = currentPartBytesRemaining == 0 ? -1L : MultipartReader.this.source.read(buffer, currentPartBytesRemaining);
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                            return read;
                        } catch (Throwable th) {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                            throw th;
                        }
                    }
                    if (timeout2.hasDeadline()) {
                        timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                    }
                    try {
                        long currentPartBytesRemaining2 = MultipartReader.this.currentPartBytesRemaining(j);
                        long read2 = currentPartBytesRemaining2 == 0 ? -1L : MultipartReader.this.source.read(buffer, currentPartBytesRemaining2);
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (timeout2.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        return read2;
                    } catch (Throwable th2) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        throw th2;
                    }
                }
                throw new IllegalStateException(C0059ao.a(8101).toString());
            }
            throw new IllegalArgumentException((C0059ao.a(8102) + j).toString());
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.timeout;
        }
    }

    static {
        Options.Companion companion = Options.Companion;
        ByteString.Companion companion2 = ByteString.Companion;
        afterBoundaryOptions = companion.of(companion2.encodeUtf8(C0059ao.a(1685)), companion2.encodeUtf8(C0059ao.a(1686)), companion2.encodeUtf8(C0059ao.a(1687)), companion2.encodeUtf8(C0059ao.a(1688)));
    }

    public MultipartReader(BufferedSource bufferedSource, String str) throws IOException {
        yl0.e(bufferedSource, C0059ao.a(1692));
        yl0.e(str, C0059ao.a(1693));
        this.source = bufferedSource;
        this.boundary = str;
        this.dashDashBoundary = new Buffer().writeUtf8(C0059ao.a(1694)).writeUtf8(str).readByteString();
        this.crlfDashDashBoundary = new Buffer().writeUtf8(C0059ao.a(1695)).writeUtf8(str).readByteString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j) {
        this.source.require(this.crlfDashDashBoundary.size());
        long indexOf = this.source.getBuffer().indexOf(this.crlfDashDashBoundary);
        if (indexOf == -1) {
            return Math.min(j, (this.source.getBuffer().size() - this.crlfDashDashBoundary.size()) + 1);
        }
        return Math.min(j, indexOf);
    }

    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() throws IOException {
        if (!this.closed) {
            if (this.noMoreParts) {
                return null;
            }
            if (this.partCount == 0 && this.source.rangeEquals(0L, this.dashDashBoundary)) {
                this.source.skip(this.dashDashBoundary.size());
            } else {
                while (true) {
                    long currentPartBytesRemaining = currentPartBytesRemaining(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                    if (currentPartBytesRemaining == 0) {
                        break;
                    }
                    this.source.skip(currentPartBytesRemaining);
                }
                this.source.skip(this.crlfDashDashBoundary.size());
            }
            boolean z = false;
            while (true) {
                int select = this.source.select(afterBoundaryOptions);
                String a = C0059ao.a(1696);
                if (select == -1) {
                    throw new ProtocolException(a);
                }
                if (select == 0) {
                    this.partCount++;
                    Headers readHeaders = new HeadersReader(this.source).readHeaders();
                    PartSource partSource = new PartSource();
                    this.currentPart = partSource;
                    return new Part(readHeaders, Okio.buffer(partSource));
                } else if (select == 1) {
                    if (!z) {
                        if (this.partCount != 0) {
                            this.noMoreParts = true;
                            return null;
                        }
                        throw new ProtocolException(C0059ao.a(1697));
                    }
                    throw new ProtocolException(a);
                } else if (select == 2 || select == 3) {
                    z = true;
                }
            }
        } else {
            throw new IllegalStateException(C0059ao.a(1698).toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MultipartReader(okhttp3.ResponseBody r3) throws java.io.IOException {
        /*
            r2 = this;
            r0 = 1689(0x699, float:2.367E-42)
            java.lang.String r0 = myunmn.C0059ao.a(r0)
            defpackage.yl0.e(r3, r0)
            okio.BufferedSource r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L25
            r1 = 1690(0x69a, float:2.368E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r1)
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L25
            r2.<init>(r0, r3)
            return
        L25:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            r0 = 1691(0x69b, float:2.37E-42)
            java.lang.String r0 = myunmn.C0059ao.a(r0)
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }
}
