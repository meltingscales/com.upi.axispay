package org.apache.commons.codec.language;

import myunmn.C0059ao;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class AbstractCaverphone implements StringEncoder {
    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException(C0059ao.a(10935));
    }

    public boolean isEncodeEqual(String str, String str2) throws EncoderException {
        return encode(str).equals(encode(str2));
    }
}
