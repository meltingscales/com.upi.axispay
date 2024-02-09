package org.apache.xml.security.keys.storage.implementations;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.NoSuchElementException;
import myunmn.C0059ao;
import org.apache.xml.security.keys.storage.StorageResolverSpi;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class SingleCertificateResolver extends StorageResolverSpi {
    public X509Certificate a;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class InternalIterator implements Iterator {
        public boolean a = false;
        public X509Certificate b;

        public InternalIterator(X509Certificate x509Certificate) {
            this.b = null;
            this.b = x509Certificate;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.a) {
                throw new NoSuchElementException();
            }
            this.a = true;
            return this.b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(C0059ao.a(14815));
        }
    }

    @Override // org.apache.xml.security.keys.storage.StorageResolverSpi
    public Iterator a() {
        return new InternalIterator(this.a);
    }
}
