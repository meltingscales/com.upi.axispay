package org.apache.xml.security.utils;

import java.io.ByteArrayOutputStream;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.MessageDigestAlgorithm;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class DigesterOutputStream extends ByteArrayOutputStream {
    public static Log b;
    public static Class c;
    public final MessageDigestAlgorithm a;

    static {
        Class cls = c;
        if (cls == null) {
            cls = a(C0059ao.a(613));
            c = cls;
        }
        b = LogFactory.getLog(cls.getName());
    }

    public DigesterOutputStream(MessageDigestAlgorithm messageDigestAlgorithm) {
        this.a = messageDigestAlgorithm;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public byte[] a() {
        return this.a.b();
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(int i) {
        this.a.a((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (b.isDebugEnabled()) {
            b.debug(C0059ao.a(614));
            StringBuffer stringBuffer = new StringBuffer(i2);
            for (int i3 = i; i3 < i + i2; i3++) {
                stringBuffer.append((char) bArr[i3]);
            }
            b.debug(stringBuffer.toString());
        }
        this.a.a(bArr, i, i2);
    }
}
