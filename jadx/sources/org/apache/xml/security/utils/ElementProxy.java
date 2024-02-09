package org.apache.xml.security.utils;

import java.util.HashMap;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class ElementProxy {
    public static Log j;
    public static HashMap n;
    public static HashMap o;
    public static Class p;
    public Element k;
    public String l;
    public Document m;

    static {
        Class cls = p;
        if (cls == null) {
            cls = c(C0059ao.a(13662));
            p = cls;
        }
        j = LogFactory.getLog(cls.getName());
        n = new HashMap();
        o = new HashMap();
    }

    public ElementProxy() {
        this.k = null;
        this.l = null;
        this.m = null;
    }

    public ElementProxy(Element element, String str) {
        this.k = null;
        this.l = null;
        this.m = null;
        if (element == null) {
            throw new XMLSecurityException(C0059ao.a(13666));
        }
        if (j.isDebugEnabled()) {
            Log log = j;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(13663));
            stringBuffer.append(element.getTagName());
            stringBuffer.append(C0059ao.a(13664));
            stringBuffer.append(str);
            stringBuffer.append(C0059ao.a(13665));
            log.debug(stringBuffer.toString());
        }
        this.m = element.getOwnerDocument();
        this.k = element;
        this.l = str;
        m();
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public static void d(String str, String str2) {
        if (n.containsValue(str2)) {
            Object obj = n.get(str);
            if (!obj.equals(str2)) {
                throw new XMLSecurityException(C0059ao.a(13667), new Object[]{str2, str, obj});
            }
        }
        if (C0059ao.a(13668).equals(str)) {
            XMLUtils.a = str2;
        }
        if (C0059ao.a(13669).equals(str)) {
            XMLUtils.b = str2;
        }
        n.put(str, str2.intern());
        if (str2.length() == 0) {
            o.put(str, C0059ao.a(13670));
            return;
        }
        HashMap hashMap = o;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C0059ao.a(13671));
        stringBuffer.append(str2);
        hashMap.put(str, stringBuffer.toString().intern());
    }

    public String b(String str, String str2) {
        return ((Text) XMLUtils.a(this.k.getFirstChild(), str2, str, 0).getFirstChild()).getData();
    }

    public int c(String str, String str2) {
        int i = 0;
        for (Node firstChild = this.k.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (str2.equals(firstChild.getLocalName()) && str.equals(firstChild.getNamespaceURI())) {
                i++;
            }
        }
        return i;
    }

    public abstract String d();

    public abstract String e();

    public final Element k() {
        return this.k;
    }

    public String l() {
        return this.l;
    }

    public void m() {
        String e = e();
        String d = d();
        String localName = this.k.getLocalName();
        String namespaceURI = this.k.getNamespaceURI();
        if (d.equals(namespaceURI) || e.equals(localName)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(namespaceURI);
        String a = C0059ao.a(13672);
        stringBuffer.append(a);
        stringBuffer.append(localName);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(d);
        stringBuffer2.append(a);
        stringBuffer2.append(e);
        throw new XMLSecurityException(C0059ao.a(13673), new Object[]{stringBuffer.toString(), stringBuffer2.toString()});
    }

    public byte[] n() {
        return Base64.a(XMLUtils.a(this.k));
    }

    public String o() {
        return XMLUtils.a(this.k);
    }
}
