package org.apache.xml.security.c14n.implementations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import myunmn.C0059ao;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.helper.C14nHelper;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class Canonicalizer20010315 extends CanonicalizerBase {
    public boolean b;
    public final SortedSet c;
    public XmlAttrStack d;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class XmlAttrStack {
        public XmlsStackElement c;
        public int a = 0;
        public int b = 0;
        public List d = new ArrayList();

        /* compiled from: AxisPay */
        /* loaded from: classes2.dex */
        public static class XmlsStackElement {
            public int a;
            public boolean b = false;
            public List c = new ArrayList();
        }

        public void a(int i) {
            this.a = i;
            if (i == -1) {
                return;
            }
            this.c = null;
            while (this.b >= this.a) {
                List list = this.d;
                list.remove(list.size() - 1);
                if (this.d.size() == 0) {
                    this.b = 0;
                    return;
                } else {
                    List list2 = this.d;
                    this.b = ((XmlsStackElement) list2.get(list2.size() - 1)).a;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
            if ((r3.a + 1) == r6.a) goto L6;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(java.util.Collection r7) {
            /*
                r6 = this;
                java.util.List r0 = r6.d
                int r0 = r0.size()
                r1 = 1
                int r0 = r0 - r1
                org.apache.xml.security.c14n.implementations.Canonicalizer20010315$XmlAttrStack$XmlsStackElement r2 = r6.c
                if (r2 != 0) goto L1e
                org.apache.xml.security.c14n.implementations.Canonicalizer20010315$XmlAttrStack$XmlsStackElement r2 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315$XmlAttrStack$XmlsStackElement
                r2.<init>()
                r6.c = r2
                int r3 = r6.a
                r2.a = r3
                r6.b = r3
                java.util.List r3 = r6.d
                r3.add(r2)
            L1e:
                r2 = 0
                r3 = -1
                if (r0 != r3) goto L24
            L22:
                r2 = r1
                goto L38
            L24:
                java.util.List r3 = r6.d
                java.lang.Object r3 = r3.get(r0)
                org.apache.xml.security.c14n.implementations.Canonicalizer20010315$XmlAttrStack$XmlsStackElement r3 = (org.apache.xml.security.c14n.implementations.Canonicalizer20010315.XmlAttrStack.XmlsStackElement) r3
                boolean r4 = r3.b
                if (r4 == 0) goto L38
                int r3 = r3.a
                int r3 = r3 + r1
                int r4 = r6.a
                if (r3 != r4) goto L38
                goto L22
            L38:
                if (r2 == 0) goto L46
                org.apache.xml.security.c14n.implementations.Canonicalizer20010315$XmlAttrStack$XmlsStackElement r0 = r6.c
                java.util.List r0 = r0.c
                r7.addAll(r0)
                org.apache.xml.security.c14n.implementations.Canonicalizer20010315$XmlAttrStack$XmlsStackElement r7 = r6.c
                r7.b = r1
                return
            L46:
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
            L4b:
                if (r0 < 0) goto L7c
                java.util.List r3 = r6.d
                java.lang.Object r3 = r3.get(r0)
                org.apache.xml.security.c14n.implementations.Canonicalizer20010315$XmlAttrStack$XmlsStackElement r3 = (org.apache.xml.security.c14n.implementations.Canonicalizer20010315.XmlAttrStack.XmlsStackElement) r3
                java.util.List r3 = r3.c
                java.util.Iterator r3 = r3.iterator()
            L5b:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L79
                java.lang.Object r4 = r3.next()
                org.w3c.dom.Attr r4 = (org.w3c.dom.Attr) r4
                java.lang.String r5 = r4.getName()
                boolean r5 = r2.containsKey(r5)
                if (r5 != 0) goto L5b
                java.lang.String r5 = r4.getName()
                r2.put(r5, r4)
                goto L5b
            L79:
                int r0 = r0 + (-1)
                goto L4b
            L7c:
                org.apache.xml.security.c14n.implementations.Canonicalizer20010315$XmlAttrStack$XmlsStackElement r0 = r6.c
                r0.b = r1
                java.util.Collection r0 = r2.values()
                r7.addAll(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.c14n.implementations.Canonicalizer20010315.XmlAttrStack.a(java.util.Collection):void");
        }

        public void a(Attr attr) {
            if (this.c == null) {
                XmlsStackElement xmlsStackElement = new XmlsStackElement();
                this.c = xmlsStackElement;
                xmlsStackElement.a = this.a;
                this.d.add(xmlsStackElement);
                this.b = this.a;
            }
            this.c.c.add(attr);
        }
    }

    public Canonicalizer20010315(boolean z) {
        super(z);
        this.b = true;
        this.c = new TreeSet(CanonicalizerBase.g);
        this.d = new XmlAttrStack();
    }

    @Override // org.apache.xml.security.c14n.implementations.CanonicalizerBase
    public Iterator a(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        Node b;
        if (element.hasAttributes() || this.b) {
            SortedSet sortedSet = this.c;
            sortedSet.clear();
            NamedNodeMap attributes = element.getAttributes();
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                Attr attr = (Attr) attributes.item(i);
                if (C0059ao.a(9724).equals(attr.getNamespaceURI())) {
                    String localName = attr.getLocalName();
                    String value = attr.getValue();
                    if ((!C0059ao.a(9725).equals(localName) || !C0059ao.a(9726).equals(value)) && (b = nameSpaceSymbTable.b(localName, value, attr)) != null) {
                        sortedSet.add(b);
                        if (C14nHelper.a(attr)) {
                            throw new CanonicalizationException(C0059ao.a(9727), new Object[]{element.getTagName(), localName, attr.getNodeValue()});
                        }
                    }
                } else {
                    sortedSet.add(attr);
                }
            }
            if (this.b) {
                nameSpaceSymbTable.a(sortedSet);
                this.d.a(sortedSet);
                this.b = false;
            }
            return sortedSet.iterator();
        }
        return null;
    }

    @Override // org.apache.xml.security.c14n.implementations.CanonicalizerBase
    public void a(XMLSignatureInput xMLSignatureInput) {
        if (xMLSignatureInput.a()) {
            XMLUtils.a(xMLSignatureInput.m() != null ? XMLUtils.b(xMLSignatureInput.m()) : XMLUtils.a(xMLSignatureInput.b()));
        }
    }

    @Override // org.apache.xml.security.c14n.CanonicalizerSpi
    public byte[] a(Node node, String str) {
        throw new CanonicalizationException(C0059ao.a(9728));
    }

    @Override // org.apache.xml.security.c14n.implementations.CanonicalizerBase
    public Iterator b(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        int i;
        NamedNodeMap namedNodeMap;
        Node b;
        this.d.a(nameSpaceSymbTable.f());
        boolean z = a(element, nameSpaceSymbTable.f()) == 1;
        if (element.hasAttributes()) {
            namedNodeMap = element.getAttributes();
            i = namedNodeMap.getLength();
        } else {
            i = 0;
            namedNodeMap = null;
        }
        SortedSet sortedSet = this.c;
        sortedSet.clear();
        int i2 = 0;
        while (true) {
            String a = C0059ao.a(9729);
            String a2 = C0059ao.a(9730);
            if (i2 >= i) {
                if (z) {
                    Attr attributeNodeNS = element.getAttributeNodeNS(a, a2);
                    Node a3 = attributeNodeNS == null ? nameSpaceSymbTable.a(a2) : !c(attributeNodeNS) ? nameSpaceSymbTable.b(a2, C0059ao.a(9734), CanonicalizerBase.i) : null;
                    if (a3 != null) {
                        sortedSet.add(a3);
                    }
                    this.d.a(sortedSet);
                    nameSpaceSymbTable.a(sortedSet);
                }
                return sortedSet.iterator();
            }
            Attr attr = (Attr) namedNodeMap.item(i2);
            String namespaceURI = attr.getNamespaceURI();
            boolean equals = a.equals(namespaceURI);
            String a4 = C0059ao.a(9731);
            if (equals) {
                String localName = attr.getLocalName();
                String value = attr.getValue();
                if (!C0059ao.a(9732).equals(localName) || !a4.equals(value)) {
                    if (c(attr)) {
                        if ((z || !nameSpaceSymbTable.e(localName)) && (b = nameSpaceSymbTable.b(localName, value, attr)) != null) {
                            sortedSet.add(b);
                            if (C14nHelper.a(attr)) {
                                throw new CanonicalizationException(C0059ao.a(9733), new Object[]{element.getTagName(), localName, attr.getNodeValue()});
                            }
                        }
                    } else if (!z || a2.equals(localName)) {
                        nameSpaceSymbTable.a(localName, value, attr);
                    } else {
                        nameSpaceSymbTable.c(localName);
                    }
                }
            } else if (a4.equals(namespaceURI)) {
                this.d.a(attr);
            } else if (z) {
                sortedSet.add(attr);
            }
            i2++;
        }
    }

    @Override // org.apache.xml.security.c14n.implementations.CanonicalizerBase
    public void c(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        if (element.hasAttributes()) {
            this.d.a(-1);
            NamedNodeMap attributes = element.getAttributes();
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                Attr attr = (Attr) attributes.item(i);
                boolean equals = C0059ao.a(9735).equals(attr.getNamespaceURI());
                String a = C0059ao.a(9736);
                if (equals) {
                    String localName = attr.getLocalName();
                    String nodeValue = attr.getNodeValue();
                    if (!C0059ao.a(9737).equals(localName) || !a.equals(nodeValue)) {
                        nameSpaceSymbTable.a(localName, nodeValue, attr);
                    }
                } else if (a.equals(attr.getNamespaceURI())) {
                    this.d.a(attr);
                }
            }
        }
    }
}
