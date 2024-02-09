package org.apache.xml.security.transforms.params;

import myunmn.C0059ao;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.transforms.TransformParam;
import org.apache.xml.security.utils.ElementProxy;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class XPath2FilterContainer extends ElementProxy implements TransformParam {
    private XPath2FilterContainer() {
    }

    private XPath2FilterContainer(Element element, String str) {
        super(element, str);
        Element element2 = this.k;
        String a = C0059ao.a(15668);
        String attributeNS = element2.getAttributeNS(null, a);
        if (!attributeNS.equals(C0059ao.a(15669)) && !attributeNS.equals(C0059ao.a(15670)) && !attributeNS.equals(C0059ao.a(15671))) {
            throw new XMLSecurityException(C0059ao.a(15673), new Object[]{a, attributeNS, C0059ao.a(15672)});
        }
    }

    public static XPath2FilterContainer a(Element element, String str) {
        return new XPath2FilterContainer(element, str);
    }

    public boolean a() {
        return this.k.getAttributeNS(null, C0059ao.a(15674)).equals(C0059ao.a(15675));
    }

    public boolean b() {
        return this.k.getAttributeNS(null, C0059ao.a(15676)).equals(C0059ao.a(15677));
    }

    public boolean c() {
        return this.k.getAttributeNS(null, C0059ao.a(15678)).equals(C0059ao.a(15679));
    }

    @Override // org.apache.xml.security.utils.ElementProxy
    public final String d() {
        return C0059ao.a(15680);
    }

    @Override // org.apache.xml.security.utils.ElementProxy
    public final String e() {
        return C0059ao.a(15681);
    }

    public Node f() {
        NodeList childNodes = this.k.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            if (childNodes.item(i).getNodeType() == 3) {
                return childNodes.item(i);
            }
        }
        return null;
    }
}
