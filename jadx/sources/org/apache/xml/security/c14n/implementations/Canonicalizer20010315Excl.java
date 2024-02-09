package org.apache.xml.security.c14n.implementations;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import myunmn.C0059ao;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.helper.C14nHelper;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.params.InclusiveNamespaces;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class Canonicalizer20010315Excl extends CanonicalizerBase {
    public TreeSet b;
    public final SortedSet c;

    public Canonicalizer20010315Excl(boolean z) {
        super(z);
        this.b = new TreeSet();
        this.c = new TreeSet(CanonicalizerBase.g);
    }

    @Override // org.apache.xml.security.c14n.implementations.CanonicalizerBase
    public Iterator a(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        NamedNodeMap namedNodeMap;
        int i;
        String prefix;
        SortedSet sortedSet = this.c;
        sortedSet.clear();
        if (element.hasAttributes()) {
            namedNodeMap = element.getAttributes();
            i = namedNodeMap.getLength();
        } else {
            namedNodeMap = null;
            i = 0;
        }
        SortedSet<String> sortedSet2 = (SortedSet) this.b.clone();
        int i2 = 0;
        while (true) {
            String a = C0059ao.a(13634);
            if (i2 >= i) {
                if (element.getNamespaceURI() != null && (prefix = element.getPrefix()) != null && prefix.length() != 0) {
                    a = prefix;
                }
                sortedSet2.add(a);
                for (String str : sortedSet2) {
                    Attr a2 = nameSpaceSymbTable.a(str);
                    if (a2 != null) {
                        sortedSet.add(a2);
                    }
                }
                return sortedSet.iterator();
            }
            Attr attr = (Attr) namedNodeMap.item(i2);
            boolean equals = C0059ao.a(13635).equals(attr.getNamespaceURI());
            String a3 = C0059ao.a(13636);
            if (equals) {
                String localName = attr.getLocalName();
                String nodeValue = attr.getNodeValue();
                if ((!a3.equals(localName) || !C0059ao.a(13637).equals(nodeValue)) && nameSpaceSymbTable.a(localName, nodeValue, attr) && C14nHelper.a(nodeValue)) {
                    throw new CanonicalizationException(C0059ao.a(13638), new Object[]{element.getTagName(), localName, attr.getNodeValue()});
                }
            } else {
                String prefix2 = attr.getPrefix();
                if (prefix2 != null && !prefix2.equals(a3) && !prefix2.equals(a)) {
                    sortedSet2.add(prefix2);
                }
                sortedSet.add(attr);
            }
            i2++;
        }
    }

    @Override // org.apache.xml.security.c14n.implementations.CanonicalizerBase
    public void a(XMLSignatureInput xMLSignatureInput) {
        if (!xMLSignatureInput.a() || this.b.isEmpty()) {
            return;
        }
        XMLUtils.a(xMLSignatureInput.m() != null ? XMLUtils.b(xMLSignatureInput.m()) : XMLUtils.a(xMLSignatureInput.b()));
    }

    public byte[] a(XMLSignatureInput xMLSignatureInput, String str) {
        this.b = (TreeSet) InclusiveNamespaces.a(str);
        return super.b(xMLSignatureInput);
    }

    @Override // org.apache.xml.security.c14n.implementations.CanonicalizerBase, org.apache.xml.security.c14n.CanonicalizerSpi
    public byte[] a(Node node) {
        return a(node, C0059ao.a(13639), (Node) null);
    }

    @Override // org.apache.xml.security.c14n.CanonicalizerSpi
    public byte[] a(Node node, String str) {
        return a(node, str, (Node) null);
    }

    public byte[] a(Node node, String str, Node node2) {
        this.b = (TreeSet) InclusiveNamespaces.a(str);
        return super.a(node, node2);
    }

    @Override // org.apache.xml.security.c14n.implementations.CanonicalizerBase
    public final Iterator b(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        NamedNodeMap namedNodeMap;
        int i;
        String prefix;
        Node b;
        SortedSet sortedSet = this.c;
        sortedSet.clear();
        if (element.hasAttributes()) {
            namedNodeMap = element.getAttributes();
            i = namedNodeMap.getLength();
        } else {
            namedNodeMap = null;
            i = 0;
        }
        boolean z = a(element, nameSpaceSymbTable.f()) == 1;
        Set<String> set = z ? (Set) this.b.clone() : null;
        int i2 = 0;
        while (true) {
            String a = C0059ao.a(13640);
            String a2 = C0059ao.a(13641);
            if (i2 >= i) {
                if (z) {
                    Attr attributeNodeNS = element.getAttributeNodeNS(a, a2);
                    if (attributeNodeNS != null && !c(attributeNodeNS)) {
                        nameSpaceSymbTable.a(a2, C0059ao.a(13644), CanonicalizerBase.i);
                    }
                    if (element.getNamespaceURI() == null || (prefix = element.getPrefix()) == null || prefix.length() == 0) {
                        set.add(a2);
                    } else {
                        set.add(prefix);
                    }
                    for (String str : set) {
                        Attr a3 = nameSpaceSymbTable.a(str);
                        if (a3 != null) {
                            sortedSet.add(a3);
                        }
                    }
                }
                return sortedSet.iterator();
            }
            Attr attr = (Attr) namedNodeMap.item(i2);
            if (a.equals(attr.getNamespaceURI())) {
                String localName = attr.getLocalName();
                if (!z || c(attr) || a2.equals(localName)) {
                    String nodeValue = attr.getNodeValue();
                    String a4 = C0059ao.a(13643);
                    if (!z && c(attr) && this.b.contains(localName) && !nameSpaceSymbTable.e(localName) && (b = nameSpaceSymbTable.b(localName, nodeValue, attr)) != null) {
                        sortedSet.add(b);
                        if (C14nHelper.a(attr)) {
                            throw new CanonicalizationException(a4, new Object[]{element.getTagName(), localName, attr.getNodeValue()});
                        }
                    }
                    if (nameSpaceSymbTable.a(localName, nodeValue, attr) && C14nHelper.a(nodeValue)) {
                        throw new CanonicalizationException(a4, new Object[]{element.getTagName(), localName, attr.getNodeValue()});
                    }
                } else {
                    nameSpaceSymbTable.d(localName);
                }
            } else if (c(attr) && z) {
                String prefix2 = attr.getPrefix();
                if (prefix2 != null && !prefix2.equals(C0059ao.a(13642)) && !prefix2.equals(a2)) {
                    set.add(prefix2);
                }
                sortedSet.add(attr);
            }
            i2++;
        }
    }
}
