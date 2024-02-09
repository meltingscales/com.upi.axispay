package okhttp3.internal.http2;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import myunmn.C0059ao;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Http2Stream {
    public static final Companion Companion;
    public static final long EMIT_BUFFER_SIZE = 0;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

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
    public final class FramingSource implements Source {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private Headers trailers;
        private final Buffer receiveBuffer = new Buffer();
        private final Buffer readBuffer = new Buffer();

        public FramingSource(long j, boolean z) {
            this.maxByteCount = j;
            this.finished = z;
        }

        private final void updateConnectionFlowControl(long j) {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0059ao.a(195));
                Thread currentThread = Thread.currentThread();
                yl0.d(currentThread, C0059ao.a(196));
                sb.append(currentThread.getName());
                sb.append(C0059ao.a(197));
                sb.append(http2Stream);
                throw new AssertionError(sb.toString());
            }
            Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(j);
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            synchronized (Http2Stream.this) {
                this.closed = true;
                size = this.readBuffer.size();
                this.readBuffer.clear();
                Http2Stream http2Stream = Http2Stream.this;
                if (http2Stream != null) {
                    http2Stream.notifyAll();
                    pi0 pi0Var = pi0.a;
                } else {
                    throw new NullPointerException(C0059ao.a(198));
                }
            }
            if (size > 0) {
                updateConnectionFlowControl(size);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        public final Buffer getReadBuffer() {
            return this.readBuffer;
        }

        public final Buffer getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x00ee, code lost:
            throw new java.io.IOException(myunmn.C0059ao.a(200));
         */
        @Override // okio.Source
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long read(okio.Buffer r19, long r20) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 285
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSource.read(okio.Buffer, long):long");
        }

        public final void receive$okhttp(BufferedSource bufferedSource, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            yl0.e(bufferedSource, C0059ao.a(202));
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0059ao.a(203));
                Thread currentThread = Thread.currentThread();
                yl0.d(currentThread, C0059ao.a(204));
                sb.append(currentThread.getName());
                sb.append(C0059ao.a(205));
                sb.append(http2Stream);
                throw new AssertionError(sb.toString());
            }
            while (j > 0) {
                synchronized (Http2Stream.this) {
                    z = this.finished;
                    z2 = true;
                    z3 = this.readBuffer.size() + j > this.maxByteCount;
                    pi0 pi0Var = pi0.a;
                }
                if (z3) {
                    bufferedSource.skip(j);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    bufferedSource.skip(j);
                    return;
                } else {
                    long read = bufferedSource.read(this.receiveBuffer, j);
                    if (read != -1) {
                        j -= read;
                        synchronized (Http2Stream.this) {
                            if (this.closed) {
                                j2 = this.receiveBuffer.size();
                                this.receiveBuffer.clear();
                            } else {
                                if (this.readBuffer.size() != 0) {
                                    z2 = false;
                                }
                                this.readBuffer.writeAll(this.receiveBuffer);
                                if (z2) {
                                    Http2Stream http2Stream2 = Http2Stream.this;
                                    if (http2Stream2 == null) {
                                        throw new NullPointerException(C0059ao.a(206));
                                    }
                                    http2Stream2.notifyAll();
                                }
                                j2 = 0;
                            }
                        }
                        if (j2 > 0) {
                            updateConnectionFlowControl(j2);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // okio.Source
        public Timeout timeout() {
            return Http2Stream.this.getReadTimeout$okhttp();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class StreamTimeout extends AsyncTimeout {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.AsyncTimeout
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(C0059ao.a(12053));
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    static {
        C0059ao.a(Http2Stream.class, 372);
        Companion = new Companion(null);
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        yl0.e(http2Connection, C0059ao.a(719));
        this.id = i;
        this.connection = http2Connection;
        this.writeBytesMaximum = http2Connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(http2Connection.getOkHttpSettings().getInitialWindowSize(), z2);
        this.sink = new FramingSink(z);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers != null) {
            if (!isLocallyInitiated()) {
                arrayDeque.add(headers);
                return;
            }
            throw new IllegalStateException(C0059ao.a(720).toString());
        } else if (!isLocallyInitiated()) {
            throw new IllegalStateException(C0059ao.a(721).toString());
        }
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException iOException) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(722));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(723));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(724));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.getFinished$okhttp() && this.sink.getFinished()) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = iOException;
            notifyAll();
            pi0 pi0Var = pi0.a;
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    public final void addBytesToWriteWindow(long j) {
        this.writeBytesMaximum += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean z;
        boolean isOpen;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(725));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(726));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(727));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            z = !this.source.getFinished$okhttp() && this.source.getClosed$okhttp() && (this.sink.getFinished() || this.sink.getClosed());
            isOpen = isOpen();
            pi0 pi0Var = pi0.a;
        }
        if (z) {
            close(ErrorCode.CANCEL, null);
        } else if (isOpen) {
        } else {
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (!this.sink.getClosed()) {
            if (!this.sink.getFinished()) {
                if (this.errorCode != null) {
                    IOException iOException = this.errorException;
                    if (iOException != null) {
                        throw iOException;
                    }
                    ErrorCode errorCode = this.errorCode;
                    yl0.c(errorCode);
                    throw new StreamResetException(errorCode);
                }
                return;
            }
            throw new IOException(C0059ao.a(728));
        }
        throw new IOException(C0059ao.a(729));
    }

    public final void close(ErrorCode errorCode, IOException iOException) throws IOException {
        yl0.e(errorCode, C0059ao.a(730));
        if (closeInternal(errorCode, iOException)) {
            this.connection.writeSynReset$okhttp(this.id, errorCode);
        }
    }

    public final void closeLater(ErrorCode errorCode) {
        yl0.e(errorCode, C0059ao.a(731));
        if (closeInternal(errorCode, null)) {
            this.connection.writeSynResetLater$okhttp(this.id, errorCode);
        }
    }

    public final void enqueueTrailers(Headers headers) {
        yl0.e(headers, C0059ao.a(732));
        synchronized (this) {
            boolean z = true;
            if (!this.sink.getFinished()) {
                if (headers.size() == 0) {
                    z = false;
                }
                if (z) {
                    this.sink.setTrailers(headers);
                    pi0 pi0Var = pi0.a;
                } else {
                    throw new IllegalArgumentException(C0059ao.a(733).toString());
                }
            } else {
                throw new IllegalStateException(C0059ao.a(734).toString());
            }
        }
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0027), top: B:20:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0028, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0027), top: B:20:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okio.Sink getSink() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r1 = r3.hasResponseHeaders     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto Le
            boolean r1 = r3.isLocallyInitiated()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto Lc
            goto Le
        Lc:
            r1 = 0
            goto Lf
        Le:
            r1 = 1
        Lf:
            if (r1 == 0) goto L17
            pi0 r1 = defpackage.pi0.a     // Catch: java.lang.Throwable -> L28
            monitor-exit(r3)
            okhttp3.internal.http2.Http2Stream$FramingSink r1 = r3.sink
            return r1
        L17:
            r0 = 735(0x2df, float:1.03E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L28
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L28
            throw r2     // Catch: java.lang.Throwable -> L28
        L28:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.getSink():okio.Sink");
    }

    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    public final Source getSource() {
        return this.source;
    }

    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        return this.connection.getClient$okhttp() == ((this.id & 1) == 1);
    }

    public final synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        if ((this.source.getFinished$okhttp() || this.source.getClosed$okhttp()) && (this.sink.getFinished() || this.sink.getClosed())) {
            if (this.hasResponseHeaders) {
                return false;
            }
        }
        return true;
    }

    public final Timeout readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(BufferedSource bufferedSource, int i) throws IOException {
        yl0.e(bufferedSource, C0059ao.a(736));
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(737));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(738));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(739));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        this.source.receive$okhttp(bufferedSource, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068 A[Catch: all -> 0x0081, TryCatch #0 {, blocks: (B:10:0x0051, B:14:0x0059, B:17:0x0068, B:18:0x006d, B:15:0x005f), top: B:26:0x0051 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void receiveHeaders(okhttp3.Headers r4, boolean r5) {
        /*
            r3 = this;
            r0 = 740(0x2e4, float:1.037E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r0)
            defpackage.yl0.e(r4, r1)
            boolean r1 = okhttp3.internal.Util.assertionsEnabled
            if (r1 == 0) goto L50
            boolean r1 = java.lang.Thread.holdsLock(r3)
            if (r1 != 0) goto L15
            goto L50
        L15:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r0 = 741(0x2e5, float:1.038E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r0)
            r5.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r0 = 742(0x2e6, float:1.04E-42)
            java.lang.String r2 = myunmn.C0059ao.a(r0)
            defpackage.yl0.d(r1, r2)
            java.lang.String r1 = r1.getName()
            r5.append(r1)
            r0 = 743(0x2e7, float:1.041E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r0)
            r5.append(r1)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L50:
            monitor-enter(r3)
            boolean r1 = r3.hasResponseHeaders     // Catch: java.lang.Throwable -> L81
            r2 = 1
            if (r1 == 0) goto L5f
            if (r5 != 0) goto L59
            goto L5f
        L59:
            okhttp3.internal.http2.Http2Stream$FramingSource r1 = r3.source     // Catch: java.lang.Throwable -> L81
            r1.setTrailers(r4)     // Catch: java.lang.Throwable -> L81
            goto L66
        L5f:
            r3.hasResponseHeaders = r2     // Catch: java.lang.Throwable -> L81
            java.util.ArrayDeque<okhttp3.Headers> r1 = r3.headersQueue     // Catch: java.lang.Throwable -> L81
            r1.add(r4)     // Catch: java.lang.Throwable -> L81
        L66:
            if (r5 == 0) goto L6d
            okhttp3.internal.http2.Http2Stream$FramingSource r4 = r3.source     // Catch: java.lang.Throwable -> L81
            r4.setFinished$okhttp(r2)     // Catch: java.lang.Throwable -> L81
        L6d:
            boolean r4 = r3.isOpen()     // Catch: java.lang.Throwable -> L81
            r3.notifyAll()     // Catch: java.lang.Throwable -> L81
            pi0 r5 = defpackage.pi0.a     // Catch: java.lang.Throwable -> L81
            monitor-exit(r3)
            if (r4 != 0) goto L80
            okhttp3.internal.http2.Http2Connection r4 = r3.connection
            int r5 = r3.id
            r4.removeStream$okhttp(r5)
        L80:
            return
        L81:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.receiveHeaders(okhttp3.Headers, boolean):void");
    }

    public final synchronized void receiveRstStream(ErrorCode errorCode) {
        yl0.e(errorCode, C0059ao.a(744));
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j) {
        this.readBytesAcknowledged = j;
    }

    public final void setReadBytesTotal$okhttp(long j) {
        this.readBytesTotal = j;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    public final synchronized Headers takeHeaders() throws IOException {
        Headers removeFirst;
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            waitForIo$okhttp();
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!this.headersQueue.isEmpty()) {
            removeFirst = this.headersQueue.removeFirst();
            yl0.d(removeFirst, C0059ao.a(745));
        } else {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            yl0.c(errorCode);
            throw new StreamResetException(errorCode);
        }
        return removeFirst;
    }

    public final synchronized Headers trailers() throws IOException {
        Headers trailers;
        if (this.source.getFinished$okhttp() && this.source.getReceiveBuffer().exhausted() && this.source.getReadBuffer().exhausted()) {
            trailers = this.source.getTrailers();
            if (trailers == null) {
                trailers = Util.EMPTY_HEADERS;
            }
        } else if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            yl0.c(errorCode);
            throw new StreamResetException(errorCode);
        } else {
            throw new IllegalStateException(C0059ao.a(746));
        }
        return trailers;
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(List<Header> list, boolean z, boolean z2) throws IOException {
        boolean z3;
        yl0.e(list, C0059ao.a(747));
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(748));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(749));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(750));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (z) {
                this.sink.setFinished(true);
            }
            pi0 pi0Var = pi0.a;
        }
        if (!z2) {
            synchronized (this.connection) {
                z3 = this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum();
            }
            z2 = z3;
        }
        this.connection.writeHeaders$okhttp(this.id, z, list);
        if (z2) {
            this.connection.flush();
        }
    }

    public final Timeout writeTimeout() {
        return this.writeTimeout;
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class FramingSink implements Sink {
        private boolean closed;
        private boolean finished;
        private final Buffer sendBuffer;
        private Headers trailers;

        public FramingSink(boolean z) {
            this.finished = z;
            this.sendBuffer = new Buffer();
        }

        private final void emitFrame(boolean z) throws IOException {
            long min;
            boolean z2;
            synchronized (Http2Stream.this) {
                Http2Stream.this.getWriteTimeout$okhttp().enter();
                while (Http2Stream.this.getWriteBytesTotal() >= Http2Stream.this.getWriteBytesMaximum() && !this.finished && !this.closed && Http2Stream.this.getErrorCode$okhttp() == null) {
                    Http2Stream.this.waitForIo$okhttp();
                }
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed$okhttp();
                min = Math.min(Http2Stream.this.getWriteBytesMaximum() - Http2Stream.this.getWriteBytesTotal(), this.sendBuffer.size());
                Http2Stream http2Stream = Http2Stream.this;
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                z2 = z && min == this.sendBuffer.size();
                pi0 pi0Var = pi0.a;
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z2, this.sendBuffer, min);
            } finally {
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0059ao.a(600));
                Thread currentThread = Thread.currentThread();
                yl0.d(currentThread, C0059ao.a(601));
                sb.append(currentThread.getName());
                sb.append(C0059ao.a(602));
                sb.append(http2Stream);
                throw new AssertionError(sb.toString());
            }
            synchronized (Http2Stream.this) {
                if (this.closed) {
                    return;
                }
                boolean z = Http2Stream.this.getErrorCode$okhttp() == null;
                pi0 pi0Var = pi0.a;
                if (!Http2Stream.this.getSink$okhttp().finished) {
                    boolean z2 = this.sendBuffer.size() > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.size() > 0) {
                            emitFrame(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id = Http2Stream.this.getId();
                        Headers headers = this.trailers;
                        yl0.c(headers);
                        connection.writeHeaders$okhttp(id, z, Util.toHeaderList(headers));
                    } else if (z2) {
                        while (this.sendBuffer.size() > 0) {
                            emitFrame(true);
                        }
                    } else if (z) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                    pi0 pi0Var2 = pi0.a;
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0059ao.a(603));
                Thread currentThread = Thread.currentThread();
                yl0.d(currentThread, C0059ao.a(604));
                sb.append(currentThread.getName());
                sb.append(C0059ao.a(605));
                sb.append(http2Stream);
                throw new AssertionError(sb.toString());
            }
            synchronized (Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed$okhttp();
                pi0 pi0Var = pi0.a;
            }
            while (this.sendBuffer.size() > 0) {
                emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            yl0.e(buffer, C0059ao.a(606));
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0059ao.a(607));
                Thread currentThread = Thread.currentThread();
                yl0.d(currentThread, C0059ao.a(608));
                sb.append(currentThread.getName());
                sb.append(C0059ao.a(609));
                sb.append(http2Stream);
                throw new AssertionError(sb.toString());
            }
            this.sendBuffer.write(buffer, j);
            while (this.sendBuffer.size() >= PlaybackStateCompat.ACTION_PREPARE) {
                emitFrame(false);
            }
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z, int i, vl0 vl0Var) {
            this((i & 1) != 0 ? false : z);
        }
    }
}
