package org.apache.xml.security.utils;

import java.io.ByteArrayOutputStream;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.SignatureAlgorithm;
import org.apache.xml.security.signature.XMLSignatureException;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class SignerOutputStream extends ByteArrayOutputStream {
    public static Log b;
    public static Class c;
    public final SignatureAlgorithm a;

    static {
        Class cls = c;
        if (cls == null) {
            cls = a(C0059ao.a(9911));
            c = cls;
        }
        b = LogFactory.getLog(cls.getName());
    }

    public SignerOutputStream(SignatureAlgorithm signatureAlgorithm) {
        this.a = signatureAlgorithm;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(int i) {
        try {
            this.a.a((byte) i);
        } catch (XMLSignatureException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(9912));
            stringBuffer.append(e);
            throw new RuntimeException(stringBuffer.toString());
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            this.a.a(bArr);
        } catch (XMLSignatureException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(9913));
            stringBuffer.append(e);
            throw new RuntimeException(stringBuffer.toString());
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (b.isDebugEnabled()) {
            b.debug(C0059ao.a(9914));
            StringBuffer stringBuffer = new StringBuffer(i2);
            for (int i3 = i; i3 < i + i2; i3++) {
                stringBuffer.append((char) bArr[i3]);
            }
            b.debug(stringBuffer.toString());
        }
        try {
            this.a.a(bArr, i, i2);
        } catch (XMLSignatureException e) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(C0059ao.a(9915));
            stringBuffer2.append(e);
            throw new RuntimeException(stringBuffer2.toString());
        }
    }
}
