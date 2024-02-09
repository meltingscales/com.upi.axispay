package org.apache.xml.security.transforms.implementations;

import javax.xml.transform.TransformerException;
import myunmn.C0059ao;
import org.apache.xml.security.exceptions.XMLSecurityRuntimeException;
import org.apache.xml.security.signature.NodeFilter;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.transforms.TransformSpi;
import org.apache.xml.security.transforms.TransformationException;
import org.apache.xml.security.utils.CachedXPathAPIHolder;
import org.apache.xml.security.utils.CachedXPathFuncHereAPI;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xml.utils.PrefixResolver;
import org.apache.xml.utils.PrefixResolverDefault;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class TransformXPath extends TransformSpi {

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class XPathNodeFilter implements NodeFilter {
        public PrefixResolverDefault a;
        public CachedXPathFuncHereAPI b = new CachedXPathFuncHereAPI(CachedXPathAPIHolder.a());
        public Node c;
        public String d;

        public XPathNodeFilter(Element element, Node node, String str) {
            this.c = node;
            this.d = str;
            this.a = new PrefixResolverDefault(element);
        }

        @Override // org.apache.xml.security.signature.NodeFilter
        public int a(Node node) {
            try {
                return this.b.a(node, this.c, this.d, (PrefixResolver) this.a).bool() ? 1 : 0;
            } catch (TransformerException e) {
                throw new XMLSecurityRuntimeException(C0059ao.a(4077), new Object[]{node}, e);
            } catch (Exception e2) {
                throw new XMLSecurityRuntimeException(C0059ao.a(4076), new Object[]{node, new Short(node.getNodeType())}, e2);
            }
        }

        @Override // org.apache.xml.security.signature.NodeFilter
        public int a(Node node, int i) {
            return a(node);
        }
    }

    private boolean a(String str) {
        return (str.indexOf(C0059ao.a(11291)) == -1 && str.indexOf(C0059ao.a(11292)) == -1) ? false : true;
    }

    @Override // org.apache.xml.security.transforms.TransformSpi
    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        try {
            CachedXPathAPIHolder.a(transform.k().getOwnerDocument());
            Element a = XMLUtils.a(transform.k().getFirstChild(), C0059ao.a(11293), 0);
            if (a != null) {
                Node item = a.getChildNodes().item(0);
                String a2 = CachedXPathFuncHereAPI.a(item);
                xMLSignatureInput.a(a(a2));
                if (item != null) {
                    xMLSignatureInput.a(new XPathNodeFilter(a, item, a2));
                    xMLSignatureInput.d(true);
                    return xMLSignatureInput;
                }
                throw new DOMException((short) 3, C0059ao.a(11294));
            }
            throw new TransformationException(C0059ao.a(11297), new Object[]{C0059ao.a(11295), C0059ao.a(11296)});
        } catch (DOMException e) {
            throw new TransformationException(C0059ao.a(11298), e);
        }
    }
}
