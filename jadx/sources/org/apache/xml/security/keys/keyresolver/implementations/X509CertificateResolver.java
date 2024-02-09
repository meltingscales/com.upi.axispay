package org.apache.xml.security.keys.keyresolver.implementations;

import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.keys.keyresolver.KeyResolverSpi;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class X509CertificateResolver extends KeyResolverSpi {
    public static Log c;
    public static Class d;

    static {
        Class cls = d;
        if (cls == null) {
            cls = a(C0059ao.a(15400));
            d = cls;
        }
        c = LogFactory.getLog(cls.getName());
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }
}
