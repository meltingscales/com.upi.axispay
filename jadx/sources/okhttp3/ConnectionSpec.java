package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import myunmn.C0059ao;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class ConnectionSpec {
    private static final CipherSuite[] APPROVED_CIPHER_SUITES;
    public static final ConnectionSpec CLEARTEXT;
    public static final ConnectionSpec COMPATIBLE_TLS;
    public static final Companion Companion = new Companion(null);
    public static final ConnectionSpec MODERN_TLS;
    private static final CipherSuite[] RESTRICTED_CIPHER_SUITES;
    public static final ConnectionSpec RESTRICTED_TLS;
    private final String[] cipherSuitesAsString;
    private final boolean isTls;
    private final boolean supportsTlsExtensions;
    private final String[] tlsVersionsAsString;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Builder {
        private String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;
        private String[] tlsVersions;

        public Builder(boolean z) {
            this.tls = z;
        }

        public final Builder allEnabledCipherSuites() {
            if (this.tls) {
                this.cipherSuites = null;
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(1632).toString());
        }

        public final Builder allEnabledTlsVersions() {
            if (this.tls) {
                this.tlsVersions = null;
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(1633).toString());
        }

        public final ConnectionSpec build() {
            return new ConnectionSpec(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        public final Builder cipherSuites(CipherSuite... cipherSuiteArr) {
            yl0.e(cipherSuiteArr, C0059ao.a(1638));
            if (this.tls) {
                ArrayList arrayList = new ArrayList(cipherSuiteArr.length);
                for (CipherSuite cipherSuite : cipherSuiteArr) {
                    arrayList.add(cipherSuite.javaName());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, C0059ao.a(1639));
                String[] strArr = (String[]) array;
                return cipherSuites((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException(C0059ao.a(1640).toString());
        }

        public final String[] getCipherSuites$okhttp() {
            return this.cipherSuites;
        }

        public final boolean getSupportsTlsExtensions$okhttp() {
            return this.supportsTlsExtensions;
        }

        public final boolean getTls$okhttp() {
            return this.tls;
        }

        public final String[] getTlsVersions$okhttp() {
            return this.tlsVersions;
        }

        public final void setCipherSuites$okhttp(String[] strArr) {
            this.cipherSuites = strArr;
        }

        public final void setSupportsTlsExtensions$okhttp(boolean z) {
            this.supportsTlsExtensions = z;
        }

        public final void setTls$okhttp(boolean z) {
            this.tls = z;
        }

        public final void setTlsVersions$okhttp(String[] strArr) {
            this.tlsVersions = strArr;
        }

        public final Builder supportsTlsExtensions(boolean z) {
            if (this.tls) {
                this.supportsTlsExtensions = z;
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(1641).toString());
        }

        public final Builder tlsVersions(TlsVersion... tlsVersionArr) {
            yl0.e(tlsVersionArr, C0059ao.a(1646));
            if (this.tls) {
                ArrayList arrayList = new ArrayList(tlsVersionArr.length);
                for (TlsVersion tlsVersion : tlsVersionArr) {
                    arrayList.add(tlsVersion.javaName());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, C0059ao.a(1647));
                String[] strArr = (String[]) array;
                return tlsVersions((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException(C0059ao.a(1648).toString());
        }

        public Builder(ConnectionSpec connectionSpec) {
            yl0.e(connectionSpec, C0059ao.a(1631));
            this.tls = connectionSpec.isTls();
            this.cipherSuites = connectionSpec.getCipherSuitesAsString$okhttp();
            this.tlsVersions = connectionSpec.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec.supportsTlsExtensions();
        }

        public final Builder cipherSuites(String... strArr) {
            yl0.e(strArr, C0059ao.a(1634));
            if (this.tls) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, C0059ao.a(1635));
                    this.cipherSuites = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException(C0059ao.a(1636).toString());
            }
            throw new IllegalArgumentException(C0059ao.a(1637).toString());
        }

        public final Builder tlsVersions(String... strArr) {
            yl0.e(strArr, C0059ao.a(1642));
            if (this.tls) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, C0059ao.a(1643));
                    this.tlsVersions = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException(C0059ao.a(1644).toString());
            }
            throw new IllegalArgumentException(C0059ao.a(1645).toString());
        }
    }

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
        CipherSuite cipherSuite = CipherSuite.TLS_AES_128_GCM_SHA256;
        CipherSuite cipherSuite2 = CipherSuite.TLS_AES_256_GCM_SHA384;
        CipherSuite cipherSuite3 = CipherSuite.TLS_CHACHA20_POLY1305_SHA256;
        CipherSuite cipherSuite4 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite5 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite6 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
        CipherSuite cipherSuite7 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
        CipherSuite cipherSuite8 = CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
        CipherSuite cipherSuite9 = CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
        RESTRICTED_CIPHER_SUITES = cipherSuiteArr;
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        APPROVED_CIPHER_SUITES = cipherSuiteArr2;
        Builder cipherSuites = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        RESTRICTED_TLS = cipherSuites.tlsVersions(tlsVersion, tlsVersion2).supportsTlsExtensions(true).build();
        MODERN_TLS = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).tlsVersions(tlsVersion, tlsVersion2).supportsTlsExtensions(true).build();
        COMPATIBLE_TLS = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).tlsVersions(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).supportsTlsExtensions(true).build();
        CLEARTEXT = new Builder(false).build();
    }

    public ConnectionSpec(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.isTls = z;
        this.supportsTlsExtensions = z2;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    private final ConnectionSpec supportedSpec(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        yl0.d(enabledCipherSuites, C0059ao.a(10920));
        String[] effectiveCipherSuites = Internal.effectiveCipherSuites(this, enabledCipherSuites);
        if (this.tlsVersionsAsString != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            yl0.d(enabledProtocols2, C0059ao.a(10921));
            enabledProtocols = Util.intersect(enabledProtocols2, this.tlsVersionsAsString, tj0.b());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        yl0.d(supportedCipherSuites, C0059ao.a(10922));
        int indexOf = Util.indexOf(supportedCipherSuites, C0059ao.a(10923), CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        if (z && indexOf != -1) {
            String str = supportedCipherSuites[indexOf];
            yl0.d(str, C0059ao.a(10924));
            effectiveCipherSuites = Util.concat(effectiveCipherSuites, str);
        }
        Builder cipherSuites = new Builder(this).cipherSuites((String[]) Arrays.copyOf(effectiveCipherSuites, effectiveCipherSuites.length));
        yl0.d(enabledProtocols, C0059ao.a(10925));
        return cipherSuites.tlsVersions((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).build();
    }

    /* renamed from: -deprecated_cipherSuites  reason: not valid java name */
    public final List<CipherSuite> m268deprecated_cipherSuites() {
        return cipherSuites();
    }

    /* renamed from: -deprecated_supportsTlsExtensions  reason: not valid java name */
    public final boolean m269deprecated_supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    /* renamed from: -deprecated_tlsVersions  reason: not valid java name */
    public final List<TlsVersion> m270deprecated_tlsVersions() {
        return tlsVersions();
    }

    public final void apply$okhttp(SSLSocket sSLSocket, boolean z) {
        yl0.e(sSLSocket, C0059ao.a(10926));
        ConnectionSpec supportedSpec = supportedSpec(sSLSocket, z);
        if (supportedSpec.tlsVersions() != null) {
            sSLSocket.setEnabledProtocols(supportedSpec.tlsVersionsAsString);
        }
        if (supportedSpec.cipherSuites() != null) {
            sSLSocket.setEnabledCipherSuites(supportedSpec.cipherSuitesAsString);
        }
    }

    public final List<CipherSuite> cipherSuites() {
        String[] strArr = this.cipherSuitesAsString;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(CipherSuite.Companion.forJavaName(str));
            }
            return ij0.I(arrayList);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ConnectionSpec) {
            if (obj == this) {
                return true;
            }
            boolean z = this.isTls;
            ConnectionSpec connectionSpec = (ConnectionSpec) obj;
            if (z != connectionSpec.isTls) {
                return false;
            }
            return !z || (Arrays.equals(this.cipherSuitesAsString, connectionSpec.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, connectionSpec.tlsVersionsAsString) && this.supportsTlsExtensions == connectionSpec.supportsTlsExtensions);
        }
        return false;
    }

    public final String[] getCipherSuitesAsString$okhttp() {
        return this.cipherSuitesAsString;
    }

    public int hashCode() {
        if (this.isTls) {
            String[] strArr = this.cipherSuitesAsString;
            int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
            String[] strArr2 = this.tlsVersionsAsString;
            return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
        }
        return 17;
    }

    public final boolean isCompatible(SSLSocket sSLSocket) {
        yl0.e(sSLSocket, C0059ao.a(10927));
        if (this.isTls) {
            String[] strArr = this.tlsVersionsAsString;
            if (strArr == null || Util.hasIntersection(strArr, sSLSocket.getEnabledProtocols(), tj0.b())) {
                String[] strArr2 = this.cipherSuitesAsString;
                return strArr2 == null || Util.hasIntersection(strArr2, sSLSocket.getEnabledCipherSuites(), CipherSuite.Companion.getORDER_BY_NAME$okhttp());
            }
            return false;
        }
        return false;
    }

    public final boolean isTls() {
        return this.isTls;
    }

    public final boolean supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public final List<TlsVersion> tlsVersions() {
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(TlsVersion.Companion.forJavaName(str));
            }
            return ij0.I(arrayList);
        }
        return null;
    }

    public String toString() {
        if (this.isTls) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(10929));
            sb.append(C0059ao.a(10930));
            List<CipherSuite> cipherSuites = cipherSuites();
            String a = C0059ao.a(10931);
            sb.append(Objects.toString(cipherSuites, a));
            String a2 = C0059ao.a(10932);
            sb.append(a2);
            sb.append(C0059ao.a(10933));
            sb.append(Objects.toString(tlsVersions(), a));
            sb.append(a2);
            sb.append(C0059ao.a(10934));
            sb.append(this.supportsTlsExtensions);
            sb.append(')');
            return sb.toString();
        }
        return C0059ao.a(10928);
    }
}
