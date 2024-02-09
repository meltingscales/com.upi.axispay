package org.apache.xml.security.algorithms.implementations;

import com.google.android.gms.vision.barcode.Barcode;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.JCEMapper;
import org.apache.xml.security.algorithms.MessageDigestAlgorithm;
import org.apache.xml.security.algorithms.SignatureAlgorithmSpi;
import org.apache.xml.security.signature.XMLSignatureException;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class IntegrityHmac extends SignatureAlgorithmSpi {
    public static Log a;
    public static Class c;
    public static Class d;
    private Mac e;
    public int b = 0;
    private boolean f = false;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class IntegrityHmacMD5 extends IntegrityHmac {
        @Override // org.apache.xml.security.algorithms.implementations.IntegrityHmac
        public String d() {
            return C0059ao.a(14877);
        }

        @Override // org.apache.xml.security.algorithms.implementations.IntegrityHmac
        public int e() {
            return Barcode.ITF;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class IntegrityHmacRIPEMD160 extends IntegrityHmac {
        @Override // org.apache.xml.security.algorithms.implementations.IntegrityHmac
        public String d() {
            return C0059ao.a(4517);
        }

        @Override // org.apache.xml.security.algorithms.implementations.IntegrityHmac
        public int e() {
            return 160;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class IntegrityHmacSHA1 extends IntegrityHmac {
        @Override // org.apache.xml.security.algorithms.implementations.IntegrityHmac
        public String d() {
            return C0059ao.a(14872);
        }

        @Override // org.apache.xml.security.algorithms.implementations.IntegrityHmac
        public int e() {
            return 160;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class IntegrityHmacSHA256 extends IntegrityHmac {
        @Override // org.apache.xml.security.algorithms.implementations.IntegrityHmac
        public String d() {
            return C0059ao.a(12683);
        }

        @Override // org.apache.xml.security.algorithms.implementations.IntegrityHmac
        public int e() {
            return Barcode.QR_CODE;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class IntegrityHmacSHA384 extends IntegrityHmac {
        @Override // org.apache.xml.security.algorithms.implementations.IntegrityHmac
        public String d() {
            return C0059ao.a(12728);
        }

        @Override // org.apache.xml.security.algorithms.implementations.IntegrityHmac
        public int e() {
            return 384;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class IntegrityHmacSHA512 extends IntegrityHmac {
        @Override // org.apache.xml.security.algorithms.implementations.IntegrityHmac
        public String d() {
            return C0059ao.a(492);
        }

        @Override // org.apache.xml.security.algorithms.implementations.IntegrityHmac
        public int e() {
            return Barcode.UPC_A;
        }
    }

    static {
        Class cls = c;
        if (cls == null) {
            cls = a(C0059ao.a(4307));
            c = cls;
        }
        a = LogFactory.getLog(cls.getName());
    }

    public IntegrityHmac() {
        this.e = null;
        String a2 = JCEMapper.a(d());
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(4308));
            stringBuffer.append(a2);
            log.debug(stringBuffer.toString());
        }
        try {
            this.e = Mac.getInstance(a2);
        } catch (NoSuchAlgorithmException e) {
            throw new XMLSignatureException(C0059ao.a(4309), new Object[]{a2, e.getLocalizedMessage()});
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
        a.debug(C0059ao.a(4310));
        return this.e.getAlgorithm();
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public void a(byte b) {
        try {
            this.e.update(b);
        } catch (IllegalStateException e) {
            throw new XMLSignatureException(C0059ao.a(4311), e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public void a(Key key) {
        if (!(key instanceof SecretKey)) {
            String name = key.getClass().getName();
            Class cls = d;
            if (cls == null) {
                cls = a(C0059ao.a(4312));
                d = cls;
            }
            throw new XMLSignatureException(C0059ao.a(4313), new Object[]{name, cls.getName()});
        }
        try {
            this.e.init(key);
        } catch (InvalidKeyException e) {
            Mac mac = this.e;
            try {
                this.e = Mac.getInstance(mac.getAlgorithm());
            } catch (Exception e2) {
                if (a.isDebugEnabled()) {
                    Log log = a;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(C0059ao.a(4314));
                    stringBuffer.append(e2);
                    log.debug(stringBuffer.toString());
                }
                this.e = mac;
            }
            throw new XMLSignatureException(C0059ao.a(4315), e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public void a(Element element) {
        super.a(element);
        if (element == null) {
            throw new IllegalArgumentException(C0059ao.a(4317));
        }
        Text b = XMLUtils.b(element.getFirstChild(), C0059ao.a(4316), 0);
        if (b != null) {
            this.b = Integer.parseInt(b.getData());
            this.f = true;
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public void a(byte[] bArr) {
        try {
            this.e.update(bArr);
        } catch (IllegalStateException e) {
            throw new XMLSignatureException(C0059ao.a(4318), e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public void a(byte[] bArr, int i, int i2) {
        try {
            this.e.update(bArr, i, i2);
        } catch (IllegalStateException e) {
            throw new XMLSignatureException(C0059ao.a(4319), e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public String b() {
        return this.e.getProvider().getName();
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public boolean b(byte[] bArr) {
        try {
            if (!this.f || this.b >= e()) {
                return MessageDigestAlgorithm.a(this.e.doFinal(), bArr);
            }
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(C0059ao.a(4320));
                stringBuffer.append(e());
                log.debug(stringBuffer.toString());
            }
            throw new XMLSignatureException(C0059ao.a(4321), new Object[]{String.valueOf(e())});
        } catch (IllegalStateException e) {
            throw new XMLSignatureException(C0059ao.a(4322), e);
        }
    }

    @Override // org.apache.xml.security.algorithms.SignatureAlgorithmSpi
    public void c() {
        this.b = 0;
        this.f = false;
        this.e.reset();
    }

    public abstract String d();

    public abstract int e();
}
