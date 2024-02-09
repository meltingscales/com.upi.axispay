package org.apache.xml.security.c14n.helper;

import java.io.Serializable;
import java.util.Comparator;
import myunmn.C0059ao;
import org.w3c.dom.Attr;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class AttrCompare implements Serializable, Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        String localName;
        String localName2;
        Attr attr = (Attr) obj;
        Attr attr2 = (Attr) obj2;
        String namespaceURI = attr.getNamespaceURI();
        String namespaceURI2 = attr2.getNamespaceURI();
        String a = C0059ao.a(7655);
        boolean equals = a.equals(namespaceURI);
        boolean equals2 = a.equals(namespaceURI2);
        if (equals) {
            if (equals2) {
                String localName3 = attr.getLocalName();
                String localName4 = attr2.getLocalName();
                String a2 = C0059ao.a(7656);
                boolean equals3 = a2.equals(localName3);
                String a3 = C0059ao.a(7657);
                if (equals3) {
                    localName3 = a3;
                }
                if (a2.equals(localName4)) {
                    localName4 = a3;
                }
                return localName3.compareTo(localName4);
            }
            return -1;
        } else if (equals2) {
            return 1;
        } else {
            if (namespaceURI == null) {
                if (namespaceURI2 != null) {
                    return -1;
                }
                localName = attr.getName();
                localName2 = attr2.getName();
            } else if (namespaceURI2 == null) {
                return 1;
            } else {
                int compareTo = namespaceURI.compareTo(namespaceURI2);
                if (compareTo != 0) {
                    return compareTo;
                }
                localName = attr.getLocalName();
                localName2 = attr2.getLocalName();
            }
            return localName.compareTo(localName2);
        }
    }
}
