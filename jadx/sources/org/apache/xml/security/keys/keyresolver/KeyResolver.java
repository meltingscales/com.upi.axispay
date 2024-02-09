package org.apache.xml.security.keys.keyresolver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.keys.storage.StorageResolver;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class KeyResolver {
    public static Log a;
    public static boolean b;
    public static List c;
    public static Class f;
    public KeyResolverSpi d;
    public StorageResolver e = null;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class ResolverIterator implements Iterator {
        public Iterator a;
        public int b;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            this.b++;
            KeyResolver keyResolver = (KeyResolver) this.a.next();
            if (keyResolver != null) {
                return keyResolver.d;
            }
            throw new RuntimeException(C0059ao.a(9986));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(C0059ao.a(9987));
        }
    }

    static {
        Class cls = f;
        if (cls == null) {
            cls = b(C0059ao.a(15490));
            f = cls;
        }
        a = LogFactory.getLog(cls.getName());
        b = false;
        c = null;
    }

    private KeyResolver(String str) {
        this.d = null;
        KeyResolverSpi keyResolverSpi = (KeyResolverSpi) Class.forName(str).newInstance();
        this.d = keyResolverSpi;
        keyResolverSpi.a(true);
    }

    public static void a() {
        if (b) {
            return;
        }
        c = new ArrayList(10);
        b = true;
    }

    public static void a(String str) {
        c.add(new KeyResolver(str));
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }
}
