package okhttp3.internal.platform;

import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import myunmn.C0059ao;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Jdk9Platform extends Platform {
    public static final Companion Companion = new Companion(null);
    private static final boolean isAvailable;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Jdk9Platform buildIfSupported() {
            if (isAvailable()) {
                return new Jdk9Platform();
            }
            return null;
        }

        public final boolean isAvailable() {
            return Jdk9Platform.isAvailable;
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r1.intValue() >= 9) goto L9;
     */
    static {
        /*
            okhttp3.internal.platform.Jdk9Platform$Companion r0 = new okhttp3.internal.platform.Jdk9Platform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.Jdk9Platform.Companion = r0
            r5 = 2915(0xb63, float:4.085E-42)
            java.lang.String r0 = myunmn.C0059ao.a(r5)
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L19
            java.lang.Integer r1 = defpackage.ao0.f(r0)
        L19:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L28
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L26
            goto L36
        L26:
            r0 = r2
            goto L36
        L28:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            r5 = 2916(0xb64, float:4.086E-42)
            java.lang.String r3 = myunmn.C0059ao.a(r5)     // Catch: java.lang.NoSuchMethodException -> L26
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L26
            r1.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L26
        L36:
            okhttp3.internal.platform.Jdk9Platform.isAvailable = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Jdk9Platform.<clinit>():void");
    }

    @Override // okhttp3.internal.platform.Platform
    @SuppressSignatureCheck
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        yl0.e(sSLSocket, C0059ao.a(2917));
        yl0.e(list, C0059ao.a(2918));
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        List<String> alpnProtocolNames = Platform.Companion.alpnProtocolNames(list);
        yl0.d(sSLParameters, C0059ao.a(2919));
        Object[] array = alpnProtocolNames.toArray(new String[0]);
        Objects.requireNonNull(array, C0059ao.a(2920));
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // okhttp3.internal.platform.Platform
    @SuppressSignatureCheck
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        yl0.e(sSLSocket, C0059ao.a(2921));
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals(C0059ao.a(2922))) {
                    return null;
                }
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        yl0.e(sSLSocketFactory, C0059ao.a(2923));
        throw new UnsupportedOperationException(C0059ao.a(2924));
    }
}
