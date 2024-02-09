package okhttp3.internal.http;

import com.google.android.gms.common.api.Api;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import myunmn.C0059ao;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    public static final Companion Companion;
    private static final int MAX_FOLLOW_UPS = 0;
    private final OkHttpClient client;

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
        C0059ao.a(RetryAndFollowUpInterceptor.class, 400);
        Companion = new Companion(null);
    }

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        yl0.e(okHttpClient, C0059ao.a(2607));
        this.client = okHttpClient;
    }

    private final Request buildRedirectRequest(Response response, String str) {
        String header$default;
        HttpUrl resolve;
        if (!this.client.followRedirects() || (header$default = Response.header$default(response, C0059ao.a(2608), null, 2, null)) == null || (resolve = response.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (yl0.a(resolve.scheme(), response.request().url().scheme()) || this.client.followSslRedirects()) {
            Request.Builder newBuilder = response.request().newBuilder();
            if (HttpMethod.permitsRequestBody(str)) {
                int code = response.code();
                HttpMethod httpMethod = HttpMethod.INSTANCE;
                boolean z = httpMethod.redirectsWithBody(str) || code == 308 || code == 307;
                if (httpMethod.redirectsToGet(str) && code != 308 && code != 307) {
                    newBuilder.method(C0059ao.a(2609), null);
                } else {
                    newBuilder.method(str, z ? response.request().body() : null);
                }
                if (!z) {
                    newBuilder.removeHeader(C0059ao.a(2610));
                    newBuilder.removeHeader(C0059ao.a(2611));
                    newBuilder.removeHeader(C0059ao.a(2612));
                }
            }
            if (!Util.canReuseConnectionFor(response.request().url(), resolve)) {
                newBuilder.removeHeader(C0059ao.a(2613));
            }
            return newBuilder.url(resolve).build();
        }
        return null;
    }

    private final Request followUpRequest(Response response, Exchange exchange) throws IOException {
        RealConnection connection$okhttp;
        Route route = (exchange == null || (connection$okhttp = exchange.getConnection$okhttp()) == null) ? null : connection$okhttp.route();
        int code = response.code();
        String method = response.request().method();
        if (code != 307 && code != 308) {
            if (code != 401) {
                if (code == 421) {
                    RequestBody body = response.request().body();
                    if ((body == null || !body.isOneShot()) && exchange != null && exchange.isCoalescedConnection$okhttp()) {
                        exchange.getConnection$okhttp().noCoalescedConnections$okhttp();
                        return response.request();
                    }
                    return null;
                } else if (code == 503) {
                    Response priorResponse = response.priorResponse();
                    if ((priorResponse == null || priorResponse.code() != 503) && retryAfter(response, Api.BaseClientBuilder.API_PRIORITY_OTHER) == 0) {
                        return response.request();
                    }
                    return null;
                } else if (code == 407) {
                    yl0.c(route);
                    if (route.proxy().type() == Proxy.Type.HTTP) {
                        return this.client.proxyAuthenticator().authenticate(route, response);
                    }
                    throw new ProtocolException(C0059ao.a(2614));
                } else if (code == 408) {
                    if (this.client.retryOnConnectionFailure()) {
                        RequestBody body2 = response.request().body();
                        if (body2 == null || !body2.isOneShot()) {
                            Response priorResponse2 = response.priorResponse();
                            if ((priorResponse2 == null || priorResponse2.code() != 408) && retryAfter(response, 0) <= 0) {
                                return response.request();
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                } else {
                    switch (code) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                }
            } else {
                return this.client.authenticator().authenticate(route, response);
            }
        }
        return buildRedirectRequest(response, method);
    }

    private final boolean isRecoverable(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean recover(IOException iOException, RealCall realCall, Request request, boolean z) {
        if (this.client.retryOnConnectionFailure()) {
            return !(z && requestIsOneShot(iOException, request)) && isRecoverable(iOException, z) && realCall.retryAfterFailure();
        }
        return false;
    }

    private final boolean requestIsOneShot(IOException iOException, Request request) {
        RequestBody body = request.body();
        return (body != null && body.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private final int retryAfter(Response response, int i) {
        String header$default = Response.header$default(response, C0059ao.a(2615), null, 2, null);
        if (header$default != null) {
            if (new sn0(C0059ao.a(2616)).a(header$default)) {
                Integer valueOf = Integer.valueOf(header$default);
                yl0.d(valueOf, C0059ao.a(2617));
                return valueOf.intValue();
            }
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return i;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Exchange interceptorScopedExchange$okhttp;
        Request followUpRequest;
        yl0.e(chain, C0059ao.a(2618));
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request$okhttp = realInterceptorChain.getRequest$okhttp();
        RealCall call$okhttp = realInterceptorChain.getCall$okhttp();
        List f = aj0.f();
        Response response = null;
        boolean z = true;
        int i = 0;
        while (true) {
            call$okhttp.enterNetworkInterceptorExchange(request$okhttp, z);
            try {
                if (!call$okhttp.isCanceled()) {
                    try {
                        try {
                            Response proceed = realInterceptorChain.proceed(request$okhttp);
                            if (response != null) {
                                proceed = proceed.newBuilder().priorResponse(response.newBuilder().body(null).build()).build();
                            }
                            response = proceed;
                            interceptorScopedExchange$okhttp = call$okhttp.getInterceptorScopedExchange$okhttp();
                            followUpRequest = followUpRequest(response, interceptorScopedExchange$okhttp);
                        } catch (IOException e) {
                            if (recover(e, call$okhttp, request$okhttp, !(e instanceof ConnectionShutdownException))) {
                                f = ij0.D(f, e);
                                call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                                z = false;
                            } else {
                                throw Util.withSuppressed(e, f);
                            }
                        }
                    } catch (RouteException e2) {
                        if (recover(e2.getLastConnectException(), call$okhttp, request$okhttp, false)) {
                            f = ij0.D(f, e2.getFirstConnectException());
                            call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                            z = false;
                        } else {
                            throw Util.withSuppressed(e2.getFirstConnectException(), f);
                        }
                    }
                    if (followUpRequest == null) {
                        if (interceptorScopedExchange$okhttp != null && interceptorScopedExchange$okhttp.isDuplex$okhttp()) {
                            call$okhttp.timeoutEarlyExit();
                        }
                        call$okhttp.exitNetworkInterceptorExchange$okhttp(false);
                        return response;
                    }
                    RequestBody body = followUpRequest.body();
                    if (body != null && body.isOneShot()) {
                        call$okhttp.exitNetworkInterceptorExchange$okhttp(false);
                        return response;
                    }
                    ResponseBody body2 = response.body();
                    if (body2 != null) {
                        Util.closeQuietly(body2);
                    }
                    i++;
                    if (i <= 20) {
                        call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                        request$okhttp = followUpRequest;
                        z = true;
                    } else {
                        throw new ProtocolException(C0059ao.a(2619) + i);
                    }
                } else {
                    throw new IOException(C0059ao.a(2620));
                }
            } catch (Throwable th) {
                call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                throw th;
            }
        }
    }
}
