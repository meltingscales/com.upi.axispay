package org.apache.xml.security.signature;

import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.MessageDigestAlgorithm;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.transforms.TransformationException;
import org.apache.xml.security.transforms.Transforms;
import org.apache.xml.security.utils.Base64;
import org.apache.xml.security.utils.DigesterOutputStream;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.apache.xml.security.utils.UnsyncBufferedOutputStream;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xml.security.utils.resolver.ResourceResolver;
import org.apache.xml.security.utils.resolver.ResourceResolverException;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Reference extends SignatureElementProxy {
    public static Log a;
    public static Class d;
    private static boolean e = ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.xml.security.signature.Reference.1
        @Override // java.security.PrivilegedAction
        public Object run() {
            return Boolean.valueOf(Boolean.getBoolean(C0059ao.a(1094)));
        }
    })).booleanValue();
    public Manifest b;
    public XMLSignatureInput c;
    private Transforms f;
    private Element g;
    private Element h;

    static {
        Class cls = d;
        if (cls == null) {
            cls = a(C0059ao.a(1717));
            d = cls;
        }
        a = LogFactory.getLog(cls.getName());
    }

    public Reference(Element element, String str, Manifest manifest) {
        super(element, str);
        this.b = null;
        this.l = str;
        Element a2 = XMLUtils.a(element.getFirstChild());
        if (C0059ao.a(1718).equals(a2.getLocalName())) {
            if (C0059ao.a(1719).equals(a2.getNamespaceURI())) {
                this.f = new Transforms(a2, this.l);
                a2 = XMLUtils.a(a2.getNextSibling());
            }
        }
        this.g = a2;
        this.h = XMLUtils.a(a2.getNextSibling());
        this.b = manifest;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError().initCause(e2);
        }
    }

    private XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream) {
        String a2 = C0059ao.a(1720);
        try {
            Transforms h = h();
            if (h != null) {
                XMLSignatureInput a3 = h.a(xMLSignatureInput, outputStream);
                this.c = a3;
                return a3;
            }
            return xMLSignatureInput;
        } catch (CanonicalizationException e2) {
            throw new XMLSignatureException(a2, e2);
        } catch (InvalidCanonicalizerException e3) {
            throw new XMLSignatureException(a2, e3);
        } catch (TransformationException e4) {
            throw new XMLSignatureException(a2, e4);
        } catch (ResourceResolverException e5) {
            throw new XMLSignatureException(a2, e5);
        } catch (XMLSecurityException e6) {
            throw new XMLSignatureException(a2, e6);
        }
    }

    private byte[] a(boolean z) {
        String a2 = C0059ao.a(1721);
        try {
            MessageDigestAlgorithm a3 = a();
            a3.c();
            DigesterOutputStream digesterOutputStream = new DigesterOutputStream(a3);
            UnsyncBufferedOutputStream unsyncBufferedOutputStream = new UnsyncBufferedOutputStream(digesterOutputStream);
            XMLSignatureInput a4 = a(unsyncBufferedOutputStream);
            if (!e || z || a4.i() || a4.h()) {
                a4.a(unsyncBufferedOutputStream);
            } else {
                if (this.f == null) {
                    Transforms transforms = new Transforms(this.m);
                    this.f = transforms;
                    this.k.insertBefore(transforms.k(), this.g);
                }
                this.f.a(C0059ao.a(1722));
                a4.a(unsyncBufferedOutputStream, true);
            }
            unsyncBufferedOutputStream.flush();
            return digesterOutputStream.a();
        } catch (IOException e2) {
            throw new ReferenceNotInitializedException(a2, e2);
        } catch (XMLSecurityException e3) {
            throw new ReferenceNotInitializedException(a2, e3);
        }
    }

    public MessageDigestAlgorithm a() {
        String attributeNS;
        Element element = this.g;
        if (element == null || (attributeNS = element.getAttributeNS(null, C0059ao.a(1723))) == null) {
            return null;
        }
        return MessageDigestAlgorithm.a(this.m, attributeNS);
    }

    public XMLSignatureInput a(OutputStream outputStream) {
        try {
            XMLSignatureInput a2 = a(g(), outputStream);
            this.c = a2;
            return a2;
        } catch (XMLSecurityException e2) {
            throw new ReferenceNotInitializedException(C0059ao.a(1724), e2);
        }
    }

    public String b() {
        return this.k.getAttributeNS(null, C0059ao.a(1725));
    }

    public String c() {
        return this.k.getAttributeNS(null, C0059ao.a(1726));
    }

    @Override // org.apache.xml.security.utils.ElementProxy
    public String e() {
        return C0059ao.a(1727);
    }

    public boolean f() {
        return C0059ao.a(1728).equals(c());
    }

    public XMLSignatureInput g() {
        String a2 = C0059ao.a(1729);
        try {
            String str = null;
            Attr attributeNodeNS = this.k.getAttributeNodeNS(null, C0059ao.a(1730));
            if (attributeNodeNS != null) {
                str = attributeNodeNS.getNodeValue();
            }
            ResourceResolver a3 = ResourceResolver.a(attributeNodeNS, this.l, this.b.e);
            if (a3 != null) {
                a3.a(this.b.d);
                return a3.b(attributeNodeNS, this.l);
            }
            throw new ReferenceNotInitializedException(C0059ao.a(1731), new Object[]{str});
        } catch (ResourceResolverException e2) {
            throw new ReferenceNotInitializedException(a2, e2);
        } catch (XMLSecurityException e3) {
            throw new ReferenceNotInitializedException(a2, e3);
        }
    }

    public Transforms h() {
        return this.f;
    }

    public byte[] i() {
        Element element = this.h;
        if (element != null) {
            return Base64.a(element);
        }
        throw new XMLSecurityException(C0059ao.a(1734), new Object[]{C0059ao.a(1732), C0059ao.a(1733)});
    }

    public boolean j() {
        byte[] i = i();
        byte[] a2 = a(true);
        boolean a3 = MessageDigestAlgorithm.a(i, a2);
        String a4 = C0059ao.a(1735);
        if (a3) {
            Log log = a;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(1739));
            stringBuffer.append(b());
            stringBuffer.append(a4);
            log.debug(stringBuffer.toString());
        } else {
            Log log2 = a;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(C0059ao.a(1736));
            stringBuffer2.append(b());
            stringBuffer2.append(a4);
            log2.warn(stringBuffer2.toString());
            Log log3 = a;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(C0059ao.a(1737));
            stringBuffer3.append(Base64.b(i));
            log3.warn(stringBuffer3.toString());
            Log log4 = a;
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(C0059ao.a(1738));
            stringBuffer4.append(Base64.b(a2));
            log4.warn(stringBuffer4.toString());
        }
        return a3;
    }
}
