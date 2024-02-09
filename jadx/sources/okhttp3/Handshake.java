package okhttp3;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import myunmn.C0059ao;
import okhttp3.internal.Util;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Handshake {
    public static final Companion Companion = new Companion(null);
    private final CipherSuite cipherSuite;
    private final List<Certificate> localCertificates;
    private final ci0 peerCertificates$delegate;
    private final TlsVersion tlsVersion;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            if (certificateArr != null) {
                return Util.immutableListOf((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length));
            }
            return aj0.f();
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final Handshake m288deprecated_get(SSLSession sSLSession) throws IOException {
            yl0.e(sSLSession, C0059ao.a(3912));
            return get(sSLSession);
        }

        public final Handshake get(SSLSession sSLSession) throws IOException {
            List<Certificate> f;
            yl0.e(sSLSession, C0059ao.a(3913));
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? !cipherSuite.equals(C0059ao.a(3915)) : !(hashCode == 1208658923 && cipherSuite.equals(C0059ao.a(3914)))) {
                    CipherSuite forJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol != null) {
                        if (!yl0.a(C0059ao.a(3916), protocol)) {
                            TlsVersion forJavaName2 = TlsVersion.Companion.forJavaName(protocol);
                            try {
                                f = toImmutableList(sSLSession.getPeerCertificates());
                            } catch (SSLPeerUnverifiedException unused) {
                                f = aj0.f();
                            }
                            return new Handshake(forJavaName2, forJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(f));
                        }
                        throw new IOException(C0059ao.a(3917));
                    }
                    throw new IllegalStateException(C0059ao.a(3918).toString());
                }
                throw new IOException(C0059ao.a(3919) + cipherSuite);
            }
            throw new IllegalStateException(C0059ao.a(3920).toString());
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }

        public final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
            yl0.e(tlsVersion, C0059ao.a(3921));
            yl0.e(cipherSuite, C0059ao.a(3922));
            yl0.e(list, C0059ao.a(3923));
            yl0.e(list2, C0059ao.a(3924));
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(list2), new Handshake$Companion$get$1(Util.toImmutableList(list)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, sk0<? extends List<? extends Certificate>> sk0Var) {
        yl0.e(tlsVersion, C0059ao.a(7902));
        yl0.e(cipherSuite, C0059ao.a(7903));
        yl0.e(list, C0059ao.a(7904));
        yl0.e(sk0Var, C0059ao.a(7905));
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = list;
        this.peerCertificates$delegate = di0.b(new Handshake$peerCertificates$2(sk0Var));
    }

    public static final Handshake get(SSLSession sSLSession) throws IOException {
        return Companion.get(sSLSession);
    }

    public static final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
        return Companion.get(tlsVersion, cipherSuite, list, list2);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        yl0.d(type, C0059ao.a(7906));
        return type;
    }

    /* renamed from: -deprecated_cipherSuite  reason: not valid java name */
    public final CipherSuite m282deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    /* renamed from: -deprecated_localCertificates  reason: not valid java name */
    public final List<Certificate> m283deprecated_localCertificates() {
        return this.localCertificates;
    }

    /* renamed from: -deprecated_localPrincipal  reason: not valid java name */
    public final Principal m284deprecated_localPrincipal() {
        return localPrincipal();
    }

    /* renamed from: -deprecated_peerCertificates  reason: not valid java name */
    public final List<Certificate> m285deprecated_peerCertificates() {
        return peerCertificates();
    }

    /* renamed from: -deprecated_peerPrincipal  reason: not valid java name */
    public final Principal m286deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    /* renamed from: -deprecated_tlsVersion  reason: not valid java name */
    public final TlsVersion m287deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.tlsVersion == this.tlsVersion && yl0.a(handshake.cipherSuite, this.cipherSuite) && yl0.a(handshake.peerCertificates(), peerCertificates()) && yl0.a(handshake.localCertificates, this.localCertificates)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + peerCertificates().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    public final Principal localPrincipal() {
        Object w = ij0.w(this.localCertificates);
        if (!(w instanceof X509Certificate)) {
            w = null;
        }
        X509Certificate x509Certificate = (X509Certificate) w;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    public final Principal peerPrincipal() {
        Object w = ij0.w(peerCertificates());
        if (!(w instanceof X509Certificate)) {
            w = null;
        }
        X509Certificate x509Certificate = (X509Certificate) w;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public String toString() {
        List<Certificate> peerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(bj0.o(peerCertificates, 10));
        for (Certificate certificate : peerCertificates) {
            arrayList.add(getName(certificate));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(7907));
        sb.append(C0059ao.a(7908));
        sb.append(this.tlsVersion);
        sb.append(' ');
        sb.append(C0059ao.a(7909));
        sb.append(this.cipherSuite);
        sb.append(' ');
        sb.append(C0059ao.a(7910));
        sb.append(obj);
        sb.append(' ');
        sb.append(C0059ao.a(7911));
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(bj0.o(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(getName(certificate2));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
