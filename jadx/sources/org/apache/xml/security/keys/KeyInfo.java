package org.apache.xml.security.keys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.w3c.dom.Element;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class KeyInfo extends SignatureElementProxy {
    public static Log a;
    public static final List d;
    public static boolean g;
    public static Class h;
    public List b;
    public List c;
    public List e;
    public List f;

    static {
        Class cls = h;
        if (cls == null) {
            cls = a(C0059ao.a(10648));
            h = cls;
        }
        a = LogFactory.getLog(cls.getName());
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        d = Collections.unmodifiableList(arrayList);
        g = false;
    }

    public KeyInfo(Element element, String str) {
        super(element, str);
        this.b = null;
        this.c = null;
        this.e = null;
        this.f = d;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public static void a() {
        if (g) {
            return;
        }
        if (a == null) {
            Class cls = h;
            if (cls == null) {
                cls = a(C0059ao.a(10649));
                h = cls;
            }
            Log log = LogFactory.getLog(cls.getName());
            a = log;
            log.error(C0059ao.a(10650));
        }
        g = true;
    }

    @Override // org.apache.xml.security.utils.ElementProxy
    public String e() {
        return C0059ao.a(10651);
    }
}
