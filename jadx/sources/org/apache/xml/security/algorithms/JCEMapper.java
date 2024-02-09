package org.apache.xml.security.algorithms;

import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Element;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class JCEMapper {
    public static Log a;
    public static Class b;
    private static Map c;
    private static Map d;
    private static String e;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class Algorithm {
        public String a;
        public String b;
        public String c;

        public Algorithm(Element element) {
            this.a = element.getAttribute(C0059ao.a(10852));
            this.b = element.getAttribute(C0059ao.a(10853));
            this.c = element.getAttribute(C0059ao.a(10854));
        }
    }

    static {
        Class cls = b;
        if (cls == null) {
            cls = b(C0059ao.a(7599));
            b = cls;
        }
        a = LogFactory.getLog(cls.getName());
        e = null;
    }

    public static String a() {
        return e;
    }

    public static String a(String str) {
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(7600));
            stringBuffer.append(str);
            log.debug(stringBuffer.toString());
        }
        return (String) c.get(str);
    }

    public static void a(Element element) {
        b((Element) element.getElementsByTagName(C0059ao.a(7601)).item(0));
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError().initCause(e2);
        }
    }

    public static void b(Element element) {
        Element[] a2 = XMLUtils.a(element.getFirstChild(), C0059ao.a(7602), C0059ao.a(7603));
        c = new HashMap(a2.length * 2);
        d = new HashMap(a2.length * 2);
        for (Element element2 : a2) {
            String attribute = element2.getAttribute(C0059ao.a(7604));
            c.put(attribute, element2.getAttribute(C0059ao.a(7605)));
            d.put(attribute, new Algorithm(element2));
        }
    }
}
