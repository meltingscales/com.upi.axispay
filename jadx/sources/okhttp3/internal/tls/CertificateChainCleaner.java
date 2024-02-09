package okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import myunmn.C0059ao;
import okhttp3.internal.platform.Platform;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class CertificateChainCleaner {
    public static final Companion Companion = new Companion(null);

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final CertificateChainCleaner get(X509TrustManager x509TrustManager) {
            yl0.e(x509TrustManager, C0059ao.a(14878));
            return Platform.Companion.get().buildCertificateChainCleaner(x509TrustManager);
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }

        public final CertificateChainCleaner get(X509Certificate... x509CertificateArr) {
            yl0.e(x509CertificateArr, C0059ao.a(14879));
            return new BasicCertificateChainCleaner(new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length)));
        }
    }

    public abstract List<Certificate> clean(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException;
}
