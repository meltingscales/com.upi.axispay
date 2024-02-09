package org.apache.xml.security.c14n.implementations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
public abstract class Canonicalizer11 extends CanonicalizerBase {
    public static Log d;
    public static Class f;
    public boolean b;
    public final SortedSet c;
    public XmlAttrStack e;

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

        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(java.util.Collection r14) {
            /*
                Method dump skipped, instructions count: 275
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.c14n.implementations.Canonicalizer11.XmlAttrStack.a(java.util.Collection):void");
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

    static {
        Class cls = f;
        if (cls == null) {
            cls = a(C0059ao.a(1108));
            f = cls;
        }
        d = LogFactory.getLog(cls.getName());
    }

    public Canonicalizer11(boolean z) {
        super(z);
        this.b = true;
        this.c = new TreeSet(CanonicalizerBase.g);
        this.e = new XmlAttrStack();
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public static String a(String str, String str2) {
        return b(str, str2);
    }

    private static void a(String str, String str2, String str3) {
        Log log;
        StringBuffer stringBuffer;
        String a;
        if (d.isDebugEnabled()) {
            Log log2 = d;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(C0059ao.a(1109));
            stringBuffer2.append(str);
            stringBuffer2.append(C0059ao.a(1110));
            stringBuffer2.append(str2);
            log2.debug(stringBuffer2.toString());
            if (str2.length() == 0) {
                log = d;
                stringBuffer = new StringBuffer();
                a = C0059ao.a(1111);
            } else {
                log = d;
                stringBuffer = new StringBuffer();
                a = C0059ao.a(1112);
            }
            stringBuffer.append(a);
            stringBuffer.append(str3);
            log.debug(stringBuffer.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0125, code lost:
        if (r14.charAt(0) == '/') goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0127, code lost:
        r14 = r14.substring(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0173, code lost:
        if (r14.charAt(0) == '/') goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String b(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.c14n.implementations.Canonicalizer11.b(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
        if (r2 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String b(java.lang.String r14, java.lang.String r15) {
        /*
            r0 = 1132(0x46c, float:1.586E-42)
            java.lang.String r0 = myunmn.C0059ao.a(r0)
            r1 = 0
            if (r14 == 0) goto L3f
            r2 = 1133(0x46d, float:1.588E-42)
            java.lang.String r2 = myunmn.C0059ao.a(r2)
            boolean r2 = r14.endsWith(r2)
            if (r2 == 0) goto L26
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r2.append(r14)
            r2.append(r0)
            java.lang.String r14 = r2.toString()
        L26:
            java.net.URI r2 = new java.net.URI
            r2.<init>(r14)
            java.lang.String r14 = r2.getScheme()
            java.lang.String r3 = r2.getAuthority()
            java.lang.String r4 = r2.getPath()
            java.lang.String r5 = r2.getQuery()
            r2.getFragment()
            goto L49
        L3f:
            r4 = 1134(0x46e, float:1.589E-42)
            java.lang.String r4 = myunmn.C0059ao.a(r4)
            r14 = r1
            r3 = r14
            r5 = r3
        L49:
            java.net.URI r2 = new java.net.URI
            r2.<init>(r15)
            java.lang.String r15 = r2.getScheme()
            java.lang.String r6 = r2.getAuthority()
            java.lang.String r7 = r2.getPath()
            java.lang.String r2 = r2.getQuery()
            r13 = 0
            if (r15 == 0) goto L68
            boolean r8 = r15.equals(r14)
            if (r8 == 0) goto L68
            goto L69
        L68:
            r1 = r15
        L69:
            if (r1 == 0) goto L75
            java.lang.String r14 = b(r7)
            r11 = r14
            r9 = r1
            r12 = r2
            r10 = r6
            goto Ld2
        L75:
            if (r6 == 0) goto L7d
            java.lang.String r15 = b(r7)
            r3 = r6
            goto Lce
        L7d:
            int r15 = r7.length()
            if (r15 != 0) goto L87
            if (r2 == 0) goto Lcc
        L85:
            r5 = r2
            goto Lcc
        L87:
            boolean r15 = r7.startsWith(r0)
            if (r15 == 0) goto L93
        L8d:
            java.lang.String r15 = b(r7)
            r4 = r15
            goto L85
        L93:
            if (r3 == 0) goto Lab
            int r15 = r4.length()
            if (r15 != 0) goto Lab
            java.lang.StringBuffer r15 = new java.lang.StringBuffer
            r15.<init>()
            r15.append(r0)
            r15.append(r7)
            java.lang.String r7 = r15.toString()
            goto L8d
        Lab:
            r15 = 47
            int r15 = r4.lastIndexOf(r15)
            r0 = -1
            if (r15 != r0) goto Lb5
            goto L8d
        Lb5:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
            int r15 = r15 + 1
            java.lang.String r15 = r4.substring(r1, r15)
            r0.append(r15)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            goto L8d
        Lcc:
            r15 = r4
            r2 = r5
        Lce:
            r9 = r14
            r11 = r15
            r12 = r2
            r10 = r3
        Ld2:
            java.net.URI r14 = new java.net.URI
            r8 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r14 = r14.toString()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.c14n.implementations.Canonicalizer11.b(java.lang.String, java.lang.String):java.lang.String");
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
                if (C0059ao.a(1135).equals(attr.getNamespaceURI())) {
                    String localName = attr.getLocalName();
                    String value = attr.getValue();
                    if ((!C0059ao.a(1136).equals(localName) || !C0059ao.a(1137).equals(value)) && (b = nameSpaceSymbTable.b(localName, value, attr)) != null) {
                        sortedSet.add(b);
                        if (C14nHelper.a(attr)) {
                            throw new CanonicalizationException(C0059ao.a(1138), new Object[]{element.getTagName(), localName, attr.getNodeValue()});
                        }
                    }
                } else {
                    sortedSet.add(attr);
                }
            }
            if (this.b) {
                nameSpaceSymbTable.a(sortedSet);
                this.e.a(sortedSet);
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
        throw new CanonicalizationException(C0059ao.a(1139));
    }

    @Override // org.apache.xml.security.c14n.implementations.CanonicalizerBase
    public Iterator b(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        int i;
        NamedNodeMap namedNodeMap;
        Node b;
        this.e.a(nameSpaceSymbTable.f());
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
            String a = C0059ao.a(1140);
            String a2 = C0059ao.a(1141);
            if (i2 >= i) {
                if (z) {
                    Attr attributeNodeNS = element.getAttributeNodeNS(a, a2);
                    Node a3 = attributeNodeNS == null ? nameSpaceSymbTable.a(a2) : !c(attributeNodeNS) ? nameSpaceSymbTable.b(a2, C0059ao.a(1146), CanonicalizerBase.i) : null;
                    if (a3 != null) {
                        sortedSet.add(a3);
                    }
                    this.e.a(sortedSet);
                    nameSpaceSymbTable.a(sortedSet);
                }
                return sortedSet.iterator();
            }
            Attr attr = (Attr) namedNodeMap.item(i2);
            String namespaceURI = attr.getNamespaceURI();
            boolean equals = a.equals(namespaceURI);
            String a4 = C0059ao.a(1142);
            if (equals) {
                String localName = attr.getLocalName();
                String value = attr.getValue();
                if (!C0059ao.a(1144).equals(localName) || !a4.equals(value)) {
                    if (c(attr)) {
                        if ((z || !nameSpaceSymbTable.e(localName)) && (b = nameSpaceSymbTable.b(localName, value, attr)) != null) {
                            sortedSet.add(b);
                            if (C14nHelper.a(attr)) {
                                throw new CanonicalizationException(C0059ao.a(1145), new Object[]{element.getTagName(), localName, attr.getNodeValue()});
                            }
                        }
                    } else if (!z || a2.equals(localName)) {
                        nameSpaceSymbTable.a(localName, value, attr);
                    } else {
                        nameSpaceSymbTable.c(localName);
                    }
                }
            } else if (!a4.equals(namespaceURI)) {
                if (!z) {
                }
                sortedSet.add(attr);
            } else if (attr.getLocalName().equals(C0059ao.a(1143))) {
                if (!z) {
                }
                sortedSet.add(attr);
            } else {
                this.e.a(attr);
            }
            i2++;
        }
    }

    @Override // org.apache.xml.security.c14n.implementations.CanonicalizerBase
    public void c(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        if (element.hasAttributes()) {
            this.e.a(-1);
            NamedNodeMap attributes = element.getAttributes();
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                Attr attr = (Attr) attributes.item(i);
                boolean equals = C0059ao.a(1147).equals(attr.getNamespaceURI());
                String a = C0059ao.a(1148);
                if (equals) {
                    String localName = attr.getLocalName();
                    String nodeValue = attr.getNodeValue();
                    if (!C0059ao.a(1149).equals(localName) || !a.equals(nodeValue)) {
                        nameSpaceSymbTable.a(localName, nodeValue, attr);
                    }
                } else if (!a.equals(attr.getNamespaceURI())) {
                    this.e.a(attr);
                }
            }
        }
    }
}
