package org.apache.xml.security.transforms.implementations;

import java.io.BufferedInputStream;
import java.io.OutputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import myunmn.C0059ao;
import org.apache.xml.security.exceptions.Base64DecodingException;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.transforms.TransformSpi;
import org.apache.xml.security.transforms.TransformationException;
import org.apache.xml.security.utils.Base64;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class TransformBase64Decode extends TransformSpi {
    @Override // org.apache.xml.security.transforms.TransformSpi
    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream, Transform transform) {
        try {
            if (xMLSignatureInput.g()) {
                Node m = xMLSignatureInput.m();
                if (xMLSignatureInput.m().getNodeType() == 3) {
                    m = m.getParentNode();
                }
                StringBuffer stringBuffer = new StringBuffer();
                a((Element) m, stringBuffer);
                if (outputStream == null) {
                    return new XMLSignatureInput(Base64.a(stringBuffer.toString()));
                }
                Base64.a(stringBuffer.toString(), outputStream);
                XMLSignatureInput xMLSignatureInput2 = new XMLSignatureInput((byte[]) null);
                xMLSignatureInput2.b(outputStream);
                return xMLSignatureInput2;
            } else if (!xMLSignatureInput.h() && !xMLSignatureInput.f()) {
                try {
                    Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xMLSignatureInput.c()).getDocumentElement();
                    StringBuffer stringBuffer2 = new StringBuffer();
                    a(documentElement, stringBuffer2);
                    return new XMLSignatureInput(Base64.a(stringBuffer2.toString()));
                } catch (ParserConfigurationException e) {
                    throw new TransformationException(C0059ao.a(3014), e);
                } catch (SAXException e2) {
                    throw new TransformationException(C0059ao.a(3013), e2);
                }
            } else if (outputStream == null) {
                return new XMLSignatureInput(Base64.a(xMLSignatureInput.e()));
            } else {
                if (!xMLSignatureInput.j() && !xMLSignatureInput.f()) {
                    Base64.a(new BufferedInputStream(xMLSignatureInput.d()), outputStream);
                    XMLSignatureInput xMLSignatureInput3 = new XMLSignatureInput((byte[]) null);
                    xMLSignatureInput3.b(outputStream);
                    return xMLSignatureInput3;
                }
                Base64.a(xMLSignatureInput.e(), outputStream);
                XMLSignatureInput xMLSignatureInput32 = new XMLSignatureInput((byte[]) null);
                xMLSignatureInput32.b(outputStream);
                return xMLSignatureInput32;
            }
        } catch (Base64DecodingException e3) {
            throw new TransformationException(C0059ao.a(3015), e3);
        }
    }

    @Override // org.apache.xml.security.transforms.TransformSpi
    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        return a(xMLSignatureInput, null, transform);
    }

    public void a(Element element, StringBuffer stringBuffer) {
        for (Node firstChild = element.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            short nodeType = firstChild.getNodeType();
            if (nodeType == 1) {
                a((Element) firstChild, stringBuffer);
            } else if (nodeType == 3) {
                stringBuffer.append(((Text) firstChild).getData());
            }
        }
    }
}
