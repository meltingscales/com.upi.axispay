package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import myunmn.C0059ao;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.StringUtils;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class RFC1522Codec {
    public static final String POSTFIX = null;
    public static final String PREFIX = null;
    public static final char SEP = 0;

    static {
        C0059ao.a(RFC1522Codec.class, 339);
    }

    public String decodeText(String str) throws DecoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        if (str.startsWith(C0059ao.a(4362)) && str.endsWith(C0059ao.a(4363))) {
            int length = str.length() - 2;
            int indexOf = str.indexOf(63, 2);
            if (indexOf != length) {
                String substring = str.substring(2, indexOf);
                if (!substring.equals(C0059ao.a(4364))) {
                    int i = indexOf + 1;
                    int indexOf2 = str.indexOf(63, i);
                    if (indexOf2 != length) {
                        String substring2 = str.substring(i, indexOf2);
                        if (getEncoding().equalsIgnoreCase(substring2)) {
                            int i2 = indexOf2 + 1;
                            return new String(doDecoding(StringUtils.getBytesUsAscii(str.substring(i2, str.indexOf(63, i2)))), substring);
                        }
                        throw new DecoderException(C0059ao.a(4365) + substring2 + C0059ao.a(4366));
                    }
                    throw new DecoderException(C0059ao.a(4367));
                }
                throw new DecoderException(C0059ao.a(4368));
            }
            throw new DecoderException(C0059ao.a(4369));
        }
        throw new DecoderException(C0059ao.a(4370));
    }

    public abstract byte[] doDecoding(byte[] bArr) throws DecoderException;

    public abstract byte[] doEncoding(byte[] bArr) throws EncoderException;

    public String encodeText(String str, Charset charset) throws EncoderException {
        if (str == null) {
            return null;
        }
        return C0059ao.a(4371) + charset + '?' + getEncoding() + '?' + StringUtils.newStringUsAscii(doEncoding(str.getBytes(charset))) + C0059ao.a(4372);
    }

    public abstract String getEncoding();

    public String encodeText(String str, String str2) throws EncoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return encodeText(str, Charset.forName(str2));
    }
}
