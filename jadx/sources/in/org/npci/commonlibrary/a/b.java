package in.org.npci.commonlibrary.a;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import javax.xml.parsers.ParserConfigurationException;
import myunmn.C0059ao;
import org.xml.sax.SAXException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class b {
    public Certificate a;

    public b() {
        try {
            this.a = b(C0059ao.a(3223));
        } catch (CertificateException e) {
            System.out.println(C0059ao.a(3224));
            e.printStackTrace();
        }
    }

    public boolean a(String str) {
        if (this.a == null) {
            try {
                this.a = b(C0059ao.a(3225));
            } catch (CertificateException e) {
                System.out.println(C0059ao.a(3226));
                e.printStackTrace();
                return false;
            }
        }
        try {
            return a.b(a.a(str), this.a.getPublicKey());
        } catch (ParserConfigurationException e2) {
            e = e2;
            PrintStream printStream = System.err;
            printStream.println(C0059ao.a(3227) + str);
            e.printStackTrace();
            return false;
        } catch (SAXException e3) {
            e = e3;
            PrintStream printStream2 = System.err;
            printStream2.println(C0059ao.a(3227) + str);
            e.printStackTrace();
            return false;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public final Certificate b(String str) {
        CertificateFactory certificateFactory = CertificateFactory.getInstance(C0059ao.a(3228));
        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(str);
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
