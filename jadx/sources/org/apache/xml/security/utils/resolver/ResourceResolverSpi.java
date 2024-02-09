package org.apache.xml.security.utils.resolver;

import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.w3c.dom.Attr;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class ResourceResolverSpi {
    public static Log a;
    public static Class c;
    public Map b = null;

    static {
        Class cls = c;
        if (cls == null) {
            cls = b(C0059ao.a(14755));
            c = cls;
        }
        a = LogFactory.getLog(cls.getName());
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public String a(String str) {
        Map map = this.b;
        if (map == null) {
            return null;
        }
        return (String) map.get(str);
    }

    public abstract XMLSignatureInput a(Attr attr, String str);

    public void a(Map map) {
        if (map != null) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.putAll(map);
        }
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b(Attr attr, String str);
}
