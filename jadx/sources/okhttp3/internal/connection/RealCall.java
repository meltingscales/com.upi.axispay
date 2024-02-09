package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import myunmn.C0059ao;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.platform.Platform;
import okio.AsyncTimeout;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class RealCall implements Call {
    private Object callStackTrace;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private volatile RealConnection connectionToCancel;
    private final EventListener eventListener;
    private volatile Exchange exchange;
    private ExchangeFinder exchangeFinder;
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    private Exchange interceptorScopedExchange;
    private final Request originalRequest;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private final RealCall$timeout$1 timeout;
    private boolean timeoutEarlyExit;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class AsyncCall implements Runnable {
        private volatile AtomicInteger callsPerHost;
        private final Callback responseCallback;
        public final /* synthetic */ RealCall this$0;

        public AsyncCall(RealCall realCall, Callback callback) {
            yl0.e(callback, C0059ao.a(6719));
            this.this$0 = realCall;
            this.responseCallback = callback;
            this.callsPerHost = new AtomicInteger(0);
        }

        public final void executeOn(ExecutorService executorService) {
            yl0.e(executorService, C0059ao.a(6720));
            Dispatcher dispatcher = this.this$0.getClient().dispatcher();
            if (Util.assertionsEnabled && Thread.holdsLock(dispatcher)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0059ao.a(6721));
                Thread currentThread = Thread.currentThread();
                yl0.d(currentThread, C0059ao.a(6722));
                sb.append(currentThread.getName());
                sb.append(C0059ao.a(6723));
                sb.append(dispatcher);
                throw new AssertionError(sb.toString());
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException(C0059ao.a(6724));
                    interruptedIOException.initCause(e);
                    this.this$0.noMoreExchanges$okhttp(interruptedIOException);
                    this.responseCallback.onFailure(this.this$0, interruptedIOException);
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                }
            } catch (Throwable th) {
                this.this$0.getClient().dispatcher().finished$okhttp(this);
                throw th;
            }
        }

        public final RealCall getCall() {
            return this.this$0;
        }

        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final String getHost() {
            return this.this$0.getOriginalRequest().url().host();
        }

        public final Request getRequest() {
            return this.this$0.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(AsyncCall asyncCall) {
            yl0.e(asyncCall, C0059ao.a(6725));
            this.callsPerHost = asyncCall.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            Throwable th;
            IOException e;
            Dispatcher dispatcher;
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(6727));
            String name = currentThread.getName();
            currentThread.setName(C0059ao.a(6726) + this.this$0.redactedUrl$okhttp());
            try {
                enter();
                try {
                    z = true;
                } catch (IOException e2) {
                    z = false;
                    e = e2;
                } catch (Throwable th2) {
                    z = false;
                    th = th2;
                }
                try {
                    this.responseCallback.onResponse(this.this$0, this.this$0.getResponseWithInterceptorChain$okhttp());
                    dispatcher = this.this$0.getClient().dispatcher();
                } catch (IOException e3) {
                    e = e3;
                    if (z) {
                        Platform.Companion.get().log(C0059ao.a(6729) + this.this$0.toLoggableString(), 4, e);
                    } else {
                        this.responseCallback.onFailure(this.this$0, e);
                    }
                    dispatcher = this.this$0.getClient().dispatcher();
                    dispatcher.finished$okhttp(this);
                } catch (Throwable th3) {
                    th = th3;
                    this.this$0.cancel();
                    if (!z) {
                        IOException iOException = new IOException(C0059ao.a(6728) + th);
                        xh0.a(iOException, th);
                        this.responseCallback.onFailure(this.this$0, iOException);
                    }
                    throw th;
                }
                dispatcher.finished$okhttp(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class CallReference extends WeakReference<RealCall> {
        private final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            yl0.e(realCall, C0059ao.a(2799));
            this.callStackTrace = obj;
        }

        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [okio.Timeout, okhttp3.internal.connection.RealCall$timeout$1] */
    public RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        yl0.e(okHttpClient, C0059ao.a(12101));
        yl0.e(request, C0059ao.a(12102));
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.connectionPool = okHttpClient.connectionPool().getDelegate$okhttp();
        this.eventListener = okHttpClient.eventListenerFactory().create(this);
        ?? r4 = new AsyncTimeout() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // okio.AsyncTimeout
            public void timedOut() {
                RealCall.this.cancel();
            }
        };
        r4.timeout(okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        pi0 pi0Var = pi0.a;
        this.timeout = r4;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
    }

    private final <E extends IOException> E callDone(E e) {
        Socket releaseConnectionNoEvents$okhttp;
        boolean z = Util.assertionsEnabled;
        if (z && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(12103));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(12104));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(12105));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            if (z && Thread.holdsLock(realConnection)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C0059ao.a(12106));
                Thread currentThread2 = Thread.currentThread();
                yl0.d(currentThread2, C0059ao.a(12107));
                sb2.append(currentThread2.getName());
                sb2.append(C0059ao.a(12108));
                sb2.append(realConnection);
                throw new AssertionError(sb2.toString());
            }
            synchronized (realConnection) {
                releaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
            }
            if (this.connection == null) {
                if (releaseConnectionNoEvents$okhttp != null) {
                    Util.closeQuietly(releaseConnectionNoEvents$okhttp);
                }
                this.eventListener.connectionReleased(this, realConnection);
            } else {
                if (!(releaseConnectionNoEvents$okhttp == null)) {
                    throw new IllegalStateException(C0059ao.a(12109).toString());
                }
            }
        }
        E e2 = (E) timeoutExit(e);
        if (e != null) {
            EventListener eventListener = this.eventListener;
            yl0.c(e2);
            eventListener.callFailed(this, e2);
        } else {
            this.eventListener.callEnd(this);
        }
        return e2;
    }

    private final void callStart() {
        this.callStackTrace = Platform.Companion.get().getStackTraceForCloseable(C0059ao.a(12110));
        this.eventListener.callStart(this);
    }

    private final Address createAddress(HttpUrl httpUrl) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (httpUrl.isHttps()) {
            SSLSocketFactory sslSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            sSLSocketFactory = sslSocketFactory;
            certificatePinner = this.client.certificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    private final <E extends IOException> E timeoutExit(E e) {
        if (!this.timeoutEarlyExit && exit()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException(C0059ao.a(12111));
            if (e != null) {
                interruptedIOException.initCause(e);
            }
            return interruptedIOException;
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toLoggableString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? C0059ao.a(12112) : C0059ao.a(12113));
        sb.append(this.forWebSocket ? C0059ao.a(12114) : C0059ao.a(12115));
        sb.append(C0059ao.a(12116));
        sb.append(redactedUrl$okhttp());
        return sb.toString();
    }

    public final void acquireConnectionNoEvents(RealConnection realConnection) {
        yl0.e(realConnection, C0059ao.a(12117));
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(12118));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(12119));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(12120));
            sb.append(realConnection);
            throw new AssertionError(sb.toString());
        }
        if (this.connection == null) {
            this.connection = realConnection;
            realConnection.getCalls().add(new CallReference(this, this.callStackTrace));
            return;
        }
        throw new IllegalStateException(C0059ao.a(12121).toString());
    }

    @Override // okhttp3.Call
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            exchange.cancel();
        }
        RealConnection realConnection = this.connectionToCancel;
        if (realConnection != null) {
            realConnection.cancel();
        }
        this.eventListener.canceled(this);
    }

    @Override // okhttp3.Call
    public void enqueue(Callback callback) {
        yl0.e(callback, C0059ao.a(12122));
        if (this.executed.compareAndSet(false, true)) {
            callStart();
            this.client.dispatcher().enqueue$okhttp(new AsyncCall(this, callback));
            return;
        }
        throw new IllegalStateException(C0059ao.a(12123).toString());
    }

    public final void enterNetworkInterceptorExchange(Request request, boolean z) {
        yl0.e(request, C0059ao.a(12124));
        if (this.interceptorScopedExchange == null) {
            synchronized (this) {
                if (!this.responseBodyOpen) {
                    if (!this.requestBodyOpen) {
                        pi0 pi0Var = pi0.a;
                    } else {
                        throw new IllegalStateException(C0059ao.a(12125).toString());
                    }
                } else {
                    throw new IllegalStateException(C0059ao.a(12126).toString());
                }
            }
            if (z) {
                this.exchangeFinder = new ExchangeFinder(this.connectionPool, createAddress(request.url()), this, this.eventListener);
                return;
            }
            return;
        }
        throw new IllegalStateException(C0059ao.a(12127).toString());
    }

    @Override // okhttp3.Call
    public Response execute() {
        if (this.executed.compareAndSet(false, true)) {
            enter();
            callStart();
            try {
                this.client.dispatcher().executed$okhttp(this);
                return getResponseWithInterceptorChain$okhttp();
            } finally {
                this.client.dispatcher().finished$okhttp(this);
            }
        }
        throw new IllegalStateException(C0059ao.a(12128).toString());
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean z) {
        Exchange exchange;
        synchronized (this) {
            if (this.expectMoreExchanges) {
                pi0 pi0Var = pi0.a;
            } else {
                throw new IllegalStateException(C0059ao.a(12129).toString());
            }
        }
        if (z && (exchange = this.exchange) != null) {
            exchange.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }

    public final OkHttpClient getClient() {
        return this.client;
    }

    public final RealConnection getConnection() {
        return this.connection;
    }

    public final RealConnection getConnectionToCancel() {
        return this.connectionToCancel;
    }

    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    public final Exchange getInterceptorScopedExchange$okhttp() {
        return this.interceptorScopedExchange;
    }

    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response getResponseWithInterceptorChain$okhttp() throws java.io.IOException {
        /*
            r12 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            okhttp3.OkHttpClient r1 = r12.client
            java.util.List r1 = r1.interceptors()
            defpackage.fj0.q(r3, r1)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r1 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r2 = r12.client
            r1.<init>(r2)
            r3.add(r1)
            okhttp3.internal.http.BridgeInterceptor r1 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r2 = r12.client
            okhttp3.CookieJar r2 = r2.cookieJar()
            r1.<init>(r2)
            r3.add(r1)
            okhttp3.internal.cache.CacheInterceptor r1 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r2 = r12.client
            okhttp3.Cache r2 = r2.cache()
            r1.<init>(r2)
            r3.add(r1)
            okhttp3.internal.connection.ConnectInterceptor r1 = okhttp3.internal.connection.ConnectInterceptor.INSTANCE
            r3.add(r1)
            boolean r1 = r12.forWebSocket
            if (r1 != 0) goto L46
            okhttp3.OkHttpClient r1 = r12.client
            java.util.List r1 = r1.networkInterceptors()
            defpackage.fj0.q(r3, r1)
        L46:
            okhttp3.internal.http.CallServerInterceptor r1 = new okhttp3.internal.http.CallServerInterceptor
            boolean r2 = r12.forWebSocket
            r1.<init>(r2)
            r3.add(r1)
            okhttp3.internal.http.RealInterceptorChain r10 = new okhttp3.internal.http.RealInterceptorChain
            r4 = 0
            r5 = 0
            okhttp3.Request r6 = r12.originalRequest
            okhttp3.OkHttpClient r1 = r12.client
            int r7 = r1.connectTimeoutMillis()
            okhttp3.OkHttpClient r1 = r12.client
            int r8 = r1.readTimeoutMillis()
            okhttp3.OkHttpClient r1 = r12.client
            int r9 = r1.writeTimeoutMillis()
            r1 = r10
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 0
            r2 = 0
            okhttp3.Request r3 = r12.originalRequest     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L91
            okhttp3.Response r3 = r10.proceed(r3)     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L91
            boolean r4 = r12.isCanceled()     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L91
            if (r4 != 0) goto L7f
            r12.noMoreExchanges$okhttp(r2)
            return r3
        L7f:
            okhttp3.internal.Util.closeQuietly(r3)     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L91
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L91
            r0 = 12130(0x2f62, float:1.6998E-41)
            java.lang.String r4 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L91
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L91
            throw r3     // Catch: java.lang.Throwable -> L8f java.io.IOException -> L91
        L8f:
            r3 = move-exception
            goto Lab
        L91:
            r1 = move-exception
            r3 = 1
            java.io.IOException r1 = r12.noMoreExchanges$okhttp(r1)     // Catch: java.lang.Throwable -> La7
            if (r1 != 0) goto La6
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> La7
            r0 = 12131(0x2f63, float:1.6999E-41)
            java.lang.String r4 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> La7
            r1.<init>(r4)     // Catch: java.lang.Throwable -> La7
            throw r1     // Catch: java.lang.Throwable -> La7
        La6:
            throw r1     // Catch: java.lang.Throwable -> La7
        La7:
            r1 = move-exception
            r11 = r3
            r3 = r1
            r1 = r11
        Lab:
            if (r1 != 0) goto Lb0
            r12.noMoreExchanges$okhttp(r2)
        Lb0:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.getResponseWithInterceptorChain$okhttp():okhttp3.Response");
    }

    public final Exchange initExchange$okhttp(RealInterceptorChain realInterceptorChain) {
        yl0.e(realInterceptorChain, C0059ao.a(12132));
        synchronized (this) {
            if (this.expectMoreExchanges) {
                if (!this.responseBodyOpen) {
                    if (!this.requestBodyOpen) {
                        pi0 pi0Var = pi0.a;
                    } else {
                        throw new IllegalStateException(C0059ao.a(12134).toString());
                    }
                } else {
                    throw new IllegalStateException(C0059ao.a(12135).toString());
                }
            } else {
                throw new IllegalStateException(C0059ao.a(12136).toString());
            }
        }
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        yl0.c(exchangeFinder);
        Exchange exchange = new Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.find(this.client, realInterceptorChain));
        this.interceptorScopedExchange = exchange;
        this.exchange = exchange;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (this.canceled) {
            throw new IOException(C0059ao.a(12133));
        }
        return exchange;
    }

    @Override // okhttp3.Call
    public boolean isCanceled() {
        return this.canceled;
    }

    @Override // okhttp3.Call
    public boolean isExecuted() {
        return this.executed.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:8:0x0019, B:17:0x0028, B:19:0x002c, B:20:0x002e, B:22:0x0032, B:27:0x003b, B:29:0x003f, B:35:0x0048, B:14:0x0022), top: B:47:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:8:0x0019, B:17:0x0028, B:19:0x002c, B:20:0x002e, B:22:0x0032, B:27:0x003b, B:29:0x003f, B:35:0x0048, B:14:0x0022), top: B:47:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends java.io.IOException> E messageDone$okhttp(okhttp3.internal.connection.Exchange r4, boolean r5, boolean r6, E r7) {
        /*
            r3 = this;
            r0 = 12137(0x2f69, float:1.7008E-41)
            java.lang.String r1 = myunmn.C0059ao.a(r0)
            defpackage.yl0.e(r4, r1)
            okhttp3.internal.connection.Exchange r1 = r3.exchange
            boolean r4 = defpackage.yl0.a(r4, r1)
            r1 = 1
            r4 = r4 ^ r1
            if (r4 == 0) goto L15
            return r7
        L15:
            monitor-enter(r3)
            r4 = 0
            if (r5 == 0) goto L20
            boolean r2 = r3.requestBodyOpen     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L26
            goto L20
        L1e:
            r4 = move-exception
            goto L5f
        L20:
            if (r6 == 0) goto L47
            boolean r2 = r3.responseBodyOpen     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L47
        L26:
            if (r5 == 0) goto L2a
            r3.requestBodyOpen = r4     // Catch: java.lang.Throwable -> L1e
        L2a:
            if (r6 == 0) goto L2e
            r3.responseBodyOpen = r4     // Catch: java.lang.Throwable -> L1e
        L2e:
            boolean r5 = r3.requestBodyOpen     // Catch: java.lang.Throwable -> L1e
            if (r5 != 0) goto L38
            boolean r6 = r3.responseBodyOpen     // Catch: java.lang.Throwable -> L1e
            if (r6 != 0) goto L38
            r6 = r1
            goto L39
        L38:
            r6 = r4
        L39:
            if (r5 != 0) goto L44
            boolean r5 = r3.responseBodyOpen     // Catch: java.lang.Throwable -> L1e
            if (r5 != 0) goto L44
            boolean r5 = r3.expectMoreExchanges     // Catch: java.lang.Throwable -> L1e
            if (r5 != 0) goto L44
            goto L45
        L44:
            r1 = r4
        L45:
            r4 = r6
            goto L48
        L47:
            r1 = r4
        L48:
            pi0 r5 = defpackage.pi0.a     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r3)
            if (r4 == 0) goto L57
            r4 = 0
            r3.exchange = r4
            okhttp3.internal.connection.RealConnection r4 = r3.connection
            if (r4 == 0) goto L57
            r4.incrementSuccessCount$okhttp()
        L57:
            if (r1 == 0) goto L5e
            java.io.IOException r4 = r3.callDone(r7)
            return r4
        L5e:
            return r7
        L5f:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.messageDone$okhttp(okhttp3.internal.connection.Exchange, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException noMoreExchanges$okhttp(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.expectMoreExchanges) {
                this.expectMoreExchanges = false;
                if (!this.requestBodyOpen && !this.responseBodyOpen) {
                    z = true;
                }
            }
            pi0 pi0Var = pi0.a;
        }
        return z ? callDone(iOException) : iOException;
    }

    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnection realConnection = this.connection;
        yl0.c(realConnection);
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(12138));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(12139));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(12140));
            sb.append(realConnection);
            throw new AssertionError(sb.toString());
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        Iterator<Reference<RealCall>> it = calls.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (yl0.a(it.next().get(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            calls.remove(i);
            this.connection = null;
            if (calls.isEmpty()) {
                realConnection.setIdleAtNs(System.nanoTime());
                if (this.connectionPool.connectionBecameIdle(realConnection)) {
                    return realConnection.socket();
                }
            }
            return null;
        }
        throw new IllegalStateException(C0059ao.a(12141).toString());
    }

    @Override // okhttp3.Call
    public Request request() {
        return this.originalRequest;
    }

    public final boolean retryAfterFailure() {
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        yl0.c(exchangeFinder);
        return exchangeFinder.retryAfterFailure();
    }

    public final void setConnectionToCancel(RealConnection realConnection) {
        this.connectionToCancel = realConnection;
    }

    public final void timeoutEarlyExit() {
        if (!this.timeoutEarlyExit) {
            this.timeoutEarlyExit = true;
            exit();
            return;
        }
        throw new IllegalStateException(C0059ao.a(12142).toString());
    }

    @Override // okhttp3.Call
    public AsyncTimeout timeout() {
        return this.timeout;
    }

    @Override // okhttp3.Call
    public RealCall clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }
}
