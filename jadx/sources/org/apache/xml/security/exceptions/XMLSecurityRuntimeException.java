package org.apache.xml.security.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.MessageFormat;
import myunmn.C0059ao;
import org.apache.xml.security.utils.I18n;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class XMLSecurityRuntimeException extends RuntimeException {
    public Exception a;
    public String b;

    public XMLSecurityRuntimeException() {
        super(C0059ao.a(1680));
        this.a = null;
        this.b = null;
        this.a = null;
    }

    public XMLSecurityRuntimeException(String str, Exception exc) {
        super(I18n.a(str, exc));
        this.a = null;
        this.b = str;
        this.a = exc;
    }

    public XMLSecurityRuntimeException(String str, Object[] objArr, Exception exc) {
        super(MessageFormat.format(I18n.b(str), objArr));
        this.a = null;
        this.b = str;
        this.a = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        synchronized (System.err) {
            super.printStackTrace(System.err);
            Exception exc = this.a;
            if (exc != null) {
                exc.printStackTrace(System.err);
            }
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        Exception exc = this.a;
        if (exc != null) {
            exc.printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        Exception exc = this.a;
        if (exc != null) {
            exc.printStackTrace(printWriter);
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        String name = getClass().getName();
        String localizedMessage = super.getLocalizedMessage();
        if (localizedMessage != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(name);
            stringBuffer.append(C0059ao.a(1681));
            stringBuffer.append(localizedMessage);
            name = stringBuffer.toString();
        }
        if (this.a != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(name);
            stringBuffer2.append(C0059ao.a(1682));
            stringBuffer2.append(this.a.toString());
            return stringBuffer2.toString();
        }
        return name;
    }
}
