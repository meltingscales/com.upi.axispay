package org.apache.commons.codec.net;

import com.google.android.gms.vision.barcode.Barcode;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import myunmn.C0059ao;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class URLCodec implements BinaryEncoder, BinaryDecoder, StringEncoder, StringDecoder {
    public static final byte ESCAPE_CHAR = 0;
    @Deprecated
    public static final BitSet WWW_FORM_URL;
    private static final BitSet WWW_FORM_URL_SAFE;
    @Deprecated
    public volatile String charset;

    static {
        C0059ao.a(URLCodec.class, 389);
        WWW_FORM_URL_SAFE = new BitSet(Barcode.QR_CODE);
        for (int i = 97; i <= 122; i++) {
            WWW_FORM_URL_SAFE.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            WWW_FORM_URL_SAFE.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            WWW_FORM_URL_SAFE.set(i3);
        }
        BitSet bitSet = WWW_FORM_URL_SAFE;
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
        bitSet.set(32);
        WWW_FORM_URL = (BitSet) bitSet.clone();
    }

    public URLCodec() {
        this(C0059ao.a(6753));
    }

    public static final byte[] decodeUrl(byte[] bArr) throws DecoderException {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 43) {
                byteArrayOutputStream.write(32);
            } else if (b == 37) {
                int i2 = i + 1;
                try {
                    int digit16 = Utils.digit16(bArr[i2]);
                    i = i2 + 1;
                    byteArrayOutputStream.write((char) ((digit16 << 4) + Utils.digit16(bArr[i])));
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new DecoderException(C0059ao.a(6754), e);
                }
            } else {
                byteArrayOutputStream.write(b);
            }
            i++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static final byte[] encodeUrl(BitSet bitSet, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bitSet == null) {
            bitSet = WWW_FORM_URL_SAFE;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = bArr[i];
            if (i2 < 0) {
                i2 += Barcode.QR_CODE;
            }
            if (bitSet.get(i2)) {
                if (i2 == 32) {
                    i2 = 43;
                }
                byteArrayOutputStream.write(i2);
            } else {
                byteArrayOutputStream.write(37);
                char hexDigit = Utils.hexDigit(i2 >> 4);
                char hexDigit2 = Utils.hexDigit(i2);
                byteArrayOutputStream.write(hexDigit);
                byteArrayOutputStream.write(hexDigit2);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) throws DecoderException {
        return decodeUrl(bArr);
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return encodeUrl(WWW_FORM_URL_SAFE, bArr);
    }

    public String getDefaultCharset() {
        return this.charset;
    }

    @Deprecated
    public String getEncoding() {
        return this.charset;
    }

    public URLCodec(String str) {
        this.charset = str;
    }

    public String decode(String str, String str2) throws DecoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return new String(decode(StringUtils.getBytesUsAscii(str)), str2);
    }

    public String encode(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return StringUtils.newStringUsAscii(encode(str.getBytes(str2)));
    }

    @Override // org.apache.commons.codec.StringDecoder
    public String decode(String str) throws DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return decode(str, getDefaultCharset());
        } catch (UnsupportedEncodingException e) {
            throw new DecoderException(e.getMessage(), e);
        }
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) throws EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return encode(str, getDefaultCharset());
        } catch (UnsupportedEncodingException e) {
            throw new EncoderException(e.getMessage(), e);
        }
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException(C0059ao.a(6755) + obj.getClass().getName() + C0059ao.a(6756));
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException(C0059ao.a(6757) + obj.getClass().getName() + C0059ao.a(6758));
    }
}
