package org.apache.xml.security.keys.content;

import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.utils.SignatureElementProxy;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class X509Data extends SignatureElementProxy implements KeyInfoContent {
    public static Log a;
    public static Class b;

    static {
        Class cls = b;
        if (cls == null) {
            cls = a(C0059ao.a(4540));
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

    @Override // org.apache.xml.security.utils.ElementProxy
    public String e() {
        return C0059ao.a(4541);
    }
}
