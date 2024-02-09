package okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import myunmn.C0059ao;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.Utf8;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 0;
    private static final int ALT_IPA_NAME = 0;
    public static final OkHostnameVerifier INSTANCE;

    static {
        C0059ao.a(OkHostnameVerifier.class, 287);
        INSTANCE = new OkHostnameVerifier();
    }

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (isAscii(str)) {
            Locale locale = Locale.US;
            yl0.d(locale, C0059ao.a(12734));
            Objects.requireNonNull(str, C0059ao.a(12735));
            String lowerCase = str.toLowerCase(locale);
            yl0.d(lowerCase, C0059ao.a(12736));
            return lowerCase;
        }
        return str;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && !(!yl0.a(list.get(0), Integer.valueOf(i))) && (obj = list.get(1)) != null) {
                        if (obj == null) {
                            throw new NullPointerException(C0059ao.a(12737));
                        }
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
            return aj0.f();
        } catch (CertificateParsingException unused) {
            return aj0.f();
        }
    }

    private final boolean isAscii(String str) {
        return str.length() == ((int) Utf8.size$default(str, 0, 0, 3, null));
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String asciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        for (String str2 : subjectAltNames) {
            if (INSTANCE.verifyHostname(asciiToLowercase, str2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        for (String str2 : subjectAltNames) {
            if (yl0.a(canonicalHost, HostnamesKt.toCanonicalHost(str2))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        yl0.e(x509Certificate, C0059ao.a(12744));
        return ij0.C(getSubjectAltNames(x509Certificate, 7), getSubjectAltNames(x509Certificate, 2));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        yl0.e(str, C0059ao.a(12747));
        yl0.e(sSLSession, C0059ao.a(12748));
        if (isAscii(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException(C0059ao.a(12749));
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return verify(str, (X509Certificate) certificate);
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        yl0.e(str, C0059ao.a(12745));
        yl0.e(x509Certificate, C0059ao.a(12746));
        return Util.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        if (!(str == null || str.length() == 0)) {
            String a = C0059ao.a(12738);
            if (!bo0.w(str, a, false, 2, null)) {
                String a2 = C0059ao.a(12739);
                if (!bo0.i(str, a2, false, 2, null)) {
                    if (!(str2 == null || str2.length() == 0) && !bo0.w(str2, a, false, 2, null) && !bo0.i(str2, a2, false, 2, null)) {
                        if (!bo0.i(str, a, false, 2, null)) {
                            str = str + a;
                        }
                        String str3 = str;
                        if (!bo0.i(str2, a, false, 2, null)) {
                            str2 = str2 + a;
                        }
                        String asciiToLowercase = asciiToLowercase(str2);
                        if (!co0.B(asciiToLowercase, C0059ao.a(12740), false, 2, null)) {
                            return yl0.a(str3, asciiToLowercase);
                        }
                        String a3 = C0059ao.a(12741);
                        if (!bo0.w(asciiToLowercase, a3, false, 2, null) || co0.L(asciiToLowercase, '*', 1, false, 4, null) != -1 || str3.length() < asciiToLowercase.length() || yl0.a(a3, asciiToLowercase)) {
                            return false;
                        }
                        Objects.requireNonNull(asciiToLowercase, C0059ao.a(12742));
                        String substring = asciiToLowercase.substring(1);
                        yl0.d(substring, C0059ao.a(12743));
                        if (bo0.i(str3, substring, false, 2, null)) {
                            int length = str3.length() - substring.length();
                            return length <= 0 || co0.Q(str3, '.', length + (-1), false, 4, null) == -1;
                        }
                        return false;
                    }
                }
            }
        }
        return false;
    }
}
