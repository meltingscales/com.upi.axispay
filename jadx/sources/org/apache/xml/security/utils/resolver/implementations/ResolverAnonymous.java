package org.apache.xml.security.utils.resolver.implementations;

import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.resolver.ResourceResolverSpi;
import org.w3c.dom.Attr;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class ResolverAnonymous extends ResourceResolverSpi {
    private XMLSignatureInput d;

    @Override // org.apache.xml.security.utils.resolver.ResourceResolverSpi
    public XMLSignatureInput a(Attr attr, String str) {
        return this.d;
    }

    @Override // org.apache.xml.security.utils.resolver.ResourceResolverSpi
    public boolean b(Attr attr, String str) {
        return attr == null;
    }
}
