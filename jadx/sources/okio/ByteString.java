package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import myunmn.C0059ao;
import okio.internal.ByteStringKt;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final Companion Companion;
    public static final ByteString EMPTY;
    private static final long serialVersionUID = 0;
    private final byte[] data;
    private transient int hashCode;
    private transient String utf8;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i, Object obj) {
            if ((i & 1) != 0) {
                charset = qn0.b;
            }
            return companion.encodeString(str, charset);
        }

        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return companion.of(bArr, i, i2);
        }

        /* renamed from: -deprecated_decodeBase64  reason: not valid java name */
        public final ByteString m382deprecated_decodeBase64(String str) {
            yl0.e(str, C0059ao.a(10034));
            return decodeBase64(str);
        }

        /* renamed from: -deprecated_decodeHex  reason: not valid java name */
        public final ByteString m383deprecated_decodeHex(String str) {
            yl0.e(str, C0059ao.a(10035));
            return decodeHex(str);
        }

        /* renamed from: -deprecated_encodeString  reason: not valid java name */
        public final ByteString m384deprecated_encodeString(String str, Charset charset) {
            yl0.e(str, C0059ao.a(10036));
            yl0.e(charset, C0059ao.a(10037));
            return encodeString(str, charset);
        }

        /* renamed from: -deprecated_encodeUtf8  reason: not valid java name */
        public final ByteString m385deprecated_encodeUtf8(String str) {
            yl0.e(str, C0059ao.a(10038));
            return encodeUtf8(str);
        }

        /* renamed from: -deprecated_of  reason: not valid java name */
        public final ByteString m386deprecated_of(ByteBuffer byteBuffer) {
            yl0.e(byteBuffer, C0059ao.a(10039));
            return of(byteBuffer);
        }

        /* renamed from: -deprecated_read  reason: not valid java name */
        public final ByteString m388deprecated_read(InputStream inputStream, int i) {
            yl0.e(inputStream, C0059ao.a(10041));
            return read(inputStream, i);
        }

        public final ByteString decodeBase64(String str) {
            yl0.e(str, C0059ao.a(10042));
            byte[] decodeBase64ToArray = Base64.decodeBase64ToArray(str);
            if (decodeBase64ToArray != null) {
                return new ByteString(decodeBase64ToArray);
            }
            return null;
        }

        public final ByteString decodeHex(String str) {
            yl0.e(str, C0059ao.a(10043));
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) ((ByteStringKt.access$decodeHexDigit(str.charAt(i2)) << 4) + ByteStringKt.access$decodeHexDigit(str.charAt(i2 + 1)));
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException((C0059ao.a(10044) + str).toString());
        }

        public final ByteString encodeString(String str, Charset charset) {
            yl0.e(str, C0059ao.a(10045));
            yl0.e(charset, C0059ao.a(10046));
            byte[] bytes = str.getBytes(charset);
            yl0.d(bytes, C0059ao.a(10047));
            return new ByteString(bytes);
        }

        public final ByteString encodeUtf8(String str) {
            yl0.e(str, C0059ao.a(10048));
            ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        public final ByteString of(ByteBuffer byteBuffer) {
            yl0.e(byteBuffer, C0059ao.a(10049));
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }

        public final ByteString read(InputStream inputStream, int i) throws IOException {
            yl0.e(inputStream, C0059ao.a(10053));
            int i2 = 0;
            if (i >= 0) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    i2 += read;
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException((C0059ao.a(10054) + i).toString());
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }

        /* renamed from: -deprecated_of  reason: not valid java name */
        public final ByteString m387deprecated_of(byte[] bArr, int i, int i2) {
            yl0.e(bArr, C0059ao.a(10040));
            return of(bArr, i, i2);
        }

        public final ByteString of(byte... bArr) {
            yl0.e(bArr, C0059ao.a(10050));
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            yl0.d(copyOf, C0059ao.a(10051));
            return new ByteString(copyOf);
        }

        public final ByteString of(byte[] bArr, int i, int i2) {
            yl0.e(bArr, C0059ao.a(10052));
            Util.checkOffsetAndCount(bArr.length, i, i2);
            return new ByteString(wi0.e(bArr, i, i2 + i));
        }
    }

    static {
        C0059ao.a(ByteString.class, 412);
        Companion = new Companion(null);
        EMPTY = new ByteString(new byte[0]);
    }

    public ByteString(byte[] bArr) {
        yl0.e(bArr, C0059ao.a(4378));
        this.data = bArr;
    }

    public static final ByteString decodeBase64(String str) {
        return Companion.decodeBase64(str);
    }

    public static final ByteString decodeHex(String str) {
        return Companion.decodeHex(str);
    }

    public static final ByteString encodeString(String str, Charset charset) {
        return Companion.encodeString(str, charset);
    }

    public static final ByteString encodeUtf8(String str) {
        return Companion.encodeUtf8(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.indexOf(byteString2, i);
        }
        throw new UnsupportedOperationException(C0059ao.a(4379));
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.indexOf(bArr, i);
        }
        throw new UnsupportedOperationException(C0059ao.a(4380));
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = byteString.size();
            }
            return byteString.lastIndexOf(byteString2, i);
        }
        throw new UnsupportedOperationException(C0059ao.a(4381));
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = byteString.size();
            }
            return byteString.lastIndexOf(bArr, i);
        }
        throw new UnsupportedOperationException(C0059ao.a(4382));
    }

    public static final ByteString of(ByteBuffer byteBuffer) {
        return Companion.of(byteBuffer);
    }

    public static final ByteString of(byte... bArr) {
        return Companion.of(bArr);
    }

    public static final ByteString of(byte[] bArr, int i, int i2) {
        return Companion.of(bArr, i, i2);
    }

    public static final ByteString read(InputStream inputStream, int i) throws IOException {
        return Companion.read(inputStream, i);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        ByteString read = Companion.read(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField(C0059ao.a(4383));
        yl0.d(declaredField, C0059ao.a(4384));
        declaredField.setAccessible(true);
        declaredField.set(this, read.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = byteString.size();
            }
            return byteString.substring(i, i2);
        }
        throw new UnsupportedOperationException(C0059ao.a(4385));
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    /* renamed from: -deprecated_getByte  reason: not valid java name */
    public final byte m380deprecated_getByte(int i) {
        return getByte(i);
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m381deprecated_size() {
        return size();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        yl0.d(asReadOnlyBuffer, C0059ao.a(4386));
        return asReadOnlyBuffer;
    }

    public String base64() {
        return Base64.encodeBase64$default(getData$okio(), null, 1, null);
    }

    public String base64Url() {
        return Base64.encodeBase64(getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public ByteString digest$okio(String str) {
        yl0.e(str, C0059ao.a(4388));
        return ByteStringKt.commonDigest(this, str);
    }

    public final boolean endsWith(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(4389));
        return rangeEquals(size() - byteString.size(), byteString, 0, byteString.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte getByte(int i) {
        return internalGet$okio(i);
    }

    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    public final String getUtf8$okio() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(hashCode);
        return hashCode;
    }

    public String hex() {
        byte[] data$okio;
        char[] cArr = new char[getData$okio().length * 2];
        int i = 0;
        for (byte b : getData$okio()) {
            int i2 = i + 1;
            cArr[i] = ByteStringKt.getHEX_DIGIT_CHARS()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = ByteStringKt.getHEX_DIGIT_CHARS()[b & 15];
        }
        return new String(cArr);
    }

    public ByteString hmac$okio(String str, ByteString byteString) {
        yl0.e(str, C0059ao.a(4391));
        yl0.e(byteString, C0059ao.a(4392));
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            byte[] doFinal = mac.doFinal(this.data);
            yl0.d(doFinal, C0059ao.a(4393));
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public ByteString hmacSha1(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(4394));
        return hmac$okio(C0059ao.a(4395), byteString);
    }

    public ByteString hmacSha256(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(4396));
        return hmac$okio(C0059ao.a(4397), byteString);
    }

    public ByteString hmacSha512(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(4398));
        return hmac$okio(C0059ao.a(4399), byteString);
    }

    public final int indexOf(ByteString byteString) {
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public final int indexOf(ByteString byteString, int i) {
        yl0.e(byteString, C0059ao.a(4400));
        return indexOf(byteString.internalArray$okio(), i);
    }

    public final int indexOf(byte[] bArr) {
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i) {
        return getData$okio()[i];
    }

    public final int lastIndexOf(ByteString byteString) {
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public final int lastIndexOf(ByteString byteString, int i) {
        yl0.e(byteString, C0059ao.a(4402));
        return lastIndexOf(byteString.internalArray$okio(), i);
    }

    public final int lastIndexOf(byte[] bArr) {
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public final ByteString md5() {
        return digest$okio(C0059ao.a(4404));
    }

    public boolean rangeEquals(int i, ByteString byteString, int i2, int i3) {
        yl0.e(byteString, C0059ao.a(4405));
        return byteString.rangeEquals(i2, getData$okio(), i, i3);
    }

    public final void setHashCode$okio(int i) {
        this.hashCode = i;
    }

    public final void setUtf8$okio(String str) {
        this.utf8 = str;
    }

    public final ByteString sha1() {
        return digest$okio(C0059ao.a(4407));
    }

    public final ByteString sha256() {
        return digest$okio(C0059ao.a(4408));
    }

    public final ByteString sha512() {
        return digest$okio(C0059ao.a(4409));
    }

    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(4410));
        return rangeEquals(0, byteString, 0, byteString.size());
    }

    public String string(Charset charset) {
        yl0.e(charset, C0059ao.a(4412));
        return new String(this.data, charset);
    }

    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    public final ByteString substring(int i) {
        return substring$default(this, i, 0, 2, null);
    }

    public ByteString substring(int i, int i2) {
        if (i >= 0) {
            if (i2 <= getData$okio().length) {
                if (i2 - i >= 0) {
                    return (i == 0 && i2 == getData$okio().length) ? this : new ByteString(wi0.e(getData$okio(), i, i2));
                }
                throw new IllegalArgumentException(C0059ao.a(4413).toString());
            }
            throw new IllegalArgumentException((C0059ao.a(4414) + getData$okio().length + ')').toString());
        }
        throw new IllegalArgumentException(C0059ao.a(4415).toString());
    }

    public ByteString toAsciiLowercase() {
        byte b;
        for (int i = 0; i < getData$okio().length; i++) {
            byte b2 = getData$okio()[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                yl0.d(copyOf, C0059ao.a(4416));
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public ByteString toAsciiUppercase() {
        byte b;
        for (int i = 0; i < getData$okio().length; i++) {
            byte b2 = getData$okio()[i];
            byte b3 = (byte) 97;
            if (b2 >= b3 && b2 <= (b = (byte) 122)) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                yl0.d(copyOf, C0059ao.a(4417));
                copyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        yl0.d(copyOf, C0059ao.a(4418));
        return copyOf;
    }

    public String toString() {
        if (getData$okio().length == 0) {
            return C0059ao.a(4419);
        }
        int access$codePointIndexToCharIndex = ByteStringKt.access$codePointIndexToCharIndex(getData$okio(), 64);
        String a = C0059ao.a(4420);
        String a2 = C0059ao.a(4421);
        if (access$codePointIndexToCharIndex == -1) {
            if (getData$okio().length <= 64) {
                return C0059ao.a(4422) + hex() + ']';
            }
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append(getData$okio().length);
            sb.append(C0059ao.a(4423));
            if (64 <= getData$okio().length) {
                sb.append((64 == getData$okio().length ? this : new ByteString(wi0.e(getData$okio(), 0, 64))).hex());
                sb.append(a);
                return sb.toString();
            }
            throw new IllegalArgumentException((C0059ao.a(4424) + getData$okio().length + ')').toString());
        }
        String utf8 = utf8();
        Objects.requireNonNull(utf8, C0059ao.a(4425));
        String substring = utf8.substring(0, access$codePointIndexToCharIndex);
        yl0.d(substring, C0059ao.a(4426));
        String s = bo0.s(bo0.s(bo0.s(substring, C0059ao.a(4427), C0059ao.a(4428), false, 4, null), C0059ao.a(4429), C0059ao.a(4430), false, 4, null), C0059ao.a(4431), C0059ao.a(4432), false, 4, null);
        if (access$codePointIndexToCharIndex < utf8.length()) {
            return a2 + getData$okio().length + C0059ao.a(4433) + s + a;
        }
        return C0059ao.a(4434) + s + ']';
    }

    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio == null) {
            String utf8String = Platform.toUtf8String(internalArray$okio());
            setUtf8$okio(utf8String);
            return utf8String;
        }
        return utf8$okio;
    }

    public void write(OutputStream outputStream) throws IOException {
        yl0.e(outputStream, C0059ao.a(4435));
        outputStream.write(this.data);
    }

    public void write$okio(Buffer buffer, int i, int i2) {
        yl0.e(buffer, C0059ao.a(4436));
        ByteStringKt.commonWrite(this, buffer, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r0 < r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r7 < r8) goto L12;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(okio.ByteString r10) {
        /*
            r9 = this;
            r0 = 4387(0x1123, float:6.147E-42)
            java.lang.String r0 = myunmn.C0059ao.a(r0)
            defpackage.yl0.e(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L18:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L30
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L2d
            int r4 = r4 + 1
            goto L18
        L2d:
            if (r7 >= r8) goto L37
            goto L35
        L30:
            if (r0 != r1) goto L33
            goto L38
        L33:
            if (r0 >= r1) goto L37
        L35:
            r3 = r5
            goto L38
        L37:
            r3 = r6
        L38:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    public final boolean endsWith(byte[] bArr) {
        yl0.e(bArr, C0059ao.a(4390));
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public int indexOf(byte[] bArr, int i) {
        yl0.e(bArr, C0059ao.a(4401));
        int length = getData$okio().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!Util.arrayRangeEquals(getData$okio(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public int lastIndexOf(byte[] bArr, int i) {
        yl0.e(bArr, C0059ao.a(4403));
        for (int min = Math.min(i, getData$okio().length - bArr.length); min >= 0; min--) {
            if (Util.arrayRangeEquals(getData$okio(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        yl0.e(bArr, C0059ao.a(4406));
        return i >= 0 && i <= getData$okio().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && Util.arrayRangeEquals(getData$okio(), i, bArr, i2, i3);
    }

    public final boolean startsWith(byte[] bArr) {
        yl0.e(bArr, C0059ao.a(4411));
        return rangeEquals(0, bArr, 0, bArr.length);
    }
}
