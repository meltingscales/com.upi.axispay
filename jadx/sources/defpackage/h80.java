package defpackage;

import com.google.android.gms.vision.barcode.Barcode;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: h80  reason: default package */
/* loaded from: classes.dex */
public final class h80 extends InputStream {
    public final InputStream b;
    public long c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public int h;

    public h80(InputStream inputStream) {
        this(inputStream, Barcode.AZTEC);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.b.available();
    }

    public void b(boolean z) {
        this.g = z;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b.close();
    }

    public void j(long j) throws IOException {
        if (this.c <= this.e && j >= this.d) {
            this.b.reset();
            r(this.d, j);
            this.c = j;
            return;
        }
        throw new IOException(C0059ao.a(6912));
    }

    public long k(int i) {
        long j = this.c + i;
        if (this.e < j) {
            m(j);
        }
        return this.c;
    }

    public final void m(long j) {
        try {
            long j2 = this.d;
            long j3 = this.c;
            if (j2 < j3 && j3 <= this.e) {
                this.b.reset();
                this.b.mark((int) (j - this.d));
                r(this.d, this.c);
            } else {
                this.d = j3;
                this.b.mark((int) (j - j3));
            }
            this.e = j;
        } catch (IOException e) {
            throw new IllegalStateException(C0059ao.a(6913) + e);
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f = k(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.b.markSupported();
    }

    public final void r(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.b.skip(j2 - j);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                }
                skip = 1;
            }
            j += skip;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.g) {
            long j = this.e;
            if (this.c + 1 > j) {
                m(j + this.h);
            }
        }
        int read = this.b.read();
        if (read != -1) {
            this.c++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        j(this.f);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (!this.g) {
            long j2 = this.c;
            if (j2 + j > this.e) {
                m(j2 + j + this.h);
            }
        }
        long skip = this.b.skip(j);
        this.c += skip;
        return skip;
    }

    public h80(InputStream inputStream, int i) {
        this(inputStream, i, 1024);
    }

    public h80(InputStream inputStream, int i, int i2) {
        this.f = -1L;
        this.g = true;
        this.h = -1;
        this.b = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i);
        this.h = i2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (!this.g) {
            long j = this.c;
            if (bArr.length + j > this.e) {
                m(j + bArr.length + this.h);
            }
        }
        int read = this.b.read(bArr);
        if (read != -1) {
            this.c += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.g) {
            long j = this.c;
            long j2 = i2;
            if (j + j2 > this.e) {
                m(j + j2 + this.h);
            }
        }
        int read = this.b.read(bArr, i, i2);
        if (read != -1) {
            this.c += read;
        }
        return read;
    }
}
