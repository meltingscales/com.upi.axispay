package okhttp3.internal.platform;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import myunmn.C0059ao;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import okio.Buffer;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Platform {
    public static final Companion Companion;
    public static final int INFO = 0;
    public static final int WARN = 0;
    private static final Logger logger;
    private static volatile Platform platform;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        private final Platform findAndroidPlatform() {
            AndroidLog.INSTANCE.enable();
            Platform buildIfSupported = Android10Platform.Companion.buildIfSupported();
            if (buildIfSupported != null) {
                return buildIfSupported;
            }
            Platform buildIfSupported2 = AndroidPlatform.Companion.buildIfSupported();
            yl0.c(buildIfSupported2);
            return buildIfSupported2;
        }

        private final Platform findJvmPlatform() {
            OpenJSSEPlatform buildIfSupported;
            BouncyCastlePlatform buildIfSupported2;
            ConscryptPlatform buildIfSupported3;
            if (!isConscryptPreferred() || (buildIfSupported3 = ConscryptPlatform.Companion.buildIfSupported()) == null) {
                if (!isBouncyCastlePreferred() || (buildIfSupported2 = BouncyCastlePlatform.Companion.buildIfSupported()) == null) {
                    if (!isOpenJSSEPreferred() || (buildIfSupported = OpenJSSEPlatform.Companion.buildIfSupported()) == null) {
                        Jdk9Platform buildIfSupported4 = Jdk9Platform.Companion.buildIfSupported();
                        if (buildIfSupported4 != null) {
                            return buildIfSupported4;
                        }
                        Platform buildIfSupported5 = Jdk8WithJettyBootPlatform.Companion.buildIfSupported();
                        return buildIfSupported5 != null ? buildIfSupported5 : new Platform();
                    }
                    return buildIfSupported;
                }
                return buildIfSupported2;
            }
            return buildIfSupported3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Platform findPlatform() {
            if (isAndroid()) {
                return findAndroidPlatform();
            }
            return findJvmPlatform();
        }

        private final boolean isBouncyCastlePreferred() {
            Provider provider = Security.getProviders()[0];
            yl0.d(provider, C0059ao.a(15360));
            return yl0.a(C0059ao.a(15361), provider.getName());
        }

        private final boolean isConscryptPreferred() {
            Provider provider = Security.getProviders()[0];
            yl0.d(provider, C0059ao.a(15362));
            return yl0.a(C0059ao.a(15363), provider.getName());
        }

        private final boolean isOpenJSSEPreferred() {
            Provider provider = Security.getProviders()[0];
            yl0.d(provider, C0059ao.a(15364));
            return yl0.a(C0059ao.a(15365), provider.getName());
        }

        public static /* synthetic */ void resetForTests$default(Companion companion, Platform platform, int i, Object obj) {
            if ((i & 1) != 0) {
                platform = companion.findPlatform();
            }
            companion.resetForTests(platform);
        }

        public final List<String> alpnProtocolNames(List<? extends Protocol> list) {
            yl0.e(list, C0059ao.a(15366));
            ArrayList<Protocol> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(bj0.o(arrayList, 10));
            for (Protocol protocol : arrayList) {
                arrayList2.add(protocol.toString());
            }
            return arrayList2;
        }

        public final byte[] concatLengthPrefixed(List<? extends Protocol> list) {
            yl0.e(list, C0059ao.a(15367));
            Buffer buffer = new Buffer();
            for (String str : alpnProtocolNames(list)) {
                buffer.writeByte(str.length());
                buffer.writeUtf8(str);
            }
            return buffer.readByteArray();
        }

        public final Platform get() {
            return Platform.platform;
        }

        public final boolean isAndroid() {
            return yl0.a(C0059ao.a(15369), System.getProperty(C0059ao.a(15368)));
        }

        public final void resetForTests(Platform platform) {
            yl0.e(platform, C0059ao.a(15370));
            Platform.platform = platform;
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    static {
        C0059ao.a(Platform.class, 388);
        Companion companion = new Companion(null);
        Companion = companion;
        platform = companion.findPlatform();
        logger = Logger.getLogger(OkHttpClient.class.getName());
    }

    public static final Platform get() {
        return Companion.get();
    }

    public static /* synthetic */ void log$default(Platform platform2, String str, int i, Throwable th, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 4;
            }
            if ((i2 & 4) != 0) {
                th = null;
            }
            platform2.log(str, i, th);
            return;
        }
        throw new UnsupportedOperationException(C0059ao.a(14479));
    }

    public void afterHandshake(SSLSocket sSLSocket) {
        yl0.e(sSLSocket, C0059ao.a(14480));
    }

    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        yl0.e(x509TrustManager, C0059ao.a(14481));
        return new BasicCertificateChainCleaner(buildTrustRootIndex(x509TrustManager));
    }

    public TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
        yl0.e(x509TrustManager, C0059ao.a(14482));
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        yl0.d(acceptedIssuers, C0059ao.a(14483));
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        yl0.e(sSLSocket, C0059ao.a(14484));
        yl0.e(list, C0059ao.a(14485));
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        yl0.e(socket, C0059ao.a(14486));
        yl0.e(inetSocketAddress, C0059ao.a(14487));
        socket.connect(inetSocketAddress, i);
    }

    public final String getPrefix() {
        return C0059ao.a(14488);
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        yl0.e(sSLSocket, C0059ao.a(14489));
        return null;
    }

    public Object getStackTraceForCloseable(String str) {
        yl0.e(str, C0059ao.a(14490));
        if (logger.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean isCleartextTrafficPermitted(String str) {
        yl0.e(str, C0059ao.a(14491));
        return true;
    }

    public void log(String str, int i, Throwable th) {
        yl0.e(str, C0059ao.a(14492));
        logger.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void logCloseableLeak(String str, Object obj) {
        yl0.e(str, C0059ao.a(14493));
        if (obj == null) {
            str = str + C0059ao.a(14494);
        }
        log(str, 5, (Throwable) obj);
    }

    public SSLContext newSSLContext() {
        SSLContext sSLContext = SSLContext.getInstance(C0059ao.a(14495));
        yl0.d(sSLContext, C0059ao.a(14496));
        return sSLContext;
    }

    public SSLSocketFactory newSslSocketFactory(X509TrustManager x509TrustManager) {
        yl0.e(x509TrustManager, C0059ao.a(14497));
        try {
            SSLContext newSSLContext = newSSLContext();
            newSSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = newSSLContext.getSocketFactory();
            yl0.d(socketFactory, C0059ao.a(14498));
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError(C0059ao.a(14499) + e, e);
        }
    }

    public X509TrustManager platformTrustManager() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        yl0.d(trustManagerFactory, C0059ao.a(14500));
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        yl0.c(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, C0059ao.a(14501));
            return (X509TrustManager) trustManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(14502));
        String arrays = Arrays.toString(trustManagers);
        yl0.d(arrays, C0059ao.a(14503));
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        yl0.d(simpleName, C0059ao.a(14504));
        return simpleName;
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        yl0.e(sSLSocketFactory, C0059ao.a(14505));
        try {
            Class<?> cls = Class.forName(C0059ao.a(14506));
            yl0.d(cls, C0059ao.a(14507));
            Object readFieldOrNull = Util.readFieldOrNull(sSLSocketFactory, cls, C0059ao.a(14508));
            if (readFieldOrNull != null) {
                return (X509TrustManager) Util.readFieldOrNull(readFieldOrNull, X509TrustManager.class, C0059ao.a(14509));
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
