package org.apache.xml.security.keys.content.x509;

import java.math.BigInteger;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.utils.RFC2253Parser;
import org.apache.xml.security.utils.SignatureElementProxy;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class XMLX509IssuerSerial extends SignatureElementProxy implements XMLX509DataContent {
    public static Log a;
    public static Class b;

    static {
        Class cls = b;
        if (cls == null) {
            cls = a(C0059ao.a(12286));
            b = cls;
        }
        a = LogFactory.getLog(cls.getName());
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public BigInteger a() {
        String b2 = b(C0059ao.a(12287), C0059ao.a(12288));
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(12289));
            stringBuffer.append(b2);
            log.debug(stringBuffer.toString());
        }
        return new BigInteger(b2);
    }

    public String b() {
        return RFC2253Parser.a(b(C0059ao.a(12290), C0059ao.a(12291)));
    }

    @Override // org.apache.xml.security.utils.ElementProxy
    public String e() {
        return C0059ao.a(12292);
    }

    public boolean equals(Object obj) {
        if (obj instanceof XMLX509IssuerSerial) {
            XMLX509IssuerSerial xMLX509IssuerSerial = (XMLX509IssuerSerial) obj;
            return a().equals(xMLX509IssuerSerial.a()) && b().equals(xMLX509IssuerSerial.b());
        }
        return false;
    }

    public int hashCode() {
        return ((527 + a().hashCode()) * 31) + b().hashCode();
    }
}
