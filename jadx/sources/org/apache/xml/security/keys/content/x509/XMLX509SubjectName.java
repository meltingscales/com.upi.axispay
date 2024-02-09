package org.apache.xml.security.keys.content.x509;

import myunmn.C0059ao;
import org.apache.xml.security.utils.RFC2253Parser;
import org.apache.xml.security.utils.SignatureElementProxy;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class XMLX509SubjectName extends SignatureElementProxy implements XMLX509DataContent {
    public String a() {
        return RFC2253Parser.a(o());
    }

    @Override // org.apache.xml.security.utils.ElementProxy
    public String e() {
        return C0059ao.a(4209);
    }

    public boolean equals(Object obj) {
        if (obj instanceof XMLX509SubjectName) {
            return a().equals(((XMLX509SubjectName) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return 527 + a().hashCode();
    }
}
