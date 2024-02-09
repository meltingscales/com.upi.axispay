package com.appsflyer.internal;

import com.google.android.gms.common.api.Api;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class aj extends FilterInputStream {

    /* renamed from: ι  reason: contains not printable characters */
    private static final short f206 = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));

    /* renamed from: ı  reason: contains not printable characters */
    private byte[] f207;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f208;

    /* renamed from: ǃ  reason: contains not printable characters */
    private byte[] f209;

    /* renamed from: ȷ  reason: contains not printable characters */
    private int f210;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f211;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f212;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f213;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f214;

    /* renamed from: Ι  reason: contains not printable characters */
    private byte[] f215;

    /* renamed from: І  reason: contains not printable characters */
    private int f216;

    /* renamed from: і  reason: contains not printable characters */
    private int f217;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f218;

    public aj(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
        super(inputStream);
        this.f218 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f215 = new byte[8];
        this.f209 = new byte[8];
        this.f207 = new byte[8];
        this.f211 = 8;
        this.f213 = 8;
        this.f216 = Math.min(Math.max(i2, 5), 16);
        this.f208 = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.f209, 0, 8);
        }
        long j = ((iArr[0] & 4294967295L) << 32) | (4294967295L & iArr[1]);
        if (i == 0) {
            this.f217 = (int) j;
            long j2 = j >> 3;
            short s = f206;
            this.f212 = (int) ((s * j2) >> 32);
            this.f214 = (int) (j >> 32);
            this.f210 = (int) (j2 + s);
            return;
        }
        int i4 = (int) j;
        this.f217 = i4;
        this.f212 = i4 * i;
        this.f214 = i4 ^ i;
        this.f210 = (int) (j >> 32);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m174() {
        if (this.f208 == 3) {
            byte[] bArr = this.f215;
            System.arraycopy(bArr, 0, this.f207, 0, bArr.length);
        }
        byte[] bArr2 = this.f215;
        int i = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.f216;
            if (i3 >= i4) {
                break;
            }
            short s = f206;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.f214)) ^ ((i >>> 5) + this.f210);
            i -= (((i2 << 4) + this.f217) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.f212);
            i3++;
        }
        byte[] bArr3 = this.f215;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.f208 == 3) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte[] bArr4 = this.f215;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.f209[i5]);
            }
            byte[] bArr5 = this.f207;
            System.arraycopy(bArr5, 0, this.f209, 0, bArr5.length);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private int m175() throws IOException {
        if (this.f218 == Integer.MAX_VALUE) {
            this.f218 = ((FilterInputStream) this).in.read();
        }
        if (this.f211 == 8) {
            byte[] bArr = this.f215;
            int i = this.f218;
            bArr[0] = (byte) i;
            String a = C0059ao.a(13427);
            if (i < 0) {
                throw new IllegalStateException(a);
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.f215, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 >= 8) {
                m174();
                int read2 = ((FilterInputStream) this).in.read();
                this.f218 = read2;
                this.f211 = 0;
                this.f213 = read2 < 0 ? 8 - (this.f215[7] & 255) : 8;
            } else {
                throw new IllegalStateException(a);
            }
        }
        return this.f213;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        m175();
        return this.f213 - this.f211;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        m175();
        int i = this.f211;
        if (i >= this.f213) {
            return -1;
        }
        byte[] bArr = this.f215;
        this.f211 = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m175();
            int i5 = this.f211;
            if (i5 >= this.f213) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.f215;
            this.f211 = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }
}
