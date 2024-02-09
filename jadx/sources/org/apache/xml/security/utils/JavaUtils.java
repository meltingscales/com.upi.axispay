package org.apache.xml.security.utils;

import java.io.InputStream;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class JavaUtils {
    public static Log a;
    public static Class b;

    static {
        Class cls = b;
        if (cls == null) {
            cls = a(C0059ao.a(12145));
            b = cls;
        }
        a = LogFactory.getLog(cls.getName());
    }

    private JavaUtils() {
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public static byte[] a(InputStream inputStream) {
        UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return unsyncByteArrayOutputStream.a();
            }
            unsyncByteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
