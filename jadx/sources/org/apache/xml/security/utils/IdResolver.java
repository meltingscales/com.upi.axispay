package org.apache.xml.security.utils;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class IdResolver {
    public static Class a;
    private static Log b;
    private static WeakHashMap c;
    private static List d;
    private static int e;

    static {
        Class cls = a;
        if (cls == null) {
            cls = a(C0059ao.a(2757));
            a = cls;
        }
        b = LogFactory.getLog(cls.getName());
        c = new WeakHashMap();
        List asList = Arrays.asList(C0059ao.a(2758), C0059ao.a(2759), C0059ao.a(2760), C0059ao.a(2761), C0059ao.a(2762), C0059ao.a(2763));
        d = asList;
        e = asList.size();
    }

    private IdResolver() {
    }

    public static int a(Element element, String str, Element[] elementArr) {
        if (element.hasAttributes()) {
            NamedNodeMap attributes = element.getAttributes();
            int indexOf = d.indexOf(element.getNamespaceURI());
            if (indexOf < 0) {
                indexOf = e;
            }
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                Attr attr = (Attr) attributes.item(i);
                int indexOf2 = attr.getNamespaceURI() == null ? indexOf : d.indexOf(attr.getNamespaceURI());
                if (indexOf2 < 0) {
                    indexOf2 = e;
                }
                String localName = attr.getLocalName();
                if (localName == null) {
                    localName = attr.getName();
                }
                if (localName.length() <= 2) {
                    String nodeValue = attr.getNodeValue();
                    if (localName.charAt(0) == 'I') {
                        char charAt = localName.charAt(1);
                        if (charAt == 'd' && nodeValue.equals(str)) {
                            elementArr[indexOf2] = element;
                            if (indexOf2 == 0) {
                                return 1;
                            }
                        } else if (charAt == 'D' && nodeValue.endsWith(str)) {
                            if (indexOf2 != 3) {
                                indexOf2 = e;
                            }
                            elementArr[indexOf2] = element;
                        }
                    } else if (C0059ao.a(2764).equals(localName) && nodeValue.equals(str)) {
                        if (indexOf2 != 2) {
                            indexOf2 = e;
                        }
                        elementArr[indexOf2] = element;
                    }
                }
            }
            String a2 = C0059ao.a(2765);
            String a3 = C0059ao.a(2766);
            if (indexOf == 3 && (element.getAttribute(C0059ao.a(2767)).equals(str) || element.getAttribute(a3).equals(str) || element.getAttribute(a2).equals(str))) {
                elementArr[3] = element;
            } else if (indexOf == 4 && element.getAttribute(C0059ao.a(2768)).equals(str)) {
                elementArr[4] = element;
            } else if (indexOf == 5 && (element.getAttribute(a3).equals(str) || element.getAttribute(a2).equals(str))) {
                elementArr[5] = element;
            }
            return 0;
        }
        return 0;
    }

    private static int a(Node node, String str, Element[] elementArr) {
        Element element = null;
        Node node2 = null;
        while (true) {
            short nodeType = node.getNodeType();
            if (nodeType != 1) {
                node = (nodeType == 9 || nodeType == 11) ? node.getFirstChild() : node2;
            } else {
                Element element2 = (Element) node;
                if (a(element2, str, elementArr) == 1) {
                    return 1;
                }
                Node firstChild = node.getFirstChild();
                if (firstChild != null) {
                    element = element2;
                } else if (element != null) {
                    node = node.getNextSibling();
                }
                node = firstChild;
            }
            while (node == null && element != null) {
                node = element.getNextSibling();
                element = element.getParentNode();
                if (element != null && 1 != element.getNodeType()) {
                    element = null;
                }
            }
            if (node == null) {
                return 1;
            }
            node2 = node.getNextSibling();
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError().initCause(e2);
        }
    }

    public static Element a(Document document, String str) {
        Log log;
        StringBuffer stringBuffer;
        String a2;
        Element c2 = c(document, str);
        if (c2 != null) {
            log = b;
            stringBuffer = new StringBuffer();
            a2 = C0059ao.a(2769);
        } else {
            c2 = b(document, str);
            if (c2 == null) {
                Element a3 = a((Node) document, str);
                if (a3 != null) {
                    a(a3, str);
                    return a3;
                }
                return null;
            }
            log = b;
            stringBuffer = new StringBuffer();
            a2 = C0059ao.a(2770);
        }
        stringBuffer.append(a2);
        stringBuffer.append(c2.getTagName());
        log.debug(stringBuffer.toString());
        return c2;
    }

    private static Element a(Node node, String str) {
        int i = e + 1;
        Element[] elementArr = new Element[i];
        a(node, str, elementArr);
        for (int i2 = 0; i2 < i; i2++) {
            if (elementArr[i2] != null) {
                return elementArr[i2];
            }
        }
        return null;
    }

    public static void a(Element element, String str) {
        WeakHashMap weakHashMap;
        Document ownerDocument = element.getOwnerDocument();
        synchronized (c) {
            weakHashMap = (WeakHashMap) c.get(ownerDocument);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                c.put(ownerDocument, weakHashMap);
            }
        }
        weakHashMap.put(str, new WeakReference(element));
    }

    private static Element b(Document document, String str) {
        if (b.isDebugEnabled()) {
            Log log = b;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(2771));
            stringBuffer.append(str);
            log.debug(stringBuffer.toString());
        }
        return document.getElementById(str);
    }

    private static Element c(Document document, String str) {
        WeakHashMap weakHashMap;
        WeakReference weakReference;
        if (b.isDebugEnabled()) {
            Log log = b;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(2772));
            stringBuffer.append(str);
            log.debug(stringBuffer.toString());
        }
        synchronized (c) {
            weakHashMap = (WeakHashMap) c.get(document);
        }
        if (weakHashMap == null || (weakReference = (WeakReference) weakHashMap.get(str)) == null) {
            return null;
        }
        return (Element) weakReference.get();
    }
}
