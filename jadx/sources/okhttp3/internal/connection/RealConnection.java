package okhttp3.internal.connection;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import myunmn.C0059ao;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    public static final Companion Companion;
    public static final long IDLE_CONNECTION_HEALTHY_NS = 0;
    private static final int MAX_TUNNEL_ATTEMPTS = 0;
    private static final String NPE_THROW_WITH_NULL = null;
    private int allocationLimit;
    private final List<Reference<RealCall>> calls;
    private final RealConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private BufferedSink sink;
    private Socket socket;
    private BufferedSource source;
    private int successCount;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final RealConnection newTestConnection(RealConnectionPool realConnectionPool, Route route, Socket socket, long j) {
            yl0.e(realConnectionPool, C0059ao.a(13740));
            yl0.e(route, C0059ao.a(13741));
            yl0.e(socket, C0059ao.a(13742));
            RealConnection realConnection = new RealConnection(realConnectionPool, route);
            realConnection.socket = socket;
            realConnection.setIdleAtNs(j);
            return realConnection;
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
        }
    }

    static {
        C0059ao.a(RealConnection.class, 254);
        Companion = new Companion(null);
    }

    public RealConnection(RealConnectionPool realConnectionPool, Route route) {
        yl0.e(realConnectionPool, C0059ao.a(14219));
        yl0.e(route, C0059ao.a(14220));
        this.connectionPool = realConnectionPool;
        this.route = route;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = RecyclerView.FOREVER_NS;
    }

    private final boolean certificateSupportHost(HttpUrl httpUrl, Handshake handshake) {
        List<Certificate> peerCertificates = handshake.peerCertificates();
        if (!peerCertificates.isEmpty()) {
            OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.INSTANCE;
            String host = httpUrl.host();
            Certificate certificate = peerCertificates.get(0);
            Objects.requireNonNull(certificate, C0059ao.a(14221));
            if (okHostnameVerifier.verify(host, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    private final void connectSocket(int i, int i2, Call call, EventListener eventListener) throws IOException {
        Socket socket;
        int i3;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        Proxy.Type type = proxy.type();
        if (type == null || ((i3 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) != 1 && i3 != 2)) {
            socket = new Socket(proxy);
        } else {
            socket = address.socketFactory().createSocket();
            yl0.c(socket);
        }
        this.rawSocket = socket;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        socket.setSoTimeout(i2);
        try {
            Platform.Companion.get().connectSocket(socket, this.route.socketAddress(), i);
            try {
                this.source = Okio.buffer(Okio.source(socket));
                this.sink = Okio.buffer(Okio.sink(socket));
            } catch (NullPointerException e) {
                if (yl0.a(e.getMessage(), C0059ao.a(14222))) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException(C0059ao.a(14223) + this.route.socketAddress());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private final void connectTls(ConnectionSpecSelector connectionSpecSelector) throws IOException {
        Address address = this.route.address();
        SSLSocketFactory sslSocketFactory = address.sslSocketFactory();
        SSLSocket sSLSocket = null;
        try {
            yl0.c(sslSocketFactory);
            Socket createSocket = sslSocketFactory.createSocket(this.rawSocket, address.url().host(), address.url().port(), true);
            if (createSocket != null) {
                SSLSocket sSLSocket2 = (SSLSocket) createSocket;
                try {
                    ConnectionSpec configureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket2);
                    if (configureSecureSocket.supportsTlsExtensions()) {
                        Platform.Companion.get().configureTlsExtensions(sSLSocket2, address.url().host(), address.protocols());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    Handshake.Companion companion = Handshake.Companion;
                    yl0.d(session, C0059ao.a(14224));
                    Handshake handshake = companion.get(session);
                    HostnameVerifier hostnameVerifier = address.hostnameVerifier();
                    yl0.c(hostnameVerifier);
                    if (!hostnameVerifier.verify(address.url().host(), session)) {
                        List<Certificate> peerCertificates = handshake.peerCertificates();
                        if (!peerCertificates.isEmpty()) {
                            Certificate certificate = peerCertificates.get(0);
                            if (certificate == null) {
                                throw new NullPointerException(C0059ao.a(14225));
                            }
                            X509Certificate x509Certificate = (X509Certificate) certificate;
                            StringBuilder sb = new StringBuilder();
                            sb.append(C0059ao.a(14226));
                            sb.append(address.url().host());
                            sb.append(C0059ao.a(14227));
                            sb.append(CertificatePinner.Companion.pin(x509Certificate));
                            sb.append(C0059ao.a(14228));
                            Principal subjectDN = x509Certificate.getSubjectDN();
                            yl0.d(subjectDN, C0059ao.a(14229));
                            sb.append(subjectDN.getName());
                            sb.append(C0059ao.a(14230));
                            sb.append(OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate));
                            sb.append(C0059ao.a(14231));
                            throw new SSLPeerUnverifiedException(un0.e(sb.toString(), null, 1, null));
                        }
                        throw new SSLPeerUnverifiedException(C0059ao.a(14232) + address.url().host() + C0059ao.a(14233));
                    }
                    CertificatePinner certificatePinner = address.certificatePinner();
                    yl0.c(certificatePinner);
                    this.handshake = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new RealConnection$connectTls$1(certificatePinner, handshake, address));
                    certificatePinner.check$okhttp(address.url().host(), new RealConnection$connectTls$2(this));
                    String selectedProtocol = configureSecureSocket.supportsTlsExtensions() ? Platform.Companion.get().getSelectedProtocol(sSLSocket2) : null;
                    this.socket = sSLSocket2;
                    this.source = Okio.buffer(Okio.source(sSLSocket2));
                    this.sink = Okio.buffer(Okio.sink(sSLSocket2));
                    this.protocol = selectedProtocol != null ? Protocol.Companion.get(selectedProtocol) : Protocol.HTTP_1_1;
                    if (sSLSocket2 != null) {
                        Platform.Companion.get().afterHandshake(sSLSocket2);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        Platform.Companion.get().afterHandshake(sSLSocket);
                    }
                    if (sSLSocket != null) {
                        Util.closeQuietly((Socket) sSLSocket);
                    }
                    throw th;
                }
            }
            throw new NullPointerException(C0059ao.a(14234));
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void connectTunnel(int i, int i2, int i3, Call call, EventListener eventListener) throws IOException {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl url = createTunnelRequest.url();
        for (int i4 = 0; i4 < 21; i4++) {
            connectSocket(i, i2, call, eventListener);
            createTunnelRequest = createTunnel(i2, i3, createTunnelRequest, url);
            if (createTunnelRequest == null) {
                return;
            }
            Socket socket = this.rawSocket;
            if (socket != null) {
                Util.closeQuietly(socket);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null);
        }
    }

    private final Request createTunnel(int i, int i2, Request request, HttpUrl httpUrl) throws IOException {
        String str = C0059ao.a(14235) + Util.toHostHeader(httpUrl, true) + C0059ao.a(14236);
        while (true) {
            BufferedSource bufferedSource = this.source;
            yl0.c(bufferedSource);
            BufferedSink bufferedSink = this.sink;
            yl0.c(bufferedSink);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, bufferedSource, bufferedSink);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bufferedSource.timeout().timeout(i, timeUnit);
            bufferedSink.timeout().timeout(i2, timeUnit);
            http1ExchangeCodec.writeRequest(request.headers(), str);
            http1ExchangeCodec.finishRequest();
            Response.Builder readResponseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            yl0.c(readResponseHeaders);
            Response build = readResponseHeaders.request(request).build();
            http1ExchangeCodec.skipConnectBody(build);
            int code = build.code();
            if (code == 200) {
                if (bufferedSource.getBuffer().exhausted() && bufferedSink.getBuffer().exhausted()) {
                    return null;
                }
                throw new IOException(C0059ao.a(14241));
            } else if (code == 407) {
                Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, build);
                if (authenticate != null) {
                    if (bo0.j(C0059ao.a(14238), Response.header$default(build, C0059ao.a(14237), null, 2, null), true)) {
                        return authenticate;
                    }
                    request = authenticate;
                } else {
                    throw new IOException(C0059ao.a(14239));
                }
            } else {
                throw new IOException(C0059ao.a(14240) + build.code());
            }
        }
    }

    private final Request createTunnelRequest() throws IOException {
        Request build = new Request.Builder().url(this.route.address().url()).method(C0059ao.a(14242), null).header(C0059ao.a(14243), Util.toHostHeader(this.route.address().url(), true)).header(C0059ao.a(14244), C0059ao.a(14245)).header(C0059ao.a(14246), C0059ao.a(14247)).build();
        Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(build).protocol(Protocol.HTTP_1_1).code(407).message(C0059ao.a(14248)).body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header(C0059ao.a(14249), C0059ao.a(14250)).build());
        return authenticate != null ? authenticate : build;
    }

    private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i, Call call, EventListener eventListener) throws IOException {
        if (this.route.address().sslSocketFactory() == null) {
            List<Protocol> protocols = this.route.address().protocols();
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (protocols.contains(protocol)) {
                this.socket = this.rawSocket;
                this.protocol = protocol;
                startHttp2(i);
                return;
            }
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
            return;
        }
        eventListener.secureConnectStart(call);
        connectTls(connectionSpecSelector);
        eventListener.secureConnectEnd(call, this.handshake);
        if (this.protocol == Protocol.HTTP_2) {
            startHttp2(i);
        }
    }

    private final boolean routeMatchesAny(List<Route> list) {
        boolean z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Route route : list) {
                if (route.proxy().type() == Proxy.Type.DIRECT && this.route.proxy().type() == Proxy.Type.DIRECT && yl0.a(this.route.socketAddress(), route.socketAddress())) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void startHttp2(int i) throws IOException {
        Socket socket = this.socket;
        yl0.c(socket);
        BufferedSource bufferedSource = this.source;
        yl0.c(bufferedSource);
        BufferedSink bufferedSink = this.sink;
        yl0.c(bufferedSink);
        socket.setSoTimeout(0);
        Http2Connection build = new Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket, this.route.address().url().host(), bufferedSource, bufferedSink).listener(this).pingIntervalMillis(i).build();
        this.http2Connection = build;
        this.allocationLimit = Http2Connection.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(build, false, null, 3, null);
    }

    private final boolean supportsUrl(HttpUrl httpUrl) {
        Handshake handshake;
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(14251));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(14252));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(14253));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        HttpUrl url = this.route.address().url();
        if (httpUrl.port() != url.port()) {
            return false;
        }
        if (yl0.a(httpUrl.host(), url.host())) {
            return true;
        }
        if (this.noCoalescedConnections || (handshake = this.handshake) == null) {
            return false;
        }
        yl0.c(handshake);
        return certificateSupportHost(httpUrl, handshake);
    }

    public final void cancel() {
        Socket socket = this.rawSocket;
        if (socket != null) {
            Util.closeQuietly(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb A[Catch: IOException -> 0x011b, TRY_LEAVE, TryCatch #2 {IOException -> 0x011b, blocks: (B:21:0x00b3, B:23:0x00bb), top: B:70:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016a A[EDGE_INSN: B:74:0x016a->B:61:0x016a ?: BREAK  ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void connect(int r18, int r19, int r20, int r21, boolean r22, okhttp3.Call r23, okhttp3.EventListener r24) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connect(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    public final void connectFailed$okhttp(OkHttpClient okHttpClient, Route route, IOException iOException) {
        yl0.e(okHttpClient, C0059ao.a(14262));
        yl0.e(route, C0059ao.a(14263));
        yl0.e(iOException, C0059ao.a(14264));
        if (route.proxy().type() != Proxy.Type.DIRECT) {
            Address address = route.address();
            address.proxySelector().connectFailed(address.url().uri(), route.proxy().address(), iOException);
        }
        okHttpClient.getRouteDatabase().failed(route);
    }

    public final List<Reference<RealCall>> getCalls() {
        return this.calls;
    }

    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNs() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }

    @Override // okhttp3.Connection
    public Handshake handshake() {
        return this.handshake;
    }

    public final synchronized void incrementSuccessCount$okhttp() {
        this.successCount++;
    }

    public final boolean isEligible$okhttp(Address address, List<Route> list) {
        yl0.e(address, C0059ao.a(14265));
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(14266));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(14267));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(14268));
            sb.append(this);
            throw new AssertionError(sb.toString());
        } else if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(address)) {
            return false;
        } else {
            if (yl0.a(address.url().host(), route().address().url().host())) {
                return true;
            }
            if (this.http2Connection != null && list != null && routeMatchesAny(list) && address.hostnameVerifier() == OkHostnameVerifier.INSTANCE && supportsUrl(address.url())) {
                try {
                    CertificatePinner certificatePinner = address.certificatePinner();
                    yl0.c(certificatePinner);
                    String host = address.url().host();
                    Handshake handshake = handshake();
                    yl0.c(handshake);
                    certificatePinner.check(host, handshake.peerCertificates());
                    return true;
                } catch (SSLPeerUnverifiedException unused) {
                    return false;
                }
            }
            return false;
        }
    }

    public final boolean isHealthy(boolean z) {
        long j;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(14269));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(14270));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(14271));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.rawSocket;
        yl0.c(socket);
        Socket socket2 = this.socket;
        yl0.c(socket2);
        BufferedSource bufferedSource = this.source;
        yl0.c(bufferedSource);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return http2Connection.isHealthy(nanoTime);
        }
        synchronized (this) {
            j = nanoTime - this.idleAtNs;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        return Util.isHealthy(socket2, bufferedSource);
    }

    public final boolean isMultiplexed$okhttp() {
        return this.http2Connection != null;
    }

    public final ExchangeCodec newCodec$okhttp(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) throws SocketException {
        yl0.e(okHttpClient, C0059ao.a(14272));
        yl0.e(realInterceptorChain, C0059ao.a(14273));
        Socket socket = this.socket;
        yl0.c(socket);
        BufferedSource bufferedSource = this.source;
        yl0.c(bufferedSource);
        BufferedSink bufferedSink = this.sink;
        yl0.c(bufferedSink);
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection);
        }
        socket.setSoTimeout(realInterceptorChain.readTimeoutMillis());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bufferedSource.timeout().timeout(realInterceptorChain.getReadTimeoutMillis$okhttp(), timeUnit);
        bufferedSink.timeout().timeout(realInterceptorChain.getWriteTimeoutMillis$okhttp(), timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, bufferedSource, bufferedSink);
    }

    public final RealWebSocket.Streams newWebSocketStreams$okhttp(final Exchange exchange) throws SocketException {
        yl0.e(exchange, C0059ao.a(14274));
        Socket socket = this.socket;
        yl0.c(socket);
        final BufferedSource bufferedSource = this.source;
        yl0.c(bufferedSource);
        final BufferedSink bufferedSink = this.sink;
        yl0.c(bufferedSink);
        socket.setSoTimeout(0);
        noNewExchanges$okhttp();
        return new RealWebSocket.Streams(true, bufferedSource, bufferedSink) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                Exchange.this.bodyComplete(-1L, true, true, null);
            }
        };
    }

    public final synchronized void noCoalescedConnections$okhttp() {
        this.noCoalescedConnections = true;
    }

    public final synchronized void noNewExchanges$okhttp() {
        this.noNewExchanges = true;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public synchronized void onSettings(Http2Connection http2Connection, Settings settings) {
        yl0.e(http2Connection, C0059ao.a(14275));
        yl0.e(settings, C0059ao.a(14276));
        this.allocationLimit = settings.getMaxConcurrentStreams();
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(Http2Stream http2Stream) throws IOException {
        yl0.e(http2Stream, C0059ao.a(14277));
        http2Stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.Connection
    public Protocol protocol() {
        Protocol protocol = this.protocol;
        yl0.c(protocol);
        return protocol;
    }

    @Override // okhttp3.Connection
    public Route route() {
        return this.route;
    }

    public final void setIdleAtNs(long j) {
        this.idleAtNs = j;
    }

    public final void setNoNewExchanges(boolean z) {
        this.noNewExchanges = z;
    }

    public final void setRouteFailureCount$okhttp(int i) {
        this.routeFailureCount = i;
    }

    @Override // okhttp3.Connection
    public Socket socket() {
        Socket socket = this.socket;
        yl0.c(socket);
        return socket;
    }

    public String toString() {
        Object a;
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(14278));
        sb.append(this.route.address().url().host());
        sb.append(':');
        sb.append(this.route.address().url().port());
        sb.append(',');
        sb.append(C0059ao.a(14279));
        sb.append(this.route.proxy());
        sb.append(C0059ao.a(14280));
        sb.append(this.route.socketAddress());
        sb.append(C0059ao.a(14281));
        Handshake handshake = this.handshake;
        if (handshake == null || (a = handshake.cipherSuite()) == null) {
            a = C0059ao.a(14282);
        }
        sb.append(a);
        sb.append(C0059ao.a(14283));
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public final synchronized void trackFailure$okhttp(RealCall realCall, IOException iOException) {
        yl0.e(realCall, C0059ao.a(14284));
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                int i = this.refusedStreamCount + 1;
                this.refusedStreamCount = i;
                if (i > 1) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !realCall.isCanceled()) {
                this.noNewExchanges = true;
                this.routeFailureCount++;
            }
        } else if (!isMultiplexed$okhttp() || (iOException instanceof ConnectionShutdownException)) {
            this.noNewExchanges = true;
            if (this.successCount == 0) {
                if (iOException != null) {
                    connectFailed$okhttp(realCall.getClient(), this.route, iOException);
                }
                this.routeFailureCount++;
            }
        }
    }
}
