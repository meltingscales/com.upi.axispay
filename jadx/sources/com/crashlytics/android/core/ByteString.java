package com.crashlytics.android.core;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class ByteString {
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private final byte[] bytes;
    private volatile int hash;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class CodedBuilder {
        private final byte[] buffer;
        private final CodedOutputStream output;

        public ByteString build() {
            this.output.checkNoSpaceLeft();
            return new ByteString(this.buffer);
        }

        public CodedOutputStream getCodedOutput() {
            return this.output;
        }

        private CodedBuilder(int i) {
            byte[] bArr = new byte[i];
            this.buffer = bArr;
            this.output = CodedOutputStream.newInstance(bArr);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Output extends FilterOutputStream {
        private final ByteArrayOutputStream bout;

        public ByteString toByteString() {
            return new ByteString(this.bout.toByteArray());
        }

        private Output(ByteArrayOutputStream byteArrayOutputStream) {
            super(byteArrayOutputStream);
            this.bout = byteArrayOutputStream;
        }
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new ByteString(bArr2);
    }

    public static ByteString copyFromUtf8(String str) {
        try {
            return new ByteString(str.getBytes(C0059ao.a(10001)));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(C0059ao.a(10002), e);
        }
    }

    public static CodedBuilder newCodedBuilder(int i) {
        return new CodedBuilder(i);
    }

    public static Output newOutput(int i) {
        return new Output(new ByteArrayOutputStream(i));
    }

    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.bytes).asReadOnlyBuffer();
    }

    public byte byteAt(int i) {
        return this.bytes[i];
    }

    public void copyTo(byte[] bArr, int i) {
        byte[] bArr2 = this.bytes;
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            byte[] bArr = this.bytes;
            int length = bArr.length;
            byte[] bArr2 = ((ByteString) obj).bytes;
            if (length != bArr2.length) {
                return false;
            }
            for (int i = 0; i < length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.hash;
        if (i == 0) {
            byte[] bArr = this.bytes;
            int length = bArr.length;
            for (byte b : bArr) {
                length = (length * 31) + b;
            }
            i = length == 0 ? 1 : length;
            this.hash = i;
        }
        return i;
    }

    public boolean isEmpty() {
        return this.bytes.length == 0;
    }

    public InputStream newInput() {
        return new ByteArrayInputStream(this.bytes);
    }

    public int size() {
        return this.bytes.length;
    }

    public byte[] toByteArray() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public String toString(String str) throws UnsupportedEncodingException {
        return new String(this.bytes, str);
    }

    public String toStringUtf8() {
        try {
            return new String(this.bytes, C0059ao.a(10003));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(C0059ao.a(10004), e);
        }
    }

    private ByteString(byte[] bArr) {
        this.hash = 0;
        this.bytes = bArr;
    }

    public static Output newOutput() {
        return newOutput(32);
    }

    public void copyTo(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, i, bArr, i2, i3);
    }

    public void copyTo(ByteBuffer byteBuffer) {
        byte[] bArr = this.bytes;
        byteBuffer.put(bArr, 0, bArr.length);
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new ByteString(bArr);
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new ByteString(str.getBytes(str2));
    }

    public static ByteString copyFrom(List<ByteString> list) {
        if (list.size() == 0) {
            return EMPTY;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        int i = 0;
        for (ByteString byteString : list) {
            i += byteString.size();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (ByteString byteString2 : list) {
            System.arraycopy(byteString2.bytes, 0, bArr, i2, byteString2.size());
            i2 += byteString2.size();
        }
        return new ByteString(bArr);
    }
}
