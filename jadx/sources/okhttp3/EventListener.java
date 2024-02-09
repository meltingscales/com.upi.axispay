package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
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

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response response) {
        yl0.e(call, C0059ao.a(9178));
        yl0.e(response, C0059ao.a(9179));
    }

    public void cacheHit(Call call, Response response) {
        yl0.e(call, C0059ao.a(9180));
        yl0.e(response, C0059ao.a(9181));
    }

    public void cacheMiss(Call call) {
        yl0.e(call, C0059ao.a(9182));
    }

    public void callEnd(Call call) {
        yl0.e(call, C0059ao.a(9183));
    }

    public void callFailed(Call call, IOException iOException) {
        yl0.e(call, C0059ao.a(9184));
        yl0.e(iOException, C0059ao.a(9185));
    }

    public void callStart(Call call) {
        yl0.e(call, C0059ao.a(9186));
    }

    public void canceled(Call call) {
        yl0.e(call, C0059ao.a(9187));
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        yl0.e(call, C0059ao.a(9188));
        yl0.e(inetSocketAddress, C0059ao.a(9189));
        yl0.e(proxy, C0059ao.a(9190));
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        yl0.e(call, C0059ao.a(9191));
        yl0.e(inetSocketAddress, C0059ao.a(9192));
        yl0.e(proxy, C0059ao.a(9193));
        yl0.e(iOException, C0059ao.a(9194));
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        yl0.e(call, C0059ao.a(9195));
        yl0.e(inetSocketAddress, C0059ao.a(9196));
        yl0.e(proxy, C0059ao.a(9197));
    }

    public void connectionAcquired(Call call, Connection connection) {
        yl0.e(call, C0059ao.a(9198));
        yl0.e(connection, C0059ao.a(9199));
    }

    public void connectionReleased(Call call, Connection connection) {
        yl0.e(call, C0059ao.a(9200));
        yl0.e(connection, C0059ao.a(9201));
    }

    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        yl0.e(call, C0059ao.a(9202));
        yl0.e(str, C0059ao.a(9203));
        yl0.e(list, C0059ao.a(9204));
    }

    public void dnsStart(Call call, String str) {
        yl0.e(call, C0059ao.a(9205));
        yl0.e(str, C0059ao.a(9206));
    }

    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<Proxy> list) {
        yl0.e(call, C0059ao.a(9207));
        yl0.e(httpUrl, C0059ao.a(9208));
        yl0.e(list, C0059ao.a(9209));
    }

    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        yl0.e(call, C0059ao.a(9210));
        yl0.e(httpUrl, C0059ao.a(9211));
    }

    public void requestBodyEnd(Call call, long j) {
        yl0.e(call, C0059ao.a(9212));
    }

    public void requestBodyStart(Call call) {
        yl0.e(call, C0059ao.a(9213));
    }

    public void requestFailed(Call call, IOException iOException) {
        yl0.e(call, C0059ao.a(9214));
        yl0.e(iOException, C0059ao.a(9215));
    }

    public void requestHeadersEnd(Call call, Request request) {
        yl0.e(call, C0059ao.a(9216));
        yl0.e(request, C0059ao.a(9217));
    }

    public void requestHeadersStart(Call call) {
        yl0.e(call, C0059ao.a(9218));
    }

    public void responseBodyEnd(Call call, long j) {
        yl0.e(call, C0059ao.a(9219));
    }

    public void responseBodyStart(Call call) {
        yl0.e(call, C0059ao.a(9220));
    }

    public void responseFailed(Call call, IOException iOException) {
        yl0.e(call, C0059ao.a(9221));
        yl0.e(iOException, C0059ao.a(9222));
    }

    public void responseHeadersEnd(Call call, Response response) {
        yl0.e(call, C0059ao.a(9223));
        yl0.e(response, C0059ao.a(9224));
    }

    public void responseHeadersStart(Call call) {
        yl0.e(call, C0059ao.a(9225));
    }

    public void satisfactionFailure(Call call, Response response) {
        yl0.e(call, C0059ao.a(9226));
        yl0.e(response, C0059ao.a(9227));
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        yl0.e(call, C0059ao.a(9228));
    }

    public void secureConnectStart(Call call) {
        yl0.e(call, C0059ao.a(9229));
    }
}
