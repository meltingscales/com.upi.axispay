package org.apache.commons.codec.binary;

import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import java.util.Objects;
import myunmn.C0059ao;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class BaseNCodec implements BinaryEncoder, BinaryDecoder {
    public static final byte[] CHUNK_SEPARATOR;
    public static final CodecPolicy DECODING_POLICY_DEFAULT;
    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 0;
    private static final int DEFAULT_BUFFER_SIZE = 0;
    public static final int EOF = 0;
    public static final int MASK_8BITS = 0;
    private static final int MAX_BUFFER_SIZE = 0;
    public static final int MIME_CHUNK_SIZE = 0;
    public static final byte PAD_DEFAULT = 0;
    public static final int PEM_CHUNK_SIZE = 0;
    @Deprecated
    public final byte PAD;
    private final int chunkSeparatorLength;
    private final CodecPolicy decodingPolicy;
    private final int encodedBlockSize;
    public final int lineLength;
    public final byte pad;
    private final int unencodedBlockSize;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static class Context {
        public byte[] buffer;
        public int currentLinePos;
        public boolean eof;
        public int ibitWorkArea;
        public long lbitWorkArea;
        public int modulus;
        public int pos;
        public int readPos;

        public String toString() {
            return String.format(C0059ao.a(4262), getClass().getSimpleName(), Arrays.toString(this.buffer), Integer.valueOf(this.currentLinePos), Boolean.valueOf(this.eof), Integer.valueOf(this.ibitWorkArea), Long.valueOf(this.lbitWorkArea), Integer.valueOf(this.modulus), Integer.valueOf(this.pos), Integer.valueOf(this.readPos));
        }
    }

    static {
        C0059ao.a(BaseNCodec.class, 165);
        DECODING_POLICY_DEFAULT = CodecPolicy.LENIENT;
        CHUNK_SEPARATOR = new byte[]{13, 10};
    }

    public BaseNCodec(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, (byte) 61);
    }

    private static int compareUnsigned(int i, int i2) {
        return Integer.compare(i + RecyclerView.UNDEFINED_DURATION, i2 + RecyclerView.UNDEFINED_DURATION);
    }

    private static int createPositiveCapacity(int i) {
        if (i >= 0) {
            if (i > 2147483639) {
                return i;
            }
            return 2147483639;
        }
        throw new OutOfMemoryError(C0059ao.a(13098) + (i & 4294967295L));
    }

    public static byte[] getChunkSeparator() {
        return (byte[]) CHUNK_SEPARATOR.clone();
    }

    public static boolean isWhiteSpace(byte b) {
        return b == 9 || b == 10 || b == 13 || b == 32;
    }

    private static byte[] resizeBuffer(Context context, int i) {
        int length = context.buffer.length * 2;
        if (compareUnsigned(length, i) < 0) {
            length = i;
        }
        if (compareUnsigned(length, 2147483639) > 0) {
            length = createPositiveCapacity(i);
        }
        byte[] bArr = new byte[length];
        byte[] bArr2 = context.buffer;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        context.buffer = bArr;
        return bArr;
    }

    public int available(Context context) {
        if (context.buffer != null) {
            return context.pos - context.readPos;
        }
        return 0;
    }

    public boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (this.pad == b || isInAlphabet(b)) {
                return true;
            }
        }
        return false;
    }

    public abstract void decode(byte[] bArr, int i, int i2, Context context);

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        decode(bArr, 0, bArr.length, context);
        decode(bArr, 0, -1, context);
        int i = context.pos;
        byte[] bArr2 = new byte[i];
        readResults(bArr2, 0, i, context);
        return bArr2;
    }

    public abstract void encode(byte[] bArr, int i, int i2, Context context);

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : encode(bArr, 0, bArr.length);
    }

    public String encodeAsString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public String encodeToString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public byte[] ensureBufferSize(int i, Context context) {
        byte[] bArr = context.buffer;
        if (bArr == null) {
            context.buffer = new byte[Math.max(i, getDefaultBufferSize())];
            context.pos = 0;
            context.readPos = 0;
        } else {
            int i2 = context.pos;
            if ((i2 + i) - bArr.length > 0) {
                return resizeBuffer(context, i2 + i);
            }
        }
        return context.buffer;
    }

    public CodecPolicy getCodecPolicy() {
        return this.decodingPolicy;
    }

    public int getDefaultBufferSize() {
        return UserMetadata.MAX_INTERNAL_KEY_SIZE;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i = this.unencodedBlockSize;
        long j = (((length + i) - 1) / i) * this.encodedBlockSize;
        int i2 = this.lineLength;
        return i2 > 0 ? j + ((((i2 + j) - 1) / i2) * this.chunkSeparatorLength) : j;
    }

    public boolean hasData(Context context) {
        return context.buffer != null;
    }

    public abstract boolean isInAlphabet(byte b);

    public boolean isInAlphabet(byte[] bArr, boolean z) {
        for (byte b : bArr) {
            if (!isInAlphabet(b) && (!z || (b != this.pad && !isWhiteSpace(b)))) {
                return false;
            }
        }
        return true;
    }

    public boolean isStrictDecoding() {
        return this.decodingPolicy == CodecPolicy.STRICT;
    }

    public int readResults(byte[] bArr, int i, int i2, Context context) {
        if (context.buffer == null) {
            return context.eof ? -1 : 0;
        }
        int min = Math.min(available(context), i2);
        System.arraycopy(context.buffer, context.readPos, bArr, i, min);
        int i3 = context.readPos + min;
        context.readPos = i3;
        if (i3 >= context.pos) {
            context.buffer = null;
        }
        return min;
    }

    public BaseNCodec(int i, int i2, int i3, int i4, byte b) {
        this(i, i2, i3, i4, b, DECODING_POLICY_DEFAULT);
    }

    public BaseNCodec(int i, int i2, int i3, int i4, byte b, CodecPolicy codecPolicy) {
        this.PAD = (byte) 61;
        this.unencodedBlockSize = i;
        this.encodedBlockSize = i2;
        this.lineLength = i3 > 0 && i4 > 0 ? (i3 / i2) * i2 : 0;
        this.chunkSeparatorLength = i4;
        this.pad = b;
        Objects.requireNonNull(codecPolicy, C0059ao.a(13097));
        this.decodingPolicy = codecPolicy;
    }

    public byte[] encode(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        encode(bArr, i, i2, context);
        encode(bArr, i, -1, context);
        int i3 = context.pos - context.readPos;
        byte[] bArr2 = new byte[i3];
        readResults(bArr2, 0, i3, context);
        return bArr2;
    }

    public boolean isInAlphabet(String str) {
        return isInAlphabet(StringUtils.getBytesUtf8(str), true);
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException(C0059ao.a(13099));
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException(C0059ao.a(13100));
    }

    public byte[] decode(String str) {
        return decode(StringUtils.getBytesUtf8(str));
    }
}
