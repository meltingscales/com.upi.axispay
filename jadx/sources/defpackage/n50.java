package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: n50  reason: default package */
/* loaded from: classes.dex */
public final class n50 {
    public final byte[][] a;
    public final int b;
    public final int c;

    public n50(int i, int i2) {
        this.a = (byte[][]) Array.newInstance(byte.class, i2, i);
        this.b = i;
        this.c = i2;
    }

    public void a(byte b) {
        for (byte[] bArr : this.a) {
            Arrays.fill(bArr, b);
        }
    }

    public byte b(int i, int i2) {
        return this.a[i2][i];
    }

    public byte[][] c() {
        return this.a;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.b;
    }

    public void f(int i, int i2, int i3) {
        this.a[i2][i] = (byte) i3;
    }

    public void g(int i, int i2, boolean z) {
        this.a[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.b * 2 * this.c) + 2);
        for (int i = 0; i < this.c; i++) {
            byte[] bArr = this.a[i];
            for (int i2 = 0; i2 < this.b; i2++) {
                byte b = bArr[i2];
                if (b == 0) {
                    sb.append(C0059ao.a(3040));
                } else if (b != 1) {
                    sb.append(C0059ao.a(3038));
                } else {
                    sb.append(C0059ao.a(3039));
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
