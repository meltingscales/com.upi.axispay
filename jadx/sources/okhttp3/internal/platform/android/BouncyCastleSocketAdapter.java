package okhttp3.internal.platform.android;

import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import myunmn.C0059ao;
import okhttp3.Protocol;
import okhttp3.internal.platform.BouncyCastlePlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class BouncyCastleSocketAdapter implements SocketAdapter {
    public static final Companion Companion = new Companion(null);
    private static final DeferredSocketAdapter.Factory factory = new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion$factory$1
        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public SocketAdapter create(SSLSocket sSLSocket) {
            yl0.e(sSLSocket, C0059ao.a(12999));
            return new BouncyCastleSocketAdapter();
        }

        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public boolean matchesSocket(SSLSocket sSLSocket) {
            yl0.e(sSLSocket, C0059ao.a(13000));
            return BouncyCastlePlatform.Companion.isSupported() && (sSLSocket instanceof BCSSLSocket);
        }
    };

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final DeferredSocketAdapter.Factory getFactory() {
            return BouncyCastleSocketAdapter.factory;
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        yl0.e(sSLSocket, C0059ao.a(12061));
        yl0.e(list, C0059ao.a(12062));
        if (matchesSocket(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            yl0.d(parameters, C0059ao.a(12063));
            Object[] array = Platform.Companion.alpnProtocolNames(list).toArray(new String[0]);
            Objects.requireNonNull(array, C0059ao.a(12064));
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        yl0.e(sSLSocket, C0059ao.a(12065));
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(C0059ao.a(12066)))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return BouncyCastlePlatform.Companion.isSupported();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(SSLSocket sSLSocket) {
        yl0.e(sSLSocket, C0059ao.a(12067));
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        yl0.e(sSLSocketFactory, C0059ao.a(12068));
        return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        yl0.e(sSLSocketFactory, C0059ao.a(12069));
        return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
    }
}
