package com.appsflyer.internal;

import com.google.android.gms.common.api.Api;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class al extends FilterInputStream {

    /* renamed from: ı  reason: contains not printable characters */
    private an f219;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f220;

    /* renamed from: ǃ  reason: contains not printable characters */
    private byte[] f221;

    /* renamed from: ɩ  reason: contains not printable characters */
    private byte[] f222;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f223;

    /* renamed from: Ι  reason: contains not printable characters */
    private byte[] f224;

    /* renamed from: ι  reason: contains not printable characters */
    private final int f225;

    /* renamed from: І  reason: contains not printable characters */
    private int[] f226;

    /* renamed from: і  reason: contains not printable characters */
    private int f227;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f228;

    public al(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws IOException {
        super(inputStream);
        this.f223 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int min = Math.min(Math.max(i, 3), 16);
        this.f225 = min;
        this.f221 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.f222 = bArr2;
        this.f224 = new byte[8];
        this.f226 = new int[2];
        this.f228 = 8;
        this.f220 = 8;
        this.f227 = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.f219 = new an(iArr, min, true, z);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m176() {
        if (this.f227 == 2) {
            byte[] bArr = this.f221;
            System.arraycopy(bArr, 0, this.f224, 0, bArr.length);
        }
        byte[] bArr2 = this.f221;
        int i = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = this.f225;
        an anVar = this.f219;
        am.m178(i, i2, false, i3, anVar.f230, anVar.f231, this.f226);
        int[] iArr = this.f226;
        int i4 = iArr[0];
        int i5 = iArr[1];
        byte[] bArr3 = this.f221;
        bArr3[0] = (byte) (i4 >> 24);
        bArr3[1] = (byte) (i4 >> 16);
        bArr3[2] = (byte) (i4 >> 8);
        bArr3[3] = (byte) i4;
        bArr3[4] = (byte) (i5 >> 24);
        bArr3[5] = (byte) (i5 >> 16);
        bArr3[6] = (byte) (i5 >> 8);
        bArr3[7] = (byte) i5;
        if (this.f227 == 2) {
            for (int i6 = 0; i6 < 8; i6++) {
                byte[] bArr4 = this.f221;
                bArr4[i6] = (byte) (bArr4[i6] ^ this.f222[i6]);
            }
            byte[] bArr5 = this.f224;
            System.arraycopy(bArr5, 0, this.f222, 0, bArr5.length);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private int m177() throws IOException {
        if (this.f223 == Integer.MAX_VALUE) {
            this.f223 = ((FilterInputStream) this).in.read();
        }
        if (this.f228 == 8) {
            byte[] bArr = this.f221;
            int i = this.f223;
            bArr[0] = (byte) i;
            String a = C0059ao.a(13630);
            if (i < 0) {
                throw new IllegalStateException(a);
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.f221, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 >= 8) {
                m176();
                int read2 = ((FilterInputStream) this).in.read();
                this.f223 = read2;
                this.f228 = 0;
                this.f220 = read2 < 0 ? 8 - (this.f221[7] & 255) : 8;
            } else {
                throw new IllegalStateException(a);
            }
        }
        return this.f220;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        m177();
        return this.f220 - this.f228;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        m177();
        int i = this.f228;
        if (i >= this.f220) {
            return -1;
        }
        byte[] bArr = this.f221;
        this.f228 = i + 1;
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
            m177();
            int i5 = this.f228;
            if (i5 >= this.f220) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.f221;
            this.f228 = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }
}
