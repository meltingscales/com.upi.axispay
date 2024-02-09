package org.apache.xml.security.utils;

import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class IgnoreAllErrorHandler implements ErrorHandler {
    public static Log a;
    public static final boolean b;
    public static final boolean c;
    public static Class d;

    static {
        Class cls = d;
        if (cls == null) {
            cls = a(C0059ao.a(6366));
            d = cls;
        }
        a = LogFactory.getLog(cls.getName());
        String a2 = C0059ao.a(6367);
        String a3 = C0059ao.a(6368);
        String property = System.getProperty(a2, a3);
        String a4 = C0059ao.a(6369);
        b = property.equals(a4);
        c = System.getProperty(C0059ao.a(6370), a3).equals(a4);
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) {
        if (b) {
            a.error(C0059ao.a(6371), sAXParseException);
        }
        if (c) {
            throw sAXParseException;
        }
    }

    @Override // org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) {
        if (b) {
            a.warn(C0059ao.a(6372), sAXParseException);
        }
        if (c) {
            throw sAXParseException;
        }
    }

    @Override // org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) {
        if (b) {
            a.warn(C0059ao.a(6373), sAXParseException);
        }
        if (c) {
            throw sAXParseException;
        }
    }
}
