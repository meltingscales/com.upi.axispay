package org.apache.xml.security.signature;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import myunmn.C0059ao;
import org.apache.xml.security.algorithms.SignatureAlgorithm;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.transforms.params.InclusiveNamespaces;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class SignedInfo extends Manifest {
    private SignatureAlgorithm g;
    private byte[] h;
    private Element i;
    private Element q;

    public SignedInfo(Element element, String str) {
        super(a(element), str);
        this.g = null;
        this.h = null;
        Element a = XMLUtils.a(element.getFirstChild());
        this.i = a;
        this.q = XMLUtils.a(a.getNextSibling());
        this.g = new SignatureAlgorithm(this.q, l());
    }

    private static Element a(Element element) {
        String a = C0059ao.a(4739);
        String attributeNS = XMLUtils.a(element.getFirstChild()).getAttributeNS(null, C0059ao.a(4740));
        if (attributeNS.equals(C0059ao.a(4741)) || attributeNS.equals(C0059ao.a(4742)) || attributeNS.equals(C0059ao.a(4743)) || attributeNS.equals(C0059ao.a(4744)) || attributeNS.equals(C0059ao.a(4745)) || attributeNS.equals(C0059ao.a(4746))) {
            return element;
        }
        try {
            byte[] a2 = Canonicalizer.a(attributeNS).a(element);
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            Node importNode = element.getOwnerDocument().importNode(newInstance.newDocumentBuilder().parse(new ByteArrayInputStream(a2)).getDocumentElement(), true);
            element.getParentNode().replaceChild(importNode, element);
            return (Element) importNode;
        } catch (IOException e) {
            throw new XMLSecurityException(a, e);
        } catch (ParserConfigurationException e2) {
            throw new XMLSecurityException(a, e2);
        } catch (SAXException e3) {
            throw new XMLSecurityException(a, e3);
        }
    }

    public void a(OutputStream outputStream) {
        byte[] bArr = this.h;
        if (bArr != null) {
            try {
                outputStream.write(bArr);
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Canonicalizer a = Canonicalizer.a(b());
        a.a(outputStream);
        String f = f();
        if (f == null) {
            a.a(this.k);
        } else {
            a.a(this.k, f);
        }
    }

    public String b() {
        return this.i.getAttributeNS(null, C0059ao.a(4747));
    }

    public boolean b(boolean z) {
        return super.a(z);
    }

    public SignatureAlgorithm c() {
        return this.g;
    }

    @Override // org.apache.xml.security.signature.Manifest, org.apache.xml.security.utils.ElementProxy
    public String e() {
        return C0059ao.a(4748);
    }

    public String f() {
        Element a;
        String attributeNS = this.i.getAttributeNS(null, C0059ao.a(4749));
        String a2 = C0059ao.a(4750);
        if ((attributeNS.equals(a2) || attributeNS.equals(C0059ao.a(4751))) && (a = XMLUtils.a(this.i.getFirstChild())) != null) {
            try {
                return new InclusiveNamespaces(a, a2).a();
            } catch (XMLSecurityException unused) {
            }
        }
        return null;
    }
}
