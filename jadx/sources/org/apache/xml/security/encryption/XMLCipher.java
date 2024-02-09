package org.apache.xml.security.encryption;

import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class XMLCipher {
    public static Class a;
    private static Log b;

    /* compiled from: AxisPay */
    /* renamed from: org.apache.xml.security.encryption.XMLCipher$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 {
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public class Factory {

        /* compiled from: AxisPay */
        /* loaded from: classes2.dex */
        public class AgreementMethodImpl implements AgreementMethod {
        }

        /* compiled from: AxisPay */
        /* loaded from: classes2.dex */
        public class CipherDataImpl implements CipherData {
        }

        /* compiled from: AxisPay */
        /* loaded from: classes2.dex */
        public class CipherReferenceImpl implements CipherReference {
        }

        /* compiled from: AxisPay */
        /* loaded from: classes2.dex */
        public class CipherValueImpl implements CipherValue {
        }

        /* compiled from: AxisPay */
        /* loaded from: classes2.dex */
        public class EncryptedDataImpl extends EncryptedTypeImpl implements EncryptedData {
        }

        /* compiled from: AxisPay */
        /* loaded from: classes2.dex */
        public class EncryptedKeyImpl extends EncryptedTypeImpl implements EncryptedKey {
        }

        /* compiled from: AxisPay */
        /* loaded from: classes2.dex */
        public abstract class EncryptedTypeImpl {
        }

        /* compiled from: AxisPay */
        /* loaded from: classes2.dex */
        public class EncryptionMethodImpl implements EncryptionMethod {
        }

        /* compiled from: AxisPay */
        /* loaded from: classes2.dex */
        public class EncryptionPropertiesImpl implements EncryptionProperties {
        }

        /* compiled from: AxisPay */
        /* loaded from: classes2.dex */
        public class EncryptionPropertyImpl implements EncryptionProperty {
        }

        /* compiled from: AxisPay */
        /* loaded from: classes2.dex */
        public class ReferenceListImpl implements ReferenceList {

            /* compiled from: AxisPay */
            /* loaded from: classes2.dex */
            public class DataReference extends ReferenceImpl {
            }

            /* compiled from: AxisPay */
            /* loaded from: classes2.dex */
            public class KeyReference extends ReferenceImpl {
            }

            /* compiled from: AxisPay */
            /* loaded from: classes2.dex */
            public abstract class ReferenceImpl implements Reference {
            }
        }

        /* compiled from: AxisPay */
        /* loaded from: classes2.dex */
        public class TransformsImpl extends org.apache.xml.security.transforms.Transforms implements Transforms {
            @Override // org.apache.xml.security.utils.SignatureElementProxy, org.apache.xml.security.utils.ElementProxy
            public String d() {
                return C0059ao.a(15044);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public class Serializer {
    }

    static {
        Class cls = a;
        if (cls == null) {
            cls = a(C0059ao.a(6509));
            a = cls;
        }
        b = LogFactory.getLog(cls.getName());
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }
}
