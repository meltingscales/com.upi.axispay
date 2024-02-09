package org.apache.commons.codec;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class DecoderException extends Exception {
    private static final long serialVersionUID = 0;

    static {
        C0059ao.a(DecoderException.class, 406);
    }

    public DecoderException() {
    }

    public DecoderException(String str) {
        super(str);
    }

    public DecoderException(String str, Throwable th) {
        super(str, th);
    }

    public DecoderException(Throwable th) {
        super(th);
    }
}
