package org.apache.xml.security.transforms.params;

import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;
import myunmn.C0059ao;
import org.apache.xml.security.transforms.TransformParam;
import org.apache.xml.security.utils.ElementProxy;
import org.w3c.dom.Element;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class InclusiveNamespaces extends ElementProxy implements TransformParam {
    public InclusiveNamespaces(Element element, String str) {
        super(element, str);
    }

    public static SortedSet a(String str) {
        TreeSet treeSet = new TreeSet();
        if (str != null && str.length() != 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, C0059ao.a(3212));
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                if (nextToken.equals(C0059ao.a(3213))) {
                    nextToken = C0059ao.a(3214);
                }
                treeSet.add(nextToken);
            }
        }
        return treeSet;
    }

    public String a() {
        return this.k.getAttributeNS(null, C0059ao.a(3215));
    }

    @Override // org.apache.xml.security.utils.ElementProxy
    public String d() {
        return C0059ao.a(3216);
    }

    @Override // org.apache.xml.security.utils.ElementProxy
    public String e() {
        return C0059ao.a(3217);
    }
}
