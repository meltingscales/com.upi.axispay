package org.apache.xml.security.utils;

import myunmn.C0059ao;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class SignatureElementProxy extends ElementProxy {
    public SignatureElementProxy() {
    }

    public SignatureElementProxy(Document document) {
        if (document == null) {
            throw new RuntimeException(C0059ao.a(1629));
        }
        this.m = document;
        this.k = XMLUtils.a(document, e());
    }

    public SignatureElementProxy(Element element, String str) {
        super(element, str);
    }

    @Override // org.apache.xml.security.utils.ElementProxy
    public String d() {
        return C0059ao.a(1630);
    }
}
