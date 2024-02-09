package defpackage;

import com.google.android.gms.vision.barcode.Barcode;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: p30  reason: default package */
/* loaded from: classes.dex */
public final class p30 {
    public static final p30 g = new p30(4201, Barcode.AZTEC, 1);
    public static final p30 h = new p30(1033, 1024, 1);
    public static final p30 i = new p30(67, 64, 1);
    public static final p30 j = new p30(19, 16, 1);
    public static final p30 k = new p30(285, Barcode.QR_CODE, 0);
    public static final p30 l = new p30(301, Barcode.QR_CODE, 1);
    public final int[] a;
    public final int[] b;
    public final q30 c;
    public final int d;
    public final int e;
    public final int f;

    public p30(int i2, int i3, int i4) {
        this.e = i2;
        this.d = i3;
        this.f = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new q30(this, new int[]{0});
        new q30(this, new int[]{1});
    }

    public static int a(int i2, int i3) {
        return i2 ^ i3;
    }

    public q30 b(int i2, int i3) {
        if (i2 >= 0) {
            if (i3 == 0) {
                return this.c;
            }
            int[] iArr = new int[i2 + 1];
            iArr[0] = i3;
            return new q30(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    public int c(int i2) {
        return this.a[i2];
    }

    public int d() {
        return this.f;
    }

    public q30 e() {
        return this.c;
    }

    public int f(int i2) {
        if (i2 != 0) {
            return this.a[(this.d - this.b[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    public int g(int i2) {
        if (i2 != 0) {
            return this.b[i2];
        }
        throw new IllegalArgumentException();
    }

    public int h(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.a;
        int[] iArr2 = this.b;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.d - 1)];
    }

    public String toString() {
        return C0059ao.a(11447) + Integer.toHexString(this.e) + ',' + this.d + ')';
    }
}
