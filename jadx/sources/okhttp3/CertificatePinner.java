package okhttp3;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import myunmn.C0059ao;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.ByteString;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            yl0.e(str, C0059ao.a(6136));
            yl0.e(strArr, C0059ao.a(6137));
            for (String str2 : strArr) {
                this.pins.add(new Pin(str, str2));
            }
            return this;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(ij0.L(this.pins), null, 2, null);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final String pin(Certificate certificate) {
            yl0.e(certificate, C0059ao.a(15744));
            if (certificate instanceof X509Certificate) {
                return C0059ao.a(15745) + sha256Hash((X509Certificate) certificate).base64();
            }
            throw new IllegalArgumentException(C0059ao.a(15746).toString());
        }

        public final ByteString sha1Hash(X509Certificate x509Certificate) {
            yl0.e(x509Certificate, C0059ao.a(15747));
            ByteString.Companion companion = ByteString.Companion;
            PublicKey publicKey = x509Certificate.getPublicKey();
            yl0.d(publicKey, C0059ao.a(15748));
            byte[] encoded = publicKey.getEncoded();
            yl0.d(encoded, C0059ao.a(15749));
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha1();
        }

        public final ByteString sha256Hash(X509Certificate x509Certificate) {
            yl0.e(x509Certificate, C0059ao.a(15750));
            ByteString.Companion companion = ByteString.Companion;
            PublicKey publicKey = x509Certificate.getPublicKey();
            yl0.d(publicKey, C0059ao.a(15751));
            byte[] encoded = publicKey.getEncoded();
            yl0.d(encoded, C0059ao.a(15752));
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Pin {
        private final ByteString hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String str, String str2) {
            yl0.e(str, C0059ao.a(4518));
            yl0.e(str2, C0059ao.a(4519));
            if ((bo0.w(str, C0059ao.a(4520), false, 2, null) && co0.M(str, C0059ao.a(4521), 1, false, 4, null) == -1) || (bo0.w(str, C0059ao.a(4522), false, 2, null) && co0.M(str, C0059ao.a(4523), 2, false, 4, null) == -1) || co0.M(str, C0059ao.a(4524), 0, false, 6, null) == -1) {
                String canonicalHost = HostnamesKt.toCanonicalHost(str);
                if (canonicalHost != null) {
                    this.pattern = canonicalHost;
                    boolean w = bo0.w(str2, C0059ao.a(4525), false, 2, null);
                    String a = C0059ao.a(4526);
                    String a2 = C0059ao.a(4527);
                    if (w) {
                        this.hashAlgorithm = C0059ao.a(4528);
                        ByteString.Companion companion = ByteString.Companion;
                        String substring = str2.substring(5);
                        yl0.d(substring, a2);
                        ByteString decodeBase64 = companion.decodeBase64(substring);
                        if (decodeBase64 != null) {
                            this.hash = decodeBase64;
                            return;
                        }
                        throw new IllegalArgumentException(a + str2);
                    } else if (bo0.w(str2, C0059ao.a(4529), false, 2, null)) {
                        this.hashAlgorithm = C0059ao.a(4530);
                        ByteString.Companion companion2 = ByteString.Companion;
                        String substring2 = str2.substring(7);
                        yl0.d(substring2, a2);
                        ByteString decodeBase642 = companion2.decodeBase64(substring2);
                        if (decodeBase642 != null) {
                            this.hash = decodeBase642;
                            return;
                        }
                        throw new IllegalArgumentException(a + str2);
                    } else {
                        throw new IllegalArgumentException(C0059ao.a(4531) + str2);
                    }
                }
                throw new IllegalArgumentException(C0059ao.a(4532) + str);
            }
            throw new IllegalArgumentException((C0059ao.a(4533) + str).toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Pin) {
                Pin pin = (Pin) obj;
                return ((yl0.a(this.pattern, pin.pattern) ^ true) || (yl0.a(this.hashAlgorithm, pin.hashAlgorithm) ^ true) || (yl0.a(this.hash, pin.hash) ^ true)) ? false : true;
            }
            return false;
        }

        public final ByteString getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            yl0.e(x509Certificate, C0059ao.a(4534));
            String str = this.hashAlgorithm;
            int hashCode = str.hashCode();
            if (hashCode != -903629273) {
                if (hashCode == 3528965 && str.equals(C0059ao.a(4535))) {
                    return yl0.a(this.hash, CertificatePinner.Companion.sha1Hash(x509Certificate));
                }
            } else if (str.equals(C0059ao.a(4536))) {
                return yl0.a(this.hash, CertificatePinner.Companion.sha256Hash(x509Certificate));
            }
            return false;
        }

        public final boolean matchesHostname(String str) {
            yl0.e(str, C0059ao.a(4537));
            if (bo0.w(this.pattern, C0059ao.a(4538), false, 2, null)) {
                int length = this.pattern.length() - 3;
                int length2 = str.length() - length;
                if (!bo0.n(str, str.length() - length, this.pattern, 3, length, false, 16, null)) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else if (bo0.w(this.pattern, C0059ao.a(4539), false, 2, null)) {
                int length3 = this.pattern.length() - 1;
                int length4 = str.length() - length3;
                if (!bo0.n(str, str.length() - length3, this.pattern, 1, length3, false, 16, null) || co0.Q(str, '.', length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            } else {
                return yl0.a(str, this.pattern);
            }
            return true;
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.base64();
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        yl0.e(set, C0059ao.a(8412));
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final ByteString sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final ByteString sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String str, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        yl0.e(str, C0059ao.a(8413));
        yl0.e(list, C0059ao.a(8414));
        check$okhttp(str, new CertificatePinner$check$1(this, list, str));
    }

    public final void check$okhttp(String str, sk0<? extends List<? extends X509Certificate>> sk0Var) {
        String a;
        yl0.e(str, C0059ao.a(8417));
        yl0.e(sk0Var, C0059ao.a(8418));
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (findMatchingPins.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = sk0Var.invoke();
        for (X509Certificate x509Certificate : invoke) {
            ByteString byteString = null;
            ByteString byteString2 = null;
            for (Pin pin : findMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                int hashCode = hashAlgorithm.hashCode();
                if (hashCode != -903629273) {
                    if (hashCode == 3528965 && hashAlgorithm.equals(C0059ao.a(8419))) {
                        if (byteString2 == null) {
                            byteString2 = Companion.sha1Hash(x509Certificate);
                        }
                        if (yl0.a(pin.getHash(), byteString2)) {
                            return;
                        }
                    }
                    throw new AssertionError(C0059ao.a(8421) + pin.getHashAlgorithm());
                } else if (hashAlgorithm.equals(C0059ao.a(8420))) {
                    if (byteString == null) {
                        byteString = Companion.sha256Hash(x509Certificate);
                    }
                    if (yl0.a(pin.getHash(), byteString)) {
                        return;
                    }
                } else {
                    throw new AssertionError(C0059ao.a(8421) + pin.getHashAlgorithm());
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(8422));
        sb.append(C0059ao.a(8423));
        Iterator<? extends X509Certificate> it = invoke.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            a = C0059ao.a(8424);
            if (!hasNext) {
                break;
            }
            X509Certificate next = it.next();
            sb.append(a);
            sb.append(Companion.pin(next));
            sb.append(C0059ao.a(8425));
            Principal subjectDN = next.getSubjectDN();
            yl0.d(subjectDN, C0059ao.a(8426));
            sb.append(subjectDN.getName());
        }
        sb.append(C0059ao.a(8427));
        sb.append(str);
        sb.append(C0059ao.a(8428));
        for (Pin pin2 : findMatchingPins) {
            sb.append(a);
            sb.append(pin2);
        }
        String sb2 = sb.toString();
        yl0.d(sb2, C0059ao.a(8429));
        throw new SSLPeerUnverifiedException(sb2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (yl0.a(certificatePinner.pins, this.pins) && yl0.a(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    public final List<Pin> findMatchingPins(String str) {
        yl0.e(str, C0059ao.a(8430));
        Set<Pin> set = this.pins;
        List<Pin> f = aj0.f();
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(str)) {
                if (f.isEmpty()) {
                    f = new ArrayList<>();
                }
                Objects.requireNonNull(f, C0059ao.a(8431));
                nm0.a(f).add(obj);
            }
        }
        return f;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int hashCode = (1517 + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return hashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        yl0.e(certificateChainCleaner, C0059ao.a(8432));
        return yl0.a(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, vl0 vl0Var) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }

    public final void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        yl0.e(str, C0059ao.a(8415));
        yl0.e(certificateArr, C0059ao.a(8416));
        check(str, xi0.t(certificateArr));
    }
}
