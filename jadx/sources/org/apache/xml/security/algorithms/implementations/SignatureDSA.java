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
public class SignatureDSA extends SignatureAlgorithmSpi {
    public static Log a;
    public static Class b;
    public static Class c;
    private Signature d;

    static {
        Class cls = b;
        if (cls == null) {
            cls = a(C0059ao.a(15245));
            b = cls;
        }
        a = LogFactory.getLog(cls.getName());
    }

    public SignatureDSA() {
        this.d = null;
        String a2 = JCEMapper.a(C0059ao.a(15246));
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(15247));
            stringBuffer.append(a2);
            log.debug(stringBuffer.toString());
        }
        String a3 = JCEMapper.a();
        String a4 = C0059ao.a(15248);
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
        if (bArr.length == 40) {
            int i = 20;
            int i2 = 20;
            while (i2 > 0 && bArr[20 - i2] == 0) {
                i2--;
            }
            int i3 = 20 - i2;
            int i4 = bArr[i3] < 0 ? i2 + 1 : i2;
            while (i > 0 && bArr[40 - i] == 0) {
                i--;
            }
            int i5 = 40 - i;
            int i6 = bArr[i5] < 0 ? i + 1 : i;
            int i7 = i4 + 6 + i6;
            byte[] bArr2 = new byte[i7];
            bArr2[0] = 48;
            int i8 = i4 + 4;
            bArr2[1] = (byte) (i8 + i6);
            bArr2[2] = 2;
            bArr2[3] = (byte) i4;
            System.arraycopy(bArr, i3, bArr2, i8 - i2, i2);
            bArr2[i8] = 2;
            bArr2[i4 + 5] = (byte) i6;
            System.arraycopy(bArr, i5, bArr2, i7 - i, i);
            return bArr2;
        }
        throw new IOException(C0059ao.a(15249));
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
            throw new XMLSignatureException(C0059ao.a(15250), e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public void a(Key key) {
        if (!(key instanceof PublicKey)) {
            String name = key.getClass().getName();
            Class cls = c;
            if (cls == null) {
                cls = a(C0059ao.a(15251));
                c = cls;
            }
            throw new XMLSignatureException(C0059ao.a(15252), new Object[]{name, cls.getName()});
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
                    stringBuffer.append(C0059ao.a(15253));
                    stringBuffer.append(e2);
                    log.debug(stringBuffer.toString());
                }
                this.d = signature;
            }
            throw new XMLSignatureException(C0059ao.a(15254), e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public void a(byte[] bArr) {
        try {
            this.d.update(bArr);
        } catch (SignatureException e) {
            throw new XMLSignatureException(C0059ao.a(15255), e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public void a(byte[] bArr, int i, int i2) {
        try {
            this.d.update(bArr, i, i2);
        } catch (SignatureException e) {
            throw new XMLSignatureException(C0059ao.a(15256), e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public String b() {
        return this.d.getProvider().getName();
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public boolean b(byte[] bArr) {
        String a2 = C0059ao.a(15257);
        try {
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(C0059ao.a(15258));
                stringBuffer.append(Base64.b(bArr));
                log.debug(stringBuffer.toString());
            }
            return this.d.verify(c(bArr));
        } catch (IOException e) {
            throw new XMLSignatureException(a2, e);
        } catch (SignatureException e2) {
            throw new XMLSignatureException(a2, e2);
        }
    }
}
