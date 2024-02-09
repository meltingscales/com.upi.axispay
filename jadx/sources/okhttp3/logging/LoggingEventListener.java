package okhttp3.logging;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class LoggingEventListener extends EventListener {
    private final HttpLoggingInterceptor.Logger logger;
    private long startNs;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class Factory implements EventListener.Factory {
        private final HttpLoggingInterceptor.Logger logger;

        public Factory() {
            this(null, 1, null);
        }

        public Factory(HttpLoggingInterceptor.Logger logger) {
            yl0.e(logger, C0059ao.a(12906));
            this.logger = logger;
        }

        @Override // okhttp3.EventListener.Factory
        public EventListener create(Call call) {
            yl0.e(call, C0059ao.a(12907));
            return new LoggingEventListener(this.logger, null);
        }

        public /* synthetic */ Factory(HttpLoggingInterceptor.Logger logger, int i, vl0 vl0Var) {
            this((i & 1) != 0 ? HttpLoggingInterceptor.Logger.DEFAULT : logger);
        }
    }

    public /* synthetic */ LoggingEventListener(HttpLoggingInterceptor.Logger logger, vl0 vl0Var) {
        this(logger);
    }

    private final void logWithTime(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs);
        HttpLoggingInterceptor.Logger logger = this.logger;
        logger.log('[' + millis + C0059ao.a(4977) + str);
    }

    @Override // okhttp3.EventListener
    public void cacheConditionalHit(Call call, Response response) {
        yl0.e(call, C0059ao.a(4978));
        yl0.e(response, C0059ao.a(4979));
        logWithTime(C0059ao.a(4980) + response);
    }

    @Override // okhttp3.EventListener
    public void cacheHit(Call call, Response response) {
        yl0.e(call, C0059ao.a(4981));
        yl0.e(response, C0059ao.a(4982));
        logWithTime(C0059ao.a(4983) + response);
    }

    @Override // okhttp3.EventListener
    public void cacheMiss(Call call) {
        yl0.e(call, C0059ao.a(4984));
        logWithTime(C0059ao.a(4985));
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        yl0.e(call, C0059ao.a(4986));
        logWithTime(C0059ao.a(4987));
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
        yl0.e(call, C0059ao.a(4988));
        yl0.e(iOException, C0059ao.a(4989));
        logWithTime(C0059ao.a(4990) + iOException);
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        yl0.e(call, C0059ao.a(4991));
        this.startNs = System.nanoTime();
        logWithTime(C0059ao.a(4992) + call.request());
    }

    @Override // okhttp3.EventListener
    public void canceled(Call call) {
        yl0.e(call, C0059ao.a(4993));
        logWithTime(C0059ao.a(4994));
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        yl0.e(call, C0059ao.a(4995));
        yl0.e(inetSocketAddress, C0059ao.a(4996));
        yl0.e(proxy, C0059ao.a(4997));
        logWithTime(C0059ao.a(4998) + protocol);
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        yl0.e(call, C0059ao.a(4999));
        yl0.e(inetSocketAddress, C0059ao.a(5000));
        yl0.e(proxy, C0059ao.a(5001));
        yl0.e(iOException, C0059ao.a(5002));
        logWithTime(C0059ao.a(5003) + protocol + ' ' + iOException);
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        yl0.e(call, C0059ao.a(5004));
        yl0.e(inetSocketAddress, C0059ao.a(5005));
        yl0.e(proxy, C0059ao.a(5006));
        logWithTime(C0059ao.a(5007) + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        yl0.e(call, C0059ao.a(5008));
        yl0.e(connection, C0059ao.a(5009));
        logWithTime(C0059ao.a(5010) + connection);
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        yl0.e(call, C0059ao.a(5011));
        yl0.e(connection, C0059ao.a(5012));
        logWithTime(C0059ao.a(5013));
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<? extends InetAddress> list) {
        yl0.e(call, C0059ao.a(5014));
        yl0.e(str, C0059ao.a(5015));
        yl0.e(list, C0059ao.a(5016));
        logWithTime(C0059ao.a(5017) + list);
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
        yl0.e(call, C0059ao.a(5018));
        yl0.e(str, C0059ao.a(5019));
        logWithTime(C0059ao.a(5020) + str);
    }

    @Override // okhttp3.EventListener
    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<? extends Proxy> list) {
        yl0.e(call, C0059ao.a(5021));
        yl0.e(httpUrl, C0059ao.a(5022));
        yl0.e(list, C0059ao.a(5023));
        logWithTime(C0059ao.a(5024) + list);
    }

    @Override // okhttp3.EventListener
    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        yl0.e(call, C0059ao.a(5025));
        yl0.e(httpUrl, C0059ao.a(5026));
        logWithTime(C0059ao.a(5027) + httpUrl);
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j) {
        yl0.e(call, C0059ao.a(5028));
        logWithTime(C0059ao.a(5029) + j);
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        yl0.e(call, C0059ao.a(5030));
        logWithTime(C0059ao.a(5031));
    }

    @Override // okhttp3.EventListener
    public void requestFailed(Call call, IOException iOException) {
        yl0.e(call, C0059ao.a(5032));
        yl0.e(iOException, C0059ao.a(5033));
        logWithTime(C0059ao.a(5034) + iOException);
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        yl0.e(call, C0059ao.a(5035));
        yl0.e(request, C0059ao.a(5036));
        logWithTime(C0059ao.a(5037));
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        yl0.e(call, C0059ao.a(5038));
        logWithTime(C0059ao.a(5039));
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j) {
        yl0.e(call, C0059ao.a(5040));
        logWithTime(C0059ao.a(5041) + j);
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        yl0.e(call, C0059ao.a(5042));
        logWithTime(C0059ao.a(5043));
    }

    @Override // okhttp3.EventListener
    public void responseFailed(Call call, IOException iOException) {
        yl0.e(call, C0059ao.a(5044));
        yl0.e(iOException, C0059ao.a(5045));
        logWithTime(C0059ao.a(5046) + iOException);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        yl0.e(call, C0059ao.a(5047));
        yl0.e(response, C0059ao.a(5048));
        logWithTime(C0059ao.a(5049) + response);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        yl0.e(call, C0059ao.a(5050));
        logWithTime(C0059ao.a(5051));
    }

    @Override // okhttp3.EventListener
    public void satisfactionFailure(Call call, Response response) {
        yl0.e(call, C0059ao.a(5052));
        yl0.e(response, C0059ao.a(5053));
        logWithTime(C0059ao.a(5054) + response);
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        yl0.e(call, C0059ao.a(5055));
        logWithTime(C0059ao.a(5056) + handshake);
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        yl0.e(call, C0059ao.a(5057));
        logWithTime(C0059ao.a(5058));
    }

    private LoggingEventListener(HttpLoggingInterceptor.Logger logger) {
        this.logger = logger;
    }
}
