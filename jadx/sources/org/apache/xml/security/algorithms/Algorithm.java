package org.apache.xml.security.algorithms;

import myunmn.C0059ao;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class Algorithm extends SignatureElementProxy {
    public Algorithm(Document document, String str) {
        super(document);
        a(str);
    }

    public Algorithm(Element element, String str) {
        super(element, str);
    }

    public String a() {
        return this.k.getAttributeNS(null, C0059ao.a(2027));
    }

    public void a(String str) {
        if (str != null) {
            this.k.setAttributeNS(null, C0059ao.a(2028), str);
        }
    }
}
