package org.apache.xml.security.algorithms;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException;
import org.apache.xml.security.signature.XMLSignatureException;
import org.w3c.dom.Element;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class SignatureAlgorithm extends Algorithm {
    public static Log a;
    public static boolean b;
    public static HashMap c;
    public static ThreadLocal d;
    public static ThreadLocal e;
    public static ThreadLocal f;
    public static ThreadLocal g;
    public static Class i;
    public SignatureAlgorithmSpi h;
    private String q;

    static {
        Class cls = i;
        if (cls == null) {
            cls = b(C0059ao.a(9035));
            i = cls;
        }
        a = LogFactory.getLog(cls.getName());
        b = false;
        c = null;
        d = new ThreadLocal() { // from class: org.apache.xml.security.algorithms.SignatureAlgorithm.1
            @Override // java.lang.ThreadLocal
            public Object initialValue() {
                return new HashMap();
            }
        };
        e = new ThreadLocal() { // from class: org.apache.xml.security.algorithms.SignatureAlgorithm.2
            @Override // java.lang.ThreadLocal
            public Object initialValue() {
                return new HashMap();
            }
        };
        f = new ThreadLocal() { // from class: org.apache.xml.security.algorithms.SignatureAlgorithm.3
            @Override // java.lang.ThreadLocal
            public Object initialValue() {
                return new HashMap();
            }
        };
        g = new ThreadLocal() { // from class: org.apache.xml.security.algorithms.SignatureAlgorithm.4
            @Override // java.lang.ThreadLocal
            public Object initialValue() {
                return new HashMap();
            }
        };
    }

    public SignatureAlgorithm(Element element, String str) {
        super(element, str);
        this.h = null;
        this.q = g();
    }

    public static void a(String str, String str2) {
        String name;
        String a2 = C0059ao.a(9036);
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(9037));
            stringBuffer.append(str);
            stringBuffer.append(C0059ao.a(9038));
            stringBuffer.append(str2);
            log.debug(stringBuffer.toString());
        }
        Class g2 = g(str);
        if (g2 != null && (name = g2.getName()) != null && name.length() != 0) {
            throw new AlgorithmAlreadyRegisteredException(C0059ao.a(9039), new Object[]{str, name});
        }
        try {
            c.put(str, Class.forName(str2));
        } catch (ClassNotFoundException e2) {
            throw new XMLSignatureException(a2, new Object[]{str, e2.getMessage()}, e2);
        } catch (NullPointerException e3) {
            throw new XMLSignatureException(a2, new Object[]{str, e3.getMessage()}, e3);
        }
    }

    private void a(boolean z) {
        SignatureAlgorithmSpi d2 = z ? d(this.q) : e(this.q);
        this.h = d2;
        d2.a(this.k);
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError().initCause(e2);
        }
    }

    private static SignatureAlgorithmSpi d(String str) {
        SignatureAlgorithmSpi signatureAlgorithmSpi = (SignatureAlgorithmSpi) ((Map) d.get()).get(str);
        if (signatureAlgorithmSpi != null) {
            signatureAlgorithmSpi.c();
            return signatureAlgorithmSpi;
        }
        SignatureAlgorithmSpi f2 = f(str);
        ((Map) d.get()).put(str, f2);
        return f2;
    }

    private static SignatureAlgorithmSpi e(String str) {
        SignatureAlgorithmSpi signatureAlgorithmSpi = (SignatureAlgorithmSpi) ((Map) e.get()).get(str);
        if (signatureAlgorithmSpi != null) {
            signatureAlgorithmSpi.c();
            return signatureAlgorithmSpi;
        }
        SignatureAlgorithmSpi f2 = f(str);
        ((Map) e.get()).put(str, f2);
        return f2;
    }

    private static SignatureAlgorithmSpi f(String str) {
        String a2 = C0059ao.a(9040);
        try {
            Class g2 = g(str);
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(C0059ao.a(9041));
                stringBuffer.append(str);
                stringBuffer.append(C0059ao.a(9042));
                stringBuffer.append(g2);
                stringBuffer.append(C0059ao.a(9043));
                log.debug(stringBuffer.toString());
            }
            return (SignatureAlgorithmSpi) g2.newInstance();
        } catch (IllegalAccessException e2) {
            throw new XMLSignatureException(a2, new Object[]{str, e2.getMessage()}, e2);
        } catch (InstantiationException e3) {
            throw new XMLSignatureException(a2, new Object[]{str, e3.getMessage()}, e3);
        } catch (NullPointerException e4) {
            throw new XMLSignatureException(a2, new Object[]{str, e4.getMessage()}, e4);
        }
    }

    private static Class g(String str) {
        HashMap hashMap = c;
        if (hashMap == null) {
            return null;
        }
        return (Class) hashMap.get(str);
    }

    public static void h() {
        if (a == null) {
            Class cls = i;
            if (cls == null) {
                cls = b(C0059ao.a(9044));
                i = cls;
            }
            a = LogFactory.getLog(cls.getName());
        }
        a.debug(C0059ao.a(9045));
        if (b) {
            return;
        }
        c = new HashMap(10);
        b = true;
    }

    public void a(byte b2) {
        this.h.a(b2);
    }

    public void a(Key key) {
        a(false);
        Map map = (Map) g.get();
        if (map.get(this.q) == key) {
            return;
        }
        map.put(this.q, key);
        this.h.a(key);
    }

    public void a(byte[] bArr) {
        this.h.a(bArr);
    }

    public void a(byte[] bArr, int i2, int i3) {
        this.h.a(bArr, i2, i3);
    }

    public String b() {
        try {
            return e(this.q).a();
        } catch (XMLSignatureException unused) {
            return null;
        }
    }

    public boolean b(byte[] bArr) {
        return this.h.b(bArr);
    }

    public String c() {
        try {
            return e(this.q).b();
        } catch (XMLSignatureException unused) {
            return null;
        }
    }

    @Override // org.apache.xml.security.utils.SignatureElementProxy, org.apache.xml.security.utils.ElementProxy
    public String d() {
        return C0059ao.a(9046);
    }

    @Override // org.apache.xml.security.utils.ElementProxy
    public String e() {
        return C0059ao.a(9047);
    }

    public void f() {
        ((Map) g.get()).clear();
        ((Map) e.get()).clear();
    }

    public final String g() {
        return this.k.getAttributeNS(null, C0059ao.a(9048));
    }
}
