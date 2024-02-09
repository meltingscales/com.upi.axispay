package org.apache.xml.security.keys.storage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class StorageResolver {
    public static Log a;
    public static Class d;
    public List b = null;
    public Iterator c = null;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class StorageResolverIterator implements Iterator {
        public Iterator a;
        public Iterator b;

        private Iterator a() {
            while (this.a.hasNext()) {
                Iterator a = ((StorageResolverSpi) this.a.next()).a();
                if (a.hasNext()) {
                    return a;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Iterator it = this.b;
            if (it == null) {
                return false;
            }
            if (it.hasNext()) {
                return true;
            }
            Iterator a = a();
            this.b = a;
            return a != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                return this.b.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(C0059ao.a(12432));
        }
    }

    static {
        Class cls = d;
        if (cls == null) {
            cls = a(C0059ao.a(15034));
            d = cls;
        }
        a = LogFactory.getLog(cls.getName());
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }
}
