package org.apache.xml.security.keys.content.x509;

import java.util.Arrays;
import myunmn.C0059ao;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.utils.SignatureElementProxy;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class XMLX509Certificate extends SignatureElementProxy implements XMLX509DataContent {
    public byte[] a() {
        return n();
    }

    @Override // org.apache.xml.security.utils.ElementProxy
    public String e() {
        return C0059ao.a(8657);
    }

    public boolean equals(Object obj) {
        if (obj instanceof XMLX509Certificate) {
            try {
                return Arrays.equals(((XMLX509Certificate) obj).a(), a());
            } catch (XMLSecurityException unused) {
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 17;
        try {
            for (byte b : a()) {
                i = b + (i * 31);
            }
        } catch (XMLSecurityException unused) {
        }
        return i;
    }
}
