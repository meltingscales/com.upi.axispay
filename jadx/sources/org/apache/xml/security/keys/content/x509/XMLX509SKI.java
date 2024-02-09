package org.apache.xml.security.keys.content.x509;

import java.util.Arrays;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.utils.SignatureElementProxy;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class XMLX509SKI extends SignatureElementProxy implements XMLX509DataContent {
    public static Log a;
    public static Class b;

    static {
        Class cls = b;
        if (cls == null) {
            cls = a(C0059ao.a(8185));
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

    public byte[] a() {
        return n();
    }

    @Override // org.apache.xml.security.utils.ElementProxy
    public String e() {
        return C0059ao.a(8186);
    }

    public boolean equals(Object obj) {
        if (obj instanceof XMLX509SKI) {
            try {
                return Arrays.equals(((XMLX509SKI) obj).a(), a());
            } catch (XMLSecurityException unused) {
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 17;
        try {
            for (byte b2 : a()) {
                i = b2 + (i * 31);
            }
        } catch (XMLSecurityException unused) {
        }
        return i;
    }
}
