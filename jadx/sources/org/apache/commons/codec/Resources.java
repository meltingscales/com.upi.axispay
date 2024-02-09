package org.apache.commons.codec;

import java.io.InputStream;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Resources {
    public static InputStream getInputStream(String str) {
        InputStream resourceAsStream = Resources.class.getClassLoader().getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        throw new IllegalArgumentException(C0059ao.a(9518) + str);
    }
}
