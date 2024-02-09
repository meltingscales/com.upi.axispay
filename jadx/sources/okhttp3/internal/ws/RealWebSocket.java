package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketReader;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 0;
    public static final Companion Companion;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 0;
    private static final long MAX_QUEUE_SIZE = 0;
    private static final List<Protocol> ONLY_HTTP1;
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<ByteString> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private TaskQueue taskQueue;
    private WebSocketWriter writer;
    private Task writerTask;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final ByteString reason;

        public Close(int i, ByteString byteString, long j) {
            this.code = i;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final ByteString getReason() {
            return this.reason;
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
    public static final class Message {
        private final ByteString data;
        private final int formatOpcode;

        public Message(int i, ByteString byteString) {
            yl0.e(byteString, C0059ao.a(1170));
            this.formatOpcode = i;
            this.data = byteString;
        }

        public final ByteString getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class Streams implements Closeable {
        private final boolean client;
        private final BufferedSink sink;
        private final BufferedSource source;

        public Streams(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            yl0.e(bufferedSource, C0059ao.a(14515));
            yl0.e(bufferedSink, C0059ao.a(14516));
            this.client = z;
            this.source = bufferedSource;
            this.sink = bufferedSink;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final BufferedSink getSink() {
            return this.sink;
        }

        public final BufferedSource getSource() {
            return this.source;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.name + C0059ao.a(177), false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                return RealWebSocket.this.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e) {
                RealWebSocket.this.failWebSocket(e, null);
                return -1L;
            }
        }
    }

    static {
        C0059ao.a(RealWebSocket.class, 204);
        Companion = new Companion(null);
        ONLY_HTTP1 = zi0.b(Protocol.HTTP_1_1);
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j, WebSocketExtensions webSocketExtensions, long j2) {
        yl0.e(taskRunner, C0059ao.a(5428));
        yl0.e(request, C0059ao.a(5429));
        yl0.e(webSocketListener, C0059ao.a(5430));
        yl0.e(random, C0059ao.a(5431));
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random;
        this.pingIntervalMillis = j;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j2;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (yl0.a(C0059ao.a(5432), request.method())) {
            ByteString.Companion companion = ByteString.Companion;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            pi0 pi0Var = pi0.a;
            this.key = ByteString.Companion.of$default(companion, bArr, 0, 0, 3, null).base64();
            return;
        }
        throw new IllegalArgumentException((C0059ao.a(5433) + request.method()).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (!webSocketExtensions.unknownValues && webSocketExtensions.clientMaxWindowBits == null) {
            Integer num = webSocketExtensions.serverMaxWindowBits;
            if (num != null) {
                int intValue = num.intValue();
                return 8 <= intValue && 15 >= intValue;
            }
            return true;
        }
        return false;
    }

    private final void runWriter() {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(5434));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(5435));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(5436));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        Task task = this.writerTask;
        if (task != null) {
            TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
        }
    }

    public final void awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        yl0.e(timeUnit, C0059ao.a(5437));
        this.taskQueue.idleLatch().await(j, timeUnit);
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        yl0.c(call);
        call.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(Response response, Exchange exchange) throws IOException {
        yl0.e(response, C0059ao.a(5438));
        if (response.code() == 101) {
            String header$default = Response.header$default(response, C0059ao.a(5439), null, 2, null);
            String a = C0059ao.a(5440);
            if (bo0.j(a, header$default, true)) {
                String header$default2 = Response.header$default(response, a, null, 2, null);
                if (bo0.j(C0059ao.a(5441), header$default2, true)) {
                    String header$default3 = Response.header$default(response, C0059ao.a(5442), null, 2, null);
                    ByteString.Companion companion = ByteString.Companion;
                    String base64 = companion.encodeUtf8(this.key + C0059ao.a(5443)).sha1().base64();
                    if (!(!yl0.a(base64, header$default3))) {
                        if (exchange == null) {
                            throw new ProtocolException(C0059ao.a(5444));
                        }
                        return;
                    }
                    throw new ProtocolException(C0059ao.a(5445) + base64 + C0059ao.a(5446) + header$default3 + '\'');
                }
                throw new ProtocolException(C0059ao.a(5447) + header$default2 + '\'');
            }
            throw new ProtocolException(C0059ao.a(5448) + header$default + '\'');
        }
        throw new ProtocolException(C0059ao.a(5449) + response.code() + ' ' + response.message() + '\'');
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i, String str) {
        return close(i, str, 60000L);
    }

    public final void connect(OkHttpClient okHttpClient) {
        yl0.e(okHttpClient, C0059ao.a(5451));
        Request request = this.originalRequest;
        String a = C0059ao.a(5452);
        if (request.header(a) != null) {
            failWebSocket(new ProtocolException(C0059ao.a(5453)), null);
            return;
        }
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        Request.Builder newBuilder = this.originalRequest.newBuilder();
        String a2 = C0059ao.a(5454);
        final Request build2 = newBuilder.header(a2, C0059ao.a(5455)).header(C0059ao.a(5456), a2).header(C0059ao.a(5457), this.key).header(C0059ao.a(5458), C0059ao.a(5459)).header(a, C0059ao.a(5460)).build();
        RealCall realCall = new RealCall(build, build2, true);
        this.call = realCall;
        yl0.c(realCall);
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                yl0.e(call, C0059ao.a(11857));
                yl0.e(iOException, C0059ao.a(11858));
                RealWebSocket.this.failWebSocket(iOException, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                boolean isValid;
                ArrayDeque arrayDeque;
                yl0.e(call, C0059ao.a(11859));
                yl0.e(response, C0059ao.a(11860));
                Exchange exchange = response.exchange();
                try {
                    RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
                    yl0.c(exchange);
                    RealWebSocket.Streams newWebSocketStreams = exchange.newWebSocketStreams();
                    WebSocketExtensions parse = WebSocketExtensions.Companion.parse(response.headers());
                    RealWebSocket.this.extensions = parse;
                    isValid = RealWebSocket.this.isValid(parse);
                    if (!isValid) {
                        synchronized (RealWebSocket.this) {
                            arrayDeque = RealWebSocket.this.messageAndCloseQueue;
                            arrayDeque.clear();
                            RealWebSocket.this.close(1010, C0059ao.a(11861));
                        }
                    }
                    try {
                        RealWebSocket.this.initReaderAndWriter(Util.okHttpName + C0059ao.a(11862) + build2.url().redact(), newWebSocketStreams);
                        RealWebSocket.this.getListener$okhttp().onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e) {
                        RealWebSocket.this.failWebSocket(e, null);
                    }
                } catch (IOException e2) {
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                    RealWebSocket.this.failWebSocket(e2, response);
                    Util.closeQuietly(response);
                }
            }
        });
    }

    public final void failWebSocket(Exception exc, Response response) {
        yl0.e(exc, C0059ao.a(5461));
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            WebSocketReader webSocketReader = this.reader;
            this.reader = null;
            WebSocketWriter webSocketWriter = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            pi0 pi0Var = pi0.a;
            try {
                this.listener.onFailure(this, exc, response);
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public final void initReaderAndWriter(final String str, final Streams streams) throws IOException {
        yl0.e(str, C0059ao.a(5462));
        yl0.e(streams, C0059ao.a(5463));
        final WebSocketExtensions webSocketExtensions = this.extensions;
        yl0.c(webSocketExtensions);
        synchronized (this) {
            this.name = str;
            this.streams = streams;
            this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
            this.writerTask = new WriterTask();
            long j = this.pingIntervalMillis;
            if (j != 0) {
                final long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                final String str2 = str + C0059ao.a(5464);
                this.taskQueue.schedule(new Task(str2) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        this.writePingFrame$okhttp();
                        return nanos;
                    }
                }, nanos);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
            pi0 pi0Var = pi0.a;
        }
        this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams.getClient()));
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            yl0.c(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i, String str) {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        yl0.e(str, C0059ao.a(5465));
        boolean z = true;
        if (i != -1) {
            synchronized (this) {
                if (this.receivedCloseCode != -1) {
                    z = false;
                }
                if (z) {
                    this.receivedCloseCode = i;
                    this.receivedCloseReason = str;
                    streams = null;
                    if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                        Streams streams2 = this.streams;
                        this.streams = null;
                        webSocketReader = this.reader;
                        this.reader = null;
                        webSocketWriter = this.writer;
                        this.writer = null;
                        this.taskQueue.shutdown();
                        streams = streams2;
                    } else {
                        webSocketReader = null;
                        webSocketWriter = null;
                    }
                    pi0 pi0Var = pi0.a;
                } else {
                    throw new IllegalStateException(C0059ao.a(5466).toString());
                }
            }
            try {
                this.listener.onClosing(this, i, str);
                if (streams != null) {
                    this.listener.onClosed(this, i, str);
                }
                if (webSocketWriter != null) {
                    return;
                }
                return;
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
        throw new IllegalArgumentException(C0059ao.a(5467).toString());
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String str) throws IOException {
        yl0.e(str, C0059ao.a(5468));
        this.listener.onMessage(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(5470));
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(byteString);
            runWriter();
            this.receivedPingCount++;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(5471));
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(5472));
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(byteString);
            runWriter();
            return true;
        }
        return false;
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            yl0.c(webSocketReader);
            webSocketReader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (Exception e) {
            failWebSocket(e, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    public Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public boolean send(String str) {
        yl0.e(str, C0059ao.a(5473));
        return send(ByteString.Companion.encodeUtf8(str), 1);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0105 A[Catch: all -> 0x01c3, TRY_ENTER, TryCatch #1 {all -> 0x01c3, blocks: (B:30:0x0105, B:32:0x0110, B:35:0x011a, B:36:0x012a, B:38:0x0139, B:43:0x013e, B:44:0x014a, B:45:0x014b, B:48:0x0151, B:37:0x012b), top: B:87:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0110 A[Catch: all -> 0x01c3, TryCatch #1 {all -> 0x01c3, blocks: (B:30:0x0105, B:32:0x0110, B:35:0x011a, B:36:0x012a, B:38:0x0139, B:43:0x013e, B:44:0x014a, B:45:0x014b, B:48:0x0151, B:37:0x012b), top: B:87:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0198  */
    /* JADX WARN: Type inference failed for: r1v10, types: [okhttp3.internal.ws.WebSocketWriter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [jm0] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, okhttp3.internal.ws.RealWebSocket$Streams] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, okhttp3.internal.ws.WebSocketReader] */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, okhttp3.internal.ws.WebSocketWriter] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [okio.ByteString] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean writeOneFrame$okhttp() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.writeOneFrame$okhttp():boolean");
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            WebSocketWriter webSocketWriter = this.writer;
            if (webSocketWriter != null) {
                int i = this.awaitingPong ? this.sentPingCount : -1;
                this.sentPingCount++;
                this.awaitingPong = true;
                pi0 pi0Var = pi0.a;
                if (i != -1) {
                    failWebSocket(new SocketTimeoutException(C0059ao.a(5479) + this.pingIntervalMillis + C0059ao.a(5480) + (i - 1) + C0059ao.a(5481)), null);
                    return;
                }
                try {
                    webSocketWriter.writePing(ByteString.EMPTY);
                } catch (IOException e) {
                    failWebSocket(e, null);
                }
            }
        }
    }

    public final synchronized boolean close(int i, String str, long j) {
        WebSocketProtocol.INSTANCE.validateCloseCode(i);
        ByteString byteString = null;
        if (str != null) {
            byteString = ByteString.Companion.encodeUtf8(str);
            if (!(((long) byteString.size()) <= 123)) {
                throw new IllegalArgumentException((C0059ao.a(5450) + str).toString());
            }
        }
        if (!this.failed && !this.enqueuedClose) {
            this.enqueuedClose = true;
            this.messageAndCloseQueue.add(new Close(i, byteString, j));
            runWriter();
            return true;
        }
        return false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(ByteString byteString) throws IOException {
        yl0.e(byteString, C0059ao.a(5469));
        this.listener.onMessage(this, byteString);
    }

    @Override // okhttp3.WebSocket
    public boolean send(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(5474));
        return send(byteString, 2);
    }

    private final synchronized boolean send(ByteString byteString, int i) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + byteString.size() > 16777216) {
                close(1001, null);
                return false;
            }
            this.queueSize += byteString.size();
            this.messageAndCloseQueue.add(new Message(i, byteString));
            runWriter();
            return true;
        }
        return false;
    }
}
