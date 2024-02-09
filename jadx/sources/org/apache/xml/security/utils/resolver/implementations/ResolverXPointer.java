package org.apache.xml.security.utils.resolver.implementations;

import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.IdResolver;
import org.apache.xml.security.utils.resolver.ResourceResolverException;
import org.apache.xml.security.utils.resolver.ResourceResolverSpi;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class ResolverXPointer extends ResourceResolverSpi {
    public static Log d;
    public static Class e;
    private static final int f;

    static {
        Class cls = e;
        if (cls == null) {
            cls = c(C0059ao.a(11448));
            e = cls;
        }
        d = LogFactory.getLog(cls.getName());
        f = 13;
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError().initCause(e2);
        }
    }

    private static boolean d(String str) {
        return str.equals(C0059ao.a(11449));
    }

    private static boolean e(String str) {
        if (str.startsWith(C0059ao.a(11450)) && str.endsWith(C0059ao.a(11451))) {
            String substring = str.substring(f, str.length() - 2);
            int length = substring.length() - 1;
            if ((substring.charAt(0) == '\"' && substring.charAt(length) == '\"') || (substring.charAt(0) == '\'' && substring.charAt(length) == '\'')) {
                if (d.isDebugEnabled()) {
                    Log log = d;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(C0059ao.a(11452));
                    stringBuffer.append(substring.substring(1, length));
                    log.debug(stringBuffer.toString());
                }
                return true;
            }
        }
        return false;
    }

    private static String f(String str) {
        if (str.startsWith(C0059ao.a(11453)) && str.endsWith(C0059ao.a(11454))) {
            String substring = str.substring(f, str.length() - 2);
            int length = substring.length() - 1;
            if ((substring.charAt(0) == '\"' && substring.charAt(length) == '\"') || (substring.charAt(0) == '\'' && substring.charAt(length) == '\'')) {
                return substring.substring(1, length);
            }
            return null;
        }
        return null;
    }

    @Override // org.apache.xml.security.utils.resolver.ResourceResolverSpi
    public XMLSignatureInput a(Attr attr, String str) {
        Document ownerDocument = attr.getOwnerElement().getOwnerDocument();
        String nodeValue = attr.getNodeValue();
        Node node = ownerDocument;
        if (!d(nodeValue)) {
            if (e(nodeValue)) {
                String f2 = f(nodeValue);
                Node a = IdResolver.a(ownerDocument, f2);
                node = a;
                if (a == null) {
                    throw new ResourceResolverException(C0059ao.a(11455), new Object[]{f2}, attr, str);
                }
            } else {
                node = null;
            }
        }
        XMLSignatureInput xMLSignatureInput = new XMLSignatureInput(node);
        xMLSignatureInput.a(C0059ao.a(11456));
        xMLSignatureInput.b((str == null || str.length() <= 0) ? attr.getNodeValue() : str.concat(attr.getNodeValue()));
        return xMLSignatureInput;
    }

    @Override // org.apache.xml.security.utils.resolver.ResourceResolverSpi
    public boolean a() {
        return true;
    }

    @Override // org.apache.xml.security.utils.resolver.ResourceResolverSpi
    public boolean b(Attr attr, String str) {
        if (attr == null) {
            return false;
        }
        String nodeValue = attr.getNodeValue();
        return d(nodeValue) || e(nodeValue);
    }
}
