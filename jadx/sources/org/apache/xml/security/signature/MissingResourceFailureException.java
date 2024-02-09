package org.apache.xml.security.signature;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class MissingResourceFailureException extends XMLSignatureException {
    public Reference c;

    public MissingResourceFailureException(String str, Reference reference) {
        super(str);
        this.c = null;
        this.c = reference;
    }

    public MissingResourceFailureException(String str, Object[] objArr, Exception exc, Reference reference) {
        super(str, objArr, exc);
        this.c = null;
        this.c = reference;
    }
}
