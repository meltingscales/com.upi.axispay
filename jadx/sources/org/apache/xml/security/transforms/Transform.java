package org.apache.xml.security.transforms;

import java.io.OutputStream;
import java.util.HashMap;
import javax.xml.parsers.ParserConfigurationException;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.ClassLoaderUtils;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class Transform extends SignatureElementProxy {
    public static Class a;
    private static Log b;
    private static boolean c;
    private static HashMap d;
    private static HashMap e;
    private TransformSpi f;

    static {
        Class cls = a;
        if (cls == null) {
            cls = a(C0059ao.a(14397));
            a = cls;
        }
        b = LogFactory.getLog(cls.getName());
        c = false;
        d = null;
        e = new HashMap();
    }

    public Transform(Document document, String str, NodeList nodeList) {
        super(document);
        this.f = null;
        this.k.setAttributeNS(null, C0059ao.a(14398), str);
        TransformSpi d2 = d(str);
        this.f = d2;
        if (d2 == null) {
            throw new InvalidTransformException(C0059ao.a(14403), new Object[]{str});
        }
        if (b.isDebugEnabled()) {
            Log log = b;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(14399));
            stringBuffer.append(str);
            stringBuffer.append(C0059ao.a(14400));
            stringBuffer.append(this.f.getClass());
            stringBuffer.append(C0059ao.a(14401));
            log.debug(stringBuffer.toString());
            Log log2 = b;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(C0059ao.a(14402));
            stringBuffer2.append(nodeList);
            log2.debug(stringBuffer2.toString());
        }
        if (nodeList != null) {
            for (int i = 0; i < nodeList.getLength(); i++) {
                this.k.appendChild(nodeList.item(i).cloneNode(true));
            }
        }
    }

    public Transform(Element element, String str) {
        super(element, str);
        this.f = null;
        String a2 = C0059ao.a(14404);
        String attributeNS = element.getAttributeNS(null, a2);
        if (attributeNS == null || attributeNS.length() == 0) {
            throw new TransformationException(C0059ao.a(14407), new Object[]{a2, C0059ao.a(14406)});
        }
        TransformSpi d2 = d(attributeNS);
        this.f = d2;
        if (d2 == null) {
            throw new InvalidTransformException(C0059ao.a(14405), new Object[]{attributeNS});
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError().initCause(e2);
        }
    }

    public static Transform a(Document document, String str) {
        return a(document, str, null);
    }

    public static Transform a(Document document, String str, NodeList nodeList) {
        return new Transform(document, str, nodeList);
    }

    public static void a() {
        if (c) {
            return;
        }
        d = new HashMap(10);
        c = true;
    }

    public static void a(String str, String str2) {
        Class b2 = b(str);
        if (b2 != null) {
            throw new AlgorithmAlreadyRegisteredException(C0059ao.a(14409), new Object[]{str, b2});
        }
        try {
            HashMap hashMap = d;
            Class cls = a;
            if (cls == null) {
                cls = a(C0059ao.a(14408));
                a = cls;
            }
            hashMap.put(str, ClassLoaderUtils.a(str2, cls));
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Class b(String str) {
        return (Class) d.get(str);
    }

    private static TransformSpi d(String str) {
        String a2 = C0059ao.a(14410);
        try {
            Object obj = e.get(str);
            if (obj != null) {
                return (TransformSpi) obj;
            }
            Class cls = (Class) d.get(str);
            if (cls != null) {
                TransformSpi transformSpi = (TransformSpi) cls.newInstance();
                e.put(str, transformSpi);
                return transformSpi;
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new InvalidTransformException(a2, new Object[]{str}, e2);
        } catch (InstantiationException e3) {
            throw new InvalidTransformException(a2, new Object[]{str}, e3);
        }
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput) {
        String a2 = C0059ao.a(14411);
        try {
            return this.f.a(xMLSignatureInput, this);
        } catch (ParserConfigurationException e2) {
            throw new CanonicalizationException(a2, new Object[]{b(), C0059ao.a(14413)}, e2);
        } catch (SAXException e3) {
            throw new CanonicalizationException(a2, new Object[]{b(), C0059ao.a(14412)}, e3);
        }
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream) {
        String a2 = C0059ao.a(14414);
        try {
            return this.f.a(xMLSignatureInput, outputStream, this);
        } catch (ParserConfigurationException e2) {
            throw new CanonicalizationException(a2, new Object[]{b(), C0059ao.a(14416)}, e2);
        } catch (SAXException e3) {
            throw new CanonicalizationException(a2, new Object[]{b(), C0059ao.a(14415)}, e3);
        }
    }

    public String b() {
        return this.k.getAttributeNS(null, C0059ao.a(14417));
    }

    @Override // org.apache.xml.security.utils.ElementProxy
    public String e() {
        return C0059ao.a(14418);
    }
}
