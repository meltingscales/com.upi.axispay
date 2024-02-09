package org.apache.xml.security.algorithms.implementations;

import java.io.IOException;
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
import org.apache.xml.security.utils.Base64;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class SignatureECDSA extends SignatureAlgorithmSpi {
    public static Log a;
    public static Class b;
    public static Class c;
    private Signature d;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class SignatureECDSASHA1 extends SignatureECDSA {
        @Override // org.apache.xml.security.algorithms.implementations.SignatureECDSA
        public String d() {
            return C0059ao.a(1300);
        }
    }

    static {
        Class cls = b;
        if (cls == null) {
            cls = a(C0059ao.a(13774));
            b = cls;
        }
        a = LogFactory.getLog(cls.getName());
    }

    public SignatureECDSA() {
        this.d = null;
        String a2 = JCEMapper.a(d());
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(13775));
            stringBuffer.append(a2);
            log.debug(stringBuffer.toString());
        }
        String a3 = JCEMapper.a();
        String a4 = C0059ao.a(13776);
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

    private static byte[] c(byte[] bArr) {
        if (bArr.length >= 48) {
            int length = bArr.length / 2;
            int i = length;
            while (i > 0 && bArr[length - i] == 0) {
                i--;
            }
            int i2 = length - i;
            int i3 = bArr[i2] < 0 ? i + 1 : i;
            int i4 = length;
            while (i4 > 0 && bArr[(length * 2) - i4] == 0) {
                i4--;
            }
            int i5 = (length * 2) - i4;
            int i6 = bArr[i5] < 0 ? i4 + 1 : i4;
            int i7 = i3 + 6 + i6;
            byte[] bArr2 = new byte[i7];
            bArr2[0] = 48;
            int i8 = i3 + 4;
            bArr2[1] = (byte) (i8 + i6);
            bArr2[2] = 2;
            bArr2[3] = (byte) i3;
            System.arraycopy(bArr, i2, bArr2, i8 - i, i);
            bArr2[i8] = 2;
            bArr2[i3 + 5] = (byte) i6;
            System.arraycopy(bArr, i5, bArr2, i7 - i4, i4);
            return bArr2;
        }
        throw new IOException(C0059ao.a(13777));
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
            throw new XMLSignatureException(C0059ao.a(13778), e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public void a(Key key) {
        if (!(key instanceof PublicKey)) {
            String name = key.getClass().getName();
            Class cls = c;
            if (cls == null) {
                cls = a(C0059ao.a(13779));
                c = cls;
            }
            throw new XMLSignatureException(C0059ao.a(13780), new Object[]{name, cls.getName()});
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
                    stringBuffer.append(C0059ao.a(13781));
                    stringBuffer.append(e2);
                    log.debug(stringBuffer.toString());
                }
                this.d = signature;
            }
            throw new XMLSignatureException(C0059ao.a(13782), e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public void a(byte[] bArr) {
        try {
            this.d.update(bArr);
        } catch (SignatureException e) {
            throw new XMLSignatureException(C0059ao.a(13783), e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public void a(byte[] bArr, int i, int i2) {
        try {
            this.d.update(bArr, i, i2);
        } catch (SignatureException e) {
            throw new XMLSignatureException(C0059ao.a(13784), e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public String b() {
        return this.d.getProvider().getName();
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public boolean b(byte[] bArr) {
        String a2 = C0059ao.a(13785);
        try {
            byte[] c2 = c(bArr);
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(C0059ao.a(13786));
                stringBuffer.append(Base64.b(bArr));
                log.debug(stringBuffer.toString());
            }
            return this.d.verify(c2);
        } catch (IOException e) {
            throw new XMLSignatureException(a2, e);
        } catch (SignatureException e2) {
            throw new XMLSignatureException(a2, e2);
        }
    }

    public abstract String d();
}
