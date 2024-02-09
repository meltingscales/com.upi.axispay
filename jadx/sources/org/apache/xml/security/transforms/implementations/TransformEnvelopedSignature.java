package org.apache.xml.security.transforms.implementations;

import myunmn.C0059ao;
import org.apache.xml.security.signature.NodeFilter;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.transforms.TransformSpi;
import org.apache.xml.security.transforms.TransformationException;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class TransformEnvelopedSignature extends TransformSpi {

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class EnvelopedNodeFilter implements NodeFilter {
        public Node a;

        public EnvelopedNodeFilter(Node node) {
            this.a = node;
        }

        @Override // org.apache.xml.security.signature.NodeFilter
        public int a(Node node) {
            Node node2 = this.a;
            return (node == node2 || XMLUtils.a(node2, node)) ? -1 : 1;
        }

        @Override // org.apache.xml.security.signature.NodeFilter
        public int a(Node node, int i) {
            return node == this.a ? -1 : 1;
        }
    }

    private static Node a(Node node) {
        boolean z;
        while (node != null && node.getNodeType() != 9) {
            Element element = (Element) node;
            if (element.getNamespaceURI().equals(C0059ao.a(11055)) && element.getLocalName().equals(C0059ao.a(11056))) {
                z = true;
                break;
            }
            node = node.getParentNode();
        }
        z = false;
        if (z) {
            return node;
        }
        throw new TransformationException(C0059ao.a(11057));
    }

    @Override // org.apache.xml.security.transforms.TransformSpi
    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        Node a = a(transform.k());
        xMLSignatureInput.a(a);
        xMLSignatureInput.a(new EnvelopedNodeFilter(a));
        return xMLSignatureInput;
    }
}
