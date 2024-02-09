package org.apache.xml.security.transforms;

import java.io.IOException;
import java.io.OutputStream;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Transforms extends SignatureElementProxy {
    public static Log a;
    public static Class c;
    public Element[] b;

    static {
        Class cls = c;
        if (cls == null) {
            cls = b(C0059ao.a(9155));
            c = cls;
        }
        a = LogFactory.getLog(cls.getName());
    }

    public Transforms() {
    }

    public Transforms(Document document) {
        super(document);
        XMLUtils.b(this.k);
    }

    public Transforms(Element element, String str) {
        super(element, str);
        if (a() == 0) {
            throw new TransformationException(C0059ao.a(9158), new Object[]{C0059ao.a(9156), C0059ao.a(9157)});
        }
    }

    private void a(Transform transform) {
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(9159));
            stringBuffer.append(transform.b());
            stringBuffer.append(C0059ao.a(9160));
            log.debug(stringBuffer.toString());
        }
        this.k.appendChild(transform.k());
        XMLUtils.b(this.k);
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public int a() {
        if (this.b == null) {
            this.b = XMLUtils.a(this.k.getFirstChild(), C0059ao.a(9161));
        }
        return this.b.length;
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream) {
        String a2 = C0059ao.a(9162);
        try {
            int a3 = a() - 1;
            for (int i = 0; i < a3; i++) {
                Transform a4 = a(i);
                if (a.isDebugEnabled()) {
                    Log log = a;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(C0059ao.a(9163));
                    stringBuffer.append(i);
                    stringBuffer.append(C0059ao.a(9164));
                    stringBuffer.append(a4.b());
                    stringBuffer.append(C0059ao.a(9165));
                    log.debug(stringBuffer.toString());
                }
                xMLSignatureInput = a4.a(xMLSignatureInput);
            }
            return a3 >= 0 ? a(a3).a(xMLSignatureInput, outputStream) : xMLSignatureInput;
        } catch (IOException e) {
            throw new TransformationException(a2, e);
        } catch (CanonicalizationException e2) {
            throw new TransformationException(a2, e2);
        } catch (InvalidCanonicalizerException e3) {
            throw new TransformationException(a2, e3);
        }
    }

    public Transform a(int i) {
        try {
            if (this.b == null) {
                this.b = XMLUtils.a(this.k.getFirstChild(), C0059ao.a(9166));
            }
            return new Transform(this.b[i], this.l);
        } catch (XMLSecurityException e) {
            throw new TransformationException(C0059ao.a(9167), e);
        }
    }

    public void a(String str) {
        try {
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(C0059ao.a(9168));
                stringBuffer.append(str);
                stringBuffer.append(C0059ao.a(9169));
                log.debug(stringBuffer.toString());
            }
            a(Transform.a(this.m, str));
        } catch (InvalidTransformException e) {
            throw new TransformationException(C0059ao.a(9170), e);
        }
    }

    @Override // org.apache.xml.security.utils.ElementProxy
    public String e() {
        return C0059ao.a(9171);
    }
}
