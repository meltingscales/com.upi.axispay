package org.apache.xml.security.transforms.implementations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import myunmn.C0059ao;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.transforms.TransformSpi;
import org.apache.xml.security.transforms.TransformationException;
import org.apache.xml.security.transforms.params.XPath2FilterContainer;
import org.apache.xml.security.utils.CachedXPathAPIHolder;
import org.apache.xml.security.utils.CachedXPathFuncHereAPI;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class TransformXPath2Filter extends TransformSpi {
    public static Set a(List list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            NodeList nodeList = (NodeList) list.get(i);
            int length = nodeList.getLength();
            for (int i2 = 0; i2 < length; i2++) {
                hashSet.add(nodeList.item(i2));
            }
        }
        return hashSet;
    }

    @Override // org.apache.xml.security.transforms.TransformSpi
    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        String a = C0059ao.a(1964);
        String a2 = C0059ao.a(1965);
        String a3 = C0059ao.a(1966);
        CachedXPathAPIHolder.a(transform.k().getOwnerDocument());
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            CachedXPathFuncHereAPI cachedXPathFuncHereAPI = new CachedXPathFuncHereAPI(CachedXPathAPIHolder.a());
            int length = XMLUtils.a(transform.k().getFirstChild(), a2, a).length;
            if (length != 0) {
                Document b = xMLSignatureInput.m() != null ? XMLUtils.b(xMLSignatureInput.m()) : XMLUtils.a(xMLSignatureInput.b());
                for (int i = 0; i < length; i++) {
                    XPath2FilterContainer a4 = XPath2FilterContainer.a(XMLUtils.a(transform.k().getFirstChild(), a2, a, i), xMLSignatureInput.k());
                    NodeList a5 = cachedXPathFuncHereAPI.a(b, a4.f(), CachedXPathFuncHereAPI.a(a4.f()), a4.k());
                    if (a4.a()) {
                        arrayList3.add(a5);
                    } else if (a4.b()) {
                        arrayList2.add(a5);
                    } else if (a4.c()) {
                        arrayList.add(a5);
                    }
                }
                xMLSignatureInput.a(new XPath2NodeFilter(a(arrayList), a(arrayList2), a(arrayList3)));
                xMLSignatureInput.d(true);
                return xMLSignatureInput;
            }
            throw new TransformationException(C0059ao.a(1967), new Object[]{a2, a});
        } catch (IOException e) {
            throw new TransformationException(a3, e);
        } catch (ParserConfigurationException e2) {
            throw new TransformationException(a3, e2);
        } catch (TransformerException e3) {
            throw new TransformationException(a3, e3);
        } catch (CanonicalizationException e4) {
            throw new TransformationException(a3, e4);
        } catch (InvalidCanonicalizerException e5) {
            throw new TransformationException(a3, e5);
        } catch (XMLSecurityException e6) {
            throw new TransformationException(a3, e6);
        } catch (DOMException e7) {
            throw new TransformationException(a3, e7);
        } catch (SAXException e8) {
            throw new TransformationException(a3, e8);
        }
    }
}
