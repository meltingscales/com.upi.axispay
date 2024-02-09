package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskQueue$execute$1;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 0;
    public static final Companion Companion;
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 0;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 0;
    public static final int INTERVAL_PING = 0;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 0;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean client;
        public String connectionName;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public BufferedSink sink;
        public Socket socket;
        public BufferedSource source;
        private final TaskRunner taskRunner;

        public Builder(boolean z, TaskRunner taskRunner) {
            yl0.e(taskRunner, C0059ao.a(5369));
            this.client = z;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink, int i, Object obj) throws IOException {
            if ((i & 2) != 0) {
                str = Util.peerName(socket);
            }
            if ((i & 4) != 0) {
                bufferedSource = Okio.buffer(Okio.source(socket));
            }
            if ((i & 8) != 0) {
                bufferedSink = Okio.buffer(Okio.sink(socket));
            }
            return builder.socket(socket, str, bufferedSource, bufferedSink);
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            yl0.t(C0059ao.a(5370));
            throw null;
        }

        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final BufferedSink getSink$okhttp() {
            BufferedSink bufferedSink = this.sink;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            yl0.t(C0059ao.a(5371));
            throw null;
        }

        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            yl0.t(C0059ao.a(5372));
            throw null;
        }

        public final BufferedSource getSource$okhttp() {
            BufferedSource bufferedSource = this.source;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            yl0.t(C0059ao.a(5373));
            throw null;
        }

        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        public final Builder listener(Listener listener) {
            yl0.e(listener, C0059ao.a(5374));
            this.listener = listener;
            return this;
        }

        public final Builder pingIntervalMillis(int i) {
            this.pingIntervalMillis = i;
            return this;
        }

        public final Builder pushObserver(PushObserver pushObserver) {
            yl0.e(pushObserver, C0059ao.a(5375));
            this.pushObserver = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean z) {
            this.client = z;
        }

        public final void setConnectionName$okhttp(String str) {
            yl0.e(str, C0059ao.a(5376));
            this.connectionName = str;
        }

        public final void setListener$okhttp(Listener listener) {
            yl0.e(listener, C0059ao.a(5377));
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i) {
            this.pingIntervalMillis = i;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver) {
            yl0.e(pushObserver, C0059ao.a(5378));
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(BufferedSink bufferedSink) {
            yl0.e(bufferedSink, C0059ao.a(5379));
            this.sink = bufferedSink;
        }

        public final void setSocket$okhttp(Socket socket) {
            yl0.e(socket, C0059ao.a(5380));
            this.socket = socket;
        }

        public final void setSource$okhttp(BufferedSource bufferedSource) {
            yl0.e(bufferedSource, C0059ao.a(5381));
            this.source = bufferedSource;
        }

        public final Builder socket(Socket socket) throws IOException {
            return socket$default(this, socket, null, null, null, 14, null);
        }

        public final Builder socket(Socket socket, String str) throws IOException {
            return socket$default(this, socket, str, null, null, 12, null);
        }

        public final Builder socket(Socket socket, String str, BufferedSource bufferedSource) throws IOException {
            return socket$default(this, socket, str, bufferedSource, null, 8, null);
        }

        public final Builder socket(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) throws IOException {
            String str2;
            yl0.e(socket, C0059ao.a(5382));
            yl0.e(str, C0059ao.a(5383));
            yl0.e(bufferedSource, C0059ao.a(5384));
            yl0.e(bufferedSink, C0059ao.a(5385));
            this.socket = socket;
            if (this.client) {
                str2 = Util.okHttpName + ' ' + str;
            } else {
                str2 = C0059ao.a(5386) + str;
            }
            this.connectionName = str2;
            this.source = bufferedSource;
            this.sink = bufferedSink;
            return this;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class Listener {
        public static final Companion Companion = new Companion(null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream http2Stream) throws IOException {
                yl0.e(http2Stream, C0059ao.a(10859));
                http2Stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(vl0 vl0Var) {
                this();
            }
        }

        public void onSettings(Http2Connection http2Connection, Settings settings) {
            yl0.e(http2Connection, C0059ao.a(7712));
            yl0.e(settings, C0059ao.a(7713));
        }

        public abstract void onStream(Http2Stream http2Stream) throws IOException;
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class ReaderRunnable implements Http2Reader.Handler, sk0<pi0> {
        private final Http2Reader reader;
        public final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
            yl0.e(http2Reader, C0059ao.a(5212));
            this.this$0 = http2Connection;
            this.reader = http2Reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i, String str, ByteString byteString, String str2, int i2, long j) {
            yl0.e(str, C0059ao.a(5213));
            yl0.e(byteString, C0059ao.a(5214));
            yl0.e(str2, C0059ao.a(5215));
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:6|7|(1:9)(1:54)|10|(2:15|(10:17|18|19|20|21|22|23|24|25|26)(2:51|52))|53|18|19|20|21|22|23|24|25|26) */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x00e7, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x00e8, code lost:
            r22.this$0.failConnection(r0);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void applyAndAckSettings(final boolean r23, final okhttp3.internal.http2.Settings r24) {
            /*
                Method dump skipped, instructions count: 285
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.ReaderRunnable.applyAndAckSettings(boolean, okhttp3.internal.http2.Settings):void");
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException {
            yl0.e(bufferedSource, C0059ao.a(5219));
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushDataLater$okhttp(i, bufferedSource, i2, z);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                long j = i2;
                this.this$0.updateConnectionFlowControl$okhttp(j);
                bufferedSource.skip(j);
                return;
            }
            stream.receiveData(bufferedSource, i2);
            if (z) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i, ErrorCode errorCode, ByteString byteString) {
            int i2;
            Http2Stream[] http2StreamArr;
            yl0.e(errorCode, C0059ao.a(5220));
            yl0.e(byteString, C0059ao.a(5221));
            byteString.size();
            synchronized (this.this$0) {
                Object[] array = this.this$0.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                if (array != null) {
                    http2StreamArr = (Http2Stream[]) array;
                    this.this$0.isShutdown = true;
                    pi0 pi0Var = pi0.a;
                } else {
                    throw new NullPointerException(C0059ao.a(5222));
                }
            }
            for (Http2Stream http2Stream : http2StreamArr) {
                if (http2Stream.getId() > i && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(final boolean z, final int i, int i2, final List<Header> list) {
            yl0.e(list, C0059ao.a(5223));
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushHeadersLater$okhttp(i, list, z);
                return;
            }
            synchronized (this.this$0) {
                final Http2Stream stream = this.this$0.getStream(i);
                if (stream == null) {
                    if (this.this$0.isShutdown) {
                        return;
                    }
                    if (i <= this.this$0.getLastGoodStreamId$okhttp()) {
                        return;
                    }
                    if (i % 2 == this.this$0.getNextStreamId$okhttp() % 2) {
                        return;
                    }
                    final Http2Stream http2Stream = new Http2Stream(i, this.this$0, false, z, Util.toHeaders(list));
                    this.this$0.setLastGoodStreamId$okhttp(i);
                    this.this$0.getStreams$okhttp().put(Integer.valueOf(i), http2Stream);
                    final String str = this.this$0.getConnectionName$okhttp() + '[' + i + C0059ao.a(5224);
                    this.this$0.taskRunner.newQueue().schedule(new Task(str, true) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$$inlined$synchronized$lambda$1
                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            try {
                                this.this$0.getListener$okhttp().onStream(http2Stream);
                                return -1L;
                            } catch (IOException e) {
                                Platform platform = Platform.Companion.get();
                                platform.log(C0059ao.a(6218) + this.this$0.getConnectionName$okhttp(), 4, e);
                                try {
                                    http2Stream.close(ErrorCode.PROTOCOL_ERROR, e);
                                    return -1L;
                                } catch (IOException unused) {
                                    return -1L;
                                }
                            }
                        }
                    }, 0L);
                    return;
                }
                pi0 pi0Var = pi0.a;
                stream.receiveHeaders(Util.toHeaders(list), z);
            }
        }

        @Override // defpackage.sk0
        public /* bridge */ /* synthetic */ pi0 invoke() {
            invoke2();
            return pi0.a;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z, final int i, final int i2) {
            if (z) {
                synchronized (this.this$0) {
                    if (i == 1) {
                        this.this$0.intervalPongsReceived++;
                    } else if (i != 2) {
                        if (i == 3) {
                            this.this$0.awaitPongsReceived++;
                            Http2Connection http2Connection = this.this$0;
                            if (http2Connection == null) {
                                throw new NullPointerException(C0059ao.a(5225));
                            }
                            http2Connection.notifyAll();
                        }
                        pi0 pi0Var = pi0.a;
                    } else {
                        this.this$0.degradedPongsReceived++;
                    }
                }
                return;
            }
            final String str = this.this$0.getConnectionName$okhttp() + C0059ao.a(5226);
            this.this$0.writerQueue.schedule(new Task(str, true) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.this$0.writePing(true, i, i2);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i, int i2, int i3, boolean z) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i, int i2, List<Header> list) {
            yl0.e(list, C0059ao.a(5227));
            this.this$0.pushRequestLater$okhttp(i2, list);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i, ErrorCode errorCode) {
            yl0.e(errorCode, C0059ao.a(5228));
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushResetLater$okhttp(i, errorCode);
                return;
            }
            Http2Stream removeStream$okhttp = this.this$0.removeStream$okhttp(i);
            if (removeStream$okhttp != null) {
                removeStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean z, final Settings settings) {
            yl0.e(settings, C0059ao.a(5229));
            final String str = this.this$0.getConnectionName$okhttp() + C0059ao.a(5230);
            this.this$0.writerQueue.schedule(new Task(str, true) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.applyAndAckSettings(z, settings);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i, long j) {
            if (i == 0) {
                synchronized (this.this$0) {
                    Http2Connection http2Connection = this.this$0;
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j;
                    Http2Connection http2Connection2 = this.this$0;
                    if (http2Connection2 != null) {
                        http2Connection2.notifyAll();
                        pi0 pi0Var = pi0.a;
                    } else {
                        throw new NullPointerException(C0059ao.a(5231));
                    }
                }
                return;
            }
            Http2Stream stream = this.this$0.getStream(i);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j);
                    pi0 pi0Var2 = pi0.a;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.Http2Reader] */
        /* renamed from: invoke */
        public void invoke2() {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    while (this.reader.nextFrame(false, this)) {
                    }
                    errorCode2 = ErrorCode.NO_ERROR;
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th) {
                    th = th;
                    errorCode = errorCode3;
                    this.this$0.close$okhttp(errorCode, errorCode3, e);
                    Util.closeQuietly(this.reader);
                    throw th;
                }
                try {
                    this.this$0.close$okhttp(errorCode2, ErrorCode.CANCEL, null);
                    errorCode = errorCode2;
                } catch (IOException e3) {
                    e = e3;
                    ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                    Http2Connection http2Connection = this.this$0;
                    http2Connection.close$okhttp(errorCode4, errorCode4, e);
                    errorCode = http2Connection;
                    errorCode3 = this.reader;
                    Util.closeQuietly((Closeable) errorCode3);
                }
                errorCode3 = this.reader;
                Util.closeQuietly((Closeable) errorCode3);
            } catch (Throwable th2) {
                th = th2;
                this.this$0.close$okhttp(errorCode, errorCode3, e);
                Util.closeQuietly(this.reader);
                throw th;
            }
        }
    }

    static {
        C0059ao.a(Http2Connection.class, 196);
        Companion = new Companion(null);
        Settings settings = new Settings();
        settings.set(7, 65535);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(Builder builder) {
        Settings settings;
        yl0.e(builder, C0059ao.a(2117));
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient$okhttp() ? 3 : 2;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue newQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = newQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings2 = new Settings();
        if (builder.getClient$okhttp()) {
            settings2.set(7, 16777216);
        }
        pi0 pi0Var = pi0.a;
        this.okHttpSettings = settings2;
        this.peerSettings = DEFAULT_SETTINGS;
        this.writeBytesMaximum = settings.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            final String str = connectionName$okhttp + C0059ao.a(2118);
            newQueue.schedule(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$$special$$inlined$schedule$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    long j;
                    long j2;
                    boolean z;
                    synchronized (this) {
                        long j3 = this.intervalPongsReceived;
                        j = this.intervalPingsSent;
                        if (j3 < j) {
                            z = true;
                        } else {
                            Http2Connection http2Connection = this;
                            j2 = http2Connection.intervalPingsSent;
                            http2Connection.intervalPingsSent = j2 + 1;
                            z = false;
                        }
                    }
                    if (z) {
                        this.failConnection(null);
                        return -1L;
                    }
                    this.writePing(false, 1, 0);
                    return nanos;
                }
            }, nanos);
        }
    }

    public final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z, TaskRunner taskRunner, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z, taskRunner);
    }

    public final synchronized void awaitPong() throws InterruptedException {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        yl0.e(errorCode, C0059ao.a(2120));
        yl0.e(errorCode2, C0059ao.a(2121));
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(2122));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(2123));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(2124));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        try {
            shutdown(errorCode);
        } catch (IOException unused) {
        }
        Http2Stream[] http2StreamArr = null;
        synchronized (this) {
            if (!this.streams.isEmpty()) {
                Object[] array = this.streams.values().toArray(new Http2Stream[0]);
                if (array != null) {
                    http2StreamArr = (Http2Stream[]) array;
                    this.streams.clear();
                } else {
                    throw new NullPointerException(C0059ao.a(2125));
                }
            }
            pi0 pi0Var = pi0.a;
        }
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    public final synchronized Http2Stream getStream(int i) {
        return this.streams.get(Integer.valueOf(i));
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long j) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (j >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    public final Http2Stream newStream(List<Header> list, boolean z) throws IOException {
        yl0.e(list, C0059ao.a(2126));
        return newStream(0, list, z);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(final int i, BufferedSource bufferedSource, final int i2, final boolean z) throws IOException {
        yl0.e(bufferedSource, C0059ao.a(2127));
        final Buffer buffer = new Buffer();
        long j = i2;
        bufferedSource.require(j);
        bufferedSource.read(buffer, j);
        final String str = this.connectionName + '[' + i + C0059ao.a(2128);
        this.pushQueue.schedule(new Task(str, true) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                try {
                    pushObserver = this.pushObserver;
                    boolean onData = pushObserver.onData(i, buffer, i2, z);
                    if (onData) {
                        this.getWriter().rstStream(i, ErrorCode.CANCEL);
                    }
                    if (onData || z) {
                        synchronized (this) {
                            set = this.currentPushRequests;
                            set.remove(Integer.valueOf(i));
                        }
                        return -1L;
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void pushHeadersLater$okhttp(final int i, final List<Header> list, final boolean z) {
        yl0.e(list, C0059ao.a(2129));
        final String str = this.connectionName + '[' + i + C0059ao.a(2130);
        this.pushQueue.schedule(new Task(str, true) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                pushObserver = this.pushObserver;
                boolean onHeaders = pushObserver.onHeaders(i, list, z);
                if (onHeaders) {
                    try {
                        this.getWriter().rstStream(i, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (onHeaders || z) {
                    synchronized (this) {
                        set = this.currentPushRequests;
                        set.remove(Integer.valueOf(i));
                    }
                    return -1L;
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushRequestLater$okhttp(final int i, final List<Header> list) {
        yl0.e(list, C0059ao.a(2131));
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i))) {
                writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i));
            final String str = this.connectionName + '[' + i + C0059ao.a(2132);
            this.pushQueue.schedule(new Task(str, true) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    PushObserver pushObserver;
                    Set set;
                    pushObserver = this.pushObserver;
                    if (pushObserver.onRequest(i, list)) {
                        try {
                            this.getWriter().rstStream(i, ErrorCode.CANCEL);
                            synchronized (this) {
                                set = this.currentPushRequests;
                                set.remove(Integer.valueOf(i));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void pushResetLater$okhttp(final int i, final ErrorCode errorCode) {
        yl0.e(errorCode, C0059ao.a(2133));
        final String str = this.connectionName + '[' + i + C0059ao.a(2134);
        this.pushQueue.schedule(new Task(str, true) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                pushObserver = this.pushObserver;
                pushObserver.onReset(i, errorCode);
                synchronized (this) {
                    set = this.currentPushRequests;
                    set.remove(Integer.valueOf(i));
                    pi0 pi0Var = pi0.a;
                }
                return -1L;
            }
        }, 0L);
    }

    public final Http2Stream pushStream(int i, List<Header> list, boolean z) throws IOException {
        yl0.e(list, C0059ao.a(2135));
        if (!this.client) {
            return newStream(i, list, z);
        }
        throw new IllegalStateException(C0059ao.a(2136).toString());
    }

    public final boolean pushedStream$okhttp(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final synchronized Http2Stream removeStream$okhttp(int i) {
        Http2Stream remove;
        remove = this.streams.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j = this.degradedPongsReceived;
            long j2 = this.degradedPingsSent;
            if (j < j2) {
                return;
            }
            this.degradedPingsSent = j2 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
            pi0 pi0Var = pi0.a;
            final String str = this.connectionName + C0059ao.a(2137);
            this.writerQueue.schedule(new Task(str, true) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i) {
        this.lastGoodStreamId = i;
    }

    public final void setNextStreamId$okhttp(int i) {
        this.nextStreamId = i;
    }

    public final void setPeerSettings(Settings settings) {
        yl0.e(settings, C0059ao.a(2138));
        this.peerSettings = settings;
    }

    public final void setSettings(Settings settings) throws IOException {
        yl0.e(settings, C0059ao.a(2139));
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.isShutdown) {
                    this.okHttpSettings.merge(settings);
                    pi0 pi0Var = pi0.a;
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            this.writer.settings(settings);
        }
    }

    public final void shutdown(ErrorCode errorCode) throws IOException {
        yl0.e(errorCode, C0059ao.a(2140));
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i = this.lastGoodStreamId;
                pi0 pi0Var = pi0.a;
                this.writer.goAway(i, errorCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public final void start() throws IOException {
        start$default(this, false, null, 3, null);
    }

    public final void start(boolean z) throws IOException {
        start$default(this, z, null, 2, null);
    }

    public final void start(boolean z, TaskRunner taskRunner) throws IOException {
        yl0.e(taskRunner, C0059ao.a(2141));
        if (z) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            int initialWindowSize = this.okHttpSettings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                this.writer.windowUpdate(0, initialWindowSize - 65535);
            }
        }
        TaskQueue newQueue = taskRunner.newQueue();
        String str = this.connectionName;
        newQueue.schedule(new TaskQueue$execute$1(this.readerRunnable, str, true, str, true), 0L);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j) {
        long j2 = this.readBytesTotal + j;
        this.readBytesTotal = j2;
        long j3 = j2 - this.readBytesAcknowledged;
        if (j3 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j3);
            this.readBytesAcknowledged += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0036, code lost:
        throw new java.io.IOException(myunmn.C0059ao.a(2142));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0038, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r13, r7 - r5), r9.writer.maxDataLength());
        r7 = r3;
        r9.writeBytesTotal += r7;
        r5 = defpackage.pi0.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void writeData(int r10, boolean r11, okio.Buffer r12, long r13) throws java.io.IOException {
        /*
            r9 = this;
            r1 = 0
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            r4 = 0
            if (r3 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r13 = r9.writer
            r13.data(r11, r10, r12, r4)
            return
        Ld:
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 <= 0) goto L71
            monitor-enter(r9)
        L12:
            long r5 = r9.writeBytesTotal     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            long r7 = r9.writeBytesMaximum     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L37
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r3 = r9.streams     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            boolean r3 = r3.containsKey(r5)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            if (r3 == 0) goto L2a
            r9.wait()     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            goto L12
        L2a:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            r0 = 2142(0x85e, float:3.002E-42)
            java.lang.String r11 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            throw r10     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
        L37:
            long r7 = r7 - r5
            long r5 = java.lang.Math.min(r13, r7)     // Catch: java.lang.Throwable -> L60
            int r3 = (int) r5     // Catch: java.lang.Throwable -> L60
            okhttp3.internal.http2.Http2Writer r5 = r9.writer     // Catch: java.lang.Throwable -> L60
            int r5 = r5.maxDataLength()     // Catch: java.lang.Throwable -> L60
            int r3 = java.lang.Math.min(r3, r5)     // Catch: java.lang.Throwable -> L60
            long r5 = r9.writeBytesTotal     // Catch: java.lang.Throwable -> L60
            long r7 = (long) r3     // Catch: java.lang.Throwable -> L60
            long r5 = r5 + r7
            r9.writeBytesTotal = r5     // Catch: java.lang.Throwable -> L60
            pi0 r5 = defpackage.pi0.a     // Catch: java.lang.Throwable -> L60
            monitor-exit(r9)
            long r13 = r13 - r7
            okhttp3.internal.http2.Http2Writer r5 = r9.writer
            if (r11 == 0) goto L5b
            int r6 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r6 != 0) goto L5b
            r6 = 1
            goto L5c
        L5b:
            r6 = r4
        L5c:
            r5.data(r6, r10, r12, r3)
            goto Ld
        L60:
            r10 = move-exception
            goto L6f
        L62:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L60
            r10.interrupt()     // Catch: java.lang.Throwable -> L60
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L60
            r10.<init>()     // Catch: java.lang.Throwable -> L60
            throw r10     // Catch: java.lang.Throwable -> L60
        L6f:
            monitor-exit(r9)
            throw r10
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.writeData(int, boolean, okio.Buffer, long):void");
    }

    public final void writeHeaders$okhttp(int i, boolean z, List<Header> list) throws IOException {
        yl0.e(list, C0059ao.a(2143));
        this.writer.headers(z, i, list);
    }

    public final void writePing(boolean z, int i, int i2) {
        try {
            this.writer.ping(z, i, i2);
        } catch (IOException e) {
            failConnection(e);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i, ErrorCode errorCode) throws IOException {
        yl0.e(errorCode, C0059ao.a(2144));
        this.writer.rstStream(i, errorCode);
    }

    public final void writeSynResetLater$okhttp(final int i, final ErrorCode errorCode) {
        yl0.e(errorCode, C0059ao.a(2145));
        final String str = this.connectionName + '[' + i + C0059ao.a(2146);
        this.writerQueue.schedule(new Task(str, true) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.writeSynReset$okhttp(i, errorCode);
                    return -1L;
                } catch (IOException e) {
                    this.failConnection(e);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(final int i, final long j) {
        final String str = this.connectionName + '[' + i + C0059ao.a(2147);
        this.writerQueue.schedule(new Task(str, true) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.getWriter().windowUpdate(i, j);
                    return -1L;
                } catch (IOException e) {
                    this.failConnection(e);
                    return -1L;
                }
            }
        }, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0048 A[Catch: all -> 0x0086, TryCatch #1 {, blocks: (B:48:0x0006, B:67:0x0053, B:69:0x0056, B:70:0x005c, B:72:0x0061, B:77:0x006f, B:78:0x007f, B:49:0x0007, B:51:0x000e, B:52:0x0013, B:54:0x0017, B:56:0x002a, B:58:0x0032, B:63:0x0042, B:65:0x0048, B:66:0x0051, B:79:0x0080, B:80:0x0085), top: B:87:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final okhttp3.internal.http2.Http2Stream newStream(int r12, java.util.List<okhttp3.internal.http2.Header> r13, boolean r14) throws java.io.IOException {
        /*
            r11 = this;
            r7 = r14 ^ 1
            r5 = 0
            okhttp3.internal.http2.Http2Writer r8 = r11.writer
            monitor-enter(r8)
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L89
            int r1 = r11.nextStreamId     // Catch: java.lang.Throwable -> L86
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 <= r2) goto L13
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L86
            r11.shutdown(r1)     // Catch: java.lang.Throwable -> L86
        L13:
            boolean r1 = r11.isShutdown     // Catch: java.lang.Throwable -> L86
            if (r1 != 0) goto L80
            int r9 = r11.nextStreamId     // Catch: java.lang.Throwable -> L86
            int r1 = r9 + 2
            r11.nextStreamId = r1     // Catch: java.lang.Throwable -> L86
            okhttp3.internal.http2.Http2Stream r10 = new okhttp3.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> L86
            r6 = 0
            r1 = r10
            r2 = r9
            r3 = r11
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L86
            r1 = 1
            if (r14 == 0) goto L41
            long r2 = r11.writeBytesTotal     // Catch: java.lang.Throwable -> L86
            long r4 = r11.writeBytesMaximum     // Catch: java.lang.Throwable -> L86
            int r14 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r14 >= 0) goto L41
            long r2 = r10.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L86
            long r4 = r10.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L86
            int r14 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r14 < 0) goto L3f
            goto L41
        L3f:
            r14 = 0
            goto L42
        L41:
            r14 = r1
        L42:
            boolean r2 = r10.isOpen()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L51
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r2 = r11.streams     // Catch: java.lang.Throwable -> L86
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L86
            r2.put(r3, r10)     // Catch: java.lang.Throwable -> L86
        L51:
            pi0 r2 = defpackage.pi0.a     // Catch: java.lang.Throwable -> L86
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L89
            if (r12 != 0) goto L5c
            okhttp3.internal.http2.Http2Writer r12 = r11.writer     // Catch: java.lang.Throwable -> L89
            r12.headers(r7, r9, r13)     // Catch: java.lang.Throwable -> L89
            goto L66
        L5c:
            boolean r2 = r11.client     // Catch: java.lang.Throwable -> L89
            r1 = r1 ^ r2
            if (r1 == 0) goto L6f
            okhttp3.internal.http2.Http2Writer r1 = r11.writer     // Catch: java.lang.Throwable -> L89
            r1.pushPromise(r12, r9, r13)     // Catch: java.lang.Throwable -> L89
        L66:
            monitor-exit(r8)
            if (r14 == 0) goto L6e
            okhttp3.internal.http2.Http2Writer r12 = r11.writer
            r12.flush()
        L6e:
            return r10
        L6f:
            r0 = 2119(0x847, float:2.97E-42)
            java.lang.String r12 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L89
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L89
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L89
            throw r13     // Catch: java.lang.Throwable -> L89
        L80:
            okhttp3.internal.http2.ConnectionShutdownException r12 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L86
            r12.<init>()     // Catch: java.lang.Throwable -> L86
            throw r12     // Catch: java.lang.Throwable -> L86
        L86:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L89
            throw r12     // Catch: java.lang.Throwable -> L89
        L89:
            r12 = move-exception
            monitor-exit(r8)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.newStream(int, java.util.List, boolean):okhttp3.internal.http2.Http2Stream");
    }

    public final void writePing() throws InterruptedException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }
}
