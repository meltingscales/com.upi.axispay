package org.apache.xml.security.signature;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.utils.I18n;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Manifest extends SignatureElementProxy {
    public static Log a;
    public static Class f;
    public List b;
    public Element[] c;
    public HashMap d;
    public List e;
    private boolean[] g;

    static {
        Class cls = f;
        if (cls == null) {
            cls = a(C0059ao.a(8618));
            f = cls;
        }
        a = LogFactory.getLog(cls.getName());
    }

    public Manifest(Element element, String str) {
        super(element, str);
        this.g = null;
        this.d = null;
        this.e = null;
        Node firstChild = this.k.getFirstChild();
        String a2 = C0059ao.a(8619);
        Element[] a3 = XMLUtils.a(firstChild, a2);
        this.c = a3;
        int length = a3.length;
        if (length == 0) {
            throw new DOMException((short) 4, I18n.a(C0059ao.a(8621), new Object[]{a2, C0059ao.a(8620)}));
        }
        this.b = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            this.b.add(null);
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    private void a(int i, boolean z) {
        if (this.g == null) {
            this.g = new boolean[a()];
        }
        this.g[i] = z;
    }

    public int a() {
        return this.b.size();
    }

    public boolean a(boolean z) {
        if (this.c == null) {
            this.c = XMLUtils.a(this.k.getFirstChild(), C0059ao.a(8622));
        }
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(8623));
            stringBuffer.append(this.c.length);
            stringBuffer.append(C0059ao.a(8624));
            log.debug(stringBuffer.toString());
            Log log2 = a;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(C0059ao.a(8625));
            stringBuffer2.append(z ? C0059ao.a(8626) : C0059ao.a(8627));
            stringBuffer2.append(C0059ao.a(8628));
            log2.debug(stringBuffer2.toString());
        }
        Element[] elementArr = this.c;
        int length = elementArr.length;
        String a2 = C0059ao.a(8629);
        if (length != 0) {
            this.g = new boolean[elementArr.length];
            boolean z2 = true;
            for (int i = 0; i < this.c.length; i++) {
                Reference reference = new Reference(this.c[i], this.l, this);
                this.b.set(i, reference);
                try {
                    boolean j = reference.j();
                    a(i, j);
                    if (!j) {
                        z2 = false;
                    }
                    if (a.isDebugEnabled()) {
                        Log log3 = a;
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append(C0059ao.a(8630));
                        stringBuffer3.append(reference.c());
                        log3.debug(stringBuffer3.toString());
                    }
                    if (z2 && z && reference.f()) {
                        a.debug(C0059ao.a(8631));
                        Manifest manifest = null;
                        try {
                            XMLSignatureInput a3 = reference.a((OutputStream) null);
                            Iterator it = a3.b().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Node node = (Node) it.next();
                                if (node.getNodeType() == 1 && ((Element) node).getNamespaceURI().equals(C0059ao.a(8632)) && ((Element) node).getLocalName().equals(C0059ao.a(8633))) {
                                    try {
                                        manifest = new Manifest((Element) node, a3.k());
                                        break;
                                    } catch (XMLSecurityException unused) {
                                        continue;
                                    }
                                }
                            }
                            if (manifest == null) {
                                throw new MissingResourceFailureException(a2, reference);
                            }
                            manifest.e = this.e;
                            manifest.d = this.d;
                            if (manifest.a(z)) {
                                a.debug(C0059ao.a(8635));
                            } else {
                                a.warn(C0059ao.a(8634));
                                z2 = false;
                            }
                        } catch (IOException e) {
                            throw new ReferenceNotInitializedException(a2, e);
                        } catch (ParserConfigurationException e2) {
                            throw new ReferenceNotInitializedException(a2, e2);
                        } catch (SAXException e3) {
                            throw new ReferenceNotInitializedException(a2, e3);
                        }
                    }
                } catch (ReferenceNotInitializedException e4) {
                    throw new MissingResourceFailureException(C0059ao.a(8636), new Object[]{reference.b()}, e4, reference);
                }
            }
            return z2;
        }
        throw new XMLSecurityException(a2);
    }

    @Override // org.apache.xml.security.utils.ElementProxy
    public String e() {
        return C0059ao.a(8637);
    }
}
