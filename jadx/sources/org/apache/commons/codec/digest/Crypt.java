package org.apache.commons.codec.digest;

import java.nio.charset.StandardCharsets;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Crypt {
    public static String crypt(byte[] bArr) {
        return crypt(bArr, (String) null);
    }

    public static String crypt(byte[] bArr, String str) {
        if (str == null) {
            return Sha2Crypt.sha512Crypt(bArr);
        }
        if (str.startsWith(C0059ao.a(11372))) {
            return Sha2Crypt.sha512Crypt(bArr, str);
        }
        if (str.startsWith(C0059ao.a(11373))) {
            return Sha2Crypt.sha256Crypt(bArr, str);
        }
        if (str.startsWith(C0059ao.a(11374))) {
            return Md5Crypt.md5Crypt(bArr, str);
        }
        return UnixCrypt.crypt(bArr, str);
    }

    public static String crypt(String str) {
        return crypt(str, (String) null);
    }

    public static String crypt(String str, String str2) {
        return crypt(str.getBytes(StandardCharsets.UTF_8), str2);
    }
}
