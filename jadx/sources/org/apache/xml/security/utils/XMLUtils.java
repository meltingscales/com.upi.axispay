package org.apache.xml.security.utils;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import myunmn.C0059ao;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class XMLUtils {
    private static boolean c = ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.xml.security.utils.XMLUtils.1
        @Override // java.security.PrivilegedAction
        public Object run() {
            return Boolean.valueOf(Boolean.getBoolean(C0059ao.a(13074)));
        }
    })).booleanValue();
    public static String a = null;
    private static Map d = Collections.synchronizedMap(new HashMap());
    public static String b = null;

    private XMLUtils() {
    }

    public static String a(Element element) {
        StringBuffer stringBuffer = new StringBuffer();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 3) {
                stringBuffer.append(((Text) item).getData());
            }
        }
        return stringBuffer.toString();
    }

    public static Document a(Set set) {
        Iterator it = set.iterator();
        NullPointerException e = null;
        while (it.hasNext()) {
            Node node = (Node) it.next();
            short nodeType = node.getNodeType();
            if (nodeType == 9) {
                return (Document) node;
            }
            try {
                return nodeType == 2 ? ((Attr) node).getOwnerElement().getOwnerDocument() : node.getOwnerDocument();
            } catch (NullPointerException e2) {
                e = e2;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(I18n.a(C0059ao.a(7662)));
        stringBuffer.append(C0059ao.a(7663));
        stringBuffer.append(e == null ? C0059ao.a(7664) : e.getMessage());
        stringBuffer.append(C0059ao.a(7665));
        throw new NullPointerException(stringBuffer.toString());
    }

    public static Element a(Document document, String str) {
        if (document != null) {
            String str2 = a;
            String a2 = C0059ao.a(7666);
            if (str2 == null || str2.length() == 0) {
                return document.createElementNS(a2, str);
            }
            String str3 = (String) d.get(str);
            if (str3 == null) {
                StringBuffer stringBuffer = new StringBuffer(a);
                stringBuffer.append(':');
                stringBuffer.append(str);
                str3 = stringBuffer.toString();
                d.put(str, str3);
            }
            return document.createElementNS(a2, str3);
        }
        throw new RuntimeException(C0059ao.a(7667));
    }

    public static Element a(Node node) {
        while (node != null && node.getNodeType() != 1) {
            node = node.getNextSibling();
        }
        return (Element) node;
    }

    public static Element a(Node node, String str, int i) {
        while (node != null) {
            if (C0059ao.a(7668).equals(node.getNamespaceURI()) && node.getLocalName().equals(str)) {
                if (i == 0) {
                    return (Element) node;
                }
                i--;
            }
            node = node.getNextSibling();
        }
        return null;
    }

    public static Element a(Node node, String str, String str2, int i) {
        while (node != null) {
            if (node.getNamespaceURI() != null && node.getNamespaceURI().equals(str) && node.getLocalName().equals(str2)) {
                if (i == 0) {
                    return (Element) node;
                }
                i--;
            }
            node = node.getNextSibling();
        }
        return null;
    }

    public static void a(Document document) {
        Element documentElement = document.getDocumentElement();
        String a2 = C0059ao.a(7669);
        String a3 = C0059ao.a(7670);
        if (documentElement.getAttributeNodeNS(a2, a3) == null) {
            documentElement.setAttributeNS(a2, a3, C0059ao.a(7671));
        }
        c(document);
    }

    public static void a(Node node, Set set, Node node2, boolean z) {
        if (node2 == null || !a(node2, node)) {
            b(node, set, node2, z);
        }
    }

    public static boolean a() {
        return c;
    }

    public static boolean a(Node node, Node node2) {
        if (node == node2) {
            return true;
        }
        while (node2 != null) {
            if (node2 == node) {
                return true;
            }
            node2 = node2.getNodeType() == 2 ? ((Attr) node2).getOwnerElement() : node2.getParentNode();
        }
        return false;
    }

    public static Element[] a(Node node, String str) {
        return a(node, C0059ao.a(7672), str);
    }

    public static Element[] a(Node node, String str, String str2) {
        int i = 20;
        Element[] elementArr = new Element[20];
        int i2 = 0;
        while (node != null) {
            if (node.getNamespaceURI() != null && node.getNamespaceURI().equals(str) && node.getLocalName().equals(str2)) {
                int i3 = i2 + 1;
                elementArr[i2] = (Element) node;
                if (i <= i3) {
                    int i4 = i << 2;
                    Element[] elementArr2 = new Element[i4];
                    System.arraycopy(elementArr, 0, elementArr2, 0, i);
                    i = i4;
                    i2 = i3;
                    elementArr = elementArr2;
                } else {
                    i2 = i3;
                }
            }
            node = node.getNextSibling();
        }
        Element[] elementArr3 = new Element[i2];
        System.arraycopy(elementArr, 0, elementArr3, 0, i2);
        return elementArr3;
    }

    public static Document b(Node node) {
        if (node.getNodeType() == 9) {
            return (Document) node;
        }
        try {
            return node.getOwnerDocument();
        } catch (NullPointerException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(I18n.a(C0059ao.a(7673)));
            stringBuffer.append(C0059ao.a(7674));
            stringBuffer.append(e.getMessage());
            stringBuffer.append(C0059ao.a(7675));
            throw new NullPointerException(stringBuffer.toString());
        }
    }

    public static Text b(Node node, String str, int i) {
        Element a2 = a(node, str, i);
        if (a2 == null) {
            return null;
        }
        Node firstChild = a2.getFirstChild();
        while (firstChild != null && firstChild.getNodeType() != 3) {
            firstChild = firstChild.getNextSibling();
        }
        return (Text) firstChild;
    }

    public static void b(Element element) {
        if (c) {
            return;
        }
        element.appendChild(element.getOwnerDocument().createTextNode(C0059ao.a(7676)));
    }

    public static final void b(Node node, Set set, Node node2, boolean z) {
        if (node == node2) {
            return;
        }
        short nodeType = node.getNodeType();
        if (nodeType != 1) {
            switch (nodeType) {
                case 8:
                    if (z) {
                        set.add(node);
                        return;
                    }
                    return;
                case 9:
                    break;
                case 10:
                    return;
                default:
                    set.add(node);
                    return;
            }
        } else {
            set.add(node);
            Element element = (Element) node;
            if (element.hasAttributes()) {
                NamedNodeMap attributes = element.getAttributes();
                for (int i = 0; i < attributes.getLength(); i++) {
                    set.add(attributes.item(i));
                }
            }
        }
        Node firstChild = node.getFirstChild();
        while (firstChild != null) {
            if (firstChild.getNodeType() == 3) {
                set.add(firstChild);
                while (firstChild != null && firstChild.getNodeType() == 3) {
                    firstChild = firstChild.getNextSibling();
                }
                if (firstChild == null) {
                    return;
                }
            }
            b(firstChild, set, node2, z);
            firstChild = firstChild.getNextSibling();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
        if (r2 != 9) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(org.w3c.dom.Node r10) {
        /*
            r0 = 0
            r1 = r0
        L2:
            short r2 = r10.getNodeType()
            r3 = 1
            if (r2 == r3) goto L11
            r3 = 5
            if (r2 == r3) goto L73
            r3 = 9
            if (r2 == r3) goto L73
            goto L1a
        L11:
            r2 = r10
            org.w3c.dom.Element r2 = (org.w3c.dom.Element) r2
            boolean r4 = r2.hasChildNodes()
            if (r4 != 0) goto L1c
        L1a:
            r10 = r1
            goto L7a
        L1c:
            boolean r0 = r2.hasAttributes()
            if (r0 == 0) goto L73
            org.w3c.dom.NamedNodeMap r0 = r2.getAttributes()
            int r1 = r0.getLength()
            org.w3c.dom.Node r2 = r2.getFirstChild()
        L2e:
            if (r2 == 0) goto L73
            short r4 = r2.getNodeType()
            if (r4 == r3) goto L37
            goto L6e
        L37:
            r4 = r2
            org.w3c.dom.Element r4 = (org.w3c.dom.Element) r4
            r5 = 0
        L3b:
            if (r5 >= r1) goto L6e
            org.w3c.dom.Node r6 = r0.item(r5)
            org.w3c.dom.Attr r6 = (org.w3c.dom.Attr) r6
            java.lang.String r7 = r6.getNamespaceURI()
            r8 = 7677(0x1dfd, float:1.0758E-41)
            java.lang.String r8 = myunmn.C0059ao.a(r8)
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L55
            goto L6b
        L55:
            java.lang.String r7 = r6.getLocalName()
            boolean r7 = r4.hasAttributeNS(r8, r7)
            if (r7 == 0) goto L60
            goto L6b
        L60:
            java.lang.String r7 = r6.getName()
            java.lang.String r6 = r6.getNodeValue()
            r4.setAttributeNS(r8, r7, r6)
        L6b:
            int r5 = r5 + 1
            goto L3b
        L6e:
            org.w3c.dom.Node r2 = r2.getNextSibling()
            goto L2e
        L73:
            org.w3c.dom.Node r0 = r10.getFirstChild()
            r9 = r0
            r0 = r10
            r10 = r9
        L7a:
            if (r10 != 0) goto L87
            if (r0 == 0) goto L87
            org.w3c.dom.Node r10 = r0.getNextSibling()
            org.w3c.dom.Node r0 = r0.getParentNode()
            goto L7a
        L87:
            if (r10 != 0) goto L8a
            return
        L8a:
            org.w3c.dom.Node r1 = r10.getNextSibling()
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.utils.XMLUtils.c(org.w3c.dom.Node):void");
    }
}
