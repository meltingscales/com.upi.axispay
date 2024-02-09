package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import myunmn.C0059ao;
import okhttp3.Protocol;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface SocketAdapter {

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static boolean matchesSocketFactory(SocketAdapter socketAdapter, SSLSocketFactory sSLSocketFactory) {
            yl0.e(sSLSocketFactory, C0059ao.a(9595));
            return false;
        }

        public static X509TrustManager trustManager(SocketAdapter socketAdapter, SSLSocketFactory sSLSocketFactory) {
            yl0.e(sSLSocketFactory, C0059ao.a(9596));
            return null;
        }
    }

    void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list);

    String getSelectedProtocol(SSLSocket sSLSocket);

    boolean isSupported();

    boolean matchesSocket(SSLSocket sSLSocket);

    boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory);

    X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory);
}
