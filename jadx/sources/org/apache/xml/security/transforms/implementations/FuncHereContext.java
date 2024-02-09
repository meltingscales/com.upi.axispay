package org.apache.xml.security.transforms.implementations;

import myunmn.C0059ao;
import org.apache.xml.dtm.DTMManager;
import org.apache.xml.security.utils.I18n;
import org.apache.xpath.XPathContext;
import org.w3c.dom.Node;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class FuncHereContext extends XPathContext {
    private FuncHereContext() {
    }

    public FuncHereContext(Node node, DTMManager dTMManager) {
        super(node);
        try {
            ((XPathContext) this).m_dtmManager = dTMManager;
        } catch (IllegalAccessError e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(I18n.a(C0059ao.a(2114)));
            stringBuffer.append(C0059ao.a(2115));
            stringBuffer.append(e.getMessage());
            stringBuffer.append(C0059ao.a(2116));
            throw new IllegalAccessError(stringBuffer.toString());
        }
    }
}
