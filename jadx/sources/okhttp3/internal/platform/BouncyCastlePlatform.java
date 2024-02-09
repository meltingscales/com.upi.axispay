package okhttp3.internal.platform;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import myunmn.C0059ao;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class BouncyCastlePlatform extends Platform {
    public static final Companion Companion;
    private static final boolean isSupported;
    private final Provider provider;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final BouncyCastlePlatform buildIfSupported() {
            if (isSupported()) {
                return new BouncyCastlePlatform(null);
            }
            return null;
        }

        public final boolean isSupported() {
            return BouncyCastlePlatform.isSupported;
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        boolean z = false;
        try {
            Class.forName(C0059ao.a(13057), false, companion.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        isSupported = z;
    }

    private BouncyCastlePlatform() {
        this.provider = new BouncyCastleJsseProvider();
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        yl0.e(sSLSocket, C0059ao.a(13058));
        yl0.e(list, C0059ao.a(13059));
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            List<String> alpnProtocolNames = Platform.Companion.alpnProtocolNames(list);
            yl0.d(parameters, C0059ao.a(13060));
            Object[] array = alpnProtocolNames.toArray(new String[0]);
            Objects.requireNonNull(array, C0059ao.a(13061));
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
            return;
        }
        super.configureTlsExtensions(sSLSocket, str, list);
    }

    @Override // okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        yl0.e(sSLSocket, C0059ao.a(13062));
        if (sSLSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(C0059ao.a(13063)))) {
                return null;
            }
            return applicationProtocol;
        }
        return super.getSelectedProtocol(sSLSocket);
    }

    @Override // okhttp3.internal.platform.Platform
    public SSLContext newSSLContext() {
        SSLContext sSLContext = SSLContext.getInstance(C0059ao.a(13064), this.provider);
        yl0.d(sSLContext, C0059ao.a(13065));
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.Platform
    public X509TrustManager platformTrustManager() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(C0059ao.a(13066), C0059ao.a(13067));
        trustManagerFactory.init((KeyStore) null);
        yl0.d(trustManagerFactory, C0059ao.a(13068));
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        yl0.c(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, C0059ao.a(13069));
            return (X509TrustManager) trustManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(13070));
        String arrays = Arrays.toString(trustManagers);
        yl0.d(arrays, C0059ao.a(13071));
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // okhttp3.internal.platform.Platform
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        yl0.e(sSLSocketFactory, C0059ao.a(13072));
        throw new UnsupportedOperationException(C0059ao.a(13073));
    }

    public /* synthetic */ BouncyCastlePlatform(vl0 vl0Var) {
        this();
    }
}
