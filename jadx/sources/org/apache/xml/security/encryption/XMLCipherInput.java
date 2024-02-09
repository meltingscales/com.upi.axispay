package org.apache.xml.security.encryption;

import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class XMLCipherInput {
    public static Class a;
    private static Log b;

    static {
        Class cls = a;
        if (cls == null) {
            cls = a(C0059ao.a(5822));
            a = cls;
        }
        b = LogFactory.getLog(cls.getName());
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }
}
