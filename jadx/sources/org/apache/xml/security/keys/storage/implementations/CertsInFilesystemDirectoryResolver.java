package org.apache.xml.security.keys.storage.implementations;

import java.util.Iterator;
import java.util.List;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.keys.storage.StorageResolverSpi;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class CertsInFilesystemDirectoryResolver extends StorageResolverSpi {
    public static Log a;
    public static Class b;
    private List c;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class FilesystemIterator implements Iterator {
        public List a;
        public int b = 0;

        public FilesystemIterator(List list) {
            this.a = null;
            this.a = list;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b < this.a.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            List list = this.a;
            int i = this.b;
            this.b = i + 1;
            return list.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(C0059ao.a(9720));
        }
    }

    static {
        Class cls = b;
        if (cls == null) {
            cls = a(C0059ao.a(15497));
            b = cls;
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

    @Override // org.apache.xml.security.keys.storage.StorageResolverSpi
    public Iterator a() {
        return new FilesystemIterator(this.c);
    }
}
