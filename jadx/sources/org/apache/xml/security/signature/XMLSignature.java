package org.apache.xml.security.signature;

import java.io.IOException;
import java.security.Key;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.SignatureAlgorithm;
import org.apache.xml.security.exceptions.Base64DecodingException;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.keys.KeyInfo;
import org.apache.xml.security.utils.Base64;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.apache.xml.security.utils.SignerOutputStream;
import org.apache.xml.security.utils.UnsyncBufferedOutputStream;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Element;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class XMLSignature extends SignatureElementProxy {
    public static Log a;
    public static Class b;
    private SignedInfo c;
    private KeyInfo d;
    private boolean e;
    private Element f;
    private int g;

    static {
        Class cls = b;
        if (cls == null) {
            cls = a(C0059ao.a(8515));
            b = cls;
        }
        a = LogFactory.getLog(cls.getName());
    }

    public XMLSignature(Element element, String str) {
        super(element, str);
        this.c = null;
        this.d = null;
        this.e = false;
        this.g = 0;
        Element a2 = XMLUtils.a(element.getFirstChild());
        String a3 = C0059ao.a(8516);
        String a4 = C0059ao.a(8517);
        if (a2 == null) {
            throw new XMLSignatureException(a3, new Object[]{C0059ao.a(8521), a4});
        }
        this.c = new SignedInfo(a2, str);
        Element a5 = XMLUtils.a(XMLUtils.a(element.getFirstChild()).getNextSibling());
        this.f = a5;
        if (a5 == null) {
            throw new XMLSignatureException(a3, new Object[]{C0059ao.a(8520), a4});
        }
        Element a6 = XMLUtils.a(a5.getNextSibling());
        if (a6 != null && a6.getNamespaceURI().equals(C0059ao.a(8518)) && a6.getLocalName().equals(C0059ao.a(8519))) {
            this.d = new KeyInfo(a6, str);
        }
        this.g = 1;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public SignedInfo a() {
        return this.c;
    }

    public boolean a(Key key) {
        String a2 = C0059ao.a(8522);
        if (key != null) {
            try {
                SignedInfo a3 = a();
                SignatureAlgorithm c = a3.c();
                if (a.isDebugEnabled()) {
                    Log log = a;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(C0059ao.a(8523));
                    stringBuffer.append(c.a());
                    log.debug(stringBuffer.toString());
                    Log log2 = a;
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(C0059ao.a(8524));
                    stringBuffer2.append(c.b());
                    log2.debug(stringBuffer2.toString());
                    Log log3 = a;
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append(C0059ao.a(8525));
                    stringBuffer3.append(c.c());
                    log3.debug(stringBuffer3.toString());
                    Log log4 = a;
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append(C0059ao.a(8526));
                    stringBuffer4.append(key);
                    log4.debug(stringBuffer4.toString());
                }
                byte[] bArr = null;
                try {
                    c.a(key);
                    UnsyncBufferedOutputStream unsyncBufferedOutputStream = new UnsyncBufferedOutputStream(new SignerOutputStream(c));
                    a3.a(unsyncBufferedOutputStream);
                    unsyncBufferedOutputStream.close();
                    bArr = b();
                } catch (IOException unused) {
                    c.f();
                } catch (XMLSecurityException e) {
                    c.f();
                    throw e;
                }
                if (c.b(bArr)) {
                    return a3.b(this.e);
                }
                a.warn(C0059ao.a(8527));
                return false;
            } catch (XMLSignatureException e2) {
                throw e2;
            } catch (XMLSecurityException e3) {
                throw new XMLSignatureException(a2, e3);
            }
        }
        throw new XMLSignatureException(a2, new Object[]{C0059ao.a(8528)});
    }

    public byte[] b() {
        try {
            return Base64.a(this.f);
        } catch (Base64DecodingException e) {
            throw new XMLSignatureException(C0059ao.a(8529), e);
        }
    }

    @Override // org.apache.xml.security.utils.ElementProxy
    public String e() {
        return C0059ao.a(8530);
    }
}
