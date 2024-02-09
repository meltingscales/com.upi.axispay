package org.apache.xml.security.utils;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.OutputStream;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class UnsyncByteArrayOutputStream extends OutputStream {
    private static ThreadLocal a = new ThreadLocal() { // from class: org.apache.xml.security.utils.UnsyncByteArrayOutputStream.1
        @Override // java.lang.ThreadLocal
        public synchronized Object initialValue() {
            return new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        }
    };
    private int c = UserMetadata.MAX_INTERNAL_KEY_SIZE;
    private int d = 0;
    private byte[] b = (byte[]) a.get();

    private void a(int i) {
        int i2 = this.c;
        while (i > i2) {
            i2 <<= 2;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.b, 0, bArr, 0, this.d);
        this.b = bArr;
        this.c = i2;
    }

    public byte[] a() {
        int i = this.d;
        byte[] bArr = new byte[i];
        System.arraycopy(this.b, 0, bArr, 0, i);
        return bArr;
    }

    public void b() {
        this.d = 0;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        int i2 = this.d + 1;
        if (i2 > this.c) {
            a(i2);
        }
        byte[] bArr = this.b;
        int i3 = this.d;
        this.d = i3 + 1;
        bArr[i3] = (byte) i;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        int length = this.d + bArr.length;
        if (length > this.c) {
            a(length);
        }
        System.arraycopy(bArr, 0, this.b, this.d, bArr.length);
        this.d = length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3 = this.d + i2;
        if (i3 > this.c) {
            a(i3);
        }
        System.arraycopy(bArr, i, this.b, this.d, i2);
        this.d = i3;
    }
}
