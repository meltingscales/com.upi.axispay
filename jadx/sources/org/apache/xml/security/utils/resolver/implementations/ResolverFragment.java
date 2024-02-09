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
public class ResolverFragment extends ResourceResolverSpi {
    public static Log d;
    public static Class e;

    static {
        Class cls = e;
        if (cls == null) {
            cls = c(C0059ao.a(5327));
            e = cls;
        }
        d = LogFactory.getLog(cls.getName());
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError().initCause(e2);
        }
    }

    @Override // org.apache.xml.security.utils.resolver.ResourceResolverSpi
    public XMLSignatureInput a(Attr attr, String str) {
        Node node;
        String nodeValue = attr.getNodeValue();
        Document ownerDocument = attr.getOwnerElement().getOwnerDocument();
        if (nodeValue.equals(C0059ao.a(5328))) {
            d.debug(C0059ao.a(5329));
            node = ownerDocument;
        } else {
            String substring = nodeValue.substring(1);
            Node a = IdResolver.a(ownerDocument, substring);
            if (a == null) {
                throw new ResourceResolverException(C0059ao.a(5333), new Object[]{substring}, attr, str);
            }
            node = a;
            if (d.isDebugEnabled()) {
                Log log = d;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(C0059ao.a(5330));
                stringBuffer.append(substring);
                stringBuffer.append(C0059ao.a(5331));
                stringBuffer.append(a);
                log.debug(stringBuffer.toString());
                node = a;
            }
        }
        XMLSignatureInput xMLSignatureInput = new XMLSignatureInput(node);
        xMLSignatureInput.c(true);
        xMLSignatureInput.a(C0059ao.a(5332));
        String nodeValue2 = attr.getNodeValue();
        if (str != null) {
            nodeValue2 = str.concat(nodeValue2);
        }
        xMLSignatureInput.b(nodeValue2);
        return xMLSignatureInput;
    }

    @Override // org.apache.xml.security.utils.resolver.ResourceResolverSpi
    public boolean a() {
        return true;
    }

    @Override // org.apache.xml.security.utils.resolver.ResourceResolverSpi
    public boolean b(Attr attr, String str) {
        if (attr == null) {
            d.debug(C0059ao.a(5334));
            return false;
        }
        String nodeValue = attr.getNodeValue();
        boolean equals = nodeValue.equals(C0059ao.a(5335));
        String a = C0059ao.a(5336);
        if (equals || (nodeValue.charAt(0) == '#' && !(nodeValue.charAt(1) == 'x' && nodeValue.startsWith(C0059ao.a(5337))))) {
            if (d.isDebugEnabled()) {
                Log log = d;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(C0059ao.a(5339));
                stringBuffer.append(nodeValue);
                stringBuffer.append(a);
                log.debug(stringBuffer.toString());
            }
            return true;
        }
        if (d.isDebugEnabled()) {
            Log log2 = d;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(C0059ao.a(5338));
            stringBuffer2.append(nodeValue);
            stringBuffer2.append(a);
            log2.debug(stringBuffer2.toString());
        }
        return false;
    }
}
