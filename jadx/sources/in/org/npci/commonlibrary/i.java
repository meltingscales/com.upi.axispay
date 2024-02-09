package in.org.npci.commonlibrary;

import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class i {
    public static Certificate a;

    static {
        try {
            a = e.a(C0059ao.a(6291));
        } catch (CertificateException e) {
            e.printStackTrace();
        }
    }

    public static PublicKey a() {
        Certificate certificate = a;
        if (certificate != null) {
            return certificate.getPublicKey();
        }
        return null;
    }
}
