package org.apache.xml.security.algorithms.implementations;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.JCEMapper;
import org.apache.xml.security.algorithms.SignatureAlgorithmSpi;
import org.apache.xml.security.signature.XMLSignatureException;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class SignatureBaseRSA extends SignatureAlgorithmSpi {
    public static Log a;
    public static Class b;
    public static Class c;
    private Signature d;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class SignatureRSAMD5 extends SignatureBaseRSA {
        @Override // org.apache.xml.security.algorithms.implementations.SignatureBaseRSA
        public String d() {
            return C0059ao.a(11315);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class SignatureRSARIPEMD160 extends SignatureBaseRSA {
        @Override // org.apache.xml.security.algorithms.implementations.SignatureBaseRSA
        public String d() {
            return C0059ao.a(3610);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class SignatureRSASHA1 extends SignatureBaseRSA {
        @Override // org.apache.xml.security.algorithms.implementations.SignatureBaseRSA
        public String d() {
            return C0059ao.a(13739);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class SignatureRSASHA256 extends SignatureBaseRSA {
        @Override // org.apache.xml.security.algorithms.implementations.SignatureBaseRSA
        public String d() {
            return C0059ao.a(4294);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class SignatureRSASHA384 extends SignatureBaseRSA {
        @Override // org.apache.xml.security.algorithms.implementations.SignatureBaseRSA
        public String d() {
            return C0059ao.a(5368);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class SignatureRSASHA512 extends SignatureBaseRSA {
        @Override // org.apache.xml.security.algorithms.implementations.SignatureBaseRSA
        public String d() {
            return C0059ao.a(1577);
        }
    }

    static {
        Class cls = b;
        if (cls == null) {
            cls = a(C0059ao.a(2255));
            b = cls;
        }
        a = LogFactory.getLog(cls.getName());
    }

    public SignatureBaseRSA() {
        this.d = null;
        String a2 = JCEMapper.a(d());
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(2256));
            stringBuffer.append(a2);
            log.debug(stringBuffer.toString());
        }
        String a3 = JCEMapper.a();
        String a4 = C0059ao.a(2257);
        try {
            this.d = a3 == null ? Signature.getInstance(a2) : Signature.getInstance(a2, a3);
        } catch (NoSuchAlgorithmException e) {
            throw new XMLSignatureException(a4, new Object[]{a2, e.getLocalizedMessage()});
        } catch (NoSuchProviderException e2) {
            throw new XMLSignatureException(a4, new Object[]{a2, e2.getLocalizedMessage()});
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public String a() {
        return this.d.getAlgorithm();
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public void a(byte b2) {
        try {
            this.d.update(b2);
        } catch (SignatureException e) {
            throw new XMLSignatureException(C0059ao.a(2258), e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public void a(Key key) {
        if (!(key instanceof PublicKey)) {
            String name = key.getClass().getName();
            Class cls = c;
            if (cls == null) {
                cls = a(C0059ao.a(2259));
                c = cls;
            }
            throw new XMLSignatureException(C0059ao.a(2260), new Object[]{name, cls.getName()});
        }
        try {
            this.d.initVerify((PublicKey) key);
        } catch (InvalidKeyException e) {
            Signature signature = this.d;
            try {
                this.d = Signature.getInstance(signature.getAlgorithm());
            } catch (Exception e2) {
                if (a.isDebugEnabled()) {
                    Log log = a;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(C0059ao.a(2261));
                    stringBuffer.append(e2);
                    log.debug(stringBuffer.toString());
                }
                this.d = signature;
            }
            throw new XMLSignatureException(C0059ao.a(2262), e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public void a(byte[] bArr) {
        try {
            this.d.update(bArr);
        } catch (SignatureException e) {
            throw new XMLSignatureException(C0059ao.a(2263), e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public void a(byte[] bArr, int i, int i2) {
        try {
            this.d.update(bArr, i, i2);
        } catch (SignatureException e) {
            throw new XMLSignatureException(C0059ao.a(2264), e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public String b() {
        return this.d.getProvider().getName();
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public boolean b(byte[] bArr) {
        try {
            return this.d.verify(bArr);
        } catch (SignatureException e) {
            throw new XMLSignatureException(C0059ao.a(2265), e);
        }
    }

    public abstract String d();
}
