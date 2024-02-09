package org.apache.commons.codec;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class EncoderException extends Exception {
    private static final long serialVersionUID = 0;

    static {
        C0059ao.a(EncoderException.class, 410);
    }

    public EncoderException() {
    }

    public EncoderException(String str) {
        super(str);
    }

    public EncoderException(String str, Throwable th) {
        super(str, th);
    }

    public EncoderException(Throwable th) {
        super(th);
    }
}
