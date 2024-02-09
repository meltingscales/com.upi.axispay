package org.apache.xml.security.keys.storage.implementations;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import myunmn.C0059ao;
import org.apache.xml.security.keys.storage.StorageResolverSpi;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class KeyStoreResolver extends StorageResolverSpi {
    public KeyStore a;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class KeyStoreIterator implements Iterator {
        public KeyStore a;
        public Enumeration b;
        public Certificate c = null;

        public KeyStoreIterator(KeyStore keyStore) {
            this.a = null;
            this.b = null;
            try {
                this.a = keyStore;
                this.b = keyStore.aliases();
            } catch (KeyStoreException unused) {
                this.b = new Enumeration(this) { // from class: org.apache.xml.security.keys.storage.implementations.KeyStoreResolver.1
                    private final KeyStoreIterator a;

                    {
                        this.a = this;
                    }

                    @Override // java.util.Enumeration
                    public boolean hasMoreElements() {
                        return false;
                    }

                    @Override // java.util.Enumeration
                    public Object nextElement() {
                        return null;
                    }
                };
            }
        }

        private Certificate a() {
            while (this.b.hasMoreElements()) {
                try {
                    Certificate certificate = this.a.getCertificate((String) this.b.nextElement());
                    if (certificate != null) {
                        return certificate;
                    }
                } catch (KeyStoreException unused) {
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.c == null) {
                this.c = a();
            }
            return this.c != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.c == null) {
                Certificate a = a();
                this.c = a;
                if (a == null) {
                    throw new NoSuchElementException();
                }
            }
            Certificate certificate = this.c;
            this.c = null;
            return certificate;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(C0059ao.a(14161));
        }
    }

    @Override // org.apache.xml.security.keys.storage.StorageResolverSpi
    public Iterator a() {
        return new KeyStoreIterator(this.a);
    }
}
