package org.apache.commons.codec.net;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.util.BitSet;
import myunmn.C0059ao;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class PercentCodec implements BinaryEncoder, BinaryDecoder {
    private static final byte ESCAPE_CHAR = 0;
    private final BitSet alwaysEncodeChars;
    private int alwaysEncodeCharsMax;
    private int alwaysEncodeCharsMin;
    private final boolean plusForSpace;

    static {
        C0059ao.a(PercentCodec.class, 373);
    }

    public PercentCodec() {
        this.alwaysEncodeChars = new BitSet();
        this.alwaysEncodeCharsMin = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.alwaysEncodeCharsMax = RecyclerView.UNDEFINED_DURATION;
        this.plusForSpace = false;
        insertAlwaysEncodeChar((byte) 37);
    }

    private boolean canEncode(byte b) {
        return !isAsciiChar(b) || (inAlwaysEncodeCharsRange(b) && this.alwaysEncodeChars.get(b));
    }

    private boolean containsSpace(byte[] bArr) {
        for (byte b : bArr) {
            if (b == 32) {
                return true;
            }
        }
        return false;
    }

    private byte[] doEncode(byte[] bArr, int i, boolean z) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        for (byte b : bArr) {
            if (z && canEncode(b)) {
                if (b < 0) {
                    b = (byte) (b + 256);
                }
                char hexDigit = Utils.hexDigit(b >> 4);
                char hexDigit2 = Utils.hexDigit(b);
                allocate.put((byte) 37);
                allocate.put((byte) hexDigit);
                allocate.put((byte) hexDigit2);
            } else if (this.plusForSpace && b == 32) {
                allocate.put((byte) 43);
            } else {
                allocate.put(b);
            }
        }
        return allocate.array();
    }

    private int expectedDecodingBytes(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            i += bArr[i] == 37 ? 3 : 1;
            i2++;
        }
        return i2;
    }

    private int expectedEncodingBytes(byte[] bArr) {
        int i = 0;
        for (byte b : bArr) {
            i += canEncode(b) ? 3 : 1;
        }
        return i;
    }

    private boolean inAlwaysEncodeCharsRange(byte b) {
        return b >= this.alwaysEncodeCharsMin && b <= this.alwaysEncodeCharsMax;
    }

    private void insertAlwaysEncodeChar(byte b) {
        this.alwaysEncodeChars.set(b);
        if (b < this.alwaysEncodeCharsMin) {
            this.alwaysEncodeCharsMin = b;
        }
        if (b > this.alwaysEncodeCharsMax) {
            this.alwaysEncodeCharsMax = b;
        }
    }

    private void insertAlwaysEncodeChars(byte[] bArr) {
        if (bArr != null) {
            for (byte b : bArr) {
                insertAlwaysEncodeChar(b);
            }
        }
        insertAlwaysEncodeChar((byte) 37);
    }

    private boolean isAsciiChar(byte b) {
        return b >= 0;
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) throws DecoderException {
        if (bArr == null) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(expectedDecodingBytes(bArr));
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 37) {
                int i2 = i + 1;
                try {
                    int digit16 = Utils.digit16(bArr[i2]);
                    i = i2 + 1;
                    allocate.put((byte) ((digit16 << 4) + Utils.digit16(bArr[i])));
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new DecoderException(C0059ao.a(2281), e);
                }
            } else if (this.plusForSpace && b == 43) {
                allocate.put((byte) 32);
            } else {
                allocate.put(b);
            }
            i++;
        }
        return allocate.array();
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) throws EncoderException {
        if (bArr == null) {
            return null;
        }
        int expectedEncodingBytes = expectedEncodingBytes(bArr);
        boolean z = expectedEncodingBytes != bArr.length;
        return (z || (this.plusForSpace && containsSpace(bArr))) ? doEncode(bArr, expectedEncodingBytes, z) : bArr;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException(C0059ao.a(2282) + obj.getClass().getName() + C0059ao.a(2283));
    }

    public PercentCodec(byte[] bArr, boolean z) {
        this.alwaysEncodeChars = new BitSet();
        this.alwaysEncodeCharsMin = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.alwaysEncodeCharsMax = RecyclerView.UNDEFINED_DURATION;
        this.plusForSpace = z;
        insertAlwaysEncodeChars(bArr);
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        throw new DecoderException(C0059ao.a(2279) + obj.getClass().getName() + C0059ao.a(2280));
    }
}
