package in.org.npci.commonlibrary;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class e {
    public static Certificate a(String str) {
        CertificateFactory certificateFactory = CertificateFactory.getInstance(C0059ao.a(5931));
        InputStream resourceAsStream = e.class.getClassLoader().getResourceAsStream(str);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
        try {
            Certificate generateCertificate = certificateFactory.generateCertificate(bufferedInputStream);
            try {
                resourceAsStream.close();
            } catch (IOException unused) {
            }
            return generateCertificate;
        } finally {
            try {
                bufferedInputStream.close();
            } catch (IOException unused2) {
            }
            try {
                resourceAsStream.close();
            } catch (IOException unused3) {
            }
        }
    }
}
