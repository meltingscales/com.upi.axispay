package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: y50  reason: default package */
/* loaded from: classes.dex */
public class y50 implements Closeable {
    public final InputStream b;
    public final Charset c;
    public byte[] d;
    public int e;
    public int f;

    /* compiled from: AxisPay */
    /* renamed from: y50$a */
    /* loaded from: classes.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, y50.this.c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public y50(InputStream inputStream, Charset charset) {
        this(inputStream, UserMetadata.MAX_INTERNAL_KEY_SIZE, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.b) {
            if (this.d != null) {
                this.d = null;
                this.b.close();
            }
        }
    }

    public final void j() throws IOException {
        InputStream inputStream = this.b;
        byte[] bArr = this.d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.e = 0;
            this.f = read;
            return;
        }
        throw new EOFException();
    }

    public String k() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.b) {
            if (this.d != null) {
                if (this.e >= this.f) {
                    j();
                }
                for (int i3 = this.e; i3 != this.f; i3++) {
                    byte[] bArr2 = this.d;
                    if (bArr2[i3] == 10) {
                        if (i3 != this.e) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                byte[] bArr3 = this.d;
                                int i4 = this.e;
                                String str = new String(bArr3, i4, i2 - i4, this.c.name());
                                this.e = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        byte[] bArr32 = this.d;
                        int i42 = this.e;
                        String str2 = new String(bArr32, i42, i2 - i42, this.c.name());
                        this.e = i3 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f - this.e) + 80);
                loop1: while (true) {
                    byte[] bArr4 = this.d;
                    int i5 = this.e;
                    aVar.write(bArr4, i5, this.f - i5);
                    this.f = -1;
                    j();
                    i = this.e;
                    while (i != this.f) {
                        bArr = this.d;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.e;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.e = i + 1;
                return aVar.toString();
            }
            throw new IOException(C0059ao.a(2969));
        }
    }

    public y50(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i >= 0) {
            if (charset.equals(z50.a)) {
                this.b = inputStream;
                this.c = charset;
                this.d = new byte[i];
                return;
            }
            throw new IllegalArgumentException(C0059ao.a(2967));
        }
        throw new IllegalArgumentException(C0059ao.a(2968));
    }
}
