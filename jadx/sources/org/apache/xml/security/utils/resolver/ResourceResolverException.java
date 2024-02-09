package org.apache.xml.security.utils.resolver;

import org.apache.xml.security.exceptions.XMLSecurityException;
import org.w3c.dom.Attr;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class ResourceResolverException extends XMLSecurityException {
    public Attr c;
    public String d;

    public ResourceResolverException(String str, Exception exc, Attr attr, String str2) {
        super(str, exc);
        this.c = null;
        this.c = attr;
        this.d = str2;
    }

    public ResourceResolverException(String str, Object[] objArr, Attr attr, String str2) {
        super(str, objArr);
        this.c = null;
        this.c = attr;
        this.d = str2;
    }
}
